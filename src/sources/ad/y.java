package ad;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Parcelable;
import android.util.Base64;
import b7.e0;
import bt.a3;
import bt.z6;
import com.google.api.Service;
import com.lingo.course.ui.CourseReviewListActivity;
import com.lingo.course.ui.CourseReviewTestActivity;
import com.lingodeer.data.model.AchievementLanguage;
import com.lingodeer.data.model.AchievementLeaderBoard;
import com.lingodeer.data.model.AchievementLevel;
import com.lingodeer.data.model.AchievementRecord;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.DayStreakWeeklyItemStatus;
import com.lingodeer.data.model.OptionItemSelectedState;
import com.lingodeer.data.model.RecordingStatus;
import com.lingodeer.data.model.TaskUnitLessonCollection;
import com.lingodeer.data.model.WordAccuracyScoreTimingResult;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import e6.j0;
import fr.c2;
import fr.d2;
import fr.e2;
import fr.i3;
import fr.o0;
import hj.d5;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import jt.h0;
import jt.q1;
import jt.s0;
import kr.l1;
import l1.a1;
import l1.b1;
import l1.b3;
import mt.n1;
import oo.k0;
import ot.t1;
import rt.b4;
import rt.e3;
import rt.ke;
import rt.m2;
import rt.o1;
import rt.r8;
import rt.x8;
import vt.n0;
import ys.d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f656d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i11, Object obj, Object obj2, vy.d dVar) {
        super(2, dVar);
        this.f653a = i11;
        this.f655c = obj;
        this.f656d = obj2;
    }

    private final Object e(Object obj) {
        b1 b1Var = (b1) this.f656d;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        HashMap map = new HashMap();
        AchievementLevel achievementLevel = (AchievementLevel) this.f654b;
        boolean z11 = false;
        boolean z12 = true;
        if (achievementLevel.getLevelHistory().length() > 0) {
            int i11 = 6;
            List<String> listW0 = oz.q.W0(achievementLevel.getLevelHistory(), new String[]{";"}, 0, 6);
            n0 n0Var = (n0) this.f655c;
            for (String str : listW0) {
                int i12 = Integer.parseInt((String) oz.q.W0(str, new String[]{":"}, 0, i11).get(0));
                long j11 = Long.parseLong((String) oz.q.W0(str, new String[]{":"}, 0, i11).get(1)) * ((long) 1000);
                int i13 = ((o0) n0Var).f27733a.locateLanguage;
                int i14 = i11;
                String str2 = new SimpleDateFormat(ry.l.D(new Integer[]{0, 9, 1}, Integer.valueOf(i13)) ? "yyyy年M月d日" : ry.l.D(new Integer[]{Integer.valueOf(i14)}, Integer.valueOf(i13)) ? "d. MMM yyy" : "MMM d, yyyy").format(new Date(j11));
                kotlin.jvm.internal.m.e(str2, "format(...)");
                String upperCase = str2.toUpperCase(Locale.ROOT);
                kotlin.jvm.internal.m.e(upperCase, "toUpperCase(...)");
                map.put(new Integer(i12), upperCase);
                i11 = i14;
            }
        }
        achievementLevel.getId();
        lz.g gVar = new lz.g(1, 10, 1);
        ArrayList arrayList = new ArrayList(ry.n.W(gVar, 10));
        Iterator it = gVar.iterator();
        while (((lz.f) it).f40537c) {
            int iNextInt = ((ry.w) it).nextInt();
            boolean z13 = iNextInt <= achievementLevel.getLevel() ? z12 : z11;
            String str3 = (String) map.get(new Integer(iNextInt));
            if (str3 == null) {
                str3 = BuildConfig.VERSION_NAME;
            }
            ArrayList arrayList2 = arrayList;
            arrayList2.add(AchievementLevel.copy$default(achievementLevel, null, iNextInt, z13, null, 0L, str3, 0, 89, null));
            arrayList = arrayList2;
            z12 = z12;
            z11 = false;
        }
        b1Var.setValue(arrayList);
        ((List) b1Var.getValue()).size();
        return qy.b0.f48488a;
    }

    private final Object j(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        v10.c.E((AchievementLanguage) this.f654b, tv.j.d((String) this.f656d), (ur.a) this.f655c);
        return qy.b0.f48488a;
    }

    private final Object m(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        vc.a.w((AchievementLeaderBoard) this.f654b, tv.j.d((String) this.f656d), (ur.a) this.f655c);
        return qy.b0.f48488a;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f653a) {
            case 0:
                return new y((wc.h) this.f654b, (Context) this.f655c, (String) this.f656d, dVar, 0);
            case 1:
                return new y((t1) this.f654b, (b1) this.f655c, (d0) this.f656d, dVar, 1);
            case 2:
                return new y((fz.e) this.f654b, (CourseWord) this.f655c, (b1) this.f656d, dVar, 2);
            case 3:
                return new y((b1) this.f654b, (fz.a) this.f655c, (b1) this.f656d, dVar, 3);
            case 4:
                return new y((CourseReviewListActivity) this.f654b, (List) this.f655c, (r8) this.f656d, dVar, 4);
            case 5:
                y yVar = new y((String) this.f656d, (String) this.f655c, dVar);
                yVar.f654b = obj;
                return yVar;
            case 6:
                return new y((jt.v) this.f654b, (rz.b0) this.f655c, (l0.w) this.f656d, dVar, 6);
            case 7:
                y yVar2 = new y(7, (i3) this.f655c, (kotlin.jvm.internal.y) this.f656d, dVar);
                yVar2.f654b = obj;
                return yVar2;
            case 8:
                y yVar3 = new y(8, (i3) this.f655c, (TaskUnitLessonCollection) this.f656d, dVar);
                yVar3.f654b = obj;
                return yVar3;
            case 9:
                return new y((fz.e) this.f654b, (p) this.f655c, (p) this.f656d, dVar, 9);
            case 10:
                return new y((hu.o) this.f654b, (b1) this.f655c, (a1) this.f656d, dVar, 10);
            case 11:
                y yVar4 = new y(11, (h0) this.f655c, (CourseWord) this.f656d, dVar);
                yVar4.f654b = obj;
                return yVar4;
            case 12:
                return new y((s0) this.f654b, (List) this.f655c, (ArrayList) this.f656d, dVar, 12);
            case 13:
                return new y((String) this.f656d, (String) this.f654b, (String) this.f655c, dVar);
            case 14:
                y yVar5 = new y(14, (q1) this.f655c, (CourseWord) this.f656d, dVar);
                yVar5.f654b = obj;
                return yVar5;
            case 15:
                return new y((b1) this.f654b, (k9.o) this.f655c, (x1.p) this.f656d, dVar, 15);
            case 16:
                return new y((List) this.f654b, (kr.b0) this.f655c, (kr.i) this.f656d, dVar, 16);
            case 17:
                return new y((fv.a) this.f654b, (uv.b) this.f655c, (String) this.f656d, dVar, 17);
            case 18:
                return new y((l1) this.f654b, (kr.a1) this.f655c, (List) this.f656d, dVar, 18);
            case 19:
                return new y((m2) this.f654b, (b1) this.f655c, (b1) this.f656d, dVar, 19);
            case 20:
                return new y((b3) this.f654b, (b1) this.f655c, (b1) this.f656d, dVar, 20);
            case 21:
                return new y((b4) this.f654b, (j9.v) this.f655c, (b1) this.f656d, dVar, 21);
            case 22:
                return new y((e3) this.f654b, (j9.v) this.f655c, (b1) this.f656d, dVar, 22);
            case 23:
                y yVar6 = new y(23, (dn.d) this.f655c, (b1) this.f656d, dVar);
                yVar6.f654b = obj;
                return yVar6;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return new y((sv.h) this.f654b, (j9.v) this.f655c, (b1) this.f656d, dVar, 24);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                y yVar7 = new y(25, (k0) this.f655c, (List) this.f656d, dVar);
                yVar7.f654b = obj;
                return yVar7;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return new y((AchievementLevel) this.f654b, (n0) this.f655c, (b1) this.f656d, dVar, 26);
            case 27:
                return new y((Parcelable) this.f654b, (String) this.f656d, (ur.a) this.f655c, dVar, 27);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return new y((Parcelable) this.f654b, (String) this.f656d, (ur.a) this.f655c, dVar, 28);
            default:
                return new y((Parcelable) this.f654b, (String) this.f656d, (ur.a) this.f655c, dVar, 29);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f653a) {
            case 0:
                y yVar = (y) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var = qy.b0.f48488a;
                yVar.invokeSuspend(b0Var);
                return b0Var;
            case 1:
                y yVar2 = (y) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var2 = qy.b0.f48488a;
                yVar2.invokeSuspend(b0Var2);
                return b0Var2;
            case 2:
                y yVar3 = (y) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var3 = qy.b0.f48488a;
                yVar3.invokeSuspend(b0Var3);
                return b0Var3;
            case 3:
                y yVar4 = (y) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var4 = qy.b0.f48488a;
                yVar4.invokeSuspend(b0Var4);
                return b0Var4;
            case 4:
                y yVar5 = (y) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var5 = qy.b0.f48488a;
                yVar5.invokeSuspend(b0Var5);
                return b0Var5;
            case 5:
                return ((y) create((r5.b) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 6:
                y yVar6 = (y) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var6 = qy.b0.f48488a;
                yVar6.invokeSuspend(b0Var6);
                return b0Var6;
            case 7:
                return ((y) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 8:
                return ((y) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 9:
                y yVar7 = (y) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var7 = qy.b0.f48488a;
                yVar7.invokeSuspend(b0Var7);
                return b0Var7;
            case 10:
                y yVar8 = (y) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var8 = qy.b0.f48488a;
                yVar8.invokeSuspend(b0Var8);
                return b0Var8;
            case 11:
                y yVar9 = (y) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var9 = qy.b0.f48488a;
                yVar9.invokeSuspend(b0Var9);
                return b0Var9;
            case 12:
                y yVar10 = (y) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var10 = qy.b0.f48488a;
                yVar10.invokeSuspend(b0Var10);
                return b0Var10;
            case 13:
                y yVar11 = (y) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var11 = qy.b0.f48488a;
                yVar11.invokeSuspend(b0Var11);
                return b0Var11;
            case 14:
                y yVar12 = (y) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var12 = qy.b0.f48488a;
                yVar12.invokeSuspend(b0Var12);
                return b0Var12;
            case 15:
                y yVar13 = (y) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var13 = qy.b0.f48488a;
                yVar13.invokeSuspend(b0Var13);
                return b0Var13;
            case 16:
                return ((y) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 17:
                return ((y) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 18:
                y yVar14 = (y) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var14 = qy.b0.f48488a;
                yVar14.invokeSuspend(b0Var14);
                return b0Var14;
            case 19:
                y yVar15 = (y) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var15 = qy.b0.f48488a;
                yVar15.invokeSuspend(b0Var15);
                return b0Var15;
            case 20:
                y yVar16 = (y) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var16 = qy.b0.f48488a;
                yVar16.invokeSuspend(b0Var16);
                return b0Var16;
            case 21:
                y yVar17 = (y) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var17 = qy.b0.f48488a;
                yVar17.invokeSuspend(b0Var17);
                return b0Var17;
            case 22:
                y yVar18 = (y) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var18 = qy.b0.f48488a;
                yVar18.invokeSuspend(b0Var18);
                return b0Var18;
            case 23:
                y yVar19 = (y) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var19 = qy.b0.f48488a;
                yVar19.invokeSuspend(b0Var19);
                return b0Var19;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                y yVar20 = (y) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var20 = qy.b0.f48488a;
                yVar20.invokeSuspend(b0Var20);
                return b0Var20;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                y yVar21 = (y) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var21 = qy.b0.f48488a;
                yVar21.invokeSuspend(b0Var21);
                return b0Var21;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                y yVar22 = (y) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var22 = qy.b0.f48488a;
                yVar22.invokeSuspend(b0Var22);
                return b0Var22;
            case 27:
                y yVar23 = (y) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var23 = qy.b0.f48488a;
                yVar23.invokeSuspend(b0Var23);
                return b0Var23;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                y yVar24 = (y) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var24 = qy.b0.f48488a;
                yVar24.invokeSuspend(b0Var24);
                return b0Var24;
            default:
                y yVar25 = (y) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var25 = qy.b0.f48488a;
                yVar25.invokeSuspend(b0Var25);
                return b0Var25;
        }
    }

    /* JADX WARN: Code duplicated, block: B:182:0x057d  */
    /* JADX WARN: Code duplicated, block: B:235:0x077f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [vy.d] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v15 */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmapDecodeStream;
        float fB;
        Float f5;
        ht.q qVar;
        ht.q qVar2;
        ArrayList arrayListG0;
        int i11 = this.f653a;
        int i12 = 4;
        ry.r rVar = ry.r.f50854a;
        int i13 = 3;
        ?? r9 = 0;
        Object obj2 = null;
        Object obj3 = null;
        int i14 = 0;
        z = false;
        z = false;
        boolean z11 = false;
        int i15 = 0;
        int i16 = 1;
        qy.b0 b0Var = qy.b0.f48488a;
        Object obj4 = this.f655c;
        Object obj5 = this.f656d;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                for (wc.x xVar : ((HashMap) ((wc.h) this.f654b).c()).values()) {
                    kotlin.jvm.internal.m.c(xVar);
                    String str = xVar.f55040d;
                    if (xVar.f55042f == null && oz.x.s0(str, "data:", false) && oz.q.I0(str, "base64,", 0, false, 6) > 0) {
                        try {
                            String strSubstring = str.substring(oz.q.H0(str, ',', 0, 6) + 1);
                            kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
                            byte[] bArrDecode = Base64.decode(strSubstring, 0);
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inScaled = true;
                            options.inDensity = 160;
                            xVar.f55042f = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                        } catch (IllegalArgumentException e8) {
                            kd.d.c("data URL did not have correct base64 format.", e8);
                        }
                    }
                    Context context = (Context) obj4;
                    String str2 = (String) obj5;
                    if (xVar.f55042f == null && str2 != null) {
                        try {
                            InputStream inputStreamOpen = context.getAssets().open(str2 + str);
                            kotlin.jvm.internal.m.c(inputStreamOpen);
                            try {
                                BitmapFactory.Options options2 = new BitmapFactory.Options();
                                options2.inScaled = true;
                                options2.inDensity = 160;
                                bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen, null, options2);
                            } catch (IllegalArgumentException e10) {
                                kd.d.c("Unable to decode image.", e10);
                                bitmapDecodeStream = null;
                            }
                            if (bitmapDecodeStream != null) {
                                xVar.f55042f = kd.k.d(bitmapDecodeStream, xVar.f55037a, xVar.f55038b);
                            }
                        } catch (IOException e11) {
                            kd.d.c("Unable to open asset.", e11);
                        }
                        break;
                    }
                    break;
                }
                return b0Var;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                d0 d0Var = (d0) obj5;
                String strL = e0.l(((t1) this.f654b).f45998b, "toString(...)");
                b1 b1Var = (b1) obj4;
                bp.p pVar = new bp.p(22, b1Var);
                if (d0Var != null) {
                    d0.e(d0Var, strL, new a3(1, pVar, kotlin.jvm.internal.l.class, "suspendConversion1", "CourseTestWordJudgeRoute$onClickPlayAudio$suspendConversion1(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 2), 4);
                }
                b1Var.setValue(new ht.c(rVar, 0, 1.0f));
                return b0Var;
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                CourseWord courseWord = (CourseWord) obj4;
                b1 b1Var2 = (b1) obj5;
                ((fz.e) this.f654b).invoke(e0.l(courseWord, "toString(...)"), new z6(14, b1Var2));
                b1Var2.setValue(new ht.c(courseWord.getVisemedMap()));
                return b0Var;
            case 3:
                b1 b1Var3 = (b1) this.f654b;
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (((Boolean) ((b1) obj5).getValue()).booleanValue() && ((Boolean) b1Var3.getValue()).booleanValue()) {
                    b1Var3.setValue(Boolean.FALSE);
                    ((fz.a) obj4).invoke();
                }
                return b0Var;
            case 4:
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                CourseReviewListActivity courseReviewListActivity = (CourseReviewListActivity) this.f654b;
                int i17 = CourseReviewListActivity.L;
                if (((x8) courseReviewListActivity.f21614t.getValue()) != x8.EXTENT_WORD) {
                    int i18 = CourseReviewTestActivity.M;
                    courseReviewListActivity.startActivity(tw.c.r(courseReviewListActivity, (List) obj4, null, (r8) obj5, 12));
                }
                return b0Var;
            case 5:
                wy.a aVar6 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                r5.b bVar = (r5.b) this.f654b;
                r5.b bVarG = bVar.g();
                String str3 = (String) obj5;
                String str4 = (String) obj4;
                r5.d dVar = e6.o0.f25004g;
                Set set = (Set) bVar.c(dVar);
                if (set == null) {
                    set = ry.t.f50856a;
                }
                bVarG.f(dVar, qx.b.E(set, str3));
                bVarG.f(j0.a(e6.o0.f25001d, str3), str4);
                return bVarG.h();
            case 6:
                wy.a aVar7 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                jt.v vVar = (jt.v) this.f654b;
                if (vVar.f37214e.getValue() instanceof RecordingStatus.RecognizeShowScore) {
                    rz.e0.B((rz.b0) obj4, null, null, new et.a0((l0.w) obj5, vVar, r9, i14), 3);
                }
                return b0Var;
            case 7:
                rz.b0 b0Var2 = (rz.b0) this.f654b;
                wy.a aVar8 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                i3 i3Var = (i3) obj4;
                rz.e0.B(b0Var2, null, null, new c2(i3Var, null), 3);
                kotlin.jvm.internal.y yVar = (kotlin.jvm.internal.y) obj5;
                rz.e0.B(b0Var2, null, null, new d2(i3Var, yVar, r9, i14), 3);
                rz.e0.B(b0Var2, null, null, new d2(i3Var, yVar, r9, i16), 3);
                rz.e0.B(b0Var2, null, null, new d2(i3Var, yVar, r9, 2), 3);
                rz.e0.B(b0Var2, null, null, new d2(i3Var, yVar, r9, i13), 3);
                rz.e0.B(b0Var2, null, null, new d2(i3Var, yVar, r9, i12), 3);
                rz.e0.B(b0Var2, null, null, new d2(i3Var, yVar, r9, 5), 3);
                return rz.e0.B(b0Var2, null, null, new e2(i14, i3Var, r9), 3);
            case 8:
                rz.b0 b0Var3 = (rz.b0) this.f654b;
                wy.a aVar9 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                i3 i3Var2 = (i3) obj4;
                TaskUnitLessonCollection taskUnitLessonCollection = (TaskUnitLessonCollection) obj5;
                rz.e0.B(b0Var3, null, null, new fr.e3(i3Var2, taskUnitLessonCollection, r9, i14), 3);
                return rz.e0.B(b0Var3, null, null, new fr.e3(i3Var2, taskUnitLessonCollection, r9, i16), 3);
            case 9:
                p pVar2 = (p) obj5;
                wy.a aVar10 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                p pVar3 = (p) obj4;
                wc.h hVar = (wc.h) pVar3.getValue();
                if ((hVar != null ? new Float(hVar.b()) : null) != null) {
                    wc.h hVar2 = (wc.h) pVar2.getValue();
                    if (hVar2 != null) {
                        f5 = new Float(hVar2.b());
                    }
                    if (r9 != 0) {
                        fz.e eVar = (fz.e) this.f654b;
                        wc.h hVar3 = (wc.h) pVar3.getValue();
                        float fB2 = CropImageView.DEFAULT_ASPECT_RATIO;
                        if (hVar3 != null) {
                            r9 = f5;
                            fB = hVar3.b();
                        } else {
                            r9 = f5;
                            fB = 0.0f;
                        }
                        Float f11 = new Float(fB);
                        wc.h hVar4 = (wc.h) pVar3.getValue();
                        float fB3 = hVar4 != null ? hVar4.b() : 0.0f;
                        wc.h hVar5 = (wc.h) pVar2.getValue();
                        if (hVar5 != null) {
                            fB2 = hVar5.b();
                        }
                        eVar.invoke(f11, new Float(fB3 + fB2));
                    }
                }
                r9 = f5;
                return b0Var;
            case 10:
                wy.a aVar11 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                b1 b1Var4 = (b1) obj4;
                b1Var4.setValue(Boolean.FALSE);
                fu.e0.c((a1) obj5, 1);
                ((hu.o) this.f654b).a(7, DayStreakWeeklyItemStatus.STREAK);
                b1Var4.setValue(Boolean.TRUE);
                return b0Var;
            case 11:
                wy.a aVar12 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                h0 h0Var = (h0) obj4;
                b1 b1Var5 = h0Var.f36960f;
                b1 b1Var6 = h0Var.f36960f;
                Iterable<CourseWord> iterable = (Iterable) b1Var5.getValue();
                CourseWord courseWord2 = (CourseWord) obj5;
                ArrayList arrayList = new ArrayList(ry.n.W(iterable, 10));
                boolean z12 = false;
                for (CourseWord courseWordCopy$default : iterable) {
                    if (courseWordCopy$default.isQuestionWord() && !z12 && kotlin.jvm.internal.m.a(courseWordCopy$default.getWord(), "_____")) {
                        courseWordCopy$default = CourseWord.copy$default(courseWordCopy$default, 0L, courseWord2.getWord(), courseWord2.getZhuYin(), courseWord2.getLuoMa(), null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -15, 63, null);
                        z12 = true;
                    }
                    arrayList.add(courseWordCopy$default);
                    z12 = z12;
                }
                b1Var5.setValue(arrayList);
                if (z12) {
                    b1 b1Var7 = h0Var.f36961g;
                    Iterable<CourseWord> iterable2 = (Iterable) b1Var7.getValue();
                    ArrayList arrayList2 = new ArrayList(ry.n.W(iterable2, 10));
                    for (CourseWord courseWordCopy$default2 : iterable2) {
                        if (kotlin.jvm.internal.m.a(courseWordCopy$default2, courseWord2)) {
                            courseWordCopy$default2 = CourseWord.copy$default(courseWordCopy$default2, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.SELECTED, null, null, 0, -1, 59, null);
                        }
                        arrayList2.add(courseWordCopy$default2);
                    }
                    b1Var7.setValue(arrayList2);
                    Iterable iterable3 = (Iterable) b1Var6.getValue();
                    ArrayList arrayList3 = new ArrayList(ry.n.W(iterable3, 10));
                    for (Object obj6 : iterable3) {
                        int i19 = i14 + 1;
                        if (i14 < 0) {
                            ns.o.V();
                            throw null;
                        }
                        arrayList3.add(c.a.f((CourseWord) obj6, (List) b1Var6.getValue(), i14, h0Var.f36955a));
                        i14 = i19;
                    }
                    b1Var6.setValue(arrayList3);
                    b1 b1Var8 = h0Var.f36958d;
                    for (Object obj7 : (Iterable) b1Var6.getValue()) {
                        if (kotlin.jvm.internal.m.a(((CourseWord) obj7).getWord(), "_____")) {
                            obj3 = obj7;
                            if (((CourseWord) obj3) != null || (qVar = ht.q.DEFAULT) == null) {
                                qVar = ht.q.SELECTED;
                            }
                            b1Var8.setValue(qVar);
                        }
                    }
                    if (((CourseWord) obj3) != null) {
                        qVar = ht.q.SELECTED;
                    } else {
                        qVar = ht.q.SELECTED;
                    }
                    b1Var8.setValue(qVar);
                }
                return b0Var;
            case 12:
                wy.a aVar13 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                s0 s0Var = (s0) this.f654b;
                s0Var.f37172p.clear();
                s0Var.f37172p.addAll((List) obj4);
                s0Var.f37174r.setValue((ArrayList) obj5);
                return b0Var;
            case 13:
                String str5 = (String) obj4;
                String str6 = (String) this.f654b;
                wy.a aVar14 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                String str7 = (String) obj5;
                if (new File(str7).exists()) {
                    new File(str7).delete();
                }
                if (new File(str6).exists()) {
                    new File(str6).delete();
                }
                if (new File(str5).exists()) {
                    new File(str5).delete();
                }
                return b0Var;
            case 14:
                wy.a aVar15 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                q1 q1Var = (q1) obj4;
                b1 b1Var9 = q1Var.f37131i;
                b1 b1Var10 = q1Var.f37131i;
                Iterable<CourseWord> iterable4 = (Iterable) b1Var9.getValue();
                CourseWord courseWord3 = (CourseWord) obj5;
                ArrayList arrayList4 = new ArrayList(ry.n.W(iterable4, 10));
                boolean z13 = false;
                for (CourseWord courseWordCopy$default3 : iterable4) {
                    if (courseWordCopy$default3.isQuestionWord() && !z13 && kotlin.jvm.internal.m.a(courseWordCopy$default3.getWord(), "_____")) {
                        courseWordCopy$default3 = CourseWord.copy$default(courseWordCopy$default3, 0L, courseWord3.getWord(), null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -3, 63, null);
                        z13 = true;
                    }
                    arrayList4.add(courseWordCopy$default3);
                    z13 = z13;
                }
                b1Var9.setValue(arrayList4);
                if (z13) {
                    b1 b1Var11 = q1Var.f37132j;
                    Iterable<CourseWord> iterable5 = (Iterable) b1Var11.getValue();
                    ArrayList arrayList5 = new ArrayList(ry.n.W(iterable5, 10));
                    for (CourseWord courseWordCopy$default4 : iterable5) {
                        if (kotlin.jvm.internal.m.a(courseWordCopy$default4, courseWord3)) {
                            courseWordCopy$default4 = CourseWord.copy$default(courseWordCopy$default4, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.SELECTED, null, null, 0, -1, 59, null);
                        }
                        arrayList5.add(courseWordCopy$default4);
                    }
                    b1Var11.setValue(arrayList5);
                    Iterable iterable6 = (Iterable) b1Var10.getValue();
                    ArrayList arrayList6 = new ArrayList(ry.n.W(iterable6, 10));
                    for (Object obj8 : iterable6) {
                        int i21 = i15 + 1;
                        if (i15 < 0) {
                            ns.o.V();
                            throw null;
                        }
                        arrayList6.add(c.a.f((CourseWord) obj8, (List) b1Var10.getValue(), i15, q1Var.f37126d));
                        i15 = i21;
                    }
                    b1Var10.setValue(arrayList6);
                    b1 b1Var12 = q1Var.f37128f;
                    for (Object obj9 : (Iterable) b1Var10.getValue()) {
                        if (kotlin.jvm.internal.m.a(((CourseWord) obj9).getWord(), "_____")) {
                            obj2 = obj9;
                            if (((CourseWord) obj2) != null || (qVar2 = ht.q.DEFAULT) == null) {
                                qVar2 = ht.q.SELECTED;
                            }
                            b1Var12.setValue(qVar2);
                        }
                    }
                    if (((CourseWord) obj2) != null) {
                        qVar2 = ht.q.SELECTED;
                    } else {
                        qVar2 = ht.q.SELECTED;
                    }
                    b1Var12.setValue(qVar2);
                }
                return b0Var;
            case 15:
                wy.a aVar16 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                k9.o oVar = (k9.o) obj4;
                x1.p pVar4 = (x1.p) obj5;
                for (j9.e eVar2 : (Set) ((b1) this.f654b).getValue()) {
                    if (!((List) oVar.b().f36206e.f53391a.getValue()).contains(eVar2) && !pVar4.contains(eVar2)) {
                        oVar.b().c(eVar2);
                    }
                }
                return b0Var;
            case 16:
                wy.a aVar17 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                List<ir.b> list = (List) this.f654b;
                kr.b0 b0Var4 = (kr.b0) obj4;
                kr.i iVar = (kr.i) obj5;
                ArrayList arrayList7 = new ArrayList(ry.n.W(list, 10));
                for (ir.b bVar2 : list) {
                    qy.q qVar3 = fv.b.f28186a;
                    String strQ0 = xt.b.a().p() + xt.d.e(fv.b.k().keyLanguage) + "_" + b0Var4.f38428e + "_" + iVar.f38491a + "/recorder_" + ((int) bVar2.f34557a.getSentenceId()) + ".mp3";
                    if (!com.google.android.material.datepicker.d.D(strQ0)) {
                        strQ0 = oz.x.q0(strQ0, ".mp3", ".wav");
                    }
                    arrayList7.add(strQ0);
                }
                return arrayList7;
            case 17:
                wy.a aVar18 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                String parent = new File(((fv.a) this.f654b).f28184c).getParent();
                if (parent == null) {
                    parent = BuildConfig.VERSION_NAME;
                }
                String str8 = ((uv.b) obj4).f53186g;
                kotlin.jvm.internal.m.e(str8, "getFilename(...)");
                String str9 = (String) obj5;
                File file = new File(parent, str8);
                if (file.exists()) {
                    File file2 = new File(parent);
                    String strS0 = oz.q.S0(str8, ".zip");
                    try {
                        qy.l lVarA = ks.b.a(file);
                        String str10 = (String) lVarA.f48496b;
                        ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(file)));
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                ZipEntry nextEntry = zipInputStream.getNextEntry();
                                if (nextEntry != null) {
                                    String name = nextEntry.getName();
                                    kotlin.jvm.internal.m.e(name, "getName(...)");
                                    if (!ks.b.k(name)) {
                                        String name2 = nextEntry.getName();
                                        kotlin.jvm.internal.m.e(name2, "getName(...)");
                                        String strB = ks.b.b(name2, str10);
                                        String str11 = strB.length() == 0 ? strS0 : strS0 + "/" + strB;
                                        File file3 = new File(file2, str11);
                                        if (!ks.b.f(file3, file2)) {
                                            throw new SecurityException("检测到不安全的解压路径: " + str11);
                                        }
                                        if (!nextEntry.isDirectory()) {
                                            File parentFile = file3.getParentFile();
                                            if (parentFile != null && !parentFile.exists()) {
                                                parentFile.mkdirs();
                                            }
                                            FileOutputStream fileOutputStream = new FileOutputStream(file3);
                                            while (true) {
                                                try {
                                                    int i22 = zipInputStream.read(bArr);
                                                    if (i22 != -1) {
                                                        fileOutputStream.write(bArr, 0, i22);
                                                    } else {
                                                        fileOutputStream.close();
                                                    }
                                                } catch (Throwable th2) {
                                                    try {
                                                        throw th2;
                                                    } catch (Throwable th3) {
                                                        ns.o.m(fileOutputStream, th2);
                                                        throw th3;
                                                    }
                                                }
                                                try {
                                                    throw th;
                                                } catch (Throwable th4) {
                                                    ns.o.m(zipInputStream, th);
                                                    throw th4;
                                                }
                                            }
                                        }
                                        if (strB.length() > 0 && !file3.exists()) {
                                            file3.mkdirs();
                                        }
                                    }
                                } else {
                                    zipInputStream.close();
                                    file.delete();
                                    new File(parent, str9).createNewFile();
                                    z11 = true;
                                }
                                e.printStackTrace();
                            }
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    } catch (IOException e12) {
                        e12.printStackTrace();
                    } catch (SecurityException e13) {
                        e13.printStackTrace();
                    }
                }
                return Boolean.valueOf(z11);
            case 18:
                wy.a aVar19 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                l1 l1Var = (l1) this.f654b;
                n0 n0Var = l1Var.f38524b;
                String strV = ((o0) n0Var).v();
                String strK = xt.d.k(((o0) n0Var).f27733a.keyLanguage);
                int i23 = l1Var.f38527e;
                long sentenceId = ((kr.a1) obj4).f38410a.f34557a.getSentenceId();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strV);
                sb2.append(strK);
                sb2.append("-story-");
                sb2.append(i23);
                sb2.append("-");
                File file4 = new File(defpackage.e.i(sentenceId, "-result.json", sb2));
                h00.b bVar3 = h00.c.f29915d;
                bVar3.getClass();
                cz.k.V(file4, bVar3.c(new g00.d(WordAccuracyScoreTimingResult.Companion.serializer(), 0), (List) obj5));
                return b0Var;
            case 19:
                wy.a aVar20 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                b1 b1Var13 = (b1) obj4;
                List list2 = (List) b1Var13.getValue();
                m2 m2Var = (m2) this.f654b;
                if (list2.contains(m2Var)) {
                    List list3 = (List) b1Var13.getValue();
                    arrayListG0 = new ArrayList();
                    for (Object obj10 : list3) {
                        if (!kotlin.jvm.internal.m.a((m2) obj10, m2Var)) {
                            arrayListG0.add(obj10);
                        }
                    }
                } else {
                    arrayListG0 = ry.m.G0(m2Var, (List) b1Var13.getValue());
                }
                b1Var13.setValue(arrayListG0);
                b1 b1Var14 = (b1) obj5;
                List<m2> list4 = (List) b1Var14.getValue();
                ArrayList arrayList8 = new ArrayList(ry.n.W(list4, 10));
                for (m2 m2VarA : list4) {
                    if (kotlin.jvm.internal.m.a(m2VarA, m2Var)) {
                        m2VarA = m2.a(m2Var, !m2Var.f50052c);
                    }
                    arrayList8.add(m2VarA);
                }
                b1Var14.setValue(arrayList8);
                return b0Var;
            case 20:
                wy.a aVar21 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                b3 b3Var = (b3) this.f654b;
                float f12 = n1.f41680a;
                if (((o1) b3Var.getValue()).f50173k <= 0 || ((o1) b3Var.getValue()).f50165c == ke.HIDDEN) {
                    Boolean bool = Boolean.FALSE;
                    ((b1) obj4).setValue(bool);
                    ((b1) obj5).setValue(bool);
                }
                return b0Var;
            case 21:
                wy.a aVar22 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                ((b4) this.f654b).f49488b0.f4943a = true;
                ((b1) obj5).setValue(Boolean.TRUE);
                ((j9.v) obj4).c();
                return b0Var;
            case 22:
                wy.a aVar23 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                ((e3) this.f654b).A0.f4943a = true;
                ((b1) obj5).setValue(Boolean.TRUE);
                ((j9.v) obj4).c();
                return b0Var;
            case 23:
                b1 b1Var15 = (b1) obj5;
                wy.a aVar24 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                dn.d dVar2 = (dn.d) obj4;
                if (dVar2 != null) {
                    ArrayList arrayList9 = new ArrayList();
                    int iF = dVar2.f();
                    for (int i24 = 0; i24 < iF; i24++) {
                        int iA = dVar2.a();
                        for (int i25 = 0; i25 < iA; i25++) {
                            arrayList9.add(dVar2.d(i24, i25));
                        }
                    }
                    b1Var15.setValue(arrayList9);
                } else {
                    b1Var15.setValue(rVar);
                }
                return b0Var;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                wy.a aVar25 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (((sv.h) this.f654b).f51805a) {
                    j9.v.b((j9.v) obj4, "syllable_intro_first");
                    ((b1) obj5).setValue(Boolean.TRUE);
                }
                return b0Var;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                wy.a aVar26 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                k0 k0Var = (k0) obj4;
                try {
                    k0.x(k0Var, (List) obj5);
                    ta.a aVar27 = k0Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar27);
                    ((d5) aVar27).f32499e.setOnScrollChangedListener(k0Var.f45692b0);
                    break;
                } catch (Throwable th6) {
                    com.bumptech.glide.e.l(th6);
                }
                return b0Var;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return e(obj);
            case 27:
                return j(obj);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return m(obj);
            default:
                wy.a aVar28 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                android.support.v4.media.session.a.G((AchievementRecord) this.f654b, tv.j.d((String) obj5), (ur.a) obj4);
                return b0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(Parcelable parcelable, String str, ur.a aVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f653a = i11;
        this.f654b = parcelable;
        this.f656d = str;
        this.f655c = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(Object obj, Object obj2, Object obj3, vy.d dVar, int i11) {
        super(2, dVar);
        this.f653a = i11;
        this.f654b = obj;
        this.f655c = obj2;
        this.f656d = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(String str, String str2, String str3, vy.d dVar) {
        super(2, dVar);
        this.f653a = 13;
        this.f656d = str;
        this.f654b = str2;
        this.f655c = str3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(String str, String str2, vy.d dVar) {
        super(2, dVar);
        this.f653a = 5;
        this.f656d = str;
        this.f655c = str2;
    }
}
