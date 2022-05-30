// jumping from one screen to another in android 

Intent intent = new Intent(context, anotherActivity.class);
    startActivity(intent); 

// App activity 1(screen 1)
public class AppActivity extends Activity {

	Button button;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		addListenerOnButton();
	}

	public void addListenerOnButton() {

		final Context context = this;

		button = (Button) findViewById(R.id.button1);

		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

			    Intent intent = new Intent(context, App2Activity.class);
                            startActivity(intent);   

			}

		});

	}

}

