package org.man.ecommerceapi.services.interfaces;

import org.man.ecommerceapi.controllers.dtos.requests.CheckoutRequest;
import org.man.ecommerceapi.controllers.dtos.responses.BaseResponse;

public interface ICheckoutService {
    BaseResponse checkout(CheckoutRequest request);
}
