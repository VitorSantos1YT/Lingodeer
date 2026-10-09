package tq;

import defpackage.e;
import kotlin.jvm.internal.m;
import qy.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pq.a f52508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f52509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f52510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f52511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f52512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f52513f;

    public a(pq.a aVar, l lVar, String str, boolean z11, float f5, boolean z12) {
        this.f52508a = aVar;
        this.f52509b = lVar;
        this.f52510c = str;
        this.f52511d = z11;
        this.f52512e = f5;
        this.f52513f = z12;
    }

    public static a a(a aVar, pq.a aVar2, l lVar, String str, boolean z11, float f5, boolean z12, int i11) {
        aVar.getClass();
        if ((i11 & 2) != 0) {
            aVar2 = aVar.f52508a;
        }
        pq.a aVar3 = aVar2;
        if ((i11 & 4) != 0) {
            lVar = aVar.f52509b;
        }
        l lVar2 = lVar;
        if ((i11 & 8) != 0) {
            str = aVar.f52510c;
        }
        String str2 = str;
        if ((i11 & 16) != 0) {
            z11 = aVar.f52511d;
        }
        boolean z13 = z11;
        if ((i11 & 32) != 0) {
            f5 = aVar.f52512e;
        }
        float f11 = f5;
        if ((i11 & 64) != 0) {
            z12 = aVar.f52513f;
        }
        aVar.getClass();
        return new a(aVar3, lVar2, str2, z13, f11, z12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.a(this.f52508a, aVar.f52508a) && m.a(this.f52509b, aVar.f52509b) && m.a(this.f52510c, aVar.f52510c) && this.f52511d == aVar.f52511d && Float.compare(this.f52512e, aVar.f52512e) == 0 && this.f52513f == aVar.f52513f;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(false) * 31;
        pq.a aVar = this.f52508a;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        l lVar = this.f52509b;
        int iHashCode3 = (iHashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        String str = this.f52510c;
        return Boolean.hashCode(this.f52513f) + e.a(e.e((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f52511d), this.f52512e, 31);
    }

    public final String toString() {
        return "VTAlphabetUiState(isLoading=false, selectedItem=" + this.f52508a + ", selectedPosition=" + this.f52509b + ", error=" + this.f52510c + ", isDownloading=" + this.f52511d + ", downloadProgress=" + this.f52512e + ", isResourceReady=" + this.f52513f + ")";
    }
}
