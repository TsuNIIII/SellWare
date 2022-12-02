package br.com.unicap.nftsunicap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.unicap.nftsunicap.databinding.ActivityView2Binding

class View2 : AppCompatActivity() {

    private lateinit var binding: ActivityView2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view2)
        supportActionBar?.hide()

        binding = ActivityView2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        recuperaDados()
        binding.btnBrnn.setOnClickListener{
            IrParaVini()
        }
        binding.btnDiogo.setOnClickListener{
            IrParaLeo()
        }
        binding.btnRafael.setOnClickListener{
            IrParaMancilha()
        }
        binding.setas.setOnClickListener{
            IrParaView3()
        }
    }

    private fun recuperaDados(){
        val nome = intent.getStringExtra("nome")
        var pos= nome?.length?.minus(10)
        val name = nome?.substring(0, pos!!)
        binding.user.setText(name)
    }
    private fun IrParaView3(){
        val irView3 = Intent(this, View3::class.java)
        startActivity(irView3)
    }
    private fun IrParaVini(){

        val vinitela = Intent(this, SobreVini::class.java)
        startActivity(vinitela)

    }
    private fun IrParaLeo(){

        val leotela = Intent(this, SobreLeo::class.java)
        startActivity(leotela)

    }
    private fun IrParaMancilha(){
        val mancilhatela = Intent(this, SobreMancilha::class.java)
        startActivity(mancilhatela)
    }
}