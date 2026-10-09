package com.google.android.material.textfield;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
abstract class EndIconDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextInputLayout f15636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EndCompoundLayout f15637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f15638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f15639d;

    public EndIconDelegate(EndCompoundLayout endCompoundLayout) {
        this.f15636a = endCompoundLayout.f15620a;
        this.f15637b = endCompoundLayout;
        this.f15638c = endCompoundLayout.getContext();
        this.f15639d = endCompoundLayout.f15628t;
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public AccessibilityManager.TouchExplorationStateChangeListener h() {
        return null;
    }

    public boolean i(int i11) {
        return true;
    }

    public boolean j() {
        return this instanceof DropdownMenuEndIconDelegate;
    }

    public boolean k() {
        return false;
    }

    public final void p() {
        this.f15637b.f(false);
    }

    public void a() {
    }

    public void b() {
    }

    public void q() {
    }

    public void r() {
    }

    public void l(EditText editText) {
    }

    public void m(a5.g gVar) {
    }

    public void n(AccessibilityEvent accessibilityEvent) {
    }

    public void o(boolean z11) {
    }
}
