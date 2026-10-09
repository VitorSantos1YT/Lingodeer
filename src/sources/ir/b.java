package ir;

import com.lingodeer.data.model.CourseSentence;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CourseSentence f34557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f34558b;

    public b(CourseSentence sentence, a aVar) {
        m.f(sentence, "sentence");
        this.f34557a = sentence;
        this.f34558b = aVar;
    }

    public static b a(b bVar, CourseSentence sentence) {
        a aVar = bVar.f34558b;
        m.f(sentence, "sentence");
        return new b(sentence, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return m.a(this.f34557a, bVar.f34557a) && m.a(this.f34558b, bVar.f34558b);
    }

    public final int hashCode() {
        int iHashCode = this.f34557a.hashCode() * 31;
        a aVar = this.f34558b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return "StorySentence(sentence=" + this.f34557a + ", question=" + this.f34558b + ")";
    }
}
