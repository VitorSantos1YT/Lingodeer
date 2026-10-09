package av;

import android.content.Context;
import com.stkouyu.SkEgnManager;
import java.util.concurrent.atomic.AtomicBoolean;
import rz.o0;
import rz.v1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a00.e f3214d = new a00.e();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile boolean f3215e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f3216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f3217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3218c = com.bumptech.glide.d.u(qy.j.SYNCHRONIZED, new d(this, 1));

    public y(Context context, q qVar) {
        this.f3216a = qVar;
        this.f3217b = context.getApplicationContext();
    }

    public static final void a(AtomicBoolean atomicBoolean, rz.m mVar, boolean z11) {
        if (atomicBoolean.compareAndSet(false, true)) {
            mVar.resumeWith(Boolean.valueOf(z11));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(xy.c cVar) {
        u uVar;
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i11 = uVar.f3198c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                uVar.f3198c = i11 - Integer.MIN_VALUE;
            } else {
                uVar = new u(this, cVar);
            }
        } else {
            uVar = new u(this, cVar);
        }
        Object objM = uVar.f3196a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = uVar.f3198c;
        int i13 = 1;
        vy.d dVar = null;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objM);
            if (oz.q.K0("17295688480003bc") || oz.q.K0("f280e1df258112fef6894df59b7b1c38")) {
                return Boolean.FALSE;
            }
            yz.f fVar = o0.f50940a;
            sz.c cVar2 = wz.m.f55536a.f51961d;
            p pVar = new p(this, dVar, i13);
            uVar.f3198c = 1;
            objM = rz.e0.M(cVar2, pVar, uVar);
            if (objM != aVar) {
            }
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(objM);
            return objM;
        }
        com.bumptech.glide.e.F(objM);
        SkEgnManager skEgnManager = (SkEgnManager) objM;
        if (kotlin.jvm.internal.m.a(skEgnManager.getCurrentEngineType(), "native")) {
            return Boolean.TRUE;
        }
        if (skEgnManager.getCurrentEngineType() != null) {
            skEgnManager.getCurrentEngineType();
            return Boolean.FALSE;
        }
        if (f3215e) {
            return Boolean.FALSE;
        }
        yz.f fVar2 = o0.f50940a;
        vy.i iVarPlus = yz.e.f58387a.plus(v1.f50964a);
        v vVar = new v(this, skEgnManager, dVar, i13);
        uVar.f3198c = 2;
        Object objM2 = rz.e0.M(iVarPlus, vVar, uVar);
        return objM2 == aVar ? aVar : objM2;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b5 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:14:0x002d, B:53:0x0145, B:34:0x00aa, B:37:0x00b5, B:41:0x00c2, B:43:0x00d7, B:47:0x00e1, B:49:0x00f9, B:50:0x00fc), top: B:58:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d7 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:14:0x002d, B:53:0x0145, B:34:0x00aa, B:37:0x00b5, B:41:0x00c2, B:43:0x00d7, B:47:0x00e1, B:49:0x00f9, B:50:0x00fc), top: B:58:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00df  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f9 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:14:0x002d, B:53:0x0145, B:34:0x00aa, B:37:0x00b5, B:41:0x00c2, B:43:0x00d7, B:47:0x00e1, B:49:0x00f9, B:50:0x00fc), top: B:58:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0142, code lost:
    
        if (r15 == r1) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [av.y] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v3, types: [a00.a] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r11v8, types: [a00.a] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.io.File r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, xy.c r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: av.y.c(java.io.File, java.lang.String, java.lang.String, java.lang.String, xy.c):java.lang.Object");
    }
}
