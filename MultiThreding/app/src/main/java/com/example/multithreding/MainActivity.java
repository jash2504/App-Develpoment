package com.example.multithreding;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

@SuppressWarnings("deprecation")
public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=(Button) findViewById(R.id.submit);
        editText=(EditText) findViewById(R.id.data);
        textView=(TextView) findViewById(R.id.time);

        button.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                AsyncTaskRunner runner=new AsyncTaskRunner();
                String sleep=editText.getText().toString();
                runner.execute(sleep);
            }
        });
    }
    private class AsyncTaskRunner extends AsyncTask<String,String,String>
    {
        private String response;
        ProgressDialog pd;

        @Override
        protected void onPreExecute() {
            pd=ProgressDialog.show(MainActivity.this,"Progress dialog","wait"+editText.getText().toString()+" seconds");
        }

        @Override
        protected void onProgressUpdate(String... values) {
            textView.setText(values[0]);

        }

        @Override
        protected String doInBackground(String... strings) {

            publishProgress("Sleeping...");
            try {
                int timesec=Integer.parseInt(strings[0]);
                for(int i=0;i<timesec;i++)
                {
                    Thread.sleep(1000);
//                    response="Slept for"+(i+1)+" of "+timesec;
                    response=" ";
                    publishProgress(response);
                }
            }
            catch (InterruptedException e)
            {
                    e.printStackTrace();
            }
            catch (Exception e)
            {
                e.printStackTrace();
                response=e.getMessage();
            }
            return response;
        }
        @Override
        protected void onPostExecute(String s) {
            pd.dismiss();
            textView.setText(s);
        }




    }
}