package md.spring.ultra_shop.controller.converter;


import com.google.common.base.Converter;
import md.spring.ultra_shop.business.dto.User;
import md.spring.ultra_shop.controller.view.UserView;
import org.springframework.stereotype.Component;

@Component
public class UserViewConverter extends Converter<User, UserView> {
    @Override
    protected UserView doForward(User dto) {
        UserView view = new UserView();

        view.setId(dto.getId());
        view.setName(dto.getName());
        view.setEmail(dto.getEmail());
        return view;
    }

    @Override
    protected User doBackward(UserView view) {
        User dto = new User();

        dto.setId(view.getId());
        dto.setName(view.getName());
        dto.setEmail(view.getEmail());
        return dto;
    }
}
