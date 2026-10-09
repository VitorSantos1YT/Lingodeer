package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class VisibilityAwareImageButton extends ImageButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14753a;

    public VisibilityAwareImageButton(Context context) {
        this(context, null);
    }

    public final void a(int i11, boolean z11) {
        super.setVisibility(i11);
        if (z11) {
            this.f14753a = i11;
        }
    }

    public final int getUserSetVisibility() {
        return this.f14753a;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i11) {
        a(i11, true);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f14753a = getVisibility();
    }
}
