package md.spring.ultra_shop.repository.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email", nullable = false)
    private String email;
}
