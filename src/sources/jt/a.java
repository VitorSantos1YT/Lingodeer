package jt;

import com.lingodeer.data.model.CourseWord;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CourseWord f36860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f36861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f36862c;

    public a(CourseWord word, int i11, int i12) {
        kotlin.jvm.internal.m.f(word, "word");
        this.f36860a = word;
        this.f36861b = i11;
        this.f36862c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.m.a(this.f36860a, aVar.f36860a) && this.f36861b == aVar.f36861b && this.f36862c == aVar.f36862c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f36862c) + defpackage.e.b(this.f36861b, this.f36860a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ClickedWordInfo(word=");
        sb2.append(this.f36860a);
        sb2.append(", targetStemIndex=");
        sb2.append(this.f36861b);
        sb2.append(", targetCharIndex=");
        return hh.p0.i(this.f36862c, ")", sb2);
    }
}
