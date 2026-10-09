package lf;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f40060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f40061b;

    public m0(File file) {
        this.f40060a = file;
        this.f40061b = file.lastModified();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(m0 another) {
        kotlin.jvm.internal.m.f(another, "another");
        long j11 = another.f40061b;
        long j12 = this.f40061b;
        if (j12 < j11) {
            return -1;
        }
        if (j12 > j11) {
            return 1;
        }
        return this.f40060a.compareTo(another.f40060a);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof m0) && compareTo((m0) obj) == 0;
    }

    public final int hashCode() {
        return ((this.f40060a.hashCode() + 1073) * 37) + ((int) (this.f40061b % ((long) Integer.MAX_VALUE)));
    }
}
