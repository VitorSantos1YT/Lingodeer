package gr;

import l1.a1;
import l1.h1;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a1 f29701b;

    public /* synthetic */ j(a1 a1Var, int i11) {
        this.f29700a = i11;
        this.f29701b = a1Var;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f29700a) {
            case 0:
                return Boolean.valueOf(((h1) this.f29701b).l() < 0);
            case 1:
                ((h1) this.f29701b).m(0);
                break;
            case 2:
                ((h1) this.f29701b).m(1);
                break;
            case 3:
                ((h1) this.f29701b).m(0);
                break;
            case 4:
                ((h1) this.f29701b).m(0);
                break;
            case 5:
                ((h1) this.f29701b).m(20);
                break;
            case 6:
                ((h1) this.f29701b).m(30);
                break;
            case 7:
                ((h1) this.f29701b).m(40);
                break;
            case 8:
                ((h1) this.f29701b).m(50);
                break;
            case 9:
                ((h1) this.f29701b).m(20);
                break;
            case 10:
                ((h1) this.f29701b).m(40);
                break;
            case 11:
                ((h1) this.f29701b).m(60);
                break;
            case 12:
                ((h1) this.f29701b).m(100);
                break;
            default:
                return Boolean.valueOf(((h1) this.f29701b).l() < 0);
        }
        return b0.f48488a;
    }
}
