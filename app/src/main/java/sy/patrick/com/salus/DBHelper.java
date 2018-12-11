package sy.patrick.com.salus;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    final static String DBNAME = "CONTACTS_DB";
    final static int VER = 1;
    final static String TABLE = "details";

    public DBHelper(Context context){
        super(context,DBNAME,null,VER);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //Table Creation
        String createTable = "CREATE TABLE details (ID INTEGER PRIMARY KEY AUTOINCREMENT, Fname TEXT, Lname TEXT, Number TEXT)";
        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Changing Table or Datatype
        String dropTable = "DROP TABLE IF EXISTS details";
        db.execSQL(dropTable);
        onCreate(db);
    }

    public boolean insert(String fname, String lname, String number){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("Fname", fname);
        values.put("Lname", lname);
        values.put("Number", number);
        long isInserted = db.insert(TABLE, null, values);
        if(isInserted == -1){
            return false;
        } else {
            return true;
        }
    }

    public Cursor selectRecords(){
        SQLiteDatabase db = this.getReadableDatabase();
        return db.rawQuery("SELECT * FROM details", null);
    }



}
