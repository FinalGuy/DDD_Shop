package com.breuninger.shop.searchanddiscover.domain.service;

import com.breuninger.shop.searchanddiscover.domain.model.search.SearchResult;

public interface TextSearchService {

    SearchResult searchFor(String textToSearchFor);

}
