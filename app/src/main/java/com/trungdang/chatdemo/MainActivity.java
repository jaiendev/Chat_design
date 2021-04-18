package com.trungdang.chatdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.PrimitiveIterator;

public class MainActivity extends AppCompatActivity implements itemswipe{
    private RecyclerView recyclerView;
    private TinnhanAdapter tinnhanAdapter;
    private ArrayList<tinnhan> tinnhanList;
    private int[] tabIcons = {
        R.drawable.ic_baseline_explore_24,R.drawable.ic_baseline_group_24,R.drawable.ic_baseline_chat_24,R.drawable.ic_baseline_insert_emoticon_24,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerview);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        tinnhanList=new ArrayList<>();
        tinnhanList.add(new tinnhan(R.drawable.av1,"Naruto","Sasuke !!","12:12","2"));
        tinnhanList.add(new tinnhan(R.drawable.av2,"Goku","Vegeta !!","1:56","3"));
        tinnhanList.add(new tinnhan(R.drawable.av3,"Meliodas","Bùn ngủ !!","4:56","5"));
        tinnhanAdapter=new TinnhanAdapter(tinnhanList,this);
        recyclerView.setAdapter(tinnhanAdapter);

        ItemTouchHelper.SimpleCallback simpleCallback=new swipeitemreyclerview(0,ItemTouchHelper.LEFT,this);
        new ItemTouchHelper(simpleCallback).attachToRecyclerView(recyclerView);
    }

    @Override
    public void onSwipe(RecyclerView.ViewHolder viewHolder) {

    }
}