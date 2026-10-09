package o20;

import java.io.IOException;
import java.lang.reflect.Method;
import okhttp3.RequestBody;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d0 extends c1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f44502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f44503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f44504e;

    public d0(Method method, int i11, m mVar) {
        this.f44502c = method;
        this.f44503d = i11;
        this.f44504e = mVar;
    }

    @Override // o20.c1
    public final void a(q0 q0Var, Object obj) {
        int i11 = this.f44503d;
        Method method = this.f44502c;
        if (obj == null) {
            throw c1.m(method, i11, "Body parameter value must not be null.", new Object[0]);
        }
        try {
            q0Var.f44554k = (RequestBody) this.f44504e.j(obj);
        } catch (IOException e8) {
            throw c1.n(method, e8, i11, "Unable to convert " + obj + " to RequestBody", new Object[0]);
        }
    }
}
