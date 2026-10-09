package androidx.fragment.app;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m2 f1743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f1744c;

    public /* synthetic */ m(m2 m2Var, q qVar, int i11) {
        this.f1742a = i11;
        this.f1743b = m2Var;
        this.f1744c = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1742a) {
            case 0:
                m2 operation = this.f1743b;
                kotlin.jvm.internal.m.f(operation, "$operation");
                q this$0 = this.f1744c;
                kotlin.jvm.internal.m.f(this$0, "this$0");
                if (k1.L(2)) {
                    operation.toString();
                }
                operation.c(this$0);
                break;
            default:
                m2 operation2 = this.f1743b;
                kotlin.jvm.internal.m.f(operation2, "$operation");
                q this$1 = this.f1744c;
                kotlin.jvm.internal.m.f(this$1, "this$0");
                if (k1.L(2)) {
                    operation2.toString();
                }
                operation2.c(this$1);
                break;
        }
    }
}
