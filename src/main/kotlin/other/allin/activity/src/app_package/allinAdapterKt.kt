package other.allin.activity

/**
 * 4. 创建mvvmAcitivityKt。
这个文件用于创建Activity的模板代码，根据自己的情况，自行调整。
 */
fun allinAcitivityKt(
    applicationPackage: String?,
    activityClass: String,
    layoutName: String,
    packageName: String
) = """
package ${packageName}
import android.os.Bundle
import com.allin.basicres.base.BaseActivity
import kotlinx.android.synthetic.main.medrecord_${layoutName}.*
class ${activityClass}Activity : BaseActivity() {

   override fun onBeforeSetContentLayout() {
        super.onBeforeSetContentLayout()
        var name = intent.getStringExtra("name") ?: ""
    }


    override fun getLayoutResource(): Int {
        return R.layout.medrecord_${layoutName}
    }


     override fun onInitView() {
        super.onInitView()
    }

    override fun onInitData() {
        super.onInitData()
    }
}    
 
"""