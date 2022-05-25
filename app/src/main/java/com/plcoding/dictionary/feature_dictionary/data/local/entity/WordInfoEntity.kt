package com.plcoding.dictionary.feature_dictionary.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.plcoding.dictionary.feature_dictionary.data.remote.dto.toMeaning
import com.plcoding.dictionary.feature_dictionary.domain.model.Meaning
import com.plcoding.dictionary.feature_dictionary.domain.model.WordInfo

@Entity
data class WordInfoEntity(
    val word: String,
    val phonetic: String?,
    val origin: String?,
    val meanings: List<Meaning>,

    @PrimaryKey(autoGenerate = true)
    val id: Int? = null
)

fun WordInfoEntity.toWordInfo(): WordInfo {
    return WordInfo(
        word = word,
        phonetic = phonetic ?: "",
        origin = origin ?: "",
        meanings = meanings
    )
}
