job('First-Maven-Project-Via-DSL'){
    description("First Maven Job Generated By The DSL On ${new Date()}, for testing dsl")
    scm{
        git("git@github.com:suyash-metha/MavenRepo.git",matser)
    }
    triggers{
        scm('* * * * *')
    }
    steps{
        maven('clean package','JenkinDemo/pom.xml')
    }
    publishers{
        // archive the war file which is generated
        archiveArtifacts '**/*.jar'
    }
}