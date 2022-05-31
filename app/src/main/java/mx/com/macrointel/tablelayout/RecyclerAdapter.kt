package mx.com.macrointel.tablelayout

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import mx.com.macrointel.tablelayout.databinding.RecyclerViewItemBinding

class RecyclerAdapter(private var list: List<String> = listOf()) :
    RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>() {


    inner class MyViewHolder(private val binding: RecyclerViewItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(element: String) {
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            RecyclerViewItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    override fun getItemCount() = list.size

    private fun getItem(position: Int): String = list[position]
}