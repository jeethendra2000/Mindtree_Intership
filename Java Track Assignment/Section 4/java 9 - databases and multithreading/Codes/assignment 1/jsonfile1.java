package jsonproject;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class jsonfile1 {

 public static void main(String[] args) {
  JSONObject custs = new JSONObject();
  custs.put("custid", 100);
  custs.put("custname", "satya prakash das");
  custs.put("city", "bhubaneswar");
  custs.put("pin", 1001);

  JSONObject custsObj = new JSONObject();
  custsObj.put("Customer1", custs);

  JSONObject custs2 = new JSONObject();
  custs2.put("custid", 101);
  custs2.put("custname", "patel");
  custs2.put("city", "nyc");
  custs2.put("pin", 222222);
  
  JSONObject custsObj2 = new JSONObject();
  custsObj2.put("Customer2", custs2);

  JSONArray custList = new JSONArray();
  custList.add(custsObj);
  custList.add(custsObj2);
  
  try(FileWriter file = new FileWriter("customers.json")){
   file.write(custList.toJSONString());
   file.flush();
  }
  catch(IOException e) {e.printStackTrace();}
 }

}