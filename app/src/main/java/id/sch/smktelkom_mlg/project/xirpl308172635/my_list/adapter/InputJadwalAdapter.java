package id.sch.smktelkom_mlg.project.xirpl308172635.my_list.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xirpl308172635.my_list.R;
import id.sch.smktelkom_mlg.project.xirpl308172635.my_list.inputjadwal.InputJadwal;

/**
 * Created by Marissa Nur Aini on 12/3/2016.
 */
public class InputJadwalAdapter extends RecyclerView.Adapter<InputJadwalAdapter.ViewHolder> {
    ArrayList<InputJadwal> inputjadwalList;

    public InputJadwalAdapter(ArrayList<InputJadwal> inputjadwalList) {
        this.inputjadwalList = inputjadwalList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_jadwal, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        InputJadwal inputJadwal = inputjadwalList.get(position);
        holder.Judul.setText(inputJadwal.judul);

        holder.Foto.setImageDrawable(inputJadwal.foto);


    }

    @Override
    public int getItemCount() {
        if (inputjadwalList != null)
            return inputjadwalList.size();
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageButton Foto;
        TextView Judul;

        public ViewHolder(View itemView) {
            super(itemView);
            Foto = (ImageButton) itemView.findViewById(R.id.imageButton);
            Judul = (TextView) itemView.findViewById(R.id.textViewJudul);

        }
    }
}
