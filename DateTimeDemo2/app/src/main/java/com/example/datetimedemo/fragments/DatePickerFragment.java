package com.example.datetimedemo.fragments;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import java.util.Calendar;

public class DatePickerFragment  extends DialogFragment implements DatePickerDialog.OnDateSetListener {


    private EditText editText;


    public DatePickerFragment(EditText editText){
        this.editText=editText;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        final Calendar c= Calendar.getInstance();
        int year=c.get(Calendar.YEAR);
        int month=c.get(Calendar.MONTH);
        int day=c.get(Calendar.DAY_OF_MONTH);


        return new DatePickerDialog(requireContext(),this,year,month,day);

    }

    @Override
    public void onDateSet(DatePicker view, int year, int month,int day) {
        editText.setText(day+"-"+(month+1)+"-"+year);
    }

}
