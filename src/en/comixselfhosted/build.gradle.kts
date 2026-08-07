import io.github.keiyoushi.gradle.api.ContentWarning

plugins {
    alias(kei.plugins.extension)
}

android {
    buildTypes {
        named("release") {
            isMinifyEnabled = false
        }
    }
}

keiyoushi {
    name = "Comix Self Hosted"
    versionCode = 39
    contentWarning = ContentWarning.NSFW
    libVersion = "1.4"

    source {
        lang = "en"
        baseUrl = "https://comix.to"
    }

    deeplink {
        host("comix.to")
        host("www.comix.to")
        path("/title/..*")
    }
}
