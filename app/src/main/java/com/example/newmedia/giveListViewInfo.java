package com.example.newmedia;
import android.os.Build;

import androidx.annotation.RequiresApi;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class giveListViewInfo {
    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String getDate() {
        LocalDate now = LocalDate.now();
        // 포맷 정의
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        // 포맷 적용
        String formatedNowDate = now.format(formatter);
        return formatedNowDate;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String getTime() {
        LocalTime now = LocalTime.now();
        // 포맷 정의
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm");
        // 포맷 적용
        String formatedNowTime = now.format(formatter);
        return formatedNowTime;
    }

}
