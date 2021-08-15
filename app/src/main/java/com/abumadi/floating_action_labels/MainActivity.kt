package com.abumadi.floating_action_labels

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        SignUp_btn.setOnClickListener {

            val fullname = fullNameEd.text
            val Email = EmailED.text
            val Password = PassWordED.text
            var isValid = true



            if (fullname.isNotEmpty()) {
                isValid = true
                fullNamedTIL.isErrorEnabled = false
            } else {
                fullNamedTIL.error = "input valid name"
                isValid = false
            }
            if (Email.isNotEmpty()) {
                isValid = true
                EmailTIL.isErrorEnabled = false
            } else {
                EmailTIL.error = "input valid E_mail"
                isValid = false
            }
            if (Password.isNotEmpty()) {
                isValid = true
                PasswordTIL.isErrorEnabled = false
            } else {
                PasswordTIL.error = "input valid password"
                isValid = false

            }

        if (isValid) Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT).show()


    }
}
}
