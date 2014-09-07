package com.tfojuth.shop.searchanddiscover.domain.model.teaser;

import com.tfojuth.shop.searchanddiscover.domain.model.landingpage.LandingpageId;
import com.tfojuth.shop.searchanddiscover.domain.model.productlist.ProductListId;

import java.util.List;

public interface TeaserRepository {

    List<Teaser> teaserFor(LandingpageId landingpageId);

    List<Teaser> teaserFor(ProductListId productListId);

}
