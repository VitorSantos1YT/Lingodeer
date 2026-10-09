package bt;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a4 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ht.o f5150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f5151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ys.d0 f5152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jt.s0 f5153e;

    public /* synthetic */ a4(ht.o oVar, l1.b1 b1Var, ys.d0 d0Var, jt.s0 s0Var, int i11) {
        this.f5149a = i11;
        this.f5150b = oVar;
        this.f5151c = b1Var;
        this.f5152d = d0Var;
        this.f5153e = s0Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5149a) {
            case 0:
                List audioPath = (List) obj;
                ht.l audioPlayingState = (ht.l) obj2;
                kotlin.jvm.internal.m.f(audioPath, "audioPath");
                kotlin.jvm.internal.m.f(audioPlayingState, "audioPlayingState");
                b.x(this.f5150b, this.f5151c, this.f5152d, this.f5153e, audioPath, audioPlayingState);
                break;
            default:
                List audioPath2 = (List) obj;
                ht.l audioPlayingState2 = (ht.l) obj2;
                kotlin.jvm.internal.m.f(audioPath2, "audioPath");
                kotlin.jvm.internal.m.f(audioPlayingState2, "audioPlayingState");
                b.A(this.f5150b, this.f5151c, this.f5152d, this.f5153e, audioPath2, audioPlayingState2);
                break;
        }
        return qy.b0.f48488a;
    }
}
