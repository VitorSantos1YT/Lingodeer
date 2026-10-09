package com.google.android.material.navigation;

import android.content.Context;
import android.view.SubMenu;
import defpackage.e;
import ep.a;
import q.l;
import q.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class NavigationBarMenu extends l {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Class f14865b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final int f14866c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final boolean f14867d0;

    public NavigationBarMenu(Context context, Class cls, int i11, boolean z11) {
        super(context);
        this.f14865b0 = cls;
        this.f14866c0 = i11;
        this.f14867d0 = z11;
    }

    @Override // q.l
    public final n a(int i11, int i12, int i13, CharSequence charSequence) {
        int size = this.f47285f.size() + 1;
        int i14 = this.f14866c0;
        if (size > i14) {
            String simpleName = this.f14865b0.getSimpleName();
            throw new IllegalArgumentException(a.k(e.q(i14, "Maximum number of items supported by ", simpleName, " is ", ". Limit can be checked with "), simpleName, "#getMaxItemCount()"));
        }
        y();
        n nVarA = super.a(i11, i12, i13, charSequence);
        x();
        return nVarA;
    }

    @Override // q.l, android.view.Menu
    public final SubMenu addSubMenu(int i11, int i12, int i13, CharSequence charSequence) {
        if (!this.f14867d0) {
            throw new UnsupportedOperationException(this.f14865b0.getSimpleName().concat(" does not support submenus"));
        }
        n nVarA = a(i11, i12, i13, charSequence);
        NavigationBarSubMenu navigationBarSubMenu = new NavigationBarSubMenu(this.f47280a, this, nVarA);
        nVarA.Q = navigationBarSubMenu;
        navigationBarSubMenu.setHeaderTitle(nVarA.f47298e);
        return navigationBarSubMenu;
    }
}
