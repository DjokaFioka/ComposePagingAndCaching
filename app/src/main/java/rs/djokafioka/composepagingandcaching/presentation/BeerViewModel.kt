package rs.djokafioka.composepagingandcaching.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.cachedIn
import androidx.paging.map
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.map
import rs.djokafioka.composepagingandcaching.data.local.BeerEntity
import rs.djokafioka.composepagingandcaching.data.mappers.toBeer
import javax.inject.Inject

/**
 * Created by Djordje on 11.7.2023..
 */
@HiltViewModel
class BeerViewModel @Inject constructor(
    pager: Pager<Int, BeerEntity>
): ViewModel() {

    val beerPagingFlow = pager
        .flow
        .map { pagingData ->
            pagingData.map { it.toBeer() }
        }
        .cachedIn(viewModelScope)
}