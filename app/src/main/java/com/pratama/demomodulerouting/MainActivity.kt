package com.pratama.demomodulerouting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.florent37.navigator.Navigator
import com.pratama.routing.Routes

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Navigator.of(this).push(Routes.Onboard)
    }
}
