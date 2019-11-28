package md.spring.ultra_shop.controller.impl;

import lombok.RequiredArgsConstructor;
import md.spring.ultra_shop.business.LaptopBusiness;
import md.spring.ultra_shop.controller.LaptopController;
import md.spring.ultra_shop.repository.entity.LaptopEntity;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class LaptopControllerImpl implements LaptopController {
    private final LaptopBusiness laptopBusiness;

    @Override
    public List<LaptopEntity> retrieveLaptop(){
        return laptopBusiness.retrieveLaptop();
    }
}
