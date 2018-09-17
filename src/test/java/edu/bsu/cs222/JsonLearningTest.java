package edu.bsu.cs222;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.junit.Test;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Map;

public class JsonLearningTest
{
    @Test
    public void testCountRevision()
    {
        JsonParser parser = new JsonParser();
        InputStream inputStream;
        inputStream = getClass().getClassLoader().getResourceAsStream("sample.json");
        Reader reader = new InputStreamReader(inputStream);
        JsonElement rootElement = parser.parse(reader);
        JsonObject rootObject = rootElement.getAsJsonObject();
        JsonObject pages = rootObject.getAsJsonObject("query").getAsJsonObject("pages");
        JsonArray array = null;
        for (Map.Entry<String,JsonElement> entry : pages.entrySet())
        {
            JsonObject entryObject = entry.getValue().getAsJsonObject();
            array = entryObject.getAsJsonArray("revisions");
            JsonArray users = array;
        }
        System.out.println(array);

    }
    @Test
    public void printOutArrayObjects()
    {
        JsonParser parser = new JsonParser();
        InputStream inputStream;
        inputStream = getClass().getClassLoader().getResourceAsStream("sample.json");
        Reader reader = new InputStreamReader(inputStream);
        JsonElement rootElement = parser.parse(reader);
        JsonObject rootObject = rootElement.getAsJsonObject();
        JsonObject pages = rootObject.getAsJsonObject("query").getAsJsonObject("pages");
        JsonArray array = null;
        for (Map.Entry<String,JsonElement> entry : pages.entrySet())
        {
            JsonObject entryObject = entry.getValue().getAsJsonObject();
            array = entryObject.getAsJsonArray("revisions");
            JsonArray users = array;
        }
        for (int i = 0, array[i]) {
            System.out.println(array[i]);
            array[i++];
    }
    @Test
    public void testConnectionTest(){
            import java.net.*;
            import java.io.*;

        public class URLConnectionReader {
            public static void main(String[] args) throws Exception {
                URL wikipedia = new URL("http://www.wikipedia.com/");
                URLConnection yc = oracle.openConnection();
                BufferedReader in = new BufferedReader(new InputStreamReader(
                        yc.getInputStream()));
                String inputLine;
                while ((inputLine = in.readLine()) != null)
                    System.out.println(inputLine);
                in.close();
            }
        }
    }
    }
}
