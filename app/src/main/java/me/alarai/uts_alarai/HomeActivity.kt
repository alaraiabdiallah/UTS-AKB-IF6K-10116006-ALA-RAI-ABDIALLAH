package me.alarai.uts_alarai
/*
* NIM : 10116006
* Nama: Ala Rai AbdiAllah
* Kelas: IF-6K
* Tanggal Pengerjaan : 16 Mei 2020
* Deskripsi Pekerjaan: Membuat Home Activity
* */
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val nama = intent.getStringExtra(R.string.NAMA_PUT_EXTRA.toString())
        val jk = intent.getStringExtra(R.string.JK_PUT_EXTRA.toString())
        val umur = intent.getStringExtra(R.string.UMUR_PUT_EXTRA.toString())
        home_hello.text = "${nama} ${jk} ${umur} tahun Berhasil Ditambahkan. Silahkan Gunakan Kode Ini Untuk Masuk Kedalam Aplikasi Anak"
    }
}
