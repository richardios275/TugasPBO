package com.hydrozoa.pokemon.model.world;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.GridPoint2;

public class WildGrass extends WorldObject {


    public WildGrass (int x, int y, TextureRegion texture, float sx, float sy, GridPoint2 tile) {
        super(x, y, true, texture, sx, sy, tile);
    }

    public WildGrass (int x, int y, TextureRegion texture, float sx, float sy, GridPoint2[] tile) {
        super(x, y, true, texture, sx, sy, tile);
    }
}
