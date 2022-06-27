package other.mvp

import com.android.tools.idea.wizard.template.Template
import com.android.tools.idea.wizard.template.WizardTemplateProvider
import other.mvp.activity.mvpActivityTemplate
import other.mvp.adapter.adapterTemplate
import other.mvp.fragment.mvpFragmentTemplate



class MVPTemplateProviderImpl: WizardTemplateProvider() {


    override fun getTemplates(): List<Template> {
        return listOf(
            // activity 模板
            mvpActivityTemplate,
            // fragment的模板
            mvpFragmentTemplate,
            // adapter的模板
           adapterTemplate,
        )
    }
}