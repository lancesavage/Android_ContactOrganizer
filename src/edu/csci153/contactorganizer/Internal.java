package edu.csci153.contactorganizer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class Internal extends Activity {
    /** Called when the activity is first created. */
	
	static String[][] contacts = new String[5][4];
	static int contactNum = 0;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.internal);
       
        
        
        Intent i = getIntent();
        
        String[] inputs = i.getStringArrayExtra("ARGS");
      
       //System.out.println(inputs[0]);
        //System.out.println(contactNum);
        
        String input1 = inputs[0];
        String input2 = inputs[1];
        String input3 = inputs[2];
        String input4 = inputs[3];
        

        
      if(contactNum < 5){
        contacts[contactNum][0] = input1; 
        contacts[contactNum][1] = input2;
        contacts[contactNum][2] = input3;
        contacts[contactNum][3] = input4;
      }
        
        
      //  System.out.println(contactNum);
        
        if(contactNum == 0){
        
        	((TextView)findViewById(R.id.tvLNameIA)).setText(contacts[contactNum][0]);
        	((TextView)findViewById(R.id.tvFNameIA)).setText(contacts[contactNum][1]);
        	((TextView)findViewById(R.id.tvDepartmentA)).setText(contacts[contactNum][2]);
        	((TextView)findViewById(R.id.tvExtensionA)).setText(contacts[contactNum][3]);
       
        } else if (contactNum == 1){
        	
        	((TextView)findViewById(R.id.tvLNameIA)).setText(contacts[0][0]);
        	((TextView)findViewById(R.id.tvFNameIA)).setText(contacts[0][1]);
        	((TextView)findViewById(R.id.tvDepartmentA)).setText(contacts[0][2]);
        	((TextView)findViewById(R.id.tvExtensionA)).setText(contacts[0][3]);
       
        	
        	((TextView)findViewById(R.id.tvLNameIB)).setText(contacts[contactNum][0]);
            ((TextView)findViewById(R.id.tvFNameIB)).setText(contacts[contactNum][1]);
            ((TextView)findViewById(R.id.tvDepartmentB)).setText(contacts[contactNum][2]);
            ((TextView)findViewById(R.id.tvExtensionB)).setText(contacts[contactNum][3]);
        
        }else if (contactNum==2){
        	
        	((TextView)findViewById(R.id.tvLNameIA)).setText(contacts[0][0]);
        	((TextView)findViewById(R.id.tvFNameIA)).setText(contacts[0][1]);
        	((TextView)findViewById(R.id.tvDepartmentA)).setText(contacts[0][2]);
        	((TextView)findViewById(R.id.tvExtensionA)).setText(contacts[0][3]);
       
        	
        	((TextView)findViewById(R.id.tvLNameIB)).setText(contacts[1][0]);
            ((TextView)findViewById(R.id.tvFNameIB)).setText(contacts[1][1]);
            ((TextView)findViewById(R.id.tvDepartmentB)).setText(contacts[1][2]);
            ((TextView)findViewById(R.id.tvExtensionB)).setText(contacts[1][3]);
       
        	
        	((TextView)findViewById(R.id.tvLNameIC)).setText(contacts[contactNum][0]);
            ((TextView)findViewById(R.id.tvFNameIC)).setText(contacts[contactNum][1]);
            ((TextView)findViewById(R.id.tvDepartmentC)).setText(contacts[contactNum][2]);
            ((TextView)findViewById(R.id.tvExtensionC)).setText(contacts[contactNum][3]);	
        
        }else if (contactNum==3){
        	
        	((TextView)findViewById(R.id.tvLNameIA)).setText(contacts[0][0]);
        	((TextView)findViewById(R.id.tvFNameIA)).setText(contacts[0][1]);
        	((TextView)findViewById(R.id.tvDepartmentA)).setText(contacts[0][2]);
        	((TextView)findViewById(R.id.tvExtensionA)).setText(contacts[0][3]);
        	
        	((TextView)findViewById(R.id.tvLNameIB)).setText(contacts[1][0]);
            ((TextView)findViewById(R.id.tvFNameIB)).setText(contacts[1][1]);
            ((TextView)findViewById(R.id.tvDepartmentB)).setText(contacts[1][2]);
            ((TextView)findViewById(R.id.tvExtensionB)).setText(contacts[1][3]);
       
        	((TextView)findViewById(R.id.tvLNameIC)).setText(contacts[2][0]);
            ((TextView)findViewById(R.id.tvFNameIC)).setText(contacts[2][1]);
            ((TextView)findViewById(R.id.tvDepartmentC)).setText(contacts[2][2]);
            ((TextView)findViewById(R.id.tvExtensionC)).setText(contacts[2][3]);	
        
        	((TextView)findViewById(R.id.tvLNameID)).setText(contacts[contactNum][0]);
            ((TextView)findViewById(R.id.tvFNameID)).setText(contacts[contactNum][1]);
            ((TextView)findViewById(R.id.tvDepartmentD)).setText(contacts[contactNum][2]);
            ((TextView)findViewById(R.id.tvExtensionD)).setText(contacts[contactNum][3]);
       
        }else if (contactNum==4){
        	
        	((TextView)findViewById(R.id.tvLNameIA)).setText(contacts[0][0]);
        	((TextView)findViewById(R.id.tvFNameIA)).setText(contacts[0][1]);
        	((TextView)findViewById(R.id.tvDepartmentA)).setText(contacts[0][2]);
        	((TextView)findViewById(R.id.tvExtensionA)).setText(contacts[0][3]);
        	
        	((TextView)findViewById(R.id.tvLNameIB)).setText(contacts[1][0]);
            ((TextView)findViewById(R.id.tvFNameIB)).setText(contacts[1][1]);
            ((TextView)findViewById(R.id.tvDepartmentB)).setText(contacts[1][2]);
            ((TextView)findViewById(R.id.tvExtensionB)).setText(contacts[1][3]);
       
        	((TextView)findViewById(R.id.tvLNameIC)).setText(contacts[2][0]);
            ((TextView)findViewById(R.id.tvFNameIC)).setText(contacts[2][1]);
            ((TextView)findViewById(R.id.tvDepartmentC)).setText(contacts[2][2]);
            ((TextView)findViewById(R.id.tvExtensionC)).setText(contacts[2][3]);	
        
        	((TextView)findViewById(R.id.tvLNameID)).setText(contacts[3][0]);
            ((TextView)findViewById(R.id.tvFNameID)).setText(contacts[3][1]);
            ((TextView)findViewById(R.id.tvDepartmentD)).setText(contacts[3][2]);
            ((TextView)findViewById(R.id.tvExtensionD)).setText(contacts[3][3]);
        	
        	((TextView)findViewById(R.id.tvLNameIE)).setText(contacts[contactNum][0]);
            ((TextView)findViewById(R.id.tvFNameIE)).setText(contacts[contactNum][1]);
            ((TextView)findViewById(R.id.tvDepartmentE)).setText(contacts[contactNum][2]);
            ((TextView)findViewById(R.id.tvExtensionE)).setText(contacts[contactNum][3]);
       
        }else {
          	
        	((TextView)findViewById(R.id.tvLNameIA)).setText(contacts[0][0]);
        	((TextView)findViewById(R.id.tvFNameIA)).setText(contacts[0][1]);
        	((TextView)findViewById(R.id.tvDepartmentA)).setText(contacts[0][2]);
        	((TextView)findViewById(R.id.tvExtensionA)).setText(contacts[0][3]);
        	
        	((TextView)findViewById(R.id.tvLNameIB)).setText(contacts[1][0]);
            ((TextView)findViewById(R.id.tvFNameIB)).setText(contacts[1][1]);
            ((TextView)findViewById(R.id.tvDepartmentB)).setText(contacts[1][2]);
            ((TextView)findViewById(R.id.tvExtensionB)).setText(contacts[1][3]);
       
        	((TextView)findViewById(R.id.tvLNameIC)).setText(contacts[2][0]);
            ((TextView)findViewById(R.id.tvFNameIC)).setText(contacts[2][1]);
            ((TextView)findViewById(R.id.tvDepartmentC)).setText(contacts[2][2]);
            ((TextView)findViewById(R.id.tvExtensionC)).setText(contacts[2][3]);	
        
        	((TextView)findViewById(R.id.tvLNameID)).setText(contacts[3][0]);
            ((TextView)findViewById(R.id.tvFNameID)).setText(contacts[3][1]);
            ((TextView)findViewById(R.id.tvDepartmentD)).setText(contacts[3][2]);
            ((TextView)findViewById(R.id.tvExtensionD)).setText(contacts[3][3]);
        	
        	((TextView)findViewById(R.id.tvLNameIE)).setText(contacts[4][0]);
            ((TextView)findViewById(R.id.tvFNameIE)).setText(contacts[4][1]);
            ((TextView)findViewById(R.id.tvDepartmentE)).setText(contacts[4][2]);
            ((TextView)findViewById(R.id.tvExtensionE)).setText(contacts[4][3]);
       
        	
        }
        
        findViewById(R.id.btnDetails).setOnClickListener(new OnClickListener() {
        	@Override
			public void onClick (View v) {
        		
        		((TextView)findViewById(R.id.tvFNameI)).setVisibility(View.VISIBLE);

        		((TextView)findViewById(R.id.tvFNameIA)).setVisibility(View.VISIBLE);
        		((TextView)findViewById(R.id.tvFNameIB)).setVisibility(View.VISIBLE);
        		((TextView)findViewById(R.id.tvFNameIC)).setVisibility(View.VISIBLE);
        		((TextView)findViewById(R.id.tvFNameID)).setVisibility(View.VISIBLE);
        		((TextView)findViewById(R.id.tvFNameIE)).setVisibility(View.VISIBLE);
        		
        		((TextView)findViewById(R.id.tvExtension)).setVisibility(View.VISIBLE);


        		((TextView)findViewById(R.id.tvExtensionA)).setVisibility(View.VISIBLE);
        		((TextView)findViewById(R.id.tvExtensionB)).setVisibility(View.VISIBLE);
        		((TextView)findViewById(R.id.tvExtensionC)).setVisibility(View.VISIBLE);
        		((TextView)findViewById(R.id.tvExtensionD)).setVisibility(View.VISIBLE);
        		((TextView)findViewById(R.id.tvExtensionE)).setVisibility(View.VISIBLE);
        	}
        	});
        

        if(contactNum < 5){	
    	contactNum++;
        }
    }
    
    

}