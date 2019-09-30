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
import iteso.mx.tarea05.activities.ActivityMain
import iteso.mx.tarea05.activities.ActivityTutorial
import iteso.mx.tarea05.interfaces.HomeView
import iteso.mx.tarea05.interfaces.Listener
import org.jetbrains.anko.find

class HomeFragment: Fragment(), HomeView{


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        return view
    }

    override fun showRefreshView(fragmentid: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showProgress(fragmentid: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showNoInfo(fragmentid: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showInfo(fragmentid: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}