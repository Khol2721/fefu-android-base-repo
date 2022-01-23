// Generated by view binder compiler. Do not edit!
package ru.fefu.activitytracker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import ru.fefu.activitytracker.R;

public final class ItemInListModelBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final TextView textActivity;

  @NonNull
  public final TextView textDate;

  @NonNull
  public final TextView textDistance;

  @NonNull
  public final TextView textTime;

  @NonNull
  public final TextView textUsers;

  private ItemInListModelBinding(@NonNull ConstraintLayout rootView, @NonNull CardView cardView,
      @NonNull TextView textActivity, @NonNull TextView textDate, @NonNull TextView textDistance,
      @NonNull TextView textTime, @NonNull TextView textUsers) {
    this.rootView = rootView;
    this.cardView = cardView;
    this.textActivity = textActivity;
    this.textDate = textDate;
    this.textDistance = textDistance;
    this.textTime = textTime;
    this.textUsers = textUsers;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemInListModelBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemInListModelBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_in_list_model, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemInListModelBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cardView;
      CardView cardView = ViewBindings.findChildViewById(rootView, id);
      if (cardView == null) {
        break missingId;
      }

      id = R.id.textActivity;
      TextView textActivity = ViewBindings.findChildViewById(rootView, id);
      if (textActivity == null) {
        break missingId;
      }

      id = R.id.textDate;
      TextView textDate = ViewBindings.findChildViewById(rootView, id);
      if (textDate == null) {
        break missingId;
      }

      id = R.id.textDistance;
      TextView textDistance = ViewBindings.findChildViewById(rootView, id);
      if (textDistance == null) {
        break missingId;
      }

      id = R.id.textTime;
      TextView textTime = ViewBindings.findChildViewById(rootView, id);
      if (textTime == null) {
        break missingId;
      }

      id = R.id.textUsers;
      TextView textUsers = ViewBindings.findChildViewById(rootView, id);
      if (textUsers == null) {
        break missingId;
      }

      return new ItemInListModelBinding((ConstraintLayout) rootView, cardView, textActivity,
          textDate, textDistance, textTime, textUsers);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
