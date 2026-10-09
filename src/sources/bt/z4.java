package bt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class z4 extends kotlin.jvm.internal.j implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1.a1 f6264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1.a1 f6265c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(l1.a1 a1Var, l1.a1 a1Var2, int i11) {
        super(2, kotlin.jvm.internal.l.class, "onOptionLayoutChanged", "CourseTestSentenceM5Screen$onOptionLayoutChanged(Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableIntState;II)V", 0);
        this.f6263a = i11;
        switch (i11) {
            case 1:
                this.f6264b = a1Var;
                this.f6265c = a1Var2;
                super(2, kotlin.jvm.internal.l.class, "onOptionLayoutChanged", "CourseTestSentenceM5Screen$onOptionLayoutChanged(Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableIntState;II)V", 0);
                break;
            default:
                this.f6264b = a1Var;
                this.f6265c = a1Var2;
                break;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6263a) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                int iIntValue2 = ((Number) obj2).intValue();
                ((l1.h1) this.f6264b).m(iIntValue);
                ((l1.h1) this.f6265c).m(iIntValue2);
                break;
            default:
                int iIntValue3 = ((Number) obj).intValue();
                int iIntValue4 = ((Number) obj2).intValue();
                ((l1.h1) this.f6264b).m(iIntValue3);
                ((l1.h1) this.f6265c).m(iIntValue4);
                break;
        }
        return qy.b0.f48488a;
    }
}
