package com.artemchep.keyguard.feature.tfa.directory

import androidx.compose.runtime.Composable
import com.artemchep.keyguard.feature.navigation.NavigationRouter
import com.artemchep.keyguard.feature.twopane.TwoPaneNavigationContent

@Composable
fun TwoFaServicesScreen() {
    NavigationRouter(
        id = TwoFaServicesRoute.ROUTER_NAME,
        initial = TwoFaServiceListRoute,
    ) { backStack ->
        TwoPaneNavigationContent(backStack)
    }
}
