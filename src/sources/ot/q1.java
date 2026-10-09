package ot;

import com.lingodeer.data.model.ReviewVisibilityMode;
import com.lingodeer.data.model.SRSStatus;
import com.yalantis.ucrop.view.CropImageView;
import j$.time.Instant;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class q1 extends xy.i implements fz.e {
    public int H;
    public int K;
    public int L;
    public boolean M;
    public int N;
    public /* synthetic */ Object O;
    public final /* synthetic */ int P;
    public final /* synthetic */ long Q;
    public final /* synthetic */ int R;
    public final /* synthetic */ long S;
    public final /* synthetic */ boolean T;
    public final /* synthetic */ s1 U;
    public final /* synthetic */ boolean V;
    public final /* synthetic */ LinkedHashMap W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f45952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f45953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s1 f45954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f45955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f45956e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f45957f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f45958t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(int i11, long j11, int i12, long j12, boolean z11, s1 s1Var, boolean z12, LinkedHashMap linkedHashMap, vy.d dVar) {
        super(2, dVar);
        this.P = i11;
        this.Q = j11;
        this.R = i12;
        this.S = j12;
        this.T = z11;
        this.U = s1Var;
        this.V = z12;
        this.W = linkedHashMap;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        q1 q1Var = new q1(this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, dVar);
        q1Var.O = obj;
        return q1Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((q1) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0240 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x0243  */
    /* JADX WARN: Code duplicated, block: B:76:0x0246  */
    /* JADX WARN: Code duplicated, block: B:80:0x0292  */
    /* JADX WARN: Code duplicated, block: B:83:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:85:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:86:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:90:0x0313  */
    /* JADX WARN: Code duplicated, block: B:94:0x0319  */
    /* JADX WARN: Code duplicated, block: B:95:0x0323  */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        qy.b0 b0Var;
        String strK;
        Object objU;
        long j11;
        String str;
        wy.a aVar;
        boolean z11;
        int i11;
        int i12;
        int i13;
        String str2;
        int i14;
        boolean z12;
        wy.a aVar2;
        long j12;
        int i15;
        boolean z13;
        long j13;
        long j14;
        int i16;
        int i17;
        String str3;
        int i18;
        String str4;
        wt.b0 b0Var2;
        wt.o oVar;
        SRSStatus sRSStatusCopy$default;
        String str5;
        LinkedHashMap linkedHashMap;
        s1 s1Var = this.U;
        wt.b0 b0Var3 = s1Var.f45988c;
        vt.n0 n0Var = s1Var.f45987b;
        rz.b0 b0Var4 = (rz.b0) this.O;
        wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
        int i19 = this.N;
        qy.b0 b0Var5 = qy.b0.f48488a;
        boolean z14 = this.T;
        long j15 = this.Q;
        int i21 = this.P;
        if (i19 == 0) {
            b0Var = b0Var5;
            com.bumptech.glide.e.F(obj);
            int i22 = this.R;
            if ((i21 == 0 && j15 == 0 && i22 == 6) || ((i21 == 3 && i22 == 14) || ((i21 == 2 && i22 == 2 && j15 == 0) || i21 == -1))) {
                return b0Var;
            }
            strK = nv.p.k(i22, xt.d.o(j15, i21, ((fr.o0) n0Var).f27733a.keyLanguage), ":");
            if (this.V) {
                String id2 = xt.d.q(j15, i21, ((fr.o0) n0Var).f27733a.keyLanguage);
                long epochSecond = Instant.now().getEpochSecond();
                b0Var3.getClass();
                kotlin.jvm.internal.m.f(id2, "id");
                bh.i0 i0VarC = ((vt.z0) b0Var3.f55236a).c(id2);
                this.O = b0Var4;
                this.f45952a = strK;
                this.f45953b = id2;
                this.f45955d = epochSecond;
                this.N = 1;
                objU = uz.x0.u(i0VarC, this);
                if (objU != aVar3) {
                    j11 = epochSecond;
                    str = id2;
                }
                return aVar3;
            }
            z12 = z14;
            linkedHashMap = this.W;
            if (z12) {
                linkedHashMap.put(strK, new Integer(1));
            } else {
                linkedHashMap.put(strK, new Integer(-1));
            }
            Objects.toString(linkedHashMap);
            return b0Var;
        }
        if (i19 != 1) {
            if (i19 == 2) {
                b0Var = b0Var5;
                str3 = this.f45952a;
                com.bumptech.glide.e.F(obj);
                strK = str3;
                z12 = z14;
                linkedHashMap = this.W;
                if (z12) {
                    linkedHashMap.put(strK, new Integer(1));
                } else {
                    linkedHashMap.put(strK, new Integer(-1));
                }
                Objects.toString(linkedHashMap);
                return b0Var;
            }
            if (i19 == 3) {
                int i23 = this.L;
                i15 = this.K;
                i16 = this.H;
                z13 = this.M;
                long j16 = this.f45957f;
                long j17 = this.f45956e;
                i21 = this.f45958t;
                b0Var = b0Var5;
                long j18 = this.f45955d;
                s1 s1Var2 = this.f45954c;
                str = this.f45953b;
                String str6 = this.f45952a;
                com.bumptech.glide.e.F(obj);
                j13 = j17;
                j14 = j18;
                z12 = z14;
                j12 = j16;
                i13 = i23;
                strK = str6;
                s1Var = s1Var2;
                aVar2 = aVar3;
                i18 = i21;
                str4 = str;
                if (j13 != -1) {
                    b0Var2 = s1Var.f45988c;
                    String strK2 = xt.d.k(((fr.o0) s1Var.f45987b).f27733a.keyLanguage);
                    if (z13) {
                        oVar = wt.o.CORRECT;
                    } else {
                        oVar = wt.o.WRONG;
                    }
                    sRSStatusCopy$default = SRSStatus.copy$default(new SRSStatus(str4, j13, j12, i18, strK2, "course", j14, oVar), null, 0L, 0L, 0, null, null, 0L, null, false, null, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, 0, 0, 0L, false, ReviewVisibilityMode.SHOW, 1048575, null);
                    this.O = null;
                    this.f45952a = strK;
                    this.f45953b = null;
                    this.f45954c = null;
                    this.f45955d = j14;
                    this.f45958t = i16;
                    this.H = i15;
                    this.K = i13;
                    this.N = 4;
                    if (b0Var2.k(sRSStatusCopy$default, this) == aVar2) {
                        return aVar2;
                    }
                    str5 = strK;
                }
                linkedHashMap = this.W;
                if (z12) {
                    linkedHashMap.put(strK, new Integer(1));
                } else {
                    linkedHashMap.put(strK, new Integer(-1));
                }
                Objects.toString(linkedHashMap);
                return b0Var;
            }
            if (i19 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str5 = this.f45952a;
            com.bumptech.glide.e.F(obj);
            b0Var = b0Var5;
            z12 = z14;
            strK = str5;
            linkedHashMap = this.W;
            if (z12) {
                linkedHashMap.put(strK, new Integer(1));
            } else {
                linkedHashMap.put(strK, new Integer(-1));
            }
            Objects.toString(linkedHashMap);
            return b0Var;
        }
        b0Var = b0Var5;
        long j19 = this.f45955d;
        String str7 = this.f45953b;
        String str8 = this.f45952a;
        com.bumptech.glide.e.F(obj);
        str = str7;
        strK = str8;
        j11 = j19;
        objU = obj;
        SRSStatus sRSStatus = (SRSStatus) objU;
        long j21 = this.S;
        if (sRSStatus != null) {
            int i24 = j21 == -1 ? 1 : 0;
            ReviewVisibilityMode reviewVisibilityMode = sRSStatus.getReviewVisibilityMode();
            ReviewVisibilityMode reviewVisibilityMode2 = ReviewVisibilityMode.HIDE;
            if (reviewVisibilityMode != reviewVisibilityMode2) {
                reviewVisibilityMode2 = ReviewVisibilityMode.SHOW;
            }
            SRSStatus sRSStatusCopy$default2 = SRSStatus.copy$default(sRSStatus, null, 0L, 0L, 0, null, null, j11, z14 ? wt.o.CORRECT : wt.o.WRONG, !sRSStatus.isReviewed() ? i24 : 1, null, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, 0, 0, j11, true, reviewVisibilityMode2, 261695, null);
            this.O = b0Var4;
            this.f45952a = strK;
            this.f45953b = str;
            this.f45954c = null;
            this.f45955d = j11;
            this.f45958t = 0;
            this.H = i24;
            this.N = 2;
            if (b0Var3.k(sRSStatusCopy$default2, this) != aVar3) {
                str3 = strK;
                strK = str3;
                z12 = z14;
                linkedHashMap = this.W;
                if (z12) {
                    linkedHashMap.put(strK, new Integer(1));
                } else {
                    linkedHashMap.put(strK, new Integer(-1));
                }
                Objects.toString(linkedHashMap);
                return b0Var;
            }
            return aVar3;
        }
        long j22 = j11;
        Integer numValueOf = Integer.valueOf(new SimpleDateFormat("yyyyMMdd", Locale.US).format(Calendar.getInstance().getTime()));
        kotlin.jvm.internal.m.e(numValueOf, "valueOf(...)");
        String strValueOf = String.valueOf(numValueOf.intValue());
        if (((fr.o0) n0Var).r().length() > 0) {
            fr.o0 o0Var = (fr.o0) n0Var;
            aVar = aVar3;
            z11 = z14;
            if (kotlin.jvm.internal.m.a((String) oz.q.W0(o0Var.r(), new String[]{":"}, 0, 6).get(0), strValueOf)) {
                i17 = Integer.parseInt((String) oz.q.W0((CharSequence) oz.q.W0(o0Var.r(), new String[]{":"}, 0, 6).get(1), new String[]{";"}, 0, 6).get(0));
                i11 = 1;
                i13 = Integer.parseInt((String) oz.q.W0((CharSequence) oz.q.W0(o0Var.r(), new String[]{":"}, 0, 6).get(1), new String[]{";"}, 0, 6).get(1));
            }
            if (i21 != 0) {
                i12 = i17;
                i12++;
            } else if (i21 == i11) {
                i13++;
            }
            str2 = strValueOf + ":" + i12 + ";" + i13;
            this.O = null;
            this.f45952a = strK;
            this.f45953b = str;
            this.f45954c = s1Var;
            this.f45955d = j22;
            this.f45958t = i21;
            this.f45956e = j21;
            i14 = i12;
            this.f45957f = j15;
            z12 = z11;
            this.M = z12;
            this.H = 0;
            this.K = i14;
            this.L = i13;
            this.N = 3;
            aVar2 = aVar;
            if (((fr.o0) n0Var).X(str2, this) == aVar2) {
                return aVar2;
            }
            j12 = j15;
            i15 = i14;
            z13 = z12;
            j13 = j21;
            j14 = j22;
            i16 = 0;
            i18 = i21;
            str4 = str;
            if (j13 != -1) {
                b0Var2 = s1Var.f45988c;
                String strK3 = xt.d.k(((fr.o0) s1Var.f45987b).f27733a.keyLanguage);
                if (z13) {
                    oVar = wt.o.CORRECT;
                } else {
                    oVar = wt.o.WRONG;
                }
                sRSStatusCopy$default = SRSStatus.copy$default(new SRSStatus(str4, j13, j12, i18, strK3, "course", j14, oVar), null, 0L, 0L, 0, null, null, 0L, null, false, null, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, 0, 0, 0L, false, ReviewVisibilityMode.SHOW, 1048575, null);
                this.O = null;
                this.f45952a = strK;
                this.f45953b = null;
                this.f45954c = null;
                this.f45955d = j14;
                this.f45958t = i16;
                this.H = i15;
                this.K = i13;
                this.N = 4;
                if (b0Var2.k(sRSStatusCopy$default, this) == aVar2) {
                    return aVar2;
                }
                str5 = strK;
                strK = str5;
            }
            linkedHashMap = this.W;
            if (z12) {
                linkedHashMap.put(strK, new Integer(1));
            } else {
                linkedHashMap.put(strK, new Integer(-1));
            }
            Objects.toString(linkedHashMap);
            return b0Var;
        }
        aVar = aVar3;
        z11 = z14;
        i11 = 1;
        i12 = 0;
        i13 = 0;
        if (i21 != 0) {
            i12 = i17;
            i12++;
        } else if (i21 == i11) {
            i13++;
        }
        str2 = strValueOf + ":" + i12 + ";" + i13;
        this.O = null;
        this.f45952a = strK;
        this.f45953b = str;
        this.f45954c = s1Var;
        this.f45955d = j22;
        this.f45958t = i21;
        this.f45956e = j21;
        i14 = i12;
        this.f45957f = j15;
        z12 = z11;
        this.M = z12;
        this.H = 0;
        this.K = i14;
        this.L = i13;
        this.N = 3;
        aVar2 = aVar;
        if (((fr.o0) n0Var).X(str2, this) == aVar2) {
            return aVar2;
        }
        j12 = j15;
        i15 = i14;
        z13 = z12;
        j13 = j21;
        j14 = j22;
        i16 = 0;
        i18 = i21;
        str4 = str;
        if (j13 != -1) {
            b0Var2 = s1Var.f45988c;
            String strK4 = xt.d.k(((fr.o0) s1Var.f45987b).f27733a.keyLanguage);
            if (z13) {
                oVar = wt.o.CORRECT;
            } else {
                oVar = wt.o.WRONG;
            }
            sRSStatusCopy$default = SRSStatus.copy$default(new SRSStatus(str4, j13, j12, i18, strK4, "course", j14, oVar), null, 0L, 0L, 0, null, null, 0L, null, false, null, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, 0, 0, 0L, false, ReviewVisibilityMode.SHOW, 1048575, null);
            this.O = null;
            this.f45952a = strK;
            this.f45953b = null;
            this.f45954c = null;
            this.f45955d = j14;
            this.f45958t = i16;
            this.H = i15;
            this.K = i13;
            this.N = 4;
            if (b0Var2.k(sRSStatusCopy$default, this) == aVar2) {
                return aVar2;
            }
            str5 = strK;
            strK = str5;
        }
        linkedHashMap = this.W;
        if (z12) {
            linkedHashMap.put(strK, new Integer(1));
        } else {
            linkedHashMap.put(strK, new Integer(-1));
        }
        Objects.toString(linkedHashMap);
        return b0Var;
    }
}
