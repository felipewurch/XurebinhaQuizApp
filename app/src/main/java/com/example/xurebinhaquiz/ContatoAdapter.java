package com.example.xurebinhaquiz;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class ContatoAdapter extends BaseAdapter {
    private Context ctx;
    private List<Contato> list;

    public ContatoAdapter(Context ctx2,List<Contato> list2){
        ctx=ctx2;
        list=list2;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Contato getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = null;

        if(convertView==null){
            LayoutInflater inflater = ((Activity)ctx).getLayoutInflater();
            v=inflater.inflate(R.layout.activity_results,null);
        }else{
            v=convertView;
        }
        Contato c =getItem(position);

        TextView itemName = (TextView) v.findViewById(R.id.itemName);
        TextView p = (TextView) v.findViewById(R.id.p);
        TextView p2 = (TextView) v.findViewById(R.id.p2);
        TextView p3 = (TextView) v.findViewById(R.id.p3);
        TextView p4 = (TextView) v.findViewById(R.id.p4);
        TextView p5 = (TextView) v.findViewById(R.id.p5);
        TextView p6 = (TextView) v.findViewById(R.id.p6);

        itemName.setText(c.getNome());
        p.setText(c.getPorcentagemR());
        p2.setText(c.getPorcentagemI());
        p3.setText(c.getPorcentagemA());
        p4.setText(c.getPorcentagemS());
        p5.setText(c.getPorcentagemE());
        p6.setText(c.getPorcentagemC());

        return v;
    }
}
