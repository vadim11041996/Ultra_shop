package md.spring.ultra_shop.business.impl;

import lombok.RequiredArgsConstructor;
import md.spring.ultra_shop.business.WatchBusiness;
import md.spring.ultra_shop.repository.WatchRepository;
import md.spring.ultra_shop.repository.entity.WatchEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WatchBusinessImpl implements WatchBusiness {

    private final WatchRepository watchRepository;

    @Override
    public List<WatchEntity> retrieveWatch() {
        return watchRepository.findAll();
    }
}
