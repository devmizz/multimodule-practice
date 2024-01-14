fun <T> Boolean?.ifTrue(function: () -> T): T? = if (this == true) function() else null

