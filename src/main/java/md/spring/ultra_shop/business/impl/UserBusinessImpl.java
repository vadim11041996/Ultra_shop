package md.spring.ultra_shop.business.impl;

import lombok.RequiredArgsConstructor;
import md.spring.ultra_shop.business.UserBusiness;
import md.spring.ultra_shop.business.converter.UserConverter;
import md.spring.ultra_shop.business.dto.User;
import md.spring.ultra_shop.repository.UserRepository;
import md.spring.ultra_shop.repository.entity.UserEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserBusinessImpl implements UserBusiness {
    private final UserRepository repository;
    private final UserConverter converter;

    @Override
    public List<UserEntity> retrieveUser() {
        return repository.findAll();
    }

    @Override
    public User createUser(User dto) {
        return converter.convert(repository.save(converter.reverse().convert(dto)));
    }
}
