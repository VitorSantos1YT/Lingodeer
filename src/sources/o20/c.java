package o20;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44497a;

    public /* synthetic */ c(int i11) {
        this.f44497a = i11;
    }

    @Override // o20.l
    public m a(Type type) {
        switch (this.f44497a) {
            case 0:
                if (RequestBody.class.isAssignableFrom(c1.h(type))) {
                    return b.f44483d;
                }
                return null;
            default:
                return super.a(type);
        }
    }

    @Override // o20.l
    public final m b(Type type, Annotation[] annotationArr, v0 v0Var) {
        switch (this.f44497a) {
            case 0:
                if (type == ResponseBody.class) {
                    return c1.k(annotationArr, r20.w.class) ? b.f44484e : b.f44482c;
                }
                if (type == Void.class) {
                    return b.f44486t;
                }
                if (c1.f44501b && type == qy.b0.class) {
                    return b.f44485f;
                }
                return null;
            default:
                if (c1.h(type) != Optional.class) {
                    return null;
                }
                return new lp.j(v0Var.d(c1.g(0, (ParameterizedType) type), annotationArr), 4);
        }
    }
}
