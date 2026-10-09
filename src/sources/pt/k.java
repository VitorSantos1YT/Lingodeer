package pt;

import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j3.h f47152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j3.h f47153b;

    public k(j3.h hVar, j3.h hVar2) {
        this.f47152a = hVar;
        this.f47153b = hVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return m.a(this.f47152a, kVar.f47152a) && m.a(this.f47153b, kVar.f47153b);
    }

    public final int hashCode() {
        return this.f47153b.hashCode() + (this.f47152a.hashCode() * 31);
    }

    public final String toString() {
        return "TwoLayerText(bottomTone=" + ((Object) this.f47152a) + ", topPhoneme=" + ((Object) this.f47153b) + ")";
    }
}
