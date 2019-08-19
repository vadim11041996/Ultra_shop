package md.spring.ultra_shop.controller;

import md.spring.ultra_shop.repository.entity.UserEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public interface UserController {

    @GetMapping(path = "user")
    List<UserEntity> retrieveUser();

    @PostMapping(path = "user")
    UserEntity createUser();
}
