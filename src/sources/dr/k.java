package dr;

import android.content.Context;
import androidx.lifecycle.livedata.HeRS.DytezVyM;
import au.c1;
import au.z0;
import com.lingodeer.data.model.ReviewVisibilityMode;
import com.lingodeer.database.model.ReviewStatusEntity;
import com.lingodeer.database.model.SRSStatusEntity;
import com.yalantis.ucrop.view.CropImageView;
import d0.y1;
import j$.time.Duration;
import j$.time.Instant;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import qy.b0;
import qy.q;
import ry.x;
import rz.e0;
import rz.o0;
import vt.n0;
import wt.s;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Set f23560f = ry.l.m0(new String[]{"B", "D"});

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f23561g = x.Y(new qy.l("c", new y1(9)), new qy.l("sc", new y1(10)), new qy.l("syllable", new y1(11)));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f23562h = x.Y(new qy.l("w", "course"), new qy.l("s", "course"), new qy.l("c", "course"), new qy.l("tp", "travel"), new qy.l("cd", DytezVyM.lnrSLzk));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String[] f23563i = {"cn", "cnup"};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Integer[] f23564j = {0, 1, 2};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0 f23565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f23566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f23567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f23568d = com.bumptech.glide.d.v(new cr.m(9));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q f23569e = com.bumptech.glide.d.v(new cr.n(this, 5));

    public k(z0 z0Var, c1 c1Var, n0 n0Var, Context context) {
        this.f23565a = z0Var;
        this.f23566b = c1Var;
        this.f23567c = context;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0074 A[Catch: Exception -> 0x00c2, TryCatch #0 {Exception -> 0x00c2, blocks: (B:13:0x0031, B:23:0x006e, B:25:0x0074, B:27:0x007c, B:31:0x00a2, B:35:0x00bd, B:36:0x00c1, B:19:0x004f, B:22:0x005b), top: B:40:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x007c A[Catch: Exception -> 0x00c2, TryCatch #0 {Exception -> 0x00c2, blocks: (B:13:0x0031, B:23:0x006e, B:25:0x0074, B:27:0x007c, B:31:0x00a2, B:35:0x00bd, B:36:0x00c1, B:19:0x004f, B:22:0x005b), top: B:40:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x009a  */
    /* JADX WARN: Code duplicated, block: B:30:0x009b  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00ba -> B:15:0x0035). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(dr.k r11, java.util.List r12, xy.c r13) {
        /*
            boolean r0 = r13 instanceof dr.g
            if (r0 == 0) goto L13
            r0 = r13
            dr.g r0 = (dr.g) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            dr.g r0 = new dr.g
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.f23542t
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r0.K
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L58
            if (r2 == r5) goto L41
            if (r2 != r3) goto L39
            int r12 = r0.f23539d
            int r2 = r0.f23538c
            int r6 = r0.f23537b
            java.util.Iterator r7 = r0.f23536a
            java.util.Iterator r7 = (java.util.Iterator) r7
            com.bumptech.glide.e.F(r13)     // Catch: java.lang.Exception -> Lc2
            r13 = r6
        L35:
            r6 = r2
            r2 = r12
            r12 = r7
            goto L6e
        L39:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L41:
            int r12 = r0.f23541f
            int r2 = r0.f23540e
            int r6 = r0.f23539d
            int r7 = r0.f23538c
            int r8 = r0.f23537b
            java.util.Iterator r9 = r0.f23536a
            java.util.Iterator r9 = (java.util.Iterator) r9
            com.bumptech.glide.e.F(r13)     // Catch: java.lang.Exception -> Lc2
            r13 = r12
            r12 = r6
            r6 = r2
            r2 = r7
            r7 = r9
            goto La2
        L58:
            com.bumptech.glide.e.F(r13)
            int r13 = r12.size()     // Catch: java.lang.Exception -> Lc2
            int r13 = r13 + 499
            r2 = 500(0x1f4, float:7.0E-43)
            int r13 = r13 / r2
            java.util.ArrayList r12 = ry.m.g1(r12, r2, r2)     // Catch: java.lang.Exception -> Lc2
            java.util.Iterator r12 = r12.iterator()     // Catch: java.lang.Exception -> Lc2
            r2 = r4
            r6 = r2
        L6e:
            boolean r7 = r12.hasNext()     // Catch: java.lang.Exception -> Lc2
            if (r7 == 0) goto Lc2
            java.lang.Object r7 = r12.next()     // Catch: java.lang.Exception -> Lc2
            int r8 = r2 + 1
            if (r2 < 0) goto Lbd
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Exception -> Lc2
            r7.size()     // Catch: java.lang.Exception -> Lc2
            au.z0 r9 = r11.f23565a     // Catch: java.lang.Exception -> Lc2
            r10 = r12
            java.util.Iterator r10 = (java.util.Iterator) r10     // Catch: java.lang.Exception -> Lc2
            r0.f23536a = r10     // Catch: java.lang.Exception -> Lc2
            r0.f23537b = r13     // Catch: java.lang.Exception -> Lc2
            r0.f23538c = r6     // Catch: java.lang.Exception -> Lc2
            r0.f23539d = r8     // Catch: java.lang.Exception -> Lc2
            r0.f23540e = r2     // Catch: java.lang.Exception -> Lc2
            r0.f23541f = r4     // Catch: java.lang.Exception -> Lc2
            r0.K = r5     // Catch: java.lang.Exception -> Lc2
            java.lang.Object r7 = r9.a(r7, r0)     // Catch: java.lang.Exception -> Lc2
            if (r7 != r1) goto L9b
            goto Lb9
        L9b:
            r7 = r6
            r6 = r2
            r2 = r7
            r7 = r12
            r12 = r8
            r8 = r13
            r13 = r4
        La2:
            r9 = r7
            java.util.Iterator r9 = (java.util.Iterator) r9     // Catch: java.lang.Exception -> Lc2
            r0.f23536a = r9     // Catch: java.lang.Exception -> Lc2
            r0.f23537b = r8     // Catch: java.lang.Exception -> Lc2
            r0.f23538c = r2     // Catch: java.lang.Exception -> Lc2
            r0.f23539d = r12     // Catch: java.lang.Exception -> Lc2
            r0.f23540e = r6     // Catch: java.lang.Exception -> Lc2
            r0.f23541f = r13     // Catch: java.lang.Exception -> Lc2
            r0.K = r3     // Catch: java.lang.Exception -> Lc2
            java.lang.Object r13 = rz.e0.P(r0)     // Catch: java.lang.Exception -> Lc2
            if (r13 != r1) goto Lba
        Lb9:
            return r1
        Lba:
            r13 = r8
            goto L35
        Lbd:
            ns.o.V()     // Catch: java.lang.Exception -> Lc2
            r11 = 0
            throw r11     // Catch: java.lang.Exception -> Lc2
        Lc2:
            qy.b0 r11 = qy.b0.f48488a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: dr.k.a(dr.k, java.util.List, xy.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00e1 A[Catch: Exception -> 0x0184, TryCatch #2 {Exception -> 0x0184, blocks: (B:14:0x0040, B:45:0x00db, B:47:0x00e1, B:49:0x00e9, B:67:0x0159, B:71:0x017f, B:72:0x0183, B:23:0x006b, B:35:0x009c, B:39:0x00aa, B:40:0x00b3, B:42:0x00b9, B:30:0x0080, B:32:0x008c, B:44:0x00c9), top: B:81:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00e9 A[Catch: Exception -> 0x0184, TRY_LEAVE, TryCatch #2 {Exception -> 0x0184, blocks: (B:14:0x0040, B:45:0x00db, B:47:0x00e1, B:49:0x00e9, B:67:0x0159, B:71:0x017f, B:72:0x0183, B:23:0x006b, B:35:0x009c, B:39:0x00aa, B:40:0x00b3, B:42:0x00b9, B:30:0x0080, B:32:0x008c, B:44:0x00c9), top: B:81:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:53:0x010d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0118 A[Catch: Exception -> 0x014d, TryCatch #0 {Exception -> 0x014d, blocks: (B:54:0x0110, B:56:0x0118, B:59:0x0123, B:60:0x012c, B:62:0x0132, B:63:0x0144, B:64:0x0147, B:20:0x0064), top: B:77:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0122  */
    /* JADX WARN: Code duplicated, block: B:62:0x0132 A[Catch: Exception -> 0x014d, LOOP:0: B:60:0x012c->B:62:0x0132, LOOP_END, TryCatch #0 {Exception -> 0x014d, blocks: (B:54:0x0110, B:56:0x0118, B:59:0x0123, B:60:0x012c, B:62:0x0132, B:63:0x0144, B:64:0x0147, B:20:0x0064), top: B:77:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0176  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0174 -> B:16:0x0044). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(dr.k r19, java.util.List r20, xy.c r21) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dr.k.b(dr.k, java.util.List, xy.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0108 A[Catch: Exception -> 0x0193, TryCatch #1 {Exception -> 0x0193, blocks: (B:10:0x0036, B:12:0x0048, B:16:0x0056, B:18:0x007c, B:21:0x0083, B:23:0x0093, B:26:0x009e, B:28:0x00a8, B:31:0x00b5, B:33:0x00c1, B:35:0x00c5, B:37:0x00d1, B:40:0x00e1, B:57:0x0119, B:59:0x0127, B:64:0x0145, B:63:0x0140, B:47:0x00f6, B:53:0x0108, B:50:0x00ff, B:55:0x0111, B:58:0x0120, B:39:0x00da), top: B:70:0x0036 }] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.util.Map] */
    public static final SRSStatusEntity c(k kVar, Instant instant, long j11, long j12, ReviewStatusEntity reviewStatusEntity, Map map) {
        ReviewStatusEntity reviewStatusEntity2;
        SRSStatusEntity sRSStatusEntity;
        int iB;
        String str;
        kVar.getClass();
        try {
            List listW0 = oz.q.W0(reviewStatusEntity.getId(), new String[]{"_"}, 3, 2);
            if (listW0.size() != 3) {
                reviewStatusEntity.getId();
                return null;
            }
            String str2 = (String) listW0.get(0);
            String str3 = (String) listW0.get(1);
            reviewStatusEntity2 = reviewStatusEntity;
            try {
                String strF = kVar.f(reviewStatusEntity2, str2);
                long unitId = reviewStatusEntity2.getUnitId();
                fz.c cVar = (fz.c) f23561g.get(str3);
                if (cVar != null && (str = (String) cVar.invoke(Long.valueOf(unitId))) != null) {
                    str3 = str;
                }
                String str4 = strF + '_' + str3 + '_' + reviewStatusEntity2.getElemId();
                if ((ry.l.D(f23563i, strF) || reviewStatusEntity2.getElemType() != 2) && ((!ry.l.D(f23564j, Integer.valueOf(reviewStatusEntity2.getElemType())) || reviewStatusEntity2.getUnitId() != -1) && ((sRSStatusEntity = (SRSStatusEntity) map.get(str4)) == null || reviewStatusEntity2.getLastStudyTime() > sRSStatusEntity.getLastModifierTime()))) {
                    String str5 = (String) f23562h.get(str3);
                    if (str5 == null) {
                        reviewStatusEntity2.getId();
                        return null;
                    }
                    int iB2 = f23560f.contains(reviewStatusEntity2.getStatus()) ? wt.o.CORRECT.b() : wt.o.WRONG.b();
                    String status = reviewStatusEntity2.getStatus();
                    int iHashCode = status.hashCode();
                    if (iHashCode == 65) {
                        iB = !status.equals("A") ? s.NEW.b() : s.LEARNING.b();
                    } else if (iHashCode != 67) {
                        if (iHashCode == 68 && status.equals("D")) {
                            iB = s.REVIEW.b();
                        }
                    } else if (status.equals("C")) {
                        iB = s.REVIEW.b();
                    }
                    int i11 = iB;
                    int i12 = !kotlin.jvm.internal.m.a(reviewStatusEntity2.getStatus(), "B") ? 1 : 0;
                    long lastStudyTime = kotlin.jvm.internal.m.a(reviewStatusEntity2.getStatus(), "B") ? 0L : reviewStatusEntity2.getLastStudyTime();
                    qy.l lVarD = d(instant, j11, j12, reviewStatusEntity2.getStatus(), reviewStatusEntity2.getLastStudyTime());
                    return new SRSStatusEntity(str4, reviewStatusEntity2.getUnitId(), reviewStatusEntity2.getElemId(), reviewStatusEntity2.getElemType(), strF, str5, reviewStatusEntity2.getLastStudyTime(), iB2, i12, i11, lastStudyTime, ((Number) lVarD.f48495a).longValue(), 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, ((Number) lVarD.f48496b).intValue(), 0, reviewStatusEntity2.getLastStudyTime(), true, ReviewVisibilityMode.SHOW.getValue());
                }
                return null;
            } catch (Exception unused) {
                reviewStatusEntity2.getId();
                return null;
            }
        } catch (Exception unused2) {
            reviewStatusEntity2 = reviewStatusEntity;
        }
    }

    public static qy.l d(Instant instant, long j11, long j12, String str, long j13) {
        int iHashCode = str.hashCode();
        if (iHashCode != 65) {
            if (iHashCode != 67) {
                if (iHashCode == 68 && str.equals("D")) {
                    return new qy.l(Long.valueOf((j13 - j12) + instant.getEpochSecond() + Duration.ofDays(4L).getSeconds()), 3);
                }
            } else if (str.equals("C")) {
                return new qy.l(Long.valueOf((j13 - j11) + instant.getEpochSecond() + (Duration.ofDays(2L).getSeconds() * ((long) 1))), 1);
            }
        } else if (str.equals("A")) {
            return new qy.l(Long.valueOf(Duration.ofMinutes(1L).getSeconds() + j13), 0);
        }
        return new qy.l(0L, 0);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    public final String e(ReviewStatusEntity reviewStatusEntity) {
        String str;
        List listW0 = oz.q.W0(reviewStatusEntity.getId(), new String[]{"_"}, 3, 2);
        if (listW0.size() != 3) {
            return null;
        }
        String str2 = (String) listW0.get(0);
        String str3 = (String) listW0.get(1);
        String strF = f(reviewStatusEntity, str2);
        long unitId = reviewStatusEntity.getUnitId();
        fz.c cVar = (fz.c) f23561g.get(str3);
        if (cVar != null && (str = (String) cVar.invoke(Long.valueOf(unitId))) != null) {
            str3 = str;
        }
        return strF + '_' + str3 + '_' + reviewStatusEntity.getElemId();
    }

    public final String f(ReviewStatusEntity reviewStatusEntity, String str) {
        List list;
        q qVar;
        String strK;
        Object next;
        Object next2;
        if (reviewStatusEntity.getUnitId() != -1 && (list = (List) ((Map) this.f23568d.getValue()).get(str)) != null) {
            Iterator it = list.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                qVar = this.f23569e;
                strK = null;
                if (!zHasNext) {
                    next = null;
                    break;
                }
                next = it.next();
                Set set = (Set) ((Map) qVar.getValue()).get(xt.d.k(((Number) ((qy.l) next).f48495a).intValue()));
                if (set != null && set.contains(Long.valueOf(reviewStatusEntity.getUnitId()))) {
                    break;
                }
            }
            qy.l lVar = (qy.l) next;
            if (lVar != null) {
                strK = xt.d.k(((Number) lVar.f48495a).intValue());
            } else {
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    Set set2 = (Set) ((Map) qVar.getValue()).get(xt.d.k(((Number) ((qy.l) next2).f48496b).intValue()));
                    if (set2 != null && set2.contains(Long.valueOf(reviewStatusEntity.getUnitId()))) {
                        break;
                    }
                }
                qy.l lVar2 = (qy.l) next2;
                if (lVar2 != null) {
                    strK = xt.d.k(((Number) lVar2.f48496b).intValue());
                }
            }
            if (strK != null) {
                return strK;
            }
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(xy.c cVar) {
        i iVar;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i11 = iVar.f23552c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                iVar.f23552c = i11 - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        Object obj = iVar.f23550a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = iVar.f23552c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            System.currentTimeMillis();
            yz.f fVar = o0.f50940a;
            yz.e eVar = yz.e.f58387a;
            j jVar = new j(this, null);
            iVar.f23552c = 1;
            if (e0.M(eVar, jVar, iVar) == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
        }
        System.currentTimeMillis();
        return b0.f48488a;
    }
}
