
import java.applet.*;
import javax.swing.*;/////////////////////sounds files/////////////////
import java.io.*;
import java.net.*;


import java.awt.event.KeyListener;
import java.awt.*;              // Graphics stuff from the AWT library
import javax.swing.*;           // Graphics stuff from the Swing library
import java.awt.image.BufferedImage; // Graphics drawing canvas

import javax.swing.Timer;       // Timer for animating objects

import java.awt.event.*;        // Event handler, for keyboard and timer events

import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import java.io.File;            // File I/O functionality (for loading an image)
import javax.imageio.ImageIO;   // Image loading functionality
import java.io.IOException;     // Exception handling if image file not found
import java.io.*;
import java.util.*;
import java.text.*;

public class MyFirstGame extends Frame {
   static Graphics gr;
   static JFrame frame;
   static BufferedImage forestPic;
   static BufferedImage classPic;
   static BufferedImage backGround;
   static BufferedImage backGround2;
   static BufferedImage maleBack;
   static BufferedImage femaleBack;
   static BufferedImage maleBack2;
   static BufferedImage femaleBack2;
   static BufferedImage elfPic;
   static BufferedImage humanPic;
   static BufferedImage vampirePic;
   static BufferedImage beastManPic;
   static BufferedImage orkPic;
   static BufferedImage goblinPic;
   static BufferedImage giantPic;
   static BufferedImage dwarfPic;
   static BufferedImage elfPic2;
   static BufferedImage humanPic2;
   static BufferedImage vampirePic2;
   static BufferedImage beastManPic2;
   static BufferedImage orkPic2;
   static BufferedImage goblinPic2;
   static BufferedImage giantPic2;
   static BufferedImage dwarfPic2;
   static BufferedImage wizardPic;
   static BufferedImage monkPic;
   static BufferedImage knightPic;
   static BufferedImage paladinPic;
   static BufferedImage theifPic;
   static BufferedImage dragonSlayerPic;
   static BufferedImage necromancerPic;
   static BufferedImage deathKnightPic;
   static BufferedImage villagePic;
   static BufferedImage marketPic;
   static BufferedImage innPic;
   static BufferedImage castlePic;
   static BufferedImage backStreetPic;
   static BufferedImage blackSmithPic;
   static BufferedImage player;
   static BufferedImage player2;
   static BufferedImage player3;
   static BufferedImage player4;
   static BufferedImage levelup;
   static BufferedImage gameOverPic;
   static BufferedImage gameOverPic2;
   static BufferedImage gameOverPic3;
   static BufferedImage battleforPic;
   static BufferedImage gifFight;
   static BufferedImage gifFight2;
   static BufferedImage humanFight;
   static BufferedImage fightBar;
   static BufferedImage fightTab;
   static BufferedImage itemTab;
   static BufferedImage wolfPic;
   static BufferedImage bearPic;
   static BufferedImage trollPic;
   static BufferedImage smallOrkPic;
   static BufferedImage slash;
   static BufferedImage arrow;
   static BufferedImage mBall;
   static BufferedImage slash2;
   static BufferedImage winPic;
   


   
   
   static Timer timer;
   
   
      ///race//class
   static int male = 0;
   static int female = 0;
   static int human = 0;
   static int elf = 0;
   static int dwarf = 0;
   static int giant = 0;
   static int vampire = 0;
   static int beastMan = 0;
   static int goblin = 0;
   static int ork = 0;
   static int wizard = 0;
   static int theif = 0;
   static int monk = 0;
   static int knight = 0;
   static int deathKnight = 0;
   static int paladin = 0;
   static int dragonSlayer = 0;
   static int necromancer = 0;
   
   ////stats
   static int health = 11;
   static int health2 = 11;
   static int attack = 10;
   static int defence = 10;
   static int stamin = 10;
   static int stamin2 = 10;
   static int magic2 = 10;
   static int magic = 10;
   static int ammo = 10;
   static int ammo2 = 10;
   static int rage = 0;
   static int rage2 = 0;
   static int gold = 0;
   static int xp = 0;
   static int level = 1;
   static int leveled = 0;
   static int levelprint = 0;
   
   /////page switch
   static int gender = 0;
   static int race = 0;
   static int startGame = 0;
   static int spec = 0;
   static int spec2 = 0;
   static int village = 0;
   static int inn = 0;
   static int blackSmith = 0;
   static int backStreet = 0;
   static int castle = 0;
   static int forest = 0;
   static int market = 0;
   static int bridge = 0;
   static int river = 0;
   static int shack = 0;
   static int huntingGround = 0;
   static int gameOver = 0;
   static int battlefor = 0;
   ///castle stuff
   static int throne = 0;
   static int guard = 0;
   static int royal = 0;
   static int chance = 0;
   static int reward = 0 *level;
   ////event stuff
   static int t1 = 0;
   static int t2 = 0;
   static int t3 = 0;
   ///item stuff
   static int w1 = 0;
   static int w2 = 0;
   static int w3 = 0;
   //backstreet stuff
   static int look = 0;
   //inn stuff
   static int barmaid = 0;
   static int buyBeer = 0;
   static int rest = 0;
   static int flirt = 0;
   
   
   ///smith items
   static int steelSword = 0;
   static int oakLongBow = 0; 
   static int basicMagicStaff = 0; 
   static int rustyChain = 0;
   static int dirtySling = 0;
   static int ponceyWand = 0;
   static int dragonSlayerAxe = 0; 
   static int wizardsSleave = 0;
   static int trueShotBow = 0;
   static int skimitar = 0;
   static int elfCraftBow = 0;
   static int leafBladedStaff = 0;                         
   static int steelFullhelm = 0;
   static int steelGreaves = 0;
   static int steelGauntlets = 0;
   static int steelBoots = 0;
   static int steelCuriass = 0;
   static int ponceyWizardsDress = 0; 
   static int darkLeatherVambraces = 0;
   static int darkLeatherBoots = 0;
   static int darkLeatherGreaves = 0;
   static int darkLeatherCuriass = 0;
   static int darkLeatherCloak = 0;
   ////equiped/////
   static int steelSword2 = 0;
   static int oakLongBow2 = 0; 
   static int basicMagicStaff2 = 0; 
   static int rustyChain2 = 0;
   static int dirtySling2 = 0;
   static int ponceyWand2 = 0;
   static int dragonSlayerAxe2 = 0; 
   static int wizardsSleave2 = 0;
   static int trueShotBow2 = 0;
   static int skimitar2 = 0;
   static int elfCraftBow2 = 0;
   static int leafBladedStaff2 = 0;                         
   static int steelFullhelm2 = 0;
   static int steelGreaves2 = 0;
   static int steelGauntlets2 = 0;
   static int steelBoots2 = 0;
   static int steelCuriass2 = 0;
   static int ponceyWizardsDress2 = 0; 
   static int darkLeatherVambraces2 = 0;
   static int darkLeatherBoots2 = 0;
   static int darkLeatherGreaves2 = 0;
   static int darkLeatherCuriass2 = 0;
   static int darkLeatherCloak2 = 0;
   
   //market items
   static int refillAmmo= 0;
   static int magicPotion= 0;
   static int healthPotion= 0;
   static int ragePotion= 0;
   static int staminaPotion= 0;
   static int crustyBread = 0;
   static int saltedPork= 0;
   static int water= 0;
   static int wine= 0;
   static int perfume= 0;
   static int fishingNet= 0;
   static int rope= 0;
   ///limit///
   static int refillAmmo2= 0;
   static int magicPotion2= 0;
   static int healthPotion2= 0;
   static int ragePotion2= 0;
   static int staminaPotion2= 0;
   static int crustyBread2 = 0;
   static int saltedPork2= 0;
   static int water2= 0;
   static int wine2= 0;
   static int perfume2= 0;
   static int fishingNet2= 0;
   static int rope2= 0;
   
   ///inn stuff
   static int drunk = 0;
   static int strike = 0;
   static int love = 0;
   static int love1 = 0;
   static int nolove = 0;
   
   ///////////moving/////////
    static int y =600;
    static float x = 600;
    static boolean w = false;
    static boolean a = false;
    static boolean d = false;
    static boolean s = false;
    
    /////monsters////
    static int wolf = 0;
    static int bear = 0;
    static int smallOrk =0;
    static int troll = 0;
    
    //////////battles/////////////
    static int fight = 0;
    static int flash = 0;
    static int fTKey = 0;
    static int iTKey = 0;
    static int rTKey = 0;
    static int run = 0;
    static int meAttack = 0;
    static int maAttack = 0;
    static int raAttack = 0;
    static int useMP = 0;
    static int useHP = 0;
    static int useSP = 0;
    static int useRP = 0;
    static int useCB = 0;
    static int useSA = 0;
    static int useW = 0;
    static int useWI = 0;
    static int win = 0;
    static int damage = 0;
    static int enemy = 0;
    static int yourTurn = 1;
    static int flash2 = 0;
    static int flash3 = 0;
    static int flash4 = 0;
    static int enemyflash = 0;
    static int monsterGen = 0;
    
