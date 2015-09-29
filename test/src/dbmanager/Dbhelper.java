package dbmanager;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class Dbhelper extends SQLiteOpenHelper {
	
	private static final String DB_NAME = "mydata.db"; //数据库名称

    private static final int version = 1; //数据库版本

    
    
	public Dbhelper(Context context, String name, CursorFactory factory,
			int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}


	
    public void onCreate1(SQLiteDatabase db) {

        String sql = "create table user(username varchar(20) not null , password varchar(60) not null );";          

        db.execSQL(sql);

    }

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
