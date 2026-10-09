package ot;

import com.lingodeer.data.model.CourseWord;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CourseWord f46042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f46043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f46044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f46045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f46046e;

    public x1(CourseWord word, List stemWords, List optionWords, List zhuyinStemWords, List zhuyinOptionWords) {
        kotlin.jvm.internal.m.f(word, "word");
        kotlin.jvm.internal.m.f(stemWords, "stemWords");
        kotlin.jvm.internal.m.f(optionWords, "optionWords");
        kotlin.jvm.internal.m.f(zhuyinStemWords, "zhuyinStemWords");
        kotlin.jvm.internal.m.f(zhuyinOptionWords, "zhuyinOptionWords");
        this.f46042a = word;
        this.f46043b = stemWords;
        this.f46044c = optionWords;
        this.f46045d = zhuyinStemWords;
        this.f46046e = zhuyinOptionWords;
    }

    public static x1 a(x1 x1Var, CourseWord word) {
        List stemWords = x1Var.f46043b;
        List optionWords = x1Var.f46044c;
        List zhuyinStemWords = x1Var.f46045d;
        List zhuyinOptionWords = x1Var.f46046e;
        kotlin.jvm.internal.m.f(word, "word");
        kotlin.jvm.internal.m.f(stemWords, "stemWords");
        kotlin.jvm.internal.m.f(optionWords, "optionWords");
        kotlin.jvm.internal.m.f(zhuyinStemWords, "zhuyinStemWords");
        kotlin.jvm.internal.m.f(zhuyinOptionWords, "zhuyinOptionWords");
        return new x1(word, stemWords, optionWords, zhuyinStemWords, zhuyinOptionWords);
    }

    public final List b() {
        return this.f46044c;
    }

    public final CourseWord c() {
        return this.f46042a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj;
        return kotlin.jvm.internal.m.a(this.f46042a, x1Var.f46042a) && kotlin.jvm.internal.m.a(this.f46043b, x1Var.f46043b) && kotlin.jvm.internal.m.a(this.f46044c, x1Var.f46044c) && kotlin.jvm.internal.m.a(this.f46045d, x1Var.f46045d) && kotlin.jvm.internal.m.a(this.f46046e, x1Var.f46046e);
    }

    public final int hashCode() {
        return this.f46046e.hashCode() + hh.p0.b(hh.p0.b(hh.p0.b(this.f46042a.hashCode() * 31, 31, this.f46043b), 31, this.f46044c), 31, this.f46045d);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CourseWordM5(word=");
        sb2.append(this.f46042a);
        sb2.append(", stemWords=");
        sb2.append(this.f46043b);
        sb2.append(", optionWords=");
        sb2.append(this.f46044c);
        sb2.append(", zhuyinStemWords=");
        sb2.append(this.f46045d);
        sb2.append(", zhuyinOptionWords=");
        return b7.e0.n(sb2, this.f46046e, ")");
    }
}
