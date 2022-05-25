package com.plcoding.dictionary.feature_dictionary.data.remote.dto

import com.plcoding.dictionary.feature_dictionary.domain.model.Meaning


data class MeaningDto(
    val partOfSpeech: String,
    val definitions: List<DefinitionDto>
)

fun MeaningDto.toMeaning(): Meaning {
    return Meaning(
        partOfSpeech = partOfSpeech,
        definitions = definitions.map { it.toDefinition() }
    )
}