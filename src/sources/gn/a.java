package gn;

import com.lingo.lingoskill.object.KOCharZhuyin;
import hh.p0;
import kotlin.jvm.internal.m;
import qy.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f29301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KOCharZhuyin f29302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f29303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f29304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f29305e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f29306f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f29307g;

    public a(boolean z11, KOCharZhuyin kOCharZhuyin, l lVar, String str, boolean z12, float f5, boolean z13) {
        this.f29301a = z11;
        this.f29302b = kOCharZhuyin;
        this.f29303c = lVar;
        this.f29304d = str;
        this.f29305e = z12;
        this.f29306f = f5;
        this.f29307g = z13;
    }

    public static a a(a aVar, boolean z11, KOCharZhuyin kOCharZhuyin, l lVar, String str, boolean z12, float f5, boolean z13, int i11) {
        if ((i11 & 1) != 0) {
            z11 = aVar.f29301a;
        }
        boolean z14 = z11;
        if ((i11 & 2) != 0) {
            kOCharZhuyin = aVar.f29302b;
        }
        KOCharZhuyin kOCharZhuyin2 = kOCharZhuyin;
        if ((i11 & 4) != 0) {
            lVar = aVar.f29303c;
        }
        l lVar2 = lVar;
        if ((i11 & 8) != 0) {
            str = aVar.f29304d;
        }
        String str2 = str;
        if ((i11 & 16) != 0) {
            z12 = aVar.f29305e;
        }
        boolean z15 = z12;
        if ((i11 & 32) != 0) {
            f5 = aVar.f29306f;
        }
        float f11 = f5;
        if ((i11 & 64) != 0) {
            z13 = aVar.f29307g;
        }
        aVar.getClass();
        return new a(z14, kOCharZhuyin2, lVar2, str2, z15, f11, z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f29301a == aVar.f29301a && m.a(this.f29302b, aVar.f29302b) && m.a(this.f29303c, aVar.f29303c) && m.a(this.f29304d, aVar.f29304d) && this.f29305e == aVar.f29305e && Float.compare(this.f29306f, aVar.f29306f) == 0 && this.f29307g == aVar.f29307g;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f29301a) * 31;
        KOCharZhuyin kOCharZhuyin = this.f29302b;
        int iHashCode2 = (iHashCode + (kOCharZhuyin == null ? 0 : kOCharZhuyin.hashCode())) * 31;
        l lVar = this.f29303c;
        int iHashCode3 = (iHashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        String str = this.f29304d;
        return Boolean.hashCode(this.f29307g) + defpackage.e.a(defpackage.e.e((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f29305e), this.f29306f, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("KOAlphabetUiState(isLoading=");
        sb2.append(this.f29301a);
        sb2.append(", selectedItem=");
        sb2.append(this.f29302b);
        sb2.append(", selectedPosition=");
        sb2.append(this.f29303c);
        sb2.append(", error=");
        sb2.append(this.f29304d);
        sb2.append(", isDownloading=");
        sb2.append(this.f29305e);
        sb2.append(", downloadProgress=");
        sb2.append(this.f29306f);
        sb2.append(", isResourceReady=");
        return p0.p(sb2, this.f29307g, ")");
    }
}
