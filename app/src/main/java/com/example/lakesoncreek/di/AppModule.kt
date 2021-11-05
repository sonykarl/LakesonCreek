package com.example.lakesoncreek.di

import com.example.lakesoncreek.Domain.repository.LakesonRepository
import com.example.lakesoncreek.data.repository.LakesonRepositoryImp
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)

object AppModule {

    @Provides
    @Singleton
    fun providelakesonrepo(): LakesonRepository{
        return LakesonRepositoryImp()
    }

}