    static int enemyHealth = 0; 
    static int enemyDefence = 0;
    static int enemyAttack = 0;
   
   
   static Random generator = new Random ();

    
    public static void main(String[] args) {
        // ============================PART 1: SET UP THE GRAPHICS WINDOW =================================
        // Create a window 
        frame=new JFrame();
        // Set position of the window on screen.
        frame.setLocation(0,0);
        BufferedImage image=new BufferedImage(1440,900,BufferedImage.TYPE_INT_ARGB);
        gr=image.getGraphics();

        // Create the title line of the window
        JLabel label=new JLabel(new ImageIcon(image));
        frame.add(label);
        frame.setTitle("RPG");

        // Set the size of the window 
        frame.setSize(1440,900);

        // Pop the window up on screen
        frame.setVisible(true);
        


        // ==================== KEYBOARD EVENTS ==========================
        frame.addKeyListener(new KeyAdapter() {
                public void keyPressed(KeyEvent ke) {
                    if(gender ==0){
                    pressed(ke.getKeyCode() );
                    ke.consume();
                }
                else if (race ==1){                       
                    pressed2(ke.getKeyCode() );
                    ke.consume();
                }
                else if (spec ==1){                                        
                    pressed3(ke.getKeyCode() );
                    ke.consume();
                } 
                else if (startGame ==1){                                        
                    pressed4(ke.getKeyCode() );
                    ke.consume();
                }
                else if (village ==1){                                        
                    pressedvill(ke.getKeyCode() );
                    ke.consume();
                }   
                else if (castle ==1){                                        
                    pressedcas(ke.getKeyCode() );
                    ke.consume();
                }   
                else if (inn ==1){                                        
                    pressedinn(ke.getKeyCode() );
                    ke.consume();
                }   
                else if (blackSmith ==1){                                        
                    pressedsmith(ke.getKeyCode() );
                    ke.consume();
                }   
                else if (backStreet ==1){                                        
                    pressedstreet(ke.getKeyCode() );
                    ke.consume();
                }   
                else if (market ==1){                                        
                    pressedmar(ke.getKeyCode() );
                    ke.consume();
                }
                else if (forest ==1){                                        
                    pressedfor(ke.getKeyCode() );
                    ke.consume();
                }
                else if (battlefor ==1){                                        
                    pressedbattlefor(ke.getKeyCode() );
                    ke.consume();
                }
                }
                
                public void keyReleased(KeyEvent ke){
                if(forest ==1){
                    releasedfor(ke.getKeyCode());
                    ke.consume();
                }
                if(battlefor ==1){
                    releasedfor(ke.getKeyCode());
                    ke.consume();
                }
                }
                
                public void keyTyped (KeyEvent ke){
                    ke.consume();
                }

            }
        );

        // keyboard events waits untill key is pressed

        // ==================== FUNCTIONALITY FOR ANIMATION ===================================
        ActionListener actionListener = new ActionListener() {
                public void actionPerformed(ActionEvent actionEvent) {
                    if(gender ==0){
                    doAnimation();
                }
                else if (race ==1){                       
                    doAnimation2();
                }
                else if (spec ==1){                                        
                    doAnimation3();
                }
                else if (startGame ==1){                                        
                    doAnimation4();
                }   
                else if (village ==1){                                        
                    doAnimationvill();
                }
                else if (castle ==1){                                        
                    doAnimationcas();
                }   
                else if (inn ==1){                                        
                    doAnimationinn();
                }   
                else if (blackSmith ==1){                                        
                    doAnimationsmith();
                }   
                else if (backStreet ==1){                                        
                    doAnimationstreet();
                }
                else if (market ==1){                                        
                    doAnimationmar();
                }
                else if (forest ==1){                                        
                    doAnimationfor();
                }
                else if (gameOver ==1){                                        
                    doAnimationgameOver();
                }
                else if (battlefor ==1){                                        
                    doAnimationbattlefor();
                }
                }
                    
                
            };
        //a timer that will trigger an action every 25 ms
        timer = new Timer(25, actionListener);

        // load an image from file 
         try {
            backGround = ImageIO.read(new File("startbackground.png"));
        } catch (IOException ex) {
            System.out.println("startbackground.png not found");

        }
        try {
            backGround2 = ImageIO.read(new File("startbackground2.png"));
        } catch (IOException ex) {
            System.out.println("startbackground2.png not found");

        }
        try {
            maleBack = ImageIO.read(new File("maleBack.png"));
        } catch (IOException ex) {
            System.out.println("maleBack.png not found");

        }
        try {
            femaleBack = ImageIO.read(new File("femaleBack.png"));
        } catch (IOException ex) {
            System.out.println("femaleBack.png not found");

        }
        try {
            maleBack2 = ImageIO.read(new File("maleBack2.png"));
        } catch (IOException ex) {
            System.out.println("maleBack2.png not found");

        }
        try {
            femaleBack2 = ImageIO.read(new File("femaleBack2.png"));
        } catch (IOException ex) {
            System.out.println("femaleBack2.png not found");

        }
        try {
            elfPic= ImageIO.read(new File("elf.png"));
        } catch (IOException ex) {
            System.out.println("elf.png not found");

        }
        try {
            classPic= ImageIO.read(new File("classpic.png"));
        } catch (IOException ex) {
            System.out.println("classpic.png not found");

        }
        try {
            humanPic = ImageIO.read(new File("human.png"));
        } catch (IOException ex) {
            System.out.println("human.png not found");

        }
        try {
            dwarfPic = ImageIO.read(new File("dwarf.png"));
        } catch (IOException ex) {
            System.out.println("dwarf.png not found");

        }
        try {
            vampirePic = ImageIO.read(new File("vampire.png"));
        } catch (IOException ex) {
            System.out.println("vampire.png not found");

        }
        try {
            beastManPic = ImageIO.read(new File("beastman.png"));
        } catch (IOException ex) {
            System.out.println("beastman.png not found");

        }
        try {
            orkPic = ImageIO.read(new File("ork.png"));
        } catch (IOException ex) {
            System.out.println("ork.png not found");

        }
        try {
            goblinPic = ImageIO.read(new File("goblin.png"));
        } catch (IOException ex) {
            System.out.println("goblin.png not found");

        }
        try {
            giantPic = ImageIO.read(new File("giant.png"));
        } catch (IOException ex) {
            System.out.println("giant.png not found");

        }
        try {
            elfPic2= ImageIO.read(new File("elf2.png"));
        } catch (IOException ex) {
            System.out.println("elf2.png not found");

        }
        try {
            humanPic2 = ImageIO.read(new File("human2.png"));
        } catch (IOException ex) {
            System.out.println("human2.png not found");

        }
        try {
            dwarfPic2 = ImageIO.read(new File("dwarf2.png"));
        } catch (IOException ex) {
            System.out.println("dwarf2.png not found");

        }
        try {
            vampirePic2 = ImageIO.read(new File("vampire2.png"));
        } catch (IOException ex) {
            System.out.println("vampire2.png not found");

        }
        try {
            beastManPic2 = ImageIO.read(new File("beastman2.png"));
        } catch (IOException ex) {
            System.out.println("beastman2.png not found");

        }
        try {
            orkPic2 = ImageIO.read(new File("ork2.png"));
        } catch (IOException ex) {
            System.out.println("ork2.png not found");

        }
        try {
            goblinPic2 = ImageIO.read(new File("goblin2.png"));
        } catch (IOException ex) {
            System.out.println("goblin2.png not found");

        }
        try {
            giantPic2 = ImageIO.read(new File("giant2.png"));
        } catch (IOException ex) {
            System.out.println("giant2.png not found");

        }
        try {
            wizardPic = ImageIO.read(new File("wizard.png"));
        } catch (IOException ex) {
            System.out.println("wizard.png not found");

        }
        try {
            monkPic = ImageIO.read(new File("monk.png"));
        } catch (IOException ex) {
            System.out.println("monk.png not found");

        }
        try {
            knightPic = ImageIO.read(new File("knight.png"));
        } catch (IOException ex) {
            System.out.println("knight.png not found");

        }
        try {
            theifPic = ImageIO.read(new File("theif.png"));
        } catch (IOException ex) {
            System.out.println("theif.png not found");

        }
        try {
            dragonSlayerPic = ImageIO.read(new File("dragonslayer.png"));
        } catch (IOException ex) {
            System.out.println("dragonslayer.png not found");

        }
        try {
            deathKnightPic = ImageIO.read(new File("deathknight.png"));
        } catch (IOException ex) {
            System.out.println("deathknight.png not found");

        }
        try {
            paladinPic = ImageIO.read(new File("paladin.png"));
        } catch (IOException ex) {
            System.out.println("paladin.png not found");

        }
        try {
            necromancerPic = ImageIO.read(new File("necromancer.png"));
        } catch (IOException ex) {
            System.out.println("necromancer.png not found");

        }
        try {
            villagePic = ImageIO.read(new File("village.png"));
        } catch (IOException ex) {
            System.out.println("village.png not found");

        }
        try {
            innPic = ImageIO.read(new File("inn.png"));
        } catch (IOException ex) {
            System.out.println("inn.png not found");

        }
                try {
            blackSmithPic = ImageIO.read(new File("blacksmith.png"));
        } catch (IOException ex) {
            System.out.println("blacksmith.png not found");

        }
                try {
            backStreetPic = ImageIO.read(new File("backstreet.png"));
        } catch (IOException ex) {
            System.out.println("backstreet.png not found");

        }
                try {
            marketPic = ImageIO.read(new File("market.png"));
        } catch (IOException ex) {
            System.out.println("market.png not found");

        }
                try {
            castlePic = ImageIO.read(new File("castle.png"));
        } catch (IOException ex) {
            System.out.println("castle.png not found");

        }
        try {
            forestPic = ImageIO.read(new File("forest.png"));
        } catch (IOException ex) {
            System.out.println("forest.png not found");

        }
        try {
            player = ImageIO.read(new File("player.png"));
        } catch (IOException ex) {
            System.out.println("player.png not found");

        }
        try {
            player2 = ImageIO.read(new File("player2.png"));
        } catch (IOException ex) {
            System.out.println("player2.png not found");

        }
        try {
            player3 = ImageIO.read(new File("player3.png"));
        } catch (IOException ex) {
            System.out.println("player3.png not found");

        }
        try {
            player4 = ImageIO.read(new File("player4.png"));
        } catch (IOException ex) {
            System.out.println("player4.png not found");

        }
        try {
            levelup = ImageIO.read(new File("levelup.png"));
        } catch (IOException ex) {
            System.out.println("levelup.png not found");

        }
        try {
            gameOverPic = ImageIO.read(new File("gameover.png"));
        } catch (IOException ex) {
            System.out.println("gameover.png not found");

        }
        try {
            gameOverPic2 = ImageIO.read(new File("gameover2.png"));
        } catch (IOException ex) {
            System.out.println("gameover2.png not found");

        }
        try {
            gameOverPic3 = ImageIO.read(new File("gameover3.png"));
        } catch (IOException ex) {
            System.out.println("gameover3.png not found");

        }
        try {
            battleforPic = ImageIO.read(new File("battlefor.png"));
        } catch (IOException ex) {
            System.out.println("battlefor.png not found");

        }        
        try {
            gifFight= ImageIO.read(new File("gif1.png"));
        } catch (IOException ex) {
            System.out.println("gif1.png not found");

        }
        try {
            gifFight2= ImageIO.read(new File("gif2.png"));
        } catch (IOException ex) {
            System.out.println("gif2.png not found");

        }
        try {
            humanFight = ImageIO.read(new File("humanfight.png"));
        } catch (IOException ex) {
            System.out.println("humanfight.png not found");

        }
        try {
            fightBar = ImageIO.read(new File("fightbar.png"));
        } catch (IOException ex) {
            System.out.println("fightbar.png not found");

        }
        try {
            itemTab = ImageIO.read(new File("itemtab.png"));
        } catch (IOException ex) {
            System.out.println("itemtab.png not found");

        }
        try {
            fightTab = ImageIO.read(new File("fighttab.png"));
        } catch (IOException ex) {
            System.out.println("fighttab.png not found");

        }
        try {
            wolfPic = ImageIO.read(new File("wolf.png"));
        } catch (IOException ex) {
            System.out.println("wolf.png not found");

        }
        try {
            slash = ImageIO.read(new File("meatslash1.png"));
        } catch (IOException ex) {
            System.out.println("meatslash1.png not found");

        }
        try {
            arrow = ImageIO.read(new File("raatarrow1.png"));
        } catch (IOException ex) {
            System.out.println("raatarrow1.png not found");

        }
        try {
            mBall = ImageIO.read(new File("maatball1.png"));
        } catch (IOException ex) {
            System.out.println("maatball1.png not found");

        }
        try {
            slash2 = ImageIO.read(new File("meatslash2.png"));
        } catch (IOException ex) {
            System.out.println("meatslash2.png not found");

        }
        try {
            winPic = ImageIO.read(new File("win.png"));
        } catch (IOException ex) {
            System.out.println("win.png not found");

        }
        try {
            bearPic = ImageIO.read(new File("bear.png"));
        } catch (IOException ex) {
            System.out.println("bear.png not found");

        }
        try {
            trollPic = ImageIO.read(new File("troll.png"));
        } catch (IOException ex) {
            System.out.println("troll.png not found");

        }
        try {
            smallOrkPic = ImageIO.read(new File("smallOrk.png"));
        } catch (IOException ex) {
            System.out.println("smallOrk.png not found");

        }    
        // Now start the timer
        timer.start();
        

    } 
    
    //end main str /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    


