package com.example.newmedia;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class historybottomnavi extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.history1, container, false);

        ListView listView = rootView.findViewById(R.id.listview);
        /*
        String[] datetext = {"2023.12.03", "2023.12.07", "2023.12.10", "2023.12.13", "2023.12.15", "2023.12.20", "2023.12.30", "2023.12.31", "2024.01.01"};
        String[] dailytext = {"I", "sample", "sample", "sample", "sample", "sample", "sample", "sample"};
        int[] dailyimg = {R.drawable.sample_img, R.drawable.sample_img, R.drawable.sample_img, R.drawable.sample_img, R.drawable.sample_img, R.drawable.sample_img, R.drawable.sample_img, R.drawable.sample_img, R.drawable.sample_img};
        String[] timetext = {"sample AM", "sample AM", "sample AM", "sample AM", "sample AM", "sample AM", "sample AM", "sample AM", "sample PM"};


         */
        ArrayList<String> datetext = new ArrayList<>();
        ArrayList<String> dailytext = new ArrayList<>();
        ArrayList<Integer> dailyimg = new ArrayList<>();
        ArrayList<String> timetext = new ArrayList<>();
        ImageButton check = rootView.findViewById(R.id.CheckButton);
        EditText dailystory = rootView.findViewById(R.id.storyedittext);

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    datetext.add(giveListViewInfo.getDate());
                }
                String story = dailystory.getText().toString();
                dailytext.add(story);
                dailyimg.add(R.drawable.sample_img);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    timetext.add(giveListViewInfo.getTime());
                }
                listadapter finallistadapter = new listadapter(getActivity(), datetext, dailytext, dailyimg, timetext);
                listView.setAdapter(finallistadapter);
            }
        });


        return rootView;
    }
}
