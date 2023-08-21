package com.example.practiseapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rowView= inflater.inflate(R.layout.fragment_home, container, false)

        val studentTabLayout=rowView.findViewById<TabLayout>(R.id.student_tablaout)
        val pageViewer=rowView.findViewById<ViewPager>(R.id.viewpager)

        val studentAdapter=activity?.let { StudentTabAdapter(it.supportFragmentManager) }
        studentAdapter?.addFragment(ProfileFragment(),"PROFILE")
        studentAdapter?.addFragment(CourseFragment(),"COURSE")
        studentAdapter?.addFragment(PlanFragment(),"PLAN")

        pageViewer.adapter=studentAdapter
        studentTabLayout.setupWithViewPager(pageViewer)
     return rowView
    }


}