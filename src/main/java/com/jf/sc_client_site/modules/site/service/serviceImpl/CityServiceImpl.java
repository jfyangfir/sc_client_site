package com.jf.sc_client_site.modules.site.service.serviceImpl;

import com.jf.sc_client_site.modules.site.dao.CityDao;
import com.jf.sc_client_site.modules.site.entity.City;
import com.jf.sc_client_site.modules.site.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    public List<City> getCitiesById(int id) {
        return Optional.ofNullable(cityDao.getCitiesById(id))
                .orElse(Collections.emptyList());
    }
}
