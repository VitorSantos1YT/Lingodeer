package bp;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import com.lingo.lingoskill.ui.base.LoginActivity;
import com.lingo.lingoskill.ui.base.SignUpActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.AchievementLanguage;
import com.lingodeer.data.model.AchievementLeaderBoard;
import com.lingodeer.data.model.AchievementRecord;
import com.lingodeer.data.model.CoursePracticeType;
import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.LawInfo;
import com.lingodeer.data.model.uistate.LeaderBoardClass;
import com.lingodeer.data.model.uistate.LeaderBoardUser;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import rt.fc;
import rt.gc;
import rt.ka;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x1 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4896e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4897f;

    public /* synthetic */ x1(CoursePracticeType coursePracticeType, gc gcVar, fz.a aVar, fz.a aVar2, l1.b1 b1Var) {
        this.f4892a = 15;
        this.f4897f = coursePracticeType;
        this.f4894c = gcVar;
        this.f4895d = aVar;
        this.f4896e = aVar2;
        this.f4893b = b1Var;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:? A[LOOP:2: B:39:0x00c0->B:117:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0098  */
    /* JADX WARN: Code duplicated, block: B:30:0x009b  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, qy.h] */
    @Override // fz.a
    public final Object invoke() {
        String className;
        Object obj;
        int size;
        int i11;
        Object obj2;
        int size2;
        Object obj3;
        int i12 = this.f4892a;
        String str = BuildConfig.VERSION_NAME;
        int i13 = 1;
        Object obj4 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        int i14 = 0;
        qy.b0 b0Var = qy.b0.f48488a;
        Object obj5 = this.f4893b;
        Object obj6 = this.f4896e;
        Object obj7 = this.f4895d;
        Object obj8 = this.f4894c;
        Object obj9 = this.f4897f;
        switch (i12) {
            case 0:
                LoginActivity loginActivity = (LoginActivity) obj9;
                l1.b1 b1Var = (l1.b1) obj7;
                l1.b1 b1Var2 = (l1.b1) obj6;
                int i15 = LoginActivity.Q;
                String emailString = oz.q.i1((String) ((l1.b1) obj5).getValue()).toString();
                String string = oz.q.i1((String) ((l1.b1) obj8).getValue()).toString();
                kotlin.jvm.internal.m.f(emailString, "emailString");
                if (!Pattern.compile("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z0-9-]{2,63}$").matcher(emailString).matches()) {
                    b1Var.setValue(Boolean.TRUE);
                } else if (string.length() < 6) {
                    b1Var2.setValue(Boolean.TRUE);
                } else {
                    loginActivity.r(true);
                    loginActivity.q().c(new wu.w(emailString, string));
                }
                return b0Var;
            case 1:
                SignUpActivity signUpActivity = (SignUpActivity) obj9;
                l1.b1 b1Var3 = (l1.b1) obj5;
                l1.b1 b1Var4 = (l1.b1) obj8;
                l1.b1 b1Var5 = (l1.b1) obj7;
                l1.b1 b1Var6 = (l1.b1) obj6;
                int i16 = SignUpActivity.L;
                String emailString2 = oz.q.i1((String) b1Var3.getValue()).toString();
                String string2 = oz.q.i1((String) b1Var4.getValue()).toString();
                kotlin.jvm.internal.m.f(emailString2, "emailString");
                if (!Pattern.compile("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z0-9-]{2,63}$").matcher(emailString2).matches()) {
                    b1Var5.setValue(Boolean.TRUE);
                } else if (string2.length() < 6) {
                    b1Var6.setValue(Boolean.TRUE);
                } else {
                    signUpActivity.f22046t.setValue(Boolean.TRUE);
                    String str2 = (String) oz.q.W0((String) b1Var3.getValue(), new String[]{"@"}, 0, 6).get(0);
                    wu.k0 k0Var = (wu.k0) signUpActivity.K.getValue();
                    wu.l0 l0Var = new wu.l0(oz.q.i1((String) b1Var3.getValue()).toString(), str2, oz.q.i1((String) b1Var4.getValue()).toString(), (LawInfo) signUpActivity.H.getValue());
                    uz.i1 i1Var = k0Var.f55414d;
                    i1Var.getClass();
                    i1Var.l(null, l0Var);
                }
                return b0Var;
            case 2:
                String recordingPath = (String) obj9;
                l1.b1 b1Var7 = (l1.b1) obj5;
                l1.b1 b1Var8 = (l1.b1) obj8;
                l1.b1 b1Var9 = (l1.b1) obj7;
                ys.d0 d0Var = (ys.d0) obj6;
                if (((Boolean) b1Var7.getValue()).booleanValue()) {
                    b1Var7.setValue(Boolean.FALSE);
                    b1Var8.setValue(Boolean.TRUE);
                }
                p pVar = new p(14, b1Var9);
                if (d0Var != null) {
                    kotlin.jvm.internal.m.f(recordingPath, "recordingPath");
                    av.n nVar = d0Var.f57964g;
                    tp.g gVar = new tp.g(pVar, 9);
                    nVar.getClass();
                    nVar.f3172c = gVar;
                    nVar.m(1.0f, false);
                    nVar.h(recordingPath);
                }
                b1Var9.setValue(ht.g.f33738e);
                return b0Var;
            case 3:
                e2.l.a((e2.l) obj9);
                rz.e0.B((rz.b0) obj5, null, null, new a0.e0((jt.m1) obj8, (CourseSentence) obj7, (fz.c) obj6, (vy.d) null, 12), 3);
                return b0Var;
            case 4:
                ((ur.a) obj9).c("jxz_main_emm_feedback_like", new dt.m0((ys.v) obj7, (ns.z) obj6, i13));
                Toast.makeText((Context) obj5, (String) obj8, 0).show();
                return b0Var;
            case 5:
                fz.a aVar = (fz.a) obj9;
                fz.c cVar = (fz.c) obj8;
                Context context = (Context) obj7;
                fz.a aVar2 = (fz.a) obj6;
                ((l1.b1) obj5).setValue(Boolean.FALSE);
                if (aVar != null) {
                    aVar.invoke();
                } else {
                    cVar.invoke(BuildConfig.VERSION_NAME);
                }
                Toast.makeText(context, R.string.knowledge_note_deleted_message, 0).show();
                aVar2.invoke();
                return b0Var;
            case 6:
                rt.b4 b4Var = (rt.b4) obj9;
                mt.m3.h((l1.b1) obj5, (l1.b1) obj8, b4Var, (l1.b1) obj7, (rt.m0) b4Var.f49503m0.f53391a.getValue(), ((ka) ((l1.b3) obj6).getValue()).f49982b, new lt.e(b4Var, 3));
                return b0Var;
            case 7:
                kotlin.jvm.internal.y yVar = (kotlin.jvm.internal.y) obj9;
                fz.c cVar2 = (fz.c) obj5;
                rz.b0 b0Var2 = (rz.b0) obj8;
                AchievementLanguage achievementLanguage = (AchievementLanguage) obj7;
                ur.a aVar3 = (ur.a) obj6;
                String.valueOf(yVar.f38361a);
                Uri uri = (Uri) yVar.f38361a;
                if (uri != null) {
                    cVar2.invoke(uri);
                    rz.e0.B(b0Var2, null, null, new pr.u(achievementLanguage, aVar3, objArr == true ? 1 : 0, i14), 3);
                }
                return b0Var;
            case 8:
                rz.b0 b0Var3 = (rz.b0) obj5;
                Context context2 = (Context) obj8;
                AchievementLanguage achievementLanguage2 = (AchievementLanguage) obj7;
                ur.a aVar4 = (ur.a) obj6;
                Bitmap bitmap = (Bitmap) ((kotlin.jvm.internal.y) obj9).f38361a;
                if (bitmap != null) {
                    rz.e0.B(b0Var3, null, null, new pr.o(context2, bitmap, null, 1), 3);
                    rz.e0.B(b0Var3, null, null, new pr.u(achievementLanguage2, aVar4, objArr2 == true ? 1 : 0, i13), 3);
                }
                return b0Var;
            case 9:
                kotlin.jvm.internal.y yVar2 = (kotlin.jvm.internal.y) obj9;
                fz.c cVar3 = (fz.c) obj5;
                rz.b0 b0Var4 = (rz.b0) obj8;
                AchievementLeaderBoard achievementLeaderBoard = (AchievementLeaderBoard) obj7;
                ur.a aVar5 = (ur.a) obj6;
                String.valueOf(yVar2.f38361a);
                Uri uri2 = (Uri) yVar2.f38361a;
                if (uri2 != null) {
                    cVar3.invoke(uri2);
                    rz.e0.B(b0Var4, null, null, new pr.v(achievementLeaderBoard, aVar5, objArr3 == true ? 1 : 0, i14), 3);
                }
                return b0Var;
            case 10:
                rz.b0 b0Var5 = (rz.b0) obj5;
                Context context3 = (Context) obj8;
                AchievementLeaderBoard achievementLeaderBoard2 = (AchievementLeaderBoard) obj7;
                ur.a aVar6 = (ur.a) obj6;
                Bitmap bitmap2 = (Bitmap) ((kotlin.jvm.internal.y) obj9).f38361a;
                if (bitmap2 != null) {
                    rz.e0.B(b0Var5, null, null, new pr.o(context3, bitmap2, null, 2), 3);
                    rz.e0.B(b0Var5, null, null, new pr.v(achievementLeaderBoard2, aVar6, objArr4 == true ? 1 : 0, i13), 3);
                }
                return b0Var;
            case 11:
                kotlin.jvm.internal.y yVar3 = (kotlin.jvm.internal.y) obj9;
                fz.c cVar4 = (fz.c) obj5;
                rz.b0 b0Var6 = (rz.b0) obj8;
                AchievementRecord achievementRecord = (AchievementRecord) obj7;
                ur.a aVar7 = (ur.a) obj6;
                String.valueOf(yVar3.f38361a);
                Uri uri3 = (Uri) yVar3.f38361a;
                if (uri3 != null) {
                    cVar4.invoke(uri3);
                    rz.e0.B(b0Var6, null, null, new pr.w(achievementRecord, aVar7, objArr5 == true ? 1 : 0, i14), 3);
                }
                return b0Var;
            case 12:
                rz.b0 b0Var7 = (rz.b0) obj5;
                Context context4 = (Context) obj8;
                AchievementRecord achievementRecord2 = (AchievementRecord) obj7;
                ur.a aVar8 = (ur.a) obj6;
                Bitmap bitmap3 = (Bitmap) ((kotlin.jvm.internal.y) obj9).f38361a;
                if (bitmap3 != null) {
                    rz.e0.B(b0Var7, null, null, new pr.o(context4, bitmap3, null, 3), 3);
                    rz.e0.B(b0Var7, null, null, new pr.w(achievementRecord2, aVar8, objArr6 == true ? 1 : 0, i13), 3);
                }
                return b0Var;
            case 13:
                View view = (View) obj9;
                View view2 = (View) obj5;
                qp.s2 s2Var = (qp.s2) obj8;
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                view2.getLocationOnScreen(iArr);
                z4.w0 w0VarB = z4.s0.b(view);
                w0VarB.k(iArr[0] - iArr2[0]);
                w0VarB.m(iArr[1] - iArr2[1]);
                w0VarB.e(s2Var.f48185p);
                w0VarB.g(new qp.q2(s2Var, view, (CardView) obj7, view2, (View) obj6));
                w0VarB.f(new DecelerateInterpolator());
                w0VarB.i();
                return b0Var;
            case 14:
                LeaderBoardClass leaderBoardClass = (LeaderBoardClass) obj9;
                ArrayList arrayList = (ArrayList) obj5;
                ArrayList arrayList2 = (ArrayList) obj8;
                ArrayList arrayList3 = (ArrayList) obj7;
                String str3 = (String) obj6;
                Bundle bundle = new Bundle();
                bundle.putString("source", "bottom_nav");
                bundle.putString("status", "ranks");
                if (leaderBoardClass == null || (className = leaderBoardClass.getClassName()) == null) {
                    className = BuildConfig.VERSION_NAME;
                }
                bundle.putString("league", className);
                int size3 = arrayList.size();
                int i17 = 0;
                do {
                    if (i17 < size3) {
                        obj = arrayList.get(i17);
                        i17++;
                    } else {
                        obj = null;
                    }
                    if (obj != null) {
                        str = "PROMOTION_ZONE";
                    } else {
                        size = arrayList2.size();
                        i11 = 0;
                        do {
                            if (i11 < size) {
                                obj2 = arrayList2.get(i11);
                                i11++;
                            } else {
                                obj2 = null;
                            }
                            if (obj2 != null) {
                                str = "CONSISTENCY_ZONE";
                            } else {
                                size2 = arrayList3.size();
                                while (i14 < size2) {
                                    obj3 = arrayList3.get(i14);
                                    i14++;
                                    if (kotlin.jvm.internal.m.a(((LeaderBoardUser) obj3).getUid(), str3)) {
                                        obj4 = obj3;
                                        if (obj4 != null) {
                                            str = "DEMOTION_ZONE";
                                        }
                                    }
                                }
                                if (obj4 != null) {
                                    str = "DEMOTION_ZONE";
                                }
                            }
                        } while (!kotlin.jvm.internal.m.a(((LeaderBoardUser) obj2).getUid(), str3));
                        if (obj2 != null) {
                            str = "CONSISTENCY_ZONE";
                        } else {
                            size2 = arrayList3.size();
                            while (i14 < size2) {
                                obj3 = arrayList3.get(i14);
                                i14++;
                                if (kotlin.jvm.internal.m.a(((LeaderBoardUser) obj3).getUid(), str3)) {
                                    obj4 = obj3;
                                    if (obj4 != null) {
                                        str = "DEMOTION_ZONE";
                                    }
                                }
                            }
                            if (obj4 != null) {
                                str = "DEMOTION_ZONE";
                            }
                        }
                    }
                    bundle.putString("zone", str);
                    return bundle;
                } while (!kotlin.jvm.internal.m.a(((LeaderBoardUser) obj).getUid(), str3));
                if (obj != null) {
                    str = "PROMOTION_ZONE";
                } else {
                    size = arrayList2.size();
                    i11 = 0;
                    do {
                        if (i11 < size) {
                            obj2 = arrayList2.get(i11);
                            i11++;
                        } else {
                            obj2 = null;
                        }
                        if (obj2 != null) {
                            str = "CONSISTENCY_ZONE";
                        } else {
                            size2 = arrayList3.size();
                            while (i14 < size2) {
                                obj3 = arrayList3.get(i14);
                                i14++;
                                if (kotlin.jvm.internal.m.a(((LeaderBoardUser) obj3).getUid(), str3)) {
                                    obj4 = obj3;
                                    if (obj4 != null) {
                                        str = "DEMOTION_ZONE";
                                    }
                                }
                            }
                            if (obj4 != null) {
                                str = "DEMOTION_ZONE";
                            }
                        }
                    } while (!kotlin.jvm.internal.m.a(((LeaderBoardUser) obj2).getUid(), str3));
                    if (obj2 != null) {
                        str = "CONSISTENCY_ZONE";
                    } else {
                        size2 = arrayList3.size();
                        while (i14 < size2) {
                            obj3 = arrayList3.get(i14);
                            i14++;
                            if (kotlin.jvm.internal.m.a(((LeaderBoardUser) obj3).getUid(), str3)) {
                                obj4 = obj3;
                                if (obj4 != null) {
                                    str = "DEMOTION_ZONE";
                                }
                            }
                        }
                        if (obj4 != null) {
                            str = "DEMOTION_ZONE";
                        }
                    }
                }
                bundle.putString("zone", str);
                return bundle;
            default:
                CoursePracticeType coursePracticeType = (CoursePracticeType) obj9;
                gc gcVar = (gc) obj8;
                fz.a aVar9 = (fz.a) obj7;
                fz.a aVar10 = (fz.a) obj6;
                ((l1.b1) obj5).setValue(Boolean.FALSE);
                if ((coursePracticeType == CoursePracticeType.COURSE_REVIEW_WORD_SENT || coursePracticeType == CoursePracticeType.CHARACTER_DRILL) && (gcVar instanceof fc) && ((fc) gcVar).f49762a > CropImageView.DEFAULT_ASPECT_RATIO) {
                    aVar9.invoke();
                } else {
                    aVar10.invoke();
                }
                return b0Var;
        }
    }

    public /* synthetic */ x1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.f4892a = i11;
        this.f4897f = obj;
        this.f4893b = obj2;
        this.f4894c = obj3;
        this.f4895d = obj4;
        this.f4896e = obj5;
    }

    public /* synthetic */ x1(l1.b1 b1Var, fz.a aVar, fz.c cVar, Context context, fz.a aVar2) {
        this.f4892a = 5;
        this.f4893b = b1Var;
        this.f4897f = aVar;
        this.f4894c = cVar;
        this.f4895d = context;
        this.f4896e = aVar2;
    }

    public /* synthetic */ x1(rt.b4 b4Var, l1.b3 b3Var, l1.b1 b1Var, l1.b1 b1Var2, l1.b1 b1Var3) {
        this.f4892a = 6;
        this.f4897f = b4Var;
        this.f4896e = b3Var;
        this.f4893b = b1Var;
        this.f4894c = b1Var2;
        this.f4895d = b1Var3;
    }
}
