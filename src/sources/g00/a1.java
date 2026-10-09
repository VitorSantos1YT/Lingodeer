package g00;

import kotlinx.serialization.SerializationException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a1 implements c00.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f28359a = com.bumptech.glide.d.u(qy.j.PUBLICATION, new fk.a(this));

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        e00.g descriptor = getDescriptor();
        f00.a aVarD = cVar.d(descriptor);
        int iN = aVarD.n(getDescriptor());
        if (iN != -1) {
            throw new SerializationException(nv.p.j(iN, "Unexpected index "));
        }
        aVarD.c(descriptor);
        return qy.b0.f48488a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qy.h] */
    @Override // c00.a
    public final e00.g getDescriptor() {
        return (e00.g) this.f28359a.getValue();
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object value) {
        kotlin.jvm.internal.m.f(value, "value");
        dVar.d(getDescriptor()).c(getDescriptor());
    }
}
