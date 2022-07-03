package developer.abdusamid.instagramapp

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import developer.abdusamid.instagramapp.databinding.FragmentBlankBinding

class BlankFragment : Fragment() {
    lateinit var handler: Handler
    lateinit var binding: FragmentBlankBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentBlankBinding.inflate(layoutInflater)

        handler = Handler()
        handler.postDelayed({

            val blankFragment = BlankFragment2()
            val fragmentManager = parentFragmentManager
            val transaction = fragmentManager.beginTransaction()
            transaction.replace(R.id.my_conteiner, blankFragment)
            transaction.commit()

        }, 2000)

        return binding.root
    }
}