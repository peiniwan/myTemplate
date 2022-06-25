package other.mvp.activity

import com.android.tools.idea.wizard.template.ModuleTemplateData
import com.android.tools.idea.wizard.template.RecipeExecutor
import other.mvp.activity.res.layout.mvpActivityXml
import other.mvp.activity.src.app_package.contract.mvpContract
import other.mvp.activity.src.app_package.mvpBasePresenter
import other.mvp.activity.src.app_package.mvpBaseView
import other.mvp.activity.src.app_package.p.mvpPresenter
import other.mvp.activity.src.app_package.v.mvpActivityKt

fun RecipeExecutor.mvpActivityRecipe(
    moduleData: ModuleTemplateData,
    activityClass: String,
    layoutName: String,
    packageName: String
) {

    val (projectData, srcOut, resOut) = moduleData
    var ktOrJavaExt = projectData.language.extension
    ktOrJavaExt = "java"

    val mvpActivity = mvpActivityKt(packageName, activityClass, layoutName, packageName)
    // 保存Activity
    save(mvpActivity, srcOut.resolve("mvp/${activityClass}Activity.${ktOrJavaExt}"))
    // 保存xml
//    save(mvpActivityXml(packageName, activityClass), resOut.resolve("layout/${layoutName}.xml"))
    save(mvpActivityXml(packageName, activityClass),
            resOut.resolve("layout/main_${layoutName}.xml"))
//    try {
//        // 判断BaseView类是否存在，如果不存在则创建保存
//        val forName = Class.forName("${packageName}.BaseView")
//    } catch (e: Exception) {
//        save(mvpBaseView(packageName), srcOut.resolve("BaseView.${ktOrJavaExt}"))
//    }
//
//    try {
//        // 判断BasePresenter类是否存在，如果不存在则创建保存
//        val forName = Class.forName("${packageName}.BasePresenter")
//    } catch (e: Exception) {
//        save(mvpBasePresenter(packageName), srcOut.resolve("BasePresenter.${ktOrJavaExt}"))
//    }

    // 保存Contract
    save(mvpContract(packageName,activityClass), srcOut.resolve("mvp/${activityClass}Contract.${ktOrJavaExt}"))
    // 保存Presenter
    save(mvpPresenter(packageName,packageName,activityClass), srcOut.resolve("mvp/${activityClass}Presenter.${ktOrJavaExt}"))
}