package developer.abdusamid.instagramapp

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import developer.abdusamid.instagramapp.adapter.ActualAdapter
import developer.abdusamid.instagramapp.adapter.PostAdapter
import developer.abdusamid.instagramapp.adapter.User3
import developer.abdusamid.instagramapp.adapter.UserPost
import developer.abdusamid.instagramapp.databinding.FragmentBlank3Binding

class BlankFragment3 : Fragment() {
    lateinit var viewGroup: ViewGroup
    lateinit var actualAdapter: ActualAdapter
    lateinit var list: ArrayList<User3>
    lateinit var listPost: ArrayList<UserPost>
    lateinit var postAdapter: PostAdapter
    lateinit var binding: FragmentBlank3Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentBlank3Binding.inflate(layoutInflater)

        loadData()

        actualAdapter = ActualAdapter(list)
        binding.fragment3Rv.adapter = actualAdapter

        postAdapter = PostAdapter(listPost)
        binding.rvPost.adapter = postAdapter
        binding.nopublicText.visibility = View.INVISIBLE
        binding.postlarRoyhatiIcon.setImageResource(R.drawable.ic_grid2)
        binding.postlarRoyhatiCard.setCardBackgroundColor(Color.parseColor("#000000"))

        binding.home.setOnClickListener {
            val blankFragment = BlankFragment2()
            val fragmentManager = parentFragmentManager
            val transaction = fragmentManager.beginTransaction()
            transaction.replace(R.id.my_conteiner, blankFragment)
            transaction.commit()
        }

        binding.postlarRoyhatiCard.setOnClickListener {
            binding.postlarRoyhatiIcon.setImageResource(R.drawable.ic_grid2)
            binding.postlarVidyoIcon.setImageResource(R.drawable.ic_livetv)
            binding.postlarOtmetkaIcon.setImageResource(R.drawable.ic_contact)
            binding.postlarRoyhatiCard.setCardBackgroundColor(Color.parseColor("#000000"))
            binding.postlarVidyoCard.setCardBackgroundColor(Color.parseColor("#1B000000"))
            binding.postlarOtmetkaCard.setCardBackgroundColor(Color.parseColor("#1B000000"))
            binding.rvPost.visibility = View.VISIBLE
            binding.nopublicText.visibility = View.INVISIBLE
        }
        binding.postlarVidyoCard.setOnClickListener {
            binding.postlarRoyhatiIcon.setImageResource(R.drawable.ic_grid)
            binding.postlarVidyoIcon.setImageResource(R.drawable.ic_ivetv2)
            binding.postlarOtmetkaIcon.setImageResource(R.drawable.ic_contact)
            binding.postlarRoyhatiCard.setCardBackgroundColor(Color.parseColor("#1B000000"))
            binding.postlarVidyoCard.setCardBackgroundColor(Color.parseColor("#000000"))
            binding.postlarOtmetkaCard.setCardBackgroundColor(Color.parseColor("#1B000000"))

            binding.rvPost.visibility = View.INVISIBLE
            binding.nopublicText.visibility = View.VISIBLE
        }
        binding.postlarOtmetkaCard.setOnClickListener {
            binding.postlarRoyhatiIcon.setImageResource(R.drawable.ic_grid)
            binding.postlarVidyoIcon.setImageResource(R.drawable.ic_livetv)
            binding.postlarOtmetkaIcon.setImageResource(R.drawable.ic_contact2)
            binding.postlarRoyhatiCard.setCardBackgroundColor(Color.parseColor("#1B000000"))
            binding.postlarVidyoCard.setCardBackgroundColor(Color.parseColor("#1B000000"))
            binding.postlarOtmetkaCard.setCardBackgroundColor(Color.parseColor("#000000"))
            binding.rvPost.visibility = View.INVISIBLE
            binding.nopublicText.visibility = View.VISIBLE
        }


        return binding.root
    }


    private fun loadData() {
        list = ArrayList()
        list.add(User3("...", R.drawable.istorya1, 1))
        list.add(User3("...", R.drawable.istorya1, 2))
        list.add(User3("...", R.drawable.istorya2, 3))
        list.add(User3("...", R.drawable.istorya3, 4))
        list.add(User3("...", R.drawable.istorya4, 5))
        list.add(User3("...", R.drawable.istorya5, 6))
        list.add(User3("...", R.drawable.istorya6, 7))
        list.add(User3("...", R.drawable.istorya6, 8))

        listPost = ArrayList()
        listPost.add(UserPost(R.drawable.abdulahadbogdod, R.drawable.post1, R.drawable.post2, 1))
        listPost.add(UserPost(R.drawable.post3, R.drawable.abd, R.drawable.istorya2, 2))
        listPost.add(UserPost(R.drawable.post1, R.drawable.post2, R.drawable.post3, 3))
        listPost.add(UserPost(R.drawable.abdulahadbogdod, R.drawable.post1, R.drawable.post2, 4))
        listPost.add(UserPost(R.drawable.post3, R.drawable.abd, R.drawable.istorya2, 5))
        listPost.add(UserPost(R.drawable.post1, R.drawable.post2, R.drawable.post3, 6))
    }

}