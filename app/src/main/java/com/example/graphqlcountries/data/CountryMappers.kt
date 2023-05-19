package com.example.graphqlcountries.data

import com.example.GetCountriesQuery
import com.example.graphqlcountries.domain.SimpleCountry

fun GetCountriesQuery.Country.toSimpleCountry() = SimpleCountry(
    code = code,
    name = name
)