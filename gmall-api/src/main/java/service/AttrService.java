package service;

import entity.PmsBaseAttrInfo;
import entity.PmsBaseAttrValue;
import entity.PmsBaseSaleAttr;

import java.util.List;

/**
 * @author ：launcher
 * @date ：Created in 2019-12-03
 * @description：
 */
public interface AttrService {
    List<PmsBaseAttrInfo> ATTR_INFO_LIST(String catalog3Id);

    String saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo);

    List<PmsBaseAttrValue> getAttrValueList(String attrId);

    List<PmsBaseSaleAttr> baseSaleAttrList();
}
