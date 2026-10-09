package vs;

import com.lingodeer.course.smarttips.data.model.ImageExampleType;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageExampleType f54164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f54165b;

    public i(ImageExampleType imageExampleType, int i11) {
        kotlin.jvm.internal.m.f(imageExampleType, "imageExampleType");
        this.f54164a = imageExampleType;
        this.f54165b = i11;
    }

    @Override // vs.m
    public final int a() {
        return this.f54165b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return kotlin.jvm.internal.m.a(this.f54164a, iVar.f54164a) && this.f54165b == iVar.f54165b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f54165b) + (this.f54164a.hashCode() * 31);
    }

    public final String toString() {
        return "ImageExample(imageExampleType=" + this.f54164a + ", id=" + this.f54165b + ")";
    }
}
