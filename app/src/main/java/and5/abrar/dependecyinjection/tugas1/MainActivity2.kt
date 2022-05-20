package and5.abrar.dependecyinjection.tugas1

import and5.abrar.dependecyinjection.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main2.*
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity2 : AppCompatActivity() {
    @Inject
    lateinit var nilai: Nilai
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        btnKonversi.setOnClickListener {
            val angka = inNIlai.text.toString().toInt()
            hslKonversi.text = nilai.Nilai(angka)
        }
    }
}