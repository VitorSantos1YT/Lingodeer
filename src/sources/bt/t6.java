package bt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t6 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ys.d0 f6032b;

    public /* synthetic */ t6(ys.d0 d0Var, int i11) {
        this.f6031a = i11;
        this.f6032b = d0Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f6031a;
        String audioPath = (String) obj;
        fz.a onComplete = (fz.a) obj2;
        kotlin.jvm.internal.m.f(audioPath, "audioPath");
        kotlin.jvm.internal.m.f(onComplete, "onComplete");
        switch (i11) {
            case 0:
                ys.d0 d0Var = this.f6032b;
                if (d0Var != null) {
                    ys.d0.e(d0Var, audioPath, new a3(1, onComplete, kotlin.jvm.internal.l.class, "suspendConversion1", "CourseTestWordM1Route$lambda$9$lambda$8$suspendConversion1(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 3), 4);
                }
                break;
            case 1:
                ys.d0 d0Var2 = this.f6032b;
                if (d0Var2 != null) {
                    ys.d0.e(d0Var2, audioPath, new a3(1, onComplete, kotlin.jvm.internal.l.class, "suspendConversion1", "CourseTestWordM2Route$lambda$9$lambda$8$suspendConversion1(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 4), 4);
                }
                break;
            case 2:
                ys.d0 d0Var3 = this.f6032b;
                if (d0Var3 != null) {
                    ys.d0.e(d0Var3, audioPath, new a3(1, onComplete, kotlin.jvm.internal.l.class, "suspendConversion1", "CourseTestWordM3Route$lambda$9$lambda$8$suspendConversion1(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 5), 4);
                }
                break;
            case 3:
                ys.d0 d0Var4 = this.f6032b;
                if (d0Var4 != null) {
                    ys.d0.e(d0Var4, audioPath, new a3(1, onComplete, kotlin.jvm.internal.l.class, "suspendConversion1", "CourseTestWordM4ListenRoute$lambda$9$lambda$8$suspendConversion1(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 6), 4);
                }
                break;
            default:
                ys.d0 d0Var5 = this.f6032b;
                if (d0Var5 != null) {
                    ys.d0.e(d0Var5, audioPath, new a3(1, onComplete, kotlin.jvm.internal.l.class, "suspendConversion1", "CourseTestWordM8Route$lambda$9$lambda$8$suspendConversion1(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 9), 4);
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
