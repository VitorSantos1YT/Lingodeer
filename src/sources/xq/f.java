package xq;

import android.content.Context;
import com.google.logging.type.LogSeverity;
import fb.g0;
import fr.j3;
import g2.x;
import k6.r;
import l1.s;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f56182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f56183c;

    public /* synthetic */ f(o oVar, k kVar, int i11) {
        this.f56181a = i11;
        this.f56182b = oVar;
        this.f56183c = kVar;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f56181a) {
            case 0:
                k6.g Column = (k6.g) obj;
                l1.n nVar = (l1.n) obj2;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.f(Column, "$this$Column");
                o oVar = this.f56182b;
                v10.c.d(null, 1, 1, t1.e.d(-233260756, new f(oVar, this.f56183c, 1), nVar), nVar, 3072);
                s sVar = (s) nVar;
                String string = ((Context) sVar.j(c6.f.f6623b)).getString(oVar.f56206a);
                kotlin.jvm.internal.m.e(string, "getString(...)");
                long j11 = x.f28618e;
                g0.d(string, null, new o6.g(new j6.a(j11, j11), new v3.o(j3.A(12)), new o6.b(500), new o6.c(), 104), 0, sVar, 0);
                break;
            default:
                r Row = (r) obj;
                l1.n nVar2 = (l1.n) obj2;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.f(Row, "$this$Row");
                vc.a.a(new c6.a(this.f56182b.f56208c), "streak icon", vc.a.A(30), 0, nVar2, 48, 24);
                ve.i.e(vc.a.A(8), nVar2, 0);
                String strValueOf = String.valueOf(this.f56183c.f56190a);
                long j12 = x.f28618e;
                g0.d(strValueOf, null, new o6.g(new j6.a(j12, j12), new v3.o(j3.A(32)), new o6.b(LogSeverity.ALERT_VALUE), null, 120), 0, nVar2, 0);
                break;
        }
        return b0.f48488a;
    }
}
