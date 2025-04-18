// Generated by view binder compiler. Do not edit!
package com.example.studentportal.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.studentportal.R;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class SignupTabFragmentBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button button;

  @NonNull
  public final EditText confirmpasswordEt;

  @NonNull
  public final EditText passwordEt;

  @NonNull
  public final TextInputLayout passwordTil;

  @NonNull
  public final EditText studentnumberEt;

  private SignupTabFragmentBinding(@NonNull ConstraintLayout rootView, @NonNull Button button,
      @NonNull EditText confirmpasswordEt, @NonNull EditText passwordEt,
      @NonNull TextInputLayout passwordTil, @NonNull EditText studentnumberEt) {
    this.rootView = rootView;
    this.button = button;
    this.confirmpasswordEt = confirmpasswordEt;
    this.passwordEt = passwordEt;
    this.passwordTil = passwordTil;
    this.studentnumberEt = studentnumberEt;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SignupTabFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SignupTabFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.signup_tab_fragment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SignupTabFragmentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button;
      Button button = ViewBindings.findChildViewById(rootView, id);
      if (button == null) {
        break missingId;
      }

      id = R.id.confirmpassword_et;
      EditText confirmpasswordEt = ViewBindings.findChildViewById(rootView, id);
      if (confirmpasswordEt == null) {
        break missingId;
      }

      id = R.id.password_et;
      EditText passwordEt = ViewBindings.findChildViewById(rootView, id);
      if (passwordEt == null) {
        break missingId;
      }

      id = R.id.password_til;
      TextInputLayout passwordTil = ViewBindings.findChildViewById(rootView, id);
      if (passwordTil == null) {
        break missingId;
      }

      id = R.id.studentnumber_et;
      EditText studentnumberEt = ViewBindings.findChildViewById(rootView, id);
      if (studentnumberEt == null) {
        break missingId;
      }

      return new SignupTabFragmentBinding((ConstraintLayout) rootView, button, confirmpasswordEt,
          passwordEt, passwordTil, studentnumberEt);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
