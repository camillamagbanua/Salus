package sy.patrick.com.salus;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FireEmergency extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fire_emergency);
        setTitle("Fire Emergency");
    }

    public void process(View v) {
        Intent i = null, chooser = null;

        if(v.getId() == R.id.callbtn1) {
            i = new Intent(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:023099645"));
            startActivity(i);
        }
        else if(v.getId() == R.id.mapbtn1) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.612971, 120.982371"));
            chooser = Intent.createChooser(i, "Choose Application for Map");
            startActivity(chooser);
        }

        else if(v.getId() == R.id.callbtn2) {
            i = new Intent(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:022541111"));
            startActivity(i);
        }
        else if(v.getId() == R.id.mapbtn2) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.609843, 120.9781551"));
            chooser = Intent.createChooser(i, "Choose Application for Map");
            startActivity(chooser);
        }

        else if(v.getId() == R.id.callbtn3) {
            i = new Intent(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:027335378"));
            startActivity(i);
        }
        else if(v.getId() == R.id.mapbtn3) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.602606, 120.977937"));
            chooser = Intent.createChooser(i, "Choose Application for Map");
            startActivity(chooser);
        }

        else if(v.getId() == R.id.callbtn4) {
            i = new Intent(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:025167776"));
            startActivity(i);
        }
        else if(v.getId() == R.id.mapbtn4) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.609852, 120.973519"));
            chooser = Intent.createChooser(i, "Choose Application for Map");
            startActivity(chooser);
        }

        else if(v.getId() == R.id.callbtn5) {
            i = new Intent(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:022432871"));
            startActivity(i);
        }
        else if(v.getId() == R.id.mapbtn5) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.607647, 120.966548"));
            chooser = Intent.createChooser(i, "Choose Application for Map");
            startActivity(chooser);
        }

        else if(v.getId() == R.id.callbtn6) {
            i = new Intent(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:024260219"));
            startActivity(i);
        }
        else if(v.getId() == R.id.mapbtn6) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.607736, 120.994998"));
            chooser = Intent.createChooser(i, "Choose Application for Map");
            startActivity(chooser);
        }

        else if(v.getId() == R.id.callbtn7) {
            i = new Intent(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:022453403"));
            startActivity(i);
        }
        else if(v.getId() == R.id.mapbtn7) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.607584, 120.966614"));
            chooser = Intent.createChooser(i, "Choose Application for Map");
            startActivity(chooser);
        }

        else if(v.getId() == R.id.callbtn8) {
            i = new Intent(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:025280641"));
            startActivity(i);
        }
        else if(v.getId() == R.id.mapbtn8) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.593170, 120.981912"));
            chooser = Intent.createChooser(i, "Choose Application for Map");
            startActivity(chooser);
        }
    }
}
