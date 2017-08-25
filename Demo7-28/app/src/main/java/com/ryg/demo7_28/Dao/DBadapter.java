package com.ryg.demo7_28.Dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by apple on 17/8/24.
 */

public class DBadapter {
    //调用该方法的上下文
    private Context context;
    //sqlite对象
    SQLiteDatabase db;
    //内部类，用于创建表与对应的版本控制
    DatabaseHelper databaseHelper;

    /**
     * 构造函数，获取调用该类的上下文，并创建内部类DatabaseHelper的对象
     * @param context
     */
    public DBadapter(Context context){
        this.context = context;
        databaseHelper = new DatabaseHelper(this.context);
    }

    /**
     * 对于表的创建处理
     */
    private class DatabaseHelper extends SQLiteOpenHelper{
        public DatabaseHelper(Context context) {
            super(context,"MYDE",null,1);
        }

        /**
         * 执行sql语句创建表
         * @param db
         */
        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL("create table lb(url varchar)");
            db.execSQL("create table gv(gv_text varchar,gv_image varchar)");
            db.execSQL("create table hz(text varchar)");
            db.execSQL("create table lt(lt_text varchar,lt_image varchar)");
        }

        /**
         * 如果表一存在会删除之前的表并重新调用创建表的方法
         * @param db
         * @param oldVersion
         * @param newVersion
         */
        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("drop table if exists lb");
            db.execSQL("drop table if exists gv");
            db.execSQL("drop table if exists horizontial");
            db.execSQL("drop table if exists listview");
            onCreate(db);
        }
    }

    /**
     * 开启SQLite
     * @return
     */
    public DBadapter open(){
        db = databaseHelper.getWritableDatabase();
        return this;
    }

    /**
     * 关闭SQLite
     */
    public void close(){
        databaseHelper.close();
    }

    /**
     * 执行sql语句
     * @param sql
     */
    public void dosql(String sql){
        db.execSQL(sql);
    }

    /**
     * 执行查询语句并返回Cursor类型的值
     * @param sql
     * @return
     */
    public Cursor selectsql(String sql){
        Cursor cursor = db.rawQuery(sql,null);
        return cursor;
    }

}
