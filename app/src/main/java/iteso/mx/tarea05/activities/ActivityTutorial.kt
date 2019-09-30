package iteso.mx.tarea05.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import iteso.mx.tarea05.R
import iteso.mx.tarea05.fragments.TutorialFragment1
import iteso.mx.tarea05.fragments.TutorialFragment2
import iteso.mx.tarea05.fragments.TutorialFragment3
import iteso.mx.tarea05.interfaces.Listener

class ActivityTutorial : AppCompatActivity(), Listener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tutorial)

     supportFragmentManager.beginTransaction().replace(R.id.activity_tutorial_fl_content, TutorialFragment1()).commit()
    }

    override fun next(fragmentid: Int) {
        if(fragmentid == 0) //Boton Next para ir del fragmento 1 al 2
            supportFragmentManager.beginTransaction().replace(R.id.activity_tutorial_fl_content, TutorialFragment2()).commit()
        if(fragmentid == 1) //Boton Next para ir del fragmento 2 al 3
            supportFragmentManager.beginTransaction().replace(R.id.activity_tutorial_fl_content, TutorialFragment3()).commit()
        //if(fragmentid == 2) //Boton Finish para ir del fragmento 3 a la MainActivity
          //  setContentView(R.layout.activity_main)

    }

    override fun previous(fragmentid: Int) {
        if(fragmentid == 10) //Boton Back para volver al fragmento anterior 1 -> 0
            supportFragmentManager.beginTransaction().replace(R.id.activity_tutorial_fl_content, TutorialFragment1()).commit()
        if(fragmentid == 20) //Boton back para volver al fragmento anterior 2 -> 1
            supportFragmentManager.beginTransaction().replace(R.id.activity_tutorial_fl_content, TutorialFragment2()).commit()
    }
}