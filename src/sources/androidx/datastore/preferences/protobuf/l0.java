package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y f1511b = new y(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1512a;

    public l0(o oVar) {
        e0.a(oVar, "output");
        this.f1512a = oVar;
        oVar.f1525a = this;
    }

    public void a(int i11, i iVar) {
        ((o) this.f1512a).n0(i11, iVar);
    }

    public void b(int i11, Object obj, d1 d1Var) {
        o oVar = (o) this.f1512a;
        oVar.y0(i11, 3);
        d1Var.e((a) obj, oVar.f1525a);
        oVar.y0(i11, 4);
    }

    public l0() {
        r0 r0Var;
        a1 a1Var = a1.f1445c;
        try {
            r0Var = (r0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            r0Var = f1511b;
        }
        r0[] r0VarArr = {y.f1578b, r0Var};
        k0 k0Var = new k0();
        k0Var.f1502a = r0VarArr;
        Charset charset = e0.f1463a;
        this.f1512a = k0Var;
    }
}
