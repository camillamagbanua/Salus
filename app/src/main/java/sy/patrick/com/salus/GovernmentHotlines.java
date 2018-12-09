package sy.patrick.com.salus;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GovernmentHotlines extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_government_hotlines);
        setTitle("Government Hotlines");
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
            i.setData(Uri.parse("tel:09176279627"));
            startActivity(i);
        }

        else if (v.getId() == R.id.callbtn2) {
            i = new Intent(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:711"));
            startActivity(i);
        }

        else if (v.getId() == R.id.callbtn3) {
            i = new Intent(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:024260219"));
            startActivity(i);
        }

        else if (v.getId() == R.id.callbtn4) {
            i = new Intent(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:025273877"));
            startActivity(i);
        }

        else if (v.getId() == R.id.callbtn5) {
            i = new Intent(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:136"));
            startActivity(i);
        }

        else if (v.getId() == R.id.callbtn6) {
            i = new Intent(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:1342"));
            startActivity(i);
        }

        else if (v.getId() == R.id.callbtn7) {
            i = new Intent(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:7890"));
            startActivity(i);
        }

        else if (v.getId() == R.id.callbtn8) {
            i = new Intent(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:9229061"));
            startActivity(i);
        }
    }
}
