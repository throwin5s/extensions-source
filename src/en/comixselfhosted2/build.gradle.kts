plugins {
    alias(kei.plugins.extension)
}

keiyoushi {
    name = "Comix Self Hosted 2"
    className = "Comix"
    versionCode = 35
    contentWarning = ContentWarning.NSFW
    libVersion = "1.4"

    deeplink {
        host("comix.to")
        host("www.comix.to")
        path("/title/..*")
    }
}
