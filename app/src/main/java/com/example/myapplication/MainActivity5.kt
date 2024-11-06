package com.example.myapplication

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class MainActivity5(
    fm: FragmentManager,
    lifecycle: Lifecycle
) : FragmentStateAdapter(fm, lifecycle) {

    companion object {
        private const val FIRST_FRAGMENT_POSITION = 0
        private const val SECOND_FRAGMENT_POSITION = 1
        private const val THIRD_FRAGMENT_POSITION = 2
        private const val TOTAL_COUNT = 3
    }

    override fun getItemCount(): Int = TOTAL_COUNT

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            FIRST_FRAGMENT_POSITION -> MainActivity2()
            SECOND_FRAGMENT_POSITION -> MainActivity3()
            THIRD_FRAGMENT_POSITION -> MainActivity4()
            else -> throw IllegalArgumentException("Invalid position: $position")
        }
    }
}
