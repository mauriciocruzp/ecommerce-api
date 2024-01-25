package org.man.ecommerceapi.controllers.dtos.responses;

import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
public class UserResponse {
    private Long id;

    private String email;

    private String firstName;

    private String lastName;
}
