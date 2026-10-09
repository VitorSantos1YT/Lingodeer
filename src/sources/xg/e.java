package xg;

import android.app.Activity;
import android.os.Build;
import java.util.Iterator;
import l1.b1;
import qy.b0;
import uz.j;
import za.l;
import za.m;
import za.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f56065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v3.c f56066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f56067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f56068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b1 f56069e;

    public e(Activity activity, v3.c cVar, float f5, float f11, b1 b1Var) {
        this.f56065a = activity;
        this.f56066b = cVar;
        this.f56067c = f5;
        this.f56068d = f11;
        this.f56069e = b1Var;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008a  */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
    @Override // uz.j
    public final Object emit(Object obj, vy.d dVar) {
        db.f fVar;
        boolean z11;
        za.j jVar = (za.j) obj;
        m.f59080a.getClass();
        n it = l.f59079b;
        kotlin.jvm.internal.m.f(it, "it");
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            fVar = db.e.f23352c;
        } else {
            fVar = i11 >= 30 ? db.c.f23350c : db.a.f23346h;
        }
        ya.b bVar = fVar.c(this.f56065a, it.f59081b).f59076a;
        int iWidth = bVar.c().width();
        v3.c cVar = this.f56066b;
        float fQ = cVar.Q(iWidth);
        float fQ2 = cVar.Q(bVar.c().height());
        ?? r9 = jVar.f59075a;
        boolean z12 = true;
        if (!r9.isEmpty()) {
            Iterator it2 = r9.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z11 = false;
                    break;
                }
                za.c cVar2 = (za.c) it2.next();
                if (cVar2 != null && cVar2.f59061c.equals(za.b.f59053f)) {
                    z11 = true;
                    break;
                }
            }
        } else {
            z11 = false;
            break;
        }
        boolean z13 = v3.f.a(fQ, fQ2) > 0;
        if (z11) {
            v3.f.c(fQ);
            v3.f.c(fQ2);
            float f5 = this.f56067c;
            v3.f.c(f5);
            if (v3.f.a(fQ, f5) < 0) {
                z12 = false;
            }
        } else {
            v3.f.c(fQ);
            v3.f.c(fQ2);
            float f11 = this.f56068d;
            v3.f.c(f11);
            if (v3.f.a(fQ, f11) < 0 || !z13) {
                z12 = false;
            }
        }
        b1 b1Var = this.f56069e;
        if (((Boolean) b1Var.getValue()).booleanValue() != z12) {
            b1Var.setValue(Boolean.valueOf(z12));
            ((Boolean) b1Var.getValue()).booleanValue();
            v3.f.c(fQ);
            v3.f.c(fQ2);
        } else {
            ((Boolean) b1Var.getValue()).booleanValue();
            v3.f.c(fQ);
            v3.f.c(fQ2);
        }
        return b0.f48488a;
    }
}
