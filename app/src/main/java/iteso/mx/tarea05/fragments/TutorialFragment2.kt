package iteso.mx.tarea05.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import iteso.mx.tarea05.R
import iteso.mx.tarea05.activities.ActivityTutorial
import iteso.mx.tarea05.interfaces.Listener
import org.jetbrains.anko.find

class TutorialFragment2: Fragment() {

    private lateinit var listener: Listener

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.tutorial_fragment2, container, false)
        view.find<Button>(R.id.fragment2_next_button).setOnClickListener {
            listener.next(1)
        }
        view.find<Button>(R.id.fragment2_back_button).setOnClickListener {
            listener.previous(10)
        }
        return view
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as ActivityTutorial
    }

}