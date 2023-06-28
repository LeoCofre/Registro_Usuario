package cl.awakelab.registrousuario;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import cl.awakelab.registrousuario.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.buttonCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = binding.editTextName.getText().toString();
                String lastName = binding.editTextLastName.getText().toString();
                String email = binding.editTextEmail.getText().toString();
                String password = binding.editTextPassword.getText().toString();

                if (name.isEmpty() || lastName.isEmpty() || email.isEmpty() || password.isEmpty() || !email.contains("@")) {
                    Toast.makeText(getBaseContext(), "Faltan campos por completar", Toast.LENGTH_SHORT).show();
                    return;
                }

                String textoToast = "Bienvenido " + name + " " + lastName + " " + "Email" + email + " " + "contraseña ********";
                Toast.makeText(getBaseContext(), textoToast, Toast.LENGTH_LONG).show();
            }
        });


    }
}