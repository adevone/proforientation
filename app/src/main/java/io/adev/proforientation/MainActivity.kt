package io.adev.proforientation

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val rootView = layoutInflater.inflate(
            R.layout.main_activity,
            null
        )

        val loginButton: Button = rootView.findViewById(R.id.loginButton)

        loginButton.setOnClickListener { view ->
            loginButton.text = "HOLA!"
        }

        loginButton.text = "123"

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