package g00;

import java.lang.ref.SoftReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class r extends ClassValue {
    @Override // java.lang.ClassValue
    public final Object computeValue(Class type) {
        kotlin.jvm.internal.m.f(type, "type");
        v0 v0Var = new v0();
        v0Var.reference = new SoftReference<>(null);
        return v0Var;
    }
}
