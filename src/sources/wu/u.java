package wu;

import com.lingodeer.data.model.ProgressCollectionItem;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class u extends xy.c {
    public int H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator f55456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ProgressCollectionItem f55457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f55458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f55459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f55460e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f55461f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ v f55462t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, xy.c cVar) {
        super(cVar);
        this.f55462t = vVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f55461f = obj;
        this.H |= Integer.MIN_VALUE;
        return v.b(this.f55462t, null, this);
    }
}
