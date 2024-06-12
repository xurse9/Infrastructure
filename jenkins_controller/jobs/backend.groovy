pipelineJob('backend') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        credentials("")
                        url("https://github.com/xurse9/Backend.git")
                    }
                    branches('master')
                    scriptPath('Jenkinsfile')
                }
            }
        }
    }
}