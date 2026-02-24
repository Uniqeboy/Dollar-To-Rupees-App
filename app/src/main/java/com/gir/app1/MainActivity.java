package com.gir.app1;

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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Connect XML views
        EditText etAmount = findViewById(R.id.editTextText);
        Button btnConvert = findViewById(R.id.button);
        TextView tvResult = findViewById(R.id.textView2);

        // Button click logic
        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String input = etAmount.getText().toString();

                if (!input.isEmpty()) {

                    double dollar = Double.parseDouble(input);
                    double rupees = dollar * 83;

                    tvResult.setText(String.format("$%.2f  =  ₹ %.2f", dollar, rupees));
                }
            }
        });
    }
}