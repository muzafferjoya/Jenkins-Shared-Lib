def call(String project, String ImageTag, String hubUser){
    sh """
    trivy image --format template --template "@/usr/local/share/trivy/templates/html.tpl" -o report.html --severity HIGH,CRITICAL ${hubUser}/${project}:latest
    """
}

// There are 3 types of report output format of trivy ( Table , JSON, Template). I used html template for output report of trivy scan

// trivy image --format template --template "@/usr/local/share/trivy/templates/html.tpl" -o report.html ${hubUser}/${project}:latest > scan.txt
// trivy image ${hubUser}/${project}:latest > scan.txt
// cat scan.txt
// trivy image ${hubUser}/${project}:latest > scan.txt
// cat scan.txt
