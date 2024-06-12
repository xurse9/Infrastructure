pipelineJob('frontend') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        credentials("")
                        url("https://github.com/xurse9/Frontend.git")
                    }
                    branches('master')
                    scriptPath('Jenkinsfile')
                }
            }
        }
    }
}