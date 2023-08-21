package com.example.practiseapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView


class CourseFragment : Fragment() {
    lateinit var actionBarDrawerToggle: ActionBarDrawerToggle
    @SuppressLint("SuspiciousIndentation")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rowView= inflater.inflate(R.layout.fragment_course, container, false)

        val drawer = rowView.findViewById<DrawerLayout>(R.id.drawer)
        val navView=rowView.findViewById<NavigationView>(R.id.nav_View)

        actionBarDrawerToggle = ActionBarDrawerToggle(requireActivity(), drawer, R.string.open, R.string.close)
        drawer.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()
        activity?.actionBar?.setDisplayHomeAsUpEnabled(true)
        actionBarDrawerToggle.isDrawerIndicatorEnabled = true


        drawer.close()
        return rowView
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (actionBarDrawerToggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)

    }


}