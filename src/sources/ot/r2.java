package ot;

import com.lingodeer.data.model.CourseUnit;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class r2 extends xy.c {
    public int H;
    public /* synthetic */ Object K;
    public final /* synthetic */ u2 L;
    public int M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CourseUnit f45974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f45975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Collection f45976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f45977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f45978e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f45979f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f45980t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(u2 u2Var, xy.c cVar) {
        super(cVar);
        this.L = u2Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.K = obj;
        this.M |= Integer.MIN_VALUE;
        return this.L.b(null, null, this);
    }
}
