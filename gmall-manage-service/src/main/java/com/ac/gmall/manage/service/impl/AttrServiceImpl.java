package com.ac.gmall.manage.service.impl;

import com.ac.gmall.manage.mapper.PmsBaseAttrInfoMapper;
import com.ac.gmall.manage.mapper.PmsBaseAttrValueMapper;
import com.alibaba.dubbo.config.annotation.Service;
import entity.PmsBaseAttrInfo;
import entity.PmsBaseAttrInfoCriteria;
import entity.PmsBaseAttrValue;
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
    @Override
    public List<PmsBaseAttrInfo> ATTR_INFO_LIST(String catalog3Id) {
        PmsBaseAttrInfoCriteria pmsBaseAttrInfoCriteria=new PmsBaseAttrInfoCriteria();
        PmsBaseAttrInfoCriteria.Criteria criteria=pmsBaseAttrInfoCriteria.createCriteria();
        criteria.andCatalog3IdEqualTo(Long.valueOf(catalog3Id));
        return pmsBaseAttrInfoMapper.selectByExample(pmsBaseAttrInfoCriteria);
    }

    @Override
    public String saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo) {
        pmsBaseAttrInfoMapper.insertSelective(pmsBaseAttrInfo);
        List<PmsBaseAttrValue> attrValueList = pmsBaseAttrInfo.getAttrValueList();
        for (PmsBaseAttrValue pmsBaseAttrValue : attrValueList) {
            pmsBaseAttrValue.setAttrId(pmsBaseAttrInfo.getId());
            pmsBaseAttrValueMapper.insertSelective(pmsBaseAttrValue);
        }

        return "SUCCESS";
    }
}
