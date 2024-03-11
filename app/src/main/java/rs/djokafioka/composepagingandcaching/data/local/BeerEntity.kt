package rs.djokafioka.composepagingandcaching.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by Djordje on 11.7.2023..
 */
@Entity(tableName = "beers")
data class BeerEntity(
    @PrimaryKey
    val id: Int,
    val name: String,
    val tagline: String,
    val description: String,
    val firstBrewed: String,
    val imageUrl: String?
)
