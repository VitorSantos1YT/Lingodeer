package h00;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e0 implements c00.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f29920a = new e0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e00.h f29921b = ns.o.i("kotlinx.serialization.json.JsonPrimitive", e00.e.f24681k, new e00.g[0]);

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        m mVarI = com.bumptech.glide.g.g(cVar).i();
        if (mVarI instanceof d0) {
            return (d0) mVarI;
        }
        throw i00.j.c(-1, mVarI.toString(), "Unexpected JSON element, expected JsonPrimitive, had " + kotlin.jvm.internal.z.a(mVarI.getClass()));
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return f29921b;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        d0 value = (d0) obj;
        kotlin.jvm.internal.m.f(value, "value");
        com.bumptech.glide.g.c(dVar);
        if (value instanceof w) {
            dVar.y(x.f29947a, w.INSTANCE);
        } else {
            dVar.y(u.f29945a, (t) value);
        }
    }
}
