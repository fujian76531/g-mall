package service;



import entity.PmsBaseCatelog1;
import entity.PmsBaseCatelog2;
import entity.PmsBaseCatelog3;

import java.util.List;

public interface CatalogService {
    List<PmsBaseCatelog1> getCatalog1();
    List<PmsBaseCatelog2> getCatalog2(String Catalog1Id);

    List<PmsBaseCatelog3> getCatalog3(String catalog2Id);
}
