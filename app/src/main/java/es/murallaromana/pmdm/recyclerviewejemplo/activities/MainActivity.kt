package es.murallaromana.pmdm.recyclerviewejemplo.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import es.murallaromana.pmdm.recyclerviewejemplo.adapters.ListGoTCharAdapter
import es.murallaromana.pmdm.recyclerviewejemplo.databinding.ActivityMainBinding
import es.murallaromana.pmdm.recyclerviewejemplo.models.dao.GoTCharMockImpl

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var view : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val characters = GoTCharMockImpl().getAllChars();

        view = binding.rvGoTCharList
        view.layoutManager = LinearLayoutManager(this)
        view.adapter  = ListGoTCharAdapter(characters)

        binding.rvGoTCharList.setHasFixedSize(true)
    }
}