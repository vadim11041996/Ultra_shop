package md.spring.ultra_shop.controller;

import md.spring.ultra_shop.repository.entity.WatchEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping(path = "watch")
public interface WatchController {

    @GetMapping
    List<WatchEntity> retrieveWatch();
}
