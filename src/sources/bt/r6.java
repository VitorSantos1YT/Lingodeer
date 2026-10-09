package bt;

import com.lingodeer.data.model.CourseWord;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r6 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.e f5945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CourseWord f5946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f5947d;

    public /* synthetic */ r6(fz.e eVar, CourseWord courseWord, l1.b1 b1Var, int i11) {
        this.f5944a = i11;
        this.f5945b = eVar;
        this.f5946c = courseWord;
        this.f5947d = b1Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        CourseWord courseWord = (CourseWord) obj;
        switch (this.f5944a) {
            case 0:
                String strM = b7.e0.m(courseWord, "it", "toString(...)");
                l1.b1 b1Var = this.f5947d;
                this.f5945b.invoke(strM, new bp.p(25, b1Var));
                b1Var.setValue(new ht.d(courseWord.getWordId(), this.f5946c.getVisemedMap()));
                break;
            case 1:
                String strM2 = b7.e0.m(courseWord, "it", "toString(...)");
                l1.b1 b1Var2 = this.f5947d;
                this.f5945b.invoke(strM2, new z6(0, b1Var2));
                b1Var2.setValue(new ht.d(courseWord.getWordId(), this.f5946c.getVisemedMap()));
                break;
            case 2:
                this.f5945b.invoke(b7.e0.m(courseWord, "it", "toString(...)"), new ju.d(25));
                this.f5947d.setValue(new ht.d(courseWord.getWordId(), this.f5946c.getVisemedMap()));
                break;
            default:
                String strM3 = b7.e0.m(courseWord, "it", "toString(...)");
                l1.b1 b1Var3 = this.f5947d;
                this.f5945b.invoke(strM3, new z6(17, b1Var3));
                b1Var3.setValue(new ht.d(courseWord.getWordId(), this.f5946c.getVisemedMap()));
                break;
        }
        return qy.b0.f48488a;
    }
}
