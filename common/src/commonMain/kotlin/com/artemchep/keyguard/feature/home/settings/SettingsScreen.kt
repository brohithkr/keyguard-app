package com.artemchep.keyguard.feature.home.settings

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import com.artemchep.keyguard.feature.navigation.LocalNavigationNodeVisualStack
import com.artemchep.keyguard.feature.navigation.NavigationRouter
import com.artemchep.keyguard.feature.twopane.TwoPaneNavigationContent
import com.artemchep.keyguard.ui.screenMaxWidthCompact

@Composable
fun SettingsScreen() {
    // Vault screen actually does not add any depth to the
    // navigation stack, it just renders sub-windows.
    val visualStack = LocalNavigationNodeVisualStack.current
        .run {
            removeAt(lastIndex)
        }
    CompositionLocalProvider(
        LocalNavigationNodeVisualStack provides visualStack,
    ) {
        NavigationRouter(
            id = SettingsRoute.ROUTER_NAME,
            initial = SettingListRoute,
        ) { backStack ->
            TwoPaneNavigationContent(
                backStack,
                detailPaneMaxWidth = screenMaxWidthCompact,
            )
        }
    }
}
