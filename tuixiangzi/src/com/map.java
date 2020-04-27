package com;

import java.awt.*;

public class map {
    private Image hero = Toolkit.getDefaultToolkit().getImage("./tuixiangzi/src/images/Character4.png");
    private Image Wall = Toolkit.getDefaultToolkit().getImage("./tuixiangzi/src/images/Wall_Brown.png");
    private Image Wall_one = Toolkit.getDefaultToolkit().getImage("./tuixiangzi/src/images/Wall_Black.png");
    private Image Wall_two = Toolkit.getDefaultToolkit().getImage("./tuixiangzi/src/images/Wall_Gray.png");
    private Image Wall_three = Toolkit.getDefaultToolkit().getImage("./tuixiangzi/src/images/Wall_Beige.png");
    private Image Floor = Toolkit.getDefaultToolkit().getImage("./tuixiangzi/src/images/GroundGravel_Sand.png");
//    private Image Floor_one = Toolkit.getDefaultToolkit().getImage("./tuixiangzi/src/images/GroundGravel_Concrete.png");
    private Image xiangzi = Toolkit.getDefaultToolkit().getImage("./tuixiangzi/src/images/Crate_Yellow.png");
//    private Image xiangzi_one = Toolkit.getDefaultToolkit().getImage("./tuixiangzi/src/images/Crate_Purple.png");
    private Image jiangli = Toolkit.getDefaultToolkit().getImage("./tuixiangzi/src/images/jiangli.png");
    private Image zhongdian = Toolkit.getDefaultToolkit().getImage("./tuixiangzi/src/images/GroundGravel_Grass.png");
    static byte maps[][][] = {{
            {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
            {10, 0, 0, 0, 0, 0, 0, 5, 0, 0, 5, 0, 5, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10},
            {10, 0, 0, 0, 5, 5, 0, 0, 5, 5, 5, 0, 0, 5, 0, 0, 5, 0, 5, 0, 0, 5, 0, 0, 0, 5, 10},
            {10, 0, 0, 5, 0, 0, 0, 2, 0, 0, 0, 0, 5, 5, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 10},
            {10, 0, 0, 5, 0, 5, 0, 5, 0, 0, 0, 0, 4, 5, 0, 0, 5, 0, 5, 5, 0, 5, 0, 0, 0, 5, 10},
            {10, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 5, 0, 5, 0, 0, 5, 0, 0, 0, 0, 0, 0, 5, 0, 0, 10},
            {10, 0, 0, 5, 0, 4, 5, 5, 5, 0, 0, 0, 5, 1, 1, 1, 5, 0, 5, 0, 0, 0, 0, 5, 0, 0, 10},
            {10, 9, 5, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 1, 100, 0, 0, 0, 0, 0, 5, 0, 0, 5, 0, 0, 10},
            {10, 0, 5, 0, 0, 0, 5, 5, 5, 0, 0, 0, 0, 1, 1, 1, 0, 0, 5, 0, 0, 1, 0, 0, 0, 0, 10},
            {10, 0, 5, 5, 5, 0, 0, 0, 0, 0, 0, 5, 0, 0, 4, 0, 0, 0, 0, 0, 5, 5, 0, 5, 5, 0, 10},
            {10, 0, 5, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 5, 0, 5, 0, 0, 5, 5, 5, 10},
            {10, 0, 5, 0, 5, 0, 5, 5, 5, 5, 5, 5, 5, 5, 0, 0, 0, 0, 5, 0, 5, 5, 0, 0, 5, 0, 10},
            {10, 0, 5, 0, 5, 0, 5, 0, 0, 5, 0, 0, 0, 5, 0, 0, 5, 0, 0, 0, 0, 0, 0, 5, 0, 4, 10},
            {10, 0, 0, 0, 5, 0, 0, 0, 5, 0, 0, 5, 0, 4, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10},
            {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
    }, {
            {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
            {10, 0, 0, 1, 0, 0, 0, 5, 0, 0, 5, 0, 5, 0, 0, 0, 5, 0, 1, 0, 1, 0, 0, 1, 0, 0, 10},
            {10, 0, 0, 0, 0, 5, 0, 0, 5, 5, 5, 0, 0, 5, 0, 0, 5, 0, 5, 0, 0, 5, 0, 0, 0, 1, 10},
            {10, 0, 0, 5, 1, 0, 0, 5, 0, 0, 0, 0, 5, 5, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 10},
            {10, 0, 0, 5, 0, 5, 0, 5, 0, 0, 0, 0, 4, 5, 0, 0, 5, 0, 5, 1, 0, 2, 0, 0, 0, 1, 10},
            {10, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 2, 0, 5, 0, 0, 5, 0, 0, 0, 0, 0, 0, 5, 0, 0, 10},
            {10, 0, 0, 5, 0, 4, 5, 5, 5, 0, 0, 0, 5, 1, 1, 1, 5, 0, 5, 1, 1, 1, 1, 5, 2, 0, 10},
            {10, 9, 5, 0, 0, 1, 5, 0, 0, 0, 0, 0, 0, 1, 100, 0, 0, 0, 5, 0, 2, 0, 0, 5, 0, 0, 10},
            {10, 0, 5, 0, 0, 0, 5, 5, 5, 0, 0, 0, 0, 1, 1, 1, 0, 0, 5, 0, 0, 1, 0, 0, 0, 0, 10},
            {10, 0, 5, 5, 5, 0, 0, 0, 0, 0, 0, 1, 0, 0, 4, 0, 0, 0, 0, 0, 5, 1, 0, 5, 0, 0, 10},
            {10, 1, 5, 0, 0, 0, 0, 5, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 5, 0, 5, 0, 0, 5, 5, 5, 10},
            {10, 0, 5, 0, 5, 0, 5, 5, 5, 5, 5, 5, 5, 5, 0, 0, 0, 0, 5, 0, 5, 1, 0, 0, 5, 0, 10},
            {10, 1, 5, 0, 5, 1, 5, 0, 0, 5, 0, 0, 0, 5, 0, 0, 5, 0, 0, 0, 0, 0, 0, 5, 0, 4, 10},
            {10, 0, 0, 0, 5, 0, 0, 0, 5, 0, 0, 5, 0, 4, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10},
            {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
    },
            {
                    {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
                    {10, 0, 0, 1, 0, 0, 0, 5, 10, 0, 5, 0, 5, 10, 0, 0, 5, 0, 1, 0, 1, 0, 0, 1, 0, 0, 10},
                    {10, 0, 0, 10, 0, 5, 0, 0, 5, 5, 5, 0, 0, 0, 0, 0, 5, 0, 5, 0, 0, 5, 0, 10, 0, 1, 10},
                    {10, 0, 0, 5, 1, 0, 0, 5, 0, 0, 0, 0, 5, 5, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 10},
                    {10, 0, 0, 5, 0, 5, 0, 5, 0, 10, 0, 0, 4, 5, 0, 0, 5, 0, 5, 1, 0, 1, 0, 0, 0, 1, 10},
                    {10, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 2, 0, 5, 0, 0, 5, 0, 0, 0, 10, 0, 0, 5, 0, 5, 10},
                    {10, 0, 0, 5, 0, 4, 5, 2, 5, 0, 0, 0, 5, 1, 1, 1, 5, 0, 5, 1, 1, 1, 1, 5, 5, 5, 10},
                    {10, 9, 5, 0, 0, 1, 5, 0, 0, 0, 0, 0, 0, 1, 4, 0, 0, 0, 5, 0, 2, 0, 0, 5, 0, 0, 10},
                    {10, 0, 5, 0, 0, 0, 5, 5, 5, 10, 0, 0, 0, 1, 1, 1, 0, 0, 5, 0, 0, 1, 0, 0, 0, 0, 10},
                    {10, 0, 5, 5, 5, 0, 0, 0, 0, 0, 0, 1, 0, 0, 4, 0, 10, 0, 0, 0, 5, 1, 0, 5, 0, 0, 10},
                    {10, 0, 5, 0, 0, 0, 0, 5, 10, 0, 5, 0, 0, 0, 0, 0, 0, 0, 5, 0, 5, 0, 0, 5, 5, 5, 10},
                    {10, 0, 0, 0, 5, 0, 5, 5, 100, 5, 5, 5, 4, 5, 0, 0, 10, 0, 5, 0, 5, 1, 0, 0, 5, 0, 10},
                    {10, 1, 5, 0, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 5, 0, 4, 10},
                    {10, 0, 0, 0, 5, 0, 0, 10, 0, 0, 0, 5, 5, 4, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10},
                    {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
            },
            {
                    {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
                    {10, 0, 0, 3, 0, 0, 0, 3, 10, 0, 5, 0, 5, 10, 0, 0, 5, 0, 3, 0, 3, 0, 0, 3, 0, 0, 10},
                    {10, 0, 0, 10, 0, 5, 0, 0, 5, 3, 5, 0, 0, 0, 0, 0, 5, 0, 5, 3, 0, 5, 0, 0, 0, 3, 10},
                    {10, 0, 0, 5, 3, 0, 0, 5, 0, 0, 0, 0, 5, 5, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 10},
                    {10, 0, 0, 5, 3, 5, 0, 5, 0, 10, 0, 0, 4, 5, 0, 0, 5, 0, 5, 3, 0, 3, 0, 0, 0, 3, 10},
                    {10, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 2, 0, 5, 0, 0, 5, 0, 0, 0, 10, 0, 0, 5, 100, 5, 10},
                    {10, 0, 0, 5, 0, 4, 5, 2, 5, 0, 0, 0, 5, 3, 1, 3, 5, 0, 5, 3, 1, 3,3, 3, 5, 5, 10},
                    {10, 9, 5, 0, 0, 3, 5, 0, 0, 0, 0, 0, 0, 1, 4, 0, 0, 0, 5, 0, 2, 0, 0, 0, 0, 0, 10},
                    {10, 0, 3, 0, 0, 0, 5, 3, 5, 10, 0, 0, 0, 1, 1, 1, 0, 0, 5, 0, 0, 3, 0, 0, 0, 0, 10},
                    {10, 0, 3, 5, 5, 0, 0, 0, 0, 0, 5, 1, 0, 0, 4, 0, 10, 0, 0, 0, 5, 1, 0, 5, 0, 0, 10},
                    {10, 0, 5, 0, 0, 0, 0, 5, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 5, 0, 0, 5, 5, 5, 10},
                    {10, 0, 0, 0, 5, 0, 5, 3, 3, 3, 3, 5, 5, 5, 0, 0, 10, 0, 5, 0, 5, 1, 0, 0, 5, 0, 10},
                    {10, 3, 5, 0, 5, 3, 5, 0, 0, 5, 0, 0, 0, 5, 0, 0, 5, 0, 0, 0, 3, 0, 0, 5, 0, 4, 10},
                    {10, 0, 0, 0, 5, 0, 0, 10, 5, 0, 0, 5, 0, 4, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10},
                    {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
            },
    };
   int h = 0;
    int getMapsRow = maps[h].length;
    int getMapsColumn = maps[h][0].length;
    int image_width = 40;
    int image_height = 40;


    public void Draw(Graphics g, Frame frame) {
        for (int i = 0; i < getMapsRow; i++) {
            for (int j = 0; j < getMapsColumn; j++) {
                if (maps[h][i][j] == 100) {
                    g.drawImage(zhongdian, image_width * j + 6, image_height * i + 30, image_width, image_height, frame);
                } else if (maps[h][i][j] == 0) {
                    g.drawImage(Floor, image_width * j + 6, image_height * i + 30, image_width, image_height, frame);
                } else if (maps[h][i][j] == 1) {
                    g.drawImage(Wall_two, image_width * j + 6, image_height * i + 30, image_width, image_height, frame);
                } else if (maps[h][i][j] == 2) {
                    g.drawImage(xiangzi, image_width * j + 6, image_height * i + 30, image_width, image_height, frame);
                } else if (maps[h][i][j] == 3) {
                    g.drawImage(Wall_three, image_width * j + 6, image_height * i + 30, image_width, image_height, frame);
                } else if (maps[h][i][j] == 4) {
                    g.drawImage(Floor, image_width * j + 6, image_height * i + 30, image_width, image_height, frame);
                    g.drawImage(jiangli, image_width * j + 9, image_height * i + 33, image_width - 6, image_height - 6, frame);
                } else if (maps[h][i][j] == 5) {
                    g.drawImage(Wall, image_width * j + 6, image_height * i + 30, image_width, image_height, frame);
                }
//                else if (maps[h][i][j] == 6) {
////                    g.drawImage(Floor_one, image_width * j + 6, image_height * i + 30, image_width, image_height, frame);
////                }else if (maps[h][i][j] == 7) {
////                    g.drawImage(xiangzi_one, image_width * j + 6, image_height * i + 30, image_width, image_height, frame);
////                }
                else if (maps[h][i][j] == 9){
                    g.drawImage(Floor, image_width * j + 6, image_height * i + 30, image_width, image_height, frame);
                    g.drawImage(hero,52,310, 28, 40, frame);
                }
                 else if (maps[h][i][j] == 10) {
                    g.drawImage(Wall_one, image_width * j + 6, image_height * i + 30, image_width, image_height, frame);
                }
            }
        }
    }


}
