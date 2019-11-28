package md.spring.ultra_shop.business.converter;

import com.google.common.base.Converter;
import md.spring.ultra_shop.business.dto.User;
import md.spring.ultra_shop.repository.entity.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserConverter extends Converter<UserEntity, User> {

    @Override
    protected User doForward(UserEntity entity) {
        User dto = new User();

        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setEmail(entity.getEmail());
        return dto;
    }

    @Override
    protected UserEntity doBackward(User dto) {
        UserEntity entity = new UserEntity();

        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setEmail(dto.getEmail());
        return entity;
    }
}
