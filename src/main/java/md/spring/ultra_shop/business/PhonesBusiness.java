package md.spring.ultra_shop.business;

import md.spring.ultra_shop.repository.entity.PhoneEntity;

import java.util.List;

public interface PhonesBusiness {

    List<PhoneEntity> retrievePhones();
}
