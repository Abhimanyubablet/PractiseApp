package com.example.practiseapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class StudentTabAdapter(supportFragmentManager: FragmentManager):FragmentStatePagerAdapter(supportFragmentManager) {
    private val mFragmentList=ArrayList<Fragment>()
    private val mFragmentTitleList=ArrayList<String>()

 fun addFragment(fragment: Fragment,title:String){
     mFragmentList.add(fragment)
     mFragmentTitleList.add(title)
 }

    override fun getCount(): Int {
        return mFragmentList.size
    }

    override fun getItem(position: Int): Fragment {
      return mFragmentList[position]
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return mFragmentTitleList[position]
    }

}