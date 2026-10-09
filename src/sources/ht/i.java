package ht;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f33742e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f33743f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f33744g;

    public /* synthetic */ i(List list) {
        this(list, 0, 0.8f);
    }

    @Override // ht.l
    public final int a() {
        return this.f33743f;
    }

    @Override // ht.l
    public final float c() {
        return this.f33744g;
    }

    @Override // ht.l
    public final List d() {
        return this.f33742e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return kotlin.jvm.internal.m.a(this.f33742e, iVar.f33742e) && this.f33743f == iVar.f33743f && Float.compare(this.f33744g, iVar.f33744g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f33744g) + defpackage.e.b(this.f33743f, this.f33742e.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlayingSlow(visemedMaps=");
        sb2.append(this.f33742e);
        sb2.append(", currentIndex=");
        sb2.append(this.f33743f);
        sb2.append(", speed=");
        return nv.p.h(this.f33744g, ")", sb2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(List visemedMaps, int i11, float f5) {
        super(visemedMaps, i11, f5);
        kotlin.jvm.internal.m.f(visemedMaps, "visemedMaps");
        this.f33742e = visemedMaps;
        this.f33743f = i11;
        this.f33744g = f5;
    }
}
