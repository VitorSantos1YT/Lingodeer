package com.google.android.gms.internal.p002firebaseauthapi;

import ep.a;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzqf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f10862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f10863b;

    public zzqf(Class cls, Class cls2) {
        this.f10862a = cls;
        this.f10863b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzqf)) {
            return false;
        }
        zzqf zzqfVar = (zzqf) obj;
        return zzqfVar.f10862a.equals(this.f10862a) && zzqfVar.f10863b.equals(this.f10863b);
    }

    public final int hashCode() {
        return Objects.hash(this.f10862a, this.f10863b);
    }

    public final String toString() {
        return a.D(this.f10862a.getSimpleName(), " with serialization type: ", this.f10863b.getSimpleName());
    }
}
