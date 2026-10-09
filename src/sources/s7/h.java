package s7;

import com.google.common.collect.ComparisonChain;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f51421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f51422b;

    public h(y6.p pVar, int i11) {
        this.f51421a = (pVar.f57283e & 1) != 0;
        this.f51422b = f7.e.n(i11, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        h hVar = (h) obj;
        return ComparisonChain.f16669a.d(this.f51422b, hVar.f51422b).d(this.f51421a, hVar.f51421a).f();
    }
}
