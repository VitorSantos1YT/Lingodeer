package er;

import com.lingo.notification.UnifiedNotificationJobService;
import qy.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q f25754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UnifiedNotificationJobService f25756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25757d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(UnifiedNotificationJobService unifiedNotificationJobService, xy.c cVar) {
        super(cVar);
        this.f25756c = unifiedNotificationJobService;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f25755b = obj;
        this.f25757d |= Integer.MIN_VALUE;
        int i11 = UnifiedNotificationJobService.f22226c;
        return this.f25756c.b(this);
    }
}
