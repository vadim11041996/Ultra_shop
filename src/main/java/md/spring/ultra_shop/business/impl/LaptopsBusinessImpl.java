package md.spring.ultra_shop.business.impl;

import lombok.RequiredArgsConstructor;
import md.spring.ultra_shop.business.LaptopBusiness;
import md.spring.ultra_shop.repository.LaptopRepository;
import md.spring.ultra_shop.repository.entity.LaptopEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LaptopsBusinessImpl implements LaptopBusiness {
    private final LaptopRepository repository;

    @Override
    public List<LaptopEntity> retrieveLaptop() {
        return repository.findAll();
    }
}
