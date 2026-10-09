package com.google.android.material.navigation;

import android.view.MenuItem;
import android.view.SubMenu;
import java.util.ArrayList;
import nv.p;
import q.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class NavigationBarMenuBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f14868a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14870c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14871d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14872e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f14869b = new ArrayList();

    public NavigationBarMenuBuilder(l lVar) {
        this.f14868a = lVar;
        b();
    }

    public final MenuItem a(int i11) {
        return (MenuItem) this.f14869b.get(i11);
    }

    public final void b() {
        ArrayList arrayList = this.f14869b;
        arrayList.clear();
        this.f14870c = 0;
        this.f14871d = 0;
        this.f14872e = 0;
        int i11 = 0;
        while (true) {
            l lVar = this.f14868a;
            if (i11 >= lVar.f47285f.size()) {
                break;
            }
            MenuItem item = lVar.getItem(i11);
            if (item.hasSubMenu()) {
                if (!arrayList.isEmpty() && !(p.f(1, arrayList) instanceof DividerMenuItem) && item.isVisible()) {
                    arrayList.add(new DividerMenuItem());
                }
                arrayList.add(item);
                SubMenu subMenu = item.getSubMenu();
                for (int i12 = 0; i12 < subMenu.size(); i12++) {
                    MenuItem item2 = subMenu.getItem(i12);
                    if (!item.isVisible()) {
                        item2.setVisible(false);
                    }
                    arrayList.add(item2);
                    this.f14870c++;
                    if (item2.isVisible()) {
                        this.f14871d++;
                    }
                }
                arrayList.add(new DividerMenuItem());
            } else {
                arrayList.add(item);
                this.f14870c++;
                if (item.isVisible()) {
                    this.f14871d++;
                    this.f14872e++;
                }
            }
            i11++;
        }
        if (arrayList.isEmpty() || !(p.f(1, arrayList) instanceof DividerMenuItem)) {
            return;
        }
        arrayList.remove(arrayList.size() - 1);
    }
}
