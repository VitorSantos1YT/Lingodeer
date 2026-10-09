package ys;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h1 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.e f58041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f58042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f58043d;

    public /* synthetic */ h1(fz.e eVar, String str, long j11, int i11) {
        this.f58040a = i11;
        this.f58041b = eVar;
        this.f58042c = str;
        this.f58043d = j11;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f58040a) {
            case 0:
                fz.e eVar = this.f58041b;
                if (eVar != null) {
                    eVar.invoke(this.f58042c, Long.valueOf(this.f58043d));
                }
                break;
            default:
                fz.e eVar2 = this.f58041b;
                if (eVar2 != null) {
                    eVar2.invoke(this.f58042c, Long.valueOf(this.f58043d));
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
