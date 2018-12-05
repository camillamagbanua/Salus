package sy.patrick.com.salus;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.AppTheme);
        setContentView(R.layout.activity_home_page);
    }

    public void process(View v) {
        Intent i = null, chooser = null;

        if (v.getId() == R.id.call911) {
            i = new Intent(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:911"));
            startActivity(i);
        }
    }

   public void fireOnClick(View v){
        Intent i = new Intent(this, FireEmergency.class);
        startActivity(i);
    }
  public void MedOnClick(View v){
        Intent i = new Intent(this, MedicalEmergency.class);
        startActivity(i);
    }
     public void CriminalOnClick(View v){
        Intent i = new Intent(this, CriminalEmergency.class);
        startActivity(i);
    }
 public void DisasterOnClick(View v){
        Intent i = new Intent(this, DisasterRelief.class);
        startActivity(i);
    }
   public void GovernmentOnClick(View v){
        Intent i = new Intent(this, GovernmentHotlines.class);
        startActivity(i);
    }
    public void CrisisOnClick(View v){
        Intent i = new Intent(this, CrisisHotline.class);
        startActivity(i);
    }
    public void EContactsOnClick(View v){
        Intent i = new Intent(this, EmergencyContacts.class);
        startActivity(i);
    }


}
