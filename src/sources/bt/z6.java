package bt;

import com.google.api.Service;
import com.lingo.course.ui.CourseTestIndexActivity;
import com.lingo.me.MeSettingsActivity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class z6 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f6274b;

    public /* synthetic */ z6(int i11, l1.b1 b1Var) {
        this.f6273a = i11;
        this.f6274b = b1Var;
    }

    @Override // fz.a
    public final Object invoke() {
        int i11 = this.f6273a;
        boolean z11 = true;
        qy.b0 b0Var = qy.b0.f48488a;
        l1.b1 b1Var = this.f6274b;
        switch (i11) {
            case 0:
                b1Var.setValue(ht.a.f33722e);
                return b0Var;
            case 1:
                if (b1Var.getValue() != ht.q.DEFAULT && b1Var.getValue() != ht.q.SELECTED) {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            case 2:
                if (b1Var.getValue() != ht.q.DEFAULT && b1Var.getValue() != ht.q.SELECTED) {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            case 3:
                b1Var.setValue(ht.a.f33722e);
                return b0Var;
            case 4:
                b1Var.setValue(ht.a.f33722e);
                return b0Var;
            case 5:
                b1Var.setValue(ht.a.f33722e);
                return b0Var;
            case 6:
                b1Var.setValue(ht.a.f33722e);
                return b0Var;
            case 7:
                b1Var.setValue(ht.a.f33722e);
                return b0Var;
            case 8:
                b1Var.setValue(ht.a.f33722e);
                return b0Var;
            case 9:
                b1Var.setValue(ht.a.f33722e);
                return b0Var;
            case 10:
                b1Var.setValue(ht.a.f33722e);
                return b0Var;
            case 11:
                b1Var.setValue(ht.a.f33722e);
                return b0Var;
            case 12:
                b1Var.setValue(ht.a.f33722e);
                return b0Var;
            case 13:
                if (b1Var.getValue() != ht.q.DEFAULT && b1Var.getValue() != ht.q.SELECTED) {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            case 14:
                b1Var.setValue(ht.a.f33722e);
                return b0Var;
            case 15:
                b1Var.setValue(ht.a.f33722e);
                return b0Var;
            case 16:
                b1Var.setValue(ht.a.f33722e);
                return b0Var;
            case 17:
                b1Var.setValue(ht.a.f33722e);
                return b0Var;
            case 18:
                b1Var.setValue(ht.a.f33722e);
                return b0Var;
            case 19:
                if (b1Var.getValue() != ht.q.DEFAULT && b1Var.getValue() != ht.q.SELECTED) {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            case 20:
                b1Var.setValue(ht.a.f33722e);
                return b0Var;
            case 21:
                b1Var.setValue(Boolean.FALSE);
                return b0Var;
            case 22:
                b1Var.setValue(Boolean.FALSE);
                return b0Var;
            case 23:
                int i12 = CourseTestIndexActivity.N;
                b1Var.setValue(Boolean.FALSE);
                return b0Var;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                int i13 = MeSettingsActivity.f22221t;
                b1Var.setValue(Boolean.TRUE);
                return b0Var;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                int i14 = MeSettingsActivity.f22221t;
                b1Var.setValue(Boolean.FALSE);
                return b0Var;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                int i15 = MeSettingsActivity.f22221t;
                b1Var.setValue(Boolean.FALSE);
                return b0Var;
            case 27:
                b1Var.setValue(Boolean.FALSE);
                return b0Var;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                b1Var.setValue(Boolean.FALSE);
                return b0Var;
            default:
                b1Var.setValue(Boolean.TRUE);
                return b0Var;
        }
    }
}
