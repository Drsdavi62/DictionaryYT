package com.plcoding.dictionary.feature_dictionary.data.remote.dto


import com.plcoding.dictionary.feature_dictionary.domain.model.Definition

data class DefinitionDto(
    val definition: String,
    val example: String?,
    val synonyms: List<String>,
    val antonyms: List<String>
)

fun DefinitionDto.toDefinition(): Definition {
    return Definition(
        definition = definition,
        example = example,
        synonyms = synonyms,
        antonyms = antonyms
    )
}