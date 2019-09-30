package iteso.mx.tarea05.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import iteso.mx.tarea05.R
import iteso.mx.tarea05.activities.ActivityTutorial
import iteso.mx.tarea05.interfaces.Listener
import org.jetbrains.anko.find

class ProfileFragment: Fragment(){

    private lateinit var listener: Listener

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_profile, container, false)
        return view
        }
}