package cu;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class q extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public File f22553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f22554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f22555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w9.s f22556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f22557e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t f22558f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f22559t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(t tVar, xy.c cVar) {
        super(cVar);
        this.f22558f = tVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f22557e = obj;
        this.f22559t |= Integer.MIN_VALUE;
        return this.f22558f.h(null, null, null, this);
    }
}
