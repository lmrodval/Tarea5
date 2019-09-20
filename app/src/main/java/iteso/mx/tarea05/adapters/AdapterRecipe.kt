package iteso.mx.tarea05.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import iteso.mx.tarea05.R

class AdapterRecipe(
    var recipes: ArrayList<HashMap<String, Any?>>
) :
    RecyclerView.Adapter<RecipeHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return RecipeHolder(layoutInflater.inflate(R.layout.item_recipe, parent, false))
    }

    override fun getItemCount(): Int {
        return recipes.size
    }

    override fun onBindViewHolder(holder: RecipeHolder, position: Int) {
        holder.bind(recipes[position])
    }
}

class RecipeHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val mView = itemView

    fun bind(recipe: HashMap<String, Any?>) {
        /* TODO Get all data and show into item */
    }
}