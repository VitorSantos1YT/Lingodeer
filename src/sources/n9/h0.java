package n9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h0 implements uz.j, kotlin.jvm.internal.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f43580b;

    public /* synthetic */ h0(Object obj, int i11) {
        this.f43579a = i11;
        this.f43580b = obj;
    }

    @Override // uz.j
    public final Object emit(Object obj, vy.d dVar) {
        int i11 = this.f43579a;
        qy.b0 b0Var = qy.b0.f48488a;
        Object obj2 = this.f43580b;
        switch (i11) {
            case 0:
                Object objF = ((y1) obj2).f43739a.f((e1) obj, dVar);
                return objF == wy.a.COROUTINE_SUSPENDED ? objF : b0Var;
            default:
                ((wb.i) obj2).k((wb.g) obj);
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                return b0Var;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f43579a) {
            case 0:
                if ((obj instanceof uz.j) && (obj instanceof kotlin.jvm.internal.g)) {
                    return getFunctionDelegate().equals(((kotlin.jvm.internal.g) obj).getFunctionDelegate());
                }
                return false;
            default:
                if ((obj instanceof uz.j) && (obj instanceof kotlin.jvm.internal.g)) {
                    return getFunctionDelegate().equals(((kotlin.jvm.internal.g) obj).getFunctionDelegate());
                }
                return false;
        }
    }

    @Override // kotlin.jvm.internal.g
    public final qy.e getFunctionDelegate() {
        switch (this.f43579a) {
            case 0:
                return new kotlin.jvm.internal.j(2, 0, y1.class, (y1) this.f43580b, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
            default:
                return new kotlin.jvm.internal.a(2, 4, wb.i.class, (wb.i) this.f43580b, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V");
        }
    }

    public final int hashCode() {
        switch (this.f43579a) {
            case 0:
                break;
        }
        return getFunctionDelegate().hashCode();
    }
}
