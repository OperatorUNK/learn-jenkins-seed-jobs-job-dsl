folder('OBP')

pipelineJob('OBP/OBP-build') {
    definition {
        cpsScm {
            scm {
              git('git@github.com:OpenBankProject/OBP-CLI.git')
            }
        }
    }
}

