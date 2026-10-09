package fr;

import com.lingodeer.data.model.MeUserData;
import com.lingodeer.data.model.ProgressCollectionItem;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b2 extends xy.c {
    public Object H;
    public Collection K;
    public Collection L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public /* synthetic */ Object R;
    public final /* synthetic */ i3 S;
    public int T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MeUserData f27409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public kotlin.jvm.internal.y f27410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public kotlin.jvm.internal.y f27411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Collection f27412d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Iterator f27413e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ProgressCollectionItem f27414f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Integer f27415t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(i3 i3Var, xy.c cVar) {
        super(cVar);
        this.S = i3Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.R = obj;
        this.T |= Integer.MIN_VALUE;
        return this.S.b(this);
    }
}
