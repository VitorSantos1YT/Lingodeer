package gp;

import com.lingodeer.data.model.DayStreakStatus;

/* JADX INFO: loaded from: classes3.dex */
public final class y extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f29547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bh.q f29549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uz.j f29550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public DayStreakStatus f29551e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f29552f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(bh.q qVar, vy.d dVar) {
        super(dVar);
        this.f29549c = qVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f29547a = obj;
        this.f29548b |= Integer.MIN_VALUE;
        return this.f29549c.emit(null, this);
    }
}
