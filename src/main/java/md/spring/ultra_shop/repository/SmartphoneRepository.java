package md.spring.ultra_shop.repository;

import md.spring.ultra_shop.repository.entity.SmartphoneEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmartphoneRepository extends JpaRepository<SmartphoneEntity, Long> {
}
