package dev.bogibek.karantinagentlik.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dev.bogibek.karantinagentlik.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val isSigned = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initViews()
    }

    private fun initViews() {
        binding.apply {

            bFilterEmployee.setOnClickListener {
                if (isSigned) {
                    val intent = Intent(this@MainActivity, FilterEmployeeActivity::class.java)
                    startActivity(intent)
                } else {
                    val intent = Intent(this@MainActivity, LoginActivity::class.java)
                    startActivity(intent)

                }
            }

            bTelegramLinks.setOnClickListener {
                Intent(this@MainActivity, TelegramLinksActivity::class.java).also {
                    startActivity(it)
                }
            }
        }
    }
}