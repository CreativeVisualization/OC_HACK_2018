//OC2018 Tama Art University_nakayama

import processing.awt.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Font;

float r1, g1, b1;
float r2, g2, b2;
float r3, g3, b3;
float r4, g4, b4;
float r5, g5, b5;
String moji;

void setup() {
  size(770, 960);
  blendMode(BLEND);
  colorMode(RGB, 150, 150, 150);
  frameRate(10);


  JPanel panel = new JPanel();
  BoxLayout layout = new BoxLayout(panel, BoxLayout.Y_AXIS);

  Canvas canvas = (Canvas)surface.getNative();
  JLayeredPane layeredPane = (JLayeredPane)canvas.getParent().getParent();


  panel.setLayout(layout);
  panel.add(new JLabel("何か入力してください"));
  JTextField text1 = new JTextField();
  panel.add(text1);

  int r = JOptionPane.showConfirmDialog(
    null, // オーナーウィンドウ
    panel, // メッセージ
    "#OC_HACK_2018", // ウィンドウタイトル
    JOptionPane.OK_CANCEL_OPTION, // オプション（ボタンの種類）
    JOptionPane.INFORMATION_MESSAGE);  // メッセージタイプ（アイコンの種類）
  println(r);
  println(text1.getText());
  moji= text1.getText();// loadStrings("text.txt");



  //Generate Object Instance of Inner Class for ActionListener
  // ActionListenerインタフェースを実装するインナークラス(後述)の
  // オブジェクトインスタンスの生成
  MyButtonListener myButtonListener = new MyButtonListener();

  // インナークラスに作ったTextField登録関数を使って，TextFieldを登録


  // ボタンを作って，場所とサイズを決める
  JButton button1 = new JButton("Change color1");
  button1.setBounds(10, 30, 110, 20);
  JButton button2 = new JButton("Change color2");
  button2.setBounds(10, 60, 110, 20);
  JButton button3 = new JButton("Change color3");
  button3.setBounds(10, 90, 110, 20);
  JButton button4 = new JButton("Change color4");
  button4.setBounds(10, 120, 110, 20);
  JButton button5 = new JButton("Change color5");
  button5.setBounds(10, 150, 110, 20);
  JButton button6 = new JButton("Draw start");
  button6.setBounds(10, 180, 90, 20); 
  JButton button7 = new JButton("Draw stop");
  button7.setBounds(10, 210, 90, 20);
  JButton button8 = new JButton("My HACK save");
  button8.setBounds(10, 240, 120, 20);


  // このボタンの「アクションコマンド」文字列を指定する．
  // ここでは"button1_push"という文字列を指定している
  button1.setActionCommand("button1_push");
  button2.setActionCommand("button2_push");
  button3.setActionCommand("button3_push");
  button4.setActionCommand("button4_push");
  button5.setActionCommand("button5_push");
  button6.setActionCommand("button6_push");
  button7.setActionCommand("button7_push");
  button8.setActionCommand("button8_push");


  //ボタンを，ActionListenerを実装したクラスのオブジェクトに登録する
  button1.addActionListener(myButtonListener);
  button2.addActionListener(myButtonListener);
  button3.addActionListener(myButtonListener);
  button4.addActionListener(myButtonListener);
  button5.addActionListener(myButtonListener);
  button6.addActionListener(myButtonListener);
  button7.addActionListener(myButtonListener);
  button8.addActionListener(myButtonListener);


  // Paneにテキストフィールドとボタンを追加

  layeredPane.add(button1);
  layeredPane.add(button2);
  layeredPane.add(button3);
  layeredPane.add(button4);
  layeredPane.add(button5);
  layeredPane.add(button6);
  layeredPane.add(button7);
  layeredPane.add(button8);

  r1 = random(0, 255);//そと
  g1 = random(0, 255);
  b1 = random(0, 255);

  r2 =random(20, 200);//なか
  g2 = random(20, 190);
  b2 = random(120, 255);

  r3 =random(0, 255);//透明度
  g3 = random(120, 200);
  b3 = random(0, 255);

  r4=random(0, 170);//もじ
  g4 = random(0, 180);
  b4 = random(0, 180);

  r5=random(0, 255);//もじ
  g5 = random(0, 255);
  b5 = random(0, 255);
}


