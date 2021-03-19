package alm.itesm.appchallenge1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_album.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [AlbumFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AlbumFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_album, container, false)
    }

    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)
            album_recycler.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
            layoutManager = LinearLayoutManager(activity)
            // set the custom adapter to the RecyclerView
            adapter = AlbumAdapter(createAlbums(), context)
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment AlbumFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            AlbumFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    fun createAlbums(): ArrayList<Albums> {
        val albums = ArrayList<Albums>()

        albums.add(Albums(R.drawable.aloneinthecity, "Alone in the city", "2018", "Mejor titulo de album"))
        albums.add(Albums(R.drawable.losemyself, "Dystopia Lose Myself", "2020", "Muy pocas canciones"))
        albums.add(Albums(R.drawable.eclipse, "Eclipse", "2021", "Anime song"))
        albums.add(Albums(R.drawable.endlessnight, "Endless Night", "2020", "Por si una canción de metal, no era suficiente"))
        albums.add(Albums(R.drawable.escapetheera, "Escape The ERA", "2018", "Otro album, que nunca e escuchado"))
        albums.add(Albums(R.drawable.fallasleepinthemirror, "Fall Asleep In The Mirror", "2017", "Está muy largo el nombre de este album"))
        albums.add(Albums(R.drawable.fullmoon, "Full Moon", "2018", "Solo se consigue en itunes"))
        albums.add(Albums(R.drawable.nomore, "No More", "2020", "Para los amantes del metal"))
        albums.add(Albums(R.drawable.overthesky, "Over The Sky", "2019", "Nunca e escuchado este album"))
        albums.add(Albums(R.drawable.prequel, "Prequel", "2017", "Segunda canción favorita"))
        albums.add(Albums(R.drawable.raidofdream, "Raid Of Dreams", "2019", "Más dificil de conseguir"))
        albums.add(Albums(R.drawable.roadtoutopia, "Road to Utopia", "2021", "Album más reciente"))
        albums.add(Albums(R.drawable.roseblue, "Alone in the city", "2020", "Colaboración favorita"))
        albums.add(Albums(R.drawable.theendofnightmare, "The end of Nightmare", "2019", "No dejes que te cachen"))
        albums.add(Albums(R.drawable.treeoflenguages, "The Tree of Languages", "2020", "Album favorito"))

        return albums
    }
}