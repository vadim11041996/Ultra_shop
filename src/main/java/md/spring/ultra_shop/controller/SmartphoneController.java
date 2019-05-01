package md.spring.ultra_shop.controller;

import md.spring.ultra_shop.repository.entity.SmartphoneEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping(path = "smartphone")
public interface SmartphoneController {

    @GetMapping
    List<SmartphoneEntity> retrieveSmartphone();
}
