package ei;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dn.d f25672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f25673c;

    public /* synthetic */ w(dn.d dVar, Context context, int i11) {
        this.f25671a = i11;
        this.f25672b = dVar;
        this.f25673c = context;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f25671a) {
            case 0:
                return new y(null, this.f25672b.e(this.f25673c));
            case 1:
                return new en.f(null, this.f25672b.e(this.f25673c));
            default:
                return new nq.d(null, this.f25672b.e(this.f25673c));
        }
    }
}
