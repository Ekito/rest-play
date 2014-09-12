package repositories;

import models.City;

import java.util.List;

/**
 * Created by dimitri on 30/06/14.
 */
public interface UsPopulationRepo {
    public List<City> findCityLike(String name);
}
