package vs;

import com.lingodeer.course.smarttips.data.model.TextExampleType;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextExampleType f54171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f54172b;

    public l(TextExampleType textExampleType, int i11) {
        kotlin.jvm.internal.m.f(textExampleType, "textExampleType");
        this.f54171a = textExampleType;
        this.f54172b = i11;
    }

    @Override // vs.m
    public final int a() {
        return this.f54172b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return kotlin.jvm.internal.m.a(this.f54171a, lVar.f54171a) && this.f54172b == lVar.f54172b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f54172b) + (this.f54171a.hashCode() * 31);
    }

    public final String toString() {
        return "TextExample(textExampleType=" + this.f54171a + ", id=" + this.f54172b + ")";
    }
}
