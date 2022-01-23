// Generated by view binder compiler. Do not edit!
package ru.fefu.activitytracker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.TextView;
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

public final class ActivityRegistrationBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button button;

  @NonNull
  public final TextInputLayout editTextTextPassword;

  @NonNull
  public final TextInputLayout editTextTextPassword2;

  @NonNull
  public final TextInputLayout editTextTextPersonName;

  @NonNull
  public final TextInputLayout editTextTextPersonName2;

  @NonNull
  public final RadioButton radioButton;

  @NonNull
  public final RadioButton radioButton2;

  @NonNull
  public final RadioButton radioButton3;

  @NonNull
  public final ScrollView scrollView2;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView textView5;

  private ActivityRegistrationBinding(@NonNull ConstraintLayout rootView, @NonNull Button button,
      @NonNull TextInputLayout editTextTextPassword, @NonNull TextInputLayout editTextTextPassword2,
      @NonNull TextInputLayout editTextTextPersonName,
      @NonNull TextInputLayout editTextTextPersonName2, @NonNull RadioButton radioButton,
      @NonNull RadioButton radioButton2, @NonNull RadioButton radioButton3,
      @NonNull ScrollView scrollView2, @NonNull TextView textView2, @NonNull TextView textView5) {
    this.rootView = rootView;
    this.button = button;
    this.editTextTextPassword = editTextTextPassword;
    this.editTextTextPassword2 = editTextTextPassword2;
    this.editTextTextPersonName = editTextTextPersonName;
    this.editTextTextPersonName2 = editTextTextPersonName2;
    this.radioButton = radioButton;
    this.radioButton2 = radioButton2;
    this.radioButton3 = radioButton3;
    this.scrollView2 = scrollView2;
    this.textView2 = textView2;
    this.textView5 = textView5;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegistrationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegistrationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_registration, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegistrationBinding bind(@NonNull View rootView) {
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

      id = R.id.editTextTextPassword2;
      TextInputLayout editTextTextPassword2 = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextPassword2 == null) {
        break missingId;
      }

      id = R.id.editTextTextPersonName;
      TextInputLayout editTextTextPersonName = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextPersonName == null) {
        break missingId;
      }

      id = R.id.editTextTextPersonName2;
      TextInputLayout editTextTextPersonName2 = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextPersonName2 == null) {
        break missingId;
      }

      id = R.id.radioButton;
      RadioButton radioButton = ViewBindings.findChildViewById(rootView, id);
      if (radioButton == null) {
        break missingId;
      }

      id = R.id.radioButton2;
      RadioButton radioButton2 = ViewBindings.findChildViewById(rootView, id);
      if (radioButton2 == null) {
        break missingId;
      }

      id = R.id.radioButton3;
      RadioButton radioButton3 = ViewBindings.findChildViewById(rootView, id);
      if (radioButton3 == null) {
        break missingId;
      }

      id = R.id.scrollView2;
      ScrollView scrollView2 = ViewBindings.findChildViewById(rootView, id);
      if (scrollView2 == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = ViewBindings.findChildViewById(rootView, id);
      if (textView5 == null) {
        break missingId;
      }

      return new ActivityRegistrationBinding((ConstraintLayout) rootView, button,
          editTextTextPassword, editTextTextPassword2, editTextTextPersonName,
          editTextTextPersonName2, radioButton, radioButton2, radioButton3, scrollView2, textView2,
          textView5);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
