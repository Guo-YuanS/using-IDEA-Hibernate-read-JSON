package cn.guoy10.emc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import cn.OberonEntity;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import com.google.gson.JsonObject;

public class ReadJson {
    public List<OberonEntity> read(String path) throws FileNotFoundException {
        List<OberonEntity> objects = new ArrayList<>();
        JsonParser parser = new JsonParser();
        JsonObject json=(JsonObject)parser.parse(new FileReader(path));
        JsonArray array = json.get("Oberon").getAsJsonArray();
        for(int i=0;i<array.size();i++){
            OberonEntity obj = new OberonEntity();
            JsonObject subobject = (JsonObject) array.get(i);
            obj.setName(subobject.get("NAME").getAsString());
            obj.setSpaIp(subobject.get("SPA_IP").getAsString());
            obj.setSpbIp(subobject.get("SPB_IP").getAsString());
            obj.setBmcaIp(subobject.get("BMCA_IP").getAsString());
            obj.setBmcaIp(subobject.get("BMCB_IP").getAsString());
            obj.setDate(subobject.get("DATE").getAsString());
            obj.setOwner(subobject.get("OWNER").getAsString());
            obj.setMode(subobject.get("MODE").getAsString());
            objects.add(obj);
        }
        return objects;
    }
}
