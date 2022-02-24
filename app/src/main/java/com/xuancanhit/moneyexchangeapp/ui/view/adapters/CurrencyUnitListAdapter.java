package com.xuancanhit.moneyexchangeapp.ui.view.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.xuancanhit.moneyexchangeapp.CurrencyUnitUpdateDataActivity;
import com.xuancanhit.moneyexchangeapp.R;
import com.xuancanhit.moneyexchangeapp.models.CurrencyUnit;
import com.xuancanhit.moneyexchangeapp.ui.interfaces.ItemClickListener;

import java.util.List;

public class CurrencyUnitListAdapter extends RecyclerView.Adapter<CurrencyUnitListAdapter.CurrencyUnitViewHolder> {

    //Form for adapter
    Context context;
    List<CurrencyUnit> list;

    public CurrencyUnitListAdapter(Context context, List<CurrencyUnit> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public CurrencyUnitViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_currency_unit, parent, false);
        return new CurrencyUnitViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull CurrencyUnitViewHolder holder, int position) {
        CurrencyUnit currencyUnit = list.get(position);

        String c_name = currencyUnit.getName();
        Double c_value = currencyUnit.getValue();



        holder.tvCurName.setText(c_name);
        holder.tvCurValue.setText(String.valueOf(c_value));

        //Click for RecycleView
        holder.setItemClickListener((view, position1, isLongClick) -> {
            if (isLongClick) {
                Toast.makeText(context, "CurrencyUnit: " + currencyUnit.getName(), Toast.LENGTH_SHORT).show();
            } 
            else {
                Intent intent = new Intent(view.getContext(), CurrencyUnitUpdateDataActivity.class);
                intent.putExtra("RATE_DATA", currencyUnit);
                view.getContext().startActivity(intent);
                ((Activity)view.getContext()).finish();
            }
        });
    }

    @Override
    public int getItemCount() {
        return list == null ? 0 : list.size();
    }

    //Data ViewHolder class
    public static class CurrencyUnitViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {
        ImageView ivStuAvt;
        TextView tvCurName, tvCurValue;

        ItemClickListener itemClickListener;



        public CurrencyUnitViewHolder(@NonNull View itemView) {
            super(itemView);
            tvCurName = itemView.findViewById(R.id.tv_cur_name);
            tvCurValue = itemView.findViewById(R.id.tv_cur_value);
  

            //Turn On Click for RecycleView
            itemView.setOnClickListener(this);
            itemView.setOnLongClickListener(this);
        }


        public void setItemClickListener(ItemClickListener itemClickListener) {
            this.itemClickListener = itemClickListener;
        }

        //onClick for RecycleView
        @Override
        public void onClick(View v) {
            itemClickListener.onClick(v, getAdapterPosition(), false);
        }

        //onLongClick for RecycleView
        @Override
        public boolean onLongClick(View v) {
            itemClickListener.onClick(v, getAdapterPosition(), true);
            return true;
            //return false; // if not use
        }
    }
}