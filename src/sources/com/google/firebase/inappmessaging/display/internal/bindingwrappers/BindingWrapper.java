package com.google.firebase.inappmessaging.display.internal.bindingwrappers;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import com.google.firebase.inappmessaging.display.internal.InAppMessageLayoutConfig;
import com.google.firebase.inappmessaging.model.InAppMessage;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class BindingWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InAppMessage f19819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InAppMessageLayoutConfig f19820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LayoutInflater f19821c;

    public BindingWrapper(InAppMessageLayoutConfig inAppMessageLayoutConfig, LayoutInflater layoutInflater, InAppMessage inAppMessage) {
        this.f19820b = inAppMessageLayoutConfig;
        this.f19821c = layoutInflater;
        this.f19819a = inAppMessage;
    }

    public static void g(View view, String str) {
        if (view == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            view.setBackgroundColor(Color.parseColor(str));
        } catch (IllegalArgumentException e8) {
            e8.toString();
        }
    }

    public static void h(Button button, com.google.firebase.inappmessaging.model.Button button2) {
        String str = button2.f20294a.f20337b;
        String str2 = button2.f20295b;
        try {
            Drawable background = button.getBackground();
            background.setTint(Color.parseColor(str2));
            button.setBackground(background);
        } catch (IllegalArgumentException e8) {
            e8.toString();
        }
        button.setText(button2.f20294a.f20336a);
        button.setTextColor(Color.parseColor(str));
    }

    public InAppMessageLayoutConfig a() {
        return this.f19820b;
    }

    public abstract View b();

    public View.OnClickListener c() {
        return null;
    }

    public abstract ImageView d();

    public abstract ViewGroup e();

    public abstract ViewTreeObserver.OnGlobalLayoutListener f(HashMap map, View.OnClickListener onClickListener);
}
