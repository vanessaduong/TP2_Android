package esipe.ing3.tp2;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ClientInfoActivity extends AppCompatActivity {

    private Client c;
    private ImageView imgV;
    private TextView nom;
    private TextView prenom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.client_info);

        Intent i = getIntent();
        Client c = (Client)i.getSerializableExtra("Client info");

        ImageView imgV = (ImageView) findViewById(R.id.imageInfoView);
        TextView nom = (TextView) findViewById(R.id.nom);
        TextView prenom = (TextView) findViewById(R.id.prenom);

        imgV.setImageResource(c.getImage());
        nom.setText((String)c.getNom());
        prenom.setText((String)c.getPrenom());


    }
}
