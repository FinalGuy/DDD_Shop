package com.tfojuth.shop.searchanddiscover.portadapter.hybris;

import com.tfojuth.shop.searchanddiscover.domain.model.productlist.Product;
import com.tfojuth.shop.searchanddiscover.domain.model.productlist.ProductId;
import com.tfojuth.shop.searchanddiscover.domain.model.productlist.ProductRepository;
import org.springframework.stereotype.Repository;

@Repository
public class HybrisProductRepository implements ProductRepository {

    @Override
    public Product findProductOf(ProductId productId) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
