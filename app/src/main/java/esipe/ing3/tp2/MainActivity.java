package esipe.ing3.tp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private Button add;
    private Button list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button add = (Button)findViewById(R.id.addButton);
        final Button list = (Button)findViewById(R.id.listButton);
    }

    public void addButtonOnClick(View view) {
        Log.d(TAG, "addButtonClicked");
        Intent addClientIntent = new Intent(MainActivity.this, AddActivity.class);
        MainActivity.this.startActivity(addClientIntent);
    }

    public void listButtonOnClick(View view) {
        Log.d(TAG, "listButtonClicked");
        Intent listClientIntent = new Intent(MainActivity.this, ListClientActivity.class);
        MainActivity.this.startActivity(listClientIntent);
    }
}
