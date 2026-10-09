package androidx.glance.appwidget.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f1937b = new t(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1938a;

    public h0(l lVar) {
        Charset charset = b0.f1912a;
        this.f1938a = lVar;
        lVar.f1960c = this;
    }

    public void a(int i11, h hVar) {
        ((l) this.f1938a).h0(i11, hVar);
    }

    public void b(int i11, Object obj, w0 w0Var) {
        l lVar = (l) this.f1938a;
        lVar.q0(i11, 3);
        w0Var.h((a) obj, lVar.f1960c);
        lVar.q0(i11, 4);
    }

    public h0() {
        l0 l0Var;
        t0 t0Var = t0.f1996c;
        try {
            l0Var = (l0) Class.forName("androidx.glance.appwidget.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            l0Var = f1937b;
        }
        l0[] l0VarArr = {t.f1994b, l0Var};
        g0 g0Var = new g0();
        g0Var.f1932a = l0VarArr;
        Charset charset = b0.f1912a;
        this.f1938a = g0Var;
    }
}
