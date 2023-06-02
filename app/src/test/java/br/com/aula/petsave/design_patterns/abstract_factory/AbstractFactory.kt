package br.com.aula.petsave.design_patterns.abstract_factory

import com.google.common.truth.Truth
import org.junit.Test
import java.lang.IllegalArgumentException

interface DataSource

class NetworkDataSource: DataSource
class DatabaseDataSource: DataSource

abstract class DataSourceFactory {
    abstract fun makeDataSource(): DataSource

    companion object {
        inline  fun <reified T: DataSource> createFactory(): DataSourceFactory =
            when(T::class) {
                DatabaseDataSource::class -> DatabaseFactory()
                NetworkDataSource::class -> NetworkFactory()
                else -> throw IllegalArgumentException()
            }
    }
}

class NetworkFactory: DataSourceFactory() {
    override fun makeDataSource(): DataSource = NetworkDataSource()
}

class DatabaseFactory: DataSourceFactory() {
    override fun makeDataSource(): DataSource = DatabaseDataSource()
}

class AbstractFactoryTest {
    @Test
    fun afTest(){
        val databaseFactory = DataSourceFactory.createFactory<DatabaseDataSource>()
        val dataSource = databaseFactory.makeDataSource()
        println("Created datasource $dataSource")


        Truth.assertThat(dataSource).isInstanceOf(DatabaseDataSource::class.java)

    }
}