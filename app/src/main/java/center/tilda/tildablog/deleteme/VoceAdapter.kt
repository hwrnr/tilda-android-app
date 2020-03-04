package center.tilda.tildablog.deleteme

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.core.graphics.drawable.toDrawable
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.single_voce.view.*

class VoceAdapter (private val myDataset: List<Voce>) : RecyclerView.Adapter<VoceAdapter.MyViewHolder>() {

    class MyViewHolder(val root: LinearLayout) :  RecyclerView.ViewHolder(root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val linearLayout = LayoutInflater.from(parent.context).inflate(R.layout.single_voce, parent, false) as LinearLayout

        return MyViewHolder(linearLayout)
    }

    override fun getItemCount(): Int {
        return myDataset.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.root.voce_ime.text = myDataset[position].ime
        holder.root.voce_cena.text = myDataset[position].cena.toString()
        holder.root.setBackgroundColor(myDataset[position].boja)
    }

}