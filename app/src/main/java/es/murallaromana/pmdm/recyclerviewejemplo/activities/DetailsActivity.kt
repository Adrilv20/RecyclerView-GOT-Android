package es.murallaromana.pmdm.recyclerviewejemplo.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AlertDialog.Builder
import com.google.android.material.snackbar.Snackbar
import es.murallaromana.pmdm.recyclerviewejemplo.R
import es.murallaromana.pmdm.recyclerviewejemplo.databinding.ActivityDetailsBinding
import es.murallaromana.pmdm.recyclerviewejemplo.models.entities.GoTChar

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding
    private var character: GoTChar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        character = intent.extras?[(resources.getString(R.string.got_char_key)] as GoTChar
        character = intent.extras?.get("got_char") as GoTChar?

        setTitle(character?.fullName() ?: "Nuevo Personaje")
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_details_gotchar, menu)
        return true // si pasamos false o la llamda a super [generada por defecto], no saldrá el menú
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_save -> {
                Toast.makeText(this, "Personaje guardado", Toast.LENGTH_SHORT).show()
                //TODO(implement saving)
                return true
            }
            R.id.action_delete -> {
                val builder = Builder(this)
                builder
                    .setTitle("Deleting element")
                    .setMessage("¿U sure?")
                    .setPositiveButton("Accept") { _, _ -> finish() }
                    .setNegativeButton("Nope") { dialog, it ->
                        Toast.makeText(this, "Ok", Toast.LENGTH_SHORT).show()
                    }
                val dialog = builder.create()
                dialog.show()
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }

    }
}