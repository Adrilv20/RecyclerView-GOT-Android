package es.murallaromana.pmdm.recyclerviewejemplo.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import es.murallaromana.pmdm.recyclerviewejemplo.R
import es.murallaromana.pmdm.recyclerviewejemplo.databinding.ActivityMainBinding
import es.murallaromana.pmdm.recyclerviewejemplo.models.entities.GoTChar

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val layoutManager = LinearLayoutManager(this)

        val c = GoTChar(0, "Daenerys", "Targaryan", "Mother of Dragons", "House bla", "https://thronesapi.com/assets/images/daenerys.jpg")
        println(c.fullName())
    }
}