package h00;

import g00.g0;
import g00.t1;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b0 implements c00.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f29913a = new b0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a0 f29914b = a0.f29910b;

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        com.bumptech.glide.g.g(cVar);
        t1 t1Var = t1.f28468a;
        o oVar = o.f29939a;
        return new z((Map) new g0(t1.f28468a, o.f29939a, 1).deserialize(cVar));
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return f29914b;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        z value = (z) obj;
        kotlin.jvm.internal.m.f(value, "value");
        com.bumptech.glide.g.c(dVar);
        t1 t1Var = t1.f28468a;
        o oVar = o.f29939a;
        new g0(t1.f28468a, o.f29939a, 1).serialize(dVar, value);
    }
}
