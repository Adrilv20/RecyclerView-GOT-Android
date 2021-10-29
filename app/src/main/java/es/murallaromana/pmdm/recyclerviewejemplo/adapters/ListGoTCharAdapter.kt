package es.murallaromana.pmdm.recyclerviewejemplo.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import es.murallaromana.pmdm.recyclerviewejemplo.R
import es.murallaromana.pmdm.recyclerviewejemplo.models.entities.GoTChar

class ListGoTCharAdapter(val characters: List<GoTChar>) :
    RecyclerView.Adapter<ListGoTCharAdapter.GoTCharViewHolder>() {
    class GoTCharViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvFullname = itemView.findViewById<TextView>(R.id.tvFullName)
        val tvTitle = itemView.findViewById<TextView>(R.id.tvTitle)
        val tvFamily = itemView.findViewById<TextView>(R.id.tvFamily)
        val iVImage = itemView.findViewById<ImageView>(R.id.iVImage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GoTCharViewHolder {
        val layoutInflater =
            LayoutInflater.from(parent.context).inflate(R.layout.item_gotchar_list, parent, false);

        return GoTCharViewHolder(layoutInflater)
    }

    override fun onBindViewHolder(holder: GoTCharViewHolder, position: Int) {
        val personaje = characters[position]
        with(holder) {
            tvFullname.setText(personaje.fullName())
            tvTitle.setText(personaje.title)
            tvFamily.setText(personaje.title)
        }
    }

    override fun getItemCount(): Int = characters.size
}