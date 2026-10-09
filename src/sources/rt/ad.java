package rt;

import com.lingodeer.data.model.uistate.CourseTestFinishSummaryType;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ad extends xy.i implements fz.i {
    public final /* synthetic */ dd H;
    public final /* synthetic */ vt.c K;
    public final /* synthetic */ vt.n0 L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Set f49459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CourseTestFinishSummaryType f49460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f49461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f49462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ LinkedHashMap f49463e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ qy.l f49464f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ boolean f49465t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad(dd ddVar, vt.c cVar, vt.n0 n0Var, vy.d dVar) {
        super(6, dVar);
        this.H = ddVar;
        this.K = cVar;
        this.L = n0Var;
    }

    @Override // fz.i
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        ((Number) obj2).intValue();
        boolean zBooleanValue = ((Boolean) obj5).booleanValue();
        vt.c cVar = this.K;
        vt.n0 n0Var = this.L;
        ad adVar = new ad(this.H, cVar, n0Var, (vy.d) obj6);
        adVar.f49463e = (LinkedHashMap) obj;
        adVar.f49464f = (qy.l) obj4;
        adVar.f49465t = zBooleanValue;
        return adVar.invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00eb A[PHI: r0 r1 r9
      0x00eb: PHI (r0v18 int) = (r0v16 int), (r0v19 int) binds: [B:26:0x00e8, B:10:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x00eb: PHI (r1v9 java.util.Set) = (r1v6 java.util.Set), (r1v11 java.util.Set) binds: [B:26:0x00e8, B:10:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x00eb: PHI (r9v5 qy.b0) = (r9v3 qy.b0), (r9v6 qy.b0) binds: [B:26:0x00e8, B:10:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x0182  */
    /* JADX WARN: Code duplicated, block: B:47:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:49:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:50:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:51:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:55:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0100, code lost:
    
        if (r9 == r15) goto L23;
     */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.LinkedHashMap, java.util.Set, qy.l, rz.d0, vy.d, vy.i] */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rt.ad.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
