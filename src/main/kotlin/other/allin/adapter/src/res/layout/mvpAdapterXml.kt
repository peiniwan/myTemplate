package other.allin.adapter.src.res.layout


fun allinAdapterXml(
    packageName: String,
    activityClass: String
) = """
<?xml version="1.0" encoding="utf-8"?>
<FrameLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
    
        <TextView
        android:layout_width="wrap_content"
        android:id="@+id/tv1"
        android:layout_height="wrap_content"/>

</FrameLayout>
"""