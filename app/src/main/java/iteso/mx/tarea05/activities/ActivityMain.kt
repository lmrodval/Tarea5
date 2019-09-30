package iteso.mx.tarea05.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView
import iteso.mx.tarea05.R
import iteso.mx.tarea05.fragments.FragmentRecipes
import iteso.mx.tarea05.fragments.HomeFragment
import iteso.mx.tarea05.fragments.ProfileFragment

class ActivityMain : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        supportFragmentManager.beginTransaction().replace(R.id.activity_main_fragment, HomeFragment()).commit()

        /* TODO Add BottomNavigationView with three options
        1.- List of recipes
        Use FragmentRecipes
        2.- Actual recipe
        Create FragmentRecipe
        Use MVP Pattern
        FragmentRecipe (View)
        Recipe (Model)
        PresenterRecipe (Presenter)
        Use ViewAnimator
            FIRST_VIEW
            Button with Refresh text
            SECOND_VIEW
            MaterialCard
            THIRD_VIEW
            Image with text
        3.- Profile
        Create FragmentProfile
         */
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.navigation_home -> supportFragmentManager
                .beginTransaction()
                .replace(R.id.activity_main_fragment, HomeFragment()).commit()

            R.id.navigation_profile -> supportFragmentManager
                .beginTransaction()
                .replace(R.id.activity_main_fragment, ProfileFragment()).commit()

            R.id.navigation_recipies -> supportFragmentManager
                .beginTransaction()
                .replace(R.id.activity_main_fragment, FragmentRecipes()).commit()
        }
        return true
    }


}
