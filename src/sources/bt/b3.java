package bt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b3 extends kotlin.jvm.internal.j implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f5215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.a f5216c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(int i11, fz.a aVar, l1.b1 b1Var) {
        super(1, kotlin.jvm.internal.l.class, "handleVideoPlayingStateChanged", "CourseTestSentenceM13Screen$handleVideoPlayingStateChanged(Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function0;Lcom/lingodeer/course/ui/lessontest/component/CourseVideoPlayingState;)V", 0);
        this.f5214a = i11;
        switch (i11) {
            case 1:
                this.f5215b = b1Var;
                this.f5216c = aVar;
                super(1, kotlin.jvm.internal.l.class, "handleVideoPlayingStateChanged", "CourseTestSentenceM13Screen$handleVideoPlayingStateChanged(Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function0;Lcom/lingodeer/course/ui/lessontest/component/CourseVideoPlayingState;)V", 0);
                break;
            case 2:
                this.f5215b = b1Var;
                this.f5216c = aVar;
                super(1, kotlin.jvm.internal.l.class, "handleVideoPlayingStateChanged", "CourseTestWordM5Screen$handleVideoPlayingStateChanged(Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function0;Lcom/lingodeer/course/ui/lessontest/component/CourseVideoPlayingState;)V", 0);
                break;
            case 3:
                this.f5215b = b1Var;
                this.f5216c = aVar;
                super(1, kotlin.jvm.internal.l.class, "handleVideoPlayingStateChanged", "CourseTestWordM5Screen$handleVideoPlayingStateChanged(Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function0;Lcom/lingodeer/course/ui/lessontest/component/CourseVideoPlayingState;)V", 0);
                break;
            default:
                this.f5215b = b1Var;
                this.f5216c = aVar;
                break;
        }
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f5214a) {
            case 0:
                dt.z4 p4 = (dt.z4) obj;
                kotlin.jvm.internal.m.f(p4, "p0");
                d3.g(this.f5215b, this.f5216c, p4);
                break;
            case 1:
                dt.z4 p11 = (dt.z4) obj;
                kotlin.jvm.internal.m.f(p11, "p0");
                d3.g(this.f5215b, this.f5216c, p11);
                break;
            case 2:
                dt.z4 p12 = (dt.z4) obj;
                kotlin.jvm.internal.m.f(p12, "p0");
                b.j0(this.f5215b, this.f5216c, p12);
                break;
            default:
                dt.z4 p13 = (dt.z4) obj;
                kotlin.jvm.internal.m.f(p13, "p0");
                b.j0(this.f5215b, this.f5216c, p13);
                break;
        }
        return qy.b0.f48488a;
    }
}
