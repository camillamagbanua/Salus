package sy.patrick.com.salus;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class EmergencyContacts extends AppCompatActivity {

    EditText Fname, Lname, Contact;
    TextView contitle1, condetail1;
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

        if(res.getCount()>0)
        {
            display();
        }
    }

    public void insertRecord(View v){
        if(res.getCount()<=2)
        {
            String firstname = Fname.getText().toString().trim();
            String lastname = Lname.getText().toString().trim();
            String contnum = Contact.getText().toString();
            boolean isInserted = helper.insert(firstname,lastname,contnum);
            if(isInserted == true){
                Toast.makeText(this,"Record Saved...", Toast.LENGTH_LONG).show();
                contitle1.setText(firstname + " " + lastname);
                condetail1.setText(contnum);
            } else {
                Toast.makeText(this,"Failed Saving Record...", Toast.LENGTH_LONG).show();
            }
        }
        else
        {
            Toast.makeText(this,"Contacts Full!", Toast.LENGTH_LONG).show();
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


}
