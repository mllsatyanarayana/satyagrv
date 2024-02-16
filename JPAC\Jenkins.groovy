pipeline {
    agent any
    
    stages {
        stage('Call PowerShell Script') {
            steps {
                script {
                    // Define the path to your PowerShell script
                    def powershellScriptPath = 'path/to/your/powershell_script.ps1'
                    
                    // Execute the PowerShell script
                    bat "powershell.exe -NonInteractive -ExecutionPolicy Bypass -File ${powershellScriptPath}"
                }
            }
        }
    }
}
