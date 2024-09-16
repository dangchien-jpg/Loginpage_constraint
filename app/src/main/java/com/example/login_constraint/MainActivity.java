package com.example.login_constraint;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText Username;
    EditText Password;
    TextView txt_username;
    TextView txt_password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        getViews();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txt_password.setText(Password.getText().toString().trim());
                txt_username.setText(Username.getText().toString().trim());

            }
        });
    }

    private void getViews() {
        button=findViewById(R.id.button);
        Username=findViewById(R.id.username);
        Password=findViewById(R.id.Password);
        txt_username=findViewById(R.id.textView_username);
        txt_password=findViewById(R.id.textView_password);
    }
}