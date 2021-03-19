package alm.itesm.appchallenge1

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class AlbumAdapter(private val albums: List<Albums>, val context: Context) : RecyclerView.Adapter<AlbumAdapter.AlbumViewHolder>() {
    inner class AlbumViewHolder(renglon: View) : RecyclerView.ViewHolder(renglon) {
        val titulo = renglon.findViewById<TextView>(R.id.titulo)
        val anio = renglon.findViewById<TextView>(R.id.anio)
        val foto = renglon.findViewById<ImageView>(R.id.foto)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val renglon_vista = inflater.inflate(R.layout.album_renglon,parent, false)
        return AlbumViewHolder(renglon_vista)
    }

    override fun onBindViewHolder(holder: AlbumViewHolder, position: Int) {
        val album = albums[position]
        holder.foto.setImageResource(album.Picture)
        holder.titulo.text = album.titulo
        holder.anio.text = album.anio
        holder.itemView.setOnClickListener{
            var toast = Toast.makeText(context, album.secret, Toast.LENGTH_SHORT)
            toast.show()

            val action = AlbumFragmentDirections.actionAlbumFragmentToAlbumInfoFragment(album)
            holder.itemView.findNavController().navigate(action)
        }
    }

    override fun getItemCount(): Int {
        return albums.size
    }


}