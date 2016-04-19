package edu.csci153.contactorganizer;



import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class ContactOrganizer extends Activity {
	
	private int choice = 1;
	private String message1;
	private String message2;
	private String message3;
	private String message4;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        final RadioGroup  rdGroup = (RadioGroup)findViewById(R.id.rdGroup);
        final RadioButton rbInternal = (RadioButton)findViewById(R.id.rbInternal);
        final RadioButton rbExternal = (RadioButton)findViewById(R.id.rbExternal);
        
       //final TextView tv1 = (TextView)findViewById(R.id.tv1);
       //final TextView tv2 = (TextView)findViewById(R.id.tv2);
        final TextView tv3 = (TextView)findViewById(R.id.tv3);
        final TextView tv4 = (TextView)findViewById(R.id.tv4);
        
        final EditText et1 = (EditText)findViewById(R.id.et1);
        final EditText et2 = (EditText)findViewById(R.id.et2);
        final EditText et3 = (EditText)findViewById(R.id.et3);
        final EditText et4 = (EditText)findViewById(R.id.et4);

        //check for radio button selection
        
        rdGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
        	
        	@Override
			public void onCheckedChanged(RadioGroup group, int id){
        		
        		if(rbInternal.isChecked()){
        			
        			choice = 1;
        			tv3.setText("Department:");
        			tv4.setText("Extension:");
        			
        			
        		} else if(rbExternal.isChecked()){
        			
        			choice = 2;
        			tv3.setText("Company");
        			tv4.setText("Phone Number:");
        			
        		}
        		
        	}
        	
        	
        });
        
        //check for button presses
        
        findViewById(R.id.btn1).setOnClickListener(new OnClickListener() {
        	@Override
			public void onClick (View v) {
        		
        		if(et1.getText().toString().equals("")){
        			
        			message1 = "You must input a First Name!";
        			inputError(message1);
        			
        		}else if(et2.getText().toString().equals("")){
        			
        			message2= "You must input a Last Name!";
        			inputError(message2);
        			
        		}else if(et3.getText().toString().equals("")){
        			
        			if(choice == 1){
        				
        				message3 = "You must input a Department!";
        				inputError(message3);
        				
        			}else if (choice == 2){
        				
        				message3 = "You must input a Company!";
        				inputError(message3);
        			}
        			
        		}else if(et4.getText().toString().equals("")){
        			
        			if(choice == 1){
        				
        				message4 = "You must input an Extension!";
        				inputError(message4);
        				
        			}else if (choice == 2){
        				
        				message4 = "You must input a Phone Number!";
        				inputError(message4);
        			}
        			
        		}
        		
        		if (choice == 1){
        			openInternal();
        		}else if (choice == 2){
        			openExternal();
        		}
        	}
        });
    }
    
    //open activities
    
    public void openInternal(){
    	
    	Intent i;
    	
    	String input[] = new String[4];
    	
    	input[0] = ((EditText)findViewById(R.id.et1)).getText().toString();
    	input[1] = ((EditText)findViewById(R.id.et2)).getText().toString();
    	input[2] = ((EditText)findViewById(R.id.et3)).getText().toString();
    	input[3] = ((EditText)findViewById(R.id.et4)).getText().toString();
        	
    	i = new Intent(this, Internal.class );
    	i.putExtra("ARGS", input);
    	//System.out.println(input[0]);
    	startActivity(i);
    
    }
    
    
    
    public void openExternal(){
    	
    	Intent i;
    	
    	String input[] = new String[4];
    	
    		input[0] = ((EditText)findViewById(R.id.et1)).getText().toString();
    		input[1] = ((EditText)findViewById(R.id.et2)).getText().toString();
    		input[2] = ((EditText)findViewById(R.id.et3)).getText().toString();
    		input[3] = ((EditText)findViewById(R.id.et4)).getText().toString();
    	
    	i = new Intent(this, External.class );
    	i.putExtra("ARGS", input);
    	
    	startActivity(i);
    	
    }
    
    //create dialog box
    
    public void inputError(String message){
    	
    	AlertDialog.Builder builder = new AlertDialog.Builder(this);
    	builder.setCancelable(false);
    	builder.setTitle("Data Entry Error");
    	builder.setMessage(message);
    	
    	builder.setPositiveButton("Close", new DialogInterface.OnClickListener(){
    		@Override
			public void onClick(DialogInterface dialog, int which){
    		
    			dialog.dismiss();
    		}
    	});
    	

    	AlertDialog alert = builder.create();
    	alert.show();
    	
    	
    	
    }
    
    //create menu and act accordingly
    
 public boolean onCreateOptionsMenu(Menu menu){
    	
    	getMenuInflater().inflate(R.menu.menu, menu);
    	
    	return true;
    	
    }
 
 public boolean onOptionsItemSelected(MenuItem item){
 	
 	switch(item.getItemId()){
 	
 		case R.id.miIn : 
 			
 		  	
 			if(((EditText)findViewById(R.id.et1)).equals("")){
    			
    			message1 = "You must input a First Name!";
    			inputError(message1);
    			
    		}else if(((EditText)findViewById(R.id.et2)).equals("")){
    			
    			message2= "You must input a Last Name!";
    			inputError(message2);
    			
    		}else if(((EditText)findViewById(R.id.et3)).equals("")){
    			
    			if(choice == 1){
    				
    				message3 = "You must input a Department!";
    				inputError(message3);
    				
    			}else if (choice == 2){
    				
    				message3 = "You must input a Company!";
    				inputError(message3);
    			}
    			
    		}else if(((EditText)findViewById(R.id.et4)).equals("")){
    			
    			if(choice == 1){
    				
    				message4 = "You must input an Extension!";
    				inputError(message4);
    				
    			}else if (choice == 2){
    				
    				message4 = "You must input a Phone Number!";
    				inputError(message4);
    			}
    			
    		}
    		openInternal();
 		
 		break;
 	
 	
 		case R.id.miEx:

 			if(((EditText)findViewById(R.id.et1)).equals("")){
    			
    			message1 = "You must input a First Name!";
    			inputError(message1);
    			
    		}else if(((EditText)findViewById(R.id.et2)).equals("")){
    			
    			message2= "You must input a Last Name!";
    			inputError(message2);
    			
    		}else if(((EditText)findViewById(R.id.et3)).equals("")){
    			
    			if(choice == 1){
    				
    				message3 = "You must input a Department!";
    				inputError(message3);
    				
    			}else if (choice == 2){
    				
    				message3 = "You must input a Company!";
    				inputError(message3);
    			}
    			
    		}else if(((EditText)findViewById(R.id.et4)).equals("")){
    			
    			if(choice == 1){
    				
    				message4 = "You must input an Extension!";
    				inputError(message4);
    				
    			}else if (choice == 2){
    				
    				message4 = "You must input a Phone Number!";
    				inputError(message4);
    			}
    			
    		}
    		openExternal();
 			
 		break;
 	
 		 	
 		default : 
 		break;
 	}
 	
 	return false;
 }
 
    
}