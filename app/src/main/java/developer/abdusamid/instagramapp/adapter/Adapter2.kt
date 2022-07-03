package developer.abdusamid.instagramapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import developer.abdusamid.instagramapp.Boollean
import developer.abdusamid.instagramapp.R
import kotlinx.android.synthetic.main.oitem_instagram.view.*

class Adapter2(var list: ArrayList<User2>) : RecyclerView.Adapter<Adapter2.Vh>() {
    inner class Vh(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun onBind(user: User2) {
            itemView.txt_kchkina_image.text = user.nameAckaunt
            itemView.txtkichkina_kichkina_image.text = user.location
            itemView.rasm_likeson.text = "${user.like}"
            itemView.comment.text = user.komment
            when (user.nameAckaunt) {
                "d1lshodov1ch_05" -> {
                    itemView.image_item_kichkina.setImageResource(R.drawable.abd)
                    itemView.image_item.setImageResource(R.drawable.abdulahadbogdod)

                    itemView.like.setOnClickListener {
                        if (Boollean.bol) {
                            Boollean.bol = false
                            itemView.rasm_likeson.text = "${++user.like}"
                            itemView.like.setImageResource(R.drawable.ic_baseline_favorite_24)
                        } else if (!Boollean.bol) {
                            Boollean.bol = true
                            itemView.rasm_likeson.text = "${--user.like}"
                            itemView.like.setImageResource(R.drawable.ic_favorite_border)
                        }
                    }
                }
                "1abdullayv" -> {
                    itemView.image_item_kichkina.setImageResource(R.drawable.diyormal)
                    itemView.image_item.setImageResource(R.drawable.diyor1)

                    itemView.like.setOnClickListener {
                        if (Boollean.bol) {
                            Boollean.bol = false
                            itemView.rasm_likeson.text = "${++user.like}"
                            itemView.like.setImageResource(R.drawable.ic_baseline_favorite_24)
                        } else if (!Boollean.bol) {
                            Boollean.bol = true
                            itemView.rasm_likeson.text = "${--user.like}"
                            itemView.like.setImageResource(R.drawable.ic_favorite_border)
                        }
                    }
                }
                "omad_ss" -> {
                    itemView.image_item_kichkina.setImageResource(R.drawable.omadbekmal)
                    itemView.image_item.setImageResource(R.drawable.omadbek)

                    itemView.like.setOnClickListener {
                        if (Boollean.bol) {
                            Boollean.bol = false
                            itemView.rasm_likeson.text = "${++user.like}"
                            itemView.like.setImageResource(R.drawable.ic_baseline_favorite_24)
                        } else if (!Boollean.bol) {
                            Boollean.bol = true
                            itemView.rasm_likeson.text = "${--user.like}"
                            itemView.like.setImageResource(R.drawable.ic_favorite_border)
                        }
                    }
                }
            }

            itemView.sohr.setOnClickListener {
                if (Boollean.bol2 == true) {
                    Boollean.bol2 = false
                    itemView.sohr.setImageResource(R.drawable.ic_bookmark2)
                } else if (Boollean.bol2 == false) {
                    Boollean.bol2 = true
                    itemView.sohr.setImageResource(R.drawable.ic_bookmark)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(
            LayoutInflater.from(parent.context).inflate(R.layout.oitem_instagram, parent, false)
        )
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size

}