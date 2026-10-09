package n5;

import java.io.FileOutputStream;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FileOutputStream f43261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FileOutputStream f43262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f43263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e0 f43264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f43265e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e0 e0Var, xy.c cVar) {
        super(cVar);
        this.f43264d = e0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f43263c = obj;
        this.f43265e |= Integer.MIN_VALUE;
        return this.f43264d.b(null, this);
    }
}
