package com.oldscape.shared.network.game.event.impl;

import com.oldscape.shared.event.Event;

/**
 * @author Giovanni
 */
public class ObjectActionEvent implements Event {

    /**
     * The object that was clicked.
     */
    private int object;
    /**
     * The object type.
     */
    private int type;
    /**
     * The X coordinate of the object.
     */
    private int x;
    /**
     * The Y coordinate of the object.
     */
    private int y;

    /**
     * The action slot of the clicked object
     */

    private int actionSlot;

    /**
     * The constructor of this class setting the X , Y and the object ID.
     */
    public ObjectActionEvent(int actionSlot, int object, int type, int x, int y) {
        this.actionSlot = actionSlot;
        this.object = object;
        this.type = type;
        this.x = x;
        this.y = y;
    }

    /**
     * To get the object
     *
     * @return <code>object</code>
     */
    public int getObject() {
        return object;
    }

    public int getType() {
        return type;
    }

    /**
     * To get the X coordinate of the object
     *
     * @return <code>x</code>
     */
    public int getX() {
        return x;
    }

    /**
     * To get the Y coordinate of the object
     *
     * @return <code>y</code>
     */
    public int getY() {
        return y;
    }

    /**
     * To get the clicked action slot of the object
     *
     * @return <code>actionSlot</code>
     */
    public int getActionSlot() {
        return actionSlot;
    }

}
