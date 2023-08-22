package jp.ac.it_college.std.s22013.databasesample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import jp.ac.it_college.std.s22013.databasesample.databinding.RowBinding

class CocktailAdpter(
    private val data: List<String>,
    private val callback:(Int, String) -> Unit
    ) : RecyclerView.Adapter<CocktailAdpter.ViewHolder>() {

    class ViewHolder(internal val binding: RowBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolder(RowBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: CocktailAdpter.ViewHolder, position: Int) {
        holder.binding.tvCocktailName.text = data[position]
        holder.binding.root.setOnClickListener{
            callback(position, data[position])
        }
    }

    override fun getItemCount(): Int = data.size
}