package com.example.asiagibson.profile;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by asiagibson on 2/12/17.
 */

public class LoginActivity extends AppCompatActivity {

    EditText userN;
    EditText password;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        submit = (Button)findViewById(R.id.bttn_submit);
        userN = (EditText)findViewById(R.id.et_username);
        password = (EditText)findViewById(R.id.et_password);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;

                if(!userN.getText().toString().isEmpty() && !password.getText().toString().isEmpty()) {
                    intent = new Intent(LoginActivity.this, MainScreenActivity.class);
                    startActivity(intent);

                }

                if(userN.getText().toString().isEmpty()){
                    Toast.makeText(submit.getContext(), "Enter a Username", Toast.LENGTH_LONG).show();

                }

               else if (password.getText().toString().isEmpty()){
                    Toast.makeText(submit.getContext(), "Enter a Password", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}
