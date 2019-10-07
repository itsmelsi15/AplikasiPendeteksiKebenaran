package com.example.studikasus;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FragmentSatu extends Fragment {
    //membuat variable global
    View malia;
    EditText editText;
    TextView textView;
    Button btn;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //cara untuk memanggil tampilan fragment
        malia = inflater.inflate(R.layout.activity_fragment_satu, container, false);
        editText = malia.findViewById(R.id.editText1);
        textView = malia.findViewById(R.id.textView1);
        btn = malia.findViewById(R.id.button1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //inputan sudah diambil dari variabel input
                String input = editText.getText().toString();

                //merubah variable menjadi huruf kecil semuanya
                input = input.toLowerCase();

                //cara membuat array (variabel bersusun)
                String[] arrayInput = input.split(" ");
                String hasil = "";

                //for (int i = 0; i < arrayInput.length; i++){ //membuat variable indeks 0, berulang selama kurang dari panjang indeks array, berulang krn bertambah 1
                   // System.out.println(arrayInput[i]);

                //}

                for (int i = arrayInput.length-1; i > 0; i--  ){
                    System.out.println(arrayInput[i]);
                    if (arrayInput[i].equals("bohong")){
                        arrayInput[i-1] = invers(arrayInput[i-1]);
                    }
                    hasil = arrayInput[0];

                }

                //hasil yg ditampilkan
                textView.setText(hasil);

            }
        });

        return malia;
    }

    //funsgi di dalam kelas diluar method
    //fungsi pembalik input string
    public String invers (String inputan) {
        String result = "";
        if (inputan.equals("bohong"))//.equals khusus string
        {
            result = "jujur";
        }
        else {
            result = "bohong";
        }

        return result;
    }
}
