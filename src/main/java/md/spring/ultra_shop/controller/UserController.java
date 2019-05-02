package md.spring.ultra_shop.controller;

import md.spring.ultra_shop.repository.entity.UserEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping(path = "user")
public interface UserController {

    @GetMapping
    List<UserEntity> retrieveUser();
}
