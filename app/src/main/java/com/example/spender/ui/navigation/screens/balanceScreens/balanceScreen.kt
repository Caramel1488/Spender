package com.example.spender.ui.navigation.screens.balanceScreens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.spender.ui.navigation.BalanceNavGraph
import com.example.spender.ui.navigation.screens.destinations.SpendingsScreenDestination
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@BalanceNavGraph(start = true)
@Destination
@Composable
fun BalanceScreen(
    navigator: DestinationsNavigator
) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Button(
            onClick = {
                navigator.navigate(SpendingsScreenDestination)
            }
        ) {
            Text("Balance screen")
        }
    }
}
