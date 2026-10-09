package ys;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i1 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.f f58058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f58059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f58060d;

    public /* synthetic */ i1(fz.f fVar, String str, long j11, int i11) {
        this.f58057a = i11;
        this.f58058b = fVar;
        this.f58059c = str;
        this.f58060d = j11;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f58057a) {
            case 0:
                String note = (String) obj;
                kotlin.jvm.internal.m.f(note, "note");
                fz.f fVar = this.f58058b;
                if (fVar != null) {
                    fVar.invoke(this.f58059c, Long.valueOf(this.f58060d), note);
                }
                break;
            default:
                String note2 = (String) obj;
                kotlin.jvm.internal.m.f(note2, "note");
                fz.f fVar2 = this.f58058b;
                if (fVar2 != null) {
                    fVar2.invoke(this.f58059c, Long.valueOf(this.f58060d), note2);
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
