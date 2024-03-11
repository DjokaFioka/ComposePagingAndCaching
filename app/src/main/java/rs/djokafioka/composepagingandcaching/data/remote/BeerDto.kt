package rs.djokafioka.composepagingandcaching.data.remote

/**
 * Created by Djordje on 11.7.2023..
 */
data class BeerDto(
    val id: Int,
    val name: String,
    val tagline: String,
    val description: String,
    val first_brewed: String,
    val image_url: String?
)