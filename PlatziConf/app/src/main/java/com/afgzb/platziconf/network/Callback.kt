package com.afgzb.platziconf.network

import java.lang.Exception

/*Implements functions for usage of external services*/
interface Callback<T> {
    // Callback<T>, T allows the input of any date type

    fun onSuccess(result: T?) {

    }

    fun onFailed(exception: Exception) {

    }
}