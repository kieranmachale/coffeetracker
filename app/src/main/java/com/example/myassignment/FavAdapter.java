package com.example.myassignment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FavAdapter extends RecyclerView.Adapter<FavAdapter.FavViewHolder> {

    String data[];
    Context cntxt;

    public FavAdapter(Context con, String favs[]){
        cntxt = con;
        data = favs;
    }

    @NonNull
    @Override
    public FavViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(cntxt);
        View favView = inflater.inflate(R.layout.favs_row, parent, false);
        return new FavViewHolder(favView);
    }

    @Override
    public void onBindViewHolder(@NonNull FavViewHolder holder, int position) {
        holder.favTextView.setText(data[position]);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class FavViewHolder extends RecyclerView.ViewHolder {

        TextView favTextView;

        public FavViewHolder(@NonNull View itemView) {
            super(itemView);
            favTextView = itemView.findViewById(R.id.textViewFavList);
        }
    }
}
