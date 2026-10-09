package er;

import com.lingo.notification.UnifiedNotificationJobService;
import j$.time.ZoneId;
import qy.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q f25765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q f25766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ZoneId f25767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f25768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ UnifiedNotificationJobService f25769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f25770f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(UnifiedNotificationJobService unifiedNotificationJobService, xy.c cVar) {
        super(cVar);
        this.f25769e = unifiedNotificationJobService;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f25768d = obj;
        this.f25770f |= Integer.MIN_VALUE;
        int i11 = UnifiedNotificationJobService.f22226c;
        return this.f25769e.d(this);
    }
}
