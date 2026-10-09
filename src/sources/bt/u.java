package bt;

import com.google.accompanist.permissions.PermissionState;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.OptionItemSelectedState;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class u implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6040a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f6041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f6042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6044e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f6045f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f6046t;

    public /* synthetic */ u(ys.d0 d0Var, ht.o oVar, boolean z11, ot.u1 u1Var, l1.b1 b1Var, l1.b1 b1Var2) {
        this.f6043d = d0Var;
        this.f6044e = oVar;
        this.f6041b = z11;
        this.f6045f = u1Var;
        this.f6042c = b1Var;
        this.f6046t = b1Var2;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f6040a) {
            case 0:
                fz.a aVar = (fz.a) this.f6043d;
                jt.g gVar = (jt.g) this.f6044e;
                rz.b0 b0Var = (rz.b0) this.f6045f;
                PermissionState permissionState = (PermissionState) this.f6046t;
                if (this.f6041b) {
                    aVar.invoke();
                    if (((Boolean) this.f6042c.getValue()).booleanValue()) {
                        gVar.g(b0Var, gVar.f36935d);
                    } else {
                        permissionState.a();
                    }
                }
                break;
            default:
                ys.d0 d0Var = (ys.d0) this.f6043d;
                ht.o oVar = (ht.o) this.f6044e;
                ot.u1 u1Var = (ot.u1) this.f6045f;
                l1.b1 b1Var = (l1.b1) this.f6046t;
                l1.b1 b1Var2 = this.f6042c;
                List<CourseWord> list = (List) b1Var2.getValue();
                ArrayList arrayList = new ArrayList(ry.n.W(list, 10));
                for (CourseWord courseWordCopy$default : list) {
                    if (courseWordCopy$default.getSelectedState() == OptionItemSelectedState.SELECTED) {
                        if (courseWordCopy$default.getWordId() == u1Var.f46012a.getWordId()) {
                            b1Var.setValue(ht.q.CORRECT);
                            courseWordCopy$default = CourseWord.copy$default(courseWordCopy$default, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.CORRECT, null, null, 0, -1, 59, null);
                        } else {
                            b1Var.setValue(ht.q.WRONG);
                            courseWordCopy$default = CourseWord.copy$default(courseWordCopy$default, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.WRONG, null, null, 0, -1, 59, null);
                        }
                    }
                    arrayList.add(courseWordCopy$default);
                }
                b1Var2.setValue(arrayList);
                if (d0Var != null) {
                    boolean z11 = ((ht.q) b1Var.getValue()) == ht.q.CORRECT;
                    d0Var.b(z11, z11);
                }
                if (!oVar.f33757e && this.f6041b && d0Var != null) {
                    String string = u1Var.f46012a.getAudioUri().toString();
                    kotlin.jvm.internal.m.e(string, "toString(...)");
                    ys.d0.e(d0Var, string, null, 6);
                }
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ u(boolean z11, fz.a aVar, jt.g gVar, rz.b0 b0Var, PermissionState permissionState, l1.b1 b1Var) {
        this.f6041b = z11;
        this.f6043d = aVar;
        this.f6044e = gVar;
        this.f6045f = b0Var;
        this.f6046t = permissionState;
        this.f6042c = b1Var;
    }
}
