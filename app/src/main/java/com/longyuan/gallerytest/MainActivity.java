package com.longyuan.gallerytest;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    protected RecyclerView mRecyclerView;

    RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<String> imageList = new ArrayList<>();


        imageList.add("R.drawable.mona_lisa");
        imageList.add("R.drawable.mona_lisa");
        imageList.add("R.drawable.mona_lisa");
        imageList.add("R.drawable.mona_lisa");
        imageList.add("R.drawable.mona_lisa");
        imageList.add("R.drawable.mona_lisa");
        imageList.add("R.drawable.mona_lisa");
        imageList.add("R.drawable.mona_lisa");
        imageList.add("R.drawable.mona_lisa");
        imageList.add("R.drawable.mona_lisa");
        imageList.add("R.drawable.mona_lisa");
        imageList.add("R.drawable.mona_lisa");
        imageList.add("R.drawable.mona_lisa");
        imageList.add("R.drawable.mona_lisa");
        imageList.add("R.drawable.mona_lisa");
        imageList.add("R.drawable.mona_lisa");
        imageList.add("R.drawable.mona_lisa");
        imageList.add("R.drawable.mona_lisa");
        imageList.add("R.drawable.mona_lisa");
        imageList.add("R.drawable.mona_lisa");
        imageList.add("R.drawable.mona_lisa");
        imageList.add("R.drawable.mona_lisa");
        imageList.add("R.drawable.mona_lisa");
        imageList.add("R.drawable.mona_lisa");
        imageList.add("R.drawable.mona_lisa");
        imageList.add("R.drawable.mona_lisa");
        imageList.add("R.drawable.mona_lisa");
        imageList.add("R.drawable.mona_lisa");
        imageList.add("R.drawable.mona_lisa");
        imageList.add("R.drawable.mona_lisa");
        imageList.add("R.drawable.mona_lisa");



        final ArrayList<Integer> imageListint = new ArrayList<>();


        imageListint.add(R.drawable.mona_lisa);
        imageListint.add(R.drawable.mona_lisa);
        imageListint.add(R.drawable.mona_lisa);
        imageListint.add(R.drawable.mona_lisa);
        imageListint.add(R.drawable.mona_lisa);
        imageListint.add(R.drawable.mona_lisa);
        imageListint.add(R.drawable.mona_lisa);
        imageListint.add(R.drawable.mona_lisa);
        imageListint.add(R.drawable.mona_lisa);
        imageListint.add(R.drawable.mona_lisa);
        imageListint.add(R.drawable.mona_lisa);
        imageListint.add(R.drawable.mona_lisa);
        imageListint.add(R.drawable.mona_lisa);
        imageListint.add(R.drawable.mona_lisa);
        imageListint.add(R.drawable.mona_lisa);
        imageListint.add(R.drawable.mona_lisa);
        imageListint.add(R.drawable.mona_lisa);



        MainAdapter mainAdapter = new MainAdapter(this,imageList);

        mainAdapter.setMainClickListener(new MainClickListener() {
            @Override
            public void onClick(View view, int position) {

                Bundle bundle = new Bundle();
                bundle.putIntegerArrayList("images", imageListint);
                bundle.putInt("position", position);

                FragmentTransaction ft = getFragmentManager().beginTransaction();
                SlideshowDialogFragment newFragment = SlideshowDialogFragment.newInstance();
                newFragment.setArguments(bundle);
                newFragment.show(ft, "slideshow");
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        });

        //
        mLayoutManager= new GridLayoutManager(this,4);

        //mLayoutManager= new LinearLayoutManager(this);

        mRecyclerView = (RecyclerView) findViewById(R.id.imageList);

        mRecyclerView.setLayoutManager(mLayoutManager);

        mRecyclerView.setAdapter(mainAdapter);


    }
}
