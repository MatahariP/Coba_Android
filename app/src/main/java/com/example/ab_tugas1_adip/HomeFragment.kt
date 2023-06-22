package com.example.ab_tugas1_adip

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ab_tugas1_adip.Adapter
import com.example.ab_tugas1_adip.ListItem
import com.example.ab_tugas1_adip.R
import com.example.ab_tugas1_adip.RecyclerViewItemModel
import com.example.ab_tugas1_adip.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private var columnCount = 1

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        if (view is RecyclerView){
            with(view){
                layoutManager = GridLayoutManager(context, columnCount)

                val listAdapter = Adapter()
                listAdapter.isiList(ListItem.buatlist())
                adapter = listAdapter
            }

        }
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}