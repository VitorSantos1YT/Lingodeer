package j9;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f36235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f36236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f36237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f36238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f36239e;

    public p(q qVar, Bundle bundle, boolean z11, int i11, boolean z12) {
        this.f36235a = qVar;
        this.f36236b = bundle;
        this.f36237c = z11;
        this.f36238d = i11;
        this.f36239e = z12;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(p other) {
        kotlin.jvm.internal.m.f(other, "other");
        boolean z11 = other.f36239e;
        boolean z12 = other.f36237c;
        Bundle bundle = other.f36236b;
        boolean z13 = this.f36237c;
        if (z13 && !z12) {
            return 1;
        }
        if (!z13 && z12) {
            return -1;
        }
        int i11 = this.f36238d - other.f36238d;
        if (i11 > 0) {
            return 1;
        }
        if (i11 < 0) {
            return -1;
        }
        Bundle bundle2 = this.f36236b;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            int size = bundle2.size();
            kotlin.jvm.internal.m.c(bundle);
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z14 = this.f36239e;
        if (!z14 || z11) {
            return (z14 || !z11) ? 0 : -1;
        }
        return 1;
    }
}
