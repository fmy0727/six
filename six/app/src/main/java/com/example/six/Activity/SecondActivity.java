package com.example.six.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;

import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import com.example.six.R;
import com.example.six.recyclerview.RvAdapter;
import com.example.six.recyclerview.RvData;
import com.example.six.viewpager.VpAdapter;

public class SecondActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<RvData> list = new ArrayList<>();
    private RvAdapter rvAdapter = new RvAdapter(list);
    private ViewPager viewPager;
    private List<View> list2 = new ArrayList<>();
    private VpAdapter vpAdapter = new VpAdapter(list2);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        recyclerView = findViewById(R.id.rv_demo);
        RecyclerView.LayoutManager layoutManager =
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(rvAdapter);

        list.add(new RvData("项目1"));
        list.add(new RvData("项目2"));
        list.add(new RvData("项目3"));
        list.add(new RvData("项目4"));
        list.add(new RvData("项目5"));
        list.add(new RvData("项目6"));
        list.add(new RvData("项目7"));
        list.add(new RvData("项目8"));
        list.add(new RvData("项目9"));
        list.add(new RvData("项目10"));
        list.add(new RvData("项目11"));
        list.add(new RvData("项目12"));

        rvAdapter.notifyDataSetChanged();
        viewPager = findViewById(R.id.vp_demo);

        list2.add(LayoutInflater.from(this).inflate(R.layout.item_vp_1, null, false));
        list2.add(LayoutInflater.from(this).inflate(R.layout.item_vp_2, null, false));
        list2.add(LayoutInflater.from(this).inflate(R.layout.item_vp_3, null, false));

        viewPager.setAdapter(vpAdapter);
    }
}
