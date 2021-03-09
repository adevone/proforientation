package io.adev.proforientation

import android.graphics.Color
import android.icu.lang.UCharacter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.FrameLayout
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val rootView: ViewGroup = FrameLayout(this)

        val credentialsView = LinearLayout(this)
        val credentialsLayoutParams = FrameLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT)
        credentialsView.layoutParams = credentialsLayoutParams
        credentialsLayoutParams.gravity = Gravity.CENTER
        credentialsView.orientation = LinearLayout.VERTICAL

        rootView.layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        )

        val loginEdit = EditText(this)
        val loginEditLayoutParams = FrameLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT)
        loginEdit.layoutParams = loginEditLayoutParams
        loginEditLayoutParams.gravity = Gravity.LEFT
        loginEdit.hint = "Логин"

        credentialsView.addView(loginEdit)

        val passwordEdit = EditText(this)
        val passwordEditLayoutParams = FrameLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT)
        passwordEdit.layoutParams = passwordEditLayoutParams
        passwordEditLayoutParams.gravity = Gravity.LEFT
        passwordEdit.hint = "Пароль"

        credentialsView.addView(passwordEdit)

        val confirmButtonEdit = Button(this)
        val confirmButtonEditLayoutParams = FrameLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT)
        confirmButtonEdit.layoutParams = confirmButtonEditLayoutParams
        confirmButtonEditLayoutParams.gravity = Gravity.BOTTOM
        confirmButtonEdit.hint = "Вход"

        rootView.addView(confirmButtonEdit)

        rootView.addView(credentialsView)

        setContentView(rootView)

//        val redView: ViewGroup = FrameLayout(this)
//        redView.setBackgroundColor(Color.parseColor("#F44336"))
//        redView.layoutParams = ViewGroup.LayoutParams(
//            ViewGroup.LayoutParams.MATCH_PARENT,
//            ViewGroup.LayoutParams.MATCH_PARENT
//        )
//
//        val greenView = View(this)
//        greenView.setBackgroundColor(Color.parseColor("#1DE9B6"))
//        greenView.layoutParams = FrameLayout.LayoutParams(
//            ViewGroup.LayoutParams.MATCH_PARENT,
//            200
//        )
//
//        val blueView = View(this)
//        blueView.setBackgroundColor(Color.parseColor("#0277BD"))
//        val blueViewLayoutParams = FrameLayout.LayoutParams(
//            100,
//            ViewGroup.LayoutParams.MATCH_PARENT
//        )
//        blueViewLayoutParams.gravity = Gravity.CENTER
//        blueViewLayoutParams.leftMargin
//        blueView.layoutParams = blueViewLayoutParams
//
//        redView.addView(greenView)
//        redView.addView(blueView)
//
//        setContentView(redView)
    }
}