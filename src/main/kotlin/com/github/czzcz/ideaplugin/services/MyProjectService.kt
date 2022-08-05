package com.github.czzcz.ideaplugin.services

import com.intellij.openapi.project.Project
import com.github.czzcz.ideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
