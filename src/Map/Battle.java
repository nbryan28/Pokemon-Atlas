/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Map;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author HPpro1
 */
public class Battle extends javax.swing.JFrame {
    
    ImageIcon imagen1, imagen2, imagen3, imagen4;
    BufferedImage image1, image2, image3, image4;
    Clip clip2;
    Icon char2;
    Icon char1;
    Icon ball; Icon mag; Icon geg;
    Timer time; int count = 0;
    /**
     * Creates new form Battle
     */
    public Battle() {
        
        initComponents();
        
        try{
            URL url = new URL("file:///C:/Users/HPpro1/Documents/Files/My Programs/Pokemon Atlas/New folder/copy_drag.gif");
            Icon copy_drag = new ImageIcon(url);
            URL url2 = new URL("file:///C:/Users/HPpro1/Documents/Files/My Programs/Pokemon Atlas/New folder/lake.gif");
            Icon lake2 = new ImageIcon(url2);
            URL url3 = new URL("file:///C:/Users/HPpro1/Documents/Files/My Programs/Pokemon Atlas/New folder/char.gif");
            char1 = new ImageIcon(url3);
            URL url4 = new URL("file:///C:/Users/HPpro1/Documents/Files/My Programs/Pokemon Atlas/New folder/city.gif");
            Icon city2 = new ImageIcon(url4);
            URL url5 = new URL("file:///C:/Users/HPpro1/Documents/Files/My Programs/Pokemon Atlas/New folder/tail.gif");
            char2 = new ImageIcon(url5);
            URL url6 = new URL("file:///C:/Users/HPpro1/Documents/Files/My Programs/Pokemon Atlas/New folder/boy.png");
            Icon train1 = new ImageIcon(url6);
            URL url7 = new URL("file:///C:/Users/HPpro1/Documents/Files/My Programs/Pokemon Atlas/New folder/bad.png");
            Icon train2 = new ImageIcon(url7);
            URL url8 = new URL("file:///C:/Users/HPpro1/Documents/Files/My Programs/Pokemon Atlas/New folder/throw_r.gif");
            ball = new ImageIcon(url8);
            URL url9 = new URL("file:///C:/Users/HPpro1/Documents/Files/My Programs/Pokemon Atlas/New folder/magmar.gif");
            mag = new ImageIcon(url9);
            URL ur20 = new URL("file:///C:/Users/HPpro1/Documents/Files/My Programs/Pokemon Atlas/New folder/Gengar.gif");
            geg = new ImageIcon(ur20);
            
            charizard.setIcon(char1);
            dragonite.setIcon(copy_drag);
            lake.setIcon(lake2);
            city.setIcon(city2);
            land1.setIcon(city2);
            per1.setIcon(train1);
            land2.setIcon(lake2);
            per2.setIcon(train2);
            
            try{
        AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File("C:/Users/HPpro1/Documents/Files/My Programs/Pokemon Atlas/New folder/battle_theme.wav"));
        clip2 = AudioSystem.getClip();
        clip2.open(inputStream);
        
        clip2.loop(Clip.LOOP_CONTINUOUSLY);
       // Thread.sleep(50000);
         
        }catch(Exception e){
            
        }
          
           time = new Timer(3300,new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               
               if(count < 1){
              dragonite.setIcon(ball);     
              count++;
               }
               else{
               dragonite.setIcon(geg);
               red.setText("Gengar I choose you!");
               }
           }
          });
         ; 
           
            
        }catch(Exception e){
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        poke1 = new javax.swing.JPanel();
        charizard = new javax.swing.JLabel();
        city = new javax.swing.JLabel();
        poke2 = new javax.swing.JPanel();
        dragonite = new javax.swing.JLabel();
        lake = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        red = new javax.swing.JTextArea();
        Trainer_1 = new javax.swing.JPanel();
        per1 = new javax.swing.JLabel();
        land1 = new javax.swing.JLabel();
        Trainer_2 = new javax.swing.JPanel();
        per2 = new javax.swing.JLabel();
        land2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        poke_anim = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        poke1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        poke1.setLayout(new javax.swing.OverlayLayout(poke1));

        charizard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        poke1.add(charizard);
        poke1.add(city);

        poke2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        poke2.setLayout(new javax.swing.OverlayLayout(poke2));

        dragonite.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        poke2.add(dragonite);
        poke2.add(lake);

        jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Pokemon GB", 0, 11)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextArea1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextArea1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextArea1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        red.setBackground(new java.awt.Color(204, 204, 204));
        red.setColumns(20);
        red.setFont(new java.awt.Font("Pokemon GB", 0, 11)); // NOI18N
        red.setRows(5);
        red.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                redMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(red);

        Trainer_1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Trainer_1.setLayout(new javax.swing.OverlayLayout(Trainer_1));
        Trainer_1.add(per1);
        Trainer_1.add(land1);

        Trainer_2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Trainer_2.setLayout(new javax.swing.OverlayLayout(Trainer_2));

        per2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Trainer_2.add(per2);
        Trainer_2.add(land2);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 176, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 329, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(poke_anim, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(poke_anim, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/poke.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Trainer_1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(poke1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(poke2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Trainer_2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Trainer_1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Trainer_2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(poke1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(poke2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel1)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextArea1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextArea1MouseClicked
        // TODO add your handling code here:
        
        if((!jTextArea1.getText().isEmpty()) &&(!jTextArea1.getText().contains("stop")) ){
           charizard.setIcon(char2);
           red.setBackground(Color.red); }
        else if(jTextArea1.getText().contains("stop")){     
           charizard.setIcon(char1);
            red.setBackground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_jTextArea1MouseClicked

    private void jTextArea1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextArea1MousePressed
        // TODO add your handling code here:
       
        
    }//GEN-LAST:event_jTextArea1MousePressed

    private void jTextArea1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextArea1MouseReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextArea1MouseReleased

    private void redMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_redMouseClicked
        // TODO add your handling code here:
          count = 0;
          if (!time.isRunning()) {
           time.start();
          }
          else{
          time.stop();
          }
           
        
        
    }//GEN-LAST:event_redMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        clip2.stop();
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Trainer_1;
    private javax.swing.JPanel Trainer_2;
    private javax.swing.JLabel charizard;
    private javax.swing.JLabel city;
    private javax.swing.JLabel dragonite;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lake;
    private javax.swing.JLabel land1;
    private javax.swing.JLabel land2;
    private javax.swing.JLabel per1;
    private javax.swing.JLabel per2;
    private javax.swing.JPanel poke1;
    private javax.swing.JPanel poke2;
    private javax.swing.JLabel poke_anim;
    private javax.swing.JTextArea red;
    // End of variables declaration//GEN-END:variables
}
