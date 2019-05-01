package md.spring.ultra_shop.business;

import md.spring.ultra_shop.repository.entity.LaptopEntity;
import java.util.List;

public interface LaptopBusiness {
    List<LaptopEntity> retrieveLaptop();
}
