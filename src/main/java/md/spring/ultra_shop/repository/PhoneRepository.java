package md.spring.ultra_shop.repository;

import md.spring.ultra_shop.repository.entity.PhoneEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepository  extends JpaRepository<PhoneEntity, Long> {
}
