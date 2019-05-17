package books.OReillyMedia.HeadFirstAndroidDevelopment;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class HaikuDisplay extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.haiku_display, menu);
        return true;
    }
    
    public void loveButtonOnClick(View v) {
    	TextView textView = (TextView) findViewById(R.id.haikuTextView);
    	textView.setVisibility(View.VISIBLE);
    }
}
