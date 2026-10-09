package ot;

import com.lingodeer.data.model.CourseSentence;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CourseSentence f45858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f45859b;

    public j(CourseSentence sentence, List list) {
        kotlin.jvm.internal.m.f(sentence, "sentence");
        this.f45858a = sentence;
        this.f45859b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.m.a(this.f45858a, jVar.f45858a) && kotlin.jvm.internal.m.a(this.f45859b, jVar.f45859b);
    }

    public final int hashCode() {
        return this.f45859b.hashCode() + (this.f45858a.hashCode() * 31);
    }

    public final String toString() {
        return "CourseSentenceM2(sentence=" + this.f45858a + ", stemWords=" + this.f45859b + ")";
    }
}
