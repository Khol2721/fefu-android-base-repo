// Generated by view binder compiler. Do not edit!
package ru.fefu.activitytracker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import ru.fefu.activitytracker.R;

public final class ActivityNewBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final FragmentContainerView fragmentContainerMap;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final Toolbar toolbarNewActivity;

  private ActivityNewBinding(@NonNull ConstraintLayout rootView,
      @NonNull FragmentContainerView fragmentContainerMap, @NonNull TextView textView3,
      @NonNull Toolbar toolbarNewActivity) {
    this.rootView = rootView;
    this.fragmentContainerMap = fragmentContainerMap;
    this.textView3 = textView3;
    this.toolbarNewActivity = toolbarNewActivity;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityNewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityNewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_new, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityNewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.fragment_container_map;
      FragmentContainerView fragmentContainerMap = ViewBindings.findChildViewById(rootView, id);
      if (fragmentContainerMap == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.toolbar_new_activity;
      Toolbar toolbarNewActivity = ViewBindings.findChildViewById(rootView, id);
      if (toolbarNewActivity == null) {
        break missingId;
      }

      return new ActivityNewBinding((ConstraintLayout) rootView, fragmentContainerMap, textView3,
          toolbarNewActivity);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
