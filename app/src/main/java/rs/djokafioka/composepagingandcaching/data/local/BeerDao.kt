package rs.djokafioka.composepagingandcaching.data.local

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert

/**
 * Created by Djordje on 11.7.2023..
 */
@Dao
interface BeerDao {
    @Upsert
    suspend fun upsertAll(beers: List<BeerEntity>)

    @Query("SELECT * FROM beers")
    fun pagingSource(): PagingSource<Int, BeerEntity>

    @Query("DELETE FROM beers")
    suspend fun clearAll()
}