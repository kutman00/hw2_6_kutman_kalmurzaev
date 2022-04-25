package com.geektech.hw_6_kutman_kalmurzaev;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    private EditText login, password;
    private Button button;
    private TextView come_in, info, welcome,click, inf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = findViewById(R.id.login);
        password = findViewById(R.id.password);
        button = findViewById(R.id.btn);
        inf = findViewById(R.id.text);
        come_in = findViewById(R.id.text3);
        info = findViewById(R.id.info);
        welcome = findViewById(R.id.welcome);
        click = findViewById(R.id.text_click);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (login.getText().toString().equals("admin") &&
                        password.getText().toString().equals("admin")) {
                    button.setVisibility(view.GONE);
                    login.setVisibility(view.GONE);
                    password.setVisibility(view.GONE);
                    click.setVisibility(view.GONE);
                    come_in.setVisibility(view.GONE);
                    info.setVisibility(view.GONE);
                    Toast.makeText(MainActivity.this, "Вы успешно зарегистрировались", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Неверная почта или пароль", Toast.LENGTH_SHORT).show();
                }
            }
        });
        login.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (login.getText().toString().isEmpty()) {
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.dark));
                } else {
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orange));
                }
            }
        });
        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (password.getText().toString().isEmpty()) {
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.dark));
                } else {
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orange));
                }
            }
        });


    }


}