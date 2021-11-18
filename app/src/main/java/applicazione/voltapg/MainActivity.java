package applicazione.voltapg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnResetta;
    Button btnPlay;
    TextView lblTesto;
    EditText editTesto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnResetta = (Button)findViewById(R.id.btn_reset);
        btnPlay = (Button)findViewById(R.id.btn_play);
        lblTesto = (TextView)findViewById(R.id.lbl_init);
        editTesto = (EditText)findViewById(R.id.plain_text_input);
    }

    public void resetta(View v){
        editTesto.setText("");
    }

    public void stampa(View v){
        Toast toast = Toast.makeText(getApplicationContext(), editTesto.getText(),Toast.LENGTH_LONG );
        toast.show();
    }

    public void lanciaseconda(View v){
        Intent i = new Intent(getApplicationContext(), Activity2.class);
        i.putExtra("etichetta", lblTesto.getText());
        startActivity(i);
    }
}