package com.nandaiqbalh.activitylifecycle

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

@SuppressLint("CustomSplashScreen")
class SplashscreenActivity : AppCompatActivity() {
	private val SPLASH_TIMEOUT: Long = 3000 // 3 detik

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_splashscreen)

		// Handler untuk menangani penundaan
		Handler().postDelayed({
			// Intent untuk pindah ke activity berikutnya setelah penundaan
			val intent = Intent(this, FirstActivity::class.java)
			startActivity(intent)
			finish() // Tutup activity saat ini agar tidak bisa kembali ke splash screen
		}, SPLASH_TIMEOUT)
	}
}