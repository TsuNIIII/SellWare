package br.com.unicap.nftsunicap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import br.com.unicap.nftsunicap.databinding.ActivityLoginPageBinding

class LoginPage : AppCompatActivity() {

    private lateinit var binding: ActivityLoginPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)
        supportActionBar?.hide()
        binding = ActivityLoginPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        nameFocusListener()
        binding.btnLogin.setOnClickListener{
            submitForm()
        }

    }

    private fun submitForm(){
        binding.textInputLayout.helperText = validName()

        val validEmail = binding.textInputLayout.helperText==null
        if(validEmail){

            irParaView2()
        }
    }
    private fun nameFocusListener(){
        binding.email.setOnFocusChangeListener { _, focused ->
            if(!focused){
                binding.textInputLayout.helperText= validName()
            }
        }
    }

    private fun validName(): String?{
        val nameText = binding.email.text.toString()
        if(!Patterns.EMAIL_ADDRESS.matcher(nameText).matches()){
            return "Favor inserir um email valido"
        }
        return null
    }
    private fun irParaView2(){
        val email = binding.email.text.toString()
        val segundaTela = Intent(this, View2::class.java)
        segundaTela.putExtra("nome", email)

        startActivity(segundaTela)

    }
}