package com.example.lesson_22102022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private Button _button;
    private TextView _textView;
    private EditText _editText;
    private int _counter = 0;
    private String _name;

    // Test

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Нахождение элемента интерфейса в разметке по айди
        _button = findViewById(R.id.button);
        _textView = findViewById(R.id.textView);
        _editText = findViewById(R.id.editTextView);

        // Анонимный внутренний класс
        _button.setOnClickListener(new View.OnClickListener()
        {
            // Метод onClick() вызывается каждый раз при нажатии на кнопку
            @Override
            public void onClick(View view)
            {
                _counter++;
                _textView.setText(String.valueOf(_counter));
                _name = String.valueOf(_editText.getText());
                Toast.makeText(MainActivity.this, "меня нажал " + _name, Toast.LENGTH_SHORT).show();
            }
        });
    }
}