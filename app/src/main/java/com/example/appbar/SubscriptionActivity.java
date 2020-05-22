package com.example.appbar;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SubscriptionActivity extends AppCompatActivity {

    EditText editViewLogin;
    EditText editViewEmail;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subscription);

        textView = findViewById(R.id.textView5);
        editViewLogin = findViewById(R.id.LabelForLogin);
        editViewEmail = findViewById(R.id.LabelForEmail);


    }

    public void onClick(View view) {
        textView.setText("Подписка на рассылку успешно оформлена для пользователя " + editViewLogin.getText().toString() +
                " на электронный адрес " + editViewEmail.getText().toString());
        textView.setVisibility(1);
    }

    public void clean(View view) {
        editViewLogin.getText().clear();
        editViewEmail.getText().clear();


    }
}

