package io.adev.proforientation

import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.FrameLayout
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val rootView = layoutInflater.inflate(
            R.layout.main_activity,
            null
        )

        setContentView(rootView)

//        val rootView = FrameLayout(this)
//        rootView.layoutParams = ViewGroup.LayoutParams(
//            ViewGroup.LayoutParams.MATCH_PARENT,
//            ViewGroup.LayoutParams.MATCH_PARENT
//        )
//
//        val credentialsView = LinearLayout(this)
//        credentialsView.orientation = LinearLayout.VERTICAL
//        val credentialsLayoutParams = FrameLayout.LayoutParams(
//            ViewGroup.LayoutParams.MATCH_PARENT,
//            ViewGroup.LayoutParams.WRAP_CONTENT
//        )
//        credentialsView.layoutParams = credentialsLayoutParams
//        credentialsLayoutParams.gravity = Gravity.CENTER
//        rootView.addView(credentialsView)
//
//        val loginEdit = EditText(this)
//        val loginEditLayoutParams = FrameLayout.LayoutParams(
//            ViewGroup.LayoutParams.MATCH_PARENT,
//            ViewGroup.LayoutParams.WRAP_CONTENT
//        )
//        loginEdit.layoutParams = loginEditLayoutParams
//        loginEditLayoutParams.gravity = Gravity.LEFT
//        loginEdit.hint = "Логин"
//        credentialsView.addView(loginEdit)
//
//        val passwordEdit = EditText(this)
//        val passwordEditLayoutParams = FrameLayout.LayoutParams(
//            ViewGroup.LayoutParams.MATCH_PARENT,
//            ViewGroup.LayoutParams.WRAP_CONTENT
//        )
//        passwordEdit.layoutParams = passwordEditLayoutParams
//        passwordEditLayoutParams.gravity = Gravity.LEFT
//        passwordEdit.hint = "Пароль"
//        credentialsView.addView(passwordEdit)
//
//        val confirmButtonEdit = Button(this)
//        val confirmButtonEditLayoutParams = FrameLayout.LayoutParams(
//            ViewGroup.LayoutParams.MATCH_PARENT,
//            ViewGroup.LayoutParams.WRAP_CONTENT
//        )
//        confirmButtonEdit.layoutParams = confirmButtonEditLayoutParams
//        confirmButtonEditLayoutParams.gravity = Gravity.BOTTOM
//        confirmButtonEdit.hint = "Вход"
//        rootView.addView(confirmButtonEdit)
//
//        setContentView(rootView)
    }
}