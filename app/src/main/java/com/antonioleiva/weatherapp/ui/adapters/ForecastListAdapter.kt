package com.antonioleiva.weatherapp.ui.adapters

import android.annotation.SuppressLint
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView
import com.antonioleiva.weatherapp.domain.model.ForecastList

class ForecastListAdapter(private val weekForecast: ForecastList)
    : RecyclerView.Adapter<ForecastListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            ViewHolder(TextView(parent.context))

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(weekForecast[position]) {
            holder.textView.text = "$date - $description - $high/$low"
        }
    }

    override fun getItemCount(): Int = weekForecast.size

    class ViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)
}