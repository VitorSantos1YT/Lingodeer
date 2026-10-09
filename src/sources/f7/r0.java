package f7;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0 f26902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Pair f26903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p7.s f26904d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p7.x f26905e;

    public /* synthetic */ r0(u0 u0Var, Pair pair, p7.s sVar, p7.x xVar, int i11) {
        this.f26901a = i11;
        this.f26902b = u0Var;
        this.f26903c = pair;
        this.f26904d = sVar;
        this.f26905e = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26901a) {
            case 0:
                g7.f fVar = this.f26902b.f26923b.f26943h;
                Pair pair = this.f26903c;
                fVar.c(((Integer) pair.first).intValue(), (p7.b0) pair.second, this.f26904d, this.f26905e);
                break;
            default:
                g7.f fVar2 = this.f26902b.f26923b.f26943h;
                Pair pair2 = this.f26903c;
                fVar2.o(((Integer) pair2.first).intValue(), (p7.b0) pair2.second, this.f26904d, this.f26905e);
                break;
        }
    }
}
