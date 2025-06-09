// package com.iprateek01.echojar;
  
// import android.app.Activity
// import android.content.Intent
// import android.os.Bundle

// class BrowserLauncherActivity : Activity() {
//   override fun onCreate(savedInstanceState: Bundle?) {
//     super.onCreate(savedInstanceState)
//     val application = application as MainApplication
//     if (!application.isActivityInBackStack(MainActivity::class.java)) {
//       val intent = Intent(this, MainActivity::class.java)
//       startActivity(intent)
//     }
//     finish()
//   }
// }

package com.iprateek01.echojar

import android.app.Activity
import android.content.Intent
import android.os.Bundle

class BrowserLauncherActivity : Activity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    
    // Launch MainActivity with flags to handle back stack properly
    val intent = Intent(this, MainActivity::class.java)
    intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
    startActivity(intent)
    finish()
  }
}
