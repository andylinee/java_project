import java.util.Scanner;



public class hw1
{



  public static void main(String args[]){

    Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Welcome to Personal Health Management System"); // ��ܥX"�w��i�J�ӤH���d�޲z�t��"
	System.out.println("Please enter V1"); // ��ܥX"�п�J�A������,�H���ج����"���T��
	System.out.println("Please enter U0"); //��ܥX"�п�J�A���魫,�H���笰���"���T��
	double V1 = keyboard.nextDouble(); //�ŧi�ܼ�"height",�B���ܼƪ��Ȭ�floating-point number
	double U0 = keyboard.nextDouble(); //�ŧi�ܼ�"weight",�B���ܼƪ��Ȭ�floating-point number
	
	/*int next ; //�ŧi�ܼ�"next",�B���ܼƪ��Ȭ����
	for (next = 0;next>=0; next++) // ����for (Initialization; Boolean_Expression; Update)���j��Φ�
	{

	System.out.println("Press 0 to exit"); //���"��J0������}���t��"�T��
	System.out.println("Press 1 to get your BMI"); //���"��J1�������A��BMI��"���T��
	System.out.println("Press 2 to know how to let your BMI equals to 20"); //���"��J2�������ϧA��BMI�ȹF��20����k"���T��
	
	int input1 = keyboard.nextInt(); //�ŧi�ܼ�"input1",�B���ܼƪ��Ȭ����
    
	switch (input1) //����switch,�t�αN�̨ϥΪ̿�J0��1��2�ӭӧO���ͤ��P��output
	{
	    case 0: //�Y�ϥΪ̿�J"0"�h�i��H�U�{��
		     System.out.println("Thank you for using this system"); //���"�P�±z���ϥ�"���T��
			 System.exit(0); //�������t��
			 break; //�b�����switch
		case 1: //�Y�ϥΪ̿�J"1"�h�i��H�U�{��
             
			 double BMI = weight / (height*height); //�ŧi�ܼ�"BMI"��"weight / (height*height)",�B���Ȭ�floating-point number
             System.out.println("Your BMI is "+BMI); //���"�A��BMI�Ȭ�+�t�Ωҭp��X��BMI��"���T��
			 if (BMI<18.5) //�YBMI�Ȫ��d��"BMI<18.5",�h�i��H�U{}�����{��
			 {
			     System.out.println("You are underweight"); //���"�A�����L��"���T��
				 System.out.println("The range of your BMI is : BMI < 18.5"); //���"�A��BMI�ȸ��bBMI < 18.5���d��"���T��
				 System.out.println("Advice:you should eat more meat such as pork , steak , chicken ,etc."); //���"�̾ڧA��BMI�d��Ӵ��Ѫ���ĳ"���T��
			 }	
             else if (BMI>=18.5&&BMI<24) //�YBMI�Ȫ��d��"BMI>=18.5&&BMI<24"�h�i��H�U{}�����{��
             {	
                 System.out.println("You are normalweight"); //���"�A�������`"���T��
				 System.out.println("The range of your BMI is : 18.5 <= BMI < 24"); //���"�A��BMI�ȸ��bBMI>=18.5&&BMI<24���d��"
				 System.out.println("You should keep your diet hobby."); //���"�̾ڧA��BMI�d��Ӵ��Ѫ���ĳ"���T��
 
             } 
             else if (BMI>=24&&BMI<27) //�YBMI�Ȫ��d��"BMI>=24&&BMI<27"�h�i��H�U{}�����{��
			 {
			     System.out.println("You are overweight"); //���"�A�������L��"���T��
				 System.out.println("The range of your BMI is : 24 <= BMI <27"); //���"�A��BMI�ȸ��bBMI>=24&&BMI<27���d��"���T��
				 System.out.println("you should try to eat more vegetable and less meat."); //���"�̾ڧA��BMI�d��Ӵ��Ѫ���ĳ"���T��
			 }
			 else if (BMI>=27&&BMI<30) //�YBMI�Ȫ��d��"BMI>=27&&BMI<30"�h�i��H�U{}�����{��
             {
			     System.out.println("You are mild obesity"); //���"�A���������תέD"���T��
				 System.out.println("The range of your BMI is : 27 <= BMI < 30"); //���"�A��BMI�ȸ��b27 <= BMI < 30���d��"���T��
				 System.out.println("you have to eat less meat and go to exercise regularly."); //���"�̾ڧA��BMI�d��Ӵ��Ѫ���ĳ"���T��
             }			 
			 else if (BMI>=30&&BMI<35) //�YBMI�Ȫ��d��"BMI>=30&&BMI<35"�h�i��H�U{}�����{��
			 {
			     System.out.println("You are moderate obesity"); //���"�A���������תέD"���T��
				 System.out.println("The range of your BMI is : 30 <= BMI < 35"); //���"�A��BMI�ȸ��b30 <= BMI < 35���d��"���T��
				 System.out.println("you have to force yourselve to eat much less meat and junk food and have to exercise more."); //���"�̾ڧA��BMI�d��Ӵ��Ѫ���ĳ"���T��
			 } 
			 else //�YBMI�ȬҤ��b�W�z���d�򤺫h�i��H�U{}�����{��
			 {
			     System.out.println("You are severe obesity"); //���"�A�������L�תέD"���T��
				 System.out.println("The range of your BMI is : BMI >= 35"); //���"�A��BMI�ȸ��bBMI >= 35���d��"���T��
				 System.out.println("You should go to see the doctor and let the doctor help you to lose your weight."); //���"�̾ڧA��BMI�d��Ӵ��Ѫ���ĳ"���T��
			 }
			 break; //�b�����switch
		 case 2: //�Y�ϥΪ̿�J"2"�h�i��H�U�{��
		     
			 System.out.println("press 1 to get your ideal height "); //���"��J1�h����A���z�Q����"���T��
			 System.out.println("press 2 to get your ideal weight "); //���"��J2�h����A���z�Q�魫"���T��
			 
			 int input2 = keyboard.nextInt(); //�ŧi�ܼ�"input2",�B���ܼƪ��Ȭ����
			 
			 switch (input2) //����switch,�t�αN�̨ϥΪ̿�J1��2�ӭӧO���ͤ��P��output
			    {
			     case 1: //�Y�ϥΪ̿�J"1"�h�i��H�U�{��
			         double Hi = Math.sqrt(weight/20); //�ŧi�ܼ�"Hi"��"Math.sqrt(weight/20)"�B��Ȭ�floating-point number
			         double delta1 = height - Hi; //�ŧi�ܼ�"delta1"��"height - Hi"�B�Ȭ�floating-point number
					 double ddelta1 = -delta1; //�ŧi�ܼ�"ddelta1"��"-delta1"�B�Ȭ�floating-point number
			         if (delta1>0) //�Ydelta1>0�h�i��H�U{}�����{��
                     {					 
			             System.out.println(
					         "you have to shorten "+ ddelta1 +" cms in order to reach your ideal body shape."); //���"�A�����ܸGdelta1�����~��F��z�Q����"���T��
			         }
					 else if (delta1<0) //�Ydelta1<0�h�i��H�U{}�����{��
			         {
					     System.out.println(
					         "you have to grow "+ ddelta1 +" cms in order to reach your ideal body shape."); //���"�A��������delta1�����~��F��z�Q����"���T��
			         }
					 else //�Ydelta1���ȬҤ��b�H�W�d��h�i��H�U{}�����{��
			         {
					     System.out.println(
					         "you are already with the ideal body shape."); //���"�A�w�g�F��z�Q�����F"���T��
			         }
					 break; //�b�����switch
			     case 2: //�Y�ϥΪ̿�J"2"�h�i��H�U�{��
			         double Wi = 20*height*height; //�ŧi�ܼ�"Wi"��"20*height*height"�B�Ȭ�floating-point number
			         double delta2 = weight - Wi; //�ŧi�ܼ�"delta2"��"weight - Wi"�B�Ȭ�floating-point number
					 double ddelta2 = -delta2; //�ŧi�ܼ�"ddelta2"��"-delta2"�B�Ȭ�floating-point number
			         if (delta2>0) //�Ydelta2>0�h�i��H�U{}�����{��
			         {
					     System.out.println(
					         "you have to lose "+ ddelta2 +" kgs in order to reach your ideal body shape."); //���"�A�����delta2����~��F��z�Q����"���T��
			         }
					 else if (delta2<0) //�Ydelta2<0�h�i��H�U{}�����{��
			         {
					     System.out.println(
					         "you have to gain "+ ddelta2 +" kgs in order to reach your ideal body shape."); //���"�A�����W��delta2����~��F��z�Q����"���T��
			         }
					 else //�Ydelta2���ȬҤ��b�H�W�d�򤺫h�i��H�U{}�����{��
			         {
					     System.out.println(
					         "you are already with the ideal body shape."); //���"�A�w�g�F��z�Q�����F"���T��
			         }
					 break; //�b�����switch
			     default: //�Y�ϥΪ̿�J1�M2���~���ƭȫh�t�αN�{���������~�T��
				     System.out.println(
					     "you enter the wrong number , please enter 1 or 2."); //���"�A��J���~���Ʀr,�п�J1��2"
					 break;	//�b�����switch
                }					 
			 break; //�b�����switch
	
		 default : //�Y�ϥΪ̿�J0,1�M2�H�~���ƭȫh�t�αN�{���������~�T��
		     System.out.println(
					         "you enter the wrong number , please enter 0 , 1 or 2."); //���"�A��J���~���Ʀr,�п�J0��1��2"
			 break; //�b�����switch
			 
     }

	*/
	double Q = 1.945*10^10*V1^(3/2)/U0;
	System.out.println("Q = "+Q);

   }

   }

}
//�{������

