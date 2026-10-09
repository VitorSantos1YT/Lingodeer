package bp;

import com.lingo.lingoskill.ui.base.ConfirmLevelActivity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class m1 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConfirmLevelActivity f4706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4707c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(ConfirmLevelActivity confirmLevelActivity, xy.c cVar) {
        super(cVar);
        this.f4706b = confirmLevelActivity;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f4705a = obj;
        this.f4707c |= Integer.MIN_VALUE;
        return ConfirmLevelActivity.p(this.f4706b, 0, null, this);
    }
}
