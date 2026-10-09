package qp;

import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k4 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48018a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f48019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n4 f48020c;

    public /* synthetic */ k4(TextView textView, n4 n4Var) {
        this.f48019b = textView;
        this.f48020c = n4Var;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f48018a) {
            case 0:
                this.f48020c.z(this.f48019b);
                break;
            default:
                v10.c.F(this.f48019b, (int) ff.h.x(this.f48020c.f47883c, 20), 0);
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ k4(n4 n4Var, TextView textView) {
        this.f48020c = n4Var;
        this.f48019b = textView;
    }
}
