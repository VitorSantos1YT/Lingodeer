package ch;

import com.lingo.course.ui.CourseTestIndexActivity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class m0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f7068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f7070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CourseTestIndexActivity f7071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7072e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(CourseTestIndexActivity courseTestIndexActivity, xy.c cVar) {
        super(cVar);
        this.f7071d = courseTestIndexActivity;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f7070c = obj;
        this.f7072e |= Integer.MIN_VALUE;
        return CourseTestIndexActivity.p(this.f7071d, 0L, 0, this);
    }
}
