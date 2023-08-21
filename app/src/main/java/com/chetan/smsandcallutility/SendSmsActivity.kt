package com.chetan.smsandcallutility

import android.os.Bundle
import android.widget.Toolbar
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.chetan.smsandcallutility.ui.theme.SmsAndCallUtilityTheme
import com.google.android.material.appbar.MaterialToolbar

class SendSmsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_send_sms)
        findViewById<MaterialToolbar>(R.id.sendBulkSmsToolbar).title = "Send Sms"
        val toolbar : Toolbar = findViewById<MaterialToolbar>(R.id.sendBulkSmsToolbar) as Toolbar
        setActionBar( toolbar )
        actionBar?.setDisplayHomeAsUpEnabled(true)
    }
}

