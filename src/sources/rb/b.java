package rb;

import androidx.work.impl.workers.ConstraintTrackingWorker;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f49060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConstraintTrackingWorker f49061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f49062c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ConstraintTrackingWorker constraintTrackingWorker, xy.c cVar) {
        super(cVar);
        this.f49061b = constraintTrackingWorker;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f49060a = obj;
        this.f49062c |= Integer.MIN_VALUE;
        return ConstraintTrackingWorker.e(this.f49061b, null, null, null, this);
    }
}
