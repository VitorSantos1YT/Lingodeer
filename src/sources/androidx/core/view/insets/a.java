package androidx.core.view.insets;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import c5.b;
import hh.p0;
import java.util.ArrayList;
import java.util.WeakHashMap;
import r4.d;
import z4.j0;
import z4.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f1415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f1416b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f1417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f1418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1419e;

    public a(final ViewGroup viewGroup) {
        d dVar = d.f48792e;
        this.f1417c = dVar;
        this.f1418d = dVar;
        Drawable background = viewGroup.getBackground();
        this.f1419e = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        final Context context = viewGroup.getContext();
        View view = new View(context) { // from class: androidx.core.view.insets.SystemBarStateMonitor$1
            @Override // android.view.View
            public final void onConfigurationChanged(Configuration configuration) {
                a aVar = this.f1414b;
                ArrayList arrayList = aVar.f1416b;
                Drawable background2 = viewGroup.getBackground();
                int color = background2 instanceof ColorDrawable ? ((ColorDrawable) background2).getColor() : 0;
                if (aVar.f1419e != color) {
                    aVar.f1419e = color;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList arrayList2 = ((c5.a) arrayList.get(size)).f6600a;
                        int size2 = arrayList2.size() - 1;
                        if (size2 >= 0) {
                            throw p0.e(size2, arrayList2);
                        }
                    }
                }
            }
        };
        this.f1415a = view;
        view.setWillNotDraw(true);
        app.rive.runtime.kotlin.core.a aVar = new app.rive.runtime.kotlin.core.a(this, 14);
        WeakHashMap weakHashMap = s0.f58893a;
        j0.m(view, aVar);
        s0.s(view, new b(this));
        viewGroup.addView(view, 0);
    }
}
