package com.example.moviecatalogue.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.moviecatalogue.R
import com.example.moviecatalogue.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val activityHomeBinding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(activityHomeBinding.root)

//        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
//        activityHomeBinding.viewPager.adapter = sectionsPagerAdapter
//        activityHomeBinding.tabs.setupWithViewPager(activityHomeBinding.viewPager)
//
//        supportActionBar?.elevation = 0f
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finishAffinity()
    }
}