package raghad.application.lectuer3hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import org.w3c.dom.Text
import raghad.application.lectuer3hw.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }
}