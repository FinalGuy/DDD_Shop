package com.breuninger.shop.searchanddiscover.domain.model.productlist;

public interface ProductRepository {

    Product findProductOf(ProductId productId);

}
