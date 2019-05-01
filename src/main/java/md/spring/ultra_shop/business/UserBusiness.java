package md.spring.ultra_shop.business;

import md.spring.ultra_shop.repository.entity.UserEntity;

import java.util.List;

public interface UserBusiness {
    List<UserEntity> retrieveUser();
}
