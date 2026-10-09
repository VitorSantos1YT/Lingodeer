package s0;

import l1.x1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f51242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s0 f51243b;

    public /* synthetic */ w(s0 s0Var, int i11) {
        this.f51242a = i11;
        this.f51243b = s0Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f51242a) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.f51243b.f51181q.setValue(bool);
                return qy.b0.f48488a;
            case 1:
                s0 s0Var = this.f51243b;
                l1.k1 k1Var = s0Var.f51184t;
                o3.w wVar = (o3.w) obj;
                String str = wVar.f44704a.f35700b;
                j3.h hVar = s0Var.f51175j;
                if (!kotlin.jvm.internal.m.a(str, hVar != null ? hVar.f35700b : null)) {
                    s0Var.f51176k.setValue(h0.None);
                    if (((Boolean) k1Var.getValue()).booleanValue()) {
                        k1Var.setValue(Boolean.FALSE);
                    } else {
                        s0Var.f51183s.setValue(Boolean.FALSE);
                    }
                }
                long j11 = j3.x0.f35821b;
                s0Var.f(j11);
                s0Var.e(j11);
                s0Var.f51185u.invoke(wVar);
                x1 x1Var = s0Var.f51167b;
                l1.z zVar = x1Var.f39499a;
                if (zVar != null) {
                    zVar.r(x1Var, null);
                }
                return qy.b0.f48488a;
            case 2:
                this.f51243b.f51182r.b(((o3.i) obj).f44677a);
                return qy.b0.f48488a;
            default:
                return Boolean.valueOf(this.f51243b.f51182r.b(((o3.i) obj).f44677a));
        }
    }
}
