package android.dolbom.ark.fragmentinsidefragment.fragments.inner_fragments;

import android.dolbom.ark.fragmentinsidefragment.R;
import android.dolbom.ark.fragmentinsidefragment.adapter.RecyclerMyDataAdapter;
import android.dolbom.ark.fragmentinsidefragment.data.MyData;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by samsung on 2017-06-06.
 */

public class FirstInnerFragment extends Fragment {

    private ArrayList<MyData> arrayListOfMyData;
    private RecyclerView recyclerView;

    private RecyclerMyDataAdapter recyclerMyDataAdapter;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup parent, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.first_inner_fragment, parent, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        arrayListOfMyData = new ArrayList<>();

        for(int index = 0 ; index < 20 ; index++){
            MyData myData = new MyData("name" + index, ""+index);
            arrayListOfMyData.add(myData);
        }
        
        recyclerMyDataAdapter = new RecyclerMyDataAdapter(arrayListOfMyData);
        recyclerView.setAdapter(recyclerMyDataAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setHasFixedSize(true);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}
