package com.ryg.demo7_28.Dao;

import android.content.Context;

/**
 * Created by apple on 17/8/24.
 */

public class Initialization_data {

    private Context context;
    private DBadapter dBadapter;

    public Initialization_data(Context context){
        this.context = context;
        dBadapter = new DBadapter(this.context);

        data_lb();
        data_GridView();
        data_horizontialview();
        data_listview();
    }

    public void data_lb(){
//        dBadapter.gettable_name("lb");
//        dBadapter.getsql_create_table("create table lb(url varchar)");
        dBadapter.open();
        dBadapter.dosql("insert into lb(url) values('" + "http://pic30.nipic.com/20130626/8174275_085522448172_2.jpg" + "')");
        dBadapter.dosql("insert into lb(url) values('" + "http://pic18.nipic.com/20111215/577405_080531548148_2.jpg" + "')");
        dBadapter.dosql("insert into lb(url) values('" + "http://pic15.nipic.com/20110722/2912365_092519919000_2.jpg" + "')");
        dBadapter.close();
    }

    public void data_GridView(){
//        dBadapter.gettable_name("gridview");
//        dBadapter.getsql_create_table("create table gridview(text varchar,image varchar)");
        dBadapter.open();
        dBadapter.dosql("insert into gv(gv_text,gv_image) values('" + "Text1" + "','" + "ic_launcher" + "')");
        dBadapter.dosql("insert into gv(gv_text,gv_image) values('" + "Text2" + "','" + "ic_launcher" + "')");
        dBadapter.dosql("insert into gv(gv_text,gv_image) values('" + "Text3" + "','" + "ic_launcher" + "')");
        dBadapter.dosql("insert into gv(gv_text,gv_image) values('" + "Text4" + "','" + "ic_launcher" + "')");
        dBadapter.dosql("insert into gv(gv_text,gv_image) values('" + "Text5" + "','" + "ic_launcher" + "')");
        dBadapter.dosql("insert into gv(gv_text,gv_image) values('" + "Text6" + "','" + "ic_launcher" + "')");
        dBadapter.dosql("insert into gv(gv_text,gv_image) values('" + "Text7" + "','" + "ic_launcher" + "')");
        dBadapter.dosql("insert into gv(gv_text,gv_image) values('" + "Text8" + "','" + "ic_launcher" + "')");
        dBadapter.dosql("insert into gv(gv_text,gv_image) values('" + "Text9" + "','" + "ic_launcher" + "')");
        dBadapter.dosql("insert into gv(gv_text,gv_image) values('" + "Text10" + "','" + "ic_launcher" + "')");
        dBadapter.close();
    }

    public void data_horizontialview(){
//        dBadapter.gettable_name("horizontial");
//        dBadapter.getsql_create_table("create table horizontial(text varchar)");
        dBadapter.open();
        dBadapter.dosql("insert into hz(text) values('" + "1" + "')");
        dBadapter.dosql("insert into hz(text) values('" + "2" + "')");
        dBadapter.dosql("insert into hz(text) values('" + "3" + "')");
        dBadapter.dosql("insert into hz(text) values('" + "4" + "')");
        dBadapter.dosql("insert into hz(text) values('" + "5" + "')");
        dBadapter.dosql("insert into hz(text) values('" + "6" + "')");
        dBadapter.close();
    }

    public void data_listview(){
//        dBadapter.gettable_name("listview");
//        dBadapter.getsql_create_table("create table listview(text varchar,image varchar)");
        dBadapter.open();
        dBadapter.dosql("insert into lt(lt_text,lt_image) values('" + "TextView1" + "','" + "ic_launcher" + "')");
        dBadapter.dosql("insert into lt(lt_text,lt_image) values('" + "TextView2" + "','" + "ic_launcher" + "')");
        dBadapter.dosql("insert into lt(lt_text,lt_image) values('" + "TextView3" + "','" + "ic_launcher" + "')");
        dBadapter.dosql("insert into lt(lt_text,lt_image) values('" + "TextView4" + "','" + "ic_launcher" + "')");
        dBadapter.dosql("insert into lt(lt_text,lt_image) values('" + "TextView5" + "','" + "ic_launcher" + "')");
        dBadapter.dosql("insert into lt(lt_text,lt_image) values('" + "TextView6" + "','" + "ic_launcher" + "')");
        dBadapter.close();
    }

}
