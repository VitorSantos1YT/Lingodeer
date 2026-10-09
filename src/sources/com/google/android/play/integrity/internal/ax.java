package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ax implements bb {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f16256c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile bb f16257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f16258b;

    /* JADX WARN: Multi-variable type inference failed */
    public static ax b(ay ayVar) {
        if (ayVar instanceof ax) {
            return (ax) ayVar;
        }
        ax axVar = new ax();
        axVar.f16258b = f16256c;
        axVar.f16257a = ayVar;
        return axVar;
    }

    @Override // com.google.android.play.integrity.internal.bd
    public final Object a() {
        Object objA;
        Object obj = this.f16258b;
        Object obj2 = f16256c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objA = this.f16258b;
                if (objA == obj2) {
                    objA = this.f16257a.a();
                    Object obj3 = this.f16258b;
                    if (obj3 != obj2 && obj3 != objA) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objA + ". This is likely due to a circular dependency.");
                    }
                    this.f16258b = objA;
                    this.f16257a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return objA;
    }
}
