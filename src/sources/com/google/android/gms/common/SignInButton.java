package com.google.android.gms.common;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zaac;
import com.google.android.gms.common.internal.zaad;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.dynamic.RemoteCreator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class SignInButton extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f8659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View.OnClickListener f8660d;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ButtonSize {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ColorScheme {
    }

    public SignInButton(Context context) {
        this(context, null);
    }

    public final void a(int i11, int i12) {
        this.f8657a = i11;
        this.f8658b = i12;
        Context context = getContext();
        View view = this.f8659c;
        if (view != null) {
            removeView(view);
        }
        try {
            this.f8659c = zaac.c(context, this.f8657a, this.f8658b);
        } catch (RemoteCreator.RemoteCreatorException unused) {
            int i13 = this.f8657a;
            int i14 = this.f8658b;
            zaad zaadVar = new zaad(context, null);
            Resources resources = context.getResources();
            zaadVar.setTypeface(Typeface.DEFAULT_BOLD);
            zaadVar.setTextSize(14.0f);
            int i15 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
            zaadVar.setMinHeight(i15);
            zaadVar.setMinWidth(i15);
            int iA = zaad.a(i14, com.lingodeer.R.drawable.common_google_signin_btn_icon_dark, com.lingodeer.R.drawable.common_google_signin_btn_icon_light, com.lingodeer.R.drawable.common_google_signin_btn_icon_light);
            int iA2 = zaad.a(i14, com.lingodeer.R.drawable.common_google_signin_btn_text_dark, com.lingodeer.R.drawable.common_google_signin_btn_text_light, com.lingodeer.R.drawable.common_google_signin_btn_text_light);
            if (i13 == 0 || i13 == 1) {
                iA = iA2;
            } else if (i13 != 2) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i13).length() + 21);
                sb2.append("Unknown button size: ");
                sb2.append(i13);
                throw new IllegalStateException(sb2.toString());
            }
            Drawable drawable = resources.getDrawable(iA);
            drawable.setTintList(resources.getColorStateList(com.lingodeer.R.color.common_google_signin_btn_tint));
            drawable.setTintMode(PorterDuff.Mode.SRC_ATOP);
            zaadVar.setBackgroundDrawable(drawable);
            ColorStateList colorStateList = resources.getColorStateList(zaad.a(i14, com.lingodeer.R.color.common_google_signin_btn_text_dark, com.lingodeer.R.color.common_google_signin_btn_text_light, com.lingodeer.R.color.common_google_signin_btn_text_light));
            Preconditions.g(colorStateList);
            zaadVar.setTextColor(colorStateList);
            if (i13 == 0) {
                zaadVar.setText(resources.getString(com.lingodeer.R.string.common_signin_button_text));
            } else if (i13 == 1) {
                zaadVar.setText(resources.getString(com.lingodeer.R.string.common_signin_button_text_long));
            } else {
                if (i13 != 2) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i13).length() + 21);
                    sb3.append("Unknown button size: ");
                    sb3.append(i13);
                    throw new IllegalStateException(sb3.toString());
                }
                zaadVar.setText((CharSequence) null);
            }
            zaadVar.setTransformationMethod(null);
            if (DeviceProperties.a(zaadVar.getContext())) {
                zaadVar.setGravity(19);
            }
            this.f8659c = zaadVar;
        }
        addView(this.f8659c);
        this.f8659c.setEnabled(isEnabled());
        this.f8659c.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View.OnClickListener onClickListener = this.f8660d;
        if (onClickListener == null || view != this.f8659c) {
            return;
        }
        onClickListener.onClick(this);
    }

    public void setColorScheme(int i11) {
        a(this.f8657a, i11);
    }

    @Override // android.view.View
    public void setEnabled(boolean z11) {
        super.setEnabled(z11);
        this.f8659c.setEnabled(z11);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f8660d = onClickListener;
        View view = this.f8659c;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    @Deprecated
    public void setScopes(Scope[] scopeArr) {
        a(this.f8657a, this.f8658b);
    }

    public void setSize(int i11) {
        a(i11, this.f8658b);
    }

    public SignInButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SignInButton(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f8660d = null;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, com.google.android.gms.base.R.styleable.f8562a, 0, 0);
        try {
            this.f8657a = typedArrayObtainStyledAttributes.getInt(0, 0);
            this.f8658b = typedArrayObtainStyledAttributes.getInt(1, 2);
            typedArrayObtainStyledAttributes.recycle();
            a(this.f8657a, this.f8658b);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }
}
