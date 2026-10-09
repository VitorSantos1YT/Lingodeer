package rt;

import com.lingodeer.data.model.SRSStatus;
import com.lingodeer.data.model.uistate.WordSentenceCharacterType;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f49970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f49971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SRSStatus f49972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WordSentenceCharacterType f49973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f49974e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f49975f;

    public k6(boolean z11, boolean z12, SRSStatus sRSStatus, WordSentenceCharacterType wordSentenceCharacterType, boolean z13, String str) {
        this.f49970a = z11;
        this.f49971b = z12;
        this.f49972c = sRSStatus;
        this.f49973d = wordSentenceCharacterType;
        this.f49974e = z13;
        this.f49975f = str;
    }

    public static k6 a(k6 k6Var, boolean z11, boolean z12, SRSStatus sRSStatus, boolean z13, String str, int i11) {
        if ((i11 & 1) != 0) {
            z11 = k6Var.f49970a;
        }
        boolean z14 = z11;
        if ((i11 & 2) != 0) {
            z12 = k6Var.f49971b;
        }
        boolean z15 = z12;
        if ((i11 & 4) != 0) {
            sRSStatus = k6Var.f49972c;
        }
        SRSStatus srsStatus = sRSStatus;
        WordSentenceCharacterType wordSentenceCharacterType = k6Var.f49973d;
        if ((i11 & 16) != 0) {
            z13 = k6Var.f49974e;
        }
        boolean z16 = z13;
        if ((i11 & 32) != 0) {
            str = k6Var.f49975f;
        }
        kotlin.jvm.internal.m.f(srsStatus, "srsStatus");
        return new k6(z14, z15, srsStatus, wordSentenceCharacterType, z16, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k6)) {
            return false;
        }
        k6 k6Var = (k6) obj;
        return this.f49970a == k6Var.f49970a && this.f49971b == k6Var.f49971b && kotlin.jvm.internal.m.a(this.f49972c, k6Var.f49972c) && kotlin.jvm.internal.m.a(this.f49973d, k6Var.f49973d) && this.f49974e == k6Var.f49974e && kotlin.jvm.internal.m.a(this.f49975f, k6Var.f49975f);
    }

    public final int hashCode() {
        return this.f49975f.hashCode() + defpackage.e.e((this.f49973d.hashCode() + ((this.f49972c.hashCode() + defpackage.e.e(Boolean.hashCode(this.f49970a) * 31, 31, this.f49971b)) * 31)) * 31, 31, this.f49974e);
    }

    public final String toString() {
        return "CourseReviewContent(checked=" + this.f49970a + ", enable=" + this.f49971b + ", srsStatus=" + this.f49972c + ", contentType=" + this.f49973d + ", isFavorite=" + this.f49974e + ", note=" + this.f49975f + ")";
    }
}
