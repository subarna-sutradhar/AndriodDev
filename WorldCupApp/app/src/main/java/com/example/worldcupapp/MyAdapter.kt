package com.example.worldcupapp

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintSet.Layout
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import java.util.zip.Inflater

class MyAdapter(private var activity: Activity, private var items:ArrayList<CountryModel>) : BaseAdapter(){
    override fun getCount(): Int {
        //return count of the items in the list view
        return items.size
    }

    override fun getItem(p0: Int): CountryModel {
        //returns any items from the list that you provide the pos
        return items[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(position: Int, convertView: View?, p2: ViewGroup?): View {
        //use an adapter for generating items view for a list ,recycler and etc views
        val view:View?
        val viewHolder: ViewHolder


        if (convertView==null){

            //casting inflater as layout inflater
            val inflater = activity?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

            //inflate means display
            view = inflater.inflate(R.layout.list_item_layout, null)

            viewHolder = ViewHolder(view)
            view?.tag = viewHolder
        }else{

            //convertview is for recycling
            view = convertView
            viewHolder = view.tag as ViewHolder
        }

        var countries = items[position]
        viewHolder.txtName?.text = countries.name
        viewHolder.txtCupWin?.text = countries.cupWins
        viewHolder.flagImg?.setImageResource(countries.flag_img)

        return view as View
    }

    private class ViewHolder(row:View?){
        var txtName: TextView? = null
        var txtCupWin:TextView? = null
        var flagImg:ImageView? = null


        init {
            this.txtName = row?.findViewById(R.id.countryname)
            this.txtCupWin = row?.findViewById(R.id.cupWinsTxt)
            this.flagImg = row?.findViewById(R.id.imageview)


        }
    }

}