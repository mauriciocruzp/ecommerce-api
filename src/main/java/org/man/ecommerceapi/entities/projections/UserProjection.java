package org.man.ecommerceapi.entities.projections;

import org.man.ecommerceapi.entities.Address;
import org.man.ecommerceapi.entities.Product;
import org.man.ecommerceapi.entities.pivots.UserRole;

import java.util.Date;
import java.util.List;

public interface UserProjection {
    Long getId();

    String getEmail();

    String getPassword();

    String getFirstName();

    String getLastName();

    Date getDateOfBirth();

    List<UserRole> getUserRoles();

    List<Product> getProducts();

    List<Address> getAddresses();
}
