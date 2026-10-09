package androidx.fragment.app;

import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.n implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1770a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f1771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1773d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, ViewGroup viewGroup, Object obj) {
        super(0);
        this.f1771b = qVar;
        this.f1773d = viewGroup;
        this.f1772c = obj;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f1770a) {
            case 0:
                this.f1771b.f1791f.e(this.f1773d, this.f1772c);
                break;
            default:
                q qVar = this.f1771b;
                ArrayList arrayList = qVar.f1788c;
                h2 h2Var = qVar.f1791f;
                if (arrayList.isEmpty()) {
                    Object obj = qVar.f1801q;
                    kotlin.jvm.internal.m.c(obj);
                    h2Var.d(obj, new n(qVar, this.f1773d));
                } else {
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj2 = arrayList.get(i11);
                        i11++;
                        if (!((r) obj2).f1737a.f1760g) {
                            v4.b bVar = new v4.b();
                            h2Var.u(((r) arrayList.get(0)).f1737a.f1756c, this.f1772c, bVar, new z(qVar, 3));
                            bVar.a();
                        }
                    }
                    Object obj3 = qVar.f1801q;
                    kotlin.jvm.internal.m.c(obj3);
                    h2Var.d(obj3, new n(qVar, this.f1773d));
                }
                break;
        }
        return qy.b0.f48488a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, Object obj, ViewGroup viewGroup) {
        super(0);
        this.f1771b = qVar;
        this.f1772c = obj;
        this.f1773d = viewGroup;
    }
}
