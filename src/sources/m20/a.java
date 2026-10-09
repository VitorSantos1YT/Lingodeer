package m20;

import defpackage.e;
import hh.p0;
import l20.c;
import l20.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f40828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f40830c;

    public a(c cVar, int i11, int i12) {
        this.f40828a = cVar;
        this.f40829b = i11;
        this.f40830c = i12;
    }

    @Override // l20.d
    public final int getBeginIndex() {
        return this.f40829b;
    }

    @Override // l20.d
    public final int getEndIndex() {
        return this.f40830c;
    }

    public final String toString() {
        return p0.i(this.f40830c, "}", e.q(this.f40829b, "Link{type=", String.valueOf(this.f40828a), ", beginIndex=", ", endIndex="));
    }
}
