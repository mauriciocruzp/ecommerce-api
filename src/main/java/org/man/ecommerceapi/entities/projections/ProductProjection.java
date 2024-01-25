package org.man.ecommerceapi.entities.projections;

import org.man.ecommerceapi.entities.User;

public interface ProductProjection {
    Long getId();

    String getTitle();

    String getDescription();

    String getImage_url();

    Integer getStock();

    Float getPrice();

    User getUser();
}
