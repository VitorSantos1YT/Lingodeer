package f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends x {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f26142d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f26143e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(j9.v vVar) {
        super(false);
        this.f26143e = vVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [fz.c, kotlin.jvm.internal.n] */
    @Override // f.x
    public final void b() {
        switch (this.f26142d) {
            case 0:
                ((kotlin.jvm.internal.n) this.f26143e).invoke(this);
                break;
            default:
                ((j9.v) this.f26143e).c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e0(fz.c cVar) {
        super(true);
        this.f26143e = (kotlin.jvm.internal.n) cVar;
    }
}
