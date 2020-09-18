package com.example.myfunction;

import android.app.DatePickerDialog;
import android.content.Context;
import android.graphics.Color;
import android.widget.TextView;
import android.widget.Toast;

import java.time.Year;
import java.util.Calendar;

public class MyFunctions {
    public  static Toast toast;
    public  static Context context;

    public  static  void showToast(Context context ,String msg){
        if(toast==null){
            toast=Toast.makeText(context,text="",Toast.LENGTH_SHORT);
        }
        toast.setText(msg);
        toast.show();
    }
    public static void getDate(Context context, final TextView textView){
    Calendar calendar =Calendar.getInstance();
    new DatePickerDialog(context,(view,year,month,datOfMonth)->{
        textView.setTextColor((Color.BLUE);
        textView.setText(""+year+"/"+(month+1)+"/"+datOfMonth);
    },calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),
    calendar.get(Calendar.DAY_OF_MONTH)).show();

    }


}
