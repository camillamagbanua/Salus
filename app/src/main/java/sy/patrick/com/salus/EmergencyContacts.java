package sy.patrick.com.salus;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class EmergencyContacts extends AppCompatActivity {

    EditText Fname, Lname, Contact;
    TextView contitle1, condetail1;
    Button save;
    DBHelper helper;
    Cursor res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_contacts);
        setTitle("Emergency Contacts");

        helper = new DBHelper(this);
        res = helper.selectRecords();

        Fname = findViewById(R.id._txtFname);
        Lname = findViewById(R.id._txtLname);
        Contact = findViewById(R.id._txtContact);

        contitle1 = findViewById(R.id.title1);
        condetail1 = findViewById(R.id.detail1);

        save = findViewById(R.id.btnSave);
        if(res.moveToFirst())
        {
            display();
            disabled();
        }
    }

    public void insertRecord(View v){
        String firstname1 = Fname.getText().toString().trim();
        String lastname1 = Lname.getText().toString().trim();
        String contnum1 = Contact.getText().toString();
        boolean isInserted = helper.insert(firstname1, lastname1, contnum1);
        if (isInserted == true) {
            Toast.makeText(this, "Record Saved...", Toast.LENGTH_LONG).show();

            contitle1.setText(firstname1 + " " + lastname1);
            condetail1.setText(contnum1);
            disabled();
        } else {
            Toast.makeText(this, "Failed Saving Record...", Toast.LENGTH_LONG).show();
        }

    }

    public void display(){

            res.moveToFirst();
            String fname = res.getString(1);
            String lname = res.getString(2);
            String num = res.getString(3);
            String name = fname + " " + lname;
            contitle1.setText(name);
            condetail1.setText(num);

    }

    public void disabled(){

        Fname.setEnabled(false);
        Lname.setEnabled(false);
        Contact.setEnabled(false);
        save.setEnabled(false);

    }

    public void process(View v) {
        Intent i = null, chooser = null;

        if (v.getId() == R.id.callbtn1) {
            i = new Intent(Intent.ACTION_DIAL);
            String number = (String) condetail1.getText();
            i.setData(Uri.parse("tel:" + number));
            startActivity(i);
        }
    }


}
