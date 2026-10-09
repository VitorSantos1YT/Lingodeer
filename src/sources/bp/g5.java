package bp;

import com.lingo.lingoskill.ui.base.SplashActivity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g5 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SplashActivity f4606c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g5(SplashActivity splashActivity, vy.d dVar, int i11) {
        super(2, dVar);
        this.f4604a = i11;
        this.f4606c = splashActivity;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f4604a) {
            case 0:
                return new g5(this.f4606c, dVar, 0);
            case 1:
                return new g5(this.f4606c, dVar, 1);
            case 2:
                return new g5(this.f4606c, dVar, 2);
            default:
                return new g5(this.f4606c, dVar, 3);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f4604a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((g5) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        if (r2 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0120, code lost:
    
        if (r5 == r9) goto L61;
     */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, qy.h] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, qy.h] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, qy.h] */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bp.g5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
