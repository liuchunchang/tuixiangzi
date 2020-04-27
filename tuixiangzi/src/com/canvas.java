package com;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class canvas extends Frame implements KeyListener, ActionListener{
    private Image iBuffer;
    private Graphics gBuffer;

    private Image hero_up = Toolkit.getDefaultToolkit().getImage("./tuixiangzi/src/images/Character7.png");
    private Image hero_down = Toolkit.getDefaultToolkit().getImage("./tuixiangzi/src/images/Character4.png");
    private Image hero_right = Toolkit.getDefaultToolkit().getImage("./tuixiangzi/src/images/Character2.png");
    private Image hero_left = Toolkit.getDefaultToolkit().getImage("./tuixiangzi/src/images/Character1.png");


    private Image WIN = Toolkit.getDefaultToolkit().getImage("./tuixiangzi/src/images/yingle.png");
    private Image shenli = Toolkit.getDefaultToolkit().getImage("./tuixiangzi/src/images/guoguan.png");
    map map = new map();
    Timer timer;
    int screen_width = Toolkit.getDefaultToolkit().getScreenSize().width;
    int screen_heiht = Toolkit.getDefaultToolkit().getScreenSize().height;
    int width = 1092;
    int height = 636;
    int hero_x = 52;
    int hero_y = 310;
    int h = map.h;

    boolean win = false;
    boolean shengli = false;
    boolean hero_d = true;
    boolean hero_u = true;
    boolean hero_r = true;
    boolean hero_l = true;
    int fenshu = 0;


    canvas() {
        setTitle("推箱子游戏");
        setBounds((screen_width - width) / 2, (screen_heiht - height) / 2, width, height);
        setVisible(true);
        setResizable(false);
        addKeyListener(this);
        timer = new Timer(3000, this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.out.println("退出");
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        if (shengli == false) {
            map.Draw(g, this);
            if (hero_d) {
                g.drawImage(hero_down, hero_x, hero_y, 28, 40, this);
                hero_d = false;
            } else if (hero_u) {
                g.drawImage(hero_up, hero_x, hero_y, 28, 40, this);
                hero_u = false;
            } else if (hero_l) {
                g.drawImage(hero_left, hero_x, hero_y, 28, 40, this);
                hero_l = false;
            } else if (hero_r) {
                g.drawImage(hero_right, hero_x, hero_y, 28, 40, this);
                hero_r = false;
            }

            if (win) {
                g.drawImage(WIN, 146, 198, 800, 240, this);
                timer.start();
                removeKeyListener(this);
            }
        } else {
            g.setColor(Color.white);
            g.drawImage(shenli, 281, 233, 530, 170, this);
            g.setColor(Color.black);
            g.setFont(new Font("微软雅黑", Font.PLAIN, 30));
            g.drawString("总分数："+ fenshu,490,220);
        }


    }


    @Override
    public void update(Graphics scr) {
        if (iBuffer == null) {
            iBuffer = createImage(this.getSize().width, this.getSize().height);
            gBuffer = iBuffer.getGraphics();
        }
        gBuffer.setColor(getBackground());
        gBuffer.fillRect(0, 0, this.getSize().width, this.getSize().height);
        paint(gBuffer);
        scr.drawImage(iBuffer, 0, 0, this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        map.maps[h][7][1]=0;
        String keyText = KeyEvent.getKeyText(e.getKeyCode());
        //hero的中心点坐标
        float hero_X = (hero_x - 6 + 11) / map.image_width;
        float hero_Y = (hero_y - 30 + 18) / map.image_height;
        int k = Math.round(hero_X);
        int l = Math.round(hero_Y);
        if ((keyText.equals("向下箭头")) || (keyText.equals("S"))) {
            hero_d = true;
            if (map.maps[h][l + 1][k] == 0) {
                hero_y = hero_y + 40;
            } else if (map.maps[h][l + 1][k] == 4) {
                map.maps[h][l + 1][k] = 0;
                hero_y = hero_y + 40;
                fenshu++;
            } else if (map.maps[h][l + 1][k] == 2 && map.maps[h][l + 2][k] == 0) {
                map.maps[h][l + 2][k] = 2;
                map.maps[h][l + 1][k] = 0;
                hero_y = hero_y + 40;
            } else if (map.maps[map.h][l + 1][k] == 2 && map.maps[h][l + 2][k] == 100) {
                map.maps[h][l + 2][k] = 2;
                map.maps[h][l + 1][k] = 0;
                hero_y = hero_y + 40;
                win = true;
            }
            repaint();
        } else if ((keyText.equals("向上箭头")) || (keyText.equals("W"))) {
            hero_u = true;
            if (map.maps[h][l - 1][k] == 0) {
                hero_y = hero_y - 40;
            } else if (map.maps[h][l - 1][k] == 4) {
                map.maps[h][l - 1][k] = 0;
                hero_y = hero_y - 40;
                fenshu++;
            } else if (map.maps[h][l - 1][k] == 2 && map.maps[h][l - 2][k] == 0) {
                map.maps[map.h][l - 2][k] = 2;
                map.maps[map.h][l - 1][k] = 0;
                hero_y = hero_y - 40;
            } else if (map.maps[h][l - 1][k] == 2 && map.maps[h][l - 2][k] == 100) {
                map.maps[h][l - 2][k] = 2;
                map.maps[h][l - 1][k] = 0;
                hero_y = hero_y - 40;
                win = true;
            }
            repaint();
        } else if ((keyText.equals("向左箭头")) || (keyText.equals("A"))) {
            hero_l = true;
            if (map.maps[h][l][k - 1] == 0) {
                hero_x = hero_x - 40;
            } else if (map.maps[h][l][k - 1] == 4) {
                map.maps[h][l][k - 1] = 0;
                hero_x = hero_x - 40;
                fenshu++;
            } else if (map.maps[h][l][k - 1] == 2 && map.maps[h][l][k - 2] == 0) {
                map.maps[h][l][k - 2] = 2;
                map.maps[h][l][k - 1] = 0;
                hero_x = hero_x - 40;
            } else if (map.maps[h][l][k - 1] == 2 && map.maps[h][l][k - 2] == 100) {
                map.maps[h][l][k - 2] = 2;
                map.maps[h][l][k - 1] = 0;
                hero_x = hero_x - 40;
                win = true;
            }
            repaint();
        } else if ((keyText.equals("向右箭头")) || (keyText.equals("D"))) {
            hero_r = true;
            if (map.maps[h][l][k + 1] == 0) {
                hero_x = hero_x + 40;
            }
            if (map.maps[h][l][k + 1] == 4) {
                map.maps[h][l][k + 1] = 0;
                hero_x = hero_x + 40;
                fenshu++;
            } else if (map.maps[h][l][k + 1] == 2 && map.maps[h][l][k + 2] == 0) {
                map.maps[h][l][k + 2] = 2;
                map.maps[h][l][k + 1] = 0;
                hero_x = hero_x + 40;
            } else if (map.maps[h][l][k + 1] == 2 && map.maps[h][l][k + 2] == 100) {
                map.maps[h][l][k + 2] = 2;
                map.maps[h][l][k + 1] = 0;
                hero_x = hero_x + 40;
                win = true;
            }
            repaint();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        win = false;
        timer.stop();
        if (map.h < map.maps.length - 1) {
            hero_x = 56;
            hero_y = 310;
            map.h++;
            h = map.h;
            addKeyListener(this);
            repaint();
        } else {
            shengli = true;
            removeKeyListener(this);
            repaint();
        }
    }

}
