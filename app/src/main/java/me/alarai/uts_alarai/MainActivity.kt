package me.alarai.uts_alarai
/*
* NIM : 10116006
* Nama: Ala Rai AbdiAllah
* Kelas: IF-6K
* Tanggal Pengerjaan : 16 Mei 2020
* Deskripsi Pekerjaan: Membuat Main Activity
* */
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var jk: String? = "Laki-laki"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        daftar_btn.setOnClickListener {
            val nama = nama_anak_edt.text.toString()
            val umur = umur_edt.text.toString()
            val toast = Toast.makeText(applicationContext,R.string.empty_input_message, Toast.LENGTH_SHORT)
            if(nama.isEmpty() || umur.isEmpty()){
                toast.show()
            }else{
                val intent = Intent(this, HomeActivity::class.java)
                intent.putExtra(R.string.NAMA_PUT_EXTRA.toString(), nama)
                intent.putExtra(R.string.JK_PUT_EXTRA.toString(), jk)
                intent.putExtra(R.string.UMUR_PUT_EXTRA.toString(), umur)
                startActivity(intent)
            }
        }
    }
    fun onRadioButtonClicked(view: View) {
        if (view is RadioButton) {
            val checked = view.isChecked

            when (view.getId()) {
                R.id.radio_laki ->
                    if (checked) {
                        jk = radio_laki.text.toString()
                    }
                R.id.radio_perem ->
                    if (checked) {
                        jk = radio_perem.text.toString()
                    }
            }
        }
    }
}
