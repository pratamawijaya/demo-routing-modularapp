package com.pratama.onboarding

import android.content.Intent
import com.github.florent37.application.provider.Provider
import com.pratama.routing.Routes

class OnboardRouteProvider : Provider() {
    override fun provide() {
        Routes.Onboard.register { context ->
            Intent(context, OnboardingActivity::class.java)
        }
    }
}