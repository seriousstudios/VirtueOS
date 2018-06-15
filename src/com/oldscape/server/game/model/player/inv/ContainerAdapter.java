package com.oldscape.server.game.model.player.inv;

import com.oldscape.server.game.model.item.Item;

/**
 * An adapter for the {@link ContainerListener}.
 *
 * @author Graham
 */
public abstract class ContainerAdapter implements ContainerListener {

    @Override
    public void capacityExceeded(ItemContainer inventory) {

    }

    @Override
    public void itemsUpdated(ItemContainer inventory) {

    }

    @Override
    public void itemUpdated(ItemContainer inventory, int slot, Item item) {

    }

}