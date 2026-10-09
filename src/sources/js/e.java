package js;

import com.lingodeer.data.model.chinesetone.ChineseToneLevel;
import com.lingodeer.data.model.chinesetone.ChineseToneUnit;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends xy.c {
    public Collection H;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public /* synthetic */ Object P;
    public final /* synthetic */ g Q;
    public int R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Collection f36745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f36746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ChineseToneLevel f36747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Collection f36748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Iterator f36749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ChineseToneUnit f36750f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Collection f36751t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, xy.c cVar) {
        super(cVar);
        this.Q = gVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.P = obj;
        this.R |= Integer.MIN_VALUE;
        return g.a(this.Q, null, this);
    }
}
