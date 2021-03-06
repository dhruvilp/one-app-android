package org.hackru.oneapp.hackru.ui.main.announcements

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.rv_item_announcement.view.*
import org.hackru.oneapp.hackru.R
import org.hackru.oneapp.hackru.api.models.AnnouncementsModel

class AnnouncementsAdapter : RecyclerView.Adapter<AnnouncementsAdapter.ViewHolder>() {
    val TAG = "AnnouncementsAdapter"

    var items: List<AnnouncementsModel.Announcement> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun getItemCount() = items.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.rv_item_announcement, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.announcement_text.text = items[position].text
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val announcement_text: TextView = itemView.announcement_text
    }
}