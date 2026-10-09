package mt;

import android.os.Bundle;
import com.google.api.Service;
import com.google.zxing.pdf417.decoder.vBn.xTCJ;
import com.lingodeer.data.model.AchievementLevel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n4 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f41693b;

    public /* synthetic */ n4(int i11, l1.b1 b1Var) {
        this.f41692a = i11;
        this.f41693b = b1Var;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f41692a) {
            case 0:
                this.f41693b.setValue(t6.f41931a);
                return qy.b0.f48488a;
            case 1:
                this.f41693b.setValue(u6.f41963a);
                return qy.b0.f48488a;
            case 2:
                this.f41693b.setValue(Boolean.FALSE);
                return qy.b0.f48488a;
            case 3:
                this.f41693b.setValue(Boolean.FALSE);
                return qy.b0.f48488a;
            case 4:
                y3.o(this.f41693b, true);
                return qy.b0.f48488a;
            case 5:
                this.f41693b.setValue(Boolean.TRUE);
                return qy.b0.f48488a;
            case 6:
                y3.o(this.f41693b, false);
                return qy.b0.f48488a;
            case 7:
                this.f41693b.setValue(Boolean.FALSE);
                return qy.b0.f48488a;
            case 8:
                this.f41693b.setValue(Boolean.FALSE);
                return qy.b0.f48488a;
            case 9:
                this.f41693b.setValue(Boolean.FALSE);
                return qy.b0.f48488a;
            case 10:
                this.f41693b.setValue(Boolean.TRUE);
                return qy.b0.f48488a;
            case 11:
                this.f41693b.setValue(null);
                return qy.b0.f48488a;
            case 12:
                this.f41693b.setValue(Boolean.FALSE);
                return qy.b0.f48488a;
            case 13:
                this.f41693b.setValue(Boolean.FALSE);
                return qy.b0.f48488a;
            case 14:
                this.f41693b.setValue(Boolean.TRUE);
                return qy.b0.f48488a;
            case 15:
                this.f41693b.setValue(Boolean.FALSE);
                return qy.b0.f48488a;
            case 16:
                return (n0.a0) ((fz.a) this.f41693b.getValue()).invoke();
            case 17:
                this.f41693b.setValue(Boolean.TRUE);
                return qy.b0.f48488a;
            case 18:
                this.f41693b.setValue(Boolean.FALSE);
                return qy.b0.f48488a;
            case 19:
                this.f41693b.setValue(Boolean.FALSE);
                return qy.b0.f48488a;
            case 20:
                this.f41693b.setValue(Boolean.FALSE);
                return qy.b0.f48488a;
            case 21:
                this.f41693b.setValue(Boolean.FALSE);
                return qy.b0.f48488a;
            case 22:
                this.f41693b.setValue(Boolean.TRUE);
                return qy.b0.f48488a;
            case 23:
                this.f41693b.setValue(Boolean.FALSE);
                return qy.b0.f48488a;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return Integer.valueOf(((List) this.f41693b.getValue()).size());
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                this.f41693b.setValue(Boolean.TRUE);
                return qy.b0.f48488a;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                Bundle bundle = new Bundle();
                l1.b1 b1Var = this.f41693b;
                bundle.putString(xTCJ.mtvZXK, ve.i.A((AchievementLevel) b1Var.getValue()));
                bundle.putString("level", String.valueOf(((AchievementLevel) b1Var.getValue()).getLevel()));
                bundle.putString("status", ((AchievementLevel) b1Var.getValue()).isActive() ? "active" : "not_active");
                return bundle;
            case 27:
                Bundle bundle2 = new Bundle();
                l1.b1 b1Var2 = this.f41693b;
                bundle2.putString("type", ve.i.A((AchievementLevel) b1Var2.getValue()));
                bundle2.putString("level", String.valueOf(((AchievementLevel) b1Var2.getValue()).getLevel()));
                bundle2.putString("status", ((AchievementLevel) b1Var2.getValue()).isActive() ? "active" : "not_active");
                return bundle2;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                this.f41693b.setValue(Boolean.TRUE);
                return qy.b0.f48488a;
            default:
                this.f41693b.setValue(Boolean.TRUE);
                return qy.b0.f48488a;
        }
    }
}
