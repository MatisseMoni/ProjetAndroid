package com.example.projetandroidmonirivas;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class CustomListAdapter  extends BaseAdapter {

    private List<Actu> listData;
    private LayoutInflater layoutInflater;
    private Context context;

    public CustomListAdapter(Context aContext,  List<Actu> listData) {
        this.context = aContext;
        this.listData = listData;
        layoutInflater = LayoutInflater.from(aContext);
    }

    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.fragment_actu_1, null);
            holder = new ViewHolder();
            holder.imageActuView = (ImageView) convertView.findViewById(R.id.imageView_actu);
            holder.titreActuView = (TextView) convertView.findViewById(R.id.titreActu);
            holder.descriptionActuView = (TextView) convertView.findViewById(R.id.descriptionActu);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Actu actu = this.listData.get(position);
        holder.titreActuView.setText(actu.getnomActu());
        holder.descriptionActuView.setText("Population: " + actu.getdescriptionActu());

        int imageId = this.getMipmapResIdByName(actu.getnomImage());

        holder.imageActuView.setImageResource(imageId);

        return convertView;
    }

    // Find Image ID corresponding to the name of the image (in the directory mipmap).
    public int getMipmapResIdByName(String resName)  {
        String pkgName = context.getPackageName();
        // Return 0 if not found.
        int resID = context.getResources().getIdentifier(resName , "mipmap", pkgName);
        Log.i("CustomListView", "Res Name: "+ resName+"==> Res ID = "+ resID);
        return resID;
    }

    static class ViewHolder {
        ImageView imageActuView;
        TextView titreActuView;
        TextView descriptionActuView;
    }

}