package com.ac.gmall.manage.service.impl;

import com.ac.gmall.manage.mapper.PmsProductInfoMapper;
import com.alibaba.dubbo.config.annotation.Service;
import entity.PmsProductInfo;
import entity.PmsProductInfoCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import service.SpuService;

import java.util.List;

/**
 * @author ：launcher
 * @date ：Created in 2019-12-04
 * @description：
 */
@Service
public class SpuServiceImpl implements SpuService {

    @Autowired
    private PmsProductInfoMapper pmsProductInfoMapper;
    @Override
    public List<PmsProductInfo> spuList(String catalog3Id) {
        PmsProductInfoCriteria pmsProductInfoCriteria=new PmsProductInfoCriteria();
        PmsProductInfoCriteria.Criteria criteria=pmsProductInfoCriteria.createCriteria();
        criteria.andCatalog3IdEqualTo(Long.valueOf(catalog3Id));
        return pmsProductInfoMapper.selectByExample(pmsProductInfoCriteria);
    }

    @Override
    public List<PmsProductInfo> saveSpuInfo(PmsProductInfo pmsProductInfo) {
        return null;
    }
}
