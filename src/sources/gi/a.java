package gi;

import com.lingo.lingoskill.object.ARChar;
import kotlin.jvm.internal.m;
import qy.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ARChar f29243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f29244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f29245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f29246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f29247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f29248f;

    public a(ARChar aRChar, l lVar, String str, boolean z11, float f5, boolean z12) {
        this.f29243a = aRChar;
        this.f29244b = lVar;
        this.f29245c = str;
        this.f29246d = z11;
        this.f29247e = f5;
        this.f29248f = z12;
    }

    public static a a(a aVar, ARChar aRChar, l lVar, String str, boolean z11, float f5, boolean z12, int i11) {
        aVar.getClass();
        if ((i11 & 2) != 0) {
            aRChar = aVar.f29243a;
        }
        ARChar aRChar2 = aRChar;
        if ((i11 & 4) != 0) {
            lVar = aVar.f29244b;
        }
        l lVar2 = lVar;
        if ((i11 & 8) != 0) {
            str = aVar.f29245c;
        }
        String str2 = str;
        if ((i11 & 16) != 0) {
            z11 = aVar.f29246d;
        }
        boolean z13 = z11;
        if ((i11 & 32) != 0) {
            f5 = aVar.f29247e;
        }
        float f11 = f5;
        if ((i11 & 64) != 0) {
            z12 = aVar.f29248f;
        }
        aVar.getClass();
        return new a(aRChar2, lVar2, str2, z13, f11, z12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.a(this.f29243a, aVar.f29243a) && m.a(this.f29244b, aVar.f29244b) && m.a(this.f29245c, aVar.f29245c) && this.f29246d == aVar.f29246d && Float.compare(this.f29247e, aVar.f29247e) == 0 && this.f29248f == aVar.f29248f;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(false) * 31;
        ARChar aRChar = this.f29243a;
        int iHashCode2 = (iHashCode + (aRChar == null ? 0 : aRChar.hashCode())) * 31;
        l lVar = this.f29244b;
        int iHashCode3 = (iHashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        String str = this.f29245c;
        return Boolean.hashCode(this.f29248f) + defpackage.e.a(defpackage.e.e((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f29246d), this.f29247e, 31);
    }

    public final String toString() {
        return "ARAlphabetUiState(isLoading=false, selectedItem=" + this.f29243a + ", selectedPosition=" + this.f29244b + ", error=" + this.f29245c + ", isDownloading=" + this.f29246d + ", downloadProgress=" + this.f29247e + ", isResourceReady=" + this.f29248f + ")";
    }
}
