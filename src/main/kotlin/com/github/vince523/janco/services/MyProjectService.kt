package com.github.vince523.janco.services

import com.intellij.openapi.project.Project
import com.github.vince523.janco.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
