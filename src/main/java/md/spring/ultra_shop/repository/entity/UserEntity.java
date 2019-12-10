package md.spring.ultra_shop.repository.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "user")
public class UserEntity {

    @Id
//    @OneToMany()
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String email;
}
