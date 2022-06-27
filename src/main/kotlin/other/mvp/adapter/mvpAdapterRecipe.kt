package other.mvp.adapter

import com.android.tools.idea.wizard.template.ModuleTemplateData
import com.android.tools.idea.wizard.template.RecipeExecutor
import other.mvp.adapter.app_package.mvpAdapterKt
import other.mvp.activity.res.layout.mvpActivityXml

fun RecipeExecutor.mvpAdapterRecipe(
        moduleData: ModuleTemplateData,
        activityClass: String,
        layoutName: String,
        packageName: String
) {

    val (projectData, srcOut, resOut) = moduleData
    var ktOrJavaExt = projectData.language.extension
    ktOrJavaExt = "java"

    val mvpActivity = mvpAdapterKt(packageName, activityClass, layoutName, packageName)
    // 保存Activity
    save(mvpActivity, srcOut.resolve("${activityClass}Adapter.${ktOrJavaExt}"))
    // 保存xml
//    save(mvpActivityXml(packageName, activityClass), resOut.resolve("layout/${layoutName}.xml"))
    save(mvpActivityXml(packageName, activityClass),
            resOut.resolve("layout/item_${layoutName}.xml"))

}