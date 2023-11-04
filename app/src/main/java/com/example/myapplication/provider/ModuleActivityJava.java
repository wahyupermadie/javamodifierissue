package com.example.myapplication.provider;

import com.example.myapplication.MainActivity;
import com.example.myapplication.MainViewModel;

/**
 * Created by putu.permadi on 04/11/23.
 */
public class ModuleActivityJava {

    public ModuleActivityJava(){}

    public MainViewModel provideMainActivity(MainActivity mainActivity) {
        return new MainViewModel(mainActivity);
    }
}
