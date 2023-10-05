package com.example.helloworld.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.helloworld.R;

/**
 * @author fei
 * @since 2023/10/5
 */
public class MyFirstAdapter extends BaseAdapter {


    private final Context mContext;

    private final String[] itemArray;

    public MyFirstAdapter(Context context, String[] itemArray) {
        this.mContext = context;
        this.itemArray = itemArray;
    }

    @Override
    public int getCount() {
        return itemArray.length;
    }

    @Override
    public Object getItem(int i) {
        return itemArray[i];
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
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.tv_name.setText(itemArray[i]);
        return view;
    }

    public final class ViewHolder {
        public TextView tv_name;
    }
}
