package com.jf.sc_client_site.modules.site.dao;

import com.jf.sc_client_site.modules.site.entity.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CityDao {

    @Select("select * from city where id=#{id}")
    List<City> getCitiesById(int id);
}
