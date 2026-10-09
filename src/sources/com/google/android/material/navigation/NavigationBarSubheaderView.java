package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.lingodeer.R;
import q.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class NavigationBarSubheaderView extends FrameLayout implements NavigationBarMenuItemView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f14912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n f14915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ColorStateList f14916e;

    public NavigationBarSubheaderView(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.m3_navigation_menu_subheader, (ViewGroup) this, true);
        this.f14912a = (TextView) findViewById(R.id.navigation_menu_subheader_label);
    }

    public final void a() {
        n nVar = this.f14915d;
        if (nVar != null) {
            setVisibility((!nVar.isVisible() || (!this.f14913b && this.f14914c)) ? 8 : 0);
        }
    }

    @Override // q.w
    public final void c(n nVar) {
        this.f14915d = nVar;
        nVar.setCheckable(false);
        this.f14912a.setText(nVar.f47298e);
        a();
    }

    @Override // q.w
    public n getItemData() {
        return this.f14915d;
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuItemView
    public void setExpanded(boolean z11) {
        this.f14913b = z11;
        a();
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuItemView
    public void setOnlyShowWhenExpanded(boolean z11) {
        this.f14914c = z11;
        a();
    }

    public void setTextAppearance(int i11) {
        TextView textView = this.f14912a;
        textView.setTextAppearance(i11);
        ColorStateList colorStateList = this.f14916e;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f14916e = colorStateList;
        if (colorStateList != null) {
            this.f14912a.setTextColor(colorStateList);
        }
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
