package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1766a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1768c;

    public /* synthetic */ n(q qVar, ViewGroup viewGroup) {
        this.f1767b = qVar;
        this.f1768c = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1766a) {
            case 0:
                h2.j((View) this.f1767b, (Rect) this.f1768c);
                break;
            default:
                q qVar = (q) this.f1767b;
                ViewGroup container = (ViewGroup) this.f1768c;
                kotlin.jvm.internal.m.f(container, "$container");
                ArrayList arrayList = qVar.f1788c;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    m2 m2Var = ((r) obj).f1737a;
                    View view = m2Var.f1756c.getView();
                    if (view != null) {
                        m2Var.f1754a.a(view, container);
                    }
                }
                break;
        }
    }

    public /* synthetic */ n(h2 h2Var, View view, Rect rect) {
        this.f1767b = view;
        this.f1768c = rect;
    }
}
