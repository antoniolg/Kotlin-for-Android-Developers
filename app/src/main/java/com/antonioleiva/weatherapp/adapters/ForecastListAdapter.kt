package com.antonioleiva.weatherapp.adapters

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView
import org.jetbrains.anko.text

public class ForecastListAdapter(val items: List<String>) : RecyclerView.Adapter<ForecastListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ForecastListAdapter.ViewHolder? {
        return ViewHolder(TextView(parent.context))
    }

    override fun onBindViewHolder(holder: ForecastListAdapter.ViewHolder, position: Int) {
        holder.textView.text = items.get(position)
    }

    override fun getItemCount(): Int = items.size()

    class ViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)
}