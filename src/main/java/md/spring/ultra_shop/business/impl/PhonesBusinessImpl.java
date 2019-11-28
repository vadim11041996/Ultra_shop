package md.spring.ultra_shop.business.impl;

import lombok.RequiredArgsConstructor;
import md.spring.ultra_shop.business.PhonesBusiness;
import md.spring.ultra_shop.repository.PhoneRepository;
import md.spring.ultra_shop.repository.entity.PhoneEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PhonesBusinessImpl implements PhonesBusiness {

    private final PhoneRepository repository;

    @Override
    public List<PhoneEntity> retrievePhones() {
        return repository.findAll();
    }

}
