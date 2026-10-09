package ot;

import com.lingodeer.data.model.CourseSentence;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CourseSentence f45907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f45908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f45909c;

    public n(CourseSentence sentence, List optionWords, List answerWords) {
        kotlin.jvm.internal.m.f(sentence, "sentence");
        kotlin.jvm.internal.m.f(optionWords, "optionWords");
        kotlin.jvm.internal.m.f(answerWords, "answerWords");
        this.f45907a = sentence;
        this.f45908b = optionWords;
        this.f45909c = answerWords;
    }

    public static n a(n nVar, ArrayList arrayList) {
        CourseSentence sentence = nVar.f45907a;
        List answerWords = nVar.f45909c;
        kotlin.jvm.internal.m.f(sentence, "sentence");
        kotlin.jvm.internal.m.f(answerWords, "answerWords");
        return new n(sentence, arrayList, answerWords);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return kotlin.jvm.internal.m.a(this.f45907a, nVar.f45907a) && kotlin.jvm.internal.m.a(this.f45908b, nVar.f45908b) && kotlin.jvm.internal.m.a(this.f45909c, nVar.f45909c);
    }

    public final int hashCode() {
        return this.f45909c.hashCode() + hh.p0.b(this.f45907a.hashCode() * 31, 31, this.f45908b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CourseSentenceM5(sentence=");
        sb2.append(this.f45907a);
        sb2.append(", optionWords=");
        sb2.append(this.f45908b);
        sb2.append(", answerWords=");
        return b7.e0.n(sb2, this.f45909c, ")");
    }
}
