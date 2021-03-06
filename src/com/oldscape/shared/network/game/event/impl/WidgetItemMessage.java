package com.oldscape.shared.network.game.event.impl;

import com.oldscape.shared.event.Event;

import java.util.NoSuchElementException;
import java.util.OptionalInt;

public class WidgetItemMessage implements Event {

    /**
     * The item id.
     */
    private final int id;

    /**
     * The interface id.
     */
    private final int widgetId;

    /**
     * The option number (1-5 if present).
     */
    private final OptionalInt option;

    /**
     * The item's slot.
     */
    private final int slot;

    /**
     * Creates the WidgetItemMessage.
     *
     * @param option      The option number, if applicable.
     * @param interfaceId The interface id.
     * @param id          The id.
     * @param slot        The slot.
     */
    protected WidgetItemMessage(OptionalInt option, int widgetId, int id, int slot) {
        this.option = option;
        this.widgetId = widgetId;
        this.id = id;
        this.slot = slot;
    }

    /**
     * Gets the item id.
     *
     * @return The item id.
     */
    public final int getId() {
        return id;
    }

    /**
     * Gets the interface id.
     *
     * @return The interface id.
     */
    public final int getWidgetId() {
        return widgetId;
    }

    /**
     * Gets the option number.
     *
     * @return The option number.
     * @throws NoSuchElementException If there is no option.
     */
    public final int getOption() {
        return option.getAsInt();
    }

    /**
     * Gets the slot.
     *
     * @return The slot.
     */
    public final int getSlot() {
        return slot;
    }

    /**
     * Returns whether or not this WidgetItemMessage has an option number.
     *
     * @return {@code true} iff this WidgetItemMessage has an option number.
     */
    public final boolean hasOption() {
        return option.isPresent();
    }

}
