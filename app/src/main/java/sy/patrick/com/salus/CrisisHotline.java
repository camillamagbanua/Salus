package sy.patrick.com.salus;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CrisisHotline extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crisis_hotline);
        setTitle("Crisis Hotline");
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
            i.setData(Uri.parse("tel:028969191"));
            startActivity(i);
        }

        else if (v.getId() == R.id.callbtn2) {
            i = new Intent(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:09178549191"));
            startActivity(i);
        }

        else if (v.getId() == R.id.callbtn3) {
            i = new Intent(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:028044673"));
            startActivity(i);
        }

        else if (v.getId() == R.id.callbtn4) {
            i = new Intent(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:09175584673"));
            startActivity(i);
        }


    }
}
