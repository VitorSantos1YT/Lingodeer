package ot;

import com.lingodeer.data.model.CourseSentence;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CourseSentence f45948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f45949b;

    public q(CourseSentence sentence, List stemWords) {
        kotlin.jvm.internal.m.f(sentence, "sentence");
        kotlin.jvm.internal.m.f(stemWords, "stemWords");
        this.f45948a = sentence;
        this.f45949b = stemWords;
    }

    public static q a(q qVar, CourseSentence sentence) {
        List stemWords = qVar.f45949b;
        kotlin.jvm.internal.m.f(sentence, "sentence");
        kotlin.jvm.internal.m.f(stemWords, "stemWords");
        return new q(sentence, stemWords);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return kotlin.jvm.internal.m.a(this.f45948a, qVar.f45948a) && kotlin.jvm.internal.m.a(this.f45949b, qVar.f45949b);
    }

    public final int hashCode() {
        return this.f45949b.hashCode() + (this.f45948a.hashCode() * 31);
    }

    public final String toString() {
        return "CourseSentenceM7(sentence=" + this.f45948a + ", stemWords=" + this.f45949b + ")";
    }
}
