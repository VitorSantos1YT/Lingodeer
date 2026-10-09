package mt;

import kotlin.NoWhenBranchMatchedException;
import rt.ce;
import rt.de;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m2 extends kotlin.jvm.internal.j implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41650a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f41651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f41652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f41653d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(p0.f fVar, y2.k1 k1Var, d2.c cVar) {
        super(0, kotlin.jvm.internal.l.class, "localRect", "bringIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
        this.f41653d = fVar;
        this.f41651b = k1Var;
        this.f41652c = cVar;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f41650a) {
            case 0:
                rt.b4 b4Var = (rt.b4) this.f41653d;
                l1.b1 b1Var = (l1.b1) this.f41651b;
                l1.a1 a1Var = (l1.a1) this.f41652c;
                bq.f fVar = b4Var.f49488b0;
                ot.h2 h2Var = (ot.h2) fVar.f4944b;
                int size = h2Var != null ? h2Var.b().size() : 0;
                boolean z11 = fVar.f4943a;
                ce ceVar = ce.f49593a;
                Object deVar = (z11 || size <= 0) ? ceVar : new de(size);
                if (deVar.equals(ceVar)) {
                    b1Var.setValue(Boolean.TRUE);
                } else {
                    if (!(deVar instanceof de)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((l1.h1) a1Var).m(((de) deVar).f49650a);
                }
                return qy.b0.f48488a;
            case 1:
                rt.e3 e3Var = (rt.e3) this.f41653d;
                l1.b1 b1Var2 = (l1.b1) this.f41651b;
                l1.a1 a1Var2 = (l1.a1) this.f41652c;
                bq.f fVar2 = e3Var.A0;
                ot.h2 h2Var2 = (ot.h2) fVar2.f4944b;
                int size2 = h2Var2 != null ? h2Var2.b().size() : 0;
                boolean z12 = fVar2.f4943a;
                ce ceVar2 = ce.f49593a;
                Object deVar2 = (z12 || size2 <= 0) ? ceVar2 : new de(size2);
                if (deVar2.equals(ceVar2)) {
                    b1Var2.setValue(Boolean.TRUE);
                } else {
                    if (!(deVar2 instanceof de)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((l1.h1) a1Var2).m(((de) deVar2).f49650a);
                }
                return qy.b0.f48488a;
            default:
                return p0.f.T0((p0.f) this.f41653d, (y2.k1) this.f41651b, (d2.c) this.f41652c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(rt.e3 e3Var, l1.b1 b1Var, l1.a1 a1Var) {
        super(0, kotlin.jvm.internal.l.class, "requestSummaryContinue", "CourseFlashCardSrsTestRoute$requestSummaryContinue(Lcom/lingodeer/course/viewmodels/CourseFlashCardSrsTestViewModel;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableIntState;)V", 0);
        this.f41653d = e3Var;
        this.f41651b = b1Var;
        this.f41652c = a1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(rt.b4 b4Var, l1.b1 b1Var, l1.a1 a1Var) {
        super(0, kotlin.jvm.internal.l.class, "requestSummaryContinue", "CourseFlashCardSessionRoute$requestSummaryContinue(Lcom/lingodeer/course/viewmodels/CourseFlashCardViewModel;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableIntState;)V", 0);
        this.f41653d = b4Var;
        this.f41651b = b1Var;
        this.f41652c = a1Var;
    }
}
