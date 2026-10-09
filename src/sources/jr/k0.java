package jr;

import l1.b1;
import mt.l5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class k0 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f36669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f36670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f36671d;

    public k0(int i11, l0.w wVar, rz.b0 b0Var) {
        this.f36668a = 2;
        this.f36669b = b0Var;
        this.f36671d = wVar;
        this.f36670c = i11;
    }

    @Override // fz.a
    public final Object invoke() {
        int i11 = this.f36668a;
        qy.b0 b0Var = qy.b0.f48488a;
        int i12 = this.f36670c;
        Object obj = this.f36671d;
        Object obj2 = this.f36669b;
        switch (i11) {
            case 0:
                if (!((Boolean) ((b1) obj).getValue()).booleanValue()) {
                    ((fz.c) obj2).invoke(Integer.valueOf(i12));
                }
                break;
            case 1:
                ((fz.c) obj2).invoke(Integer.valueOf(i12));
                float f5 = l5.f41627a;
                ((b1) obj).setValue(null);
                break;
            default:
                rz.e0.B((rz.b0) obj2, null, null, new et.b0((l0.w) obj, i12, (vy.d) null, 1), 3);
                break;
        }
        return b0Var;
    }

    public /* synthetic */ k0(fz.c cVar, int i11, b1 b1Var, int i12) {
        this.f36668a = i12;
        this.f36669b = cVar;
        this.f36670c = i11;
        this.f36671d = b1Var;
    }
}
