package md.spring.ultra_shop.business.impl;

import lombok.RequiredArgsConstructor;
import md.spring.ultra_shop.business.UserBusiness;
import md.spring.ultra_shop.repository.UserRepository;
import md.spring.ultra_shop.repository.entity.UserEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserBusinessImpl implements UserBusiness {
    private final UserRepository repository;

    @Override
    public List<UserEntity> retrieveUser() {
        return repository.findAll();
    }

    @Override
    public UserEntity createUser() {
        UserEntity userEntity = new UserEntity();
        userEntity.setName("name2");
        userEntity.setEmail("email2@mail.com");

        repository.save(userEntity);
        return userEntity;
    }
}
