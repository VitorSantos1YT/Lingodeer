package pt;

import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f47150b;

    public h(String str, i type) {
        m.f(type, "type");
        this.f47149a = str;
        this.f47150b = type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return m.a(this.f47149a, hVar.f47149a) && this.f47150b == hVar.f47150b;
    }

    public final int hashCode() {
        return this.f47150b.hashCode() + (this.f47149a.hashCode() * 31);
    }

    public final String toString() {
        return "JPKanaSegment(text=" + this.f47149a + ", type=" + this.f47150b + ")";
    }
}
