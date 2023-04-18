package br.ifsp.ddm_miguelsantos_adivinha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    // NOME: Miguel Lordello dos Santos

    private Button btnPalpite1;
    private Button btnPalpite2;
    private Button btnPalpite3;
    private TextView lblNumeroPensado;
    private TextView lblResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPalpite1 = findViewById(R.id.btnPalpite1);
        btnPalpite2 = findViewById(R.id.btnPalpite2);
        btnPalpite3 = findViewById(R.id.btnPalpite3);
        lblNumeroPensado = findViewById(R.id.lblNumeroPensado);
        lblResultado = findViewById(R.id.lblResultado);

        btnPalpite1.setOnClickListener(new EscutadorBotao1());
        btnPalpite2.setOnClickListener(new EscutadorBotao2());
        btnPalpite3.setOnClickListener(new EscutadorBotao3());

    }

    class EscutadorBotao1 implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Random random = new Random();
            // gerando numero aleatorio
            int numero = random.nextInt(3)+1;

            // colocando na label numero pensado
            lblNumeroPensado.setText(Integer.toString(numero));

            //pegando o numero do botão palpite
            int palpite = Integer.parseInt(btnPalpite1.getText().toString());

            //verificando se o palpite é igual ao número pensado e exibindo na tela
            // juntamente com o toast
            if (palpite == numero){
                lblResultado.setText("Acertou!");
                Toast.makeText( getApplicationContext(), "Parabéns!" , Toast.LENGTH_SHORT ).show();
            }else{
                lblResultado.setText("Errou!");
                Toast.makeText( getApplicationContext(), "Não foi dessa vez." , Toast.LENGTH_SHORT ).show();
            }
        }
    }

    class EscutadorBotao2 implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Random random = new Random();
            // gerando numero aleatorio
            int numero = random.nextInt(3)+1;

            // colocando na label numero pensado
            lblNumeroPensado.setText(Integer.toString(numero));

            //pegando o numero do botão palpite
            int palpite = Integer.parseInt(btnPalpite2.getText().toString());

            //verificando se o palpite é igual ao número pensado e exibindo na tela
            // juntamente com o toast
            if (palpite == numero){
                lblResultado.setText("Acertou!");
                Toast.makeText( getApplicationContext(), "Parabéns!" , Toast.LENGTH_SHORT ).show();
            }else{
                lblResultado.setText("Errou!");
                Toast.makeText( getApplicationContext(), "Não foi dessa vez." , Toast.LENGTH_SHORT ).show();
            }
        }
    }

    class EscutadorBotao3 implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Random random = new Random();
            // gerando numero aleatorio
            int numero = random.nextInt(3)+1;

            // colocando na label numero pensado
            lblNumeroPensado.setText(Integer.toString(numero));

            //pegando o numero do botão palpite
            int palpite = Integer.parseInt(btnPalpite3.getText().toString());

            //verificando se o palpite é igual ao número pensado e exibindo na tela
            // juntamente com o toast
            if (palpite == numero){
                lblResultado.setText("Acertou!");
                Toast.makeText( getApplicationContext(), "Parabéns!" , Toast.LENGTH_SHORT ).show();
            }else{
                lblResultado.setText("Errou!");
                Toast.makeText( getApplicationContext(), "Não foi dessa vez." , Toast.LENGTH_SHORT ).show();
            }
        }
    }

}