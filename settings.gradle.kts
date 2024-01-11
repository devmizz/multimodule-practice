rootProject.name = "multimodule-practice"

include(":common")

include(":app")

include(":app:presentation")

include(":app:application")
include(":app:application:user-application")

include(":app:domain")
include(":app:domain:user-domain")
