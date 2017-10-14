package esipe.ing3.tp2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ClientAdapter extends ArrayAdapter<Client> {

    ArrayList<Client> clientList = new ArrayList<>();

    public ClientAdapter(Context context, int textViewResourceId, ArrayList<Client> objects) {
        super(context, textViewResourceId, objects);
        clientList = objects;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(R.layout.list_view_items, null);
        TextView nomView = (TextView) v.findViewById(R.id.nomView);
        TextView prenomView = (TextView) v.findViewById(R.id.prenomView);
        ImageView imageView = (ImageView) v.findViewById(R.id.imageClientView);
        TextView birthDateView = (TextView) v.findViewById(R.id.birthDateView);

        nomView.setText(clientList.get(position).getNom());
        prenomView.setText(clientList.get(position).getPrenom());
        imageView.setImageResource(clientList.get(position).getImage());
        birthDateView.setText(clientList.get(position).getBirthdate().toString());


        return v;

    }
}
