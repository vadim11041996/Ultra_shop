package md.spring.ultra_shop.controller.impl;

import lombok.RequiredArgsConstructor;
import md.spring.ultra_shop.business.SmartphoneBusiness;
import md.spring.ultra_shop.controller.SmartphoneController;
import md.spring.ultra_shop.repository.entity.SmartphoneEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class SmartPhoneControllerImpl implements SmartphoneController {

    private final SmartphoneBusiness smartphoneBusiness;

    @Override
    public List<SmartphoneEntity> retrieveSmartphone(){
        return smartphoneBusiness.retrieveSmartphone();
    }
}
