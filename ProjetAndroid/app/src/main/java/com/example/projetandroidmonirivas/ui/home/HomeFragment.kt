//package com.example.projetandroidmonirivas.ui.home
//
//import android.os.Bundle
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.TextView
//
//import androidx.fragment.app.Fragment
//import androidx.lifecycle.Observer
//import androidx.lifecycle.ViewModelProvider
//import com.example.projetandroidmonirivas.R
//import com.example.projetandroidmonirivas.databinding.FragmentHomeBinding
//import android.widget.Toast
//
//import com.example.projetandroidmonirivas.MainActivity
//
//import android.widget.AdapterView
//
//import com.example.projetandroidmonirivas.CustomListAdapter
//
//import android.widget.AdapterView.OnItemClickListener
//import android.widget.ListView
//import com.example.projetandroidmonirivas.Actu
//
//
//class HomeFragment : Fragment()  {
//
//    private lateinit var homeViewModel: HomeViewModel
//    private var _binding: FragmentHomeBinding? = null
//
//    // This property is only valid between onCreateView and
//    // onDestroyView.
//    private val binding get() = _binding!!
//
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?,
//
//
//    ): View? {
//        homeViewModel =
//            ViewModelProvider(this).get(HomeViewModel::class.java)
//
//        _binding = FragmentHomeBinding.inflate(inflater, container, false)
//        val root: View = binding.root
//
//        val image_details: List<Actu> = getListData()
//        val listView = findViewById(R.id.listView) as ListView
//        listView.setAdapter(CustomListAdapter(this, image_details))
//
//        listView.setOnItemClickListener(OnItemClickListener { a, v, position, id ->
//            val o: Any = listView.getItemAtPosition(position)
//            val country: Actu = o as Actu
//            Toast.makeText(this@MainActivity, "Selected : $actu", Toast.LENGTH_LONG).show()
//        })
//
//
//        return root
//    }
//
//    override fun onDestroyView() {
//        super.onDestroyView()
//        _binding = null
//    }
//
//
//        override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        val image_details: List<Actu> = getListData()
//        val listView: ListView = findViewById(R.id.listView) as ListView
//        listView.setAdapter(CustomListAdapter(this, image_details))
//
//        // When the user clicks on the ListItem
//        listView.setOnItemClickListener(OnItemClickListener { a, v, position, id ->
//            val o: Any = listView.getItemAtPosition(position)
//            val country: Actu = o as Actu
//            Toast.makeText(this@MainActivity, "Selected : $actu", Toast.LENGTH_LONG).show()
//        })
//    }
//
//    private fun getListData(): List<Actu> {
//        val list: MutableList<Actu> = ArrayList<Actu>()
//        val vietnam = Actu("Vietnam", "vn", "")
//        val usa = Actu("United States", "us", "")
//        val russia = Actu("Russia", "ru", "")
//        list.add(vietnam)
//        list.add(usa)
//        list.add(russia)
//        return list
//    }
//
//
//
//
//}