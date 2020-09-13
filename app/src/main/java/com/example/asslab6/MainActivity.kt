package com.example.asslab6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import kotlinx.android.synthetic.main.fragment_one.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if(savedInstanceState==null){
            supportFragmentManager.beginTransaction().add(
                    R.id.frameLayout,
                    OneFragment()
            ).commit()
        }
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.my_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item?.itemId) {
            R.id.menu1 -> {
                supportFragmentManager.beginTransaction().add(R.id.frameLayout, TwoFragment()).commit()
            }
            R.id.menu2 -> {
                supportFragmentManager.beginTransaction().add(R.id.frameLayout, ThreeFragment())
                        .commit()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
