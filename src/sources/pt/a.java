package pt;

import com.lingodeer.data.model.CourseLesson;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CourseLesson f47135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f47136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public fz.e f47137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f47138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f47139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f47140f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, vy.d dVar2) {
        super(dVar2);
        this.f47139e = dVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f47138d = obj;
        this.f47140f |= Integer.MIN_VALUE;
        return this.f47139e.a(null, null, null, null, this);
    }
}
