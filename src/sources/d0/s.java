package d0;

import am.rVFB.LwKl;
import android.text.Layout;
import com.lingodeer.data.model.UserInfo;
import com.yalantis.ucrop.view.CropImageView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22794a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f22795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Serializable f22797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f22798e;

    public /* synthetic */ s(long j11, float[] fArr, kotlin.jvm.internal.w wVar, kotlin.jvm.internal.v vVar) {
        this.f22795b = j11;
        this.f22796c = fArr;
        this.f22797d = wVar;
        this.f22798e = vVar;
    }

    public /* synthetic */ s(f2.c cVar, kotlin.jvm.internal.y yVar, long j11, g2.p pVar) {
        this.f22796c = cVar;
        this.f22797d = yVar;
        this.f22795b = j11;
        this.f22798e = pVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        Object obj2;
        vt.t0 t0Var;
        Object objL;
        float[] fArr;
        long j11;
        j3.b bVar;
        int i11;
        float fA;
        float fA2;
        switch (this.f22794a) {
            case 0:
                f2.c cVar = (f2.c) this.f22796c;
                kotlin.jvm.internal.y yVar = (kotlin.jvm.internal.y) this.f22797d;
                long j12 = this.f22795b;
                g2.p pVar = (g2.p) this.f22798e;
                y2.k0 k0Var = (y2.k0) obj;
                k0Var.a();
                float f5 = cVar.f26572a;
                float f11 = cVar.f26573b;
                i2.b bVar2 = k0Var.f56937a;
                ((a0.b2) bVar2.f34121b.f56174b).r(f5, f11);
                try {
                    i2.d.t0(k0Var, (g2.h) yVar.f38361a, j12, 0L, CropImageView.DEFAULT_ASPECT_RATIO, pVar, 0, 890);
                } finally {
                    ((a0.b2) bVar2.f34121b.f56174b).r(-f5, -f11);
                }
                break;
            case 1:
                String str = (String) this.f22796c;
                kotlin.jvm.internal.u uVar = (kotlin.jvm.internal.u) this.f22797d;
                String str2 = (String) this.f22798e;
                UserInfo userInfo = (UserInfo) obj;
                kotlin.jvm.internal.m.f(userInfo, "userInfo");
                int i12 = 0;
                int i13 = 6;
                List listW0 = oz.q.W0(userInfo.getAchievementLeaderboard(), new String[]{";"}, 0, 6);
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : listW0) {
                    if (((String) obj3).length() > 0) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i14 = 0;
                while (i14 < size) {
                    int i15 = i14 + 1;
                    try {
                        List listW1 = oz.q.W0((String) arrayList.get(i14), new String[]{":"}, i12, i13);
                        objL = new vt.t0((String) listW1.get(i12), oz.q.W0((String) listW1.get(1), new String[]{"_"}, i12, i13), Long.parseLong((String) listW1.get(2)));
                    } catch (Throwable th2) {
                        objL = com.bumptech.glide.e.l(th2);
                    }
                    vt.t0 t0Var2 = qy.o.a(objL) == null ? (vt.t0) objL : null;
                    if (t0Var2 != null) {
                        arrayList2.add(t0Var2);
                    }
                    i14 = i15;
                    i12 = 0;
                    i13 = 6;
                    break;
                }
                int size2 = arrayList2.size();
                int i16 = 0;
                while (true) {
                    if (i16 < size2) {
                        Object obj4 = arrayList2.get(i16);
                        i16++;
                        if (kotlin.jvm.internal.m.a(((vt.t0) obj4).f54287a, str2)) {
                            obj2 = obj4;
                        }
                    } else {
                        obj2 = null;
                    }
                }
                vt.t0 t0Var3 = (vt.t0) obj2;
                if ((t0Var3 != null ? t0Var3.f54288b : ry.r.f50854a).contains(str)) {
                    return userInfo;
                }
                uVar.f38357a = true;
                long j13 = this.f22795b;
                if (t0Var3 != null) {
                    ArrayList arrayListG0 = ry.m.G0(str, ry.m.c1(t0Var3.f54288b));
                    String className = t0Var3.f54287a;
                    kotlin.jvm.internal.m.f(className, "className");
                    t0Var = new vt.t0(className, arrayListG0, j13);
                } else {
                    t0Var = new vt.t0(str2, ns.o.K(str), j13);
                }
                ArrayList arrayListC1 = ry.m.c1(arrayList2);
                final au.f fVar = new au.f(str2, 27);
                arrayListC1.removeIf(new Predicate() { // from class: fr.a
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj5) {
                        return ((Boolean) fVar.invoke(obj5)).booleanValue();
                    }
                });
                arrayListC1.add(t0Var);
                return UserInfo.copy$default(userInfo, null, 0, 0, 0, 0, 0, 0L, 0, 0L, null, null, null, null, ry.m.y0(arrayListC1, ";", null, null, new dv.e(22), 30), null, null, null, 0, 0, 0, 0, 0, 0, null, null, 33546239, null);
            default:
                float[] fArr2 = (float[]) this.f22796c;
                kotlin.jvm.internal.w wVar = (kotlin.jvm.internal.w) this.f22797d;
                kotlin.jvm.internal.v vVar = (kotlin.jvm.internal.v) this.f22798e;
                j3.z zVar = (j3.z) obj;
                int i17 = zVar.f35831b;
                j3.b bVar3 = zVar.f35830a;
                int iE = zVar.f35832c;
                long j14 = this.f22795b;
                int iF = i17 > j3.x0.f(j14) ? zVar.f35831b : j3.x0.f(j14);
                if (iE >= j3.x0.e(j14)) {
                    iE = j3.x0.e(j14);
                }
                long jB = j3.t.b(zVar.d(iF), zVar.d(iE));
                int i18 = wVar.f38359a;
                k3.r rVar = bVar3.f35664d;
                int iF2 = j3.x0.f(jB);
                int iE2 = j3.x0.e(jB);
                Layout layout = rVar.f37894f;
                int length = layout.getText().length();
                if (iF2 < 0) {
                    p3.a.a(LwKl.rVfPWtXbe);
                }
                if (iF2 >= length) {
                    p3.a.a("startOffset must be less than text length");
                }
                if (iE2 <= iF2) {
                    p3.a.a("endOffset must be greater than startOffset");
                }
                if (iE2 > length) {
                    p3.a.a("endOffset must be smaller or equal to text length");
                }
                if (fArr2.length - i18 < (iE2 - iF2) * 4) {
                    p3.a.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int lineForOffset = layout.getLineForOffset(iF2);
                int lineForOffset2 = layout.getLineForOffset(iE2 - 1);
                f3.g gVar = new f3.g(rVar);
                if (lineForOffset <= lineForOffset2) {
                    while (true) {
                        int lineStart = layout.getLineStart(lineForOffset);
                        fArr = fArr2;
                        int iF3 = rVar.f(lineForOffset);
                        int iMax = Math.max(iF2, lineStart);
                        int iMin = Math.min(iE2, iF3);
                        float fG = rVar.g(lineForOffset);
                        float fE = rVar.e(lineForOffset);
                        j11 = jB;
                        bVar = bVar3;
                        boolean z11 = false;
                        boolean z12 = layout.getParagraphDirection(lineForOffset) == 1;
                        while (iMax < iMin) {
                            boolean zIsRtlCharAt = layout.isRtlCharAt(iMax);
                            if (!z12 || zIsRtlCharAt) {
                                if (z12 && zIsRtlCharAt) {
                                    z11 = false;
                                    float fA3 = gVar.a(iMax, false, false, false);
                                    i11 = iMin;
                                    fA = gVar.a(iMax + 1, true, true, false);
                                    fA2 = fA3;
                                } else {
                                    i11 = iMin;
                                    z11 = false;
                                    if (z12 || !zIsRtlCharAt) {
                                        fA = gVar.a(iMax, false, false, false);
                                        fA2 = gVar.a(iMax + 1, true, true, false);
                                    } else {
                                        fA2 = gVar.a(iMax, false, false, true);
                                        fA = gVar.a(iMax + 1, true, true, true);
                                    }
                                }
                                fArr[i18] = fA;
                                fArr[i18 + 1] = fG;
                                fArr[i18 + 2] = fA2;
                                fArr[i18 + 3] = fE;
                                i18 += 4;
                                iMax++;
                                iMin = i11;
                            } else {
                                fA = gVar.a(iMax, z11, z11, true);
                                i11 = iMin;
                                fA2 = gVar.a(iMax + 1, true, true, true);
                            }
                            z11 = false;
                            fArr[i18] = fA;
                            fArr[i18 + 1] = fG;
                            fArr[i18 + 2] = fA2;
                            fArr[i18 + 3] = fE;
                            i18 += 4;
                            iMax++;
                            iMin = i11;
                        }
                        if (lineForOffset != lineForOffset2) {
                            lineForOffset++;
                            bVar3 = bVar;
                            fArr2 = fArr;
                            jB = j11;
                        }
                    }
                } else {
                    fArr = fArr2;
                    j11 = jB;
                    bVar = bVar3;
                }
                int iD = (j3.x0.d(j11) * 4) + wVar.f38359a;
                for (int i19 = wVar.f38359a; i19 < iD; i19 += 4) {
                    int i21 = i19 + 1;
                    float f12 = fArr[i21];
                    float f13 = vVar.f38358a;
                    fArr[i21] = f12 + f13;
                    int i22 = i19 + 3;
                    fArr[i22] = fArr[i22] + f13;
                }
                wVar.f38359a = iD;
                vVar.f38358a = bVar.b() + vVar.f38358a;
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ s(String str, kotlin.jvm.internal.u uVar, long j11, String str2, fr.i iVar) {
        this.f22796c = str;
        this.f22797d = uVar;
        this.f22795b = j11;
        this.f22798e = str2;
    }
}
