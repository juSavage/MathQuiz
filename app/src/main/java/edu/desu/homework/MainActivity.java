package edu.desu.homework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

        public void submit(View view){
            EditText editTextanswer = (EditText) findViewById(R.id.answer);
            int answer = Integer.parseInt(editTextanswer.getText().toString());

            if (answer == 9){
                Toast.makeText(MainActivity.this, "Correct!", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(MainActivity.this, "WRONG. Try Again!", Toast.LENGTH_SHORT).show();
            }
    }
}


