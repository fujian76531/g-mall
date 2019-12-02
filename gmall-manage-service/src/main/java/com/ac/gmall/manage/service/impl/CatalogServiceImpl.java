package com.ac.gmall.manage.service.impl;


import com.ac.gmall.manage.mapper.PmsBaseCatelog1Mapper;
import com.ac.gmall.manage.mapper.PmsBaseCatelog2Mapper;
import com.ac.gmall.manage.mapper.PmsBaseCatelog3Mapper;
import com.alibaba.dubbo.config.annotation.Service;
import entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import service.CatalogService;

import java.util.List;

/**
 * @author ：launcher
 * @date ：Created in 2019-12-02
 * @description：
 */
@Service
public class CatalogServiceImpl implements CatalogService {
    @Autowired
    PmsBaseCatelog1Mapper pmsBsaeCatelog1Mapper;
    @Autowired
    PmsBaseCatelog2Mapper pmsBsaeCatelog2Mapper;
    @Autowired
    PmsBaseCatelog3Mapper pmsBsaeCatelog3Mapper;
    @Override
    public List<PmsBaseCatelog1> getCatalog1() {
        List<PmsBaseCatelog1> pmsBaseCatelog1s = pmsBsaeCatelog1Mapper.selectByExample(new PmsBaseCatelog1Criteria());
        return pmsBaseCatelog1s;
    }

    @Override
    public List<PmsBaseCatelog2> getCatalog2(String Catalog1Id) {
        PmsBaseCatelog2Criteria pmsBaseCatelog2Criteria=new PmsBaseCatelog2Criteria();
        PmsBaseCatelog2Criteria.Criteria criteria=pmsBaseCatelog2Criteria.createCriteria();
        criteria.andCatalog1IdEqualTo(Integer.valueOf(Catalog1Id));
        return pmsBsaeCatelog2Mapper.selectByExample(pmsBaseCatelog2Criteria);
    }
    @Override
    public List<PmsBaseCatelog3> getCatalog3(String Catalog2Id) {
        PmsBaseCatelog3Criteria pmsBaseCatelog3Criteria=new PmsBaseCatelog3Criteria();
        PmsBaseCatelog3Criteria.Criteria criteria=pmsBaseCatelog3Criteria.createCriteria();
        criteria.andCatalog2IdEqualTo(Long.valueOf(Catalog2Id));
        return pmsBsaeCatelog3Mapper.selectByExample(pmsBaseCatelog3Criteria);
    }
}
