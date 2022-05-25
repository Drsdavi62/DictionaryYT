package com.plcoding.dictionary.feature_dictionary.data.remote.dto


import com.google.gson.annotations.SerializedName

data class PhoneticDto(
    val text: String,
    val audio: String
)