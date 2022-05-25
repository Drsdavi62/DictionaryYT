package com.plcoding.dictionary.feature_dictionary.domain.model


data class Meaning(
    val partOfSpeech: String,
    val definitions: List<Definition>
)