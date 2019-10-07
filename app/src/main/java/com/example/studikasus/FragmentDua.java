package com.example.studikasus;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentDua extends Fragment {
    //membuat variable view atas nama sendiri
    View malia;

    @Nullable
    @Override
    //membuat methode
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //cara untuk memanggil tampilan fragment
        malia = inflater.inflate(R.layout.activity_fragment_dua, container, false);
        return malia;
    }
}
