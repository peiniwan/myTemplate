package com.github.peiniwan.mytemplate.services

import com.github.peiniwan.mytemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
