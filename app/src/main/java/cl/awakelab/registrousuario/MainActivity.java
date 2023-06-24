package cl.awakelab.registrousuario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText textName;
        EditText textLastName;
        EditText textEmail;
        EditText textPassword;
        Button buttonCreateAccount;

        textName = findViewById(R.id.editTextName);
        textLastName = findViewById(R.id.editTextLastName);
        textEmail = findViewById(R.id.editTextEmail);
        textPassword = findViewById(R.id.editTextPassword);
        buttonCreateAccount = findViewById(R.id.buttonCreateAccount);

        buttonCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = textName.getText().toString();
                String lastName = textLastName.getText().toString();
                String email = textEmail.getText().toString();
                String password = textPassword.getText().toString();

                if(name.isEmpty() || lastName.isEmpty() || email.isEmpty() || password.isEmpty() || !email.contains("@") ) {
                    Toast.makeText(getBaseContext(), "Faltan campos por completar", Toast.LENGTH_SHORT).show();
                    return;
                }

                String textoToast = "Bienvenido " + name + " " + lastName + " " + "Email" + email + " " + "contraseña ********" ;
                Toast.makeText(getBaseContext(), textoToast, Toast.LENGTH_LONG).show();
            }
        });


    }
}