package lw;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f40428b = new a("internal:health-checking-config");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f40429c = new k(5);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f40430d = new a("internal:has-health-check-producer-listener");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f40431e = new a("io.grpc.IS_PETIOLE_POLICY");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f40432a;

    public q1 a(n0 n0Var) {
        List list = n0Var.f40422a;
        if (!list.isEmpty() || b()) {
            int i11 = this.f40432a;
            this.f40432a = i11 + 1;
            if (i11 == 0) {
                d(n0Var);
            }
            this.f40432a = 0;
            return q1.f40434e;
        }
        q1 q1VarH = q1.m.h("NameResolver returned no usable address. addrs=" + list + ", attrs=" + n0Var.f40423b);
        c(q1VarH);
        return q1VarH;
    }

    public boolean b() {
        return false;
    }

    public abstract void c(q1 q1Var);

    public void d(n0 n0Var) {
        int i11 = this.f40432a;
        this.f40432a = i11 + 1;
        if (i11 == 0) {
            a(n0Var);
        }
        this.f40432a = 0;
    }

    public abstract void f();

    public void e() {
    }
}
