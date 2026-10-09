package fr;

import com.lingodeer.data.model.DayStreakStatus;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27658a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f27659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f27661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f27662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f27663f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f27664t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(r rVar, String str, String str2, boolean z11, String str3, vy.d dVar) {
        super(2, dVar);
        this.f27661d = rVar;
        this.f27662e = str;
        this.f27663f = str2;
        this.f27659b = z11;
        this.f27664t = str3;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f27658a) {
            case 0:
                return new l((r) this.f27661d, (String) this.f27662e, (String) this.f27663f, this.f27659b, (String) this.f27664t, dVar);
            default:
                return new l((hu.k) this.f27662e, (DayStreakStatus) this.f27663f, (Date) this.f27664t, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f27658a) {
            case 0:
                break;
        }
        return ((l) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:149:0x034a  */
    /* JADX WARN: Code duplicated, block: B:151:0x0350  */
    /* JADX WARN: Code duplicated, block: B:153:0x0355  */
    /* JADX WARN: Code duplicated, block: B:155:0x035f  */
    /* JADX WARN: Code duplicated, block: B:156:0x0362  */
    /* JADX WARN: Code duplicated, block: B:158:0x036c  */
    /* JADX WARN: Code duplicated, block: B:159:0x036f  */
    /* JADX WARN: Code duplicated, block: B:165:0x0381  */
    /* JADX WARN: Code duplicated, block: B:168:0x038b  */
    /* JADX WARN: Code duplicated, block: B:16:0x006d  */
    /* JADX WARN: Code duplicated, block: B:172:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:218:0x02c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x02c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x037e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x039d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:? A[LOOP:8: B:166:0x0385->B:247:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:78:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:80:0x0210  */
    /* JADX WARN: Code duplicated, block: B:82:0x0215  */
    /* JADX WARN: Code duplicated, block: B:84:0x021d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0220  */
    /* JADX WARN: Code duplicated, block: B:86:0x0223  */
    /* JADX WARN: Code duplicated, block: B:88:0x022b  */
    /* JADX WARN: Code duplicated, block: B:89:0x022e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x0230  */
    /* JADX WARN: Code duplicated, block: B:95:0x0243  */
    /* JADX WARN: Code duplicated, block: B:97:0x0246  */
    /* JADX WARN: Code duplicated, block: B:98:0x0249  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r13v46 java.lang.Object, still in use, count: 2, list:
          (r13v46 java.lang.Object) from 0x01f5: PHI (r13 I:??) = (r13v36 java.lang.Object), (r13v46 java.lang.Object) binds: [B:75:0x01f4, B:214:0x01f5] A[DONT_GENERATE, DONT_INLINE]
          (r13v46 java.lang.Object) from 0x01e5: CHECK_CAST (com.lingodeer.data.model.DailyStreakHistory) (r13v46 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 1172
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(hu.k kVar, DayStreakStatus dayStreakStatus, Date date, vy.d dVar) {
        super(2, dVar);
        this.f27662e = kVar;
        this.f27663f = dayStreakStatus;
        this.f27664t = date;
    }
}
