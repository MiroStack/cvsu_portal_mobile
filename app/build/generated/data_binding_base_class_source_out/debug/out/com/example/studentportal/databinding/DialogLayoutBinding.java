// Generated by view binder compiler. Do not edit!
package com.example.studentportal.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.studentportal.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogLayoutBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView dialog;

  @NonNull
  public final TableLayout tableLayout1;

  private DialogLayoutBinding(@NonNull LinearLayout rootView, @NonNull TextView dialog,
      @NonNull TableLayout tableLayout1) {
    this.rootView = rootView;
    this.dialog = dialog;
    this.tableLayout1 = tableLayout1;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.dialog;
      TextView dialog = ViewBindings.findChildViewById(rootView, id);
      if (dialog == null) {
        break missingId;
      }

      id = R.id.tableLayout1;
      TableLayout tableLayout1 = ViewBindings.findChildViewById(rootView, id);
      if (tableLayout1 == null) {
        break missingId;
      }

      return new DialogLayoutBinding((LinearLayout) rootView, dialog, tableLayout1);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
