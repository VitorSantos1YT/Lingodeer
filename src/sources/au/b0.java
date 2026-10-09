package au;

import com.lingodeer.database.model.DailyLearnHistoryEntity;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b0 extends xy.c {
    public int H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f0 f2945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f2946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DailyLearnHistoryEntity f2947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2948d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2949e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f2950f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f0 f2951t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(f0 f0Var, xy.c cVar) {
        super(cVar);
        this.f2951t = f0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f2950f = obj;
        this.H |= Integer.MIN_VALUE;
        return f0.c(this.f2951t, null, this);
    }
}
