package com.github.vodkav.tt.services

import com.intellij.openapi.project.Project
import com.github.vodkav.tt.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
