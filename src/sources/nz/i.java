package nz;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f44324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f44325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fz.c f44326c;

    public i(l lVar, boolean z11, fz.c predicate) {
        kotlin.jvm.internal.m.f(predicate, "predicate");
        this.f44324a = lVar;
        this.f44325b = z11;
        this.f44326c = predicate;
    }

    @Override // nz.l
    public final Iterator iterator() {
        return new g(this);
    }
}
