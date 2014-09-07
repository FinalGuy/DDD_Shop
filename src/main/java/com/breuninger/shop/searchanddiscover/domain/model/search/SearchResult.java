package com.breuninger.shop.searchanddiscover.domain.model.search;

import com.breuninger.shop.searchanddiscover.domain.model.productlist.ProductList;

public abstract class SearchResult {

    public boolean isDirectProductResult() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public boolean isKeywordRedirect() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public Redirect productRedirect() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public ProductList productList() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public Redirect keywordRedirect() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
