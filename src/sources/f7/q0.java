package f7;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0 f26897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Pair f26898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p7.x f26899d;

    public /* synthetic */ q0(u0 u0Var, Pair pair, p7.x xVar, int i11) {
        this.f26896a = i11;
        this.f26897b = u0Var;
        this.f26898c = pair;
        this.f26899d = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26896a) {
            case 0:
                g7.f fVar = this.f26897b.f26923b.f26943h;
                Pair pair = this.f26898c;
                int iIntValue = ((Integer) pair.first).intValue();
                p7.b0 b0Var = (p7.b0) pair.second;
                b0Var.getClass();
                fVar.m(iIntValue, b0Var, this.f26899d);
                break;
            default:
                g7.f fVar2 = this.f26897b.f26923b.f26943h;
                Pair pair2 = this.f26898c;
                fVar2.F(((Integer) pair2.first).intValue(), (p7.b0) pair2.second, this.f26899d);
                break;
        }
    }
}
