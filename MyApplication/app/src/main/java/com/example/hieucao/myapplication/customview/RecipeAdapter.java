package com.example.hieucao.myapplication.customview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hieucao.myapplication.R;
import com.example.hieucao.myapplication.bean.Recipe;

import java.util.ArrayList;

/**
 * Created by hieucao on 5/22/17.
 */

public class RecipeAdapter extends BaseAdapter {
    private Context mContext;
    private LayoutInflater mInflater;
    private ArrayList<Recipe> mDataSource;

    public RecipeAdapter(Context context, ArrayList<Recipe> items) {
        mContext = context;
        mDataSource = items;
        mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return mDataSource.size();
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View rowView = mInflater.inflate(R.layout.list_view_item, parent, false);

        Recipe obj = mDataSource.get(position);
        ImageView img = (ImageView) rowView.findViewById(R.id.imgListItem);
        //set image

        TextView txtTitle = (TextView) rowView.findViewById(R.id.txtTitleListItem);
        txtTitle.setText(obj.getTitle());

        TextView txtDetail = (TextView) rowView.findViewById(R.id.txtDetailListItem);
        txtDetail.setText(obj.getDetail());

        return rowView;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return mDataSource.get(position);
    }
}
