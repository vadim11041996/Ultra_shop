package md.spring.ultra_shop.controller.impl;

import lombok.RequiredArgsConstructor;
import md.spring.ultra_shop.business.WatchBusiness;
import md.spring.ultra_shop.repository.entity.WatchEntity;
import org.springframework.web.bind.annotation.RestController;
import md.spring.ultra_shop.controller.WatchController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class WatchControllerImpl implements WatchController {
    private final WatchBusiness watchBusiness;

    @Override
    public List<WatchEntity> retrieveWatch() {
        return watchBusiness.retrieveWatch();
    }

}
