package nz;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f44327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fz.c f44328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fz.c f44329c;

    public j(l sequence, fz.c transformer, fz.c cVar) {
        kotlin.jvm.internal.m.f(sequence, "sequence");
        kotlin.jvm.internal.m.f(transformer, "transformer");
        this.f44327a = sequence;
        this.f44328b = transformer;
        this.f44329c = cVar;
    }

    @Override // nz.l
    public final Iterator iterator() {
        return new g(this);
    }
}
