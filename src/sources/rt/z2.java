package rt;

import android.content.Context;
import com.lingodeer.data.model.SRSStatus;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class z2 extends xy.i implements fz.e {
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f50747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f50748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f50749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f50750e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f50751f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f50752t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(Context context, String str, String str2, vy.d dVar) {
        super(2, dVar);
        this.f50746a = 2;
        this.H = context;
        this.f50750e = str;
        this.K = str2;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f50746a) {
            case 0:
                return new z2((SRSStatus) this.f50752t, (e3) this.H, (wt.c0) this.f50750e, this.f50751f, (ot.j1) this.K, dVar, 0);
            case 1:
                return new z2((b4) this.f50752t, (n0) this.H, (wt.c0) this.f50750e, this.f50751f, (nf) this.K, dVar, 1);
            default:
                z2 z2Var = new z2((Context) this.H, (String) this.f50750e, (String) this.K, dVar);
                z2Var.f50752t = obj;
                return z2Var;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f50746a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((z2) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:125:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:127:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:131:0x03e1 A[LOOP:7: B:131:0x03e1->B:160:?, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:134:0x040f  */
    /* JADX WARN: Code duplicated, block: B:139:0x042a  */
    /* JADX WARN: Code duplicated, block: B:63:0x017b A[LOOP:0: B:63:0x017b->B:146:?, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:66:0x018e  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0081, code lost:
    
        if (ks.b.h(r5, (android.graphics.Bitmap) r3, r4, r75) == r0) goto L25;
     */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r76) {
        /*
            Method dump skipped, instruction units count: 1144
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rt.z2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z2(Object obj, Object obj2, wt.c0 c0Var, String str, Object obj3, vy.d dVar, int i11) {
        super(2, dVar);
        this.f50746a = i11;
        this.f50752t = obj;
        this.H = obj2;
        this.f50750e = c0Var;
        this.f50751f = str;
        this.K = obj3;
    }
}
