package com.github.mikusugar.intellijplatformplugindemo.services

import com.github.mikusugar.intellijplatformplugindemo.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
