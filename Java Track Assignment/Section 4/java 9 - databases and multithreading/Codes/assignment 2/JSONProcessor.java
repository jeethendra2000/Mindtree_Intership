package Product4.Hibernate;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class JSONProcessor {
    private final String targetFilePath;

    JSONProcessor(String targetFilePath) {
        this.targetFilePath = targetFilePath;
    }

    public List<Customer> parseFile() throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        JSONObject json = (JSONObject) parser.parse(new FileReader(targetFilePath));
        JSONArray customers = (JSONArray) json.get("customers");

        List<JSONObject> customerList = (List<JSONObject>) customers.stream().collect(Collectors.toList());

        return customerList.stream()
            .map(x -> new Customer((String) x.get("cusId"), (String) x.get("cusName"), (String) x.get("city"), (Double) x.get("pin")))
            .collect(Collectors.toList());
    }
}
