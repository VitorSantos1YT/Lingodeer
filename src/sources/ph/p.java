package ph;

import com.lingo.lingoskill.object.PdLesson;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PdLesson f46903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f46904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f46905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f46906d;

    public p(PdLesson pdLesson, boolean z11, boolean z12, String str) {
        this.f46903a = pdLesson;
        this.f46904b = z11;
        this.f46905c = z12;
        this.f46906d = str;
    }

    public static p a(p pVar, PdLesson pdLesson, boolean z11, String str, int i11) {
        if ((i11 & 1) != 0) {
            pdLesson = pVar.f46903a;
        }
        boolean z12 = (i11 & 2) != 0 ? pVar.f46904b : false;
        if ((i11 & 4) != 0) {
            z11 = pVar.f46905c;
        }
        if ((i11 & 8) != 0) {
            str = pVar.f46906d;
        }
        pVar.getClass();
        return new p(pdLesson, z12, z11, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return kotlin.jvm.internal.m.a(this.f46903a, pVar.f46903a) && this.f46904b == pVar.f46904b && this.f46905c == pVar.f46905c && kotlin.jvm.internal.m.a(this.f46906d, pVar.f46906d);
    }

    public final int hashCode() {
        PdLesson pdLesson = this.f46903a;
        int iE = defpackage.e.e(defpackage.e.e((pdLesson == null ? 0 : pdLesson.hashCode()) * 31, 31, this.f46904b), 31, this.f46905c);
        String str = this.f46906d;
        return iE + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "PdLearnIndexUiState(pdLesson=" + this.f46903a + ", isLoading=" + this.f46904b + ", isFavorited=" + this.f46905c + ", favoriteError=" + this.f46906d + ")";
    }
}
