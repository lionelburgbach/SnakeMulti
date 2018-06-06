package gen.snakemulti.sprites;

import com.badlogic.gdx.graphics.Texture;
import server.GameConstants;


public class Consumable {

    private float x;
    private float y;

    private Texture texture;

    public Consumable() {

    }

    public Consumable(float x, float y, Texture texture) {
        if(x < 0 || x > GameConstants.WIDTH) {
            throw new IllegalArgumentException("invalid coordinate (x axis).");
        }
        if(y < 0 || y > GameConstants.HEIGHT) {
            throw new IllegalArgumentException("invalid coordinate (y axis).");
        }
        if(texture == null) {
            throw new IllegalArgumentException("null texture.");
        }

        this.x = x;
        this.y = y;
        this.texture = texture;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        if(x >= 0 && x <= GameConstants.WIDTH) {
            this.x = x;
        }
    }

    public void setY(float y) {
        if(y >= 0 && y <= GameConstants.HEIGHT) {
            this.y = y;
        }
    }
}