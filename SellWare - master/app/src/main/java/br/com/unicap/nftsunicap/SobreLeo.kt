package br.com.unicap.nftsunicap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SobreLeo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sobre_leo)
        supportActionBar?.hide()
    }
}