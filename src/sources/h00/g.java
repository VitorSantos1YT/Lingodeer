package h00;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements c00.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f29925a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f29926b = f.f29922b;

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        com.bumptech.glide.g.g(cVar);
        return new e((List) qx.b.e(o.f29939a).deserialize(cVar));
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return f29926b;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        e value = (e) obj;
        kotlin.jvm.internal.m.f(value, "value");
        com.bumptech.glide.g.c(dVar);
        qx.b.e(o.f29939a).serialize(dVar, value);
    }
}
