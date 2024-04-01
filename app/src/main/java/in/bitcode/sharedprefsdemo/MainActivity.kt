package `in`.bitcode.sharedprefsdemo

import android.app.Activity
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Named shared preferences
        val pref : SharedPreferences =
            getSharedPreferences("my_pref", Activity.MODE_PRIVATE);

        val editor = pref.edit()
        editor.putInt("code", 909)
        editor.putString("name", "BitCode")
        editor.commit()

        val code = pref.getInt("code", -1)
        val name = pref.getString("name", "Not available!")

        Toast.makeText(this, "code: $code name: $name", Toast.LENGTH_LONG).show()

        //pref.edit().remove("code")

        //Unnamed shared prefs
        val newPref = getPreferences(Activity.MODE_PRIVATE)
        newPref.edit()
            .putInt("roll", 101)
            .putString("remark", "Not Good")
            .commit()

        val roll = newPref.getInt("roll", -1)
        val rollNew = newPref.getInt("rollNew", -1)
        val remark = newPref.getString("remark", "NA")
        Toast.makeText(this, "roll: $roll remark: $remark", Toast.LENGTH_LONG).show()
        Toast.makeText(this, "rollNew: $rollNew", Toast.LENGTH_LONG).show()


        MyPreferences.putUsername(this, "vishal")
        val username = MyPreferences.getUsername(this)

        Toast.makeText(this, username, Toast.LENGTH_LONG).show()

    }
}










