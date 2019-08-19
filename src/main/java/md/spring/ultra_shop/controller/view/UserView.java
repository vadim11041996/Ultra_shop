package md.spring.ultra_shop.controller.view;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class UserView implements Serializable {

    private static final long serialVersionUID = -6303635205798283699L;

    private Long id;
    private String name;
    private String email;
}

