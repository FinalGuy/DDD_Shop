package com.breuninger.shop.searchanddiscover.domain.model.teaser;

import com.breuninger.shop.searchanddiscover.domain.model.landingpage.LandingpageId;
import com.breuninger.shop.searchanddiscover.domain.model.productlist.ProductListId;

import java.util.List;

public interface TeaserRepository {

    List<Teaser> teaserFor(LandingpageId landingpageId);

    List<Teaser> teaserFor(ProductListId productListId);

}
