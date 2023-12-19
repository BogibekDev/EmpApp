package dev.bogibek.karantinagentlik.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import dev.bogibek.karantinagentlik.R
import dev.bogibek.karantinagentlik.model.Link

class EmployeeLinkAdapter(private val links: ArrayList<Link>) :
    RecyclerView.Adapter<EmployeeLinkAdapter.LinkViewHolder>() {

    var itemClick: ((Link) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LinkViewHolder {
        val item = LayoutInflater.from(parent.context).inflate(R.layout.item_employee_links, parent, false)
        return LinkViewHolder(item)
    }

    override fun getItemCount(): Int = links.size


    override fun onBindViewHolder(holder: LinkViewHolder, position: Int) {
        val link = links[position]
        holder.apply {
            tvTitle.text = link.title
            root.setOnClickListener {
                itemClick?.invoke(link)
            }
        }
    }

    class LinkViewHolder(item: View) : RecyclerView.ViewHolder(item) {
        val root: CardView = item.findViewById(R.id.root)
        val tvTitle: TextView = item.findViewById(R.id.tv_title)
    }

}