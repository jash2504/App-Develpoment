package com.example.datetimedemo.fragments;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.TimePicker;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import java.text.DateFormat;
import java.util.Calendar;

public class TimePickerFragment  extends DialogFragment implements TimePickerDialog.OnTimeSetListener {


    private EditText editText;


    public TimePickerFragment(EditText editText){
            this.editText=editText;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        
        final Calendar c= Calendar.getInstance();
        int hour=c.get(Calendar.HOUR_OF_DAY);
        int minute=c.get(Calendar.MINUTE);

        return new TimePickerDialog(getActivity(),this,hour,minute, DateFormat.getTimeInstance().isLenient());

    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        editText.setText(hourOfDay+":"+minute);
    }
}
