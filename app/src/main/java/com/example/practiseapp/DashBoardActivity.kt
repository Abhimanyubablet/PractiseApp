package com.example.practiseapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class DashBoardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash_board)

        val navigationBtn=findViewById<BottomNavigationView>(R.id.bottom_navigation)
        loadFragment(HomeFragment())
        navigationBtn.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home->loadFragment(HomeFragment())
                R.id.setting->loadFragment(SettingFragment())
                R.id.people->loadFragment(PeopleFragment())
            }
            true
        }

    }
    private fun loadFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.framelaout,fragment).commit()
    }

}