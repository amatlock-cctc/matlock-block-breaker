package com.cctc.amatlock.test;

import java.awt.*;

public class Block extends CoreObject {
    /**
     * Creates the core object. All subclasses
     * will call this with super.
     * The super call to the Rectangle class.
     *
     * @param x
     * @param y
     * @param width
     * @param height
     * @param color
     */
    public Block(int x, int y, int width, int height, Color color) {
        super(x, y, width, height, color);
    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}
