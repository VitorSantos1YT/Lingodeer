package x0;

import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f55576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f55577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f55578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f55579d;

    public d(e eVar, b bVar, b bVar2, View view) {
        this.f55576a = eVar;
        this.f55577b = bVar;
        this.f55578c = bVar2;
        this.f55579d = view;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final boolean a(Menu menu) {
        int i11;
        v0.c cVar = (v0.c) this.f55577b.invoke();
        if (kotlin.jvm.internal.m.a(cVar, null)) {
            return false;
        }
        menu.clear();
        ?? r9 = cVar.f53453a;
        int size = r9.size();
        int i12 = 1;
        int i13 = 1;
        for (int i14 = 0; i14 < size; i14++) {
            v0.b bVar = (v0.b) r9.get(i14);
            if (bVar instanceof v0.d) {
                i11 = i12 + 1;
                v0.d dVar = (v0.d) bVar;
                MenuItem menuItemAdd = menu.add(i13, i12, i12, dVar.f53454b);
                menuItemAdd.setShowAsAction(2);
                menuItemAdd.setOnMenuItemClickListener(new c(0, dVar, this));
            } else {
                if (bVar instanceof v0.h) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        i11 = i12 + 1;
                        v0.h hVar = (v0.h) bVar;
                        a2.l.c(menu, i12, this.f55579d.getContext(), hVar.f53463b, hVar.f53464c);
                    }
                } else if (bVar instanceof v0.f) {
                    i13++;
                }
            }
            i12 = i11;
        }
        return true;
    }
}
