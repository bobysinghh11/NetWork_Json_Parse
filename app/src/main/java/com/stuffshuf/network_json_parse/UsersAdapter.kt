package com.stuffshuf.network_json_parse

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.users_list.view.*

class UsersAdapter(val user:ArrayList<Item>):RecyclerView.Adapter<UsersAdapter.UsersViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UsersViewHolder {
        val li=parent.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view=li.inflate(R.layout.users_list, parent, false)
        return UsersViewHolder(view)
    }

    override fun getItemCount(): Int {
       return user.size
    }

    override fun onBindViewHolder(holder: UsersViewHolder, position: Int) {
        val userdata=user[position]
        holder.bind(userdata)
    }


    class UsersViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)
    {
        fun bind(item: Item)
        {
            with(itemView)
            {
             tvlogin.text=item.login
                tvId.text=item.id.toString()
                tvnode.text=item.node_id
            }
        }

    }
}