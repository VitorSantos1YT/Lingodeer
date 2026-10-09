package au;

import com.lingodeer.database.model.DailyLearnTimeHistoryEntity;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i0 extends xy.c {
    public int H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k0 f3013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f3014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DailyLearnTimeHistoryEntity f3015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3017e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f3018f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k0 f3019t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(k0 k0Var, xy.c cVar) {
        super(cVar);
        this.f3019t = k0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f3018f = obj;
        this.H |= Integer.MIN_VALUE;
        return k0.c(this.f3019t, null, this);
    }
}
