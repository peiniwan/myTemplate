package other.mvp.adapter

import com.android.tools.idea.wizard.template.*
import com.android.tools.idea.wizard.template.impl.activities.common.MIN_API


/**
 *  这个文件是设置在创建 Adapter 的时候，输入的信息，
 *  例如 ActivityName，layoutName, packageName
 */
val adapterTemplate
    get() = template {
//        revision = 1
        name = "MVP Adapter"
        description = "创建adapter"
        minApi = MIN_API
//        minBuildApi = MIN_API

        category = Category.Other
        formFactor = FormFactor.Mobile
        screens = listOf(WizardUiContext.ActivityGallery, WizardUiContext.MenuEntry, WizardUiContext.NewProject, WizardUiContext.NewModule)

        lateinit var layoutName: StringParameter

        val activityClass = stringParameter {
            name = "Adapter Name"
            default = "Adapter"
            help = "只输入名字，不要包含Adapter"
            constraints = listOf(Constraint.NONEMPTY)
        }

        layoutName = stringParameter {
            name = "Layout Name"
            default = "item_"
            help = "请输入布局的名字"
            constraints = listOf(Constraint.LAYOUT, Constraint.UNIQUE, Constraint.NONEMPTY)
            suggest = { camelCaseToUnderlines(activityClass.value.toLowerCase()) }
        }

        val packageName = defaultPackageNameParameter

        widgets(
            TextFieldWidget(activityClass),
            TextFieldWidget(layoutName),
            PackageNameWidget(packageName)
        )
//        thumb { File("logo.png") }
        recipe = { data: TemplateData ->
            mvpAdapterRecipe(
                data as ModuleTemplateData,
                activityClass.value,
                layoutName.value,
                packageName.value)
        }
    }

val defaultPackageNameParameter
    get() = stringParameter {
        name = "Package name"
        visible = { !isNewModule }
        default = "com.tal.publish"
        constraints = listOf(Constraint.PACKAGE)
        suggest = { packageName }
    }