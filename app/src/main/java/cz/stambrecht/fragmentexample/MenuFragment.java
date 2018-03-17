package cz.stambrecht.fragmentexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
//Uses android.support.v4.app.Fragment for backward compatibility
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * {@link MenuFragment} is a placeholder fragment representing application's menu
 *
 * @author Pavel Stambrecht
 * @date 16/03/2018
 */

public class MenuFragment extends Fragment {

	/**
	 * For description see {@link Fragment#onCreateView}
	 */
	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_menu, container, false);
		//TODO find (and setup) views here - fe. view.findViewById(R.id.title)
		return view;
	}
}
