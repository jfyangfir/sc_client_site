package com.jf.sc_client_site.modules.site.service;

import com.jf.sc_client_site.modules.site.entity.City;

import java.util.List;

public interface CityService {
    List<City> getCitiesById(int id);
}
