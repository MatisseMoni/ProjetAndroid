//package com.example.projetandroidmonirivas
//
//import android.content.Context
//import android.util.Log
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.BaseAdapter
//import android.widget.ImageView
//import android.widget.TextView
//
//class CustomListAdapter(private val context: Context, private val listData: List<Actu>) :
//    BaseAdapter() {
//    private val layoutInflater: LayoutInflater
//    override fun getCount(): Int {
//        return listData.size
//    }
//
//    override fun getItem(position: Int): Any {
//        return listData[position]
//    }
//
//    override fun getItemId(position: Int): Long {
//        return position.toLong()
//    }
//
//    override fun getView(position: Int, convertView: View, parent: ViewGroup): View {
//        var convertView = convertView
//        val holder: ViewHolder
//        if (convertView == null) {
//            convertView = layoutInflater.inflate(R.layout.fragment_actu_1, null)
//            holder = ViewHolder()
//            holder.imageActuView = convertView.findViewById<View>(R.id.imageView_actu) as ImageView
//            holder.titreActuView = convertView.findViewById<View>(R.id.titreActu) as TextView
//            holder.descriptionActuView =
//                convertView.findViewById<View>(R.id.descriptionActu) as TextView
//            convertView.tag = holder
//        } else {
//            holder = convertView.tag as ViewHolder
//        }
//        val actu = listData[position]
//        holder.titreActuView!!.text = actu.getnomActu()
//        holder.descriptionActuView!!.text = "Description: " + actu.getdescriptionActu()
//        val imageId = getMipmapResIdByName(actu.getnomImage())
//        holder.imageActuView!!.setImageResource(imageId)
//        return convertView
//    }
//
//    // Find Image ID corresponding to the name of the image (in the directory mipmap).
//    fun getMipmapResIdByName(resName: String): Int {
//        val pkgName = context.packageName
//        // Return 0 if not found.
//        val resID = context.resources.getIdentifier(resName, "mipmap", pkgName)
//        Log.i("CustomListView", "Res Name: $resName==> Res ID = $resID")
//        return resID
//    }
//
//    internal class ViewHolder {
//        var imageActuView: ImageView? = null
//        var titreActuView: TextView? = null
//        var descriptionActuView: TextView? = null
//    }
//
//    init {
//        layoutInflater = LayoutInflater.from(context)
//    }
//}