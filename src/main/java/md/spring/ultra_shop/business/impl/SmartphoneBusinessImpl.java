package md.spring.ultra_shop.business.impl;

import lombok.RequiredArgsConstructor;
import md.spring.ultra_shop.business.SmartphoneBusiness;
import md.spring.ultra_shop.repository.SmartphoneRepository;
import md.spring.ultra_shop.repository.entity.SmartphoneEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SmartphoneBusinessImpl implements SmartphoneBusiness {

    private final SmartphoneRepository repository;

    @Override
    public List<SmartphoneEntity> retrieveSmartphone(){
        return repository.findAll();
    }

}

