package other.allin.fragment.src.app_package

/**
 * 4. 创建mvvmAcitivityKt。
这个文件用于创建Activity的模板代码，根据自己的情况，自行调整。
 */
fun allinFragmentKt(
    applicationPackage: String?,
    fileName: String,
    layoutName: String,
    packageName: String
) = """
package ${packageName}

import android.os.Bundle
import android.view.View
import com.allin.basicres.base.allin.BaseFragment
import com.allin.medrecorddossier.R

class ${fileName}Fragment :BaseFragment()  {

  companion object {
        fun newInstance(bundle: Bundle?):  ${fileName}Fragment {
            val fragment =  ${fileName}Fragment()
            fragment.arguments = bundle
            return fragment
        }
    }
    
   override fun getFragmentLayoutId(): Int {
        return R.layout.medrecord_${layoutName}
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun init(view: View?) {
        super.init(view)
    }
}    
 
"""