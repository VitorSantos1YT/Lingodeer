package ot;

import com.lingodeer.data.model.CourseSentence;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CourseSentence f45878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f45879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f45880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f45881d;

    public l(CourseSentence sentence, List answerWords, List list, List list2) {
        kotlin.jvm.internal.m.f(sentence, "sentence");
        kotlin.jvm.internal.m.f(answerWords, "answerWords");
        this.f45878a = sentence;
        this.f45879b = answerWords;
        this.f45880c = list;
        this.f45881d = list2;
    }

    public static l a(l lVar, ArrayList arrayList, ArrayList arrayList2, int i11) {
        CourseSentence sentence = lVar.f45878a;
        List answerWords = lVar.f45879b;
        List list = arrayList;
        if ((i11 & 4) != 0) {
            list = lVar.f45880c;
        }
        kotlin.jvm.internal.m.f(sentence, "sentence");
        kotlin.jvm.internal.m.f(answerWords, "answerWords");
        return new l(sentence, answerWords, list, arrayList2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return kotlin.jvm.internal.m.a(this.f45878a, lVar.f45878a) && kotlin.jvm.internal.m.a(this.f45879b, lVar.f45879b) && kotlin.jvm.internal.m.a(this.f45880c, lVar.f45880c) && kotlin.jvm.internal.m.a(this.f45881d, lVar.f45881d);
    }

    public final int hashCode() {
        return this.f45881d.hashCode() + hh.p0.b(hh.p0.b(this.f45878a.hashCode() * 31, 31, this.f45879b), 31, this.f45880c);
    }

    public final String toString() {
        return "CourseSentenceM3(sentence=" + this.f45878a + ", answerWords=" + this.f45879b + ", stemWords=" + this.f45880c + ", optionWords=" + this.f45881d + ")";
    }
}
