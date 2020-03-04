package center.tilda.tildablog.deleteme

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import kotlinx.android.synthetic.main.activity_novi.*
import kotlinx.android.synthetic.main.content_novi.*

class NoviActivity : AppCompatActivity() {

    private lateinit var viewAdapter: VoceAdapter
    private lateinit var viewManager: LinearLayoutManager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_novi)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
        supportActionBar?.setDisplayHomeAsUpEnabled(false)

        val listaVoca = ArrayList<Voce>()
        listaVoca.add(Voce("Jabuka", Color.RED,12.93))
        listaVoca.add(Voce("Kruska", Color.YELLOW,12.93))
        listaVoca.add(Voce("Tresnja", Color.RED,12.93))
        listaVoca.add(Voce("Banana", Color.YELLOW,12.93))
        listaVoca.add(Voce("Jabuka", Color.RED,12.93))
        listaVoca.add(Voce("Jabuka", Color.RED,12.93))
        listaVoca.add(Voce("Jabuka", Color.RED,12.93))
        listaVoca.add(Voce("Jabuka", Color.RED,12.93))
        listaVoca.add(Voce("Jabuka", Color.RED,12.93))
        listaVoca.add(Voce("Jabuka", Color.RED,12.93))
        listaVoca.add(Voce("Jabuka", Color.RED,12.93))
        listaVoca.add(Voce("Jabuka", Color.RED,12.93))


        viewAdapter = VoceAdapter(listaVoca)

        viewManager = LinearLayoutManager(this)

        recyclerView.apply {
            setHasFixedSize(true)
            layoutManager = viewManager

            adapter = viewAdapter
        }

    }

}
