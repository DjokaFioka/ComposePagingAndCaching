package rs.djokafioka.composepagingandcaching.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

/**
 * Created by Djordje on 11.7.2023..
 */
@Database(
    entities = [BeerEntity::class],
    version = 1
)
abstract class BeerDatabase : RoomDatabase() {
    abstract val dao: BeerDao
}