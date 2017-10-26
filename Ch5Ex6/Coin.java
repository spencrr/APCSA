//********************************************************************
//  Coin.java       Author: Lewis/Loftus/Cocking
//
//  Represents a coin with two sides that can be flipped.
//********************************************************************

import java.util.Random;

public class Coin implements Lockable
{
   private final int HEADS = 0;
   private final int TAILS = 1;
 
   Random generator=new Random();

   private int face;
   /* Add these 2 instance variables for the Lock  */
   private int coinkey;
   private boolean check;

   //-----------------------------------------------------------------
   //  Sets up the coin by flipping it initially.
   //-----------------------------------------------------------------
   public Coin ()
   {
      flip();
      check=false;
      coinkey=0;
   }
   
   
   //-----------------------------------------------------------------
   //  Flips the coin by randomly choosing a face value.
   //-----------------------------------------------------------------
   public void flip ()
   {
      
      face = generator.nextInt(2);
   }

   //-----------------------------------------------------------------
   //  Returns true if the current face of the coin is heads.
   //-----------------------------------------------------------------
   public boolean isHeads ()
   {
       
      return (face == HEADS);
      
   }

   //-----------------------------------------------------------------
   //  Returns the current face of the coin as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      
      String faceName;
      if (face == HEADS)
         faceName = "Heads";
      else
         faceName = "Tails";

      return faceName;}
      
   }

