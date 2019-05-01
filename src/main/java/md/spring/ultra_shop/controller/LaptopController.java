package md.spring.ultra_shop.controller;

import md.spring.ultra_shop.repository.entity.LaptopEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@RequestMapping(path = "laptop")
public interface LaptopController {

    @GetMapping
    List<LaptopEntity> retrieveLaptop();
}
