package other.allin

import com.android.tools.idea.wizard.template.Template
import com.android.tools.idea.wizard.template.WizardTemplateProvider
import other.allin.activity.allInactivityTemplate
import other.allin.adapter.allInAdapterTemplate
import other.allin.fragment.allInFragmentTemplate

/**
 * 1. 实现WizardTemplateProvider
 */
class SamplePluginTemplateProviderImpl : WizardTemplateProvider() {

    override fun getTemplates(): List<Template> = listOf(
        // activity的模板
        allInactivityTemplate,
        allInAdapterTemplate,
        // fragment的模板
        allInFragmentTemplate
    )
}