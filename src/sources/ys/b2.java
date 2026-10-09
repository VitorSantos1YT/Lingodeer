package ys;

import rt.mb;
import rt.wb;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b2 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f57930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mb f57931b;

    public /* synthetic */ b2(mb mbVar, int i11) {
        this.f57930a = i11;
        this.f57931b = mbVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f57930a) {
            case 0:
                String bookmarkValue = (String) obj;
                long jLongValue = ((Long) obj2).longValue();
                kotlin.jvm.internal.m.f(bookmarkValue, "bookmarkValue");
                return this.f57931b.h(jLongValue, bookmarkValue);
            case 1:
                ht.o params = (ht.o) obj;
                String note = (String) obj2;
                kotlin.jvm.internal.m.f(params, "params");
                kotlin.jvm.internal.m.f(note, "note");
                this.f57931b.F(params, note);
                return qy.b0.f48488a;
            case 2:
                String bookmarkValue2 = (String) obj;
                long jLongValue2 = ((Long) obj2).longValue();
                kotlin.jvm.internal.m.f(bookmarkValue2, "bookmarkValue");
                return this.f57931b.h(jLongValue2, bookmarkValue2);
            case 3:
                String bookmarkValue3 = (String) obj;
                long jLongValue3 = ((Long) obj2).longValue();
                kotlin.jvm.internal.m.f(bookmarkValue3, "bookmarkValue");
                return this.f57931b.v(jLongValue3, bookmarkValue3);
            default:
                this.f57931b.t(new wb(-1L, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue()));
                return qy.b0.f48488a;
        }
    }
}
