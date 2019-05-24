package md.spring.ultra_shop.repository;

import md.spring.ultra_shop.repository.entity.WatchEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WatchRepository extends JpaRepository<WatchEntity, Long> {
}
