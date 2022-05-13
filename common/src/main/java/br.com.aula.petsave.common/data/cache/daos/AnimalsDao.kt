package com.raywenderlich.android.petsave.common.data.cache.daos

import androidx.room.*
import br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedAnimalWithDetails
import br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedPhoto
import br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedTag
import br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedVideo
import com.raywenderlich.android.petsave.common.data.cache.model.cachedanimal.CachedAnimalAggregate
import io.reactivex.Flowable

@Dao
abstract class AnimalsDao {

    @Transaction
    @Query("SELECT * FROM animals ORDER BY animalId DESC")
    abstract fun getAllAnimals(): Flowable<List<CachedAnimalAggregate>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract suspend fun insertAnimalAggregate(
        animal: CachedAnimalWithDetails,
        photos: List<CachedPhoto>,
        videos: List<CachedVideo>,
        tags: List<CachedTag>
    )

    suspend fun insertAnimalsWithDetails(animalAggregates: List<CachedAnimalAggregate>) {
        for (animalAggregate in animalAggregates) {
            insertAnimalAggregate(
                animalAggregate.animal,
                animalAggregate.photos,
                animalAggregate.videos,
                animalAggregate.tags
            )
        }
    }

    @Query("SELECT DISTINCT type FROM animals")
    abstract suspend fun getAllTypes(): List<String>

    @Transaction
    @Query("""
    SELECT * FROM animals
      WHERE name LIKE '%' || :name || '%' AND
      AGE LIKE '%' || :age || '%'
      AND type LIKE '%' || :type || '%'
  """)
    abstract fun searchAnimalsBy(
        name: String,
        age: String,
        type: String
    ): Flowable<List<CachedAnimalAggregate>>
}
