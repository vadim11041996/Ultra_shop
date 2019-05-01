package md.spring.ultra_shop.repository.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
}
