package az.entech.cleanarchitecturecompose.common.database

import androidx.room.Database
import androidx.room.RoomDatabase
import az.entech.cleanarchitecturecompose.question.FavoriteQuestion

@Database(
    entities = [
        FavoriteQuestion::class
    ],
    version = 1
)
abstract class MyRoomDatabase: RoomDatabase() {
    abstract val favoriteQuestionDao: FavoriteQuestionDao
}