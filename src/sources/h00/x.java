package h00;

import kotlinx.serialization.json.internal.JsonDecodingException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class x implements c00.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f29947a = new x();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e00.h f29948b = ns.o.i("kotlinx.serialization.json.JsonNull", e00.l.f24699c, new e00.g[0]);

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        com.bumptech.glide.g.g(cVar);
        if (cVar.r()) {
            throw new JsonDecodingException("Expected 'null' literal");
        }
        return w.INSTANCE;
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return f29948b;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        w value = (w) obj;
        kotlin.jvm.internal.m.f(value, "value");
        com.bumptech.glide.g.c(dVar);
        dVar.e();
    }
}
