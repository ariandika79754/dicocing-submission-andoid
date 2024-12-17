package com.hardeka.dicoding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.hardeka.dicoding.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_USEFOR = "extra_usefor"
        const val EXTRA_DEVICE = "extra_device"
        const val EXTRA_EXPLAIN = "extra_explain"
        const val EXTRA_YEAR = "extra_year"
        const val EXTRA_LAPTOP = "extra_laptop"
        const val EXTRA_PIC1 = "extra_pic1"
        const val EXTRA_PICBG = "extra_picbg"
        const val EXTRA_PIC2 = "extra_pic2"
        const val EXTRA_LINK = "extra_link"
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDetailBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        setContentView(binding.root)


        val tvLangName: TextView = findViewById(R.id.belajar_name)
        val tvLangUsefor: TextView = findViewById(R.id.belajar_uf)
        val tvLangDevice: TextView = findViewById(R.id.belajar_device)
        val tvLangExplain: TextView = findViewById(R.id.belajar_explain)
        val tvLangYear: TextView = findViewById(R.id.belajar_tahun)
        val tvLangWeapon: TextView = findViewById(R.id.belajar_laptop)
        val imgLangPic1: ImageView = findViewById(R.id.belajar_pic1)
        val imgLangPicbg: ImageView = findViewById(R.id.belajar_bg)
        val imgLangPic2: ImageView = findViewById(R.id.belajar_pic2)
        val favButton: ImageView = findViewById(R.id.fav_button)
        val shareButton: Button = findViewById(R.id.share_button)
        var fav = false

        val langName = intent.getStringExtra(EXTRA_NAME)
        val langUsefor = intent.getStringExtra(EXTRA_USEFOR)
        val langDevice = intent.getStringExtra(EXTRA_DEVICE)
        val langExplain = intent.getStringExtra(EXTRA_EXPLAIN)
        val langYear = intent.getStringExtra(EXTRA_YEAR)
        val langWeapon = intent.getStringExtra(EXTRA_LAPTOP)
        val langPic1 = intent.getIntExtra(EXTRA_PIC1, 0)
        val langPicbg = intent.getIntExtra(EXTRA_PICBG, 0)
        val langPic2 = intent.getIntExtra(EXTRA_PIC2, 0)
        val langLink = intent.getStringExtra(EXTRA_LINK)

        tvLangName.text = langName
        tvLangUsefor.text = langUsefor
        tvLangDevice.text = langDevice
        tvLangExplain.text = langExplain
        tvLangYear.text = langYear
        tvLangWeapon.text = langWeapon
        Glide.with(this)
            .load(langPic1)
            .apply(RequestOptions())
            .into(imgLangPic1)
        Glide.with(this)
            .load(langPicbg)
            .apply(RequestOptions())
            .into(imgLangPicbg)
        Glide.with(this)
            .load(langPic2)
            .apply(RequestOptions())
            .into(imgLangPic2)

        favButton.setOnClickListener {
            fav = if (!fav) {
                Toast.makeText(this, "Add To Favorite", Toast.LENGTH_SHORT).show()
                favButton.setImageResource(R.drawable.baseline_favorite_24)
                true
            } else {
                Toast.makeText(this, "Remove From Favorite", Toast.LENGTH_SHORT).show()
                favButton.setImageResource(R.drawable.baseline_favorite_border_24)
                false
            }
        }

        shareButton.setOnClickListener {
            val goShare = Intent()
            goShare.action = Intent.ACTION_SEND
            goShare.putExtra(Intent.EXTRA_TEXT, "Hey look and learn this programming language: $langLink")
            goShare.type = "text/plain"
            startActivity(Intent.createChooser(goShare, "Share To:"))
        }
        binding.tvToAbout.setOnClickListener {
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }
    }
}