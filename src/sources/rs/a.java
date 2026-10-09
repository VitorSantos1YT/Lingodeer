package rs;

import java.util.Set;
import kotlin.jvm.internal.m;
import ry.t;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f49394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f49395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f49396c;

    public a(Set wordIds, Set sentenceIds, Set characterIds) {
        m.f(wordIds, "wordIds");
        m.f(sentenceIds, "sentenceIds");
        m.f(characterIds, "characterIds");
        this.f49394a = wordIds;
        this.f49395b = sentenceIds;
        this.f49396c = characterIds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.a(this.f49394a, aVar.f49394a) && m.a(this.f49395b, aVar.f49395b) && m.a(this.f49396c, aVar.f49396c);
    }

    public final int hashCode() {
        return this.f49396c.hashCode() + ((this.f49395b.hashCode() + (this.f49394a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CourseReviewContentIds(wordIds=" + this.f49394a + ", sentenceIds=" + this.f49395b + ", characterIds=" + this.f49396c + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ a(Set set, Set set2, Set set3, int i11) {
        int i12 = i11 & 1;
        t tVar = t.f50856a;
        this(i12 != 0 ? tVar : set, (i11 & 2) != 0 ? tVar : set2, (i11 & 4) != 0 ? tVar : set3);
    }
}
