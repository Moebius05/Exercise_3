//He also has the methods canHangPainting and hangPainting.
//In the canHangPainting Derek checks if he has a tool called hammer. If so he returns true, otherwise false.
//In the hangPainting method, if Derek canHangPainting it will say he can hang the painting. Otherwise he will say that he’s missing the hammer.

public class Derek {
    private Tool tool;

    public void setTool(Tool tool) {
        this.tool = tool;
    }
    public void hangPainting(){
        if (canHangPainting()){
            System.out.println("He can hang the painting!");
        }
        else
        {
            System.out.println("He is missing the hammer!");
        }
    }
    public boolean canHangPainting() {

        return tool != null && tool.getName() == "Hammer";
    }
}
