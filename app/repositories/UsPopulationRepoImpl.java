package repositories;

import com.google.common.collect.Lists;
import configuration.MongoFactory;
import models.City;
import play.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dimitri on 30/06/14.
 */
public class UsPopulationRepoImpl implements  UsPopulationRepo{

    public List<City> findCityLike(String name) {

        Logger.debug("List<City> findCityLike(String name) : " + name);

        List<City> cities = new ArrayList<City>();

        cities = Lists.newArrayList(MongoFactory.getUsPopulation().find("{city: {$regex: #, $options: 'i'} }", name + ".*").limit(500).as(City.class));

        return cities;
    }
}
