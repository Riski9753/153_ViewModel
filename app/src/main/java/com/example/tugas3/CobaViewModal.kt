package com.example.dataform

import android.provider.ContactsContract.CommonDataKinds.Email
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CobaViewModel : ViewModel() {
    var namaUsr: String by mutableStateOf("") //revised
        private set
    var noTlp: String by mutableStateOf("")
        private set
    var alamatUsr: String by mutableStateOf("")
        private  set
    var jenisKl: String by mutableStateOf("")
        private set
    var textEmail: String by mutableStateOf("")
        private set
    var setatusnya: String by mutableStateOf("")
        private set

    private val _uiState = MutableStateFlow(Dataform())
    val uiState: StateFlow<Dataform> = _uiState.asStateFlow()

    fun insertData(nm: String, tlp: String, almt: String, jk: String, email: String, sts: String) {
        namaUsr = nm
        noTlp = tlp
        alamatUsr = almt
        jenisKl = jk
        textEmail = email
        setatusnya = sts
    }


    fun  setJenisK(pilihJK: String) {
        _uiState.update { currentState -> currentState.copy(sex = pilihJK) }
    }


}