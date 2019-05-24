package md.spring.ultra_shop.business;

import md.spring.ultra_shop.repository.entity.WatchEntity;
import java.util.List;

public interface WatchBusiness {
    List<WatchEntity> retrieveWatch();
}
