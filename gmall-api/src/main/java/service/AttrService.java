package service;

import entity.PmsBaseAttrInfo;

import java.util.List;

/**
 * @author ：launcher
 * @date ：Created in 2019-12-03
 * @description：
 */
public interface AttrService {
    List<PmsBaseAttrInfo> ATTR_INFO_LIST(String catalog3Id);

    String saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo);
}
