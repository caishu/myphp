node {
   
   stage('Clone sources') {
        echo 'clone source...'
    }

    stage('Build') {
        echo 'build...'
    }

    stage('Publish build info') {
        echo 'publish...'
    }
}
