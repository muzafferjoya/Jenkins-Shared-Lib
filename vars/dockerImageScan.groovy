def call(String project, String ImageTag, String hubUser){
    sh """
    trivy image --format template --template "@/usr/local/share/trivy/templates/html.tpl" -o report.html ${hubUser}/${project}:latest > scan.txt
    cat scan.txt
    """
}

// --format template --template "@/usr/local/share/trivy/templates/html.tpl" -o report.html