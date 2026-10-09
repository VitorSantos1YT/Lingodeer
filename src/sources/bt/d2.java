package bt;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d2 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ys.d0 f5307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jt.m1 f5308c;

    public /* synthetic */ d2(ys.d0 d0Var, jt.m1 m1Var, int i11) {
        this.f5306a = i11;
        this.f5307b = d0Var;
        this.f5308c = m1Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5306a) {
            case 0:
                List audioPath = (List) obj;
                ht.l audioPlayingState = (ht.l) obj2;
                kotlin.jvm.internal.m.f(audioPath, "audioPath");
                kotlin.jvm.internal.m.f(audioPlayingState, "audioPlayingState");
                ys.d0 d0Var = this.f5307b;
                if (d0Var != null) {
                    jh.h.m(d0Var, audioPath, audioPlayingState, new e2(this.f5308c, 0));
                }
                break;
            case 1:
                String audioPath2 = (String) obj;
                ht.l audioPlayingState2 = (ht.l) obj2;
                kotlin.jvm.internal.m.f(audioPath2, "audioPath");
                kotlin.jvm.internal.m.f(audioPlayingState2, "audioPlayingState");
                ys.d0 d0Var2 = this.f5307b;
                if (d0Var2 != null) {
                    jh.h.m(d0Var2, ns.o.K(audioPath2), audioPlayingState2, new e2(this.f5308c, 1));
                }
                break;
            default:
                String audioPath3 = (String) obj;
                ht.l audioPlayingState3 = (ht.l) obj2;
                kotlin.jvm.internal.m.f(audioPath3, "audioPath");
                kotlin.jvm.internal.m.f(audioPlayingState3, "audioPlayingState");
                ys.d0 d0Var3 = this.f5307b;
                if (d0Var3 != null) {
                    jh.h.m(d0Var3, ns.o.K(audioPath3), audioPlayingState3, new e2(this.f5308c, 3));
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
