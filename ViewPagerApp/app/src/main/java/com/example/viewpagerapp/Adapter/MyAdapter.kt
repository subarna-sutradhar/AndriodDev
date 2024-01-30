package com.example.viewpagerapp.Adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpagerapp.MainActivity
import com.example.viewpagerapp.fragments.Fragment1
import com.example.viewpagerapp.fragments.Fragment2
import com.example.viewpagerapp.fragments.Fragment3

class MyAdapter(mainActivity: MainActivity) : FragmentStateAdapter(mainActivity) {

    private val Fragments_Size = 3
    override fun getItemCount(): Int {
        return this.Fragments_Size
    }

    override fun createFragment(position: Int): Fragment {
        when(position){
            0 -> {
                return Fragment1()
            }
            1 -> {
                return Fragment2()
            }
            2 -> {
                return Fragment3()
            }

        }
        return Fragment1()
    }


}