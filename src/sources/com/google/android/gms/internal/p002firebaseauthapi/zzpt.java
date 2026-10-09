package com.google.android.gms.internal.p002firebaseauthapi;

import ep.a;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzpt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f10841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f10842b;

    public zzpt(Class cls, Class cls2) {
        this.f10841a = cls;
        this.f10842b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzpt)) {
            return false;
        }
        zzpt zzptVar = (zzpt) obj;
        return zzptVar.f10841a.equals(this.f10841a) && zzptVar.f10842b.equals(this.f10842b);
    }

    public final int hashCode() {
        return Objects.hash(this.f10841a, this.f10842b);
    }

    public final String toString() {
        return a.D(this.f10841a.getSimpleName(), " with primitive type: ", this.f10842b.getSimpleName());
    }
}
