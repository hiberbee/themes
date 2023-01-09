plugins {
  id("idea")
  id("java")
  id("org.jetbrains.kotlin.jvm") version "1.8.0"
  id("org.jetbrains.gradle.plugin.idea-ext") version "1.1.7"
  id("com.github.ben-manes.versions") version "0.44.0"
  id("org.jetbrains.intellij") version "1.11.0"
}

group = "com.hiberbee"
version = System.getenv("APP_VERSION")

repositories {
  mavenCentral()
}

tasks {

  compileKotlin {
    kotlinOptions.jvmTarget = JavaVersion.VERSION_11.toString()
  }


  intellij {
    type.set("IC")
    version.set("2022.3")
    configureDefaultDependencies.set(true)
    updateSinceUntilBuild.set(true)
    downloadSources.set(true)
  }

  runIde {
    systemProperties["idea.auto.reload.plugins"] = false
    jvmArgs = listOf("-Xms512m", "-Xmx2048m")
  }

  buildSearchableOptions {
    enabled = false
  }

  publishPlugin {
    token.set(System.getenv("JETBRAINS_TOKEN"))
  }

  patchPluginXml {
    changeNotes.set("Compatibility fixes related to new UI changes in 2022.3")
    sinceBuild.set("223")
  }

}
