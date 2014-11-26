package cn.edu.gdmec.s07131033.demo_propertyanimation;

import android.os.Bundle;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
public class MainActivity extends Activity {
	private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView)findViewById(R.id.textView1);
    }
    public void ALPHA(View v)
    {
    	Animator animator = AnimatorInflater.loadAnimator(MainActivity.this, R.animator.alpha_animator);
    	animator.setTarget(tv);
    	animator.start();
    }
    public void TRANSLATE(View v)
    {
    	Animator animator = AnimatorInflater.loadAnimator(MainActivity.this, R.animator.translate_animator);
    	animator.setTarget(tv);
    	animator.start();
    }
    public void SCALE(View v)
    {
    	Animator animator = AnimatorInflater.loadAnimator(MainActivity.this, R.animator.scale_animator);	
    	animator.setTarget(tv);
    	animator.start();
    }
    public void ROTATE(View v)
    {
    	Animator animator = AnimatorInflater.loadAnimator(MainActivity.this, R.animator.rotate_animator);
    	animator.setTarget(tv);
    	animator.start();
    }
    public void ALL(View v)
    {
    	AnimatorSet set = new AnimatorSet();
    	Animator alpha = AnimatorInflater.loadAnimator(MainActivity.this, R.animator.alpha_animator);
    	Animator translate = AnimatorInflater.loadAnimator(MainActivity.this, R.animator.translate_animator);
    	Animator scale = AnimatorInflater.loadAnimator(MainActivity.this, R.animator.scale_animator);
    	Animator rotate = AnimatorInflater.loadAnimator(MainActivity.this, R.animator.rotate_animator);
    	set.play(alpha).after(translate).with(scale).after(rotate);
    	set.setTarget(tv);
    	set.start();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
