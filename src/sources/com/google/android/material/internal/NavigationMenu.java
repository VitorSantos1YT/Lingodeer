package com.google.android.material.internal;

import android.view.SubMenu;
import q.l;
import q.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class NavigationMenu extends l {
    @Override // q.l, android.view.Menu
    public final SubMenu addSubMenu(int i11, int i12, int i13, CharSequence charSequence) {
        n nVarA = a(i11, i12, i13, charSequence);
        NavigationSubMenu navigationSubMenu = new NavigationSubMenu(this.f47280a, this, nVarA);
        nVarA.Q = navigationSubMenu;
        navigationSubMenu.setHeaderTitle(nVarA.f47298e);
        return navigationSubMenu;
    }
}
