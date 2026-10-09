package dt;

import java.util.ArrayList;
import mt.l5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24020a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f24021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f24022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f24023d;

    public /* synthetic */ n(int i11, ArrayList arrayList, boolean z11) {
        this.f24023d = arrayList;
        this.f24021b = z11;
        this.f24022c = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f24020a) {
            case 0:
                ((Integer) obj2).getClass();
                int iM = l1.t.M(1);
                a0.q((String) this.f24023d, this.f24021b, (l1.n) obj, iM, this.f24022c);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iM2 = l1.t.M(this.f24022c | 1);
                iv.z0.j((ArrayList) this.f24023d, this.f24021b, (l1.n) obj, iM2);
                break;
            default:
                z1.r rVar = (z1.r) this.f24023d;
                ((Integer) obj2).getClass();
                l5.i(l1.t.M(this.f24022c | 1), (l1.n) obj, rVar, this.f24021b);
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ n(int i11, z1.r rVar, boolean z11) {
        this.f24021b = z11;
        this.f24023d = rVar;
        this.f24022c = i11;
    }

    public /* synthetic */ n(int i11, boolean z11, int i12, String str) {
        this.f24023d = str;
        this.f24021b = z11;
        this.f24022c = i12;
    }
}
