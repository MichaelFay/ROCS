package unl.AIAA.rocs;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class HomeScreen extends Activity {
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.main);
		TextView tv = new TextView(this);
		tv.setText("Hello World");
		setContentView(tv);
		
		
	}
	

}
