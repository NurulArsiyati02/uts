package id.ac.nurul_arsiyati_budaya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()

        //Simpan data

        data?.add(DataModel(R.drawable.gitar,"GITAR","Alat Musik Gitar ","Gitar merupakan " +
                "Gitar adalah alat musik yang termasuk dalam keluarga chordophone, karena bunyinya berasal dari senar yang dipetik menggunakan jari maupun pick."))

        data?.add(DataModel(R.drawable.drum,"DRUM","Alat Musik Drum", "Drum merupakan " +
                "Drum adalah kelompok alat musik perkusi yang terdiri dari kulit yang direntangkan dan dipukul dengan tangan atau sebuah batang."))

        data?.add(DataModel(R.drawable.suling,"SERULING","Alat Musik Seruling", "Seruling merupakan " +
                "Seruling adalah alat musik melodis tradisional, yang berasal dari daerah Jawa Barat. Alat musik ini sudah sangat jarang dimainkan di era modern seperti sekarang ini. Namun di beberapa sekolah, masih ada pelajaran untuk memainkan seruling."))

        data?.add(DataModel(R.drawable.bass,"BASS","Alat Musik Bass", "Bass merupakan " +
                "Gitar bas elektrik (biasa disebut gitar bas, bas elektrik atau bas saja) adalah alat musik dawai yang menggunakan listrik untuk memperbesar suaranya"))

        data?.add(DataModel(R.drawable.ukulele,"UKULELE","Alat Musik Ukulele", "Ukulele merupakan " +
                "Ukulele adalah alat musik petik sejenis gitar berukuran kecil, sekitar 20 inci, dan merupakan alat musik asli Hawaii ditemukan sekitar tahun 1879, Alat musik 'Ukulele' dalam bahasa hawaii artinya 'kutu loncat'." ))

        data?.add(DataModel(R.drawable.piano,"PIANO","Alat Musik Piano", "Piano merupakan" +
                "Piano (yang juga disebut pianoforte) adalah alat musik tuts yang diklasifikasikan sebagai instrumen dawai dan perkusi yang dimainkan dengan menekan tuts-tuts pada papan piano."))

        data?.add(DataModel(R.drawable.terompet,"TEROMPET","Alat Musik Terompet", "Terompet merupakat " +
                "Terompet adalah alat musik tiup logam. Terletak pada jajaran tertinggi di antara tuba, eufonium, trombon, sousafon, French horn, dan Bariton. "))

        data?.add(DataModel(R.drawable.gendang,"GENDANG","Alat Musik Gendang", "Gendang merupakan " +
                "Gendang merupakan alat musik tradisional yang dimainkan dengan cara dipukul. Alat musik gendang terbuat dari kayu dengan selaput atau membran pada sisinya."))

        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("harga", item?.harga)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }
        })
    }
}