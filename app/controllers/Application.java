package controllers;

import play.*;
import play.libs.Json;
import play.mvc.*;

import repositories.UsPopulationRepo;
import repositories.UsPopulationRepoImpl;
import views.html.*;

public class Application extends Controller {


    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }



}
