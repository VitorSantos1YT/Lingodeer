package zu;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class o2 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f59511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f59512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p2 f59513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uz.j f59514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f59515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f59516f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(p2 p2Var, vy.d dVar) {
        super(dVar);
        this.f59513c = p2Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f59511a = obj;
        this.f59512b |= Integer.MIN_VALUE;
        return this.f59513c.emit(null, this);
    }
}
