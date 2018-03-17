package cz.stambrecht.fragmentexample;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * {@link MainActivity} represents main application Activity. It's also launcher Activity. See
 * AndroidManifest.xml declaration.
 */
public class MainActivity extends AppCompatActivity implements Toastable {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		//inflates ContentFragment to container (by ID)
		getSupportFragmentManager()
				.beginTransaction()
				//.addToBackStack(null) - used to save history of transactions, used on back button press
				.replace(R.id.frameLayout_content,
						new ContentFragment()).commit();

	}

	/**
	 * Shows {@link Toast} message
	 *
	 * @param message String value of message, should not be null
	 */
	@Override
	public void showToast(@NonNull String message) {
		Toast.makeText(this, message, Toast.LENGTH_LONG).show();
	}
}
