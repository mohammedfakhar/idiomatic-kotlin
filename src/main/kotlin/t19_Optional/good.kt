package t19_Optional.good

fun processOptional(x: String?) {
    val s = x ?: "Unknown"
    val firstChar = x?.firstOrNull()
}
