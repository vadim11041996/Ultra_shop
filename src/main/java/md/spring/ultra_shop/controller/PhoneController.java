package md.spring.ultra_shop.controller;

import md.spring.ultra_shop.repository.entity.PhoneEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@RequestMapping("/phones")
public interface PhoneController {

    @GetMapping
    List<PhoneEntity> retrievePhones();

}
