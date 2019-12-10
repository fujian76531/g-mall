package com.ac.gmall.manage.service.impl;

import com.ac.gmall.manage.mapper.PmsBaseAttrInfoMapper;
import com.ac.gmall.manage.mapper.PmsBaseAttrValueMapper;
import com.ac.gmall.manage.mapper.PmsBaseSaleAttrMapper;
import com.alibaba.dubbo.config.annotation.Service;
import entity.*;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import service.AttrService;

import java.util.List;

/**
 * @author ：launcher
 * @date ：Created in 2019-12-03
 * @description：
 */
@Service
public class AttrServiceImpl implements AttrService {
    @Autowired
    PmsBaseAttrInfoMapper pmsBaseAttrInfoMapper;
    @Autowired
    PmsBaseAttrValueMapper pmsBaseAttrValueMapper;
    @Autowired
    private PmsBaseSaleAttrMapper pmsBaseSaleAttrMapper;
    @Override
    public List<PmsBaseAttrInfo> ATTR_INFO_LIST(String catalog3Id) {
        PmsBaseAttrInfoCriteria pmsBaseAttrInfoCriteria=new PmsBaseAttrInfoCriteria();
        PmsBaseAttrInfoCriteria.Criteria criteria=pmsBaseAttrInfoCriteria.createCriteria();
        criteria.andCatalog3IdEqualTo(Long.valueOf(catalog3Id));
        return pmsBaseAttrInfoMapper.selectByExample(pmsBaseAttrInfoCriteria);
    }

    @Override
    public List<PmsBaseSaleAttr> baseSaleAttrList() {
        return pmsBaseSaleAttrMapper.selectByExample(new PmsBaseSaleAttrCriteria());
    }

    @Override
    public List<PmsBaseAttrValue> getAttrValueList(String attrId) {
        PmsBaseAttrValueCriteria pmsBaseAttrValueCriteria=new PmsBaseAttrValueCriteria();
        PmsBaseAttrValueCriteria.Criteria criteria=pmsBaseAttrValueCriteria.createCriteria();
        criteria.andAttrIdEqualTo(Long.valueOf(attrId));
        return pmsBaseAttrValueMapper.selectByExample(pmsBaseAttrValueCriteria);
    }

    @Override
    public String saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo) {
        if (pmsBaseAttrInfo.getId()==null){
            //id为空 新增
            pmsBaseAttrInfoMapper.insertSelective(pmsBaseAttrInfo);
            List<PmsBaseAttrValue> attrValueList = pmsBaseAttrInfo.getAttrValueList();
            for (PmsBaseAttrValue pmsBaseAttrValue : attrValueList) {
                pmsBaseAttrValue.setAttrId(pmsBaseAttrInfo.getId());
                pmsBaseAttrValueMapper.insertSelective(pmsBaseAttrValue);
            }
        }else {
            //id不为空  修改
            pmsBaseAttrInfoMapper.updateByPrimaryKey(pmsBaseAttrInfo);
            PmsBaseAttrValueCriteria pmsBaseAttrValueCriteria=new PmsBaseAttrValueCriteria();
            PmsBaseAttrValueCriteria.Criteria criteria=pmsBaseAttrValueCriteria.createCriteria();
            criteria.andAttrIdEqualTo(pmsBaseAttrInfo.getId());
            pmsBaseAttrValueMapper.deleteByExample(pmsBaseAttrValueCriteria);

            List<PmsBaseAttrValue> pmsBaseAttrValues=pmsBaseAttrInfo.getAttrValueList();
            for (PmsBaseAttrValue pmsBaseAttrValue : pmsBaseAttrValues) {
                pmsBaseAttrValueMapper.insertSelective(pmsBaseAttrValue);
            }
        }


        return "SUCCESS";
    }
}
