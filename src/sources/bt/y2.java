package bt;

import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.ViewModelKt;
import com.google.api.Service;
import com.lingo.lingoskill.japanskill.ui.syllable.YinTuActivity;
import com.lingodeer.data.model.ReviewVisibilityMode;
import com.lingodeer.data.model.SRSStatus;
import com.lingodeer.data.model.uistate.WordSentenceCharacterType;
import java.io.File;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import rt.mc;
import rt.nf;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class y2 extends kotlin.jvm.internal.j implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6212a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y2(int i11, Object obj, Class cls, String str, String str2, int i12, int i13) {
        super(i11, i12, cls, obj, str, str2);
        this.f6212a = i13;
    }

    /* JADX WARN: Code duplicated, block: B:272:0x0600 A[DONT_INVERT, PHI: r3
      0x0600: PHI (r3v8 int) = (r3v7 int), (r3v9 int) binds: [B:263:0x05d4, B:271:0x05fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:273:0x0602 A[LOOP:8: B:262:0x05ca->B:273:0x0602, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0080  */
    /* JADX WARN: Code duplicated, block: B:321:0x0605 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b1  */
    @Override // fz.a
    public final Object invoke() {
        mc mcVar;
        char c11;
        Object value;
        Object objA;
        int i11;
        Object value2;
        Object objA2;
        ir.a aVar;
        Object value3;
        Object objA3;
        nf nfVar;
        rt.n0 n0Var;
        String strY;
        int i12 = this.f6212a;
        int i13 = 2;
        qy.b0 b0Var = qy.b0.f48488a;
        switch (i12) {
            case 0:
                l1.b1 b1Var = ((jt.m1) this.receiver).f37055h;
                if (b1Var.getValue() == ht.q.REVISING) {
                    b1Var.setValue(ht.q.SELECTED);
                }
                return b0Var;
            case 1:
                l1.b1 b1Var2 = ((jt.s0) this.receiver).f37167j;
                if (b1Var2.getValue() == ht.q.REVISING) {
                    b1Var2.setValue(ht.q.SELECTED);
                }
                return b0Var;
            case 2:
                l1.b1 b1Var3 = ((jt.m1) this.receiver).f37055h;
                if (b1Var3.getValue() == ht.q.REVISING) {
                    b1Var3.setValue(ht.q.SELECTED);
                }
                return b0Var;
            case 3:
                return Boolean.valueOf(((d0.n0) this.receiver).X.Z0(7));
            case 4:
                ((ds.g) this.receiver).getClass();
                return new File(defpackage.e.m(xt.b.a().e(), "/database"), "cn_tone.zip");
            case 5:
                e2.i iVar = (e2.i) this.receiver;
                y.j0 j0Var = iVar.f24720c;
                y.j0 j0Var2 = iVar.f24721d;
                e2.p pVar = iVar.f24718a;
                e2.e0 e0VarG = pVar.g();
                char c12 = 7;
                int i14 = 8;
                if (e0VarG == null) {
                    Object[] objArr = j0Var2.f56721b;
                    long[] jArr = j0Var2.f56720a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i15 = 0;
                        while (true) {
                            long j11 = jArr[i15];
                            long[] jArr2 = jArr;
                            if ((((~j11) << c12) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i16 = 8 - ((~(i15 - length)) >>> 31);
                                int i17 = 0;
                                while (i17 < i16) {
                                    if ((j11 & 255) < 128) {
                                        ((e2.g) objArr[(i15 << 3) + i17]).u(e2.b0.Inactive);
                                    }
                                    j11 >>= 8;
                                    i17++;
                                    c12 = c12;
                                }
                                c11 = c12;
                                if (i16 == 8) {
                                }
                            } else {
                                c11 = c12;
                            }
                            if (i15 != length) {
                                i15++;
                                jArr = jArr2;
                                c12 = c11;
                            }
                        }
                    }
                } else if (e0VarG.P) {
                    if (j0Var.c(e0VarG)) {
                        e0VarG.Y0();
                    }
                    e2.b0 b0VarX0 = e0VarG.X0();
                    if (!e0VarG.f58482a.P) {
                        v2.a.b("visitAncestors called on an unattached node");
                    }
                    z1.q qVar = e0VarG.f58482a;
                    y2.i0 i0VarX = y2.f.x(e0VarG);
                    int i18 = 0;
                    while (i0VarX != null) {
                        if ((((z1.q) i0VarX.f56892i0.f50089g).f58485d & 5120) != 0) {
                            while (qVar != null) {
                                int i19 = qVar.f58484c;
                                if ((i19 & 5120) != 0) {
                                    if ((i19 & 1024) != 0) {
                                        i18++;
                                    }
                                    if ((qVar instanceof e2.g) && j0Var2.c(qVar)) {
                                        if (i18 <= 1) {
                                            ((e2.g) qVar).u(b0VarX0);
                                        } else {
                                            ((e2.g) qVar).u(e2.b0.ActiveParent);
                                        }
                                        j0Var2.l(qVar);
                                    }
                                }
                                qVar = qVar.f58486e;
                            }
                        }
                        i0VarX = i0VarX.w();
                        qVar = (i0VarX == null || (mcVar = i0VarX.f56892i0) == null) ? null : (y2.d2) mcVar.f50088f;
                    }
                    Object[] objArr2 = j0Var2.f56721b;
                    long[] jArr3 = j0Var2.f56720a;
                    int length2 = jArr3.length - 2;
                    if (length2 >= 0) {
                        int i21 = 0;
                        while (true) {
                            long j12 = jArr3[i21];
                            if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i22 = 8 - ((~(i21 - length2)) >>> 31);
                                int i23 = 0;
                                while (i23 < i22) {
                                    if ((j12 & 255) < 128) {
                                        ((e2.g) objArr2[(i21 << 3) + i23]).u(e2.b0.Inactive);
                                    }
                                    j12 >>= i14;
                                    i23++;
                                    i14 = i14;
                                }
                                if (i22 == i14) {
                                    if (i21 != length2) {
                                        i21++;
                                    }
                                }
                            } else if (i21 != length2) {
                                i21++;
                            }
                        }
                    }
                }
                if (pVar.g() == null || pVar.f24738c.X0() == e2.b0.Inactive) {
                    pVar.d();
                }
                j0Var.b();
                j0Var2.b();
                iVar.f24722e = false;
                return b0Var;
            case 6:
                ((f.d0) this.receiver).e();
                return b0Var;
            case 7:
                ((f.d0) this.receiver).e();
                return b0Var;
            case 8:
                kr.g0 g0Var = (kr.g0) this.receiver;
                av.n nVar = g0Var.f38465c;
                kr.e0 e0Var = (kr.e0) g0Var.f38468f.f53391a.getValue();
                if (e0Var instanceof kr.d0) {
                    kr.d0 d0Var = (kr.d0) e0Var;
                    List list = d0Var.f38440a;
                    int i24 = d0Var.f38442c;
                    if (!d0Var.f38444e && i24 < list.size()) {
                        g0Var.d();
                        String string = ((ir.b) list.get(i24)).f34557a.getAudioUri().toString();
                        kotlin.jvm.internal.m.e(string, "toString(...)");
                        uz.i1 i1Var = g0Var.f38467e;
                        do {
                            value = i1Var.getValue();
                            objA = (kr.e0) value;
                            if (objA instanceof kr.d0) {
                                objA = kr.d0.a((kr.d0) objA, 0, -1, true, 0L, 0L, false, 0, null, false, false, false, false, 16359);
                            }
                        } while (!i1Var.j(value, objA));
                        nVar.m(d0Var.f38448i / 100.0f, false);
                        nVar.h(string);
                        nVar.f3173d = new hd.d(g0Var, 26);
                    }
                }
                return b0Var;
            case 9:
                ((kr.g0) this.receiver).d();
                return b0Var;
            case 10:
                kr.g0 g0Var2 = (kr.g0) this.receiver;
                kr.e0 e0Var2 = (kr.e0) g0Var2.f38468f.f53391a.getValue();
                if ((e0Var2 instanceof kr.d0) && (i11 = ((kr.d0) e0Var2).f38442c) > 0) {
                    g0Var2.d();
                    int i25 = i11 - 1;
                    uz.i1 i1Var2 = g0Var2.f38467e;
                    do {
                        value2 = i1Var2.getValue();
                        objA2 = (kr.e0) value2;
                        if (objA2 instanceof kr.d0) {
                            objA2 = kr.d0.a((kr.d0) objA2, i25, -1, false, 0L, 0L, false, 0, null, false, i25 > 0, true, false, 467);
                        }
                    } while (!i1Var2.j(value2, objA2));
                }
                return b0Var;
            case 11:
                kr.g0 g0Var3 = (kr.g0) this.receiver;
                kr.e0 e0Var3 = (kr.e0) g0Var3.f38468f.f53391a.getValue();
                if (e0Var3 instanceof kr.d0) {
                    kr.d0 d0Var2 = (kr.d0) e0Var3;
                    int i26 = d0Var2.f38442c;
                    List list2 = d0Var2.f38440a;
                    if (i26 < list2.size()) {
                        ir.a aVar2 = ((ir.b) list2.get(i26)).f34558b;
                        if (aVar2 == null || d0Var2.f38450k) {
                            g0Var3.b();
                        } else {
                            g0Var3.d();
                            uz.i1 i1Var3 = g0Var3.f38467e;
                            while (true) {
                                Object value4 = i1Var3.getValue();
                                Object objA4 = (kr.e0) value4;
                                if (objA4 instanceof kr.d0) {
                                    aVar = aVar2;
                                    objA4 = kr.d0.a((kr.d0) objA4, 0, -1, false, 0L, 0L, false, 0, aVar, true, false, false, false, 14807);
                                } else {
                                    aVar = aVar2;
                                }
                                if (!i1Var3.j(value4, objA4)) {
                                    aVar2 = aVar;
                                }
                            }
                        }
                    } else if (!d0Var2.f38452n) {
                        g0Var3.a();
                    }
                }
                return b0Var;
            case 12:
                uz.i1 i1Var4 = ((kr.g0) this.receiver).f38467e;
                do {
                    value3 = i1Var4.getValue();
                    objA3 = (kr.e0) value3;
                    if (objA3 instanceof kr.d0) {
                        kr.d0 d0Var3 = (kr.d0) objA3;
                        if (d0Var3.f38450k) {
                            objA3 = kr.d0.a(d0Var3, 0, 0, false, 0L, 0L, false, 0, null, false, false, false, false, 14847);
                        }
                    }
                } while (!i1Var4.j(value3, objA3));
                return b0Var;
            case 13:
                km.t0 t0Var = (km.t0) this.receiver;
                t0Var.u().hasEnterAlphabet = true;
                t0Var.u().updateEntry("hasEnterAlphabet");
                int i27 = YinTuActivity.R;
                Context contextRequireContext = t0Var.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                t0Var.startActivity(new Intent(contextRequireContext, (Class<?>) YinTuActivity.class));
                return b0Var;
            case 14:
                ((rt.a2) this.receiver).k();
                return b0Var;
            case 15:
                ((rt.j2) this.receiver).a();
                return b0Var;
            case 16:
                ((rt.b4) this.receiver).f49488b0.w();
                return b0Var;
            case 17:
                rt.b4 b4Var = (rt.b4) this.receiver;
                List listC = b4Var.f49488b0.c();
                if (!listC.isEmpty()) {
                    rz.e0.B(ViewModelKt.getViewModelScope(b4Var), null, null, new ns.j(20, b4Var, listC, null), 3);
                }
                return b0Var;
            case 18:
                uz.i1 i1Var5 = ((rt.b4) this.receiver).f49499i0;
                i1Var5.getClass();
                i1Var5.l(null, rt.n.f50107a);
                return b0Var;
            case 19:
                rt.b4 b4Var2 = (rt.b4) this.receiver;
                if ((((rt.r2) b4Var2.f49506p0.f53391a.getValue()) instanceof rt.q2) && (nfVar = (nf) b4Var2.f49502l0.f53391a.getValue()) != null) {
                    rt.n0 n0Var2 = nfVar.f50159a;
                    if (n0Var2.f50109b.getReviewVisibilityMode() == ReviewVisibilityMode.HIDE) {
                        b4Var2.l(nfVar);
                        b4Var2.j(n0Var2.f50109b.getId());
                    } else {
                        rz.e0.B(ViewModelKt.getViewModelScope(b4Var2), null, null, new bh.l(b4Var2, n0Var2, nfVar, (vy.d) null, 10), 3);
                    }
                }
                return b0Var;
            case 20:
                rt.b4 b4Var3 = (rt.b4) this.receiver;
                b4Var3.getClass();
                rz.e0.B(ViewModelKt.getViewModelScope(b4Var3), null, null, new rt.n3(3, b4Var3, null), 3);
                return b0Var;
            case 21:
                rt.b4 b4Var4 = (rt.b4) this.receiver;
                rz.z1 z1Var = b4Var4.f49496f0;
                vy.d dVar = null;
                if (z1Var != null) {
                    z1Var.cancel(null);
                }
                b4Var4.f49496f0 = rz.e0.B(ViewModelKt.getViewModelScope(b4Var4), null, null, new rt.n3(i13, b4Var4, dVar), 3);
                return b0Var;
            case 22:
                rt.b4 b4Var5 = (rt.b4) this.receiver;
                b4Var5.S.k(b4Var5.R.getValue());
                return b0Var;
            case 23:
                rt.b4 b4Var6 = (rt.b4) this.receiver;
                av.n nVar2 = b4Var6.L;
                rt.r2 r2Var = (rt.r2) b4Var6.f49506p0.f53391a.getValue();
                if ((r2Var instanceof rt.q2) && (n0Var = ((rt.q2) r2Var).f50263a) != null) {
                    SRSStatus sRSStatus = n0Var.f50109b;
                    WordSentenceCharacterType wordSentenceCharacterType = n0Var.f50110c;
                    if (wordSentenceCharacterType instanceof WordSentenceCharacterType.CharacterType) {
                        qy.q qVar2 = fv.b.f28186a;
                        strY = fv.b.l0(((WordSentenceCharacterType.CharacterType) wordSentenceCharacterType).getCharacter().getZhuYin());
                    } else if (wordSentenceCharacterType instanceof WordSentenceCharacterType.SentenceType) {
                        qy.q qVar3 = fv.b.f28186a;
                        strY = fv.b.G(((WordSentenceCharacterType.SentenceType) wordSentenceCharacterType).getSentence().getSentenceId(), Long.valueOf(sRSStatus.getElemId()), Integer.valueOf(sRSStatus.getElemType()));
                    } else {
                        if (!(wordSentenceCharacterType instanceof WordSentenceCharacterType.WordType)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        qy.q qVar4 = fv.b.f28186a;
                        strY = fv.b.Y(((WordSentenceCharacterType.WordType) wordSentenceCharacterType).getWord().getWordId(), Long.valueOf(sRSStatus.getElemId()), Integer.valueOf(sRSStatus.getElemType()));
                    }
                    n9.q qVar5 = new n9.q(b4Var6, 25);
                    nVar2.getClass();
                    nVar2.f3172c = qVar5;
                    nVar2.m(((fr.o0) b4Var6.f49491d).f27733a.audioSpeed / 100.0f, true);
                    nVar2.h(strY);
                    uz.i1 i1Var6 = b4Var6.U;
                    ht.c cVar = new ht.c(ry.r.f50854a, 0, 1.0f);
                    i1Var6.getClass();
                    i1Var6.l(null, cVar);
                }
                return b0Var;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                ((rt.e3) this.receiver).A0.w();
                return b0Var;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                rt.e3 e3Var = (rt.e3) this.receiver;
                List listC2 = e3Var.A0.c();
                if (!listC2.isEmpty()) {
                    rz.e0.B(ViewModelKt.getViewModelScope(e3Var), null, null, new ns.j(18, e3Var, listC2, null), 3);
                }
                return b0Var;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                ((rt.e3) this.receiver).l();
                return b0Var;
            case 27:
                ((rt.e3) this.receiver).l();
                return b0Var;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                rt.r5 r5Var = (rt.r5) this.receiver;
                Object value5 = r5Var.M.getValue();
                rt.b5 b5Var = value5 instanceof rt.b5 ? (rt.b5) value5 : null;
                if (b5Var != null) {
                    int i28 = b5Var.f49508a;
                    int i29 = b5Var.f49512e.f50625b;
                    Set set = pt.e.f47146a;
                    Integer numValueOf = 0;
                    int iA = pt.e.a(i28, i29);
                    int i30 = 5;
                    if (iA != 1) {
                        if (iA != 2) {
                            if (iA != 3) {
                                numValueOf = null;
                            } else {
                                numValueOf = Integer.valueOf(ry.l.D(new Integer[]{11, numValueOf}, Integer.valueOf(i28)) ? 2 : 3);
                            }
                        } else if (ry.l.D(new Integer[]{12, 1}, Integer.valueOf(i28))) {
                            if (i29 != 3 && i29 != 4) {
                                if (i29 != 5) {
                                    numValueOf = null;
                                } else {
                                    numValueOf = 1;
                                }
                            }
                        } else if (ry.l.D(new Integer[]{11, numValueOf}, Integer.valueOf(i28)) || ry.l.D(new Integer[]{13, 2}, Integer.valueOf(i28))) {
                            numValueOf = 1;
                        } else if (!set.contains(Integer.valueOf(i28))) {
                            numValueOf = null;
                        }
                    } else if (ry.l.D(new Integer[]{12, 1}, Integer.valueOf(i28))) {
                        if (i29 == 0) {
                            numValueOf = 6;
                        } else if (i29 != 1) {
                            numValueOf = null;
                        } else {
                            numValueOf = 5;
                        }
                    } else if (ry.l.D(new Integer[]{11, numValueOf}, Integer.valueOf(i28))) {
                        numValueOf = 3;
                    } else if (ry.l.D(new Integer[]{13, 2}, Integer.valueOf(i28))) {
                        numValueOf = 2;
                    } else if (set.contains(Integer.valueOf(i28))) {
                        numValueOf = 1;
                    } else {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        int iIntValue = numValueOf.intValue();
                        r5Var.r(new fr.r3(iIntValue, i30));
                        rz.e0.B(ViewModelKt.getViewModelScope(r5Var), null, null, new rt.o5(r5Var, iIntValue, null, i13), 3);
                    }
                }
                return b0Var;
            default:
                rt.r5 r5Var2 = (rt.r5) this.receiver;
                Object value6 = r5Var2.M.getValue();
                rt.b5 b5Var2 = value6 instanceof rt.b5 ? (rt.b5) value6 : null;
                if (b5Var2 != null) {
                    rt.v4 v4Var = b5Var2.f49515h;
                    if (v4Var == rt.v4.PLAYING || v4Var == rt.v4.PREPARING) {
                        r5Var2.S = true;
                        r5Var2.k();
                    } else {
                        r5Var2.S = false;
                    }
                }
                return b0Var;
        }
    }
}
