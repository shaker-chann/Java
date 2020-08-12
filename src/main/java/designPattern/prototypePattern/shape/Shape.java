package designPattern.prototypePattern.shape;

/**
 * @Description:
 * @PackageName: designPattern.prototypePattern.shape
 * @Author: csc
 * @Create: 2020-08-12 17:33
 * @Version: 1.0
 */
public abstract class Shape implements Cloneable {
    private String id;
    protected String type;

    public abstract void draw();
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
