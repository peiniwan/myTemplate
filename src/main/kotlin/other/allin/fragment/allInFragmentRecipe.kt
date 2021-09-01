package other.allin.fragment

import com.android.tools.idea.wizard.template.ModuleTemplateData
import com.android.tools.idea.wizard.template.RecipeExecutor
import other.allin.fragment.src.app_package.allinFragmentKt
import other.allin.fragment.src.res.layout.allinFragmentXml

/**
 * 3. 创建mvvmActivityRecipe.kt。
这个文件用于将创建的文件保存到文件夹中，例如Activity，布局文件等。
原计划将Activity直接添加到AndroidManifest里，但是发现generateManifest有点问题，
导致生成的插件不能使用，暂时去掉，只能手动添加了。
 */
fun RecipeExecutor.allInFragmentRecipe(
    moduleData: ModuleTemplateData,
    activityClass: String,
    layoutName: String,
    packageName: String
) {
    val (projectData, srcOut, resOut) = moduleData
    var ktOrJavaExt = projectData.language.extension
    ktOrJavaExt = "kt"  //todo 不知为何老是java

    //实际创建的文件包路径都是在这个文件的save方法中决定
    val allinFragment = allinFragmentKt(projectData.applicationPackage, activityClass, layoutName, packageName)
    // 保存Fragment
    save(allinFragment, srcOut.resolve("${activityClass}Fragment.${ktOrJavaExt}"))
    // 保存xml
    save(
        allinFragmentXml(packageName, activityClass),
        resOut.resolve("layout/medrecord_${layoutName}.xml")
    )
}