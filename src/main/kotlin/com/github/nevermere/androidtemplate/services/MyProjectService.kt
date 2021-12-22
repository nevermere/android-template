package com.github.nevermere.androidtemplate.services

import com.intellij.openapi.project.Project
import com.github.nevermere.androidtemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
