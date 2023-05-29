package com.example.lead_layouting.ui.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.widget.Toast
import com.example.lead_layouting.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding:ActivityLoginBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        setupClickListener()
    }

    private fun setupClickListener(){
        binding.apply {
            btnSignin.setOnClickListener{
                var username = tietUsername.text.toString()
                var password = tietPassword.text.toString()
                Log.d("sample","sample: Username $username")

                var valid = validate(username = username, password =password)
                if(valid){
                    Toast.makeText(this@LoginActivity,"$username anda berhasil login",Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(this@LoginActivity,"anda gagal login, silahkan coba lagi",Toast.LENGTH_SHORT).show()
                }

            }
        }
    }
    private fun validate(username: String, password:String):Boolean{
        return username == "Admin" && password == "admin"
    }
}