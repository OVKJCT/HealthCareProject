package com.example.healthcareproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.healthcareproject.databinding.ActivityBodyCheckBinding
import com.example.healthcareproject.databinding.ActivityDisease5Binding

class TodoListAdapter (val itemlist: ArrayList<TodoListData>) :

        RecyclerView.Adapter<TodoListAdapter.TODOViewHolder>() {

        override fun onCreateViewHolder(
                parent: ViewGroup,
                viewType: Int
        ): TodoListAdapter.TODOViewHolder {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.item_todolist, parent, false)
                return TODOViewHolder(view)
        }

        override fun onBindViewHolder(holder: TodoListAdapter.TODOViewHolder, position: Int) {
                holder.list123123.text = itemlist[position].content
        }

        override fun getItemCount(): Int {
                return itemlist.count()
        }

        inner class TODOViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
                val list123123 = itemView.findViewById<TextView>(R.id.list123123)
        }

        }