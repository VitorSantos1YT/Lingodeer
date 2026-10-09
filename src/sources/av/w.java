package av;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class w extends xy.c {
    public /* synthetic */ Object H;
    public final /* synthetic */ y K;
    public int L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public File f3203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f3204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f3205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f3206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a00.a f3207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3208f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f3209t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y yVar, xy.c cVar) {
        super(cVar);
        this.K = yVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.H = obj;
        this.L |= Integer.MIN_VALUE;
        return this.K.c(null, null, null, null, this);
    }
}
