package ot;

import com.lingodeer.data.model.CourseSentence;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CourseSentence f45802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f45803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f45804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f45805d;

    public f(CourseSentence courseSentence, List list, List list2, List list3) {
        this.f45802a = courseSentence;
        this.f45803b = list;
        this.f45804c = list2;
        this.f45805d = list3;
    }

    public static f a(f fVar, ArrayList arrayList, ArrayList arrayList2, int i11) {
        CourseSentence courseSentence = fVar.f45802a;
        List list = arrayList;
        if ((i11 & 2) != 0) {
            list = fVar.f45803b;
        }
        return new f(courseSentence, list, arrayList2, fVar.f45805d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.m.a(this.f45802a, fVar.f45802a) && kotlin.jvm.internal.m.a(this.f45803b, fVar.f45803b) && kotlin.jvm.internal.m.a(this.f45804c, fVar.f45804c) && kotlin.jvm.internal.m.a(this.f45805d, fVar.f45805d);
    }

    public final int hashCode() {
        return this.f45805d.hashCode() + hh.p0.b(hh.p0.b(this.f45802a.hashCode() * 31, 31, this.f45803b), 31, this.f45804c);
    }

    public final String toString() {
        return "CourseSentenceM13(sentence=" + this.f45802a + ", stemWords=" + this.f45803b + ", optionWords=" + this.f45804c + ", answerWords=" + this.f45805d + ")";
    }
}
