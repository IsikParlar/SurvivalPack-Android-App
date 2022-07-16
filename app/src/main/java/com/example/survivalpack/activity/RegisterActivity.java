package com.example.survivalpack.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.survivalpack.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegisterActivity extends AppCompatActivity {

    TextInputEditText etRegEmail, etRegPass;
    Button buttonRegister;

    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etRegEmail = findViewById(R.id.etRegEmail);
        etRegPass = findViewById(R.id.etRegPass);
        buttonRegister = findViewById(R.id.buttonRegister);

        mAuth = FirebaseAuth.getInstance();

        buttonRegister.setOnClickListener(view -> {

            createUser();
        });


    }

    private void createUser() {
        String email = etRegEmail.getText().toString();
        String password = etRegPass.getText().toString();

        if (TextUtils.isEmpty(email)) {
            etRegEmail.setError("Email cannat be empty");
            etRegEmail.requestFocus();
        } else if (TextUtils.isEmpty(password)) {
            etRegPass.setError("Password cannot be empty");
            etRegPass.requestFocus();
        } else {
            mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        Toast.makeText(RegisterActivity.this, "User registered successfully", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
                    } else {
                        Toast.makeText(RegisterActivity.this, "Registration Error: " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
}