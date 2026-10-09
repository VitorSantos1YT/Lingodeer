package bp;

import com.google.api.Service;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f4753b;

    public /* synthetic */ p(int i11, l1.b1 b1Var) {
        this.f4752a = i11;
        this.f4753b = b1Var;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f4752a) {
            case 0:
                this.f4753b.setValue(Boolean.TRUE);
                return qy.b0.f48488a;
            case 1:
                this.f4753b.setValue(Boolean.FALSE);
                return qy.b0.f48488a;
            case 2:
                this.f4753b.setValue(null);
                return qy.b0.f48488a;
            case 3:
                this.f4753b.setValue(null);
                return qy.b0.f48488a;
            case 4:
                this.f4753b.setValue(Boolean.FALSE);
                return qy.b0.f48488a;
            case 5:
                this.f4753b.setValue(Boolean.FALSE);
                return qy.b0.f48488a;
            case 6:
                this.f4753b.setValue(Boolean.FALSE);
                return qy.b0.f48488a;
            case 7:
                l1.b1 b1Var = this.f4753b;
                b1Var.setValue(Boolean.valueOf(!((Boolean) b1Var.getValue()).booleanValue()));
                return qy.b0.f48488a;
            case 8:
                this.f4753b.setValue(Boolean.FALSE);
                return qy.b0.f48488a;
            case 9:
                this.f4753b.setValue(Boolean.FALSE);
                return qy.b0.f48488a;
            case 10:
                this.f4753b.setValue(Boolean.FALSE);
                return qy.b0.f48488a;
            case 11:
                this.f4753b.setValue(Boolean.TRUE);
                return qy.b0.f48488a;
            case 12:
                this.f4753b.setValue(Boolean.FALSE);
                return qy.b0.f48488a;
            case 13:
                this.f4753b.setValue(Boolean.TRUE);
                return qy.b0.f48488a;
            case 14:
                this.f4753b.setValue(ht.a.f33722e);
                return qy.b0.f48488a;
            case 15:
                f2.c cVar = (f2.c) this.f4753b.getValue();
                return Boolean.valueOf(cVar != null && cVar.f26574c - cVar.f26572a > CropImageView.DEFAULT_ASPECT_RATIO && cVar.f26575d - cVar.f26573b > CropImageView.DEFAULT_ASPECT_RATIO);
            case 16:
                Boolean bool = (Boolean) this.f4753b.getValue();
                bool.booleanValue();
                return bool;
            case 17:
                this.f4753b.setValue(Boolean.TRUE);
                return qy.b0.f48488a;
            case 18:
                this.f4753b.setValue(Boolean.FALSE);
                return qy.b0.f48488a;
            case 19:
                this.f4753b.setValue(Boolean.FALSE);
                return qy.b0.f48488a;
            case 20:
                this.f4753b.setValue(Boolean.TRUE);
                return qy.b0.f48488a;
            case 21:
                this.f4753b.setValue(ht.a.f33722e);
                return qy.b0.f48488a;
            case 22:
                this.f4753b.setValue(ht.a.f33722e);
                return qy.b0.f48488a;
            case 23:
                l1.b1 b1Var2 = this.f4753b;
                return Boolean.valueOf(b1Var2.getValue() == ht.q.DEFAULT || b1Var2.getValue() == ht.q.SELECTED);
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                this.f4753b.setValue(ht.a.f33722e);
                return qy.b0.f48488a;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                this.f4753b.setValue(ht.a.f33722e);
                return qy.b0.f48488a;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                this.f4753b.setValue(ht.a.f33722e);
                return qy.b0.f48488a;
            case 27:
                l1.b1 b1Var3 = this.f4753b;
                return Boolean.valueOf(b1Var3.getValue() == ht.q.DEFAULT || b1Var3.getValue() == ht.q.SELECTED);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                this.f4753b.setValue(ht.a.f33722e);
                return qy.b0.f48488a;
            default:
                this.f4753b.setValue(ht.a.f33722e);
                return qy.b0.f48488a;
        }
    }
}
