package nz;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class t implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f44348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fz.c f44349b;

    public t(l sequence, fz.c transformer) {
        kotlin.jvm.internal.m.f(sequence, "sequence");
        kotlin.jvm.internal.m.f(transformer, "transformer");
        this.f44348a = sequence;
        this.f44349b = transformer;
    }

    @Override // nz.l
    public final Iterator iterator() {
        return new s(this);
    }
}
