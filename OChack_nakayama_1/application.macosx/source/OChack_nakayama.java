import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import processing.awt.*; 
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
import java.awt.Font; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OChack_nakayama extends PApplet {

//OC2018 Tama Art University_nakayama







float r1, g1, b1;
float r2, g2, b2;
float r3, g3, b3;
float r4, g4, b4;
float r5, g5, b5;
String moji;

public void setup() {
  
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


public void draw() {

  beginShape();//外枠
  fill(r1, g1, b1);
  noStroke();
  vertex(618.69f, 417.09f);
  vertex(728.15f, 237.57f);
  vertex(509.81f, 292.39f);
  vertex(646.16f, 0.0f);
  vertex(446.02f, 152.01f);
  vertex(438.73f, 6.78f);  
  vertex(326.74f, 134.18f);
  vertex(144.47f, 45.9f); 
  vertex(175.58f, 209.37f);
  vertex(0.0f, 244.14f);
  vertex(164.85f, 426.16f);  
  vertex(22.34f, 533.3f);  
  vertex(190.56f, 595.32f);
  vertex(43.76f, 789.19f);  
  vertex(257.61f, 773.35f);  
  vertex(303.77f, 959.72f);
  vertex(466.36f, 774.31f); 
  vertex(602.29f, 954.9f);  
  vertex(615.81f, 595.92f);
  vertex(770.0f, 631.68f); 
  endShape(CLOSE);


  beginShape();
  fill(r2, g2, b2);
  noStroke();
  vertex(593.85f, 564.37f); 
  vertex(583.25f, 894.16f); 
  vertex(467.13f, 738.62f);
  vertex(315.13f, 913.37f); 
  vertex(274.54f, 746.57f); 
  vertex(87.85f, 763.07f);
  vertex(223.35f, 583.99f);
  vertex(67.92f, 525.8f);
  vertex(197.14f, 428.81f);
  vertex(41.06f, 257.72f);
  vertex(202.61f, 228.05f);
  vertex(173.31f, 83.53f);
  vertex(333.35f, 164.55f);
  vertex(421.95f, 59.68f);
  vertex(428.38f, 193.36f);
  vertex(592.02f, 67.39f);
  vertex(471.06f, 324.86f);
  vertex(684.25f, 269.77f);
  vertex(592.2f, 418.0f);
  vertex(720.41f, 598.34f);
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
    vertex(770.0f, 631.68f);
    vertex(618.69f, 417.09f);
    vertex(728.15f, 237.57f);
    vertex(509.81f, 292.39f);
    vertex(646.16f, 0.0f);
    vertex(446.02f, 152.01f);
    vertex(438.73f, 6.78f);
    vertex(326.74f, 134.18f);
    vertex(326.74f, 134.18f);
    vertex(144.47f, 45.9f);
    vertex(175.58f, 209.37f);
    vertex(0.0f, 244.14f);
    vertex(164.85f, 426.16f);
    vertex(22.34f, 533.3f);
    vertex(190.56f, 595.32f);
    vertex(43.76f, 789.19f);
    vertex(257.61f, 773.35f);
    vertex(303.77f, 959.72f);
    vertex(466.36f, 774.31f);
    vertex(602.29f, 954.9f);
    vertex(615.81f, 595.92f);
    vertex(770.0f, 631.68f);
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
  public void settings() {  size(770, 960); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OChack_nakayama" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
