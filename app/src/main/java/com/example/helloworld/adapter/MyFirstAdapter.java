package com.example.helloworld.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.helloworld.R;
import com.example.helloworld.bean.ListPatternBase;

import java.util.List;

/**
 * @author fei
 * @since 2023/10/5
 */
public class MyFirstAdapter extends BaseAdapter {


    private final Context mContext;

    private final List<ListPatternBase> patternBaseList;

    public MyFirstAdapter(Context context, List<ListPatternBase> patternBaseList) {
        this.mContext = context;
        this.patternBaseList = patternBaseList;
    }

    @Override
    public int getCount() {
        return patternBaseList.size();
    }

    @Override
    public Object getItem(int i) {
        return patternBaseList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view == null) {
            viewHolder = new ViewHolder();
            view = LayoutInflater.from(mContext).inflate(R.layout.list_pattern_base, null);
            viewHolder.tv_name = view.findViewById(R.id.lpb_tv_item1);
            viewHolder.iv_name = view.findViewById(R.id.lpb_iv_item1);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.tv_name.setText(patternBaseList.get(i).getTextMessage1());
//        viewHolder.iv_name.setImageResource(patternBaseList.get(i).getImage());
        viewHolder.iv_name.setImageDrawable(patternBaseList.get(i).getDrawableImage());
        return view;
    }

    public final class ViewHolder {
        public TextView tv_name;
        public ImageView iv_name;
    }
}
