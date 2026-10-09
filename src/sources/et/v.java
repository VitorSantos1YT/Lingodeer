package et;

import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.SyllableLessonStatus;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v implements fz.e {
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ qy.e M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25913a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f25914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f25915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f25916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.a f25917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f25918f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f25919t;

    public /* synthetic */ v(CourseSentence courseSentence, List list, boolean z11, boolean z12, boolean z13, int i11, fz.e eVar, fz.e eVar2, fz.c cVar, fz.a aVar, int i12) {
        this.f25919t = courseSentence;
        this.H = list;
        this.f25914b = z11;
        this.f25915c = z12;
        this.f25916d = z13;
        this.f25918f = i11;
        this.K = eVar;
        this.L = eVar2;
        this.M = cVar;
        this.f25917e = aVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f25913a) {
            case 0:
                ((Integer) obj2).getClass();
                int iM = l1.t.M(1);
                a.a((CourseSentence) this.f25919t, (List) this.H, this.f25914b, this.f25915c, this.f25916d, this.f25918f, (fz.e) this.K, (fz.e) this.L, (fz.c) this.M, this.f25917e, (l1.n) obj, iM);
                break;
            default:
                ((Integer) obj2).getClass();
                nv.a.a((SyllableLessonStatus) this.f25919t, (String) this.H, (String) this.K, this.f25914b, this.f25915c, this.f25916d, (z1.r) this.L, this.f25917e, (fz.a) this.M, (l1.n) obj, l1.t.M(this.f25918f | 1));
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ v(SyllableLessonStatus syllableLessonStatus, String str, String str2, boolean z11, boolean z12, boolean z13, z1.r rVar, fz.a aVar, fz.a aVar2, int i11) {
        this.f25919t = syllableLessonStatus;
        this.H = str;
        this.K = str2;
        this.f25914b = z11;
        this.f25915c = z12;
        this.f25916d = z13;
        this.L = rVar;
        this.f25917e = aVar;
        this.M = aVar2;
        this.f25918f = i11;
    }
}
