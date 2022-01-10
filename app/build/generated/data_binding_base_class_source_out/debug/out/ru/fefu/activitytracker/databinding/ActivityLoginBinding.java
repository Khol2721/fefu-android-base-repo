// Generated by view binder compiler. Do not edit!
package ru.fefu.activitytracker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import ru.fefu.activitytracker.R;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button button;

  @NonNull
  public final TextInputLayout editTextTextPassword;

  @NonNull
  public final TextInputLayout editTextTextPersonName;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final LinearLayout linearLayout;

  private ActivityLoginBinding(@NonNull ConstraintLayout rootView, @NonNull Button button,
      @NonNull TextInputLayout editTextTextPassword,
      @NonNull TextInputLayout editTextTextPersonName, @NonNull ImageView imageView3,
      @NonNull LinearLayout linearLayout) {
    this.rootView = rootView;
    this.button = button;
    this.editTextTextPassword = editTextTextPassword;
    this.editTextTextPersonName = editTextTextPersonName;
    this.imageView3 = imageView3;
    this.linearLayout = linearLayout;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button;
      Button button = ViewBindings.findChildViewById(rootView, id);
      if (button == null) {
        break missingId;
      }

      id = R.id.editTextTextPassword;
      TextInputLayout editTextTextPassword = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextPassword == null) {
        break missingId;
      }

      id = R.id.editTextTextPersonName;
      TextInputLayout editTextTextPersonName = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextPersonName == null) {
        break missingId;
      }

      id = R.id.imageView3;
      ImageView imageView3 = ViewBindings.findChildViewById(rootView, id);
      if (imageView3 == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      return new ActivityLoginBinding((ConstraintLayout) rootView, button, editTextTextPassword,
          editTextTextPersonName, imageView3, linearLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
