package rt;

import com.lingodeer.data.model.CourseACK;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class z extends xy.c {
    public Iterator H;
    public CourseACK K;
    public Collection L;
    public String M;
    public Collection N;
    public Iterator O;
    public Collection P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f50729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f50730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0.d0 f50731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uz.j f50732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f50733e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f50734f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Collection f50735t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a0.d0 d0Var, vy.d dVar) {
        super(dVar);
        this.f50731c = d0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f50729a = obj;
        this.f50730b |= Integer.MIN_VALUE;
        return this.f50731c.emit(null, this);
    }
}
