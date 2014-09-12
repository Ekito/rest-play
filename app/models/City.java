package models;

/**
 * Created by dimitri on 30/06/14.
 */


import org.jongo.marshall.jackson.oid.Id;

import java.util.ArrayList;
import java.util.List;

public class City {

    @Id // auto
    private String _id;

    private String city;

    private List<Float> loc = new ArrayList<Float>();

    private int pop;

    public City(){

    }

    public City(String city, List<Float> loc, int pop) {
        super();
        this.city = city;
        this.loc = loc;
        this.pop = pop;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Float> getLoc() {
        return loc;
    }

    public void setLoc(List<Float> loc) {
        this.loc = loc;
    }

    public int getPop() {
        return pop;
    }

    public void setPop(int pop) {
        this.pop = pop;
    }




}

