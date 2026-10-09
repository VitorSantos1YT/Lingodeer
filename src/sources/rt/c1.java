package rt;

import com.lingodeer.data.model.SRSStatus;
import com.lingodeer.data.model.uistate.WordSentenceCharacterType;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SRSStatus f49553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f49554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f49555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WordSentenceCharacterType f49556d;

    public c1(SRSStatus sRSStatus, String unitName, int i11, WordSentenceCharacterType wordSentenceCharacterType) {
        kotlin.jvm.internal.m.f(unitName, "unitName");
        this.f49553a = sRSStatus;
        this.f49554b = unitName;
        this.f49555c = i11;
        this.f49556d = wordSentenceCharacterType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return kotlin.jvm.internal.m.a(this.f49553a, c1Var.f49553a) && kotlin.jvm.internal.m.a(this.f49554b, c1Var.f49554b) && this.f49555c == c1Var.f49555c && kotlin.jvm.internal.m.a(this.f49556d, c1Var.f49556d);
    }

    public final int hashCode() {
        return this.f49556d.hashCode() + defpackage.e.b(this.f49555c, defpackage.e.d(this.f49553a.hashCode() * 31, 31, this.f49554b), 31);
    }

    public final String toString() {
        return "CourseFlashCardFutureReviewItem(srsStatus=" + this.f49553a + ", unitName=" + this.f49554b + ", unitSortIndex=" + this.f49555c + ", contentType=" + this.f49556d + ")";
    }
}
