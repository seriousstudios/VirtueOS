package com.oldscape.server.game.model.entity.player.inv;

import com.oldscape.server.game.model.entity.item.Item;
import com.oldscape.server.game.model.entity.player.Player;
import com.oldscape.server.game.model.sync.block.SynchronizationBlock;

/**
 * An {@link ContainerListener} which updates the account's appearance when any
 * items are updated.
 *
 * @author Graham
 */
public final class AppearanceContainerListener extends ContainerAdapter {

    /**
     * The account.
     */
    private final Player player;

    /**
     * Creates the appearance inventory listener.
     *
     * @param player The account.
     */
    public AppearanceContainerListener(Player player) {
        this.player = player;
    }

    @Override
    public void itemsUpdated(ItemContainer inventory) {
        player.getBlockSet().add(
                SynchronizationBlock.createAppearanceBlock(player));
    }

    @Override
    public void itemUpdated(ItemContainer inventory, int slot, Item item) {
        player.getBlockSet().add(
                SynchronizationBlock.createAppearanceBlock(player));
    }

}