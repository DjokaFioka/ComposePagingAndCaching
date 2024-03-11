package rs.djokafioka.composepagingandcaching.data.mappers

import rs.djokafioka.composepagingandcaching.data.local.BeerEntity
import rs.djokafioka.composepagingandcaching.data.remote.BeerDto
import rs.djokafioka.composepagingandcaching.domain.Beer

/**
 * Created by Djordje on 11.7.2023..
 */

fun BeerDto.toBeerEntity(): BeerEntity{
    return BeerEntity(
        id = id,
        name = name,
        tagline = tagline,
        description = description,
        firstBrewed = first_brewed,
        imageUrl = image_url
    )
}

fun BeerEntity.toBeer(): Beer {
    return Beer(
        id = id,
        name = name,
        tagline = tagline,
        description = description,
        firstBrewed = firstBrewed,
        imageUrl = imageUrl
    )
}