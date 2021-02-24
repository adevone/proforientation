package io.adev.proforientation

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.FrameLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val redView: ViewGroup = FrameLayout(this)
        redView.setBackgroundColor(Color.parseColor("#F44336"))
        redView.layoutParams = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT
        )

        val greenView = View(this)
        greenView.setBackgroundColor(Color.parseColor("#1DE9B6"))
        greenView.layoutParams = FrameLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            200
        )

        val blueView = View(this)
        blueView.setBackgroundColor(Color.parseColor("#0277BD"))
        val blueViewLayoutParams = FrameLayout.LayoutParams(
            100,
            ViewGroup.LayoutParams.MATCH_PARENT
        )
        blueViewLayoutParams.gravity = Gravity.CENTER
        blueViewLayoutParams.leftMargin
        blueView.layoutParams = blueViewLayoutParams

        redView.addView(greenView)
        redView.addView(blueView)

        setContentView(redView)
    }
}