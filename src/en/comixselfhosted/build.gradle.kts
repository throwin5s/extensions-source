plugins {
    alias(kei.plugins.extension)
}

keiyoushi {
    name = "Comix Self Hosted"
    className = "Comix"
    versionCode = 1
    contentWarning = ContentWarning.NSFW
    libVersion = "1.4"

    deeplink {
        host("comix.to")
        host("www.comix.to")
        path("/title/..*")
    }
}
