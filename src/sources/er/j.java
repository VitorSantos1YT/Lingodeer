package er;

import com.lingo.notification.UnifiedNotificationJobService;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f25761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UnifiedNotificationJobService f25763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25764d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(UnifiedNotificationJobService unifiedNotificationJobService, xy.c cVar) {
        super(cVar);
        this.f25763c = unifiedNotificationJobService;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f25762b = obj;
        this.f25764d |= Integer.MIN_VALUE;
        return UnifiedNotificationJobService.a(this.f25763c, null, null, this);
    }
}
