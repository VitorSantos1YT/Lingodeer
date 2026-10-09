package js;

import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.TestModel;
import com.lingodeer.data.model.chinesetone.ChineseToneWord;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends xy.c {
    public int H;
    public int K;
    public int L;
    public /* synthetic */ Object M;
    public final /* synthetic */ r N;
    public int O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TestModel f36777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ChineseToneWord f36778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CourseWord f36779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f36780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f36781e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Collection f36782f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Iterator f36783t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(r rVar, xy.c cVar) {
        super(cVar);
        this.N = rVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.M = obj;
        this.O |= Integer.MIN_VALUE;
        return r.I(this.N, null, this);
    }
}
