package main.java.com.lhq.jsonutil;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Haoqiang Lyu
 * @date 2019-07-05 12:12
 */
public class JsonObject01 {

    public static void main(String[] args) {

        String json = "{'name':'Tom','age':24}";

        try {

            JSONObject obj = new JSONObject(json);

            String name = obj.getString("name");

            int age = obj.getInt("age");
            //Output to the console
            System.out.println(name + "<--->" + age);

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