    ///char cre ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  private static void pressed(int key) {
      if(key == KeyEvent.VK_M){
            male = 1;
            race = 1;
            gender = 1;
            health += 10;
            health2 += 10;
            attack += 10;
        
        }
        else if(key == KeyEvent.VK_F){
            female = 1;
            race = 1;
            gender = 1;
            defence += 10;
            stamin += 10;
            stamin2 += 10;
            
        }
    }
    
    
      /////race//////////////////////////////
  private static void pressed2(int key) {
       if(key == KeyEvent.VK_H){
            human = 1;
            race = 0;
            spec = 1;
            health += 15;
            attack += 15;
            defence += 15;
            stamin += 15;
            magic += 15;
            ammo += 15;
            health2 += 15;
            stamin2 += 15;
            magic2 += 15;
            ammo2 += 15;
            
        }
        else if(key == KeyEvent.VK_E){
            elf = 1;
            race = 0;
            spec = 1;
            defence = 5;
            ammo += 1000;
            ammo2 += 1000;

            
        }
        else if(key == KeyEvent.VK_D){
            dwarf = 1;
            race = 0;
            spec = 1;
            defence += 100;
            
        }
        else if(key == KeyEvent.VK_G){
            giant = 1;
            race = 0;
            spec = 1;
            health += 50;
            health2 += 50;
            attack += 50;
            
        }
        
         else if(key == KeyEvent.VK_J){
            goblin = 1;
            race = 0;
            spec = 1;
            gold += 10000;
            
        }
        
         else if(key == KeyEvent.VK_V){
            vampire = 1;
            race = 0;
            startGame = 1;
            health += 50;
            health2 += 50;
            attack += 50;
            defence += 50;
            rage += 1000;
            rage2 += 1000;
            
            
        }
        
         else if(key == KeyEvent.VK_B){
            beastMan = 1;
            race = 0;
            startGame = 1;
            health += 50;
            health2 += 50;
            attack += 50;
            defence += 50;
            rage += 1000;
            rage2 += 1000;
            
        }
        
         else if(key == KeyEvent.VK_O){
            ork = 1;
            race = 0;
            spec = 1;
            attack = 100;
            defence =50;
            health =10;
            health2 =10;
            
        }
    }
    
    
      ////////////class////////////
   private static void pressed3(int key) {
        if(key == KeyEvent.VK_W){
            wizard = 1;
            spec = 0;
            startGame = 1;
            magic += 100;
            magic2 += 100;
            ammo = 0;
            stamin = 0;
            
        }
        
         else if(key == KeyEvent.VK_N){
            monk = 1;
            spec = 0;
            startGame = 1;
            stamin += 50;
            health += 20;
            stamin2 += 50;
            health2 += 20;
            magic = 0;
            ammo = 0;
            
        }
         else if(key == KeyEvent.VK_K){
            deathKnight = 1;
            spec = 0;
            startGame = 1;
            attack += 50;
            stamin += 50;
            stamin2 += 50;
            defence -= 50;
            
        }
         else if(key == KeyEvent.VK_T){
            theif = 1;
            spec = 0;
            startGame = 1;
            ammo += 100;
            ammo2 += 100;
            gold += 100;
            attack += 100;
            magic = 0;
            stamin = 0;            
        }
         else if(key == KeyEvent.VK_I){
            knight = 1;
            spec = 0;
            startGame = 1;
            health += 50;
            health2 += 50;
            defence += 50;
            attack += 25;            
        }
         else if(key == KeyEvent.VK_P){
            paladin = 1;
            spec = 0;
            startGame = 1;
            defence += 100;
            magic +=50;
            magic2 +=50;
            ammo = 0;           
        } 
        else if(key == KeyEvent.VK_S){
            dragonSlayer = 1; //implement into fights!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            spec = 0;
            startGame = 1;            
        } 
        else if(key == KeyEvent.VK_R){
            necromancer = 1;
            spec = 0;
            startGame = 1;
            health += 100;
            magic += 10;
            health2 += 100;
            magic2 += 10;
            ammo = 0;
            stamin = 0;
        } 
      }
      
   private static void pressed4(int key) {
          if(key == KeyEvent.VK_S){
            startGame = 0;
            village = 1;                      
        }
    }
    //end char cre //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
  

    ///////////////////////////////////VILLAGE////////////////////////////////////////////////
   private static void pressedvill(int key) {
         if(key == KeyEvent.VK_B){
            village = 0;
            blackSmith = 1;
         }
         if (key==KeyEvent.VK_M){
            village = 0;
            market = 1;
         }
         if (key==KeyEvent.VK_I){
            village = 0;
            inn = 1;
         }
          if (key==KeyEvent.VK_Q){
            village = 0;
            backStreet = 1;
         }
          if (key==KeyEvent.VK_C){
            village = 0;
            castle = 1;
         }
         if (key==KeyEvent.VK_E){
            village = 0;
            forest = 1;
         }
         if (key==KeyEvent.VK_SPACE){
            levelprint = 0;
         }
        }
        
        /////////////castle/////////////////////
        private static void pressedcas(int key) {
            if(key == KeyEvent.VK_R){
            village = 1;
            castle = 0;
        }
         if (key == KeyEvent.VK_S){
            throne = 1;
        }
         if (key == KeyEvent.VK_G){
            guard = 1;
        }
         if (key == KeyEvent.VK_T){
             royal = 1;

        }
        if (key==KeyEvent.VK_SPACE){
            levelprint = 0;
         }
    }
    ///////////////////////////market//////////////////////////////////////
    private static void pressedmar(int key) {
            if(key == KeyEvent.VK_R){
            village = 1;
            market = 0;            
           }
           if(key == KeyEvent.VK_A) {
           refillAmmo= 1;  
           }
           if(key == KeyEvent.VK_B){
            magicPotion= 1;            
           }
           if(key == KeyEvent.VK_C){
            healthPotion= 1;            
           }
           if(key == KeyEvent.VK_D){
            ragePotion= 1;           
           }
           if(key == KeyEvent.VK_E){
            staminaPotion= 1;            
           }
           if(key == KeyEvent.VK_F){
            crustyBread = 1;            
           }
           if(key == KeyEvent.VK_G){
            saltedPork= 1;           
           }
           if(key == KeyEvent.VK_H){
            water= 1;           
           }
           if(key == KeyEvent.VK_I){
            wine= 1;            
           }
           if(key == KeyEvent.VK_J){
            perfume= 1;            
           }
           if(key == KeyEvent.VK_K){
            fishingNet= 1;            
           }
           if(key == KeyEvent.VK_L){
            rope= 1;            
           }
           if (key==KeyEvent.VK_SPACE){
            levelprint = 0;
           }

        }
        
        //////////////////blacksmith/////////////////////////
    private static void pressedsmith(int key) {
            if(key == KeyEvent.VK_R){
            village = 1;
            blackSmith = 0;            
           }
           if(key == KeyEvent.VK_A){
               steelSword = 1;            
           }
           if(key == KeyEvent.VK_B){
               oakLongBow = 1;
           }
           if(key == KeyEvent.VK_C){
             basicMagicStaff = 1;
           }
           if(key == KeyEvent.VK_D){
            rustyChain = 1;
           }
           if(key == KeyEvent.VK_E){
            dirtySling = 1;
           }
           if(key == KeyEvent.VK_F){
            ponceyWand = 1;
           }
           if(key == KeyEvent.VK_G){
            dragonSlayerAxe = 1; 
           }
           if(key == KeyEvent.VK_H){
             wizardsSleave = 1;
           }
           if(key == KeyEvent.VK_I){
            trueShotBow =1;
           }
           if(key == KeyEvent.VK_J){
            skimitar = 1;
           }
           if(key == KeyEvent.VK_K){
            elfCraftBow = 1;
           }
           if(key == KeyEvent.VK_L){
            leafBladedStaff = 1;
           }
           if(key == KeyEvent.VK_M){
            steelFullhelm = 1;
           }
           if(key == KeyEvent.VK_N){
            steelGreaves = 1;
           }
           if(key == KeyEvent.VK_O){
            steelGauntlets = 1;
           }
           if(key == KeyEvent.VK_P){
            steelBoots = 1;
           }
           if(key == KeyEvent.VK_Q){
            steelCuriass = 1;
           }
           if(key == KeyEvent.VK_S){
            ponceyWizardsDress = 1;
           }
           if(key == KeyEvent.VK_T){
            darkLeatherVambraces = 1;
           }
           if(key == KeyEvent.VK_U){
            darkLeatherBoots = 1;
           }
           if(key == KeyEvent.VK_V){
            darkLeatherGreaves = 1;
           }
           if(key == KeyEvent.VK_X){
            darkLeatherCuriass = 1;
           }
           if(key == KeyEvent.VK_Y){
            darkLeatherCloak = 1;
           }
           if (key==KeyEvent.VK_SPACE){
            levelprint = 0;
           }
           
        }
        
        //////////inn/////////////////////////
    private static void pressedinn(int key) {
        if(key == KeyEvent.VK_R){
            village = 1;
            inn = 0;
            }
 
        if(key == KeyEvent.VK_A){
            buyBeer = 1;
        }
        if(key == KeyEvent.VK_B){
            rest = 1;
        }
        if(key == KeyEvent.VK_C){
            flirt = 1;
        }
        if(key == KeyEvent.VK_G){
            barmaid = 1;
        }
        if (key==KeyEvent.VK_SPACE){
            levelprint = 0;
         }
    }
        
        ///////////backstreet////////////////////
    private static void pressedstreet(int key) {
         if(key == KeyEvent.VK_R){
            village = 1;
            backStreet = 0;
         }
         if(key == KeyEvent.VK_L){
              look = 1;
         }
          if (key==KeyEvent.VK_SPACE){
            levelprint = 0;
         }
        }
  ///////////////////////////////////////////////////end village////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  
  /////////////////////////////////////////FOREST///////////////////////////////////////////////
  private static void pressedfor(int key) {
      if(key == KeyEvent.VK_W){
            w = true;   
        }
        else if(key == KeyEvent.VK_A){
            a = true;             
        }
        else if(key == KeyEvent.VK_D){
            d = true;
        }
        else if(key == KeyEvent.VK_S){
            s = true;
        }
      if (key==KeyEvent.VK_SPACE){
            levelprint = 0;
        }
      if (key==KeyEvent.VK_R){
            forest = 0;
            village = 1;
        }

        frame.repaint();  
    }
    
    private static void pressedbattlefor(int key) {
        if (key==KeyEvent.VK_SPACE){
         levelprint = 0;
        }
        if (key==KeyEvent.VK_ENTER){
         win = 0;
         forest = 1;
         battlefor = 0;
        }
        if (key==KeyEvent.VK_B){
         flash = 0;
         monsterGen = 1;
         yourTurn = 1;
         frame.repaint();
         }
        if (key==KeyEvent.VK_SPACE){
         levelprint = 0;
        }
        if (key==KeyEvent.VK_ENTER){
         win = 0;
         forest = 1;
         battlefor = 0;
        }
        if(key==KeyEvent.VK_C){
         fTKey = 1;
            }
        if(key==KeyEvent.VK_R){
         fTKey = 0;
         iTKey = 0;
            }
        if(key==KeyEvent.VK_I){
         iTKey = 1;
            }
        if(key==KeyEvent.VK_U){
         rTKey = 1; 
        }
        if(key==KeyEvent.VK_E){
         meAttack = 1;
        }
        if(key==KeyEvent.VK_G){
         maAttack = 1; 
        }
        if(key==KeyEvent.VK_N){
         raAttack = 1;
        }
        if(key==KeyEvent.VK_M){
         useMP = 1;   
        }
        if(key==KeyEvent.VK_H){
         useHP = 1;    
        }
        if(key==KeyEvent.VK_S){
         useSP = 1;    
        }
        if(key==KeyEvent.VK_P){
         useRP = 1;    
        }
        if(key==KeyEvent.VK_D){
         useCB = 1;     
        }
        if(key==KeyEvent.VK_O){
         useSA = 1;    
        }
        if(key==KeyEvent.VK_T){
         useW = 1;   
        }
        if(key==KeyEvent.VK_W){
         useWI = 1;    
        } 
       
       
    }
    
    private static void releasedfor(int key) {
        if(key == KeyEvent.VK_W){
            w = false;
        }
        else if(key == KeyEvent.VK_A){
            a = false;
        }
        else if(key == KeyEvent.VK_D){
            d = false;
        }
        else if(key == KeyEvent.VK_S){
            s = false;
        }

        frame.repaint();  

    }


  
   ///////////////////////////////////////////////////////////////////////////////// animation//////////////////////////////////////////////////////////////////////////////
   ////////////////startpage////////////////////////////////////////////////////////////
    public static void doAnimation() {
        gr.drawImage(backGround,0,0,null);
        frame.repaint();
       }
  
                  /////////////////// //race////////////////////////////////////

    public static void doAnimation2() {
                if (male == 1){
                gr.drawImage(maleBack,0,0,null);
            }
                else if (female == 1) {
                gr.drawImage(femaleBack,0,0,null);
            }
            frame.repaint();
        }
          
                    
                            
       ///////////////////////////////////////////////////class//////////////////////////////////////////////////////////////////////////////////////

    public static void doAnimation3() {
                   
                   if (human ==1){
                        gr.drawImage(humanPic,0,0,null);
                    }
                    else if (elf ==1){
                         gr.drawImage(elfPic,0,0,null);
                    }
                    else if (dwarf ==1){
                         gr.drawImage(dwarfPic,0,0,null);
                    }
                    else if (giant ==1){
                        gr.drawImage(giantPic,0,0,null);
                    }
                    else if (goblin ==1){
                        gr.drawImage(goblinPic,0,0,null);
                    }
                    else if (vampire ==1){
                        gr.drawImage(vampirePic,0,0,null);
                    }
                    else if (beastMan ==1){
                        gr.drawImage(beastManPic,0,0,null);
                    }
                    else if (ork ==1){
                        gr.drawImage(orkPic,0,0,null);
                    }

                    
                if (male == 1){
                gr.drawImage(maleBack2,350,500,null);
            }
                else if (female == 1) {
                gr.drawImage(femaleBack2,350,500,null);
            }
                    
             gr.drawImage(classPic,50,50,null);
            
             frame.repaint();
        }
        /////game start 
    public static void doAnimation4() {
            
                    gr.drawImage(backGround2,0,0,null);
                   
            
                   if (human ==1){
                        gr.drawImage(humanPic2,10,500,null);
                    }
                    else if (elf ==1){
                         gr.drawImage(elfPic2,10,500,null);
                    }
                    else if (dwarf ==1){
                         gr.drawImage(dwarfPic2,10,500,null);
                    }
                    else if (giant ==1){
                        gr.drawImage(giantPic2,10,500,null);
                    }
                    else if (goblin ==1){
                        gr.drawImage(goblinPic2,10,500,null);
                    }
                    else if (vampire ==1){
                        gr.drawImage(vampirePic2,10,500,null);
                    }
                    else if (beastMan ==1){
                        gr.drawImage(beastManPic2,10,500,null);
                    }
                    else if (ork ==1){
                        gr.drawImage(orkPic2,10,500,null);
                    }
                    
                    if (wizard ==1){
                        gr.drawImage(wizardPic,600,500,null);
                    }
                    else if (monk == 1){
                        gr.drawImage(monkPic,600,500,null);
                    }
                    else if (knight == 1){
                        gr.drawImage(knightPic,600,500,null);
                    }
                    else if (dragonSlayer == 1){
                        gr.drawImage(dragonSlayerPic,600,500,null);
                    }
                    else if (theif == 1){
                        gr.drawImage(theifPic,600,500,null);
                    }
                    else if (necromancer == 1){
                        gr.drawImage(necromancerPic,600,500,null);
                    }
                    else if (deathKnight == 1){
                        gr.drawImage(deathKnightPic,600,500,null);
                    }
                    else if (paladin == 1){
                        gr.drawImage(paladinPic,600,500,null);
                    }

                    
                     if (male == 1){
                     gr.drawImage(maleBack2,1000,500,null);
                   }
                     else if (female == 1) {
                     gr.drawImage(femaleBack2,1000,500,null);
                   }
            
           
            
            
            frame.repaint();
                                  

          }
          ///////////////////////////////////////////////////////////////////////////////////////////////////////// end char cre///////////////////////////////
          
          
   
          
          /////////////////////////////////////////////village///////////////////////////////////////////////////////////////////
   public static void doAnimationvill() {
              //stats
              levelup();
              death();
              statLim();
              gr.drawImage(villagePic,0,0,null);
              gr.drawString("HEALTH "+health+"/"+health2+"",50,50);
              gr.drawString("ATTACK "+attack+"",50,80);
              gr.drawString("DEFENCE "+defence+"",50,110);
              gr.drawString("GOLD "+gold+"",50,140);
              gr.drawString("XP "+xp+"",50,170);
              gr.drawString("LEVEL "+level+"",50,200);
              look = 0;
              love1 = 0;
              nolove = 0;
              t3 = 0;
              w1 = 0;
              w2 = 0;
              w3 = 0;
              //race/class stats
              if (wizard ==1){
                        gr.drawString("MAGIC "+magic+"/"+magic2+"",50,230);
                    }
                    else if (monk == 1){
                        gr.drawString("STAMINA "+stamin+"/"+stamin2+"",50,230);
                    }
                    else if (knight == 1){
                        gr.drawString("STAMINA "+stamin+"/"+stamin2+"",50,230);
                        gr.drawString("MAGIC "+magic+"/"+magic2+"",50,260);
                        gr.drawString("AMMO "+ammo+"/"+ammo2+"",50,290);
                    }
                    else if (dragonSlayer == 1){
                        gr.drawString("STAMINA "+stamin+"/"+stamin2+"",50,230);
                        gr.drawString("MAGIC "+magic+"/"+magic2+"",50,260);
                        gr.drawString("AMMO "+ammo+"/"+ammo2+"",50,290);
                    }
                    else if (theif == 1){
                        gr.drawString("AMMO "+ammo+"/"+ammo2+"",50,230);
                    }
                    else if (necromancer == 1){
                        gr.drawString("MAGIC "+magic+"/"+magic2+"",50,230);
                    }
                    else if (deathKnight == 1){
                        gr.drawString("STAMINA "+stamin+"/"+stamin2+"",50,230);
                        gr.drawString("MAGIC "+magic+"/"+magic2+"",50,260);
                        gr.drawString("AMMO "+ammo+"/"+ammo2+"",50,290);
                    }
                    else if (paladin == 1){
                        gr.drawString("STAMINA "+stamin+"/"+stamin2+"",50,230);
                        gr.drawString("MAGIC "+magic+"/"+magic2+"",50,260);                     
                    }
                    
              if (vampire ==1){
                gr.drawString("RAGE "+rage+"/"+rage2+"",50,230);
               }
               else if (beastMan ==1){
                        gr.drawString("RAGE "+rage+"/"+rage+"",50,230);
              }
                    
                    if(leveled ==1){
                        health2 = health2 +10;
                        attack = attack +10;
                        defence = defence +10;
                        ammo2 = ammo2 +10;
                        magic2 = magic2 +10;
                        stamin2 = stamin2 +10;
                        leveled =0;
                        levelprint = 1;
                    }
                    
                    if(levelprint ==1){
                        gr.drawImage(levelup,400,400,null);
                    }
                    
                    
                if(t1 == 1){
                    gr.drawString("You stuff as much gold into your pockets as possible and walk away without any troubble ",600,100);
                    gr.drawString("You gain " +reward+" gold",600,130);
                }
                
                if (t2 == 1){
                 gr.drawString("You stuff as much gold into your pockets as possible and then flee the scene",600,100);
                 gr.drawString("You gain " +reward+" gold",600,130);
                }
               
                if(t1 ==2){
                   gr.drawString("You yell and abuse the first guard you see for no reason",600,100);
                   gr.drawString("The guard responds with a hard punch to your face and throws you out of the castle... five health is lost",600,130);
                }
                
                if (t1 ==3){
                    gr.drawString("You aproch the throne and attempt to sit in it",600,100);
                    gr.drawString("Ten heavily armed guards grab you and throw you out of the castle",600,130);
                }
                
                if (t1 ==4){
                    gr.drawString("You are a attacked by a begger, she stabs you in the back with a knife",600,100);
                    gr.drawString("You drop you your knees and passout ",600,130);
                    gr.drawString("You awake to an old man in the village square bandaging your wound... ",600,160);
                }
                
                if (t1 ==5){
                    gr.drawString("You feel fully rested ready for another days adventure",600,100);
                }
                
                if (t1 ==6){
                    gr.drawString("Your thrown out of the inn, beaten and robbed. you eventualy pass out in the gutter",600,100);
                    gr.drawString("You awake in the moring with a massive headache and stink of shit ",600,130);
                    drunk = 0;
                }
                
                if (t1 ==7){
                    gr.drawString("Your stabed in the hand and chased out of the inn",600,100);
                }
                
                
                if(t2 ==2){
                    gr.drawString("You have been caught, all your gold has been taken and you have been beaten within a inch of your life! ",400,100);
                }
            
          
               
                        

              frame.repaint();
                                                        
              
            }
            
            
            
            
            ////////////////////////////////////////////////////castle/////////////////////////////////////////////////////
           
   public static void doAnimationcas() {
              //stats
              gr.drawImage(castlePic,0,0,null);
              levelup();
              death();
              statLim();
              gr.drawString("HEALTH "+health+"/"+health2+"",50,50);
              gr.drawString("ATTACK "+attack+"",50,80);
              gr.drawString("DEFENCE "+defence+"",50,110);
              gr.drawString("GOLD "+gold+"",50,140);
              gr.drawString("XP "+xp+"",50,170);
              gr.drawString("LEVEL "+level+"",50,200);
              gr.drawString("Press T to (Attempt) steel from king ",1235,80);
              gr.drawString("Press S to sit on the throne ",1250,110);
              gr.drawString("Press G to insult the guards ",1250,140);
              gr.drawString("Press R to return to village ",1250,170);
               t1 = 0;
               t2 = 0;

              //race/class stats
                            if (wizard ==1){
                        gr.drawString("MAGIC "+magic+"/"+magic2+"",50,230);
                    }
                    else if (monk == 1){
                        gr.drawString("STAMINA "+stamin+"/"+stamin2+"",50,230);
                    }
                    else if (knight == 1){
                        gr.drawString("STAMINA "+stamin+"/"+stamin2+"",50,230);
                        gr.drawString("MAGIC "+magic+"/"+magic2+"",50,260);
                        gr.drawString("AMMO "+ammo+"/"+ammo2+"",50,290);
                    }
                    else if (dragonSlayer == 1){
                        gr.drawString("STAMINA "+stamin+"/"+stamin2+"",50,230);
                        gr.drawString("MAGIC "+magic+"/"+magic2+"",50,260);
                        gr.drawString("AMMO "+ammo+"/"+ammo2+"",50,290);
                    }
                    else if (theif == 1){
                        gr.drawString("AMMO "+ammo+"/"+ammo2+"",50,230);
                    }
                    else if (necromancer == 1){
                        gr.drawString("MAGIC "+magic+"/"+magic2+"",50,230);
                    }
                    else if (deathKnight == 1){
                        gr.drawString("STAMINA "+stamin+"/"+stamin2+"",50,230);
                        gr.drawString("MAGIC "+magic+"/"+magic2+"",50,260);
                        gr.drawString("AMMO "+ammo+"/"+ammo2+"",50,290);
                    }
                    else if (paladin == 1){
                        gr.drawString("STAMINA "+stamin+"/"+stamin2+"",50,230);
                        gr.drawString("MAGIC "+magic+"/"+magic2+"",50,260);                     
                    }
                    
                    if (vampire ==1){
                        gr.drawString("RAGE "+rage+"/"+rage2+"",50,230);
                    }
                    else if (beastMan ==1){
                        gr.drawString("RAGE "+rage+"/"+rage+"",50,230);
                    }
                    
                    if(leveled ==1){
                        health2 = health2 +10;
                        attack = attack +10;
                        defence = defence +10;
                        ammo2 = ammo2 +10;
                        magic2 = magic2 +10;
                        stamin2 = stamin2 +10;
                        leveled =0;
                        levelprint = 1;
                    }
                    
                    if(levelprint ==1){
                         
                        gr.drawImage(levelup,400,400,null);
                    }
                    
                    if (royal ==1){
                        
                        if(theif ==1){
                            reward = generator.nextInt(99) + 1;
                            royal = 0;
                            castle = 0;
                            village = 1;
                            t1 = 1;
                            xp = xp + reward;
                            gold = gold + reward;

                        }
                        else if (theif ==0){
                            
                        chance = generator.nextInt(999) + 1;
                        if (chance >= 700){
                            reward = generator.nextInt(999) + 1;
                            gold = gold + reward;
                            royal = 0;
                            village = 1;
                            t2 = 1;
                            castle = 0;
                            xp = xp + reward;
                                                       
                        }
                        else if (chance <= 700) {
                            health = 1;
                            royal = 0;
                            castle = 0;
                            gold = 0;
                            village = 1; ////////change to forest 
                            t2 = 2;

                            
                        }
                  }
                }
                
                    
                if (guard == 1){
                    health = health - 5;
                    castle =0;
                    village = 1;
                    guard = 0;
                    xp = xp +50;
                    t1 = 2;
                }
                
                if (throne == 1){
                    castle = 0;
                    village = 1;
                    throne = 0;
                    xp = xp +50;
                    t1 = 3;
                }
                

                    
                        

              frame.repaint();
              
                            
              
            }
            
            
            ////////////////////////////////////////////////market//////////////////////////////////////////////
            
   public static void doAnimationmar() {
              //stats
              levelup();
              death();
              statLim();
              gr.drawImage(marketPic,0,0,null);
              gr.drawString("HEALTH "+health+"/"+health2+"",50,50);
              gr.drawString("ATTACK "+attack+"",50,80);
              gr.drawString("DEFENCE "+defence+"",50,110);
              gr.drawString("GOLD "+gold+"",50,140);
              gr.drawString("XP "+xp+"",50,170);
              gr.drawString("LEVEL "+level+"",50,200);
              gr.drawString("Press R to return to village ",50,320);
              
              
              gr.drawString("Refill Ammo --(1 gold per point) --A",600,110);
              gr.drawString("Magic Potion --300 gold --B",600,140);
              gr.drawString("Health Potion --500 gold --C",600,170);
              gr.drawString("Rage Potion --1000 gold --D",600,200);
              gr.drawString("Stamina Potion --100 gold --E",600,230);
              gr.drawString("Crusty Bread --100 gold --F",600,260);
              
              gr.drawString("Salted Pork --250 gold --G",950,110);
              gr.drawString("Water --50 gold --H",950,140);
              gr.drawString("Wine --100 gold --I",950,170);
              gr.drawString("Perfume --1000 gold --J",950,200);
              gr.drawString("Fishing Net --100 gold --K",950,230);
              gr.drawString("Rope --100 gold --L",950,260);
             
              
               t1 = 0;
               t2 = 0;
              //race/class stats
                            if (wizard ==1){
                        gr.drawString("MAGIC "+magic+"/"+magic2+"",50,230);
                    }
                    else if (monk == 1){
                        gr.drawString("STAMINA "+stamin+"/"+stamin2+"",50,230);
                    }
                    else if (knight == 1){
                        gr.drawString("STAMINA "+stamin+"/"+stamin2+"",50,230);
                        gr.drawString("MAGIC "+magic+"/"+magic2+"",50,260);
                        gr.drawString("AMMO "+ammo+"/"+ammo2+"",50,290);
                    }
                    else if (dragonSlayer == 1){
                        gr.drawString("STAMINA "+stamin+"/"+stamin2+"",50,230);
                        gr.drawString("MAGIC "+magic+"/"+magic2+"",50,260);
                        gr.drawString("AMMO "+ammo+"/"+ammo2+"",50,290);
                    }
                    else if (theif == 1){
                        gr.drawString("AMMO "+ammo+"/"+ammo2+"",50,230);
                    }
                    else if (necromancer == 1){
                        gr.drawString("MAGIC "+magic+"/"+magic2+"",50,230);
                    }
                    else if (deathKnight == 1){
                        gr.drawString("STAMINA "+stamin+"/"+stamin2+"",50,230);
                        gr.drawString("MAGIC "+magic+"/"+magic2+"",50,260);
                        gr.drawString("AMMO "+ammo+"/"+ammo2+"",50,290);
                    }
                    else if (paladin == 1){
                        gr.drawString("STAMINA "+stamin+"/"+stamin2+"",50,230);
                        gr.drawString("MAGIC "+magic+"/"+magic2+"",50,260);                     
                    }
                    
                    if (vampire ==1){
                        gr.drawString("RAGE "+rage+"/"+rage2+"",50,230);
                    }
                    else if (beastMan ==1){
                        gr.drawString("RAGE "+rage+"/"+rage+"",50,230);
                    }
                    
                    if(leveled ==1){
                        health2 = health2 +10;
                        attack = attack +10;
                        defence = defence +10;
                        ammo2 = ammo2 +10;
                        magic2 = magic2 +10;
                        stamin2 = stamin2 +10;
                        leveled =0;
                        levelprint = 1;
                    }
                    
                    if(levelprint ==1){ 
                        gr.drawImage(levelup,400,400,null);
                    }
                    
                    
                    if(wizard ==1){
                     w1 = 1;
                     w3 = 1;
                    }
                    if(theif ==1){
                     w1 = 1;
                     w2 = 1;
                    }
                    if(necromancer ==1){
                     w1 = 1;
                     w3 = 1;
                    }
                    if(monk ==1){
                     w2 = 1;
                     w3 = 1;
                    }
                    if(paladin ==1){
                     w3 = 1;
                    }
                    
                    if(t3==1){
                               gr.drawString("You cannot afford that ",200,100);
                            }
                    
                            
                   if(refillAmmo ==1){
                    
                    if (gold >= ammo2 - ammo && w3==1){
                        gr.drawString("You dont need that ",200,100);
                        refillAmmo = 0;
                       }
                       else if (gold >= ammo2 - ammo && ammo == ammo2 ){
                        gr.drawString("You can't buy anymore ",200,100);
                        refillAmmo = 0;
                       }
                       else if (gold >= ammo2 - ammo){
                        gold = gold -ammo2 - ammo;
                        refillAmmo = 0;
                        ammo = ammo2;
                       }
                       
                    if (gold < ammo2 - ammo){
                        t3 = 1;
                        refillAmmo = 0;
                    }                   
                
            }
            
            
                if(magicPotion ==1){
                    
                    if (gold >= 300 && w2==1){
                        gr.drawString("You cannot use that ",200,100);
                        magicPotion = 0;
                       }
                       else if (gold >= 300 && magicPotion2 == 99 ){
                        gr.drawString("You can't buy anymore ",200,100);
                        magicPotion = 0;
                       }
                       else if (gold >= 300){
                        gold = gold -300;
                        magicPotion = 0;
                        magicPotion2 = magicPotion2 +1;
                       }
                       
                    if (gold < 300){
                        t3 = 1;
                        magicPotion = 0;
                    }                   
                
            }
            
            if(healthPotion ==1){
                    
                     if (gold >= 500 && healthPotion2 == 99 ){
                        gr.drawString("You can't buy anymore ",200,100);
                        healthPotion = 0;
                       }
                       else if (gold >= 500){
                        gold = gold -500;
                        healthPotion = 0;
                        healthPotion2 = healthPotion2 +1;
                       }
                       
                    if (gold < 500){
                        t3 = 1;
                        healthPotion = 0;
                    }                   
                
            }
            
            if(ragePotion ==1){
                    
                    if (vampire ==1 && beastMan ==1){
                        gr.drawString("You cannot use that ",200,100);
                        ragePotion = 0;
                       }
                       else if (gold >= 1000 && ragePotion2 == 99 ){
                        gr.drawString("You can't buy anymore ",200,100);
                        ragePotion = 0;
                       }
                       else if (gold >= 1000){
                        gold = gold -1000;
                        ragePotion = 0;
                        ragePotion2 = ragePotion2 +1;
                       }
                       
                    if (gold < 1000){
                        t3 = 1;
                        ragePotion = 0;
                    }                   
                
            }
            
            if(staminaPotion ==1){
                    
                    if (gold >= 100 && w1==1){
                        gr.drawString("You cannot use that ",200,100);
                        staminaPotion = 0;
                       }
                       else if (gold >= 100 && staminaPotion2 == 99 ){
                        gr.drawString("You can't buy anymore ",200,100);
                        staminaPotion = 0;
                       }
                       else if (gold >= 100){
                        gold = gold -100;
                        staminaPotion = 0;
                        staminaPotion2 = staminaPotion2 +1;
                       }
                       
                    if (gold < 100){
                        t3 = 1;
                        staminaPotion = 0;
                    }                   
                
            }
            
            if(crustyBread ==1){
                    
                    if (gold >= 100 && crustyBread2 == 99 ){
                        gr.drawString("You can't buy anymore ",200,100);
                        crustyBread = 0;
                       }
                       else if (gold >= 100){
                        gold = gold -100;
                        crustyBread = 0;
                        crustyBread2 = crustyBread2 +1;
                       }
                       
                    if (gold < 100){
                        t3 = 1;
                        crustyBread = 0;
                    }                   
                
            }
            
            if(saltedPork ==1){
                    
                     if (gold >= 250 && saltedPork2 == 99 ){
                        gr.drawString("You can't buy anymore ",200,100);
                        crustyBread = 0;
                       }
                       else if (gold >= 250){
                        gold = gold -250;
                        saltedPork = 0;
                        saltedPork2 = saltedPork2 +1;
                       }
                       
                    if (gold < 250){
                        t3 = 1;
                        saltedPork = 0;
                    }                   
                
            }
            
            if(water ==1){
                    
                     if (gold >= 50 && water2 == 99 ){
                        gr.drawString("You can't buy anymore ",200,100);
                        water= 0;
                       }
                       else if (gold >= 50){
                        gold = gold -50;
                        water = 0;
                        water2 = water2 +1;
                       }
                       
                    if (gold < 50){
                        t3 = 1;
                        water = 0;
                    }                   
                
            }
            
            if(wine ==1){
                    
                     if (gold >= 100 && wine2 == 99 ){
                        gr.drawString("You can't buy anymore ",200,100);
                        wine= 0;
                       }
                       else if (gold >= 100){
                        gold = gold -100;
                        wine = 0;
                        wine2 = wine2 +1;
                       }
                       
                    if (gold < 100){
                        t3 = 1;
                        wine = 0;
                    }                   
                
            }
            
            if(perfume ==1){
                    
                     if (gold >= 1000 && perfume2 == 1 ){
                        gr.drawString("You can't buy anymore ",200,100);
                        perfume= 0;
                       }
                       else if (gold >= 1000){
                        gold = gold -1000;
                        perfume = 0;
                        perfume2 = perfume2 +1;
                       }
                       
                    if (gold < 1000){
                        t3 = 1;
                        perfume = 0;
                    }                   
                
            }
            
            if(fishingNet ==1){
                    
                     if (gold >= 100 && fishingNet2 == 1 ){
                        gr.drawString("You can't buy anymore ",200,100);
                        fishingNet= 0;
                       }
                       else if (gold >= 100){
                        gold = gold -100;
                        fishingNet = 0;
                        fishingNet2 = fishingNet2 +1;
                       }
                       
                    if (gold < 100){
                        t3 = 1;
                        fishingNet = 0;
                    }                   
                
            }
            
            if(rope ==1){
                    
                     if (gold >= 100 && rope2 == 1 ){
                        gr.drawString("You can't buy anymore ",200,100);
                        rope = 0;
                       }
                       else if (gold >= 100){
                        gold = gold -100;
                        rope = 0;
                        rope2 = rope2 +1;
                       }
                       
                    if (gold < 100){
                        t3 = 1;
                        rope = 0;
                    }                   
                
            }
                    
                    

              frame.repaint();
              
              
              
              
            }
            
            
   
            
            //////////////////////////////////////blacksmith////////////////////////////////////////////////////
            
   public static void doAnimationsmith() {
              gr.drawImage(blackSmithPic,0,0,null);
              levelup();
              death();
              statLim();
              gr.drawString("HEALTH "+health+"/"+health2+"",50,50);
              gr.drawString("ATTACK "+attack+"",50,80);
              gr.drawString("DEFENCE "+defence+"",50,110);
              gr.drawString("GOLD "+gold+"",50,140);
              gr.drawString("XP "+xp+"",50,170);
              gr.drawString("LEVEL "+level+"",50,200);
              gr.drawString("Press R to return to village ",50,320);
              
              gr.drawString("Steel Sword 2000 gold (+100 attack) A",600,110);
              gr.drawString("Oak Long Bow 2000 gold (+100 attack) B",600,140);
              gr.drawString("Basic Magic Staff 2000 gold (+100 attack + 50 magic) C",600,170);
              gr.drawString("Rusty Chain 1000 gold (+50 attack) D",600,200);
              gr.drawString("Dirty Sling 1000 gold (+50 attack) E",600,230);
              gr.drawString("Poncey Wand 1000 gold (+50 attack +10 magic) F",600,260);
              gr.drawString("Dragon Slayer Axe 15,000 gold (+500 attack) G",950,110);
              gr.drawString("Wizards Sleave 15,000 gold (+300 attack + 300 magic) H",950,140);
              gr.drawString("True Shot Bow 15,000 gold (+500 attack) I",950,170);
              gr.drawString("Skimitar 5000 gold (+150 attack) J",950,200);
              gr.drawString("Elf Craft Bow 5000 gold (+150 attack) K",950,230);
              gr.drawString("Leaf Bladed Staff 5000 gold (+100 attack +75 magic) L",950,260);
             
              
              gr.drawString("Steel Fullhelm 2000 gold (+50 defence) M",100,500);
              gr.drawString("Steel Greaves 2000 gold (+50 defence) N",100,530);
              gr.drawString("Steel Gauntlets 2000 gold (+50 defence) O",100,560);
              gr.drawString("Steel Boots 2000 gold (+50 defence) P",100,590);
              gr.drawString("Steel Curiass 2000 gold (+50 defence) Q",100,620);
              
              gr.drawString("Poncey Wizards Dress 2000 gold (+50 defence + 100 magic) S",500,500);
              
              
              gr.drawString("Dark Leather Vambraces 2000 gold (+50 defence) T",950,500);
              gr.drawString("Dark Leather Boots 2000 gold (+50 defence) U",950,530);
              gr.drawString("Dark Leather Greaves 2000 gold (+50 defence) V",950,560);
              gr.drawString("Dark Leather Curiass 2000 gold (+50 defence) X",950,590);
              gr.drawString("Dark Leather Cloak 2000 gold (+50 defence) Y",950,620);
              //race/class stats
               t1 = 0;
               t2 = 0;
                 if (wizard ==1){
                        gr.drawString("MAGIC "+magic+"/"+magic2+"",50,230);
                    }
                    else if (monk == 1){
                        gr.drawString("STAMINA "+stamin+"/"+stamin2+"",50,230);
                    }
                    else if (knight == 1){
                        gr.drawString("STAMINA "+stamin+"/"+stamin2+"",50,230);
                        gr.drawString("MAGIC "+magic+"/"+magic2+"",50,260);
                        gr.drawString("AMMO "+ammo+"/"+ammo2+"",50,290);
                    }
                    else if (dragonSlayer == 1){
                        gr.drawString("STAMINA "+stamin+"/"+stamin2+"",50,230);
                        gr.drawString("MAGIC "+magic+"/"+magic2+"",50,260);
                        gr.drawString("AMMO "+ammo+"/"+ammo2+"",50,290);
                    }
                    else if (theif == 1){
                        gr.drawString("AMMO "+ammo+"/"+ammo2+"",50,230);
                    }
                    else if (necromancer == 1){
                        gr.drawString("MAGIC "+magic+"/"+magic2+"",50,230);
                    }
                    else if (deathKnight == 1){
                        gr.drawString("STAMINA "+stamin+"/"+stamin2+"",50,230);
                        gr.drawString("MAGIC "+magic+"/"+magic2+"",50,260);
                        gr.drawString("AMMO "+ammo+"/"+ammo2+"",50,290);
                    }
                    else if (paladin == 1){
                        gr.drawString("STAMINA "+stamin+"/"+stamin2+"",50,230);
                        gr.drawString("MAGIC "+magic+"/"+magic2+"",50,260);                     
                    }
                    
                 if (vampire ==1){
                        gr.drawString("RAGE "+rage+"/"+rage2+"",50,230);
                 }
                 else if (beastMan ==1){
                        gr.drawString("RAGE "+rage+"/"+rage+"",50,230);
                 }
                    
                    if(leveled ==1){
                        health2 = health2 +10;
                        attack = attack +10;
                        defence = defence +10;
                        ammo2 = ammo2 +10;
                        magic2 = magic2 +10;
                        stamin2 = stamin2 +10;
                        leveled =0;
                        levelprint = 1;
                    }
                    
                    if(levelprint ==1){                         
                        gr.drawImage(levelup,400,400,null);
                    }
                    ///////////////////////////////class define wep/def
                     if(wizard ==1){
                     w1 = 1;
                     w3 = 1;
                    }
                    if(theif ==1){
                     w1 = 1;
                     w2 = 1;
                    }
                    if(necromancer ==1){
                     w1 = 1;
                     w3 = 1;
                    }
                    if(monk ==1){
                     w2 = 1;
                     w3 = 1;
                    }
                    if(paladin ==1){
                     w3 = 1;
                    }
                           /////////////////////////////ITEMS///////////////////////////////////////////       
                           
                     if(t3==1){
                      gr.drawString("You cannot afford that ",200,100);
                     }
                    
                if(steelSword ==1){
                    
                    if (gold >= 2000 && w1==1){
                        gr.drawString("You cannot wield that ",200,100);
                        steelSword = 0;
                       }
                       else if (gold >= 2000 && steelSword2 == 1 ){
                        gr.drawString("You already have that ",200,100);
                        steelSword = 0;
                       }
                       else if (gold >= 2000){
                        gold = gold -2000;
                        attack = attack +100;
                        steelSword = 0;
                        steelSword2 = 1;
                       }
                       
                    if (gold < 2000){
                        t3 = 1;
                        steelSword = 0;
                    }                   
                
               }
                    
                
                 if(rustyChain ==1){
                   if (gold >= 1000 && w1==1){
                        gr.drawString("You cannot wield that ",200,100);
                        rustyChain = 0;
                       }
                       else if (gold >= 2000 && rustyChain2 == 1 ){
                        gr.drawString("You already have that ",200,100);
                        rustyChain = 0;
                       }
                       else if (gold >= 1000){
                        gold = gold -1000;
                        attack = attack +50;
                        rustyChain = 0;
                        rustyChain2 =1;
                       }
                    if (gold < 2000){
                        t3 = 1;
                        rustyChain = 0;
                    }   
                        
                }
                
                if(dirtySling==1){
                   if (gold >= 1000 && w3==1){
                        gr.drawString("You cannot wield that ",200,100);
                        dirtySling = 0;
                       }
                       else if (gold >= 2000 && dirtySling2 == 1 ){
                        gr.drawString("You already have that ",200,100);
                        dirtySling = 0;
                       }
                       else if (gold >= 1000){
                        gold = gold -1000;
                        attack = attack +50;
                        dirtySling = 0;
                        dirtySling2 = 1;
                       }
                    if (gold < 2000){
                        t3 = 1;
                        dirtySling = 0;
                    }  
                        
                }
                
                if(ponceyWand ==1){
                   if (gold >= 1000 && w2 ==1){
                        gr.drawString("You cannot wield that ",200,100);
                        ponceyWand = 0;
                       }
                       else if (gold >= 2000 && ponceyWand2 == 1 ){
                        gr.drawString("You already have that ",200,100);
                        ponceyWand = 0;
                       }
                       else if (gold >= 1000){
                        gold = gold -1000;
                        attack = attack +50;
                        magic = magic +10;
                        magic2 = magic2 + 10;
                        ponceyWand = 0;
                        ponceyWand2 = 1;
                       }
                    if (gold < 2000){
                        t3 = 1;
                        ponceyWand = 0;
                    }  
                        
                }
                
                 if(dragonSlayerAxe ==1){
                   if (gold >= 15000 && w1 ==1){
                        gr.drawString("You cannot wield that ",200,100);
                        dragonSlayerAxe = 0;
                       }
                       else if (gold >= 2000 && dragonSlayerAxe2 == 1 ){
                        gr.drawString("You already have that ",200,100);
                        dragonSlayerAxe = 0;
                       }
                       else if (gold >= 15000){
                        gold = gold -15000;
                        attack = attack +500;
                        dragonSlayerAxe = 0;
                        dragonSlayerAxe2 = 1;
                       }
                    if (gold < 2000){
                        t3 = 1;
                        dragonSlayerAxe = 0;
                    }
                        
                }
                
                 if(trueShotBow ==1){
                   if (gold >= 15000 && w3 ==1){
                        gr.drawString("You cannot wield that ",200,100);
                        trueShotBow = 0;
                       }
                       else if (gold >= 2000 && trueShotBow2 == 1 ){
                        gr.drawString("You already have that ",200,100);
                        trueShotBow = 0;
                       }
                       else if (gold >= 15000){
                        gold = gold -15000;
                        attack = attack +500;
                        trueShotBow = 0;
                        trueShotBow2 = 1;
                       }
                    if (gold < 2000){
                        t3 = 1;
                        trueShotBow = 0;
                    }
                        
                }
                
                if(wizardsSleave ==1){
                   if (gold >= 15000 && w2 ==1){
                        gr.drawString("You cannot wield that ",200,100);
                        wizardsSleave = 0;
                       }
                       else if (gold >= 2000 && wizardsSleave2 == 1 ){
                        gr.drawString("You already have that ",200,100);
                        wizardsSleave = 0;
                       }
                       else if (gold >= 15000){
                        gold = gold -15000;
                        attack = attack +500;
                        magic = magic +300;
                        magic2 = magic2 + 300;
                        wizardsSleave = 0;
                        wizardsSleave2 = 1;
                       }
                    if (gold < 2000){
                        t3 = 1;
                        wizardsSleave = 0;
                    }
                        
                }
                
                if(skimitar ==1){
                   if (gold >= 5000 && w1 ==1){
                        gr.drawString("You cannot wield that ",200,100);
                        skimitar = 0;
                       }
                       else if (gold >= 2000 && skimitar2 == 1 ){
                        gr.drawString("You already have that ",200,100);
                        skimitar = 0;
                       }
                       else if (gold >= 5000){
                        gold = gold -5000;
                        attack = attack +150;
                        skimitar = 0;
                        skimitar2 = 1;
                       }
                    if (gold < 2000){
                        t3 = 1;
                        skimitar = 0;
                    }
                }
                
                if(leafBladedStaff ==1){
                   if (gold >= 5000 && w2 ==1){
                        gr.drawString("You cannot wield that ",200,100);
                        leafBladedStaff = 0;
                       }
                       else if (gold >= 2000 && leafBladedStaff2 == 1 ){
                        gr.drawString("You already have that ",200,100);
                        leafBladedStaff = 0;
                       }
                       else if (gold >= 5000){
                        gold = gold -5000;
                        attack = attack +150;
                        magic = magic + 75;
                        magic2 = magic2 + 75;
                        leafBladedStaff = 0;
                        leafBladedStaff2 = 1;
                       }
                    if (gold < 2000){
                        t3 = 1;
                        leafBladedStaff = 0;
                    }
                }
                
                if(elfCraftBow ==1){
                   if (gold >= 5000 && w3 ==1){
                        gr.drawString("You cannot wield that ",200,100);
                        elfCraftBow = 0;
                       }
                       else if (gold >= 2000 && elfCraftBow2 == 1 ){
                        gr.drawString("You already have that ",200,100);
                        elfCraftBow = 0;
                       }
                       else  if (gold >= 5000){
                        gold = gold -5000;
                        attack = attack +150;
                        elfCraftBow = 0;
                        elfCraftBow2 =1;
                       }
                    if (gold < 2000){
                        t3 = 1;
                        elfCraftBow = 0;
                    }
                }
                                        
                if(basicMagicStaff ==1){
                      if (gold >= 2000 && w2 ==1){
                        gr.drawString("You cannot wield that ",200,100);
                        basicMagicStaff = 0;
                    }
                    else if (gold >= 2000 && basicMagicStaff2 == 1 ){
                        gr.drawString("You already have that ",200,100);
                        basicMagicStaff = 0;
                       }
                    else if (gold >= 2000){
                        gold = gold -2000;
                        attack = attack +100;
                        magic = magic + 50;
                        magic2 = magic2 + 50;
                        basicMagicStaff = 0;
                        basicMagicStaff2 = 1;
                    }
                    if (gold < 2000){
                        t3 = 1;
                        basicMagicStaff  = 0;
                    }
                }
                
                if(oakLongBow ==1){
                      if (gold >= 2000 && w3 ==1){
                        gr.drawString("You cannot wield that ",200,100);
                        oakLongBow = 0;
                    }
                    else if (gold >= 2000 && oakLongBow2 == 1 ){
                        gr.drawString("You already have that ",200,100);
                        oakLongBow = 0;
                       }
                    else if (gold >= 2000){
                        gold = gold -2000;
                        attack = attack +100;
                        oakLongBow = 0;
                        oakLongBow2 = 1;
                    }
                    if (gold < 2000){
                        t3 = 1;
                        oakLongBow  = 0;
                    }
                }
                
                if(steelFullhelm ==1 ){
                    if (gold >= 2000&& w1 ==1){
                        gr.drawString("You cannot wield that ",200,100);
                        steelFullhelm = 0;
                    }
                    else if (gold >= 2000 && steelFullhelm2 == 1 ){
                        gr.drawString("You already have that ",200,100);
                        steelFullhelm = 0;
                       }
                    else if (gold >= 2000){
                        gold = gold - 2000;
                        defence = defence +50;
                        steelFullhelm = 0;
                        steelFullhelm2 = 1;
                    }
                    if (gold < 2000){
                        t3 = 1;
                        steelFullhelm  = 0;
                    }
                }
                
                if(steelBoots == 1){
                    if (gold >= 2000 && w1 ==1){
                        gr.drawString("You cannot wield that ",200,100);
                        steelBoots = 0;
                    }
                    else if (gold >= 2000 && steelBoots2 == 1 ){
                        gr.drawString("You already have that ",200,100);
                        steelBoots = 0;
                       }
                    else if (gold >= 2000){
                        gold = gold - 2000;
                        defence = defence +50;
                        steelBoots = 0;
                        steelBoots2 = 1;
                    }
                    if (gold < 2000){
                        t3 = 1;
                        steelBoots  = 0;
                    }
                }
                
                if(steelGreaves ==1 ){
                    if (gold >= 2000&& w1 ==1){
                        gr.drawString("You cannot wield that ",200,100);
                        steelGreaves = 0;
                    }
                    else if (gold >= 2000 && steelGreaves2 == 1 ){
                        gr.drawString("You already have that ",200,100);
                        steelGreaves = 0;
                       }
                    else if (gold >= 2000){
                        gold = gold - 2000;
                        defence = defence +50;
                        steelGreaves = 0;
                        steelGreaves2 = 1;
                    }
                    if (gold < 2000){
                        t3 = 1;
                        steelGreaves  = 0;
                    }
                }
                
                if(steelCuriass ==1 ){
                    if (gold >= 2000&& w1 ==1){
                        gr.drawString("You cannot wield that ",200,100);
                        steelCuriass = 0;
                    }
                    else if (gold >= 2000 && steelCuriass2 == 1 ){
                        gr.drawString("You already have that ",200,100);
                        steelCuriass = 0;
                       }
                    else if (gold >= 2000){
                        gold = gold - 2000;
                        defence = defence +50;
                        steelCuriass = 0;
                        steelCuriass2 = 1;
                    }
                    if (gold < 2000){
                        t3 = 1;
                        steelCuriass  = 0;
                    }
                }
                
                if(steelGauntlets ==1 ){
                    if (gold >= 2000&& w1 ==1){
                        gr.drawString("You cannot wield that ",200,100);
                        steelGauntlets = 0;
                    }
                    else if (gold >= 2000 && steelGauntlets2 == 1 ){
                        gr.drawString("You already have that ",200,100);
                        steelGauntlets = 0;
                       }
                    else if (gold >= 2000){
                        gold = gold - 2000;
                        defence = defence +50;
                        steelGauntlets = 0;
                        steelGauntlets2 = 1;
                    }
                    if (gold < 2000){
                        t3 = 1;
                        steelGauntlets  = 0;
                    }
                }
                
                if(ponceyWizardsDress ==1 ){
                    if (gold >= 2000&& w2 ==1){
                        gr.drawString("You cannot wield that ",200,100);
                        ponceyWizardsDress = 0;
                    }
                    else if (gold >= 2000 && ponceyWizardsDress2 == 1 ){
                        gr.drawString("You already have that ",200,100);
                        ponceyWizardsDress = 0;
                       }
                    else if (gold >= 2000){
                        gold = gold - 2000;
                        defence = defence +50;
                        magic = magic +100;
                        magic2 = magic2 +100;
                        ponceyWizardsDress = 0;
                        ponceyWizardsDress2 = 1;
                    }
                    if (gold < 2000){
                        t3 = 1;
                        ponceyWizardsDress  = 0;
                    }
                }
                
                if(darkLeatherVambraces ==1){
                    if (gold >= 2000 && w3 ==1){
                        gr.drawString("You cannot wield that ",200,100);
                        darkLeatherVambraces = 0;
                    }
                    else if (gold >= 2000 && darkLeatherVambraces2 == 1 ){
                        gr.drawString("You already have that ",200,100);
                        darkLeatherVambraces = 0;
                       }
                    else if (gold >= 2000){
                        gold = gold - 2000;
                        defence = defence +50;
                        darkLeatherVambraces = 0;
                        darkLeatherVambraces2 = 1;
                    }
                    if (gold < 2000){
                        t3 = 1;
                        darkLeatherVambraces  = 0;
                    
                    }
                }
                
                if(darkLeatherBoots ==1){
                    if (gold >= 2000 && w3 ==1){
                        gr.drawString("You cannot wield that ",200,100);
                        defence = defence +50;
                        darkLeatherBoots = 0;
                    }
                    else if (gold >= 2000 && darkLeatherBoots2 == 1 ){
                        gr.drawString("You already have that ",200,100);
                        darkLeatherBoots = 0;
                       }
                    else if (gold >= 2000){
                        gold = gold - 2000;
                        defence = defence +50;
                        darkLeatherBoots = 0;
                        darkLeatherBoots2 = 1;
                    }
                    if (gold < 2000){
                        t3 = 1;
                        darkLeatherBoots  = 0;
                    
                    }
                }                
                
                if(darkLeatherGreaves ==1){
                    if (gold >= 2000 && w3 ==1){
                        gr.drawString("You cannot wield that ",200,100);
                        darkLeatherGreaves = 0;
                    }
                    else if (gold >= 2000 && darkLeatherGreaves2 == 1 ){
                        gr.drawString("You already have that ",200,100);
                        darkLeatherGreaves = 0;
                       }
                    else if (gold >= 2000){
                        gold = gold - 2000;
                        defence = defence +50;
                        darkLeatherGreaves = 0;
                        darkLeatherGreaves2 = 1;
                    }
                    if (gold < 2000){
                        t3 = 1;
                        darkLeatherGreaves  = 0;
                    
                    }
                }
                                
                 if(darkLeatherCuriass ==1){
                    if (gold >= 2000 && w3 ==1){
                        gr.drawString("You cannot wield that ",200,100);
                        darkLeatherCuriass = 0;
                    }
                    else if (gold >= 2000 && darkLeatherCuriass2 == 1 ){
                        gr.drawString("You already have that ",200,100);
                        darkLeatherCuriass = 0;
                       }
                    else if (gold >= 2000){
                        gold = gold - 2000;
                        defence = defence +50;
                        darkLeatherCuriass = 0;
                        darkLeatherCuriass2 = 1;
                    }
                    if (gold < 2000){
                        t3 = 1;
                        darkLeatherCuriass  = 0;
                    
                    }
                }
                
                if(darkLeatherCloak ==1){
                    if (gold >= 2000 && w3 ==1){
                        gr.drawString("You cannot wield that ",200,100);
                        darkLeatherCloak = 0;
                    }
                    else if (gold >= 2000 && darkLeatherCloak2 == 1 ){
                        gr.drawString("You already have that ",200,100);
                        darkLeatherCloak = 0;
                       }
                    else if (gold >= 2000){
                        gold = gold - 2000;
                        defence = defence +50;
                        darkLeatherCloak = 0;
                        darkLeatherCloak2 = 1;
                    }
                    if (gold < 2000){
                        t3 = 1;
                        darkLeatherCloak  = 0;
                    
                    }
                }
                
                 

              frame.repaint();
              
              
              
              
            
        }
            
            
            
            /////////////////////////backstreet/////////////////////////////////////////
            
   public static void doAnimationstreet() {
              levelup();
              death();
              statLim();
              //stats
              gr.drawImage(backStreetPic,0,0,null);
              gr.drawString("HEALTH "+health+"/"+health2+"",50,50);
              gr.drawString("ATTACK "+attack+"",50,80);
              gr.drawString("DEFENCE "+defence+"",50,110);
              gr.drawString("GOLD "+gold+"",50,140);
              gr.drawString("XP "+xp+"",50,170);
              gr.drawString("LEVEL "+level+"",50,200);
              gr.drawString("Press R to return to village ",1250,80);
              gr.drawString("Press L to look for something of interest",1200,110);
              t1 = 0;
              t2 = 0;
              //race/class stats
                            if (wizard ==1){
                        gr.drawString("MAGIC "+magic+"/"+magic2+"",50,230);
                    }
                    else if (monk == 1){
                        gr.drawString("STAMINA "+stamin+"/"+stamin2+"",50,230);
                    }
                    else if (knight == 1){
                        gr.drawString("STAMINA "+stamin+"/"+stamin2+"",50,230);
                        gr.drawString("MAGIC "+magic+"/"+magic2+"",50,260);
                        gr.drawString("AMMO "+ammo+"/"+ammo2+"",50,290);
                    }
                    else if (dragonSlayer == 1){
                        gr.drawString("STAMINA "+stamin+"/"+stamin2+"",50,230);
                        gr.drawString("MAGIC "+magic+"/"+magic2+"",50,260);
                        gr.drawString("AMMO "+ammo+"/"+ammo2+"",50,290);
                    }
                    else if (theif == 1){
                        gr.drawString("AMMO "+ammo+"/"+ammo2+"",50,230);
                    }
                    else if (necromancer == 1){
                        gr.drawString("MAGIC "+magic+"/"+magic2+"",50,230);
                    }
                    else if (deathKnight == 1){
                        gr.drawString("STAMINA "+stamin+"/"+stamin2+"",50,230);
                        gr.drawString("MAGIC "+magic+"/"+magic2+"",50,260);
                        gr.drawString("AMMO "+ammo+"/"+ammo2+"",50,290);
                    }
                    else if (paladin == 1){
                        gr.drawString("STAMINA "+stamin+"/"+stamin2+"",50,230);
                        gr.drawString("MAGIC "+magic+"/"+magic2+"",50,260);                     
                    }
                    
                    if (vampire ==1){
                        gr.drawString("RAGE "+rage+"/"+rage2+"",50,230);
                    }
                    else if (beastMan ==1){
                        gr.drawString("RAGE "+rage+"/"+rage+"",50,230);
                    }
                    
                    if(leveled ==1){
                        health2 = health2 +10;
                        attack = attack +10;
                        defence = defence +10;
                        ammo2 = ammo2 +10;
                        magic2 = magic2 +10;
                        stamin2 = stamin2 +10;
                        leveled =0;
                        levelprint = 1;
                    }
                    
                    if(levelprint ==1){                         
                        gr.drawImage(levelup,400,400,null);
                    }
                    
                    
                    if(look==1){
                         chance = generator.nextInt(9) + 1;
                        if (chance >=2){
                            look = 0;
                            t3 = 9;                      
                        }
                        else if (chance == 1) {
                             if(vampire==1){
                                reward = generator.nextInt(99) + 1;
                                gold = gold + reward;
                                health = health2;
                                t3=10;
                                xp = xp + 1000;
                                look = 0;
                             }
                             if(beastMan==1){
                                 reward = generator.nextInt(99) + 1;
                                gold = gold + reward;
                                health = health2;
                                t3=11;
                                xp = xp + 1000;
                                look = 0;
                            }
                            if(beastMan==0 && vampire ==0){
                                health = health / 2;
                                look = 0;
                                t1 = 4;
                                backStreet = 0;
                                village = 1;
                            }
                        }
                    }
                    
                    if(t3 ==11){
                        gr.drawString("You are a attacked by a begger, he stabs you in the back with a knife",600,100);
                        gr.drawString("it dosen't effect you, you turn around tear him apart ",600,130);
                        gr.drawString("You regain all your health and some gold ",600,160);
                        gr.drawString("You gain "+reward+" gold",600,190);
                    }
                    
                    if(t3 ==10){
                        gr.drawString("You are a attacked by a begger, she stabs you in the back with a knife",600,100);
                        gr.drawString("it dosen't effect you, you turn around tear her throut out ",600,130);
                        gr.drawString("You regain all your health and some gold ",600,160);
                        gr.drawString("You gain "+reward+" gold",600,190);
                    }
                    
                    if(t3 ==9){
                        gr.drawString("You find nothing of interest",600,100);
                    }
                        
                        

              frame.repaint();
              
              
              
              
            }
            
            
            
            //////////////////////inn////////////////////////////////////////////
            
   public static void doAnimationinn() {
               levelup();
               death();
               statLim();
              gr.drawImage(innPic,0,0,null);
              gr.drawString("HEALTH "+health+"/"+health2+"",50,50);
              gr.drawString("ATTACK "+attack+"",50,80);
              gr.drawString("DEFENCE "+defence+"",50,110);
              gr.drawString("GOLD "+gold+"",50,140);
              gr.drawString("XP "+xp+"",50,170);
              gr.drawString("LEVEL "+level+"",50,200);
              gr.drawString("Press R to return to village ",1200,50);
              gr.drawString("Press B to recover for your adventures 100 gold ",1150,80);
              gr.drawString("Press C to flirt with the barmaid ",1200,110);
              gr.drawString("Press A to buy a beer 10 gold",1200,140);
              if(perfume2 ==1){
              gr.drawString("Press G to give the barmaid some perfume ",1150,170);
            }
              
         
              t1 = 0;
              t2 = 0;
              //race/class stats
                            if (wizard ==1){
                        gr.drawString("MAGIC "+magic+"/"+magic2+"",50,230);
                    }
                    else if (monk == 1){
                        gr.drawString("STAMINA "+stamin+"/"+stamin2+"",50,230);
                    }
                    else if (knight == 1){
                        gr.drawString("STAMINA "+stamin+"/"+stamin2+"",50,230);
                        gr.drawString("MAGIC "+magic+"/"+magic2+"",50,260);
                        gr.drawString("AMMO "+ammo+"/"+ammo2+"",50,290);
                    }
                    else if (dragonSlayer == 1){
                        gr.drawString("STAMINA "+stamin+"/"+stamin2+"",50,230);
                        gr.drawString("MAGIC "+magic+"/"+magic2+"",50,260);
                        gr.drawString("AMMO "+ammo+"/"+ammo2+"",50,290);
                    }
                    else if (theif == 1){
                        gr.drawString("AMMO "+ammo+"/"+ammo2+"",50,230);
                    }
                    else if (necromancer == 1){
                        gr.drawString("MAGIC "+magic+"/"+magic2+"",50,230);
                    }
                    else if (deathKnight == 1){
                        gr.drawString("STAMINA "+stamin+"/"+stamin2+"",50,230);
                        gr.drawString("MAGIC "+magic+"/"+magic2+"",50,260);
                        gr.drawString("AMMO "+ammo+"/"+ammo2+"",50,290);
                    }
                    else if (paladin == 1){
                        gr.drawString("STAMINA "+stamin+"/"+stamin2+"",50,230);
                        gr.drawString("MAGIC "+magic+"/"+magic2+"",50,260);                     
                    }
                    
                if (vampire ==1){
                        gr.drawString("RAGE "+rage+"/"+rage2+"",50,230);
                    }
                    else if (beastMan ==1){
                        gr.drawString("RAGE "+rage+"/"+rage+"",50,230);
                    }
                    
                if(leveled ==1){
                        health2 = health2 +10;
                        attack = attack +10;
                        defence = defence +10;
                        ammo2 = ammo2 +10;
                        magic2 = magic2 +10;
                        stamin2 = stamin2 +10;
                        leveled =0;
                        levelprint = 1;
                }
                    
                if(levelprint ==1){  
                        gr.drawImage(levelup,400,400,null);
                }
                    ////resting
                if(rest ==1 && gold < 100){
                  gr.drawString("Not enough gold!",600,250);
                  rest = 0;
                }
                else if(rest ==1){
                  health = health2;
                  magic = magic2;
                  stamin = stamin2;
                  gold = gold - 100;
                  t1 = 5;
                  rest = 0;
                  inn = 0;
                  village = 1;
                }
                    ////getting drunk/////
                    if(buyBeer ==1 && gold < 10){
                     gr.drawString("Not enough gold!",600,250);
                     buyBeer = 0;
                }
                    else if(buyBeer ==1){
                    gold = gold - 10;
                    drunk = drunk +1;
                    buyBeer = 0;
                }
                
                if (drunk >=3){
                    gr.drawString("You stumble around a bit knocking into people and tables",600,100);
                }
                if (drunk >=7){
                    gr.drawString("You throw up all over the counter and insult passing customers",600,130);
                }
                if (drunk ==10){
                    health = health - 10;
                    gold = gold - 100;
                    t1 = 6;
                    inn = 0;
                    xp = xp + 100;
                    village = 1;
                }
                ///flirting/////
                if(flirt ==1 && love ==1){ 
                    flirt = 0;
                    nolove = 2;
                }
                else if(flirt ==1 && goblin ==1){
                    nolove = 1;
                    flirt = 0;
                }
                else if(flirt ==1 && ork ==1){
                    nolove = 1;
                    flirt = 0;
                }
                else if(flirt ==1){
                    strike = strike +1;
                    flirt = 0;
                }                                                              

                if(strike ==1){
                    gr.drawString("You return to your seat with a red mark aross your cheak",600,160);
                }
                if(strike ==2){
                    gr.drawString("You return to your seat with a black eye",600,160);
                }
                if(strike ==3){
                    t1 = 7;
                    inn = 0;
                    village = 1;
                    health = health -5;
                    strike = strike +1;
                    xp = xp + 100;
                    flirt = 0;
                }
                if(strike >=4){
                    gr.drawString("The barmaid sees you and runs off before you can utter a word",600,160);
                    strike = strike +1;
                    flirt = 0;
                }
                    ////////giving a gift
                 if(barmaid ==1 && goblin ==1){
                    nolove = 1;
                    barmaid = 0;
                }
                else if(barmaid ==1 && ork ==1){
                    nolove = 1;
                    barmaid = 0;
                }
                else if(barmaid ==1){
                    strike = 0;
                    love = 1;
                    love1 = 1;
                    perfume2 = perfume2 -1;
                    xp = xp + 1000;
                    barmaid = 0;
                }
                
                if(love1 ==1){
                    gr.drawString("The barmaid smiles at you and all your offences are forgiven!",600,160);
                    gr.drawString("She leans over and gives you a kiss",600,190);
                }
                
                if(nolove ==1){
                    gr.drawString("Nothing could ever love you, dont bother",600,160);
                }
                
                if(nolove ==2){
                    gr.drawString("You have no more business with this women!",600,160);
                }
               

              frame.repaint();
              
              
              
              
            }
          /////////////////////////end village//////////////////////////////////////////////////////////////////////////////////////
          
          //////////////////////////////////FOREST/////////////////////////////////////////////////////////
                    public static void doAnimationfor() {
              gr.drawImage(forestPic,0,0,null);
              movement();
              levelup();
              death();
              statLim();
              w1 = 0;
              w2 = 0;
              w3 = 0;
              t1 = 0;
              t2 = 0;
              
              gr.drawString("HEALTH "+health+"/"+health2+"",50,50);
              gr.drawString("ATTACK "+attack+"",50,80);
              gr.drawString("DEFENCE "+defence+"",50,110);
              gr.drawString("GOLD "+gold+"",50,140);
              gr.drawString("XP "+xp+"",50,170);
              gr.drawString("LEVEL "+level+"",50,200);


              //race/class stats
                            if (wizard ==1){
                        gr.drawString("MAGIC "+magic+"/"+magic2+"",50,230);
                    }
                    else if (monk == 1){
                        gr.drawString("STAMINA "+stamin+"/"+stamin2+"",50,230);
                    }
                    else if (knight == 1){
                        gr.drawString("STAMINA "+stamin+"/"+stamin2+"",50,230);
                        gr.drawString("MAGIC "+magic+"/"+magic2+"",50,260);
                        gr.drawString("AMMO "+ammo+"/"+ammo2+"",50,290);
                    }
                    else if (dragonSlayer == 1){
                        gr.drawString("STAMINA "+stamin+"/"+stamin2+"",50,230);
                        gr.drawString("MAGIC "+magic+"/"+magic2+"",50,260);
                        gr.drawString("AMMO "+ammo+"/"+ammo2+"",50,290);
                    }
                    else if (theif == 1){
                        gr.drawString("AMMO "+ammo+"/"+ammo2+"",50,230);
                    }
                    else if (necromancer == 1){
                        gr.drawString("MAGIC "+magic+"/"+magic2+"",50,230);
                    }
                    else if (deathKnight == 1){
                        gr.drawString("STAMINA "+stamin+"/"+stamin2+"",50,230);
                        gr.drawString("MAGIC "+magic+"/"+magic2+"",50,260);
                        gr.drawString("AMMO "+ammo+"/"+ammo2+"",50,290);
                    }
                    else if (paladin == 1){
                        gr.drawString("STAMINA "+stamin+"/"+stamin2+"",50,230);
                        gr.drawString("MAGIC "+magic+"/"+magic2+"",50,260);                     
                    }
                    
                    if (vampire ==1){
                        gr.drawString("RAGE "+rage+"/"+rage2+"",50,230);
                    }
                    else if (beastMan ==1){
                        gr.drawString("RAGE "+rage+"/"+rage+"",50,230);
                    }
                    
                    if(leveled ==1){
                        health2 = health2 +10;
                        attack = attack +10;
                        defence = defence +10;
                        ammo2 = ammo2 +10;
                        magic2 = magic2 +10;
                        stamin2 = stamin2 +10;
                        leveled =0;
                        levelprint = 1;
                    }
                    
                    if(levelprint ==1){ 
                        gr.drawImage(levelup,400,400,null);
                    }
                    
                    
                    
              
               if(x<-50 ) x=-50;
               if(x>1400) x=1400;
               if(y<-35 ) y=-35;
               if(y>840) y=840;

              //draw char
              if(w ==true){
                  gr.drawImage(player, (int)x, y, null);
                  fight = generator.nextInt(99) + 1;
                  if(fight >=99){
                      forest = 0;
                      battlefor = 1;
                      flash = 1;
                }
              }
              if(a ==true){
                  gr.drawImage(player3, (int)x, y, null);
                  fight = generator.nextInt(99) + 1;
                  if(fight >=99){
                      forest = 0;
                      battlefor = 1;
                     flash = 1;
                }
                }
              if(d ==true){
                    gr.drawImage(player4, (int)x, y, null);
                    fight = generator.nextInt(99) + 1;
                  if(fight >=99){
                      forest = 0;
                      battlefor = 1;
                      flash = 1;
                }
                }
              if(s ==true){
                  gr.drawImage(player2, (int)x, y, null);
                  fight = generator.nextInt(99) + 1;
                  if(fight >=99){
                      forest = 0;
                      battlefor = 1;
                      flash = 1;
                }
                }
              if(s ==false && d == false && a ==false && w ==false){
                    gr.drawImage(player2, (int)x, y, null);
                }
             
              if(y==840){
               gr.drawString("Press R to return to village ",1200,50);
              }
                    
                     frame.repaint();
    }
    
    public static void doAnimationbattlefor() {
            statLim();
            levelup();
            death();
            battle();
            
            if(leveled ==1){
                        health2 = health2 +10;
                        attack = attack +10;
                        defence = defence +10;
                        ammo2 = ammo2 +10;
                        magic2 = magic2 +10;
                        stamin2 = stamin2 +10;
                        leveled =0;
                        levelprint = 1;
                    }
                    
                    if(levelprint ==1){ 
                        gr.drawImage(levelup,400,400,null);
                    }

                    
                    frame.repaint();
    }
    
                    
                    
    
     ///////////////////////////DEATH.....LIMITS...MONSTERS.....leveling and movement inports////////////////////////////
    
    public static void battle(){
                if(flash ==1){
              gr.drawImage(gifFight,400,200,null);
              gr.drawString("PRESS B TO START THE BATTLE",500,300);
              flash = 2;
            }
            else if(flash ==2){
                gr.drawImage(gifFight2,400,200,null);
                gr.drawString("PRESS B TO START THE BATTLE",500,300);
                flash = 3;
            }
            else if(flash ==3){
                gr.drawImage(gifFight,400,200,null);
                gr.drawString("PRESS B TO START THE BATTLE",500,300);
                flash = 4;
            }
            else if(flash ==4){
                gr.drawImage(gifFight2,400,200,null);
                gr.drawString("PRESS B TO START THE BATTLE",500,300);
                flash = 1;
            }
          
            if(flash ==0){
              gr.drawImage(battleforPic,400,200,null);
              gr.drawImage(humanFight,400,400,null);
              gr.drawImage(fightBar,600,500,null);
              gr.drawString("YOUR HEALTH "+health+"",420,390);
              gr.drawString("ENEMY HEALTH "+enemyHealth+"",800,450);
              frame.repaint();
            }
        
         
              ///////////////////////////////////////monsters//////////////////
            if(monsterGen ==1){
                  enemy = generator.nextInt(4) + 1;
                  monsterGen = 0;
             }
            if(enemy ==1){
             wolf = 1;
             enemyHealth = 40; 
             enemyDefence = 20;
             enemyAttack = 25;
             enemy =0;
            }
            if(enemy ==2){
             bear = 1;
             enemyHealth = 80;
             enemyDefence = 40;
             enemyAttack = 10;
             enemy =0;
            }
            if(enemy ==3){
             smallOrk = 1;
             enemyHealth = 60;
             enemyDefence = 0;
             enemyAttack = 15;
             enemy =0;
            }
            if(enemy ==4){
             troll = 1;
             enemyHealth = 200;
             enemyDefence = 60;
             enemyAttack = 10;
             enemy =0;
            }
            
        if(wolf ==1){
            gr.drawImage(wolfPic,700,200,null);
        }
        if(bear ==1){
            gr.drawImage(bearPic,700,200,null);
        }
        if(troll ==1){
            gr.drawImage(trollPic,700,200,null);
        }
        if(smallOrk ==1){
            gr.drawImage(smallOrkPic,700,200,null);
        }
            
            
            
            
                    
                    
                    ///////limted attack//////////
                     if(wizard ==1){
                     w1 = 1;
                     w3 = 1;
                    }
                    if(theif ==1){
                     w1 = 1;
                     w2 = 1;
                    }
                    if(necromancer ==1){
                     w1 = 1;
                     w3 = 1;
                    }
                    if(monk ==1){
                     w2 = 1;
                     w3 = 1;
                    }
                    if(paladin ==1){
                     w3 = 1;
                    }
                    

      
          if(yourTurn ==1){
                    //////battle//////
             if(fTKey ==1){
               if(vampire==1){
                   damage = 4;
                   fTKey = 0;
              }
               if(beastMan==1){
                   damage = 4;
                   fTKey = 0;
              }
              if(beastMan==0 && vampire ==0){
                gr.drawImage(fightTab,600,500,null);
              }
          }
          if(iTKey ==1){
             gr.drawImage(itemTab,600,500,null);
          }
            
             if(rTKey ==1){
                run = generator.nextInt(9) + 1;
             if(run <= 7){
               rTKey = 0;
               run = 0;
               gr.drawString("YOU CANT ESCAPE!",500,300);
               yourTurn =0;
             }
             if(run >= 8){
                wolf = 0;
                bear = 0;
                troll = 0;
                smallOrk = 0;
                battlefor = 0;
                forest = 1;
                rTKey = 0;
                run = 0;

             }
          }
          
          
          ///attacking///
          if(meAttack ==1 && w1 ==1){
              gr.drawString("YOU CANT DO THAT!",500,300);
              meAttack = 0;
          }
          else if(meAttack ==1 && stamin ==0){
              gr.drawString("YOUR OUT OF STAMINA!",500,300);
              meAttack = 0;
          }
          else if(meAttack ==1 && stamin >= 1 && w1 ==0){
              damage = 1;
              meAttack = 0;
              fTKey = 0;
            }
            
          if(maAttack ==1 && w2 ==1){
              gr.drawString("YOU CANT DO THAT!",500,300);
              maAttack = 0;
          }
          else if(maAttack ==1 && magic ==0){
              gr.drawString("YOUR OUT OF MAGIC!",500,300);
              maAttack = 0;
          }
          else if(maAttack ==1 && magic >= 1 && w2 ==0){
              damage = 2;
              maAttack = 0;
              fTKey = 0;
            }
            
          if(raAttack ==1 && w3 ==1){
              gr.drawString("YOU CANT DO THAT!",500,300);
              raAttack = 0;
          }
          else if(raAttack ==1 && ammo ==0){
              gr.drawString("YOUR OUT OF AMMO!",500,300);
              raAttack = 0;
          }
          else if(raAttack ==1 && ammo >= 1 && w3 ==0){
              damage = 3;
              raAttack = 0;
              fTKey = 0;
            }
            
            
            ////item use////
          if(useMP ==1 && magicPotion2 ==0){
             gr.drawString("YOU CANT DO THAT!",500,300);
             useMP = 0;
            }
          else if(useMP ==1 && magicPotion2 >=1){
              magicPotion2 = magicPotion2 -1;
              magic = magic +50;
              useMP = 0;
              yourTurn = 0;
              iTKey = 0;
          }
          
          if(useHP ==1 && healthPotion2 ==0){
             gr.drawString("YOU CANT DO THAT!",500,300);
             useHP = 0;
            }
          else if(useHP ==1 && healthPotion2 >=1){
              healthPotion2 = healthPotion2 -1;
              health = health +50;
              useHP = 0;
              yourTurn = 0;
              iTKey = 0;
          }
          
          if(useSP ==1 && staminaPotion2 ==0){
             gr.drawString("YOU CANT DO THAT!",500,300);
             useSP = 0;
            }
          else if(useSP ==1 && staminaPotion2 >=1){
              staminaPotion2 = staminaPotion2 -1;
              stamin = stamin +50;
              useSP = 0;
              yourTurn = 0;
              iTKey = 0;
          }
          
          if(useRP ==1 && ragePotion2 ==0){
             gr.drawString("YOU CANT DO THAT!",500,300);
             useRP = 0;
            }
          else if(useRP ==1 && ragePotion2 >=1){
              ragePotion2 = ragePotion2 -1;
              rage = rage +50;
              useRP = 0;
              yourTurn = 0;
              iTKey = 0;
          }
          
          if(useCB ==1 && crustyBread2 ==0){
             gr.drawString("YOU CANT DO THAT!",500,300);
             useCB = 0;
            }
          else if(useCB ==1 && crustyBread2 >=1){
              crustyBread2 = crustyBread2 -1;
              health = health +10;
              useCB = 0;
              yourTurn = 0;
              iTKey = 0;
          }
          
          if(useSA ==1 && saltedPork2 ==0){
             gr.drawString("YOU CANT DO THAT!",500,300);
             useSA = 0;
            }
          else if(useSA ==1 && saltedPork2 >=1){
              saltedPork2 = saltedPork2 -1;
              magic = magic +10;
              health = health +20;
              useSA = 0;
              yourTurn = 0;
              iTKey = 0;
          }
          
          if(useW ==1 && water2 ==0){
             gr.drawString("YOU CANT DO THAT!",500,300);
             useW = 0;
            }
          else if(useW ==1 && water2 >=1){
             water = water -1;
             health = health +5;
             useW = 0;
             yourTurn = 0;
             iTKey = 0;
          }
          
          if(useWI ==1 && wine2 ==0){
             gr.drawString("YOU CANT DO THAT!",500,300);
             useWI = 0;
            }
          else if(useWI ==1 && wine2 >=1){
              wine2 = wine2 -1;
              health = health +50;
              rage = rage +20;
              useWI = 0;
              yourTurn = 0;
              iTKey = 0;
          }
          
          
          /////hitting///
          if(damage ==1){
              if((attack - enemyDefence/2)<=0){
                   enemyHealth = enemyHealth - 0;
                }
                  else if((attack - enemyDefence/2)>=1){
                   enemyHealth = enemyHealth - (attack - enemyDefence/2);
                 } 
              stamin = stamin - 1;
              damage = 0;
              flash2 = 1;
              yourTurn = 0;
          }
          if(damage ==2){
              if((attack - enemyDefence/2)<=0){
                   enemyHealth = enemyHealth - 0;
                }
                  else if((attack - enemyDefence/2)>=1){
                   enemyHealth = enemyHealth - (attack - enemyDefence/2);
                 }
              magic = magic - 1;
              damage = 0;
              flash4 = 1;
              yourTurn = 0;
          }
          if(damage ==3){
              if((attack - enemyDefence/2)<=0){
                   enemyHealth = enemyHealth - 0;
                }
                  else if((attack - enemyDefence/2)>=1){
                   enemyHealth = enemyHealth - (attack - enemyDefence/2);
                 }
              ammo = ammo - 1;
              damage = 0;
              flash3 = 1;
              yourTurn = 0;
          }
          if(damage ==4){
               if(rage ==0){
              gr.drawString("YOUR OUT OF RAGE!",500,300);
              damage =0;
            }
            else if(rage >=1){
                if((attack - enemyDefence/2)<=0){
                   enemyHealth = enemyHealth - 0;
                }
                  else if((attack - enemyDefence/2)>=1){
                   enemyHealth = enemyHealth - (attack - enemyDefence/2);
                 }
              rage = rage - 5;
              damage = 0;
              flash2 = 1;
              yourTurn = 0;
          }
         }
        }
        
            if(flash2 ==1){
              gr.drawImage(slash,700,200,null);
              flash2 = 2;
            }
            else if(flash2 ==2){
                gr.drawImage(slash2,700,200,null);
                flash2 = 3;
            }
            else if(flash2 ==3){
                gr.drawImage(slash,700,200,null);
                flash2 = 4;
            }
            else if(flash2 ==4){
                gr.drawImage(slash2,700,200,null);
                flash2 = 0;
            }
            
            if(flash3 ==1){
                gr.drawImage(arrow,500,500,null);
                flash3 = 2;
            }
            else if(flash3 ==2){
                gr.drawImage(arrow,600,400,null);
                flash3 = 3;
            }
            else if(flash3 ==3){
                gr.drawImage(arrow,700,300,null);
                flash3 = 4;
            }
            else if(flash3 ==4){
                gr.drawImage(arrow,800,200,null);
                flash3 = 0;
            }
            
            if(flash4 ==1){
                gr.drawImage(mBall,500,500,null);
                flash4 = 2;
            }
            else if(flash4 ==2){
                gr.drawImage(mBall,600,400,null);
                flash4 = 3;
            }
            else if(flash4 ==3){
                gr.drawImage(mBall,700,300,null);
                flash4 = 4;
            }
            else if(flash4 ==4){
                gr.drawImage(mBall,800,200,null);
                flash4 = 0;
            }
            

           
        ////enemy attacks/////
        if(yourTurn ==0 && enemyHealth <=0){
                yourTurn = 1;
                enemyHealth = 0;
                win = 1;
                reward = generator.nextInt(499) + 1;
                xp = xp + reward;
                reward = generator.nextInt(99) + 1;
                gold = gold +reward;
        }
        else if(yourTurn == 0 && enemyHealth >=1){
            if((enemyAttack - defence/2)<=0){
            health = health - 0;
           }
            else if((enemyAttack - defence/2)>=1){
            health = health - (enemyAttack -defence/2);
            enemyflash = 1;
           }
            yourTurn = 1;
        }
        
        if(enemyflash ==1){
              gr.drawImage(slash,400,400,null);
              enemyflash = 2;
            }
        else if(enemyflash ==2){
                gr.drawImage(slash2,400,400,null);
                enemyflash = 3;
            }
        else if(enemyflash ==3){
                gr.drawImage(slash,400,400,null);
                enemyflash = 4;
            }
        else if(enemyflash ==4){
                gr.drawImage(slash2,400,400,null);
                enemyflash = 0;
            }
            
            if(win ==1){
         wolf = 0;
         bear = 0;
         troll = 0;
         smallOrk = 0;
         gr.drawImage(winPic,550,300,null);
         gr.drawString("YOU HAVE GAINED XP",670,370);
         gr.drawString("YOU HAVE GAINED GOLD",660,410);
        }
        }
        
        
    
    
   
          
          public static void movement(){
        if (w == true) {
            y = y -5;
            
        }
        if (s == true) {
            y = y +5;
            
        }
        if (a== true ) {
            x = x - 5;
            }
        if (d== true ) {
            x = x +5;
        }
    }
    
    
    public static void levelup(){
        if(xp >= 2000){            
            level = level + 1;
            leveled = 1;
            xp = 0;
        }
        if(level >=50){
            level = 50;
            xp = 0;
        }
    }
    
    public static void statLim(){
        if(gold <= 0){
            gold = 0;
        }
        if(stamin <= 0){
            stamin = 0;
        }
        if(magic <= 0){
            magic = 0;
        }
        if(ammo <= 0){
            ammo = 0;
        }
        if(rage<= 0){
            rage = 0;
        }
        if(stamin2 < stamin){
            stamin2 = stamin;
        }
        if(magic2 < magic){
            magic2 = magic;
        }
        if(ammo2 < ammo){
            ammo2 = ammo;
        }
        if(rage2 < rage){
            rage2 = rage;
        }
        if(health2 < health){
            health2 = health;
        }
        if(enemyHealth < 0){
            enemyHealth = 0;
        }
        
        
    }
    
    public static void death(){
        if(health <=0){
            health = 0;
            village = 0;
            inn = 0;
            blackSmith = 0;
            backStreet = 0;
            castle = 0;
            forest = 0;
            market = 0;
            bridge = 0;
            river = 0;
            shack = 0;
            huntingGround = 0;
            battlefor = 0;
            gameOver = 1;
            flash = 1;
        }
     }
     
     
     ///////////////gameover//////////////////
     public static void doAnimationgameOver(){
         if(flash ==1){
              gr.drawImage(gameOverPic,0,0,null);
              flash = 2;
            }
            else if(flash ==2){
                gr.drawImage(gameOverPic2,0,0,null);
                flash = 3;
            }
            else if(flash ==3){
                gr.drawImage(gameOverPic3,0,0,null);
                flash = 1;
            }    
            
         frame.repaint();
        }
        
        
        
}

       

