package com.ac.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import entity.PmsProductInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import service.SpuService;

import java.util.List;

/**
 * @author ：launcher
 * @date ：Created in 2019-12-04
 * @description：
 */
@Controller
@CrossOrigin
public class SpuController {
    @Reference
    SpuService spuService;

    @RequestMapping("spuList")
    @ResponseBody
    public List<PmsProductInfo> spuList(String catalog3Id){

        return spuService.spuList(catalog3Id);
    }
    @RequestMapping("saveSpuInfo")
    @ResponseBody
    public List<PmsProductInfo> saveSpuInfo(@RequestBody PmsProductInfo pmsProductInfo){

        return spuService.saveSpuInfo(pmsProductInfo);
    }
    @RequestMapping("fileUpload")
    @ResponseBody
    public String fileUpload(@RequestParam("file") MultipartFile multipartFile){
        String imgUrl="0000";
        return imgUrl;
    }
}
