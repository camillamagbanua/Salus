package sy.patrick.com.salus;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MedicalEmergency extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical_emergency);
        setTitle("Medical Emergency");
    }

    public void process(View v) {
        Intent i = null, chooser = null;

        if (v.getId() == R.id.callbtn1) {
            i = new Intent(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:028632500"));
            startActivity(i);
        } else if (v.getId() == R.id.mapbtn1) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.609421, 120.978383"));
            chooser = Intent.createChooser(i, "Choose Application for Map");
            startActivity(chooser);
        } else if (v.getId() == R.id.callbtn2) {
            i = new Intent(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:027323777"));
            startActivity(i);
        } else if (v.getId() == R.id.mapbtn2) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.613791, 120.980969"));
            chooser = Intent.createChooser(i, "Choose Application for Map");
            startActivity(chooser);
        } else if (v.getId() == R.id.callbtn3) {
            i = new Intent(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:027119491"));
            startActivity(i);
        } else if (v.getId() == R.id.mapbtn3) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.614077, 120.982024"));
            chooser = Intent.createChooser(i, "Choose Application for Map");
            startActivity(chooser);
        } else if (v.getId() == R.id.callbtn4) {
            i = new Intent(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:027338537"));
            startActivity(i);
        } else if (v.getId() == R.id.mapbtn4) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.606344, 120.983967"));
            chooser = Intent.createChooser(i, "Choose Application for Map");
            startActivity(chooser);
        } else if (v.getId() == R.id.callbtn5) {
            i = new Intent(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:027311631"));
            startActivity(i);
        } else if (v.getId() == R.id.mapbtn5) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.608161, 120.992426"));
            chooser = Intent.createChooser(i, "Choose Application for Map");
            startActivity(chooser);
        } else if (v.getId() == R.id.callbtn6) {
            i = new Intent(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:027313001"));
            startActivity(i);
        } else if (v.getId() == R.id.mapbtn6) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.611473, 120.990161"));
            chooser = Intent.createChooser(i, "Choose Application for Map");
            startActivity(chooser);
        } else if (v.getId() == R.id.callbtn7) {
            i = new Intent(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:025580888"));
            startActivity(i);
        } else if (v.getId() == R.id.mapbtn7) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.581925, 120.982955"));
            chooser = Intent.createChooser(i, "Choose Application for Map");
            startActivity(chooser);
        } else if (v.getId() == R.id.callbtn8) {
            i = new Intent(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:027114141"));
            startActivity(i);
        } else if (v.getId() == R.id.mapbtn8) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.625930, 120.988058"));
            chooser = Intent.createChooser(i, "Choose Application for Map");
            startActivity(chooser);
        }
    }
}