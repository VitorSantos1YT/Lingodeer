package rs;

import java.util.Map;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f49401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f49402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f49403c;

    public e(Map wordsById, Map sentencesById, Map charactersById) {
        m.f(wordsById, "wordsById");
        m.f(sentencesById, "sentencesById");
        m.f(charactersById, "charactersById");
        this.f49401a = wordsById;
        this.f49402b = sentencesById;
        this.f49403c = charactersById;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return m.a(this.f49401a, eVar.f49401a) && m.a(this.f49402b, eVar.f49402b) && m.a(this.f49403c, eVar.f49403c);
    }

    public final int hashCode() {
        return this.f49403c.hashCode() + ((this.f49402b.hashCode() + (this.f49401a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CourseReviewSessionContent(wordsById=" + this.f49401a + ", sentencesById=" + this.f49402b + ", charactersById=" + this.f49403c + ")";
    }
}
