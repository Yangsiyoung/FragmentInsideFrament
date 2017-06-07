package android.dolbom.ark.fragmentinsidefragment.adapter;

import android.content.Context;
import android.dolbom.ark.fragmentinsidefragment.R;
import android.dolbom.ark.fragmentinsidefragment.data.MyData;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by samsung on 2017-06-07.
 */

public class RecyclerMyDataAdapter extends  RecyclerView.Adapter<RecyclerMyDataAdapter.ViewHolder>{


    private ArrayList<MyData> arrayListOfMyData;

    public RecyclerMyDataAdapter(ArrayList<MyData> arrayListOfMyData){
        this.arrayListOfMyData = arrayListOfMyData;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();

        LayoutInflater layoutInflater = LayoutInflater.from(context);

        View myDataView = layoutInflater.inflate(R.layout.mydata_list_layout, parent, false);

        ViewHolder viewHolder = new ViewHolder(myDataView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        MyData myData = arrayListOfMyData.get(position);

        TextView txtName = holder.txtName;
        TextView txtAge = holder.txtAge;

        txtName.setText(myData.name);
        txtAge.setText(myData.age);
    }

    @Override
    public int getItemCount() {
        return arrayListOfMyData.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView txtName;
        public TextView txtAge;
        public ViewHolder(View itemView){
            super(itemView);
            txtName = (TextView) itemView.findViewById(R.id.txtName);
            txtAge = (TextView) itemView.findViewById(R.id.txtAge);

        }
    }
}
