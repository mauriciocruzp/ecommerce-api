package org.man.ecommerceapi.services.interfaces;

import org.man.ecommerceapi.controllers.dtos.requests.AuthenticationRequest;
import org.man.ecommerceapi.controllers.dtos.responses.BaseResponse;

public interface IAuthService {
    BaseResponse authenticate(AuthenticationRequest request);
}
