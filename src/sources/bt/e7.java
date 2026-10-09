package bt;

import com.lingodeer.data.model.CourseWord;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e7 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CourseWord f5362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f5363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ht.o f5364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f5365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fz.e f5366f;

    public /* synthetic */ e7(CourseWord courseWord, l1.b1 b1Var, ht.o oVar, l1.b1 b1Var2, fz.e eVar, int i11) {
        this.f5361a = i11;
        this.f5362b = courseWord;
        this.f5363c = b1Var;
        this.f5364d = oVar;
        this.f5365e = b1Var2;
        this.f5366f = eVar;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f5361a) {
            case 0:
                CourseWord courseWord = this.f5362b;
                String strL = b7.e0.l(courseWord, "toString(...)");
                l1.b1 b1Var = this.f5363c;
                b.X(this.f5364d, this.f5365e, this.f5366f, strL, new z6(3, b1Var));
                b1Var.setValue(new ht.h(courseWord.getVisemedMap()));
                break;
            case 1:
                CourseWord courseWord2 = this.f5362b;
                String strL2 = b7.e0.l(courseWord2, "toString(...)");
                l1.b1 b1Var2 = this.f5363c;
                b.X(this.f5364d, this.f5365e, this.f5366f, strL2, new z6(5, b1Var2));
                b1Var2.setValue(new ht.c(courseWord2.getVisemedMap()));
                break;
            case 2:
                CourseWord courseWord3 = this.f5362b;
                String strL3 = b7.e0.l(courseWord3, "toString(...)");
                l1.b1 b1Var3 = this.f5363c;
                b.X(this.f5364d, this.f5365e, this.f5366f, strL3, new z6(7, b1Var3));
                b1Var3.setValue(new ht.c(courseWord3.getVisemedMap()));
                break;
            default:
                b.X(this.f5364d, this.f5365e, this.f5366f, b7.e0.l(this.f5362b, "toString(...)"), new z6(4, this.f5363c));
                break;
        }
        return qy.b0.f48488a;
    }
}
