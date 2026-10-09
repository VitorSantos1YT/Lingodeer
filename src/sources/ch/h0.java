package ch;

import com.lingo.course.ui.CourseTestIndexActivity;
import l1.b1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h0 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f7043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f7044c;

    public /* synthetic */ h0(b1 b1Var, b1 b1Var2, int i11) {
        this.f7042a = i11;
        this.f7043b = b1Var;
        this.f7044c = b1Var2;
    }

    @Override // fz.a
    public final Object invoke() {
        int i11 = this.f7042a;
        qy.b0 b0Var = qy.b0.f48488a;
        b1 b1Var = this.f7044c;
        b1 b1Var2 = this.f7043b;
        switch (i11) {
            case 0:
                int i12 = CourseTestIndexActivity.N;
                b1Var2.setValue(Boolean.FALSE);
                b1Var.setValue(null);
                break;
            case 1:
                b1Var2.setValue("smart");
                b1Var.setValue(Boolean.TRUE);
                break;
            case 2:
                b1Var2.setValue("daily");
                b1Var.setValue(Boolean.TRUE);
                break;
            case 3:
                Boolean bool = Boolean.TRUE;
                b1Var2.setValue(bool);
                b1Var.setValue(bool);
                break;
            case 4:
                b1Var2.setValue(null);
                b1Var.setValue(Boolean.TRUE);
                break;
            case 5:
                b1Var2.setValue(Boolean.FALSE);
                b1Var.setValue(Boolean.TRUE);
                break;
            case 6:
                b1Var2.setValue(null);
                b1Var.setValue(Boolean.FALSE);
                break;
            case 7:
                b1Var2.setValue(null);
                b1Var.setValue(Boolean.FALSE);
                break;
            case 8:
                b1Var2.setValue(null);
                b1Var.setValue(Boolean.FALSE);
                break;
            case 9:
                b1Var2.setValue(null);
                b1Var.setValue(Boolean.FALSE);
                break;
            case 10:
                Boolean bool2 = Boolean.TRUE;
                b1Var2.setValue(bool2);
                b1Var.setValue(bool2);
                break;
            case 11:
                b1Var2.setValue(Boolean.TRUE);
                b1Var.setValue(Boolean.FALSE);
                break;
            case 12:
                b1Var2.setValue(null);
                b1Var.setValue(Boolean.FALSE);
                break;
            case 13:
                b1Var2.setValue(null);
                b1Var.setValue(Boolean.FALSE);
                break;
            case 14:
                b1Var2.setValue(null);
                b1Var.setValue(Boolean.FALSE);
                break;
            default:
                b1Var2.setValue(null);
                b1Var.setValue(Boolean.FALSE);
                break;
        }
        return b0Var;
    }
}
