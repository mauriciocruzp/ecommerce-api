package org.man.ecommerceapi.entities.projections;

import org.man.ecommerceapi.entities.pivots.UserRole;

import java.util.List;

public interface RoleProjection {
    Long getId();

    String getName();

    List<UserRole> getUserRoles();
}
