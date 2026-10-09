package ar;

import androidx.compose.ui.viewinterop.AndroidViewHolder;
import com.lingo.fluent.ui.base.PdVocabularyActivity;
import mv.n;
import ph.o;
import rt.b4;
import rt.mf;
import rz.b0;
import s2.k0;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f2834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2835d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(long j11, Object obj, vy.d dVar, int i11) {
        super(2, dVar);
        this.f2832a = i11;
        this.f2834c = j11;
        this.f2835d = obj;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f2832a) {
            case 0:
                return new b((e) this.f2835d, dVar, 0);
            case 1:
                return new b((b0.d) this.f2835d, this.f2834c, dVar, 1);
            case 2:
                return new b((PdVocabularyActivity) this.f2835d, this.f2834c, dVar, 2);
            case 3:
                return new b((n) this.f2835d, this.f2834c, dVar, 3);
            case 4:
                return new b(this.f2834c, (o) this.f2835d, dVar, 4);
            case 5:
                b bVar = new b((b4) this.f2835d, dVar, 5);
                bVar.f2834c = ((Number) obj).longValue();
                return bVar;
            case 6:
                return new b((mf) this.f2835d, this.f2834c, dVar, 6);
            case 7:
                return new b(this.f2834c, (k0) this.f2835d, dVar, 7);
            default:
                return new b((AndroidViewHolder) this.f2835d, this.f2834c, dVar, 8);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2832a) {
            case 0:
                return ((b) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 1:
                return ((b) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 2:
                return ((b) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 3:
                return ((b) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 4:
                return ((b) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 5:
                return ((b) create(Long.valueOf(((Number) obj).longValue()), (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 6:
                return ((b) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 7:
                return ((b) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((b) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0070  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fe  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v19 java.lang.Object, still in use, count: 2, list:
          (r4v19 java.lang.Object) from 0x00c1: PHI (r4 I:??) = (r4v14 java.lang.Object), (r4v19 java.lang.Object) binds: [B:46:0x00c0, B:158:0x00c1] A[DONT_GENERATE, DONT_INLINE]
          (r4v19 java.lang.Object) from 0x00b7: CHECK_CAST (ps.b) (r4v19 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 784
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ar.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, long j11, vy.d dVar, int i11) {
        super(2, dVar);
        this.f2832a = i11;
        this.f2835d = obj;
        this.f2834c = j11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, vy.d dVar, int i11) {
        super(2, dVar);
        this.f2832a = i11;
        this.f2835d = obj;
    }
}
