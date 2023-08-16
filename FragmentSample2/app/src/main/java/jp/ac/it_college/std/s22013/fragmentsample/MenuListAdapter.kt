package jp.ac.it_college.std.s22013.fragmentsample

import android.view.LayoutInflater
import android.view.ScrollCaptureCallback
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import jp.ac.it_college.std.s22013.fragmentsample.databinding.MenurowBinding

class MenuAdapter(
    private val data: List<Menu>,
    private val callback: (Menu) -> Unit
) :
    RecyclerView.Adapter<MenuAdapter.ViewHolder>() {
    class ViewHolder(val binding: MenurowBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(MenurowBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val menu = data[position]
        holder.binding.apply {
            menuName.text = menu.name
            menuPrice.text = "%,d".format(menu.price)
            root.setOnClickListener { callback(menu) }
        }
    }
}