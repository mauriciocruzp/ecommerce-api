package org.man.ecommerceapi.controllers.dtos.requests;

import lombok.Getter;

@Getter
public class CheckoutRequest {
    Long orderId;

    String cardNumber;
}
