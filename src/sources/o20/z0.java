package o20;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import vf.eq.EHjhWcesDUIsIw;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class z0 implements GenericArrayType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f44626a;

    public z0(Type type) {
        this.f44626a = type;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && c1.e(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f44626a;
    }

    public final int hashCode() {
        return this.f44626a.hashCode();
    }

    public final String toString() {
        return c1.r(this.f44626a) + EHjhWcesDUIsIw.JVnGDXdN;
    }
}
