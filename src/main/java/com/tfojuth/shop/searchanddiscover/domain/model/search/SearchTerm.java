package com.tfojuth.shop.searchanddiscover.domain.model.search;

import com.tfojuth.shop.common.ValueObject;
import com.tfojuth.shop.searchanddiscover.domain.model.productlist.ProductId;

public class SearchTerm implements ValueObject {


    public boolean isProductId() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public ProductId toProductId() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public String toPlainText() {
        throw new UnsupportedOperationException("Not yet implemented");
    }


}
