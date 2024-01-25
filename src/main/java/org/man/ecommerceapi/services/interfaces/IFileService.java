package org.man.ecommerceapi.services.interfaces;

import org.man.ecommerceapi.controllers.dtos.responses.BaseResponse;
import org.springframework.web.multipart.MultipartFile;

public interface IFileService {
    BaseResponse upload(MultipartFile multipartFile);

    void delete(String imageUrl);
}
