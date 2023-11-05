package com.gokay.week5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {
    WebView webView;
    Button btnGo;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGo = findViewById(R.id.btnGo);
        webView = findViewById(R.id.webView);
        editText = findViewById(R.id.txtAdress);

        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl("https://" + editText.getText());
            }
        });

        if (getIntent() != null && getIntent().getData()!=null){
            editText.setText(getIntent().getData().toString());
            webView.loadUrl(getIntent().getData().toString());
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_xml, menu);
        return super.onCreateOptionsMenu(menu);

    }
}