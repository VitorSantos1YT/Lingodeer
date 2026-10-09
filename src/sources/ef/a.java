package ef;

import android.content.Context;
import b7.f0;
import f7.a0;
import f7.x;
import lf.e0;
import lf.h0;
import qp.r;
import re.s;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25492a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f25493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f25495d;

    public /* synthetic */ a(String str, long j11, Context context) {
        this.f25493b = j11;
        this.f25494c = str;
        this.f25495d = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b7.c cVar;
        switch (this.f25492a) {
            case 0:
                long j11 = this.f25493b;
                String str = (String) this.f25494c;
                Context appContext = (Context) this.f25495d;
                b7.c cVar2 = d.f25506g;
                Long l9 = cVar2 != null ? (Long) cVar2.f3960c : null;
                if (d.f25506g == null) {
                    d.f25506g = new b7.c(Long.valueOf(j11), null);
                    String str2 = d.f25508i;
                    kotlin.jvm.internal.m.e(appContext, "appContext");
                    n.b(appContext, str, str2);
                } else if (l9 != null) {
                    long jLongValue = j11 - l9.longValue();
                    String str3 = d.f25500a;
                    e0 e0VarB = h0.b(s.b());
                    if (jLongValue > (e0VarB == null ? 60 : e0VarB.f40000d) * 1000) {
                        n.d(str, d.f25506g, d.f25508i);
                        String str4 = d.f25508i;
                        kotlin.jvm.internal.m.e(appContext, "appContext");
                        n.b(appContext, str, str4);
                        d.f25506g = new b7.c(Long.valueOf(j11), null);
                    } else if (jLongValue > 1000 && (cVar = d.f25506g) != null) {
                        cVar.f3958a++;
                    }
                }
                b7.c cVar3 = d.f25506g;
                if (cVar3 != null) {
                    cVar3.f3960c = Long.valueOf(j11);
                }
                b7.c cVar4 = d.f25506g;
                if (cVar4 != null) {
                    cVar4.j();
                }
                break;
            default:
                r rVar = (r) this.f25494c;
                Object obj = this.f25495d;
                long j12 = this.f25493b;
                x xVar = (x) rVar.f48146c;
                String str5 = f0.f3975a;
                a0 a0Var = xVar.f26935a;
                g7.f fVar = a0Var.V;
                g7.a aVarM = fVar.M();
                fVar.N(aVarM, 26, new androidx.lifecycle.viewmodel.compose.c(aVarM, obj, j12));
                if (a0Var.f26659w0 == obj) {
                    a0Var.P.e(26, new f.s(3));
                }
                break;
        }
    }

    public /* synthetic */ a(r rVar, Object obj, long j11) {
        this.f25494c = rVar;
        this.f25495d = obj;
        this.f25493b = j11;
    }
}
