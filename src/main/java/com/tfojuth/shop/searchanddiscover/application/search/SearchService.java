package com.tfojuth.shop.searchanddiscover.application.search;

import com.tfojuth.shop.searchanddiscover.domain.model.productlist.Product;
import com.tfojuth.shop.searchanddiscover.domain.model.productlist.ProductRepository;
import com.tfojuth.shop.searchanddiscover.domain.model.search.DirectProductSearchResult;
import com.tfojuth.shop.searchanddiscover.domain.model.search.SearchResult;
import com.tfojuth.shop.searchanddiscover.domain.model.search.SearchTerm;
import com.tfojuth.shop.searchanddiscover.domain.service.TextSearchService;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class SearchService {

    @Inject
    private ProductRepository productRepository;
    @Inject
    private TextSearchService textSearchService;

    public SearchResult searchFor(SearchTerm searchTerm) {
        if (searchTerm.isProductId()) {
            Product product = productRepository.findProductOf(searchTerm.toProductId());
            return new DirectProductSearchResult(product);
        } else {
            return textSearchService.searchFor(searchTerm.toPlainText());
        }
    }

}
