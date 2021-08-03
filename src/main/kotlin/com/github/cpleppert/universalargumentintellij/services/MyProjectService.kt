package com.github.cpleppert.universalargumentintellij.services

import com.github.cpleppert.universalargumentintellij.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
