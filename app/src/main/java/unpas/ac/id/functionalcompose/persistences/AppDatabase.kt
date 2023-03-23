package unpas.ac.id.functionalcompose.persistences

import  androidx.room.Database
import  androidx.room.RoomDatabase
import  unpas.ac.id.functionalcompose.model.PenjualanBuah

@Database(entities = [PenjualanBuah::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun PenjualanBuahDao(): PenjualanBuahDao
}