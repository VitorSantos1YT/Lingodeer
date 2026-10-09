package bp;

import com.lingo.lingoskill.ui.base.UpdateLessonActivity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class r5 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UpdateLessonActivity f4797c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r5(UpdateLessonActivity updateLessonActivity, vy.d dVar, int i11) {
        super(2, dVar);
        this.f4795a = i11;
        this.f4797c = updateLessonActivity;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f4795a) {
            case 0:
                return new r5(this.f4797c, dVar, 0);
            case 1:
                return new r5(this.f4797c, dVar, 1);
            case 2:
                return new r5(this.f4797c, dVar, 2);
            case 3:
                return new r5(this.f4797c, dVar, 3);
            default:
                return new r5(this.f4797c, dVar, 4);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f4795a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return ((r5) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0105  */
    /* JADX WARN: Code duplicated, block: B:52:0x010a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0126  */
    /* JADX WARN: Code duplicated, block: B:57:0x012b  */
    /* JADX WARN: Code duplicated, block: B:60:0x0148  */
    /* JADX WARN: Code duplicated, block: B:63:0x0163  */
    /* JADX WARN: Code duplicated, block: B:66:0x0173  */
    /* JADX WARN: Code duplicated, block: B:69:0x0185  */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x023b, code lost:
    
        if (r13 == r0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0264, code lost:
    
        if (r13 == r0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01ea, code lost:
    
        if (r4 == r0) goto L86;
     */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, qy.h] */
    /* JADX WARN: Type inference failed for: r13v20, types: [java.lang.Object, qy.h] */
    /* JADX WARN: Type inference failed for: r13v25, types: [java.lang.Object, qy.h] */
    /* JADX WARN: Type inference failed for: r13v55, types: [java.lang.Object, qy.h] */
    /* JADX WARN: Type inference failed for: r13v62, types: [java.lang.Object, qy.h] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, qy.h] */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bp.r5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
