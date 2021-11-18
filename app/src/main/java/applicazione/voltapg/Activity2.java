package applicazione.voltapg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent i = getIntent();
        String testoStampa=i.getStringExtra("etichetta");
        Toast t = Toast.makeText(getApplicationContext(), testoStampa,Toast.LENGTH_LONG );
        t.show();
    }
}