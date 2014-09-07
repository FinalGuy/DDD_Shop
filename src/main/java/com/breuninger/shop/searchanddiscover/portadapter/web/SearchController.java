package com.breuninger.shop.searchanddiscover.portadapter.web;

import com.breuninger.shop.searchanddiscover.application.search.SearchService;
import com.breuninger.shop.searchanddiscover.domain.model.search.SearchResult;
import com.breuninger.shop.searchanddiscover.domain.model.search.SearchTerm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

@Controller
public class SearchController {

    @Inject
    private SearchService searchService;

    @RequestMapping("/search.cmd")
    public String searchFor(SearchTerm searchTerm, ModelMap modelMap, HttpServletRequest request) {
        SearchResult searchResult = searchService.searchFor(searchTerm);
        if (searchResult.isDirectProductResult()) {
            return searchResult.productRedirect().toPlainText();
        }
        if (searchResult.isKeywordRedirect()) {
            return searchResult.keywordRedirect().toPlainText();
        }
        modelMap.put("products", searchResult.productList());
        // other model attributes
        return "search/searchResult";
    }

}
