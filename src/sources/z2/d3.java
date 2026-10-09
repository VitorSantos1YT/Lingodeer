package z2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d3 implements v1, kotlin.jvm.internal.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l1.w f58528a;

    public d3(l1.w wVar) {
        this.f58528a = wVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof v1) && (obj instanceof kotlin.jvm.internal.g)) {
            return getFunctionDelegate().equals(((kotlin.jvm.internal.g) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.g
    public final qy.e getFunctionDelegate() {
        return new kotlin.jvm.internal.j(1, 0, l1.w.class, this.f58528a, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
