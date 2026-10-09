package dt;

import com.google.api.Service;
import com.lingo.story.ui.StoryActivity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h2 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f23854b;

    public /* synthetic */ h2(int i11, l1.b1 b1Var) {
        this.f23853a = i11;
        this.f23854b = b1Var;
    }

    @Override // fz.a
    public final Object invoke() {
        int i11 = this.f23853a;
        qy.b0 b0Var = qy.b0.f48488a;
        l1.b1 b1Var = this.f23854b;
        switch (i11) {
            case 0:
                b1Var.setValue(Boolean.TRUE);
                return b0Var;
            case 1:
                b1Var.setValue(Boolean.FALSE);
                return b0Var;
            case 2:
                b1Var.setValue(Boolean.FALSE);
                return b0Var;
            case 3:
                b1Var.setValue(null);
                return b0Var;
            case 4:
                b1Var.setValue(Boolean.FALSE);
                return b0Var;
            case 5:
                b1Var.setValue(Boolean.FALSE);
                return b0Var;
            case 6:
                b1Var.setValue(Boolean.TRUE);
                return b0Var;
            case 7:
                b1Var.setValue(Boolean.FALSE);
                return b0Var;
            case 8:
                b1Var.setValue(Boolean.FALSE);
                return b0Var;
            case 9:
                b1Var.setValue(Boolean.TRUE);
                return b0Var;
            case 10:
                b1Var.setValue(Boolean.FALSE);
                return b0Var;
            case 11:
                b1Var.setValue(Boolean.TRUE);
                return b0Var;
            case 12:
                return (g1.e) b1Var.getValue();
            case 13:
                b1Var.setValue(Boolean.FALSE);
                return b0Var;
            case 14:
                b1Var.setValue(Boolean.valueOf(!((Boolean) b1Var.getValue()).booleanValue()));
                return b0Var;
            case 15:
                b1Var.setValue(Boolean.FALSE);
                return b0Var;
            case 16:
                b1Var.setValue(Boolean.FALSE);
                return b0Var;
            case 17:
                int i12 = StoryActivity.N;
                b1Var.setValue(Boolean.TRUE);
                return b0Var;
            case 18:
                int i13 = StoryActivity.N;
                b1Var.setValue(Boolean.FALSE);
                return b0Var;
            case 19:
                b1Var.setValue(Integer.valueOf(((Number) b1Var.getValue()).intValue() + 10));
                return b0Var;
            case 20:
                b1Var.setValue(Integer.valueOf(((Number) b1Var.getValue()).intValue() - 10));
                return b0Var;
            case 21:
                b1Var.setValue(Boolean.TRUE);
                return b0Var;
            case 22:
                b1Var.setValue(Boolean.FALSE);
                return b0Var;
            case 23:
                b1Var.setValue(Boolean.FALSE);
                return b0Var;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                b1Var.setValue(Boolean.TRUE);
                return b0Var;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                b1Var.setValue(Boolean.FALSE);
                return b0Var;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                b1Var.setValue(Boolean.TRUE);
                return b0Var;
            case 27:
                return Boolean.valueOf(b1Var.getValue() == ht.q.DEFAULT || b1Var.getValue() == ht.q.SELECTED);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return Boolean.valueOf(b1Var.getValue() == ht.q.DEFAULT || b1Var.getValue() == ht.q.SELECTED);
            default:
                return Boolean.valueOf(b1Var.getValue() == ht.q.DEFAULT || b1Var.getValue() == ht.q.SELECTED);
        }
    }
}
