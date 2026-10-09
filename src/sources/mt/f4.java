package mt;

import rt.wb;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f4 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rt.e3 f41413b;

    public /* synthetic */ f4(rt.e3 e3Var, int i11) {
        this.f41412a = i11;
        this.f41413b = e3Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f41412a) {
            case 0:
                String bookmarkValue = (String) obj;
                long jLongValue = ((Long) obj2).longValue();
                kotlin.jvm.internal.m.f(bookmarkValue, "bookmarkValue");
                return this.f41413b.h(jLongValue, bookmarkValue);
            case 1:
                ht.o params = (ht.o) obj;
                String note = (String) obj2;
                kotlin.jvm.internal.m.f(params, "params");
                kotlin.jvm.internal.m.f(note, "note");
                this.f41413b.F(params, note);
                return qy.b0.f48488a;
            case 2:
                String bookmarkValue2 = (String) obj;
                long jLongValue2 = ((Long) obj2).longValue();
                kotlin.jvm.internal.m.f(bookmarkValue2, "bookmarkValue");
                return this.f41413b.h(jLongValue2, bookmarkValue2);
            case 3:
                this.f41413b.t(new wb(-1L, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue()));
                return qy.b0.f48488a;
            default:
                String bookmarkValue3 = (String) obj;
                long jLongValue3 = ((Long) obj2).longValue();
                kotlin.jvm.internal.m.f(bookmarkValue3, "bookmarkValue");
                return this.f41413b.v(jLongValue3, bookmarkValue3);
        }
    }
}
