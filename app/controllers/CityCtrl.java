package controllers;

import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import repositories.UsPopulationRepo;
import repositories.UsPopulationRepoImpl;

/**
 * Created by dimitri on 01/08/14.
 */
public class CityCtrl extends Controller{

    UsPopulationRepo repo = new UsPopulationRepoImpl();

    public Result findCitiesByName(String name){

        return ok(Json.toJson(repo.findCityLike(name)));
    }
}
