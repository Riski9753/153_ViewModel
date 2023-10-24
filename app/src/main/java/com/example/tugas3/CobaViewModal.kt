package com.example.tugas3

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CobaViewModal : ViewModel () {
    var namaUsr: String by mutableStateOf("") //revised
        private set
    var noTlp: String by mutableStateOf("")
        private set
    var alamatUsr: String by mutableStateOf("")
        private  set
    var jenisKl: String by mutableStateOf("")
        private set
    private val _uiState = MutableStateFlow(Dataform())
    val uiState: StateFlow<Dataform> = _uiState.asStateFlow()

    fun insertData(nm: String, tlp: String, almt: String, jk: String){
        namaUsr = nm;
        noTlp = tlp;
        alamatUsr = almt;
        jenisKl = jk;
    }

    fun  setJenisK(pilihJK: String) {
        _uiState.update { currnentState -> currnentState.copy(sex = pilihJK) }
    }
}