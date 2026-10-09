package l3;

import android.text.SegmentFinder;
import ob.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends SegmentFinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f39711a;

    public a(l lVar) {
        this.f39711a = lVar;
    }

    public final int nextEndBoundary(int i11) {
        return this.f39711a.q(i11);
    }

    public final int nextStartBoundary(int i11) {
        return this.f39711a.i(i11);
    }

    public final int previousEndBoundary(int i11) {
        return this.f39711a.l(i11);
    }

    public final int previousStartBoundary(int i11) {
        return this.f39711a.p(i11);
    }
}
