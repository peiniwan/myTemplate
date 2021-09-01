package other.allin.adapter

/**
 * 4. 创建mvvmAcitivityKt。
这个文件用于创建Activity的模板代码，根据自己的情况，自行调整。
 */
fun allinAdapterKt(
    applicationPackage: String?,
    name: String,
    layoutName: String,
    packageName: String
) = """
package ${packageName}

import android.content.Context
import android.widget.TextView
import com.allin.commonadapter.ViewHolder
import com.allin.commonadapter.recyclerview.RecyclerViewBaseAdapter
import com.allin.medrecorddossier.R

class ${name}Adapter(
    mContext: Context,
    data: List<String>
) : RecyclerViewBaseAdapter<String>(
    mContext,
    R.layout.medrecord_item_${name.toLowerCase()},
    data
) {
    override fun convert(holder: ViewHolder?, item: String?, position: Int) {
        var tv1 = holder?.getView<TextView>(R.id.tv1)
    }
}
 
"""