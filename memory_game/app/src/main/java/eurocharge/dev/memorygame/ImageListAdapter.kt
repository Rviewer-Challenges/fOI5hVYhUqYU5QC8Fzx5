package eurocharge.dev.memorygame

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import eurocharge.dev.memorygame.databinding.ListItemBinding

internal class ImageListAdapter internal constructor(private val mContext: Context) : BaseAdapter()  {


    private val mThumbIds = arrayOf(R.drawable.ari,R.drawable.hectorleon,R.drawable.holamundo,R.drawable.moure,R.drawable.ari,R.drawable.hectorleon,R.drawable.holamundo,R.drawable.moure)

    override fun getCount(): Int {
        return mThumbIds.size
    }

    override fun getItem(position: Int): Any? {
        return null
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    // Create a new ImageView for each item referenced by the Adapter
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val imageView: ImageView
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = ImageView(mContext)
            imageView.layoutParams = ViewGroup.LayoutParams(300, 300)
            imageView.scaleType = ImageView.ScaleType.CENTER_CROP
        } else {
            imageView = (convertView as ImageView?)!!
        }

        imageView.setImageResource(mThumbIds[position])
        return imageView
    }

}
