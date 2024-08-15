package com.example.healthandfit.ui.food;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FoodViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public FoodViewModel() {
        mText = new MutableLiveData<>();
       // mText.setValue("This is food fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}