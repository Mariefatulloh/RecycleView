package lat.pam.recyclerviewsample

// Removed duplicate import
// import lat.tam.recycleviewsimple.ItemsViewModel
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import lat.pam.samplerecyclerview.ItemsViewModel
import lat.tam.recycleviewsimple.R

class CustomAdapter(private val mList: List<ItemsViewModel>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // Inflate the card_view_design layout that is used to hold list items
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_view_design, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemsViewModel = mList[position]

        // Set the image to the ImageView if needed (uncomment if required)
        // holder.imageView.setImageResource(itemsViewModel.image)

        // Set the text to the TextView from the ViewHolder class
        holder.textView.text = itemsViewModel.text
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        // Uncomment if image view is used
        // val imageView: ImageView = itemView.findViewById(R.id.imageview)
        val textView: TextView = itemView.findViewById(R.id.textView)
    }
}
