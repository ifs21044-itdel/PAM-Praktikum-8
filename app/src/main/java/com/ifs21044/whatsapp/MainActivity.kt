package com.ifs21044.whatsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var bottomNavigationView: BottomNavigationView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView = findViewById(R.id.bottom_navigation)

        bottomNavigationView.setOnNavigationItemSelectedListener { menuItem ->
            when(menuItem.itemId){
                R.id.bottom_chat ->{
                    replacedFragment(ChatFragment())
                    true
                }
                R.id.bottom_pembaruan ->{
                    replacedFragment(PembaruanFragment())
                    true
                }
                R.id.bottom_komunitas ->{
                    replacedFragment(KomunitasFragment())
                    true
                }
                R.id.bottom_panggilan ->{
                    replacedFragment(PanggilanFragment())
                    true
                }
                else -> false
            }
        }
        replacedFragment(ChatFragment())
    }

    private fun replacedFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.frame_container, fragment).commit()
    }

}