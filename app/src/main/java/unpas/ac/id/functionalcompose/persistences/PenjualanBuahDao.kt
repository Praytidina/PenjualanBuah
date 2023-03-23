package unpas.ac.id.functionalcompose.persistences

import androidx.lifecycle.LiveData
import androidx.room.*
import unpas.ac.id.functionalcompose.model.PenjualanBuah

@Dao
interface PenjualanBuahDao {

    @Query("SELECT * FROM PenjualanBuah")
    fun loadAll () : LiveData<List<PenjualanBuah>>

    @Query("SELECT * FROM PenjualanBuah WHERE id = :id")
    fun find(id: String): PenjualanBuah?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll (vararg items: PenjualanBuah)

    @Delete
    fun delete(item: PenjualanBuah)

}