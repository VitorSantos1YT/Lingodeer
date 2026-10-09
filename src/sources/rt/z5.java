package rt;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class z5 extends ViewModel {
    public rz.z1 H;
    public final a00.e K;
    public Long L;
    public int M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ns.t0 f50763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vt.n0 f50764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wt.o0 f50765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final uz.i1 f50766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final uz.r0 f50767e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final uz.r0 f50768f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Long f50769t;

    public z5(ns.t0 t0Var, vt.n0 n0Var, wt.o0 o0Var) {
        this.f50763a = t0Var;
        this.f50764b = n0Var;
        this.f50765c = o0Var;
        uz.i1 i1VarC = uz.x0.c(t5.f50425a);
        this.f50766d = i1VarC;
        this.f50767e = new uz.r0(i1VarC);
        this.f50768f = uz.x0.A(o0Var.f55339f, ViewModelKt.getViewModelScope(this), uz.a1.a(2), Boolean.TRUE);
        this.K = new a00.e();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c2 A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:15:0x003a, B:88:0x01a7, B:89:0x01b4, B:40:0x00b7, B:43:0x00c2, B:51:0x00f8, B:54:0x0105, B:56:0x0109, B:63:0x011d, B:65:0x0133, B:67:0x0136, B:72:0x0145, B:74:0x014b, B:59:0x0112, B:46:0x00eb, B:36:0x009d), top: B:98:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00f8 A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:15:0x003a, B:88:0x01a7, B:89:0x01b4, B:40:0x00b7, B:43:0x00c2, B:51:0x00f8, B:54:0x0105, B:56:0x0109, B:63:0x011d, B:65:0x0133, B:67:0x0136, B:72:0x0145, B:74:0x014b, B:59:0x0112, B:46:0x00eb, B:36:0x009d), top: B:98:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0105 A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:15:0x003a, B:88:0x01a7, B:89:0x01b4, B:40:0x00b7, B:43:0x00c2, B:51:0x00f8, B:54:0x0105, B:56:0x0109, B:63:0x011d, B:65:0x0133, B:67:0x0136, B:72:0x0145, B:74:0x014b, B:59:0x0112, B:46:0x00eb, B:36:0x009d), top: B:98:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0109 A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:15:0x003a, B:88:0x01a7, B:89:0x01b4, B:40:0x00b7, B:43:0x00c2, B:51:0x00f8, B:54:0x0105, B:56:0x0109, B:63:0x011d, B:65:0x0133, B:67:0x0136, B:72:0x0145, B:74:0x014b, B:59:0x0112, B:46:0x00eb, B:36:0x009d), top: B:98:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0111 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:59:0x0112 A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:15:0x003a, B:88:0x01a7, B:89:0x01b4, B:40:0x00b7, B:43:0x00c2, B:51:0x00f8, B:54:0x0105, B:56:0x0109, B:63:0x011d, B:65:0x0133, B:67:0x0136, B:72:0x0145, B:74:0x014b, B:59:0x0112, B:46:0x00eb, B:36:0x009d), top: B:98:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:62:0x011b  */
    /* JADX WARN: Code duplicated, block: B:65:0x0133 A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:15:0x003a, B:88:0x01a7, B:89:0x01b4, B:40:0x00b7, B:43:0x00c2, B:51:0x00f8, B:54:0x0105, B:56:0x0109, B:63:0x011d, B:65:0x0133, B:67:0x0136, B:72:0x0145, B:74:0x014b, B:59:0x0112, B:46:0x00eb, B:36:0x009d), top: B:98:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0135  */
    /* JADX WARN: Code duplicated, block: B:69:0x0141  */
    /* JADX WARN: Code duplicated, block: B:70:0x0142  */
    /* JADX WARN: Code duplicated, block: B:72:0x0145 A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:15:0x003a, B:88:0x01a7, B:89:0x01b4, B:40:0x00b7, B:43:0x00c2, B:51:0x00f8, B:54:0x0105, B:56:0x0109, B:63:0x011d, B:65:0x0133, B:67:0x0136, B:72:0x0145, B:74:0x014b, B:59:0x0112, B:46:0x00eb, B:36:0x009d), top: B:98:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:73:0x014a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0165  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x0174  */
    /* JADX WARN: Code duplicated, block: B:81:0x0177 A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:22:0x0058, B:78:0x016c, B:81:0x0177, B:84:0x019f), top: B:96:0x0058 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x019e  */
    /* JADX WARN: Code duplicated, block: B:84:0x019f A[Catch: all -> 0x005f, TRY_LEAVE, TryCatch #1 {all -> 0x005f, blocks: (B:22:0x0058, B:78:0x016c, B:81:0x0177, B:84:0x019f), top: B:96:0x0058 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x01a4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [rt.z5] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [a00.a] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v2, types: [a00.a] */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v7 */
    public final Object a(ns.z zVar, xy.c cVar) {
        x5 x5Var;
        ns.z zVar2;
        int i11;
        a00.a aVar;
        int i12;
        int i13;
        a00.a aVar2;
        int iIntValue;
        int i14;
        int i15;
        long jE;
        int i16;
        Integer num;
        int iIntValue2;
        int i17;
        Object objB;
        int i18;
        int i19;
        a00.a aVar3;
        int i21;
        int i22;
        Long l9;
        boolean z11;
        int iIntValue3;
        Object objM;
        int i23;
        ns.z zVar3;
        a00.a aVar4;
        a00.a aVar5;
        if (cVar instanceof x5) {
            x5Var = (x5) cVar;
            int i24 = x5Var.L;
            if ((i24 & Integer.MIN_VALUE) != 0) {
                x5Var.L = i24 - Integer.MIN_VALUE;
            } else {
                x5Var = new x5(this, cVar);
            }
        } else {
            x5Var = new x5(this, cVar);
        }
        Object obj = x5Var.H;
        wy.a aVar6 = wy.a.COROUTINE_SUSPENDED;
        ?? r9 = x5Var.L;
        vt.n0 n0Var = this.f50764b;
        vy.d dVar = null;
        try {
            if (r9 == 0) {
                com.bumptech.glide.e.F(obj);
                x5Var.f50636a = zVar;
                a00.e eVar = this.K;
                x5Var.f50637b = eVar;
                x5Var.f50638c = 0;
                x5Var.L = 1;
                if (eVar.b(x5Var) != aVar6) {
                    zVar2 = zVar;
                    i11 = 0;
                    aVar = eVar;
                }
                return aVar6;
            }
            if (r9 != 1) {
                if (r9 != 2) {
                    if (r9 == 3) {
                        i21 = x5Var.f50642t;
                        i19 = x5Var.f50641f;
                        i22 = x5Var.f50640e;
                        i13 = x5Var.f50639d;
                        int i25 = x5Var.f50638c;
                        aVar3 = x5Var.f50637b;
                        ns.z zVar4 = x5Var.f50636a;
                        try {
                            com.bumptech.glide.e.F(obj);
                            i18 = i25;
                            zVar2 = zVar4;
                            aVar3 = aVar3;
                            iIntValue3 = ((Number) obj).intValue();
                            if (iIntValue3 < i21) {
                                int i26 = iIntValue3 + 1;
                                x5Var.f50636a = zVar2;
                                x5Var.f50637b = aVar3;
                                x5Var.f50638c = i18;
                                x5Var.f50639d = i13;
                                x5Var.f50640e = i22;
                                x5Var.f50641f = i19;
                                x5Var.f50642t = iIntValue3;
                                x5Var.L = 4;
                                fr.o0 o0Var = (fr.o0) n0Var;
                                o0Var.getClass();
                                yz.f fVar = rz.o0.f50940a;
                                objM = rz.e0.M(yz.e.f58387a, new fr.m0(i26, 0, o0Var, dVar), x5Var);
                                if (objM == aVar6) {
                                    objM = qy.b0.f48488a;
                                }
                                if (objM != aVar6) {
                                    i23 = i22;
                                    zVar3 = zVar2;
                                    aVar4 = aVar3;
                                }
                                return aVar6;
                            }
                            r9 = aVar3;
                            z11 = false;
                            Boolean boolValueOf = Boolean.valueOf(z11);
                            r9.a(null);
                            return boolValueOf;
                        } catch (Throwable th2) {
                            th = th2;
                            r9 = aVar3;
                            r9.a(null);
                            throw th;
                        }
                    }
                    if (r9 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i23 = x5Var.f50640e;
                    a00.a aVar7 = x5Var.f50637b;
                    zVar3 = x5Var.f50636a;
                    com.bumptech.glide.e.F(obj);
                    aVar4 = aVar7;
                    this.M = i23;
                    this.L = new Long(zVar3.f44038a);
                    aVar5 = aVar4;
                    aVar5 = aVar2;
                    z11 = true;
                    r9 = aVar5;
                    Boolean boolValueOf2 = Boolean.valueOf(z11);
                    r9.a(null);
                    return boolValueOf2;
                }
                int i27 = x5Var.f50639d;
                i12 = x5Var.f50638c;
                a00.a aVar8 = x5Var.f50637b;
                zVar2 = x5Var.f50636a;
                try {
                    com.bumptech.glide.e.F(obj);
                    i13 = i27;
                    aVar2 = aVar8;
                    if (((Boolean) obj).booleanValue()) {
                        z11 = true;
                        r9 = aVar2;
                    } else {
                        Integer numValueOf = Integer.valueOf(new SimpleDateFormat("yyyyMMdd", Locale.US).format(Calendar.getInstance().getTime()));
                        kotlin.jvm.internal.m.e(numValueOf, "valueOf(...)");
                        iIntValue = numValueOf.intValue();
                        Long l11 = this.f50769t;
                        i14 = (l11 != null && l11.longValue() == zVar2.f44038a) ? 1 : 0;
                        if (i14 != 0 || (this.f50766d.getValue() instanceof t5)) {
                            aVar5 = aVar2;
                            if (this.M == iIntValue) {
                                l9 = this.L;
                                i15 = i14;
                                long j11 = zVar2.f44038a;
                                if (l9 == null && l9.longValue() == j11) {
                                    aVar5 = aVar2;
                                }
                            } else {
                                i15 = i14;
                            }
                            ((fr.o0) n0Var).getClass();
                            jE = FirebaseRemoteConfig.d().e("daily_free_tell_me_why_count");
                            if (jE > 0) {
                                i16 = (int) jE;
                            } else {
                                i16 = 5;
                            }
                            num = new Integer(i16);
                            if (num.intValue() <= 0) {
                                num = null;
                            }
                            if (num != null) {
                                iIntValue2 = num.intValue();
                            } else {
                                iIntValue2 = 3;
                            }
                            x5Var.f50636a = zVar2;
                            x5Var.f50637b = aVar2;
                            x5Var.f50638c = i12;
                            x5Var.f50639d = i13;
                            x5Var.f50640e = iIntValue;
                            i17 = i15;
                            x5Var.f50641f = i17;
                            x5Var.f50642t = iIntValue2;
                            x5Var.L = 3;
                            objB = b(iIntValue, x5Var);
                            if (objB != aVar6) {
                                i18 = i12;
                                i19 = i17;
                                aVar3 = aVar2;
                                i21 = iIntValue2;
                                i22 = iIntValue;
                                obj = objB;
                                iIntValue3 = ((Number) obj).intValue();
                                if (iIntValue3 < i21) {
                                    r9 = aVar3;
                                    z11 = false;
                                } else {
                                    int i28 = iIntValue3 + 1;
                                    x5Var.f50636a = zVar2;
                                    x5Var.f50637b = aVar3;
                                    x5Var.f50638c = i18;
                                    x5Var.f50639d = i13;
                                    x5Var.f50640e = i22;
                                    x5Var.f50641f = i19;
                                    x5Var.f50642t = iIntValue3;
                                    x5Var.L = 4;
                                    fr.o0 o0Var2 = (fr.o0) n0Var;
                                    o0Var2.getClass();
                                    yz.f fVar2 = rz.o0.f50940a;
                                    objM = rz.e0.M(yz.e.f58387a, new fr.m0(i28, 0, o0Var2, dVar), x5Var);
                                    if (objM == aVar6) {
                                        objM = qy.b0.f48488a;
                                    }
                                    if (objM != aVar6) {
                                        i23 = i22;
                                        zVar3 = zVar2;
                                        aVar4 = aVar3;
                                        this.M = i23;
                                        this.L = new Long(zVar3.f44038a);
                                        aVar5 = aVar4;
                                    }
                                }
                            }
                            return aVar6;
                        }
                        aVar5 = aVar2;
                        z11 = true;
                        r9 = aVar5;
                    }
                    Boolean boolValueOf3 = Boolean.valueOf(z11);
                    r9.a(null);
                    return boolValueOf3;
                } catch (Throwable th3) {
                    th = th3;
                    r9 = aVar8;
                    r9.a(null);
                    throw th;
                }
            }
            int i29 = x5Var.f50638c;
            a00.a aVar9 = x5Var.f50637b;
            zVar2 = x5Var.f50636a;
            com.bumptech.glide.e.F(obj);
            i11 = i29;
            aVar = aVar9;
            wt.m0 m0Var = this.f50765c.f55339f;
            x5Var.f50636a = zVar2;
            x5Var.f50637b = aVar;
            x5Var.f50638c = i11;
            x5Var.f50639d = 0;
            x5Var.L = 2;
            Object objU = uz.x0.u(m0Var, x5Var);
            if (objU != aVar6) {
                i12 = i11;
                obj = objU;
                i13 = 0;
                aVar2 = aVar;
                if (((Boolean) obj).booleanValue()) {
                    z11 = true;
                    r9 = aVar2;
                } else {
                    Integer numValueOf2 = Integer.valueOf(new SimpleDateFormat("yyyyMMdd", Locale.US).format(Calendar.getInstance().getTime()));
                    kotlin.jvm.internal.m.e(numValueOf2, "valueOf(...)");
                    iIntValue = numValueOf2.intValue();
                    Long l12 = this.f50769t;
                    if (l12 != null) {
                        if (i14 != 0) {
                            aVar5 = aVar2;
                            if (this.M == iIntValue) {
                                l9 = this.L;
                                i15 = i14;
                                long j12 = zVar2.f44038a;
                                if (l9 == null) {
                                    aVar5 = aVar2;
                                }
                            } else {
                                i15 = i14;
                            }
                            ((fr.o0) n0Var).getClass();
                            jE = FirebaseRemoteConfig.d().e("daily_free_tell_me_why_count");
                            if (jE > 0) {
                                i16 = (int) jE;
                            } else {
                                i16 = 5;
                            }
                            num = new Integer(i16);
                            if (num.intValue() <= 0) {
                                num = null;
                            }
                            if (num != null) {
                                iIntValue2 = num.intValue();
                            } else {
                                iIntValue2 = 3;
                            }
                            x5Var.f50636a = zVar2;
                            x5Var.f50637b = aVar2;
                            x5Var.f50638c = i12;
                            x5Var.f50639d = i13;
                            x5Var.f50640e = iIntValue;
                            i17 = i15;
                            x5Var.f50641f = i17;
                            x5Var.f50642t = iIntValue2;
                            x5Var.L = 3;
                            objB = b(iIntValue, x5Var);
                            if (objB != aVar6) {
                                i18 = i12;
                                i19 = i17;
                                aVar3 = aVar2;
                                i21 = iIntValue2;
                                i22 = iIntValue;
                                obj = objB;
                                iIntValue3 = ((Number) obj).intValue();
                                if (iIntValue3 < i21) {
                                    r9 = aVar3;
                                    z11 = false;
                                } else {
                                    int i210 = iIntValue3 + 1;
                                    x5Var.f50636a = zVar2;
                                    x5Var.f50637b = aVar3;
                                    x5Var.f50638c = i18;
                                    x5Var.f50639d = i13;
                                    x5Var.f50640e = i22;
                                    x5Var.f50641f = i19;
                                    x5Var.f50642t = iIntValue3;
                                    x5Var.L = 4;
                                    fr.o0 o0Var3 = (fr.o0) n0Var;
                                    o0Var3.getClass();
                                    yz.f fVar3 = rz.o0.f50940a;
                                    objM = rz.e0.M(yz.e.f58387a, new fr.m0(i210, 0, o0Var3, dVar), x5Var);
                                    if (objM == aVar6) {
                                        objM = qy.b0.f48488a;
                                    }
                                    if (objM != aVar6) {
                                        i23 = i22;
                                        zVar3 = zVar2;
                                        aVar4 = aVar3;
                                        this.M = i23;
                                        this.L = new Long(zVar3.f44038a);
                                        aVar5 = aVar4;
                                    }
                                }
                            }
                        } else {
                            aVar5 = aVar2;
                            if (this.M == iIntValue) {
                                l9 = this.L;
                                i15 = i14;
                                long j13 = zVar2.f44038a;
                                if (l9 == null) {
                                    aVar5 = aVar2;
                                }
                            } else {
                                i15 = i14;
                            }
                            ((fr.o0) n0Var).getClass();
                            jE = FirebaseRemoteConfig.d().e("daily_free_tell_me_why_count");
                            if (jE > 0) {
                                i16 = (int) jE;
                            } else {
                                i16 = 5;
                            }
                            num = new Integer(i16);
                            if (num.intValue() <= 0) {
                                num = null;
                            }
                            if (num != null) {
                                iIntValue2 = num.intValue();
                            } else {
                                iIntValue2 = 3;
                            }
                            x5Var.f50636a = zVar2;
                            x5Var.f50637b = aVar2;
                            x5Var.f50638c = i12;
                            x5Var.f50639d = i13;
                            x5Var.f50640e = iIntValue;
                            i17 = i15;
                            x5Var.f50641f = i17;
                            x5Var.f50642t = iIntValue2;
                            x5Var.L = 3;
                            objB = b(iIntValue, x5Var);
                            if (objB != aVar6) {
                                i18 = i12;
                                i19 = i17;
                                aVar3 = aVar2;
                                i21 = iIntValue2;
                                i22 = iIntValue;
                                obj = objB;
                                iIntValue3 = ((Number) obj).intValue();
                                if (iIntValue3 < i21) {
                                    r9 = aVar3;
                                    z11 = false;
                                } else {
                                    int i211 = iIntValue3 + 1;
                                    x5Var.f50636a = zVar2;
                                    x5Var.f50637b = aVar3;
                                    x5Var.f50638c = i18;
                                    x5Var.f50639d = i13;
                                    x5Var.f50640e = i22;
                                    x5Var.f50641f = i19;
                                    x5Var.f50642t = iIntValue3;
                                    x5Var.L = 4;
                                    fr.o0 o0Var4 = (fr.o0) n0Var;
                                    o0Var4.getClass();
                                    yz.f fVar4 = rz.o0.f50940a;
                                    objM = rz.e0.M(yz.e.f58387a, new fr.m0(i211, 0, o0Var4, dVar), x5Var);
                                    if (objM == aVar6) {
                                        objM = qy.b0.f48488a;
                                    }
                                    if (objM != aVar6) {
                                        i23 = i22;
                                        zVar3 = zVar2;
                                        aVar4 = aVar3;
                                        this.M = i23;
                                        this.L = new Long(zVar3.f44038a);
                                        aVar5 = aVar4;
                                    }
                                }
                            }
                        }
                        aVar5 = aVar2;
                        z11 = true;
                        r9 = aVar5;
                    }
                    if (i14 != 0) {
                        aVar5 = aVar2;
                        if (this.M == iIntValue) {
                            l9 = this.L;
                            i15 = i14;
                            long j14 = zVar2.f44038a;
                            if (l9 == null) {
                                aVar5 = aVar2;
                            }
                        } else {
                            i15 = i14;
                        }
                        ((fr.o0) n0Var).getClass();
                        jE = FirebaseRemoteConfig.d().e("daily_free_tell_me_why_count");
                        if (jE > 0) {
                            i16 = (int) jE;
                        } else {
                            i16 = 5;
                        }
                        num = new Integer(i16);
                        if (num.intValue() <= 0) {
                            num = null;
                        }
                        if (num != null) {
                            iIntValue2 = num.intValue();
                        } else {
                            iIntValue2 = 3;
                        }
                        x5Var.f50636a = zVar2;
                        x5Var.f50637b = aVar2;
                        x5Var.f50638c = i12;
                        x5Var.f50639d = i13;
                        x5Var.f50640e = iIntValue;
                        i17 = i15;
                        x5Var.f50641f = i17;
                        x5Var.f50642t = iIntValue2;
                        x5Var.L = 3;
                        objB = b(iIntValue, x5Var);
                        if (objB != aVar6) {
                            i18 = i12;
                            i19 = i17;
                            aVar3 = aVar2;
                            i21 = iIntValue2;
                            i22 = iIntValue;
                            obj = objB;
                            iIntValue3 = ((Number) obj).intValue();
                            if (iIntValue3 < i21) {
                                r9 = aVar3;
                                z11 = false;
                            } else {
                                int i212 = iIntValue3 + 1;
                                x5Var.f50636a = zVar2;
                                x5Var.f50637b = aVar3;
                                x5Var.f50638c = i18;
                                x5Var.f50639d = i13;
                                x5Var.f50640e = i22;
                                x5Var.f50641f = i19;
                                x5Var.f50642t = iIntValue3;
                                x5Var.L = 4;
                                fr.o0 o0Var5 = (fr.o0) n0Var;
                                o0Var5.getClass();
                                yz.f fVar5 = rz.o0.f50940a;
                                objM = rz.e0.M(yz.e.f58387a, new fr.m0(i212, 0, o0Var5, dVar), x5Var);
                                if (objM == aVar6) {
                                    objM = qy.b0.f48488a;
                                }
                                if (objM != aVar6) {
                                    i23 = i22;
                                    zVar3 = zVar2;
                                    aVar4 = aVar3;
                                    this.M = i23;
                                    this.L = new Long(zVar3.f44038a);
                                    aVar5 = aVar4;
                                }
                            }
                        }
                    } else {
                        aVar5 = aVar2;
                        if (this.M == iIntValue) {
                            l9 = this.L;
                            i15 = i14;
                            long j15 = zVar2.f44038a;
                            if (l9 == null) {
                                aVar5 = aVar2;
                            }
                        } else {
                            i15 = i14;
                        }
                        ((fr.o0) n0Var).getClass();
                        jE = FirebaseRemoteConfig.d().e("daily_free_tell_me_why_count");
                        if (jE > 0) {
                            i16 = (int) jE;
                        } else {
                            i16 = 5;
                        }
                        num = new Integer(i16);
                        if (num.intValue() <= 0) {
                            num = null;
                        }
                        if (num != null) {
                            iIntValue2 = num.intValue();
                        } else {
                            iIntValue2 = 3;
                        }
                        x5Var.f50636a = zVar2;
                        x5Var.f50637b = aVar2;
                        x5Var.f50638c = i12;
                        x5Var.f50639d = i13;
                        x5Var.f50640e = iIntValue;
                        i17 = i15;
                        x5Var.f50641f = i17;
                        x5Var.f50642t = iIntValue2;
                        x5Var.L = 3;
                        objB = b(iIntValue, x5Var);
                        if (objB != aVar6) {
                            i18 = i12;
                            i19 = i17;
                            aVar3 = aVar2;
                            i21 = iIntValue2;
                            i22 = iIntValue;
                            obj = objB;
                            iIntValue3 = ((Number) obj).intValue();
                            if (iIntValue3 < i21) {
                                r9 = aVar3;
                                z11 = false;
                            } else {
                                int i213 = iIntValue3 + 1;
                                x5Var.f50636a = zVar2;
                                x5Var.f50637b = aVar3;
                                x5Var.f50638c = i18;
                                x5Var.f50639d = i13;
                                x5Var.f50640e = i22;
                                x5Var.f50641f = i19;
                                x5Var.f50642t = iIntValue3;
                                x5Var.L = 4;
                                fr.o0 o0Var6 = (fr.o0) n0Var;
                                o0Var6.getClass();
                                yz.f fVar6 = rz.o0.f50940a;
                                objM = rz.e0.M(yz.e.f58387a, new fr.m0(i213, 0, o0Var6, dVar), x5Var);
                                if (objM == aVar6) {
                                    objM = qy.b0.f48488a;
                                }
                                if (objM != aVar6) {
                                    i23 = i22;
                                    zVar3 = zVar2;
                                    aVar4 = aVar3;
                                    this.M = i23;
                                    this.L = new Long(zVar3.f44038a);
                                    aVar5 = aVar4;
                                }
                            }
                        }
                    }
                    aVar5 = aVar2;
                    z11 = true;
                    r9 = aVar5;
                }
                Boolean boolValueOf4 = Boolean.valueOf(z11);
                r9.a(null);
                return boolValueOf4;
            }
            return aVar6;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007e, code lost:
    
        if (r3 == r1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r11, xy.c r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof rt.y5
            if (r0 == 0) goto L13
            r0 = r12
            rt.y5 r0 = (rt.y5) r0
            int r1 = r0.f50683d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50683d = r1
            goto L18
        L13:
            rt.y5 r0 = new rt.y5
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.f50681b
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r0.f50683d
            qy.b0 r3 = qy.b0.f48488a
            r4 = 0
            r5 = 0
            vt.n0 r6 = r10.f50764b
            r7 = 2
            r8 = 1
            if (r2 == 0) goto L3e
            if (r2 == r8) goto L38
            if (r2 != r7) goto L30
            com.bumptech.glide.e.F(r12)
            goto L83
        L30:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L38:
            int r11 = r0.f50680a
            com.bumptech.glide.e.F(r12)
            goto L65
        L3e:
            com.bumptech.glide.e.F(r12)
            r12 = r6
            fr.o0 r12 = (fr.o0) r12
            com.lingodeer.data.env.Env r2 = r12.f27733a
            int r9 = r2.tellMeWhyDailyFireTime
            if (r9 == r11) goto L81
            r0.f50680a = r11
            r0.f50683d = r8
            r12.getClass()
            yz.f r2 = rz.o0.f50940a
            yz.e r2 = yz.e.f58387a
            fr.m0 r9 = new fr.m0
            r9.<init>(r11, r8, r12, r4)
            java.lang.Object r12 = rz.e0.M(r2, r9, r0)
            if (r12 != r1) goto L61
            goto L62
        L61:
            r12 = r3
        L62:
            if (r12 != r1) goto L65
            goto L80
        L65:
            r0.f50680a = r11
            r0.f50683d = r7
            fr.o0 r6 = (fr.o0) r6
            r6.getClass()
            yz.f r11 = rz.o0.f50940a
            yz.e r11 = yz.e.f58387a
            fr.m0 r12 = new fr.m0
            r12.<init>(r5, r5, r6, r4)
            java.lang.Object r11 = rz.e0.M(r11, r12, r0)
            if (r11 != r1) goto L7e
            r3 = r11
        L7e:
            if (r3 != r1) goto L83
        L80:
            return r1
        L81:
            int r5 = r2.tellMeWhyDailyCount
        L83:
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r5)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: rt.z5.b(int, xy.c):java.lang.Object");
    }

    public final void c(ns.z zVar) {
        Long l9 = this.f50769t;
        long j11 = zVar.f44038a;
        if (l9 != null && l9.longValue() == j11 && (this.f50766d.getValue() instanceof v5)) {
            return;
        }
        this.f50769t = Long.valueOf(j11);
        rz.z1 z1Var = this.H;
        vy.d dVar = null;
        if (z1Var != null) {
            z1Var.cancel(null);
        }
        this.H = rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new h(3, this, zVar, dVar), 3);
    }
}
