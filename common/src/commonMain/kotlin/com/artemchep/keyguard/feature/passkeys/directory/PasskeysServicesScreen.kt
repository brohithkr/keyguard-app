package com.artemchep.keyguard.feature.passkeys.directory

import androidx.compose.runtime.Composable
import com.artemchep.keyguard.feature.navigation.NavigationRouter
import com.artemchep.keyguard.feature.twopane.TwoPaneNavigationContent

@Composable
fun TwoFaServicesScreen() {
    NavigationRouter(
        id = PasskeysServicesRoute.ROUTER_NAME,
        initial = PasskeysServiceListRoute,
    ) { backStack ->
        TwoPaneNavigationContent(backStack)
    }
}
