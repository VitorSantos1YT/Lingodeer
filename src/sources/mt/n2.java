package mt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n2 extends kotlin.jvm.internal.j implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rt.b4 f41682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j9.v f41683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f41684d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(rt.b4 b4Var, j9.v vVar, l1.b1 b1Var, int i11) {
        super(0, kotlin.jvm.internal.l.class, "continueAfterSuggestions", "CourseFlashCardSessionRoute$continueAfterSuggestions(Lcom/lingodeer/course/viewmodels/CourseFlashCardViewModel;Landroidx/navigation/NavHostController;Landroidx/compose/runtime/MutableState;)V", 0);
        this.f41681a = i11;
        switch (i11) {
            case 1:
                this.f41682b = b4Var;
                this.f41683c = vVar;
                this.f41684d = b1Var;
                super(0, kotlin.jvm.internal.l.class, "continueAfterSuggestions", "CourseFlashCardSessionRoute$continueAfterSuggestions(Lcom/lingodeer/course/viewmodels/CourseFlashCardViewModel;Landroidx/navigation/NavHostController;Landroidx/compose/runtime/MutableState;)V", 0);
                break;
            default:
                this.f41682b = b4Var;
                this.f41683c = vVar;
                this.f41684d = b1Var;
                break;
        }
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f41681a) {
            case 0:
                this.f41682b.f49488b0.f4943a = true;
                this.f41684d.setValue(Boolean.TRUE);
                this.f41683c.c();
                break;
            default:
                this.f41682b.f49488b0.f4943a = true;
                this.f41684d.setValue(Boolean.TRUE);
                this.f41683c.c();
                break;
        }
        return qy.b0.f48488a;
    }
}
