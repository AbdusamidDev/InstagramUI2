package developer.abdusamid.instagramapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import developer.abdulaziz.homework162.adapter.Adapter
import developer.abdusamid.instagramapp.adapter.Adapter2
import developer.abdusamid.instagramapp.adapter.User
import developer.abdusamid.instagramapp.adapter.User2
import developer.abdusamid.instagramapp.databinding.FragmentBlank2Binding


class BlankFragment2 : Fragment() {
    lateinit var list: ArrayList<User>
    lateinit var list2: ArrayList<User2>
    lateinit var binding: FragmentBlank2Binding
    lateinit var adapter: Adapter
    lateinit var adapter2: Adapter2
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentBlank2Binding.inflate(layoutInflater)

        loadData()

        adapter = Adapter(list)
        binding.rv.adapter = adapter

        adapter2 = Adapter2(list2)
        binding.rv2.adapter = adapter2


        binding.ozim.setOnClickListener {
            val blankFragment = BlankFragment3()
            val fragmentManager = parentFragmentManager
            val transaction = fragmentManager.beginTransaction()
            transaction.replace(R.id.my_conteiner, blankFragment)
            transaction.commit()
        }


        return binding.root
    }

    private fun loadData() {
        list = ArrayList()
        list.add(User("muhammado..", R.drawable.abdusamid))
        list.add(User("d1lshodov..", R.drawable.abd))
        list.add(User("kh1kmatul..", R.drawable.asadulloh))
        list.add(User("marufov_o21", R.drawable.oyatillo))
        list.add(User("dili.me....", R.drawable.dilime))
        list.add(User("alixanov_..", R.drawable.timur))
        list.add(User("Usmonali_20", R.drawable.usmonoali))

        list2 = ArrayList()
        list2.add(
            User2(
                "d1lshodov1ch_05",
                "Bogdod,Ferghana",
                R.drawable.abd,
                R.drawable.abdulahadbogdod,
                "kh1kmatullayev1ch_1 \uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25 \nabdumajidov_2005_ \uD83D\uDE4C\uD83D\uDE4C",
                200
            )
        )
        list2.add(
            User2(
                "1abdullayv",
                "Relax",
                R.drawable.diyormal,
                R.drawable.diyor1,
                "1abdullayev \uD83D\uDC3B \n faxriddin.702 \uD83D\uDD25\uD83D\uDD25",
                195
            )
        )
        list2.add(
            User2(
                "omad_ss",
                "Fergana",
                R.drawable.omadbekmal,
                R.drawable.omadbek,
                "netkarochi \uD83D\uDD25\uD83D\uDD25\uD83D\uDD25 \nmrsaidazm \uD83D\uDE4C\uD83D\uDE4C\uD83D\uDE4C",
                250
            )
        )

    }

}