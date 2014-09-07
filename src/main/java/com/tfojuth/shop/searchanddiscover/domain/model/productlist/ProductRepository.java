package com.tfojuth.shop.searchanddiscover.domain.model.productlist;

public interface ProductRepository {

    Product findProductOf(ProductId productId);

}
