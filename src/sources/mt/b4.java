package mt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b4 extends kotlin.jvm.internal.j implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rt.e3 f41281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j9.v f41282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f41283d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(rt.e3 e3Var, j9.v vVar, l1.b1 b1Var, int i11) {
        super(0, kotlin.jvm.internal.l.class, "continueAfterSuggestions", "CourseFlashCardSrsTestRoute$continueAfterSuggestions(Lcom/lingodeer/course/viewmodels/CourseFlashCardSrsTestViewModel;Landroidx/navigation/NavHostController;Landroidx/compose/runtime/MutableState;)V", 0);
        this.f41280a = i11;
        switch (i11) {
            case 1:
                this.f41281b = e3Var;
                this.f41282c = vVar;
                this.f41283d = b1Var;
                super(0, kotlin.jvm.internal.l.class, "continueAfterSuggestions", "CourseFlashCardSrsTestRoute$continueAfterSuggestions(Lcom/lingodeer/course/viewmodels/CourseFlashCardSrsTestViewModel;Landroidx/navigation/NavHostController;Landroidx/compose/runtime/MutableState;)V", 0);
                break;
            default:
                this.f41281b = e3Var;
                this.f41282c = vVar;
                this.f41283d = b1Var;
                break;
        }
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f41280a) {
            case 0:
                this.f41281b.A0.f4943a = true;
                this.f41283d.setValue(Boolean.TRUE);
                this.f41282c.c();
                break;
            default:
                this.f41281b.A0.f4943a = true;
                this.f41283d.setValue(Boolean.TRUE);
                this.f41282c.c();
                break;
        }
        return qy.b0.f48488a;
    }
}
