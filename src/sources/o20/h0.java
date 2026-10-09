package o20;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.RequestBody;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h0 extends c1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f44516c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f44517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f44518e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m f44519f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f44520g;

    public h0(Method method, int i11, m mVar, String str) {
        this.f44517d = method;
        this.f44518e = i11;
        this.f44519f = mVar;
        this.f44520g = str;
    }

    @Override // o20.c1
    public final void a(q0 q0Var, Object obj) {
        switch (this.f44516c) {
            case 0:
                if (obj == null) {
                    return;
                }
                try {
                    q0Var.c((Headers) this.f44520g, (RequestBody) this.f44519f.j(obj));
                    return;
                } catch (IOException e8) {
                    throw c1.m(this.f44517d, this.f44518e, "Unable to convert " + obj + " to RequestBody", e8);
                }
            default:
                Map map = (Map) obj;
                int i11 = this.f44518e;
                Method method = this.f44517d;
                if (map == null) {
                    throw c1.m(method, i11, "Part map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw c1.m(method, i11, "Part map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw c1.m(method, i11, ep.a.g("Part map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String[] strArr = {HttpHeaders.CONTENT_DISPOSITION, ep.a.g("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", (String) this.f44520g};
                    Headers.f45040b.getClass();
                    q0Var.c(Headers.Companion.a(strArr), (RequestBody) this.f44519f.j(value));
                }
                return;
        }
    }

    public h0(Method method, int i11, Headers headers, m mVar) {
        this.f44517d = method;
        this.f44518e = i11;
        this.f44520g = headers;
        this.f44519f = mVar;
    }
}
