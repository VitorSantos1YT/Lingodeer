package jt;

import com.google.api.Service;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i0 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f36969b;

    public /* synthetic */ i0(int i11, l1.b1 b1Var) {
        this.f36968a = i11;
        this.f36969b = b1Var;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f36968a) {
            case 0:
                l1.b1 b1Var = this.f36969b;
                return Boolean.valueOf(b1Var.getValue() == ht.q.DEFAULT || b1Var.getValue() == ht.q.SELECTED);
            case 1:
                l1.b1 b1Var2 = this.f36969b;
                return Boolean.valueOf(b1Var2.getValue() == ht.q.DEFAULT || b1Var2.getValue() == ht.q.SELECTED);
            case 2:
                l1.b1 b1Var3 = this.f36969b;
                return Boolean.valueOf(b1Var3.getValue() == ht.q.DEFAULT || b1Var3.getValue() == ht.q.SELECTED);
            case 3:
                l1.b1 b1Var4 = this.f36969b;
                return Boolean.valueOf(b1Var4.getValue() == ht.q.DEFAULT || b1Var4.getValue() == ht.q.SELECTED);
            case 4:
                l1.b1 b1Var5 = this.f36969b;
                return Boolean.valueOf(b1Var5.getValue() == ht.q.DEFAULT || b1Var5.getValue() == ht.q.SELECTED);
            case 5:
                l1.b1 b1Var6 = this.f36969b;
                return Boolean.valueOf(b1Var6.getValue() == ht.q.DEFAULT || b1Var6.getValue() == ht.q.SELECTED);
            case 6:
                l1.b1 b1Var7 = this.f36969b;
                return Boolean.valueOf(b1Var7.getValue() == ht.q.DEFAULT || b1Var7.getValue() == ht.q.SELECTED);
            case 7:
                l1.b1 b1Var8 = this.f36969b;
                return Boolean.valueOf(b1Var8.getValue() == ht.q.DEFAULT || b1Var8.getValue() == ht.q.SELECTED);
            case 8:
                l1.b1 b1Var9 = this.f36969b;
                return Boolean.valueOf(b1Var9.getValue() == ht.q.DEFAULT || b1Var9.getValue() == ht.q.SELECTED);
            case 9:
                this.f36969b.setValue(Boolean.FALSE);
                return qy.b0.f48488a;
            case 10:
                this.f36969b.setValue(Boolean.FALSE);
                return qy.b0.f48488a;
            case 11:
                this.f36969b.setValue(Boolean.TRUE);
                return qy.b0.f48488a;
            case 12:
                this.f36969b.setValue(Boolean.FALSE);
                return qy.b0.f48488a;
            case 13:
                this.f36969b.setValue(Boolean.FALSE);
                return qy.b0.f48488a;
            case 14:
                this.f36969b.setValue(0);
                return qy.b0.f48488a;
            case 15:
                this.f36969b.setValue(1);
                return qy.b0.f48488a;
            case 16:
                this.f36969b.setValue(2);
                return qy.b0.f48488a;
            case 17:
                return new l0.h((fz.c) this.f36969b.getValue());
            case 18:
                this.f36969b.setValue(lt.h.f40325a);
                return qy.b0.f48488a;
            case 19:
                this.f36969b.setValue(null);
                return qy.b0.f48488a;
            case 20:
                return new m0.j((fz.c) this.f36969b.getValue());
            case 21:
                this.f36969b.setValue(null);
                return qy.b0.f48488a;
            case 22:
                this.f36969b.setValue(Boolean.TRUE);
                return qy.b0.f48488a;
            case 23:
                this.f36969b.setValue(Boolean.FALSE);
                return qy.b0.f48488a;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                this.f36969b.setValue(0);
                return qy.b0.f48488a;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                this.f36969b.setValue(1);
                return qy.b0.f48488a;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                this.f36969b.setValue(Boolean.TRUE);
                return qy.b0.f48488a;
            case 27:
                return Integer.valueOf(((List) this.f36969b.getValue()).size());
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                this.f36969b.setValue(Boolean.TRUE);
                return qy.b0.f48488a;
            default:
                this.f36969b.setValue(null);
                return qy.b0.f48488a;
        }
    }
}
