package com.example.healthandfit.ui.Remedies;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RemediesViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public RemediesViewModel() {
        mText = new MutableLiveData<>();
       // mText.setValue("This is remedies fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}