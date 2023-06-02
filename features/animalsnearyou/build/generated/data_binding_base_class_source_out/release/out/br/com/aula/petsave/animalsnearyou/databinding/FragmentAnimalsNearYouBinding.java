// Generated by view binder compiler. Do not edit!
package br.com.aula.petsave.animalsnearyou.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import br.com.aula.petsave.animalsnearyou.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentAnimalsNearYouBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RecyclerView animalsRecyclerView;

  @NonNull
  public final ConstraintLayout fragmentAnimalsNearYouContainer;

  @NonNull
  public final ProgressBar progressBar;

  private FragmentAnimalsNearYouBinding(@NonNull ConstraintLayout rootView,
      @NonNull RecyclerView animalsRecyclerView,
      @NonNull ConstraintLayout fragmentAnimalsNearYouContainer, @NonNull ProgressBar progressBar) {
    this.rootView = rootView;
    this.animalsRecyclerView = animalsRecyclerView;
    this.fragmentAnimalsNearYouContainer = fragmentAnimalsNearYouContainer;
    this.progressBar = progressBar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAnimalsNearYouBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAnimalsNearYouBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_animals_near_you, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAnimalsNearYouBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.animals_recycler_view;
      RecyclerView animalsRecyclerView = ViewBindings.findChildViewById(rootView, id);
      if (animalsRecyclerView == null) {
        break missingId;
      }

      ConstraintLayout fragmentAnimalsNearYouContainer = (ConstraintLayout) rootView;

      id = R.id.progress_bar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      return new FragmentAnimalsNearYouBinding((ConstraintLayout) rootView, animalsRecyclerView,
          fragmentAnimalsNearYouContainer, progressBar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
