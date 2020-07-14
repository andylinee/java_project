import java.util.Scanner;



public class hw1
{



  public static void main(String args[]){

    Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Welcome to Personal Health Management System"); // 顯示出"歡迎進入個人健康管理系統"
	System.out.println("Please enter V1"); // 顯示出"請輸入你的身高,以公尺為單位"的訊息
	System.out.println("Please enter U0"); //顯示出"請輸入你的體重,以公斤為單位"的訊息
	double V1 = keyboard.nextDouble(); //宣告變數"height",且此變數的值為floating-point number
	double U0 = keyboard.nextDouble(); //宣告變數"weight",且此變數的值為floating-point number
	
	/*int next ; //宣告變數"next",且此變數的值為整數
	for (next = 0;next>=0; next++) // 此為for (Initialization; Boolean_Expression; Update)的迴圈形式
	{

	System.out.println("Press 0 to exit"); //顯示"輸入0選擇離開此系統"訊息
	System.out.println("Press 1 to get your BMI"); //顯示"輸入1選擇獲取你的BMI值"的訊息
	System.out.println("Press 2 to know how to let your BMI equals to 20"); //顯示"輸入2選擇獲取使你的BMI值達到20的方法"的訊息
	
	int input1 = keyboard.nextInt(); //宣告變數"input1",且此變數的值為整數
    
	switch (input1) //此為switch,系統將依使用者輸入0或1或2來個別產生不同的output
	{
	    case 0: //若使用者輸入"0"則進行以下程式
		     System.out.println("Thank you for using this system"); //顯示"感謝您的使用"的訊息
			 System.exit(0); //結束此系統
			 break; //在此停止此switch
		case 1: //若使用者輸入"1"則進行以下程式
             
			 double BMI = weight / (height*height); //宣告變數"BMI"為"weight / (height*height)",且此值為floating-point number
             System.out.println("Your BMI is "+BMI); //顯示"你的BMI值為+系統所計算出的BMI值"的訊息
			 if (BMI<18.5) //若BMI值的範圍為"BMI<18.5",則進行以下{}內的程式
			 {
			     System.out.println("You are underweight"); //顯示"你身材過輕"的訊息
				 System.out.println("The range of your BMI is : BMI < 18.5"); //顯示"你的BMI值落在BMI < 18.5的範圍內"的訊息
				 System.out.println("Advice:you should eat more meat such as pork , steak , chicken ,etc."); //顯示"依據你的BMI範圍而提供的建議"的訊息
			 }	
             else if (BMI>=18.5&&BMI<24) //若BMI值的範圍為"BMI>=18.5&&BMI<24"則進行以下{}內的程式
             {	
                 System.out.println("You are normalweight"); //顯示"你身材正常"的訊息
				 System.out.println("The range of your BMI is : 18.5 <= BMI < 24"); //顯示"你的BMI值落在BMI>=18.5&&BMI<24的範圍內"
				 System.out.println("You should keep your diet hobby."); //顯示"依據你的BMI範圍而提供的建議"的訊息
 
             } 
             else if (BMI>=24&&BMI<27) //若BMI值的範圍為"BMI>=24&&BMI<27"則進行以下{}內的程式
			 {
			     System.out.println("You are overweight"); //顯示"你的身材過重"的訊息
				 System.out.println("The range of your BMI is : 24 <= BMI <27"); //顯示"你的BMI值落在BMI>=24&&BMI<27的範圍內"的訊息
				 System.out.println("you should try to eat more vegetable and less meat."); //顯示"依據你的BMI範圍而提供的建議"的訊息
			 }
			 else if (BMI>=27&&BMI<30) //若BMI值的範圍為"BMI>=27&&BMI<30"則進行以下{}內的程式
             {
			     System.out.println("You are mild obesity"); //顯示"你的身材輕度肥胖"的訊息
				 System.out.println("The range of your BMI is : 27 <= BMI < 30"); //顯示"你的BMI值落在27 <= BMI < 30的範圍內"的訊息
				 System.out.println("you have to eat less meat and go to exercise regularly."); //顯示"依據你的BMI範圍而提供的建議"的訊息
             }			 
			 else if (BMI>=30&&BMI<35) //若BMI值的範圍為"BMI>=30&&BMI<35"則進行以下{}內的程式
			 {
			     System.out.println("You are moderate obesity"); //顯示"你的身材中度肥胖"的訊息
				 System.out.println("The range of your BMI is : 30 <= BMI < 35"); //顯示"你的BMI值落在30 <= BMI < 35的範圍內"的訊息
				 System.out.println("you have to force yourselve to eat much less meat and junk food and have to exercise more."); //顯示"依據你的BMI範圍而提供的建議"的訊息
			 } 
			 else //若BMI值皆不在上述的範圍內則進行以下{}內的程式
			 {
			     System.out.println("You are severe obesity"); //顯示"你的身材過度肥胖"的訊息
				 System.out.println("The range of your BMI is : BMI >= 35"); //顯示"你的BMI值落在BMI >= 35的範圍內"的訊息
				 System.out.println("You should go to see the doctor and let the doctor help you to lose your weight."); //顯示"依據你的BMI範圍而提供的建議"的訊息
			 }
			 break; //在此停止此switch
		 case 2: //若使用者輸入"2"則進行以下程式
		     
			 System.out.println("press 1 to get your ideal height "); //顯示"輸入1則獲取你的理想身高"的訊息
			 System.out.println("press 2 to get your ideal weight "); //顯示"輸入2則獲取你的理想體重"的訊息
			 
			 int input2 = keyboard.nextInt(); //宣告變數"input2",且此變數的值為整數
			 
			 switch (input2) //此為switch,系統將依使用者輸入1或2來個別產生不同的output
			    {
			     case 1: //若使用者輸入"1"則進行以下程式
			         double Hi = Math.sqrt(weight/20); //宣告變數"Hi"為"Math.sqrt(weight/20)"且其值為floating-point number
			         double delta1 = height - Hi; //宣告變數"delta1"為"height - Hi"且值為floating-point number
					 double ddelta1 = -delta1; //宣告變數"ddelta1"為"-delta1"且值為floating-point number
			         if (delta1>0) //若delta1>0則進行以下{}內的程式
                     {					 
			             System.out.println(
					         "you have to shorten "+ ddelta1 +" cms in order to reach your ideal body shape."); //顯示"你必須變矮delta1公分才能達到理想身材"的訊息
			         }
					 else if (delta1<0) //若delta1<0則進行以下{}內的程式
			         {
					     System.out.println(
					         "you have to grow "+ ddelta1 +" cms in order to reach your ideal body shape."); //顯示"你必須長高delta1公分才能達到理想身材"的訊息
			         }
					 else //若delta1的值皆不在以上範圍則進行以下{}內的程式
			         {
					     System.out.println(
					         "you are already with the ideal body shape."); //顯示"你已經達到理想身材了"的訊息
			         }
					 break; //在此停止此switch
			     case 2: //若使用者輸入"2"則進行以下程式
			         double Wi = 20*height*height; //宣告變數"Wi"為"20*height*height"且值為floating-point number
			         double delta2 = weight - Wi; //宣告變數"delta2"為"weight - Wi"且值為floating-point number
					 double ddelta2 = -delta2; //宣告變數"ddelta2"為"-delta2"且值為floating-point number
			         if (delta2>0) //若delta2>0則進行以下{}內的程式
			         {
					     System.out.println(
					         "you have to lose "+ ddelta2 +" kgs in order to reach your ideal body shape."); //顯示"你必須減重delta2公斤才能達到理想身材"的訊息
			         }
					 else if (delta2<0) //若delta2<0則進行以下{}內的程式
			         {
					     System.out.println(
					         "you have to gain "+ ddelta2 +" kgs in order to reach your ideal body shape."); //顯示"你必須增重delta2公斤才能達到理想身材"的訊息
			         }
					 else //若delta2的值皆不在以上範圍內則進行以下{}內的程式
			         {
					     System.out.println(
					         "you are already with the ideal body shape."); //顯示"你已經達到理想身材了"的訊息
			         }
					 break; //在此停止此switch
			     default: //若使用者輸入1和2之外的數值則系統將認為此為錯誤訊息
				     System.out.println(
					     "you enter the wrong number , please enter 1 or 2."); //顯示"你輸入錯誤的數字,請輸入1或2"
					 break;	//在此停止此switch
                }					 
			 break; //在此停止此switch
	
		 default : //若使用者輸入0,1和2以外的數值則系統將認為此為錯誤訊息
		     System.out.println(
					         "you enter the wrong number , please enter 0 , 1 or 2."); //顯示"你輸入錯誤的數字,請輸入0或1或2"
			 break; //在此停止此switch
			 
     }

	*/
	double Q = 1.945*10^10*V1^(3/2)/U0;
	System.out.println("Q = "+Q);

   }

   }

}
//程式結束

