package r2;

import a0.c0;
import kotlin.jvm.internal.n;
import rz.b0;
import v3.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f48749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f48750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n f48751c = new c0(this, 26);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b0 f48752d;

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        if (r14 == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0080, code lost:
    
        if (r14 == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0082, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r10, long r12, xy.c r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof r2.b
            if (r0 == 0) goto L14
            r0 = r14
            r2.b r0 = (r2.b) r0
            int r1 = r0.f48745c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f48745c = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            r2.b r0 = new r2.b
            r0.<init>(r9, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.f48743a
            wy.a r0 = wy.a.COROUTINE_SUSPENDED
            int r1 = r6.f48745c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L38
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            com.bumptech.glide.e.F(r14)
            goto L83
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L34:
            com.bumptech.glide.e.F(r14)
            goto L5f
        L38:
            com.bumptech.glide.e.F(r14)
            r2.i r14 = r9.f48749a
            r1 = 0
            if (r14 == 0) goto L4b
            boolean r4 = r14.P
            if (r4 == 0) goto L4b
            y2.g2 r14 = y2.f.j(r14)
            r2.i r14 = (r2.i) r14
            goto L4c
        L4b:
            r14 = r1
        L4c:
            r4 = 0
            if (r14 != 0) goto L64
            r2.i r1 = r9.f48750b
            if (r1 == 0) goto L89
            r6.f48745c = r3
            r2 = r10
            r4 = r12
            java.lang.Object r14 = r1.D(r2, r4, r6)
            if (r14 != r0) goto L5f
            goto L82
        L5f:
            v3.q r14 = (v3.q) r14
            long r4 = r14.f53504a
            goto L89
        L64:
            r7 = r12
            r12 = r2
            r2 = r10
            r10 = r4
            r4 = r7
            r2.i r13 = r9.f48749a
            if (r13 == 0) goto L78
            boolean r14 = r13.P
            if (r14 == 0) goto L78
            y2.g2 r13 = y2.f.j(r13)
            r1 = r13
            r2.i r1 = (r2.i) r1
        L78:
            if (r1 == 0) goto L88
            r6.f48745c = r12
            java.lang.Object r14 = r1.D(r2, r4, r6)
            if (r14 != r0) goto L83
        L82:
            return r0
        L83:
            v3.q r14 = (v3.q) r14
            long r4 = r14.f53504a
            goto L89
        L88:
            r4 = r10
        L89:
            v3.q r10 = new v3.q
            r10.<init>(r4)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: r2.d.a(long, long, xy.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(long j11, xy.c cVar) {
        c cVar2;
        long j12;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i11 = cVar2.f48748c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar2.f48748c = i11 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objW = cVar2.f48746a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = cVar2.f48748c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objW);
            i iVar = this.f48749a;
            i iVar2 = null;
            if (iVar != null && iVar.P) {
                iVar2 = (i) y2.f.j(iVar);
            }
            if (iVar2 != null) {
                cVar2.f48748c = 1;
                objW = iVar2.W(j11, cVar2);
                if (objW == aVar) {
                    return aVar;
                }
            } else {
                j12 = 0;
            }
            return new q(j12);
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        com.bumptech.glide.e.F(objW);
        j12 = ((q) objW).f53504a;
        return new q(j12);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fz.a, kotlin.jvm.internal.n] */
    public final b0 c() {
        b0 b0Var = (b0) this.f48751c.invoke();
        if (b0Var != null) {
            return b0Var;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }
}
