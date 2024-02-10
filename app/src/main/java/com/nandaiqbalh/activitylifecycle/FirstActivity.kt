package com.nandaiqbalh.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.nandaiqbalh.activitylifecycle.databinding.ActivityFirstBinding
import com.nandaiqbalh.activitylifecycle.databinding.ActivitySecondBinding

class FirstActivity : AppCompatActivity() {

	private var _binding: ActivityFirstBinding? = null
	private val binding get() = _binding!!

	private val TAG = "FIRST ACTIVITY"
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		Log.d(TAG, "ON CREATE CALLED")

		// initialize view binding and set the activity content
		_binding = ActivityFirstBinding.inflate(layoutInflater)
		setContentView(binding.root)

		// set up an action listener
		binding.btnNavigateTo2.setOnClickListener {
			val intent = Intent(this@FirstActivity, SecondActivity::class.java)
			startActivity(intent)
		}
	}

	override fun onStart() {
		super.onStart()
		Log.d(TAG, "ON START CALLED")

		// Example: Start a background service when the activity starts
		startBackgroundService()
	}

	override fun onResume() {
		super.onResume()
		Log.d(TAG, "ON RESUME CALLED")

		// Example: Resume video playback when the activity is in the foreground
		resumeVideoPlayback()
	}

	override fun onPause() {
		super.onPause()
		Log.d(TAG, "ON PAUSE CALLED")

		// Example: Pause video playback when the activity is about to go into the background
		pauseVideoPlayback()
	}

	override fun onStop() {
		super.onStop()
		Log.d(TAG, "ON STOP CALLED")

		// Example: Stop a background service when the activity is no longer visible
		stopBackgroundService()
	}

	override fun onDestroy() {
		super.onDestroy()
		Log.d(TAG, "ON DESTROY CALLED")

		// Example: Release resources or perform cleanup when the activity is destroyed
		releaseResources()
		_binding = null
	}

	private fun startBackgroundService() {
		// Your implementation to start a background service
		Log.d(TAG, "Background Service Started")
	}

	private fun stopBackgroundService() {
		// Your implementation to stop a background service
		Log.d(TAG, "Background Service Stopped")
	}

	private fun resumeVideoPlayback() {
		// Your implementation to resume video playback
		Log.d(TAG, "Video Playback Resumed")
	}

	private fun pauseVideoPlayback() {
		// Your implementation to pause video playback
		Log.d(TAG, "Video Playback Paused")
	}

	private fun releaseResources() {
		// Your implementation to release resources or perform cleanup
		Log.d(TAG, "Resources Released")
	}
}