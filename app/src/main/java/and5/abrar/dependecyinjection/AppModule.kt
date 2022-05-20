package and5.abrar.dependecyinjection

import and5.abrar.dependecyinjection.tugas1.Nilai
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun namamurid() : Student{
        return Student()
    }
    @Singleton
    @Provides
    fun NilaiKonversi() : Nilai{
        return Nilai()
    }
}