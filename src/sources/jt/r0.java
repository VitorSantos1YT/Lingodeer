package jt;

import com.lingodeer.data.model.CourseWord;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class r0 extends xy.c {
    public /* synthetic */ Object H;
    public final /* synthetic */ s0 K;
    public int L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f37139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a00.a f37140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CourseWord f37141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f37142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f37143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f37144f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f37145t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(s0 s0Var, xy.c cVar) {
        super(cVar);
        this.K = s0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.H = obj;
        this.L |= Integer.MIN_VALUE;
        return this.K.c(null, this);
    }
}
