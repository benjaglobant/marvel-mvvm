package com.globant.marvelmvvm.contract

import androidx.lifecycle.LiveData
import com.globant.marvelmvvm.data.entity.Character
import com.globant.marvelmvvm.util.Data
import com.globant.marvelmvvm.util.Event
import com.globant.marvelmvvm.util.Result
import kotlinx.coroutines.Job

interface AllCharactersContract {
    interface ViewModel {
        fun fetchAllCharacters(): Job
        fun getAllCharactersLiveData(): LiveData<Event<Data<List<Character>>>>
    }

    interface Model {
        fun getAllCharacters(): Result<List<Character>>
}
}