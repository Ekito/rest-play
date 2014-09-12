package configuration;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import org.jongo.Jongo;
import org.jongo.MongoCollection;
import play.Logger;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dimitri on 30/06/14.
 */
public class MongoFactory {


    public static MongoCollection getUsPopulation(){

        Logger.debug("MongoCollection getUsPopulation()");

        DB db = null;
        MongoCredential mongoCredential = MongoCredential.createMongoCRCredential("user", "db_name", "password".toCharArray());

        List<MongoCredential> mongoCredentialList = new ArrayList();

        mongoCredentialList.add(mongoCredential);

        try {
            db = new MongoClient(new ServerAddress("db_adresse", port_number), mongoCredentialList).getDB("db_name");

        } catch (UnknownHostException e) {
            Logger.error(e.getMessage());
            return null;
        }

        Jongo jongo = new Jongo(db);
        MongoCollection uspopulation = jongo.getCollection("collection_name");

        return uspopulation;
    }

}
