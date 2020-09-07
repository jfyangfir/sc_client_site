package com.jf.sc_client_site.modules.site.controller;

import com.jf.sc_client_site.modules.site.entity.City;
import com.jf.sc_client_site.modules.site.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CityController {

    @Autowired
    private CityService cityService;

    /*
    *http://127.0.0.1:8761/api/cities/7
    * */
    @RequestMapping("/cities/{id}")
    public List<City> getCitiesById(@PathVariable int id) {
        return cityService.getCitiesById(id);
    }

}
