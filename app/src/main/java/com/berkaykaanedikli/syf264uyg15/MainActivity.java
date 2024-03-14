package com.berkaykaanedikli.syf264uyg15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;

import com.berkaykaanedikli.syf264uyg15.databinding.ActivityMainBinding;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.edtTxtName.getText().toString();
        binding.edtTxtPhone.getText().toString();
        binding.edtTxteMail.getText().toString();
    }

    public void Gonder(View view) {
        String name = binding.edtTxtName.getText().toString();
        String phone = binding.edtTxtPhone.getText().toString();
        String email = binding.edtTxteMail.getText().toString();

        Personalinfo personalinfo = new Personalinfo(name,phone,email);

        Intent intent = new Intent(this,FormBilgi.class);
        intent.putExtra("personalinfo", personalinfo);
        startActivity(intent);
    }
}