public class GridSquare {
    private int id;
    private Room room;
    private String icon;

    public GridSquare(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }

}
