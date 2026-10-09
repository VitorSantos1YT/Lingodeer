package cu;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public File f22508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public File f22509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f22510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f22511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f22512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f22513f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f22514t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, xy.c cVar) {
        super(cVar);
        this.f22513f = gVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f22512e = obj;
        this.f22514t |= Integer.MIN_VALUE;
        return g.b(this.f22513f, null, null, null, false, this);
    }
}
