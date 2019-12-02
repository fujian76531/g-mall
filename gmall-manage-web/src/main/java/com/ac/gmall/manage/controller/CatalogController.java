package com.ac.gmall.manage.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import entity.PmsBaseCatelog1;
import entity.PmsBaseCatelog2;
import entity.PmsBaseCatelog3;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.CatalogService;

import java.util.List;

/**
 * @author ：launcher
 * @date ：Created in 2019-11-26
 * @description：
 */
@Controller
@CrossOrigin
public class CatalogController {

    @Reference
    CatalogService catalogService;
    @RequestMapping("getCatalog1")
    @ResponseBody
    public List<PmsBaseCatelog1> getCatalog1(){
        return catalogService.getCatalog1();
    }
    @RequestMapping("getCatalog2")
    @ResponseBody
    public List<PmsBaseCatelog2> getCatalog2(String catalog1Id){
        return catalogService.getCatalog2(catalog1Id);
    }
    @RequestMapping("getCatalog3")
    @ResponseBody
    public List<PmsBaseCatelog3> getCatalog3(String catalog2Id){
        return catalogService.getCatalog3(catalog2Id);
    }
}
