package fr;

import com.lingodeer.data.model.CourseUnit;
import java.util.List;
import java.util.Map;
import java.util.Set;
import rt.g8;
import rt.mf;
import rt.n8;
import rt.se;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f4 extends xy.i implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f27515c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f4(int i11, int i12, vy.d dVar) {
        super(i11, dVar);
        this.f27513a = i12;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f27513a) {
            case 0:
                f4 f4Var = new f4((x4) this.f27515c, (vy.d) obj3, 0);
                f4Var.f27514b = (List) obj2;
                return f4Var.invokeSuspend(qy.b0.f48488a);
            case 1:
                f4 f4Var2 = new f4((gq.d) this.f27515c, (vy.d) obj3, 1);
                f4Var2.f27514b = (Throwable) obj2;
                qy.b0 b0Var = qy.b0.f48488a;
                f4Var2.invokeSuspend(b0Var);
                return b0Var;
            case 2:
                f4 f4Var3 = new f4(3, 2, (vy.d) obj3);
                f4Var3.f27514b = (n9.e1) obj;
                f4Var3.f27515c = (Map) obj2;
                return f4Var3.invokeSuspend(qy.b0.f48488a);
            case 3:
                f4 f4Var4 = new f4(3, 3, (vy.d) obj3);
                f4Var4.f27515c = (n9.e1) obj;
                f4Var4.f27514b = (List) obj2;
                return f4Var4.invokeSuspend(qy.b0.f48488a);
            case 4:
                f4 f4Var5 = new f4(3, 4, (vy.d) obj3);
                f4Var5.f27514b = (p5.e) obj;
                f4Var5.f27515c = (r5.b) obj2;
                return f4Var5.invokeSuspend(qy.b0.f48488a);
            case 5:
                f4 f4Var6 = new f4(3, 5, (vy.d) obj3);
                f4Var6.f27514b = (g8) obj;
                f4Var6.f27515c = (n8) obj2;
                return f4Var6.invokeSuspend(qy.b0.f48488a);
            case 6:
                f4 f4Var7 = new f4(3, 6, (vy.d) obj3);
                f4Var7.f27514b = (rt.s1) obj;
                f4Var7.f27515c = (String) obj2;
                return f4Var7.invokeSuspend(qy.b0.f48488a);
            case 7:
                f4 f4Var8 = new f4(3, 7, (vy.d) obj3);
                f4Var8.f27514b = (String) obj;
                f4Var8.f27515c = (se) obj2;
                return f4Var8.invokeSuspend(qy.b0.f48488a);
            case 8:
                f4 f4Var9 = new f4((rt.j2) this.f27515c, (vy.d) obj3, 8);
                f4Var9.f27514b = (rt.h1) obj2;
                return f4Var9.invokeSuspend(qy.b0.f48488a);
            case 9:
                f4 f4Var10 = new f4(3, 9, (vy.d) obj3);
                f4Var10.f27514b = (Boolean) obj;
                f4Var10.f27515c = (Integer) obj2;
                return f4Var10.invokeSuspend(qy.b0.f48488a);
            case 10:
                f4 f4Var11 = new f4(3, 10, (vy.d) obj3);
                f4Var11.f27514b = (Set) obj;
                f4Var11.f27515c = (Map) obj2;
                return f4Var11.invokeSuspend(qy.b0.f48488a);
            case 11:
                f4 f4Var12 = new f4(3, 11, (vy.d) obj3);
                f4Var12.f27515c = (CourseUnit) obj;
                f4Var12.f27514b = (List) obj2;
                return f4Var12.invokeSuspend(qy.b0.f48488a);
            case 12:
                f4 f4Var13 = new f4((mf) this.f27514b, (ps.b) this.f27515c, (vy.d) obj3);
                qy.b0 b0Var2 = qy.b0.f48488a;
                f4Var13.invokeSuspend(b0Var2);
                return b0Var2;
            default:
                f4 f4Var14 = new f4((mf) this.f27515c, (vy.d) obj3, 13);
                f4Var14.f27514b = (Throwable) obj2;
                qy.b0 b0Var3 = qy.b0.f48488a;
                f4Var14.invokeSuspend(b0Var3);
                return b0Var3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:140:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:55:0x0144  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [vy.d] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r8v6, types: [rt.o8] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v25 java.lang.Object, still in use, count: 2, list:
          (r5v25 java.lang.Object) from 0x0140: PHI (r5 I:??) = (r5v22 java.lang.Object), (r5v25 java.lang.Object) binds: [B:52:0x013f, B:146:0x0140] A[DONT_GENERATE, DONT_INLINE]
          (r5v25 java.lang.Object) from 0x0134: CHECK_CAST (rt.oe) (r5v25 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 968
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.f4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f4(Object obj, vy.d dVar, int i11) {
        super(3, dVar);
        this.f27513a = i11;
        this.f27515c = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(mf mfVar, ps.b bVar, vy.d dVar) {
        super(3, dVar);
        this.f27513a = 12;
        this.f27514b = mfVar;
        this.f27515c = bVar;
    }
}
