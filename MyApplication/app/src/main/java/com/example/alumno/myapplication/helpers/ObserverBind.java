package com.example.alumno.myapplication.helpers;

import android.util.Log;
import  java.util.Observable;
import java.util.Observer;

public class ObserverBind implements Observer {
    private Callback callback;

    @Override
    public  void update(Observable o, Object arg){
        Log.v("bichito", "Update <<<<<");
        if (this.callback!=null){
            this.callback.doThis(o, arg);
        }
    }

    public void setCallback(Callback callback) {
        this.callback = callback;
    }
}
