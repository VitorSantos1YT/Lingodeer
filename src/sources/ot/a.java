package ot;

import com.lingodeer.data.model.CourseSentence;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CourseSentence f45734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f45735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f45736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f45737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f45738e;

    public a(CourseSentence sentence, List list, List list2, ArrayList arrayList, List list3) {
        kotlin.jvm.internal.m.f(sentence, "sentence");
        this.f45734a = sentence;
        this.f45735b = list;
        this.f45736c = list2;
        this.f45737d = arrayList;
        this.f45738e = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.m.a(this.f45734a, aVar.f45734a) && this.f45735b.equals(aVar.f45735b) && this.f45736c.equals(aVar.f45736c) && this.f45737d.equals(aVar.f45737d) && this.f45738e.equals(aVar.f45738e);
    }

    public final int hashCode() {
        return this.f45738e.hashCode() + nv.p.b(this.f45737d, hh.p0.b(hh.p0.b(this.f45734a.hashCode() * 31, 31, this.f45735b), 31, this.f45736c), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChineseToneM4(sentence=");
        sb2.append(this.f45734a);
        sb2.append(", shengMuOptions=");
        sb2.append(this.f45735b);
        sb2.append(", yunMuOptions=");
        sb2.append(this.f45736c);
        sb2.append(", toneOptions=");
        sb2.append(this.f45737d);
        sb2.append(", answerWords=");
        return b7.e0.n(sb2, this.f45738e, ")");
    }
}
