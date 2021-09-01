package other.allin.activity

fun manifestXml(isNewModule: Boolean, ativityPackageName: String, activityClass: String) = """
<manifest
xmlns:android="http://schemas.android.com/apk/res/android">

    <application>
    """ + if (isNewModule){
    """
          <activity android:name="${ativityPackageName}.${activityClass}"
                       android:screenOrientation="portrait">
	        <intent-filter>
	            <action android:name="android.intent.action.MAIN" />
	            <category android:name="android.intent.category.LAUNCHER" />
	        </intent-filter>
	    </activity>  
        """
}else{
    """<activity android:name="${ativityPackageName}.${activityClass}"/>"""
} +

        """       
    </application>
</manifest>
"""
