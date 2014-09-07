package com.breuninger.shop.searchanddiscover.portadapter.hybris;

import com.breuninger.shop.searchanddiscover.domain.model.productlist.Product;
import com.breuninger.shop.searchanddiscover.domain.model.productlist.ProductId;
import com.breuninger.shop.searchanddiscover.domain.model.productlist.ProductRepository;
import org.springframework.stereotype.Repository;

@Repository
public class HybrisProductRepository implements ProductRepository {

    @Override
    public Product findProductOf(ProductId productId) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
