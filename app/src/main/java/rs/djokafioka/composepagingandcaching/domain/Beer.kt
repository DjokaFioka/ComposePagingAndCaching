package rs.djokafioka.composepagingandcaching.domain

/**
 * Created by Djordje on 11.7.2023..
 */
data class Beer(
    val id: Int,
    val name: String,
    val tagline: String,
    val description: String,
    val firstBrewed: String,
    val imageUrl: String?
)
