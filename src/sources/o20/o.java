package o20;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class o extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f44538a;

    public o(Executor executor) {
        this.f44538a = executor;
    }

    @Override // o20.f
    public final g a(Type type, Annotation[] annotationArr) {
        if (c1.h(type) != e.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new ob.l(23, c1.g(0, (ParameterizedType) type), c1.k(annotationArr, x0.class) ? null : this.f44538a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
