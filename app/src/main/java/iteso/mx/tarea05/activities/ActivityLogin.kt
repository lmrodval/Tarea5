package iteso.mx.tarea05.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import iteso.mx.tarea05.R
import org.jetbrains.anko.find
import org.jetbrains.anko.startActivity
import java.nio.file.Files.find

class ActivityLogin : AppCompatActivity(),  View.OnClickListener {
    /* TODO Declare EditText and Button variables */
    private lateinit var mLog : Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        mLog = find(R.id.activity_login_btn_login)

        mLog.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when(view.id){
            R.id.activity_login_btn_login -> {
                startActivity<ActivityTutorial>()
            }
        }
    }


}
