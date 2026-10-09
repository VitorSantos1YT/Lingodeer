package sr;

import java.util.List;
import rt.t6;
import uz.j;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f51768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f51769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t6 f51770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j f51771d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f51772e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f51773f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(t6 t6Var, vy.d dVar) {
        super(dVar);
        this.f51770c = t6Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f51768a = obj;
        this.f51769b |= Integer.MIN_VALUE;
        return this.f51770c.emit(null, this);
    }
}
