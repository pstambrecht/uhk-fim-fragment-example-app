package cz.stambrecht.fragmentexample;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

//Uses android.support.v4.app.Fragment for backward compatibility

/**
 * {@link ContentFragment} is a placeholder fragment representing page with some content
 *
 * @author Pavel Stambrecht
 * @date 16/03/2018
 */

public class ContentFragment extends Fragment {

	private Toastable mToastableParent = null;

	/**
	 * Called when {@link ContentFragment} is attaching to parent Activity.
	 * Checks if parent Activity implements required interfaces
	 * For full description see {@link Fragment#onAttach(Context)}
	 */
	@Override
	public void onAttach(Context context) {
		super.onAttach(context);

		if (context instanceof MainActivity) {
			mToastableParent = (MainActivity) context;
		} else {
			throw new IllegalStateException("Parent Activity must implement Toastable interface");
		}
	}

	/**
	 * Called when {@link ContentFragment} is detaching from parent Activity.
	 * Clears reference to parent activity to avoid memory leaks
	 */
	@Override
	public void onDetach() {
		super.onDetach();
		mToastableParent = null;
	}

	/**
	 * For description see {@link Fragment#onCreateView}
	 */
	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_content, container, false);
		//TODO find (and setup) views here - fe. view.findViewById(R.id.title)
		return view;
	}

	/**
	 * Called when {@link ContentFragment} is starting (showing to user)
	 * For full description see {@link Fragment#onStart()}
	 */
	@Override
	public void onStart() {
		super.onStart();
		mToastableParent.showToast("Hello world!");
	}
}
