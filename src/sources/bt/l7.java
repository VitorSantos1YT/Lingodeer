package bt;

import com.lingodeer.data.model.CourseWord;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l7 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CourseWord f5683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ht.o f5684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1.i1 f5685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.e f5686e;

    public /* synthetic */ l7(CourseWord courseWord, ht.o oVar, l1.i1 i1Var, fz.e eVar, int i11) {
        this.f5682a = i11;
        this.f5683b = courseWord;
        this.f5684c = oVar;
        this.f5685d = i1Var;
        this.f5686e = eVar;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f5682a) {
            case 0:
                CourseWord courseWord = this.f5683b;
                b.c0(this.f5684c, this.f5685d, this.f5686e, b7.e0.l(courseWord, "toString(...)"), new ht.h(courseWord.getVisemedMap()));
                break;
            case 1:
                CourseWord courseWord2 = this.f5683b;
                b.c0(this.f5684c, this.f5685d, this.f5686e, b7.e0.l(courseWord2, "toString(...)"), new ht.c(courseWord2.getVisemedMap()));
                break;
            case 2:
                CourseWord courseWord3 = this.f5683b;
                b.c0(this.f5684c, this.f5685d, this.f5686e, b7.e0.l(courseWord3, "toString(...)"), new ht.c(courseWord3.getVisemedMap()));
                break;
            case 3:
                CourseWord courseWord4 = this.f5683b;
                b.c0(this.f5684c, this.f5685d, this.f5686e, b7.e0.l(courseWord4, "toString(...)"), new ht.c(courseWord4.getVisemedMap()));
                break;
            default:
                CourseWord courseWord5 = this.f5683b;
                b.c0(this.f5684c, this.f5685d, this.f5686e, b7.e0.l(courseWord5, "toString(...)"), new ht.c(courseWord5.getVisemedMap()));
                break;
        }
        return qy.b0.f48488a;
    }
}
