package h00;

import fr.n2;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class o implements c00.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f29939a = new o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e00.h f29940b = ns.o.h("kotlinx.serialization.json.JsonElement", e00.c.f24672d, new e00.g[0], new n2(27));

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        return com.bumptech.glide.g.g(cVar).i();
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return f29940b;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        m value = (m) obj;
        kotlin.jvm.internal.m.f(value, "value");
        com.bumptech.glide.g.c(dVar);
        if (value instanceof d0) {
            dVar.y(e0.f29920a, value);
        } else if (value instanceof z) {
            dVar.y(b0.f29913a, value);
        } else {
            if (!(value instanceof e)) {
                throw new NoWhenBranchMatchedException();
            }
            dVar.y(g.f29925a, value);
        }
    }
}
