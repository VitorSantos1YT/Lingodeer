package rt;

import androidx.drawerlayout.widget.ktFt.FpIL;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class pf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f50254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f50255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f50256c;

    public pf(Set learningCardIds, Set reviewedCardIds, Set hiddenOriginalCardIds) {
        kotlin.jvm.internal.m.f(learningCardIds, "learningCardIds");
        kotlin.jvm.internal.m.f(reviewedCardIds, "reviewedCardIds");
        kotlin.jvm.internal.m.f(hiddenOriginalCardIds, "hiddenOriginalCardIds");
        this.f50254a = learningCardIds;
        this.f50255b = reviewedCardIds;
        this.f50256c = hiddenOriginalCardIds;
    }

    public static pf a(pf pfVar, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, LinkedHashSet linkedHashSet3, int i11) {
        Set learningCardIds = linkedHashSet;
        if ((i11 & 1) != 0) {
            learningCardIds = pfVar.f50254a;
        }
        Set reviewedCardIds = linkedHashSet2;
        if ((i11 & 2) != 0) {
            reviewedCardIds = pfVar.f50255b;
        }
        Set hiddenOriginalCardIds = linkedHashSet3;
        if ((i11 & 4) != 0) {
            hiddenOriginalCardIds = pfVar.f50256c;
        }
        kotlin.jvm.internal.m.f(learningCardIds, "learningCardIds");
        kotlin.jvm.internal.m.f(reviewedCardIds, "reviewedCardIds");
        kotlin.jvm.internal.m.f(hiddenOriginalCardIds, "hiddenOriginalCardIds");
        return new pf(learningCardIds, reviewedCardIds, hiddenOriginalCardIds);
    }

    public final String b() {
        return this.f50254a.size() + ";" + this.f50255b.size();
    }

    public final pf c(String cardId) {
        kotlin.jvm.internal.m.f(cardId, "cardId");
        Set set = this.f50254a;
        return (set.contains(cardId) || this.f50255b.contains(cardId) || this.f50256c.contains(cardId)) ? this : a(this, qx.b.E(set, cardId), null, null, 6);
    }

    public final pf d(String cardId) {
        kotlin.jvm.internal.m.f(cardId, "cardId");
        return this.f50256c.contains(cardId) ? this : a(this, qx.b.y(this.f50254a, cardId), qx.b.E(this.f50255b, cardId), null, 4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pf)) {
            return false;
        }
        pf pfVar = (pf) obj;
        return kotlin.jvm.internal.m.a(this.f50254a, pfVar.f50254a) && kotlin.jvm.internal.m.a(this.f50255b, pfVar.f50255b) && kotlin.jvm.internal.m.a(this.f50256c, pfVar.f50256c);
    }

    public final int hashCode() {
        return this.f50256c.hashCode() + ((this.f50255b.hashCode() + (this.f50254a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ReviewSessionProgress(learningCardIds=" + this.f50254a + ", reviewedCardIds=" + this.f50255b + FpIL.ucuan + this.f50256c + ")";
    }
}
