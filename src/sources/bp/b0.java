package bp;

import android.os.Bundle;
import com.lingo.lingoskill.object.LanguageExpandableItem2;
import com.lingodeer.data.model.CourseCharacter;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.SyllableWriteCharacter;
import com.lingodeer.data.model.uistate.WordSentenceCharacterType;
import com.yalantis.ucrop.view.CropImageView;
import java.util.List;
import mt.j6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b0 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f4495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4497d;

    public /* synthetic */ b0(WordSentenceCharacterType wordSentenceCharacterType, z1.r rVar, boolean z11, int i11) {
        this.f4494a = 8;
        this.f4497d = wordSentenceCharacterType;
        this.f4496c = rVar;
        this.f4495b = z11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4494a) {
            case 0:
                ((Integer) obj2).getClass();
                g1.h((LanguageExpandableItem2) this.f4497d, this.f4495b, (fz.a) this.f4496c, (l1.n) obj, l1.t.M(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                g1.f(this.f4495b, (fz.a) this.f4496c, (fz.c) this.f4497d, (l1.n) obj, l1.t.M(1));
                break;
            case 2:
                jt.u uVar = (jt.u) this.f4497d;
                rz.b0 b0Var = (rz.b0) this.f4496c;
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zH = sVar.h(b0Var) | sVar.h(uVar);
                    Object objQ = sVar.Q();
                    if (zH || objQ == l1.m.f39353a) {
                        objQ = new bt.o0(b0Var, uVar, 0);
                        sVar.o0(objQ);
                    }
                    bt.b.d(uVar, this.f4495b, (fz.c) objQ, sVar, 0);
                } else {
                    sVar.W();
                }
                return qy.b0.f48488a;
            case 3:
                ((Integer) obj2).getClass();
                bt.b.t((List) this.f4497d, this.f4495b, (fz.c) this.f4496c, (l1.n) obj, l1.t.M(1));
                break;
            case 4:
                jt.j0 j0Var = (jt.j0) this.f4497d;
                rz.b0 b0Var2 = (rz.b0) this.f4496c;
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    List list = (List) j0Var.f36994f.getValue();
                    boolean zH2 = sVar2.h(b0Var2) | sVar2.h(j0Var);
                    Object objQ2 = sVar2.Q();
                    if (zH2 || objQ2 == l1.m.f39353a) {
                        objQ2 = new bt.j3(b0Var2, j0Var, 1);
                        sVar2.o0(objQ2);
                    }
                    bt.b.o(list, this.f4495b, (fz.c) objQ2, sVar2, 0);
                } else {
                    sVar2.W();
                }
                return qy.b0.f48488a;
            case 5:
                ((Integer) obj2).getClass();
                dt.e.a((CourseWord) this.f4497d, this.f4495b, (fz.c) this.f4496c, (l1.n) obj, l1.t.M(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                gs.a.m((bs.c) this.f4497d, this.f4495b, (fz.a) this.f4496c, (l1.n) obj, l1.t.M(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                iv.a.e((CourseCharacter) this.f4497d, this.f4495b, (fz.c) this.f4496c, (l1.n) obj, l1.t.M(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                kt.l.e((WordSentenceCharacterType) this.f4497d, (z1.r) this.f4496c, this.f4495b, (l1.n) obj, l1.t.M(1));
                break;
            case 9:
                List list2 = (List) this.f4497d;
                j3.y0 y0Var = (j3.y0) this.f4496c;
                l1.n nVar3 = (l1.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                l1.s sVar3 = (l1.s) nVar3;
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    j0.e eVar = j0.i.f35307e;
                    boolean z11 = this.f4495b;
                    dt.d4.a(list2, null, null, false, true, y0Var, eVar, false, false, 0, CropImageView.DEFAULT_ASPECT_RATIO, z11 ? 10 : 6, z11 ? 4 : 2, 0L, false, null, false, false, false, null, null, null, sVar3, 1600512, 12582912, 0, 4056966);
                } else {
                    sVar3.W();
                }
                return qy.b0.f48488a;
            case 10:
                ((Integer) obj2).getClass();
                j6.e((List) this.f4497d, this.f4495b, (fz.a) this.f4496c, (l1.n) obj, l1.t.M(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                pv.a.c((SyllableWriteCharacter) this.f4497d, this.f4495b, (fz.c) this.f4496c, (l1.n) obj, l1.t.M(1));
                break;
            default:
                xg.d dVar = (xg.d) this.f4497d;
                Bundle bundle = (Bundle) this.f4496c;
                l1.n nVar4 = (l1.n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                l1.s sVar4 = (l1.s) nVar4;
                if (sVar4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    l1.t.b(new l1.w1[]{ju.f.f37376j.a(Boolean.valueOf(this.f4495b)), ju.f.f37369c.a(dVar), ju.f.f37370d.a(Integer.valueOf(((fr.o0) dVar.l()).f27733a.keyLanguage)), ju.f.f37371e.a(Integer.valueOf(((fr.o0) dVar.l()).f27733a.locateLanguage)), ju.f.f37375i.a(Boolean.valueOf(((fr.o0) dVar.l()).z()))}, t1.e.d(-1724654907, new xg.a(dVar, bundle, 1), sVar4), sVar4, 56);
                } else {
                    sVar4.W();
                }
                return qy.b0.f48488a;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ b0(Object obj, boolean z11, qy.e eVar, int i11, int i12) {
        this.f4494a = i12;
        this.f4497d = obj;
        this.f4495b = z11;
        this.f4496c = eVar;
    }

    public /* synthetic */ b0(Object obj, boolean z11, rz.b0 b0Var, int i11) {
        this.f4494a = i11;
        this.f4497d = obj;
        this.f4495b = z11;
        this.f4496c = b0Var;
    }

    public /* synthetic */ b0(boolean z11, fz.a aVar, fz.c cVar, int i11) {
        this.f4494a = 1;
        this.f4495b = z11;
        this.f4496c = aVar;
        this.f4497d = cVar;
    }

    public /* synthetic */ b0(boolean z11, Object obj, Object obj2, int i11) {
        this.f4494a = i11;
        this.f4495b = z11;
        this.f4497d = obj;
        this.f4496c = obj2;
    }
}
