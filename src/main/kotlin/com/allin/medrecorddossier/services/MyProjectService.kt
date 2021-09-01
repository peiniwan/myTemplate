package com.allin.medrecorddossier.services

import com.intellij.openapi.project.Project
import com.allin.medrecorddossier.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
