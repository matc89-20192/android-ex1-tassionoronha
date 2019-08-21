package matc89.exercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView mensagem;
    private Button button;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.btnCumprimentar);
        mensagem = (TextView)findViewById(R.id.labelMensagem);
        editText = (EditText)findViewById(R.id.editNome);
    }

    public void clicou(View v) {
        String textoDigitado = editText.getText().toString();
        mensagem.setText(String.format("Olá, %s", textoDigitado));
    }


}
