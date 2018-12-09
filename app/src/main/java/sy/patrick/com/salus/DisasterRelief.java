package sy.patrick.com.salus;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DisasterRelief extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disaster_relief);
        setTitle("Disaster Relief");
    }

    public void process(View v) {
        Intent i = null, chooser = null;

        if (v.getId() == R.id.call911) {
            i = new Intent(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:911"));
            startActivity(i);
        }

        else if (v.getId() == R.id.callbtn3) {
            i = new Intent(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:024211918"));
            startActivity(i);
        }

        else if (v.getId() == R.id.callbtn4) {
            i = new Intent(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:0726076528"));
            startActivity(i);
        }

        else if (v.getId() == R.id.callbtn5) {
            i = new Intent(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:0495317266"));
            startActivity(i);
        }

        else if (v.getId() == R.id.callbtn6) {
            i = new Intent(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:143"));
            startActivity(i);
        }

        else if (v.getId() == R.id.callbtn7) {
            i = new Intent(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:134"));
            startActivity(i);
        }
    }
}
