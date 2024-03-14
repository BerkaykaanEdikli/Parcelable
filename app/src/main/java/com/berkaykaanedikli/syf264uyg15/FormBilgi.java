package com.berkaykaanedikli.syf264uyg15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.berkaykaanedikli.syf264uyg15.databinding.ActivityFormBilgiBinding;
import com.berkaykaanedikli.syf264uyg15.databinding.ActivityMainBinding;

public class FormBilgi extends AppCompatActivity {
    private ActivityFormBilgiBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFormBilgiBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = getIntent();
        Personalinfo personalinfo = intent.getParcelableExtra("personalinfo",Personalinfo.class);

        binding.textView.setText(personalinfo.getName());
        binding.textView2.setText(personalinfo.getEmail());
        binding.textView3.setText(personalinfo.getPhone());
    }
}