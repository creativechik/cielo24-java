package cielo24.json;

import com.google.gson.Gson;

import cielo24.Utils;


public abstract class JsonBase {

    @Override
    public String toString() {
        Gson g = Utils.getCustomGson();
        return g.toJson(this);
    }
}