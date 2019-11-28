package md.spring.ultra_shop.controller;

import md.spring.ultra_shop.controller.view.UserView;
import md.spring.ultra_shop.repository.entity.UserEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/user")
public interface UserController {

    @GetMapping
    List<UserEntity> retrieveUser();

    @PostMapping
    UserView createUser(@RequestBody UserView view);
}
