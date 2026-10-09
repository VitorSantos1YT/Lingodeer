package ca;

import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6785d;

    public h(String from, int i11, int i12, String to2) {
        m.f(from, "from");
        m.f(to2, "to");
        this.f6782a = i11;
        this.f6783b = i12;
        this.f6784c = from;
        this.f6785d = to2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        h other = (h) obj;
        m.f(other, "other");
        int i11 = this.f6782a - other.f6782a;
        return i11 == 0 ? this.f6783b - other.f6783b : i11;
    }
}
