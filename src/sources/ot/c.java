package ot;

import com.lingodeer.data.model.CourseSentence;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CourseSentence f45761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f45762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f45763c;

    public c(CourseSentence sentence, List list, List list2) {
        kotlin.jvm.internal.m.f(sentence, "sentence");
        this.f45761a = sentence;
        this.f45762b = list;
        this.f45763c = list2;
    }

    public static c a(c cVar, ArrayList arrayList, ArrayList arrayList2, int i11) {
        CourseSentence sentence = cVar.f45761a;
        List list = arrayList;
        if ((i11 & 2) != 0) {
            list = cVar.f45762b;
        }
        kotlin.jvm.internal.m.f(sentence, "sentence");
        return new c(sentence, list, arrayList2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.m.a(this.f45761a, cVar.f45761a) && kotlin.jvm.internal.m.a(this.f45762b, cVar.f45762b) && kotlin.jvm.internal.m.a(this.f45763c, cVar.f45763c);
    }

    public final int hashCode() {
        return this.f45763c.hashCode() + hh.p0.b(this.f45761a.hashCode() * 31, 31, this.f45762b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CourseSentenceM10(sentence=");
        sb2.append(this.f45761a);
        sb2.append(", stemWords=");
        sb2.append(this.f45762b);
        sb2.append(", optionWords=");
        return b7.e0.n(sb2, this.f45763c, ")");
    }
}
