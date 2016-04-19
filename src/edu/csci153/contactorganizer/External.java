package edu.csci153.contactorganizer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class External extends Activity {
    /** Called when the activity is first created. */
	
	static String[][] contacts = new String[5][4];
	static int contactNum = 0;
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.external);

        Intent i = getIntent();
        
        String[] inputs = i.getStringArrayExtra("ARGS");
      
      //  System.out.println(inputs[0]);
       // System.out.println(contactNum);
        
        String input1 = inputs[0];
        String input2 = inputs[1];
        String input3 = inputs[2];
        String input4 = inputs[3];
        
  //      if(contactNum < 4){
        contacts[contactNum][0] = input1; 
        contacts[contactNum][1] = input2;
        contacts[contactNum][2] = input3;
        contacts[contactNum][3] = input4;
    //    }
        
        System.out.println(contactNum);
        
        if(contactNum == 0){
        
        	((TextView)findViewById(R.id.tvLNameEA)).setText(contacts[contactNum][0]);
        	((TextView)findViewById(R.id.tvFNameEA)).setText(contacts[contactNum][1]);
        	((TextView)findViewById(R.id.tvCompanyA)).setText(contacts[contactNum][2]);
        	((TextView)findViewById(R.id.tvPhoneA)).setText(contacts[contactNum][3]);
       
        } else if (contactNum == 1){
        	
        	((TextView)findViewById(R.id.tvLNameEA)).setText(contacts[0][0]);
        	((TextView)findViewById(R.id.tvFNameEA)).setText(contacts[0][1]);
        	((TextView)findViewById(R.id.tvCompanyA)).setText(contacts[0][2]);
        	((TextView)findViewById(R.id.tvPhoneA)).setText(contacts[0][3]);
       
        	
        	((TextView)findViewById(R.id.tvLNameEB)).setText(contacts[contactNum][0]);
            ((TextView)findViewById(R.id.tvFNameEB)).setText(contacts[contactNum][1]);
            ((TextView)findViewById(R.id.tvCompanyB)).setText(contacts[contactNum][2]);
            ((TextView)findViewById(R.id.tvPhoneB)).setText(contacts[contactNum][3]);
        
        }else if (contactNum==2){
        	
        	((TextView)findViewById(R.id.tvLNameEA)).setText(contacts[0][0]);
        	((TextView)findViewById(R.id.tvFNameEA)).setText(contacts[0][1]);
        	((TextView)findViewById(R.id.tvCompanyA)).setText(contacts[0][2]);
        	((TextView)findViewById(R.id.tvPhoneA)).setText(contacts[0][3]);
       
        	
        	((TextView)findViewById(R.id.tvLNameEB)).setText(contacts[1][0]);
            ((TextView)findViewById(R.id.tvFNameEB)).setText(contacts[1][1]);
            ((TextView)findViewById(R.id.tvCompanyB)).setText(contacts[1][2]);
            ((TextView)findViewById(R.id.tvPhoneB)).setText(contacts[1][3]);
       
        	
        	((TextView)findViewById(R.id.tvLNameEC)).setText(contacts[contactNum][0]);
            ((TextView)findViewById(R.id.tvFNameEC)).setText(contacts[contactNum][1]);
            ((TextView)findViewById(R.id.tvCompanyC)).setText(contacts[contactNum][2]);
            ((TextView)findViewById(R.id.tvPhoneC)).setText(contacts[contactNum][3]);	
        
        }else if (contactNum==3){
        	
        	((TextView)findViewById(R.id.tvLNameEA)).setText(contacts[0][0]);
        	((TextView)findViewById(R.id.tvFNameEA)).setText(contacts[0][1]);
        	((TextView)findViewById(R.id.tvCompanyA)).setText(contacts[0][2]);
        	((TextView)findViewById(R.id.tvPhoneA)).setText(contacts[0][3]);
        	
        	((TextView)findViewById(R.id.tvLNameEB)).setText(contacts[1][0]);
            ((TextView)findViewById(R.id.tvFNameEB)).setText(contacts[1][1]);
            ((TextView)findViewById(R.id.tvCompanyB)).setText(contacts[1][2]);
            ((TextView)findViewById(R.id.tvPhoneB)).setText(contacts[1][3]);
       
        	((TextView)findViewById(R.id.tvLNameEC)).setText(contacts[2][0]);
            ((TextView)findViewById(R.id.tvFNameEC)).setText(contacts[2][1]);
            ((TextView)findViewById(R.id.tvCompanyC)).setText(contacts[2][2]);
            ((TextView)findViewById(R.id.tvPhoneC)).setText(contacts[2][3]);	
        
        	((TextView)findViewById(R.id.tvLNameED)).setText(contacts[contactNum][0]);
            ((TextView)findViewById(R.id.tvFNameED)).setText(contacts[contactNum][1]);
            ((TextView)findViewById(R.id.tvCompanyD)).setText(contacts[contactNum][2]);
            ((TextView)findViewById(R.id.tvPhoneD)).setText(contacts[contactNum][3]);
       
        }else if (contactNum==4){
        	
        	((TextView)findViewById(R.id.tvLNameEA)).setText(contacts[0][0]);
        	((TextView)findViewById(R.id.tvFNameEA)).setText(contacts[0][1]);
        	((TextView)findViewById(R.id.tvCompanyA)).setText(contacts[0][2]);
        	((TextView)findViewById(R.id.tvPhoneA)).setText(contacts[0][3]);
        	
        	((TextView)findViewById(R.id.tvLNameEB)).setText(contacts[1][0]);
            ((TextView)findViewById(R.id.tvFNameEB)).setText(contacts[1][1]);
            ((TextView)findViewById(R.id.tvCompanyB)).setText(contacts[1][2]);
            ((TextView)findViewById(R.id.tvPhoneB)).setText(contacts[1][3]);
       
        	((TextView)findViewById(R.id.tvLNameEC)).setText(contacts[2][0]);
            ((TextView)findViewById(R.id.tvFNameEC)).setText(contacts[2][1]);
            ((TextView)findViewById(R.id.tvCompanyC)).setText(contacts[2][2]);
            ((TextView)findViewById(R.id.tvPhoneC)).setText(contacts[2][3]);	
        
        	((TextView)findViewById(R.id.tvLNameED)).setText(contacts[3][0]);
            ((TextView)findViewById(R.id.tvFNameED)).setText(contacts[3][1]);
            ((TextView)findViewById(R.id.tvCompanyD)).setText(contacts[3][2]);
            ((TextView)findViewById(R.id.tvPhoneD)).setText(contacts[3][3]);
        	
        	((TextView)findViewById(R.id.tvLNameEE)).setText(contacts[contactNum][0]);
            ((TextView)findViewById(R.id.tvFNameEE)).setText(contacts[contactNum][1]);
            ((TextView)findViewById(R.id.tvCompanyE)).setText(contacts[contactNum][2]);
            ((TextView)findViewById(R.id.tvPhoneE)).setText(contacts[contactNum][3]);
       
        }
        if(contactNum < 5){	
    	contactNum++;
        }
        
        findViewById(R.id.btnDetails).setOnClickListener(new OnClickListener() {
        	@Override
			public void onClick (View v) {
        		
        		((TextView)findViewById(R.id.tvFNameE)).setVisibility(View.VISIBLE);
        		
        		
        		((TextView)findViewById(R.id.tvFNameEA)).setVisibility(View.VISIBLE);
        		((TextView)findViewById(R.id.tvFNameEB)).setVisibility(View.VISIBLE);
        		((TextView)findViewById(R.id.tvFNameEC)).setVisibility(View.VISIBLE);
        		((TextView)findViewById(R.id.tvFNameED)).setVisibility(View.VISIBLE);
        		((TextView)findViewById(R.id.tvFNameEE)).setVisibility(View.VISIBLE);
        		
        		((TextView)findViewById(R.id.tvPhone)).setVisibility(View.VISIBLE);
        		
        		((TextView)findViewById(R.id.tvPhoneA)).setVisibility(View.VISIBLE);
        		((TextView)findViewById(R.id.tvPhoneB)).setVisibility(View.VISIBLE);
        		((TextView)findViewById(R.id.tvPhoneC)).setVisibility(View.VISIBLE);
        		((TextView)findViewById(R.id.tvPhoneD)).setVisibility(View.VISIBLE);
        		((TextView)findViewById(R.id.tvPhoneE)).setVisibility(View.VISIBLE);
        	}
        	});
        
    }

        
    
}