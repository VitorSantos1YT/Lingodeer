package bt;

import com.lingodeer.data.model.CourseWord;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o6 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.e f5809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CourseWord f5810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f5811d;

    public /* synthetic */ o6(fz.e eVar, CourseWord courseWord, l1.b1 b1Var, int i11) {
        this.f5808a = i11;
        this.f5809b = eVar;
        this.f5810c = courseWord;
        this.f5811d = b1Var;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f5808a) {
            case 0:
                CourseWord courseWord = this.f5810c;
                String strL = b7.e0.l(courseWord, "toString(...)");
                l1.b1 b1Var = this.f5811d;
                this.f5809b.invoke(strL, new bp.p(24, b1Var));
                b1Var.setValue(new ht.c(courseWord.getVisemedMap()));
                break;
            case 1:
                CourseWord courseWord2 = this.f5810c;
                String strL2 = b7.e0.l(courseWord2, "toString(...)");
                l1.b1 b1Var2 = this.f5811d;
                this.f5809b.invoke(strL2, new bp.p(28, b1Var2));
                b1Var2.setValue(new ht.h(courseWord2.getVisemedMap()));
                break;
            case 2:
                CourseWord courseWord3 = this.f5810c;
                String strL3 = b7.e0.l(courseWord3, "toString(...)");
                l1.b1 b1Var3 = this.f5811d;
                this.f5809b.invoke(strL3, new z6(10, b1Var3));
                b1Var3.setValue(new ht.h(courseWord3.getVisemedMap()));
                break;
            case 3:
                CourseWord courseWord4 = this.f5810c;
                String strL4 = b7.e0.l(courseWord4, "toString(...)");
                l1.b1 b1Var4 = this.f5811d;
                this.f5809b.invoke(strL4, new z6(12, b1Var4));
                b1Var4.setValue(new ht.c(courseWord4.getVisemedMap()));
                break;
            case 4:
                CourseWord courseWord5 = this.f5810c;
                String strL5 = b7.e0.l(courseWord5, "toString(...)");
                l1.b1 b1Var5 = this.f5811d;
                this.f5809b.invoke(strL5, new z6(11, b1Var5));
                b1Var5.setValue(new ht.c(courseWord5.getVisemedMap()));
                break;
            case 5:
                CourseWord courseWord6 = this.f5810c;
                String strL6 = b7.e0.l(courseWord6, "toString(...)");
                l1.b1 b1Var6 = this.f5811d;
                this.f5809b.invoke(strL6, new z6(15, b1Var6));
                b1Var6.setValue(new ht.h(courseWord6.getVisemedMap()));
                break;
            default:
                CourseWord courseWord7 = this.f5810c;
                String strL7 = b7.e0.l(courseWord7, "toString(...)");
                l1.b1 b1Var7 = this.f5811d;
                this.f5809b.invoke(strL7, new z6(16, b1Var7));
                b1Var7.setValue(new ht.c(courseWord7.getVisemedMap()));
                break;
        }
        return qy.b0.f48488a;
    }
}
