package bp;

import com.lingo.lingoskill.ui.base.LoginActivity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e2 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LoginActivity f4551c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e2(LoginActivity loginActivity, vy.d dVar, int i11) {
        super(2, dVar);
        this.f4549a = i11;
        this.f4551c = loginActivity;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f4549a) {
            case 0:
                return new e2(this.f4551c, dVar, 0);
            default:
                return new e2(this.f4551c, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f4549a) {
            case 0:
                break;
        }
        return ((e2) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0063  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:57:0x0105  */
    /* JADX WARN: Code duplicated, block: B:60:0x0114  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:
    
        if (((vt.d) r12).e(r11) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0121, code lost:
    
        if (((vt.d) r12).e(r11) == r0) goto L62;
     */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, qy.h] */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bp.e2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
