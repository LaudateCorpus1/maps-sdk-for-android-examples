/*
 * Copyright (c) 2015-2020 TomTom N.V. All rights reserved.
 *
 * This software is the proprietary copyright of TomTom N.V. and its subsidiaries and may be used
 * for internal evaluation purposes or commercial use strictly subject to separate licensee
 * agreement between you and TomTom. If you are the licensee, you are only permitted to use
 * this Software in accordance with the terms of your license agreement. If you are not the
 * licensee then you are not authorised to use this software in any manner and should
 * immediately return it to TomTom N.V.
 */
package com.tomtom.online.sdk.samples.ktx.utils.driving

import android.location.Location

import com.tomtom.online.sdk.map.Chevron
import com.tomtom.online.sdk.map.ChevronPosition

open class ChevronSimulatorUpdater(private var chevron: Chevron) : BaseSimulator.SimulatorCallback {

    override fun onNewRoutePointVisited(location: Location) {
        val chevronPosition = ChevronPosition.Builder(location).build()
        chevron.position = chevronPosition
        chevron.isDimmed = false
        chevron.show()
    }
}