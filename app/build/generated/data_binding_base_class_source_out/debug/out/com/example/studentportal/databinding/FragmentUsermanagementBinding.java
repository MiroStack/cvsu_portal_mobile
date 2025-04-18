// Generated by view binder compiler. Do not edit!
package com.example.studentportal.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.studentportal.R;
import com.google.android.material.divider.MaterialDivider;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentUsermanagementBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final TextView etAddress;

  @NonNull
  public final TextView etBirthday;

  @NonNull
  public final TextView etName;

  @NonNull
  public final TextView etStudentnumber;

  @NonNull
  public final ImageView imageView1;

  @NonNull
  public final MaterialDivider materialDivider;

  @NonNull
  public final EditText newPassword;

  @NonNull
  public final TextInputLayout newPasswordLayout;

  @NonNull
  public final EditText oldPassword;

  @NonNull
  public final TextInputLayout oldPasswordLayout;

  @NonNull
  public final EditText retypePassword;

  @NonNull
  public final TextInputLayout retypePasswordLayout;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final Button updateBtn;

  private FragmentUsermanagementBinding(@NonNull FrameLayout rootView, @NonNull TextView etAddress,
      @NonNull TextView etBirthday, @NonNull TextView etName, @NonNull TextView etStudentnumber,
      @NonNull ImageView imageView1, @NonNull MaterialDivider materialDivider,
      @NonNull EditText newPassword, @NonNull TextInputLayout newPasswordLayout,
      @NonNull EditText oldPassword, @NonNull TextInputLayout oldPasswordLayout,
      @NonNull EditText retypePassword, @NonNull TextInputLayout retypePasswordLayout,
      @NonNull TextView textView3, @NonNull Button updateBtn) {
    this.rootView = rootView;
    this.etAddress = etAddress;
    this.etBirthday = etBirthday;
    this.etName = etName;
    this.etStudentnumber = etStudentnumber;
    this.imageView1 = imageView1;
    this.materialDivider = materialDivider;
    this.newPassword = newPassword;
    this.newPasswordLayout = newPasswordLayout;
    this.oldPassword = oldPassword;
    this.oldPasswordLayout = oldPasswordLayout;
    this.retypePassword = retypePassword;
    this.retypePasswordLayout = retypePasswordLayout;
    this.textView3 = textView3;
    this.updateBtn = updateBtn;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentUsermanagementBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentUsermanagementBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment__usermanagement, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentUsermanagementBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.et_address;
      TextView etAddress = ViewBindings.findChildViewById(rootView, id);
      if (etAddress == null) {
        break missingId;
      }

      id = R.id.et_birthday;
      TextView etBirthday = ViewBindings.findChildViewById(rootView, id);
      if (etBirthday == null) {
        break missingId;
      }

      id = R.id.et_Name;
      TextView etName = ViewBindings.findChildViewById(rootView, id);
      if (etName == null) {
        break missingId;
      }

      id = R.id.et_studentnumber;
      TextView etStudentnumber = ViewBindings.findChildViewById(rootView, id);
      if (etStudentnumber == null) {
        break missingId;
      }

      id = R.id.imageView1;
      ImageView imageView1 = ViewBindings.findChildViewById(rootView, id);
      if (imageView1 == null) {
        break missingId;
      }

      id = R.id.materialDivider;
      MaterialDivider materialDivider = ViewBindings.findChildViewById(rootView, id);
      if (materialDivider == null) {
        break missingId;
      }

      id = R.id.newPassword;
      EditText newPassword = ViewBindings.findChildViewById(rootView, id);
      if (newPassword == null) {
        break missingId;
      }

      id = R.id.newPasswordLayout;
      TextInputLayout newPasswordLayout = ViewBindings.findChildViewById(rootView, id);
      if (newPasswordLayout == null) {
        break missingId;
      }

      id = R.id.oldPassword;
      EditText oldPassword = ViewBindings.findChildViewById(rootView, id);
      if (oldPassword == null) {
        break missingId;
      }

      id = R.id.oldPasswordLayout;
      TextInputLayout oldPasswordLayout = ViewBindings.findChildViewById(rootView, id);
      if (oldPasswordLayout == null) {
        break missingId;
      }

      id = R.id.retypePassword;
      EditText retypePassword = ViewBindings.findChildViewById(rootView, id);
      if (retypePassword == null) {
        break missingId;
      }

      id = R.id.retypePasswordLayout;
      TextInputLayout retypePasswordLayout = ViewBindings.findChildViewById(rootView, id);
      if (retypePasswordLayout == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.update_btn;
      Button updateBtn = ViewBindings.findChildViewById(rootView, id);
      if (updateBtn == null) {
        break missingId;
      }

      return new FragmentUsermanagementBinding((FrameLayout) rootView, etAddress, etBirthday,
          etName, etStudentnumber, imageView1, materialDivider, newPassword, newPasswordLayout,
          oldPassword, oldPasswordLayout, retypePassword, retypePasswordLayout, textView3,
          updateBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
