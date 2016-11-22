package id.sch.smktelkom_mlg.project.xirpl308172635.my_list.jadwal2;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xirpl308172635.my_list.R;
import id.sch.smktelkom_mlg.project.xirpl308172635.my_list.jadwal.hari;

/**
 * Created by Marissa Nur Aini on 11/21/2016.
 */
public class hari2 extends RecyclerView.Adapter<hari2.ViewHolder> {
    ArrayList<hari> hariList;

    public hari2(ArrayList<hari> hariList) {
        this.hariList = hariList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.input_hari, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        hari Hari = hariList.get(position);
        holder.tvJudul.setText(hari.judul);
        holder.ivfoto.setImageDrawable(hari.foto);

    }

    @Override
    public int getItemCount() {
        if (hariList != null)
            return hariList.size();
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageButton ivfoto;
        TextView tvJudul;

        public ViewHolder(View itemView) {
            super(itemView);
            ivfoto = (ImageButton) itemView.findViewById(R.id.imageButton);
            tvJudul = (TextView) itemView.findViewById(R.id.textViewJudul);
        }
    }
}
