package com.breuninger.shop.searchanddiscover.portadapter.fh;

import com.breuninger.shop.searchanddiscover.domain.model.search.SearchResult;
import com.breuninger.shop.searchanddiscover.domain.service.TextSearchService;
import org.springframework.stereotype.Service;

@Service
public class FredhopperTextSearchService implements TextSearchService {

    @Override
    public SearchResult searchFor(String textToSearchFor) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