void draw() {

  beginShape();//外枠
  fill(r1, g1, b1);
  noStroke();
  vertex(618.69, 417.09);
  vertex(728.15, 237.57);
  vertex(509.81, 292.39);
  vertex(646.16, 0.0);
  vertex(446.02, 152.01);
  vertex(438.73, 6.78);  
  vertex(326.74, 134.18);
  vertex(144.47, 45.9); 
  vertex(175.58, 209.37);
  vertex(0.0, 244.14);
  vertex(164.85, 426.16);  
  vertex(22.34, 533.3);  
  vertex(190.56, 595.32);
  vertex(43.76, 789.19);  
  vertex(257.61, 773.35);  
  vertex(303.77, 959.72);
  vertex(466.36, 774.31); 
  vertex(602.29, 954.9);  
  vertex(615.81, 595.92);
  vertex(770.0, 631.68); 
  endShape(CLOSE);


  beginShape();
  fill(r2, g2, b2);
  noStroke();
  vertex(593.85, 564.37); 
  vertex(583.25, 894.16); 
  vertex(467.13, 738.62);
  vertex(315.13, 913.37); 
  vertex(274.54, 746.57); 
  vertex(87.85, 763.07);
  vertex(223.35, 583.99);
  vertex(67.92, 525.8);
  vertex(197.14, 428.81);
  vertex(41.06, 257.72);
  vertex(202.61, 228.05);
  vertex(173.31, 83.53);
  vertex(333.35, 164.55);
  vertex(421.95, 59.68);
  vertex(428.38, 193.36);
  vertex(592.02, 67.39);
  vertex(471.06, 324.86);
  vertex(684.25, 269.77);
  vertex(592.2, 418.0);
  vertex(720.41, 598.34);
  endShape(CLOSE);

  for (int i =0; i<130; i++) {
    pushMatrix() ;
    translate(random(width), random(height));
    scale(random(1, 6));
    fill(random(0, 255), random(0, 255), random(0, 255), r3);
    triangle(random(0, 60), random(0, 40), random(0, 55), random(0, 20), random(0, 25), random(0, 70));
    popMatrix() ;
  }

  PFont font = createFont("Futura-Bold", 100, true);
  textFont(font);  // 選択したフォントを指定する


  for (int i = 0; i < 30; i ++) {       
    fill(r5, g5, b5, 150);
    textSize(random(10, 100));
    textAlign(CENTER);
    text(moji, random(width), random(height));


    fill(r4, g4, b4);
    beginShape();
    vertex(770.0, 631.68);
    vertex(618.69, 417.09);
    vertex(728.15, 237.57);
    vertex(509.81, 292.39);
    vertex(646.16, 0.0);
    vertex(446.02, 152.01);
    vertex(438.73, 6.78);
    vertex(326.74, 134.18);
    vertex(326.74, 134.18);
    vertex(144.47, 45.9);
    vertex(175.58, 209.37);
    vertex(0.0, 244.14);
    vertex(164.85, 426.16);
    vertex(22.34, 533.3);
    vertex(190.56, 595.32);
    vertex(43.76, 789.19);
    vertex(257.61, 773.35);
    vertex(303.77, 959.72);
    vertex(466.36, 774.31);
    vertex(602.29, 954.9);
    vertex(615.81, 595.92);
    vertex(770.0, 631.68);
    vertex(900-65, 1100-70);
    vertex(0-65, 1100-70);
    vertex(0-65, 0-70);
    vertex(900-65, 0-70);
    vertex(900-65, 1100-70);
    endShape(CLOSE);

    textSize(24);
    fill(0);
    text("#OC_HACK_2018", 140, 930);
  }
}



// ActionListenerを使うためのインナークラス
class MyButtonListener implements ActionListener {

  // Pointer of textField added JLayeredPane
  // スケッチの大元のTextFieldへの参照ポインタ変数


  // その参照をsetup関数から登録するための登録関数

  public void actionPerformed(ActionEvent e) {
    String actionCommand = e.getActionCommand();
    if (actionCommand.equals("button1_push")) {
      loop();
      r1 = random(0, 255);
      g1 = random(0, 255);
      b1 = random(0, 255);
    } 
    if (actionCommand.equals("button2_push")) {
      loop();
      r2 = random(0, 255);
      g2= random(0, 255);
      b2= random(0, 255);
    }
    if (actionCommand.equals("button3_push")) {
      r3= random(0, 255);
      g3= random(0, 255);
      b3= random(0, 255);
    }
    if (actionCommand.equals("button4_push")) {
      r4 = random(0, 255);
      g4= random(0, 255);
      b4= random(0, 255);
    }
    if (actionCommand.equals("button5_push")) {
      r5 = random(0, 255);
      g5= random(0, 255);
      b5= random(0, 255);
    }
    if (actionCommand.equals("button6_push")) {
      loop();
    }
    if (actionCommand.equals("button7_push")) {
      noLoop();
    }
    if (actionCommand.equals("button8_push")) {
      saveFrame("data/####.jpg");
    }
  }
}
