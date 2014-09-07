package com.tfojuth.shop.searchanddiscover.domain.service;

import com.tfojuth.shop.searchanddiscover.domain.model.search.SearchResult;

public interface TextSearchService {

    SearchResult searchFor(String textToSearchFor);

}
