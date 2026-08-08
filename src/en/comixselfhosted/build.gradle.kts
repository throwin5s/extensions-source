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
    versionCode = 40
    contentWarning = ContentWarning.NSFW
    libVersion = "1.4"

    source {
        lang = "en"
        baseUrl {
            mirrors(
                "https://comix.to",
                "https://comix.ws",
            )
        }
    }

    deeplink {
        host("comix.to")
        host("www.comix.to")
        host("comix.ws")
        host("www.comix.ws")
        path("/title/..*")
    }
}
