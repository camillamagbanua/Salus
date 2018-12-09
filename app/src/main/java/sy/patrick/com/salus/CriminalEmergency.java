package sy.patrick.com.salus;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CriminalEmergency extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criminal_emergency);
        setTitle("Criminal Emergency");
    }
    public void process(View v) {
        Intent i = null, chooser = null;

        if (v.getId() == R.id.call911) {
            i = new Intent(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:911"));
            startActivity(i);
        }

        else if (v.getId() == R.id.callbtn1) {
            i = new Intent(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:024950130"));
            startActivity(i);
        } else if (v.getId() == R.id.mapbtn1) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.611393, 120.979213"));
            chooser = Intent.createChooser(i, "Choose Application for Map");
            startActivity(chooser);
        } else if (v.getId() == R.id.callbtn2) {
            i = new Intent(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:022511661"));
            startActivity(i);
        } else if (v.getId() == R.id.mapbtn2) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.608285, 120.971925"));
            chooser = Intent.createChooser(i, "Choose Application for Map");
            startActivity(chooser);
        } else if (v.getId() == R.id.callbtn3) {
            i = new Intent(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:022563374"));
            startActivity(i);
        } else if (v.getId() == R.id.mapbtn3) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.612588, 120.982391"));
            chooser = Intent.createChooser(i, "Choose Application for Map");
            startActivity(chooser);
        } else if (v.getId() == R.id.callbtn4) {
            i = new Intent(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:022455002"));
            startActivity(i);
        } else if (v.getId() == R.id.mapbtn4) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.608776, 120.966823"));
            chooser = Intent.createChooser(i, "Choose Application for Map");
            startActivity(chooser);
        } else if (v.getId() == R.id.callbtn5) {
            i = new Intent(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:022443080"));
            startActivity(i);
        } else if (v.getId() == R.id.mapbtn5) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.604302, 120.973403"));
            chooser = Intent.createChooser(i, "Choose Application for Map");
            startActivity(chooser);
        } else if (v.getId() == R.id.callbtn6) {
            i = new Intent(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:027360474"));
            startActivity(i);
        } else if (v.getId() == R.id.mapbtn6) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.600136, 120.980298"));
            chooser = Intent.createChooser(i, "Choose Application for Map");
            startActivity(chooser);
        } else if (v.getId() == R.id.callbtn7) {
            i = new Intent(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:027813049"));
            startActivity(i);
        } else if (v.getId() == R.id.mapbtn7) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.606315, 121.002371"));
            chooser = Intent.createChooser(i, "Choose Application for Map");
            startActivity(chooser);
        } else if (v.getId() == R.id.callbtn8) {
            i = new Intent(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:027419322"));
            startActivity(i);
        } else if (v.getId() == R.id.mapbtn8) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.622885, 120.983363"));
            chooser = Intent.createChooser(i, "Choose Application for Map");
            startActivity(chooser);
        }
    }
}
