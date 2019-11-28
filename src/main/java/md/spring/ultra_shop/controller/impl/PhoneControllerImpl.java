package md.spring.ultra_shop.controller.impl;

import lombok.RequiredArgsConstructor;
import md.spring.ultra_shop.business.PhonesBusiness;
import md.spring.ultra_shop.controller.PhoneController;
import md.spring.ultra_shop.repository.entity.PhoneEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PhoneControllerImpl implements PhoneController {

    private final PhonesBusiness phonesBusiness;

    @Override
    public List<PhoneEntity> retrievePhones(){
        return phonesBusiness.retrievePhones();
    }
}
