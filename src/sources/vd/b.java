package vd;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends WeakReference {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final td.g f53845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f53846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b0 f53847c;

    public b(td.g gVar, w wVar, ReferenceQueue referenceQueue) {
        super(wVar, referenceQueue);
        pe.f.c(gVar, "Argument must not be null");
        this.f53845a = gVar;
        boolean z11 = wVar.f53956a;
        this.f53847c = null;
        this.f53846b = z11;
    }
}
