package cz.stambrecht.fragmentexample;

import android.support.annotation.NonNull;

/**
 * {@link Toastable} interface defines method which can be used for
 * showing {@link android.widget.Toast} messages
 *
 * @author Pavel Stambrecht
 * @date 17/03/2018
 */

public interface Toastable {
	/**
	 * Shows {@link android.widget.Toast} message
	 *
	 * @param message String value of message, should not be null
	 */
	void showToast(@NonNull String message);
}
