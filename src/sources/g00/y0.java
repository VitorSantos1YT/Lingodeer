package g00;

import kotlinx.serialization.SerializationException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class y0 implements c00.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y0 f28498a = new y0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x0 f28499b = x0.f28491a;

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        throw new SerializationException("'kotlin.Nothing' does not have instances");
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return f28499b;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        Void value = (Void) obj;
        kotlin.jvm.internal.m.f(value, "value");
        throw new SerializationException("'kotlin.Nothing' cannot be serialized");
    }
}
