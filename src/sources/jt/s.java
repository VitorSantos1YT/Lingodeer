package jt;

import com.lingodeer.data.model.CourseWord;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class s extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CourseWord f37152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a00.a f37153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f37154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f37155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f37156e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f37157f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u uVar, xy.c cVar) {
        super(cVar);
        this.f37156e = uVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f37155d = obj;
        this.f37157f |= Integer.MIN_VALUE;
        return this.f37156e.e(null, this);
    }
}
