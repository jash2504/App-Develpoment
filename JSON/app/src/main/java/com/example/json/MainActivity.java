package com.example.json;


import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.HashMap;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String jsonStr = getListData();
        try{
           lv = (ListView) findViewById(R.id.user_list);

            ArrayList<HashMap<String, String>> userList = new ArrayList<>();
            JSONObject jObj = new JSONObject(jsonStr);
            JSONArray jsonArry = jObj.getJSONArray("users");

            for(int i=0;i<jsonArry.length();i++){

                HashMap<String,String> user = new HashMap<>();
                JSONObject obj = jsonArry.getJSONObject(i);
                user.put("name",obj.getString("name"));
                user.put("num",obj.getString("num"));
                userList.add(user);

            }

            ListAdapter adapter = new SimpleAdapter(MainActivity.this, userList, R.layout.layout,new String[]{"name","num"}, new int[]{R.id.name, R.id.num});
            lv.setAdapter(adapter);
        }
        catch (JSONException ex){
            Log.e("JsonParser Example","unexpected JSON exception", ex);
        }
    }
    private String getListData() {
        String jsonStr = "{ \"users\" :[" +
                "{\"name\":\"Shreyas\",\"num\":\"6352851339\"}" +
                ",{\"name\":\"Rudra\",\"num\":\"6352851339\"}" +
                ",{\"name\":\"Kishan\",\"num\":\"6352851339\"}" +
                ",{\"name\":\"Rudra\",\"num\":\"6352851339\"}" +
                ",{\"name\":\"Jayesh\",\"num\":\"6352851339\"}] }";
        return jsonStr;
    }
}