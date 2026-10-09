package rt;

import com.lingodeer.data.model.SRSStatus;
import com.lingodeer.data.model.uistate.WordSentenceCharacterType;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SRSStatus f50109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WordSentenceCharacterType f50110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f50111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f50112e;

    public n0(String unitName, SRSStatus srsStatus, WordSentenceCharacterType wordSentenceCharacterType, int i11, boolean z11) {
        kotlin.jvm.internal.m.f(unitName, "unitName");
        kotlin.jvm.internal.m.f(srsStatus, "srsStatus");
        this.f50108a = unitName;
        this.f50109b = srsStatus;
        this.f50110c = wordSentenceCharacterType;
        this.f50111d = i11;
        this.f50112e = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return kotlin.jvm.internal.m.a(this.f50108a, n0Var.f50108a) && kotlin.jvm.internal.m.a(this.f50109b, n0Var.f50109b) && kotlin.jvm.internal.m.a(this.f50110c, n0Var.f50110c) && this.f50111d == n0Var.f50111d && this.f50112e == n0Var.f50112e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f50112e) + defpackage.e.b(this.f50111d, (this.f50110c.hashCode() + ((this.f50109b.hashCode() + (this.f50108a.hashCode() * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CourseFlashCardContent(unitName=");
        sb2.append(this.f50108a);
        sb2.append(", srsStatus=");
        sb2.append(this.f50109b);
        sb2.append(", contentType=");
        sb2.append(this.f50110c);
        sb2.append(", unitSortIndex=");
        sb2.append(this.f50111d);
        sb2.append(", canAccessKCard=");
        return hh.p0.p(sb2, this.f50112e, ")");
    }
}
