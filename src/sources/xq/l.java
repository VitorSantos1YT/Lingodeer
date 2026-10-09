package xq;

import com.lingo.lingoskill.widget.daystreak.DayStreakWidgetUpdateWorker;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f56192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DayStreakWidgetUpdateWorker f56193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f56194c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(DayStreakWidgetUpdateWorker dayStreakWidgetUpdateWorker, xy.c cVar) {
        super(cVar);
        this.f56193b = dayStreakWidgetUpdateWorker;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f56192a = obj;
        this.f56194c |= Integer.MIN_VALUE;
        return this.f56193b.c(this);
    }
}
