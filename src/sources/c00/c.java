package c00;

import kotlin.jvm.internal.m;
import qy.j;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends g00.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mz.c f6403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6404b;

    public c(mz.c baseClass) {
        m.f(baseClass, "baseClass");
        this.f6403a = baseClass;
        this.f6404b = com.bumptech.glide.d.u(j.PUBLICATION, new av.d(this, 19));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qy.h] */
    @Override // c00.a
    public final e00.g getDescriptor() {
        return (e00.g) this.f6404b.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.f6403a + ')';
    }
}
