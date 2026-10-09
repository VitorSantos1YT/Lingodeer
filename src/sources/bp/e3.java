package bp;

import com.lingo.lingoskill.ui.base.MainActivity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e3 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MainActivity f4554c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e3(MainActivity mainActivity, vy.d dVar, int i11) {
        super(2, dVar);
        this.f4552a = i11;
        this.f4554c = mainActivity;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f4552a) {
            case 0:
                return new e3(this.f4554c, dVar, 0);
            case 1:
                return new e3(this.f4554c, dVar, 1);
            case 2:
                return new e3(this.f4554c, dVar, 2);
            case 3:
                return new e3(this.f4554c, dVar, 3);
            case 4:
                return new e3(this.f4554c, dVar, 4);
            default:
                return new e3(this.f4554c, dVar, 5);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f4552a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return ((e3) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0156  */
    /* JADX WARN: Code duplicated, block: B:71:0x016f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0185  */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x013f, code lost:
    
        if (r3 == r1) goto L75;
     */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object, qy.h] */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bp.e3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
