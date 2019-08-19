package md.spring.ultra_shop.controller.impl;

import lombok.RequiredArgsConstructor;
import md.spring.ultra_shop.business.UserBusiness;
import md.spring.ultra_shop.controller.UserController;
import md.spring.ultra_shop.controller.converter.UserViewConverter;
import md.spring.ultra_shop.controller.view.UserView;
import md.spring.ultra_shop.repository.entity.UserEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserControllerImpl implements UserController {

    private final UserBusiness userBusiness;
    private final UserViewConverter converter;

    @Override
    public List<UserEntity> retrieveUser() {
        return userBusiness.retrieveUser();
    }

    @Override
    public UserView createUser(UserView view) {
        return converter.convert(userBusiness.createUser(converter.reverse().convert(view)));
    }
}
