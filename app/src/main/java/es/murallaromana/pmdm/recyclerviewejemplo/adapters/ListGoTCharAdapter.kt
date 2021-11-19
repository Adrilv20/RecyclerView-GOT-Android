package es.murallaromana.pmdm.recyclerviewejemplo.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import es.murallaromana.pmdm.recyclerviewejemplo.R
import es.murallaromana.pmdm.recyclerviewejemplo.activities.DetailsActivity
import es.murallaromana.pmdm.recyclerviewejemplo.databinding.ItemGotcharListBinding
import es.murallaromana.pmdm.recyclerviewejemplo.models.entities.GoTChar

class ListGoTCharAdapter(val characters: List<GoTChar>) :
    RecyclerView.Adapter<ListGoTCharAdapter.GoTCharViewHolder>() {
    class GoTCharViewHolder(val itemBinding: ItemGotcharListBinding) : RecyclerView.ViewHolder(itemBinding.root) {
        private val context = itemBinding.root.context
        fun bind(character: GoTChar){
            with(itemBinding){
                tvFullName.setText(character.fullName())
                tvTitle.setText(character.title)
                tvFamily.setText(character.family)
                Picasso.get().load(character.imageUrl).into(iVImage)
                layoutItemGotchars.setOnClickListener {
                    val intent : Intent = Intent(context, DetailsActivity::class.java)
                    intent.putExtra("got_char", character)
                    context.startActivity(intent)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GoTCharViewHolder {
        val layoutInflater =
            LayoutInflater.from(parent.context)

        return GoTCharViewHolder(ItemGotcharListBinding.inflate(layoutInflater, parent, false))
    }

    override fun onBindViewHolder(holder: GoTCharViewHolder, position: Int) {
        val char = characters[position]
        holder.bind(char)
    }

    override fun getItemCount(): Int = characters.size
}