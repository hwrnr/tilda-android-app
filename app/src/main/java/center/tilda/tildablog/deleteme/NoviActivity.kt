package center.tilda.tildablog.deleteme

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_novi.*
import kotlinx.android.synthetic.main.content_novi.*

class NoviActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_novi)
        setSupportActionBar(toolbar)

        val counter = this.getIntent().getIntExtra("counterValue", 0)
        counter_value_textview.text = counter.toString()

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
            val newIntent = Intent(this@NoviActivity, NoviNoviActivity::class.java)
            startActivity(newIntent)
        }
        supportActionBar?.setDisplayHomeAsUpEnabled(false)
    }

}
