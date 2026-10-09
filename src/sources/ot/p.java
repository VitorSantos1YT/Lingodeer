package ot;

import com.lingodeer.data.model.CourseSentence;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CourseSentence f45939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f45940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f45941c;

    public p(CourseSentence sentence, ArrayList arrayList, List list) {
        kotlin.jvm.internal.m.f(sentence, "sentence");
        this.f45939a = sentence;
        this.f45940b = arrayList;
        this.f45941c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return kotlin.jvm.internal.m.a(this.f45939a, pVar.f45939a) && this.f45940b.equals(pVar.f45940b) && this.f45941c.equals(pVar.f45941c);
    }

    public final int hashCode() {
        return this.f45941c.hashCode() + nv.p.b(this.f45940b, this.f45939a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CourseSentenceM6(sentence=");
        sb2.append(this.f45939a);
        sb2.append(", stemWords=");
        sb2.append(this.f45940b);
        sb2.append(", optionWords=");
        return b7.e0.n(sb2, this.f45941c, ")");
    }
}
