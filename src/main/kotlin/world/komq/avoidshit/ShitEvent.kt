/*
 * Copyright (c) 2021 ContentManager
 *
 *  Licensed under the General Public License, Version 3.0 (the "License");
 *  you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://opensource.org/licenses/gpl-3.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package world.komq.avoidshit

import org.bukkit.GameMode
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.plugin.Plugin

/**
 * @author ContentManager
 */

class ShitEvent : Listener {
    private fun getInstance(): Plugin {
        return ShitMain.instance
    }

    private val config = getInstance().config

    private val playerNames = config.getString("player-names").toString()

    @EventHandler
    fun onPlayerJoinEvent(e: PlayerJoinEvent) {
        val p = e.player

        if (!playerNames.contains(p.name)) {
            p.gameMode = GameMode.SPECTATOR
        }
        p.gameMode = p.gameMode
    }
}