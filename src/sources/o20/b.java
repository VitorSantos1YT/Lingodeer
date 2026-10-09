package o20;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class b implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f44481b = new b(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f44482c = new b(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f44483d = new b(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f44484e = new b(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f44485f = new b(4);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b f44486t = new b(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44487a;

    public /* synthetic */ b(int i11) {
        this.f44487a = i11;
    }

    public List a(Executor executor) {
        return Collections.singletonList(new o(executor));
    }

    public List b() {
        return Collections.EMPTY_LIST;
    }

    public String c(Method method, int i11) {
        return "parameter #" + (i11 + 1);
    }

    public Object d(Class cls, Object obj, Method method, Object[] objArr) {
        throw new AssertionError();
    }

    public boolean e(Method method) {
        return false;
    }

    @Override // o20.m
    public Object j(Object obj) {
        switch (this.f44487a) {
            case 0:
                return obj.toString();
            case 1:
                ResponseBody responseBody = (ResponseBody) obj;
                try {
                    m00.i iVar = new m00.i();
                    responseBody.source().O(iVar);
                    return ResponseBody.create(responseBody.contentType(), responseBody.contentLength(), iVar);
                } finally {
                    responseBody.close();
                }
            case 2:
                return (RequestBody) obj;
            case 3:
                return (ResponseBody) obj;
            case 4:
                ((ResponseBody) obj).close();
                return qy.b0.f48488a;
            default:
                ((ResponseBody) obj).close();
                return null;
        }
    }
}
