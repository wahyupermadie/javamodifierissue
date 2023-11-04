package com.example.myapplication;

/**
 * Created by putu.permadi on 04/11/23.
 */
public class MainViewModel {

    private final ClickListener clickListener;

    public MainViewModel(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    void click() {
        clickListener.handleViewClickBtnOne();
    }

}
