package com.example.test20191211;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
public  class   DataSet {
    double[] values = {500.00, 800.00, 1000.00, 900.00};
    double sumVal = values[0] + values[1] + values[2] + values[3];

    CategorySeries dataset = buildCategoryDataset("图文报表", values);

    protected CategorySeries buildCategoryDataset(String title, double[] values) {
        CategorySeries series = new CategorySeries(title);
        series.add("房租:" + values[0], values[0] / sumVal);
        series.add("伙食费:" + values[1], values[1] / sumVal);
        series.add("生活费:" + values[2], values[2] / sumVal);
        series.add("其它:" + values[3], values[3] / sumVal);
        return series;

    }
}
