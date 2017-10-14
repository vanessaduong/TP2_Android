package esipe.ing3.tp2;

import android.app.ListActivity;
import android.content.Intent;
import android.icu.text.DateFormat;
import android.icu.text.SimpleDateFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class ListClientActivity extends AppCompatActivity {

    private ArrayList<Client> clientL = this.createRandomClientList();
    private ListView clientListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_client);

        ListView clientListView = (ListView) findViewById(R.id.clientListView);
        ClientAdapter clientAdapter = new ClientAdapter(this,R.layout.list_view_items,clientL);
        clientListView.setAdapter(clientAdapter);


    }


    public ArrayList<Client> createRandomClientList(){

        Date date = Calendar.getInstance().getTime();

        ArrayList<Client> myList = new ArrayList<>();
        String nom="Nom";
        String prenom="Prenom";
        for (int i=1; i<10; i++){
            if(i%2==0)
                myList.add(new Client(nom,prenom,"F",nom+"."+prenom+"@gmail.com",date,"Debutant","A",R.drawable.girl));
            else
                myList.add(new Client(nom,prenom,"H",nom+"."+prenom+"@gmail.com",date,"Debutant","A",R.drawable.boy));

        }
        return myList;
    }
}
