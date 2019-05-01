package md.spring.ultra_shop.business;

import md.spring.ultra_shop.repository.entity.SmartphoneEntity;
import java.util.List;

public interface SmartphoneBusiness {
    List<SmartphoneEntity> retrieveSmartphone();
}
