package com.example.simtoolkit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {
    EditText amount;
    Button send;
    TextView textview1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        amount = (EditText) findViewById(R.id.amount);
        send = (Button)findViewById(R.id.send);
        textview1 = (TextView) findViewById(R.id.textview1);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity5.this, "Sending...", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
        amount.addTextChangedListener(i);
    }
    private TextWatcher i = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String Amount =amount.getText().toString().trim();
            send.setEnabled(!Amount.isEmpty());
            int target=1000;

        } 

        @Override
        public void afterTextChanged(Editable s) {

        }

};
}