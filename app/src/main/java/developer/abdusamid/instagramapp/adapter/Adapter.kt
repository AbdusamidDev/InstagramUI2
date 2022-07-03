package developer.abdulaziz.homework162.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import developer.abdusamid.instagramapp.R
import developer.abdusamid.instagramapp.adapter.User
import kotlinx.android.synthetic.main.insta_glavniy.view.*

class Adapter(var list: List<User>) : RecyclerView.Adapter<Adapter.Vh>() {
    inner class Vh(var itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun onBind(user: User) {
            itemView.txt_item.text = user.name
            when (user.name) {
                "Ramizbek..." -> itemView.profile_image.setImageResource(R.drawable.abd)
                "Abdusamid.." -> itemView.profile_image.setImageResource(R.drawable.abdusamid)
                "Dilshodov.." -> itemView.profile_image.setImageResource(R.drawable.asadulloh)
                "marufov_o21" -> itemView.profile_image.setImageResource(R.drawable.oyatillo)
                "dili.me...." -> itemView.profile_image.setImageResource(R.drawable.dilime)
                "alixanov_.." -> itemView.profile_image.setImageResource(R.drawable.timur)
                "Usmonali_20" -> itemView.profile_image.setImageResource(R.drawable.usmonoali)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(
            LayoutInflater.from(parent.context).inflate(R.layout.insta_glavniy, parent, false)
        )
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size

}