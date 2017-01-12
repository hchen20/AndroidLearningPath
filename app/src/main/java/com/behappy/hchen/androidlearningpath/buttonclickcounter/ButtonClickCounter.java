package com.behappy.hchen.androidlearningpath.buttonclickcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.behappy.hchen.androidlearningpath.R;

public class ButtonClickCounter extends AppCompatActivity {

    private static final String TAG = ButtonClickCounter.class.getSimpleName();
    private Button button;
    private EditText userInput;
    private TextView textView;
    
    


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttom_click_counter);


        userInput = (EditText) findViewById(R.id.userinput);
        button = (Button) findViewById(R.id.button);
        textView =(TextView) findViewById(R.id.textarea);
        textView.setText("");
        userInput.setText("");
        textView.setMovementMethod(new ScrollingMovementMethod());

        View.OnClickListener ourOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = userInput.getText().toString();
                result += "\n";
                textView.append(result);

                userInput.setText("");
            }
        };

        button.setOnClickListener(ourOnClickListener);
    }



    @Override
    protected void onStop() {
        Log.d(TAG, "onStop: in");
        super.onStop();
        Log.d(TAG, "onStop: out");
    }

    @Override
    protected void onPostResume() {
        Log.d(TAG, "onPostResume: in");
        super.onPostResume();
        Log.d(TAG, "onPostResume: out");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        Log.d(TAG, "onRestoreInstanceState: in");
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG, "onRestoreInstanceState: out");
    }
    
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        Log.d(TAG, "onSaveInstanceState: in");
        super.onSaveInstanceState(outState);
        Log.d(TAG, "onSaveInstanceState: out");
    }
}
