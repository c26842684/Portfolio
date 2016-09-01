package com.example.genji.portfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button1,button2,button3,button4,button5,button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        prepare();
    }

    private void prepare(){
        button1 = (Button)findViewById(R.id.button);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
        button1.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                Context context = getApplicationContext();
                CharSequence text = button1.getText();
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
        button2.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                Context context = getApplicationContext();
                CharSequence text = button2.getText();
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
        button3.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                Context context = getApplicationContext();
                CharSequence text = button3.getText();
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
        button4.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                Context context = getApplicationContext();
                CharSequence text = button4.getText();
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
        button5.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                Context context = getApplicationContext();
                CharSequence text = button5.getText();
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
        button6.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                Context context = getApplicationContext();
                CharSequence text = button6.getText();
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });


    }
}
