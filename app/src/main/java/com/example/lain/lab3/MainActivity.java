package com.example.lain.lab3;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText login = (EditText) findViewById(R.id.editText2);
        login.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if(actionId == EditorInfo.IME_ACTION_DONE){
                    EditText passwordEditText;
                    passwordEditText = (EditText) findViewById(R.id.editText2);
                    String passwordText = passwordEditText.getText().toString();

                    Context context = getApplicationContext();
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast2 = Toast.makeText(context, passwordText, duration);
                    toast2.show();
                }
                return false;
            }
        });
        AutoCompleteTextView comp = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        String companies[] = getResources().getStringArray(R.array.companies_array);
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, companies);
        comp.setAdapter(itemsAdapter);
    }




    public void doLogin(View v){
        EditText loginEditText;
        loginEditText = (EditText) findViewById(R.id.editText);
        String loginText = loginEditText.getText().toString();

        EditText passwordEditText;
        passwordEditText = (EditText) findViewById(R.id.editText2);
        String passwordText = passwordEditText.getText().toString();


        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, "Your login is:"+ loginText+"\nand pass is:"+passwordText, duration);
        toast.show();

    }




}
