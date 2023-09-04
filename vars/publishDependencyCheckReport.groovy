// File: vars/publishDependencyCheckReport.groovy

def call(String reportFileName) {
        
            // Archive the Dependency-Check HTML report as an artifact
            archiveArtifacts artifacts: "reports/${reportFileName}", allowEmptyArchive: true

            // Publish the Dependency-Check report to Jenkins
            publishHTML(target: [
                allowMissing: false,
                alwaysLinkToLastBuild: true,
                keepAll: true,
                reportDir: 'reports',
                reportFiles: "${reportFileName}",
                reportName: 'Dependency-Check Report',
                reportTitles: 'Dependency-Check Report'
            ])
        }
