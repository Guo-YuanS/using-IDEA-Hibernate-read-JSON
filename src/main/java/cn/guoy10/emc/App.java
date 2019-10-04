package cn.guoy10.emc;

import cn.OberonEntity;

import java.io.FileNotFoundException;
import java.util.List;

/**
 *
 *
 */
public class App 
{
    public static void main( String[] args ) throws FileNotFoundException {
      ReadJson readJson = new ReadJson();
        List<OberonEntity> oberons = readJson.read("C:\\Users\\gys\\Desktop\\test.json");
        Write write = new Write();
        write.write(oberons);
    }
}
