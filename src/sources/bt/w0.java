package bt;

import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.OptionItemSelectedState;
import com.yalantis.ucrop.view.CropImageView;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w0 implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6131a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f6132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CourseWord f6133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.c f6134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j3.y0 f6135e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l1.b3 f6136f;

    public /* synthetic */ w0(CourseWord courseWord, boolean z11, fz.c cVar, j3.y0 y0Var, l1.b3 b3Var) {
        this.f6133c = courseWord;
        this.f6132b = z11;
        this.f6134d = cVar;
        this.f6135e = y0Var;
        this.f6136f = b3Var;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f6131a) {
            case 0:
                j0.v Card = (j0.v) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(Card, "$this$Card");
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    CourseWord courseWord = this.f6133c;
                    boolean zF = sVar.f(courseWord.getWord());
                    Object objQ = sVar.Q();
                    l1.g gVar = l1.m.f39353a;
                    if (zF || objQ == gVar) {
                        String input = courseWord.getWord();
                        Pattern patternCompile = Pattern.compile("[ˉˊˇˋ]");
                        kotlin.jvm.internal.m.e(patternCompile, "compile(...)");
                        kotlin.jvm.internal.m.f(input, "input");
                        objQ = Boolean.valueOf(patternCompile.matcher(input).matches());
                        sVar.o0(objQ);
                    }
                    boolean zBooleanValue = ((Boolean) objQ).booleanValue();
                    fz.c cVar = this.f6134d;
                    boolean zF2 = sVar.f(cVar) | sVar.h(courseWord);
                    Object objQ2 = sVar.Q();
                    if (zF2 || objQ2 == gVar) {
                        objQ2 = new s0(cVar, courseWord, 2);
                        sVar.o0(objQ2);
                    }
                    z1.o oVar = z1.o.f58481a;
                    z1.r rVarY = j0.c.y(iu.k.q(6, 6, (fz.a) objQ2, sVar, oVar, this.f6132b), CropImageView.DEFAULT_ASPECT_RATIO, zBooleanValue ? 6 : 0, 1);
                    w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                    int iHashCode = Long.hashCode(sVar.T);
                    l1.q1 q1VarL = sVar.l();
                    z1.r rVarC = z1.a.c(sVar, rVarY);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, q0VarD, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL, sVar);
                    y2.h hVar = y2.j.f56918g;
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC, sVar);
                    dt.g4.b(CourseWord.copy$default(courseWord, 0L, courseWord.getOriginalWord(), null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -3, 63, null), j3.y0.a(this.f6135e, ((g2.x) this.f6136f.getValue()).f28624a, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214), dt.a0.v(oVar), false, null, false, false, false, 0, null, sVar, 0, 1016);
                    sVar.p(true);
                } else {
                    sVar.W();
                }
                break;
            default:
                j0.v Card2 = (j0.v) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(Card2, "$this$Card");
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    boolean z11 = this.f6132b;
                    CourseWord courseWord2 = this.f6133c;
                    boolean z12 = z11 && courseWord2.getSelectedState() == OptionItemSelectedState.DEFAULT;
                    fz.c cVar2 = this.f6134d;
                    boolean zF3 = sVar2.f(cVar2) | sVar2.h(courseWord2);
                    Object objQ3 = sVar2.Q();
                    if (zF3 || objQ3 == l1.m.f39353a) {
                        objQ3 = new s0(cVar2, courseWord2, 6);
                        sVar2.o0(objQ3);
                    }
                    z1.o oVar2 = z1.o.f58481a;
                    z1.r rVarQ = iu.k.q(6, 6, (fz.a) objQ3, sVar2, oVar2, z12);
                    w2.q0 q0VarD2 = j0.o.d(z1.c.f58463a, false);
                    int iHashCode2 = Long.hashCode(sVar2.T);
                    l1.q1 q1VarL2 = sVar2.l();
                    z1.r rVarC2 = z1.a.c(sVar2, rVarQ);
                    y2.k.J.getClass();
                    y2.i iVar2 = y2.j.f56913b;
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar2);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(y2.j.f56917f, q0VarD2, sVar2);
                    l1.t.J(y2.j.f56916e, q1VarL2, sVar2);
                    y2.h hVar2 = y2.j.f56918g;
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar2);
                    }
                    l1.t.J(y2.j.f56915d, rVarC2, sVar2);
                    dt.g4.b(CourseWord.copy$default(courseWord2, 0L, courseWord2.getOriginalWord(), null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -3, 63, null), j3.y0.a(this.f6135e, ((g2.x) this.f6136f.getValue()).f28624a, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214), dt.a0.v(oVar2), false, null, false, false, false, 0, null, sVar2, 0, 1016);
                    sVar2.p(true);
                } else {
                    sVar2.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ w0(boolean z11, CourseWord courseWord, fz.c cVar, j3.y0 y0Var, l1.b3 b3Var) {
        this.f6132b = z11;
        this.f6133c = courseWord;
        this.f6134d = cVar;
        this.f6135e = y0Var;
        this.f6136f = b3Var;
    }
}
