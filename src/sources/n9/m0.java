package n9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f43640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f43641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fr.u f43642c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(fr.u uVar, vy.d dVar) {
        super(dVar);
        this.f43642c = uVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f43640a = obj;
        this.f43641b |= Integer.MIN_VALUE;
        return this.f43642c.emit(null, this);
    }
}
