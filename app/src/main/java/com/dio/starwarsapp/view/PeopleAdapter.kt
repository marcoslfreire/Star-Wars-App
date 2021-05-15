package com.dio.starwarsapp.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.dio.starwarsapp.domain.People
import com.dio.starwarsapp.R

class PeopleAdapter(private val listener: List<People>): RecyclerView.Adapter<PeopleAdapter.PeopleAdapterViewHolder>() {
    private val list: MutableList<People> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeopleAdapterViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_view_peoples, parent, false)
        return PeopleAdapterViewHolder(view, list, listener)
    }

    override fun onBindViewHolder(holder: PeopleAdapterViewHolder, position: Int) {
        holder.getPeoplesList(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun updatList(list:List<People>){
        this.list.clear()
        this.list.addAll(list)
        notifyDataSetChanged()
    }

    class PeopleAdapterViewHolder(itemView: View, var list: List<People>, var listener: List<People>): RecyclerView.ViewHolder(itemView){
        private val tvName: TextView = itemView.findViewById(R.id.textView_nome_people)
        private val homeWorld: TextView = itemView.findViewById(R.id.textView_homeworld_people)
        private val tvgener: TextView = itemView.findViewById(R.id.textView_gender_peole)
        private val tvBirthYear: TextView = itemView.findViewById(R.id.textView_birth_year)
        private  val ivImagePeople: ImageView = itemView.findViewById(R.id.iv_image_people)

        fun getPeoplesList(people: People){
            tvName.text = people.name
            homeWorld.text = people.homeworld
            tvgener.text = people.gender
            tvBirthYear.text = people.birth_year
            ivImagePeople
        }
    }
}