package and5.abrar.dependecyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var  namaStudent :Student
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnJumlah.setOnClickListener {
            hitung()
        }

    }

    fun hitung(){
        val a = angka1.text.toString().toInt()
        val b = angka2.text.toString().toInt()
        val di = namaStudent.hitungJumlah(a,b)
        txtResult.text = di.toString()
    }
}