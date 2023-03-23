package unpas.ac.id.functionalcompose.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class PenjualanBuah(
    @PrimaryKey val id: String,
    val nama_buah: String,
    val stok: String,
    val harga: String,
    val deskripsi: String
)
