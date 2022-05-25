package com.plcoding.dictionary.feature_dictionary.data.remote.dto

import com.plcoding.dictionary.feature_dictionary.data.local.entity.WordInfoEntity
import com.plcoding.dictionary.feature_dictionary.domain.model.WordInfo


data class WordInfoDto(
    val word: String,
    val phonetic: String?,
    val phonetics: List<PhoneticDto>,
    val origin: String?,
    val meanings: List<MeaningDto>
)

fun WordInfoDto.toWordInfo(): WordInfo {
    return WordInfo(
        word = word,
        phonetic = phonetic ?: "",
        origin = origin ?: "",
        meanings = meanings.map { it.toMeaning() }
    )
}

fun WordInfoDto.toWordInfoEntity(): WordInfoEntity {
    return WordInfoEntity(
        word = word,
        phonetic = phonetic,
        origin = origin,
        meanings = meanings.map { it.toMeaning() }
    )
}