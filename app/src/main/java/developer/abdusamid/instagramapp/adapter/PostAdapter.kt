package developer.abdusamid.instagramapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import developer.abdusamid.instagramapp.R
import kotlinx.android.synthetic.main.post_item.view.*

class PostAdapter(var list: List<UserPost>) : RecyclerView.Adapter<PostAdapter.Vh>() {
    inner class Vh(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun onBind(user: UserPost) {
            when (user.number) {
                1 -> {
                    itemView.image_post1.setImageResource(R.drawable.abdulahadbogdod)
                    itemView.image_post2.setImageResource(R.drawable.post1)
                    itemView.image_post3.setImageResource(R.drawable.post2)
                }
                2 -> {
                    itemView.image_post1.setImageResource(R.drawable.abd)
                    itemView.image_post2.setImageResource(R.drawable.post3)
                    itemView.image_post3.setImageResource(R.drawable.istorya2)
                }
                3 -> {
                    itemView.image_post1.setImageResource(R.drawable.post1)
                    itemView.image_post2.setImageResource(R.drawable.post2)
                    itemView.image_post3.setImageResource(R.drawable.post3)
                }
                4 -> {
                    itemView.image_post1.setImageResource(R.drawable.abdulahadbogdod)
                    itemView.image_post2.setImageResource(R.drawable.post1)
                    itemView.image_post3.setImageResource(R.drawable.post2)
                }
                5 -> {
                    itemView.image_post1.setImageResource(R.drawable.abd)
                    itemView.image_post2.setImageResource(R.drawable.post3)
                    itemView.image_post3.setImageResource(R.drawable.istorya2)
                }
                6 -> {
                    itemView.image_post1.setImageResource(R.drawable.post1)
                    itemView.image_post2.setImageResource(R.drawable.post2)
                    itemView.image_post3.setImageResource(R.drawable.post3)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(LayoutInflater.from(parent.context).inflate(R.layout.post_item, parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size

}