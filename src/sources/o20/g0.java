package o20;

import java.lang.reflect.Method;
import okhttp3.Headers;
import okhttp3.internal._HeadersCommonKt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g0 extends c1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f44513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f44514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f44515e;

    public /* synthetic */ g0(Method method, int i11, int i12) {
        this.f44513c = i12;
        this.f44514d = method;
        this.f44515e = i11;
    }

    @Override // o20.c1
    public final void a(q0 q0Var, Object obj) {
        switch (this.f44513c) {
            case 0:
                Headers headers = (Headers) obj;
                if (headers == null) {
                    throw c1.m(this.f44514d, this.f44515e, "Headers parameter must not be null.", new Object[0]);
                }
                Headers.Builder builder = q0Var.f44549f;
                builder.getClass();
                int size = headers.size();
                for (int i11 = 0; i11 < size; i11++) {
                    _HeadersCommonKt.a(builder, headers.d(i11), headers.g(i11));
                }
                return;
            default:
                if (obj == null) {
                    throw c1.m(this.f44514d, this.f44515e, "@Url parameter is null.", new Object[0]);
                }
                q0Var.f44546c = obj.toString();
                return;
        }
    }
}
