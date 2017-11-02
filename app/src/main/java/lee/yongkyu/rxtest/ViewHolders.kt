package lee.yongkyu.rxtest

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.card_layout.view.*

class ViewHolders(itemView: View) : RecyclerView.ViewHolder(itemView)/*, View.OnClickListener*/ {

    var countryName: TextView
    var countryPhoto: ImageView

    init {
        //itemView.setOnClickListener(this)
        //countryName = itemView.findViewById(R.id.country_name) as TextView
        countryName = itemView.country_name;
        //countryPhoto = itemView.findViewById(R.id.country_photo) as ImageView
        countryPhoto = itemView.country_photo;
    }
/*
    override fun onClick(view: View) {
        Toast.makeText(view.context, "Clicked Position = " + position, Toast.LENGTH_SHORT).show()
    }*/
}
