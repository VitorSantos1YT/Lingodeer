package com.google.android.material.navigation;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import q.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class NavigationBarDividerView extends FrameLayout implements NavigationBarMenuItemView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f14825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14827c;

    public final void a() {
        setVisibility((!this.f14827c || (!this.f14825a && this.f14826b)) ? 8 : 0);
    }

    @Override // q.w
    public final void c(n nVar) {
        a();
    }

    @Override // q.w
    public n getItemData() {
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
    }

    public void setDividersEnabled(boolean z11) {
        this.f14827c = z11;
        a();
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuItemView
    public void setExpanded(boolean z11) {
        this.f14825a = z11;
        a();
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuItemView
    public void setOnlyShowWhenExpanded(boolean z11) {
        this.f14826b = z11;
        a();
    }

    public void setCheckable(boolean z11) {
    }

    public void setChecked(boolean z11) {
    }

    @Override // android.view.View
    public void setEnabled(boolean z11) {
    }

    public void setIcon(Drawable drawable) {
    }

    public void setTitle(CharSequence charSequence) {
    }
}
