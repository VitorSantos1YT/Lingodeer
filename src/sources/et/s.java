package et;

import com.lingodeer.data.model.CourseSentence;
import java.util.List;
import l1.b1;
import rt.qa;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jt.v f25901b;

    public /* synthetic */ s(jt.v vVar, int i11) {
        this.f25900a = i11;
        this.f25901b = vVar;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f25900a) {
            case 0:
                jt.v vVar = this.f25901b;
                x1.p pVar = vVar.f37218i;
                CourseSentence courseSentenceA = ((o) ry.m.z0(pVar)).a();
                if (courseSentenceA != null) {
                    ry.m.N0(pVar);
                    pVar.add(new h(courseSentenceA));
                    vVar.f37222n.setValue(vVar.f37217h.getValue());
                }
                return qy.b0.f48488a;
            case 1:
                jt.v vVar2 = this.f25901b;
                vVar2.f37218i.clear();
                vVar2.f37217h.setValue(0);
                vVar2.f37221l.setValue(Boolean.FALSE);
                return qy.b0.f48488a;
            case 2:
                this.f25901b.f37225q.setValue(Boolean.TRUE);
                return qy.b0.f48488a;
            case 3:
                this.f25901b.i();
                return qy.b0.f48488a;
            case 4:
                jt.v vVar3 = this.f25901b;
                vVar3.f37227s.setValue(Boolean.FALSE);
                b1 b1Var = vVar3.f37217h;
                if (((Number) b1Var.getValue()).intValue() < ((List) vVar3.f37216g.getValue()).size() - 1) {
                    b1Var.setValue(Integer.valueOf(((Number) b1Var.getValue()).intValue() + 1));
                } else {
                    vVar3.f37221l.setValue(Boolean.TRUE);
                }
                return qy.b0.f48488a;
            case 5:
                jt.v vVar4 = this.f25901b;
                vVar4.f37218i.clear();
                vVar4.f37217h.setValue(0);
                vVar4.f37221l.setValue(Boolean.FALSE);
                return qy.b0.f48488a;
            default:
                jt.v vVar5 = this.f25901b;
                List list = (List) vVar5.f37216g.getValue();
                x1.p pVar2 = vVar5.f37218i;
                pVar2.getClass();
                return new qa(list, x1.q.e(pVar2).f55734c, ((Number) vVar5.f37217h.getValue()).intValue(), ((Boolean) vVar5.f37221l.getValue()).booleanValue());
        }
    }
}
