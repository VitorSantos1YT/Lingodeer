package bt;

import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.viewmodel.compose.NP.IMCc;
import com.google.api.Service;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import rt.ae;
import rt.af;
import rt.bf;
import rt.cf;
import rt.df;
import rt.ef;
import rt.ff;
import rt.gf;
import rt.hf;
import rt.jf;
import rt.ke;
import rt.kf;
import rt.lf;
import rt.mf;
import rt.nf;
import rt.se;
import rt.ze;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a3 extends kotlin.jvm.internal.j implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5148a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a3(int i11, Object obj, Class cls, String str, String str2, int i12, int i13) {
        super(i11, i12, cls, obj, str, str2);
        this.f5148a = i13;
    }

    /* JADX WARN: Code duplicated, block: B:207:0x05e4  */
    @Override // fz.c
    public final Object invoke(Object obj) {
        y.a0 a0Var;
        Object[] objArr;
        a9.i iVar;
        float fL;
        Object value;
        Object value2;
        Object value3;
        jf jfVar;
        ArrayList arrayList;
        Object value4;
        jf jfVar2;
        ArrayList arrayList2;
        Object value5;
        ArrayList arrayList3;
        jf jfVar3;
        int i11;
        Object value6;
        Set set;
        Object value7;
        nf nfVar;
        int i12 = this.f5148a;
        float f5 = CropImageView.DEFAULT_ASPECT_RATIO;
        vy.d dVar = null;
        int i13 = 3;
        String str = IMCc.BHOq;
        qy.b0 b0Var = qy.b0.f48488a;
        switch (i12) {
            case 0:
                String str2 = (String) obj;
                kotlin.jvm.internal.m.f(str2, str);
                ((jt.m1) this.receiver).d(str2);
                return b0Var;
            case 1:
                o3.w wVar = (o3.w) obj;
                kotlin.jvm.internal.m.f(wVar, str);
                jt.m1 m1Var = (jt.m1) this.receiver;
                m1Var.getClass();
                m1Var.f37063q.setValue(wVar);
                m1Var.d(wVar.f44704a.f35700b);
                return b0Var;
            case 2:
                ((fz.a) this.receiver).invoke();
                return b0Var;
            case 3:
                ((fz.a) this.receiver).invoke();
                return b0Var;
            case 4:
                ((fz.a) this.receiver).invoke();
                return b0Var;
            case 5:
                ((fz.a) this.receiver).invoke();
                return b0Var;
            case 6:
                ((fz.a) this.receiver).invoke();
                return b0Var;
            case 7:
                String str3 = (String) obj;
                kotlin.jvm.internal.m.f(str3, str);
                ((jt.m1) this.receiver).d(str3);
                return b0Var;
            case 8:
                o3.w wVar2 = (o3.w) obj;
                kotlin.jvm.internal.m.f(wVar2, str);
                jt.m1 m1Var2 = (jt.m1) this.receiver;
                m1Var2.getClass();
                m1Var2.f37063q.setValue(wVar2);
                m1Var2.d(wVar2.f44704a.f35700b);
                return b0Var;
            case 9:
                ((fz.a) this.receiver).invoke();
                return b0Var;
            case 10:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                d0.f fVar = (d0.f) this.receiver;
                y.a0 a0Var2 = fVar.f22689f0;
                if (zBooleanValue) {
                    fVar.b1();
                } else {
                    if (fVar.S != null) {
                        Object[] objArr2 = a0Var2.f56656c;
                        long[] jArr = a0Var2.f56654a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i14 = 0;
                            while (true) {
                                long j11 = jArr[i14];
                                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i15 = 8;
                                    int i16 = 8 - ((~(i14 - length)) >>> 31);
                                    long j12 = j11;
                                    int i17 = 0;
                                    while (i17 < i16) {
                                        if ((255 & j12) < 128) {
                                            rz.e0.B(fVar.H0(), null, null, new d0.d(fVar, (h0.k) objArr2[(i14 << 3) + i17], dVar, 0), 3);
                                        }
                                        j12 >>= i15;
                                        i17++;
                                        i15 = i15;
                                        objArr2 = objArr2;
                                        a0Var2 = a0Var2;
                                    }
                                    objArr = objArr2;
                                    a0Var = a0Var2;
                                    if (i16 == i15) {
                                    }
                                } else {
                                    objArr = objArr2;
                                    a0Var = a0Var2;
                                }
                                if (i14 != length) {
                                    i14++;
                                    objArr2 = objArr;
                                    a0Var2 = a0Var;
                                }
                            }
                        } else {
                            a0Var = a0Var2;
                        }
                    } else {
                        a0Var = a0Var2;
                    }
                    a0Var.a();
                    fVar.c1();
                }
                return b0Var;
            case 11:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                kr.g0 g0Var = (kr.g0) this.receiver;
                kr.e0 e0Var = (kr.e0) g0Var.f38468f.f53391a.getValue();
                if (e0Var instanceof kr.d0) {
                    kr.d0 d0Var = (kr.d0) e0Var;
                    if (d0Var.f38450k) {
                        rz.e0.B(ViewModelKt.getViewModelScope(g0Var), null, null, new bh.j0(zBooleanValue2, g0Var, d0Var, (vy.d) null, 7), 3);
                    }
                }
                return b0Var;
            case 12:
                kr.a1 a1Var = (kr.a1) obj;
                kotlin.jvm.internal.m.f(a1Var, str);
                kr.l1 l1Var = (kr.l1) this.receiver;
                l1Var.getClass();
                rz.e0.B(ViewModelKt.getViewModelScope(l1Var), null, null, new cu.c(a1Var, l1Var, (vy.d) null), 3);
                return b0Var;
            case 13:
                kr.a1 a1Var2 = (kr.a1) obj;
                kotlin.jvm.internal.m.f(a1Var2, str);
                kr.l1 l1Var2 = (kr.l1) this.receiver;
                l1Var2.getClass();
                rz.e0.B(ViewModelKt.getViewModelScope(l1Var2), null, null, new kr.j1(a1Var2, l1Var2, null), 3);
                return b0Var;
            case 14:
                kr.a1 a1Var3 = (kr.a1) obj;
                kotlin.jvm.internal.m.f(a1Var3, str);
                ((kr.l1) this.receiver).a(a1Var3);
                return b0Var;
            case 15:
                kr.a1 a1Var4 = (kr.a1) obj;
                kotlin.jvm.internal.m.f(a1Var4, str);
                kr.l1 l1Var3 = (kr.l1) this.receiver;
                l1Var3.getClass();
                rz.e0.B(ViewModelKt.getViewModelScope(l1Var3), null, null, new kr.j1(l1Var3, a1Var4, dVar, 0), 3);
                return b0Var;
            case 16:
                String str4 = (String) obj;
                kotlin.jvm.internal.m.f(str4, str);
                km.t0 t0Var = (km.t0) this.receiver;
                t0Var.getClass();
                if (!oz.q.K0(str4) && (iVar = t0Var.f38279f) != null) {
                    qy.q qVar = fv.b.f28186a;
                    iVar.v(fv.b.c(str4, null, null));
                }
                return b0Var;
            case 17:
                long jLongValue = ((Number) obj).longValue();
                a9.i iVar2 = ((km.t0) this.receiver).f38279f;
                if (iVar2 != null) {
                    iVar2.v(fv.b.Y(jLongValue, null, null));
                }
                return b0Var;
            case 18:
                float fFloatValue = ((Number) obj).floatValue();
                kw.h hVar = (kw.h) this.receiver;
                boolean zB = hVar.b();
                l1.g1 g1Var = hVar.f38869f;
                l1.g1 g1Var2 = hVar.f38870g;
                if (!zB) {
                    float fL2 = g1Var.l() + fFloatValue;
                    if (fL2 < CropImageView.DEFAULT_ASPECT_RATIO) {
                        fL2 = 0.0f;
                    }
                    float fL3 = fL2 - g1Var.l();
                    g1Var.m(fL2);
                    if (hVar.a() <= g1Var2.l()) {
                        fL = hVar.a();
                    } else {
                        float fK = hz.b.k(Math.abs(hVar.a() / g1Var2.l()) - 1.0f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f);
                        fL = g1Var2.l() + (g1Var2.l() * (fK - (((float) Math.pow(fK, 2)) / 4)));
                    }
                    hVar.f38868e.m(fL);
                    f5 = fL3;
                }
                return Float.valueOf(f5);
            case 19:
                hf hfVar = (hf) obj;
                kotlin.jvm.internal.m.f(hfVar, str);
                mf mfVar = (mf) this.receiver;
                uz.i1 i1Var = mfVar.f50103d;
                vy.d dVar2 = null;
                if (hfVar instanceof gf) {
                    long j13 = ((gf) hfVar).f49801a;
                    do {
                        value5 = i1Var.getValue();
                        jf jfVar4 = (jf) value5;
                        List<ps.b> list = jfVar4.f49948a;
                        arrayList3 = new ArrayList(ry.n.W(list, 10));
                        for (ps.b bVarA : list) {
                            jf jfVar5 = jfVar4;
                            if (bVarA.f47122a == j13) {
                                bVarA = ps.b.a(bVarA, null, CropImageView.DEFAULT_ASPECT_RATIO, !bVarA.f47129h, 255);
                            }
                            arrayList3.add(bVarA);
                            jfVar4 = jfVar5;
                        }
                        jfVar3 = jfVar4;
                        if (arrayList3.isEmpty()) {
                            i11 = 0;
                        } else {
                            int size = arrayList3.size();
                            int i18 = 0;
                            int i19 = 0;
                            while (i19 < size) {
                                Object obj2 = arrayList3.get(i19);
                                i19++;
                                if (((ps.b) obj2).f47129h && (i18 = i18 + 1) < 0) {
                                    ns.o.U();
                                    throw null;
                                }
                            }
                            i11 = i18;
                        }
                    } while (!i1Var.j(value5, jf.a(jfVar3, arrayList3, i11, CropImageView.DEFAULT_ASPECT_RATIO, false, null, 118)));
                } else if (hfVar.equals(ff.f49768a)) {
                    do {
                        value4 = i1Var.getValue();
                        jfVar2 = (jf) value4;
                        List list2 = jfVar2.f49948a;
                        arrayList2 = new ArrayList(ry.n.W(list2, 10));
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(ps.b.a((ps.b) it.next(), null, CropImageView.DEFAULT_ASPECT_RATIO, true, 255));
                        }
                    } while (!i1Var.j(value4, jf.a(jfVar2, arrayList2, arrayList2.size(), CropImageView.DEFAULT_ASPECT_RATIO, false, null, 118)));
                } else if (hfVar.equals(bf.f49549a)) {
                    do {
                        value3 = i1Var.getValue();
                        jfVar = (jf) value3;
                        List list3 = jfVar.f49948a;
                        arrayList = new ArrayList(ry.n.W(list3, 10));
                        Iterator it2 = list3.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(ps.b.a((ps.b) it2.next(), null, CropImageView.DEFAULT_ASPECT_RATIO, false, 255));
                        }
                    } while (!i1Var.j(value3, jf.a(jfVar, arrayList, 0, CropImageView.DEFAULT_ASPECT_RATIO, false, null, 118)));
                } else if (hfVar instanceof ef) {
                    rz.e0.B(ViewModelKt.getViewModelScope(mfVar), null, null, new ar.b(mfVar, ((ef) hfVar).f49704a, dVar2, 6), 3);
                } else if (hfVar.equals(df.f49651a)) {
                    List list4 = ((jf) i1Var.getValue()).f49948a;
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj3 : list4) {
                        ps.b bVar = (ps.b) obj3;
                        if (bVar.f47129h && !kotlin.jvm.internal.m.a(bVar.f47127f, ps.d.f47131a)) {
                            arrayList4.add(obj3);
                        }
                    }
                    if (!arrayList4.isEmpty()) {
                        do {
                            value2 = i1Var.getValue();
                        } while (!i1Var.j(value2, jf.a((jf) value2, null, 0, CropImageView.DEFAULT_ASPECT_RATIO, true, null, 95)));
                        rz.e0.B(ViewModelKt.getViewModelScope(mfVar), null, null, new qg.e(i13, arrayList4, mfVar, dVar2), 3);
                    }
                } else if (hfVar.equals(ze.f50805a)) {
                    List list5 = ((jf) i1Var.getValue()).f49948a;
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj4 : list5) {
                        ps.b bVar2 = (ps.b) obj4;
                        boolean z11 = bVar2.f47129h;
                        ps.h hVar2 = bVar2.f47127f;
                        if (z11 && !kotlin.jvm.internal.m.a(hVar2, ps.f.f47133a) && !kotlin.jvm.internal.m.a(hVar2, ps.e.f47132a) && !kotlin.jvm.internal.m.a(hVar2, ps.c.f47130a)) {
                            arrayList5.add(obj4);
                        }
                    }
                    if (!arrayList5.isEmpty()) {
                        rz.e0.B(ViewModelKt.getViewModelScope(mfVar), null, null, new kf(arrayList5, mfVar, null), 3);
                    }
                } else if (hfVar instanceof af) {
                    rz.e0.B(ViewModelKt.getViewModelScope(mfVar), null, null, new lf(mfVar, ((af) hfVar).f49470a, null), 3);
                } else {
                    if (!hfVar.equals(cf.f49594a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    do {
                        value = i1Var.getValue();
                    } while (!i1Var.j(value, jf.a((jf) value, null, 0, CropImageView.DEFAULT_ASPECT_RATIO, false, null, 63)));
                }
                return b0Var;
            case 20:
                ke keVar = (ke) obj;
                kotlin.jvm.internal.m.f(keVar, str);
                rt.a2 a2Var = (rt.a2) this.receiver;
                a2Var.getClass();
                ke keVarG = a2Var.g(keVar);
                uz.i1 i1Var2 = a2Var.f49423f;
                if (i1Var2.getValue() != keVarG) {
                    i1Var2.k(keVarG);
                    a2Var.d();
                    a2Var.h((List) a2Var.f49421d.getValue(), (String) a2Var.H.getValue(), keVarG, (se) a2Var.K.getValue());
                }
                return b0Var;
            case 21:
                long jLongValue2 = ((Number) obj).longValue();
                uz.i1 i1Var3 = ((rt.a2) this.receiver).M;
                do {
                    value6 = i1Var3.getValue();
                    set = (Set) value6;
                } while (!i1Var3.j(value6, set.contains(Long.valueOf(jLongValue2)) ? qx.b.y(set, Long.valueOf(jLongValue2)) : qx.b.E(set, Long.valueOf(jLongValue2))));
                return b0Var;
            case 22:
                String str5 = (String) obj;
                kotlin.jvm.internal.m.f(str5, str);
                ((rt.a2) this.receiver).m(str5);
                return b0Var;
            case 23:
                String str6 = (String) obj;
                kotlin.jvm.internal.m.f(str6, str);
                rt.b4 b4Var = (rt.b4) this.receiver;
                b4Var.getClass();
                b4Var.f49488b0.x(str6);
                return b0Var;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                String str7 = (String) obj;
                uz.i1 i1Var4 = (uz.i1) ((rt.b4) this.receiver).f49488b0.f4945c;
                do {
                    value7 = i1Var4.getValue();
                } while (!i1Var4.j(value7, ae.a((ae) value7, null, str7, null, 11)));
                return b0Var;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                String str8 = (String) obj;
                kotlin.jvm.internal.m.f(str8, str);
                rt.b4 b4Var2 = (rt.b4) this.receiver;
                b4Var2.getClass();
                rt.m0 m0Var = (rt.m0) b4Var2.f49503m0.f53391a.getValue();
                if (m0Var != null) {
                    rz.b0 viewModelScope = ViewModelKt.getViewModelScope(b4Var2);
                    yz.f fVar2 = rz.o0.f50940a;
                    rz.e0.B(viewModelScope, yz.e.f58387a, null, new rt.h3(b4Var2, m0Var, str8, null, 3), 2);
                }
                return b0Var;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                wt.c0 c0Var = (wt.c0) obj;
                kotlin.jvm.internal.m.f(c0Var, str);
                rt.b4 b4Var3 = (rt.b4) this.receiver;
                b4Var3.getClass();
                if ((((rt.r2) b4Var3.f49506p0.f53391a.getValue()) instanceof rt.q2) && (nfVar = (nf) b4Var3.f49502l0.f53391a.getValue()) != null) {
                    rt.n0 n0Var = nfVar.f50159a;
                    rz.e0.B(ViewModelKt.getViewModelScope(b4Var3), null, null, new rt.z2(b4Var3, n0Var, c0Var, n0Var.f50109b.getId(), nfVar, null, 1), 3);
                }
                return b0Var;
            case 27:
                wt.c0 c0Var2 = (wt.c0) obj;
                kotlin.jvm.internal.m.f(c0Var2, str);
                rt.b4 b4Var4 = (rt.b4) this.receiver;
                av.n nVar = b4Var4.M;
                if (((fr.o0) b4Var4.f49491d).f27733a.allowSoundEffect) {
                    int i21 = rt.f3.f49722a[c0Var2.ordinal()];
                    if (i21 == 1) {
                        nVar.k(R.raw.srs_status_again);
                    } else if (i21 == 2) {
                        nVar.k(R.raw.srs_status_hard);
                    } else if (i21 == 3) {
                        nVar.k(R.raw.srs_status_good);
                    } else {
                        if (i21 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        nVar.k(R.raw.srs_status_perfect);
                    }
                }
                return b0Var;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                String str9 = (String) obj;
                kotlin.jvm.internal.m.f(str9, str);
                rt.b4 b4Var5 = (rt.b4) this.receiver;
                b4Var5.getClass();
                av.n nVar2 = b4Var5.L;
                o20.w wVar3 = new o20.w(b4Var5, 21);
                nVar2.getClass();
                nVar2.f3172c = wVar3;
                nVar2.m(((fr.o0) b4Var5.f49491d).f27733a.audioSpeed / 100.0f, true);
                nVar2.h(str9);
                return b0Var;
            default:
                String str10 = (String) obj;
                kotlin.jvm.internal.m.f(str10, str);
                rt.e3 e3Var = (rt.e3) this.receiver;
                e3Var.getClass();
                e3Var.A0.x(str10);
                return b0Var;
        }
    }
}
