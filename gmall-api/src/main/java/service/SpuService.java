package service;

import entity.PmsProductInfo;

import java.util.List;

public interface SpuService {
    List<PmsProductInfo> spuList(String catalog3Id);

    List<PmsProductInfo> saveSpuInfo(PmsProductInfo pmsProductInfo);
}
