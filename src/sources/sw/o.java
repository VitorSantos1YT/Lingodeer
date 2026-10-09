package sw;

import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class o implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f51880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f51881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lw.f f51882c;

    public o(p pVar, lw.f fVar, int i11) {
        this.f51880a = i11;
        switch (i11) {
            case 1:
                Preconditions.e("success rate ejection config is null", pVar.f51887e != null);
                this.f51881b = pVar;
                this.f51882c = fVar;
                break;
            default:
                this.f51881b = pVar;
                this.f51882c = fVar;
                break;
        }
    }

    @Override // sw.u
    public final void a(d7.k kVar, long j11) {
        int i11;
        int i12;
        double d5;
        switch (this.f51880a) {
            case 0:
                p pVar = this.f51881b;
                ArrayList arrayListH = v.h(kVar, ((Integer) pVar.f51888f.f23493e).intValue());
                int size = arrayListH.size();
                dm.c cVar = pVar.f51888f;
                if (size >= ((Integer) cVar.f23492d).intValue() && arrayListH.size() != 0) {
                    int size2 = arrayListH.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        Object obj = arrayListH.get(i13);
                        i13++;
                        n nVar = (n) obj;
                        if (kVar.r0() >= pVar.f51886d.intValue()) {
                            break;
                        } else if (nVar.c() >= ((Integer) cVar.f23493e).intValue()) {
                            if (((AtomicLong) nVar.f51876c.f48096c).get() / nVar.c() > ((double) ((Integer) cVar.f23490b).intValue()) / 100.0d) {
                                this.f51882c.i(lw.e.DEBUG, "FailurePercentage algorithm detected outlier: {0}, failureRate={1}", nVar, Double.valueOf(((AtomicLong) nVar.f51876c.f48096c).get() / nVar.c()));
                                if (new Random().nextInt(100) < ((Integer) cVar.f23491c).intValue()) {
                                    nVar.b(j11);
                                }
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                p pVar2 = this.f51881b;
                ArrayList arrayListH2 = v.h(kVar, ((Integer) pVar2.f51887e.f44816e).intValue());
                int size3 = arrayListH2.size();
                ob.i iVar = pVar2.f51887e;
                if (size3 >= ((Integer) iVar.f44815d).intValue() && arrayListH2.size() != 0) {
                    ArrayList arrayList = new ArrayList();
                    int size4 = arrayListH2.size();
                    int i14 = 0;
                    int i15 = 0;
                    while (i15 < size4) {
                        Object obj2 = arrayListH2.get(i15);
                        i15++;
                        n nVar2 = (n) obj2;
                        arrayList.add(Double.valueOf(((AtomicLong) nVar2.f51876c.f48095b).get() / nVar2.c()));
                    }
                    int size5 = arrayList.size();
                    double d11 = 0.0d;
                    int i16 = 0;
                    double dDoubleValue = 0.0d;
                    while (i16 < size5) {
                        Object obj3 = arrayList.get(i16);
                        i16++;
                        dDoubleValue += ((Double) obj3).doubleValue();
                    }
                    double size6 = dDoubleValue / ((double) arrayList.size());
                    int size7 = arrayList.size();
                    int i17 = 0;
                    while (i17 < size7) {
                        Object obj4 = arrayList.get(i17);
                        i17++;
                        double dDoubleValue2 = ((Double) obj4).doubleValue() - size6;
                        d11 += dDoubleValue2 * dDoubleValue2;
                    }
                    double dSqrt = Math.sqrt(d11 / ((double) arrayList.size()));
                    double dIntValue = size6 - (((double) (((Integer) iVar.f44813b).intValue() / 1000.0f)) * dSqrt);
                    int size8 = arrayListH2.size();
                    while (i14 < size8) {
                        Object obj5 = arrayListH2.get(i14);
                        int i18 = i14 + 1;
                        n nVar3 = (n) obj5;
                        ArrayList arrayList2 = arrayListH2;
                        p pVar3 = pVar2;
                        if (kVar.r0() < pVar2.f51886d.intValue()) {
                            if (((AtomicLong) nVar3.f51876c.f48095b).get() / nVar3.c() < dIntValue) {
                                i11 = size8;
                                i12 = i18;
                                d5 = dSqrt;
                                this.f51882c.i(lw.e.DEBUG, "SuccessRate algorithm detected outlier: {0}. Parameters: successRate={1}, mean={2}, stdev={3}, requiredSuccessRate={4}", nVar3, Double.valueOf(((AtomicLong) nVar3.f51876c.f48095b).get() / nVar3.c()), Double.valueOf(size6), Double.valueOf(dSqrt), Double.valueOf(dIntValue));
                                if (new Random().nextInt(100) < ((Integer) iVar.f44814c).intValue()) {
                                    nVar3.b(j11);
                                }
                            } else {
                                i11 = size8;
                                i12 = i18;
                                d5 = dSqrt;
                            }
                            size8 = i11;
                            i14 = i12;
                            arrayListH2 = arrayList2;
                            pVar2 = pVar3;
                            dSqrt = d5;
                        }
                        break;
                    }
                    break;
                }
                break;
        }
    }
}
