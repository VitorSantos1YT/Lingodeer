package fr;

import com.google.api.Service;
import com.lingodeer.data.env.Env;
import ko.Zea.ealNNtLp;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class i0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o0 f27587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f27588c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(o0 o0Var, String str, vy.d dVar, int i11) {
        super(2, dVar);
        this.f27586a = i11;
        this.f27587b = o0Var;
        this.f27588c = str;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f27586a) {
            case 0:
                return new i0(this.f27587b, this.f27588c, dVar, 0);
            case 1:
                return new i0(this.f27587b, this.f27588c, dVar, 1);
            case 2:
                return new i0(this.f27587b, this.f27588c, dVar, 2);
            case 3:
                return new i0(this.f27587b, this.f27588c, dVar, 3);
            case 4:
                return new i0(this.f27587b, this.f27588c, dVar, 4);
            case 5:
                return new i0(this.f27587b, this.f27588c, dVar, 5);
            case 6:
                return new i0(this.f27587b, this.f27588c, dVar, 6);
            case 7:
                return new i0(this.f27587b, this.f27588c, dVar, 7);
            case 8:
                return new i0(this.f27587b, this.f27588c, dVar, 8);
            case 9:
                return new i0(this.f27587b, this.f27588c, dVar, 9);
            case 10:
                return new i0(this.f27587b, this.f27588c, dVar, 10);
            case 11:
                return new i0(this.f27587b, this.f27588c, dVar, 11);
            case 12:
                return new i0(this.f27587b, this.f27588c, dVar, 12);
            case 13:
                return new i0(this.f27587b, this.f27588c, dVar, 13);
            case 14:
                return new i0(this.f27587b, this.f27588c, dVar, 14);
            case 15:
                return new i0(this.f27587b, this.f27588c, dVar, 15);
            case 16:
                return new i0(this.f27587b, this.f27588c, dVar, 16);
            case 17:
                return new i0(this.f27587b, this.f27588c, dVar, 17);
            case 18:
                return new i0(this.f27587b, this.f27588c, dVar, 18);
            case 19:
                return new i0(this.f27587b, this.f27588c, dVar, 19);
            case 20:
                return new i0(this.f27587b, this.f27588c, dVar, 20);
            case 21:
                return new i0(this.f27587b, this.f27588c, dVar, 21);
            case 22:
                return new i0(this.f27587b, this.f27588c, dVar, 22);
            case 23:
                return new i0(this.f27587b, this.f27588c, dVar, 23);
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return new i0(this.f27587b, this.f27588c, dVar, 24);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return new i0(this.f27587b, this.f27588c, dVar, 25);
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return new i0(this.f27587b, this.f27588c, dVar, 26);
            case 27:
                return new i0(this.f27587b, this.f27588c, dVar, 27);
            default:
                return new i0(this.f27587b, this.f27588c, dVar, 28);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f27586a) {
            case 0:
                i0 i0Var = (i0) create(b0Var, dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                i0Var.invokeSuspend(b0Var2);
                return b0Var2;
            case 1:
                i0 i0Var2 = (i0) create(b0Var, dVar);
                qy.b0 b0Var3 = qy.b0.f48488a;
                i0Var2.invokeSuspend(b0Var3);
                return b0Var3;
            case 2:
                i0 i0Var3 = (i0) create(b0Var, dVar);
                qy.b0 b0Var4 = qy.b0.f48488a;
                i0Var3.invokeSuspend(b0Var4);
                return b0Var4;
            case 3:
                i0 i0Var4 = (i0) create(b0Var, dVar);
                qy.b0 b0Var5 = qy.b0.f48488a;
                i0Var4.invokeSuspend(b0Var5);
                return b0Var5;
            case 4:
                i0 i0Var5 = (i0) create(b0Var, dVar);
                qy.b0 b0Var6 = qy.b0.f48488a;
                i0Var5.invokeSuspend(b0Var6);
                return b0Var6;
            case 5:
                i0 i0Var6 = (i0) create(b0Var, dVar);
                qy.b0 b0Var7 = qy.b0.f48488a;
                i0Var6.invokeSuspend(b0Var7);
                return b0Var7;
            case 6:
                i0 i0Var7 = (i0) create(b0Var, dVar);
                qy.b0 b0Var8 = qy.b0.f48488a;
                i0Var7.invokeSuspend(b0Var8);
                return b0Var8;
            case 7:
                i0 i0Var8 = (i0) create(b0Var, dVar);
                qy.b0 b0Var9 = qy.b0.f48488a;
                i0Var8.invokeSuspend(b0Var9);
                return b0Var9;
            case 8:
                i0 i0Var9 = (i0) create(b0Var, dVar);
                qy.b0 b0Var10 = qy.b0.f48488a;
                i0Var9.invokeSuspend(b0Var10);
                return b0Var10;
            case 9:
                i0 i0Var10 = (i0) create(b0Var, dVar);
                qy.b0 b0Var11 = qy.b0.f48488a;
                i0Var10.invokeSuspend(b0Var11);
                return b0Var11;
            case 10:
                i0 i0Var11 = (i0) create(b0Var, dVar);
                qy.b0 b0Var12 = qy.b0.f48488a;
                i0Var11.invokeSuspend(b0Var12);
                return b0Var12;
            case 11:
                i0 i0Var12 = (i0) create(b0Var, dVar);
                qy.b0 b0Var13 = qy.b0.f48488a;
                i0Var12.invokeSuspend(b0Var13);
                return b0Var13;
            case 12:
                i0 i0Var13 = (i0) create(b0Var, dVar);
                qy.b0 b0Var14 = qy.b0.f48488a;
                i0Var13.invokeSuspend(b0Var14);
                return b0Var14;
            case 13:
                i0 i0Var14 = (i0) create(b0Var, dVar);
                qy.b0 b0Var15 = qy.b0.f48488a;
                i0Var14.invokeSuspend(b0Var15);
                return b0Var15;
            case 14:
                i0 i0Var15 = (i0) create(b0Var, dVar);
                qy.b0 b0Var16 = qy.b0.f48488a;
                i0Var15.invokeSuspend(b0Var16);
                return b0Var16;
            case 15:
                i0 i0Var16 = (i0) create(b0Var, dVar);
                qy.b0 b0Var17 = qy.b0.f48488a;
                i0Var16.invokeSuspend(b0Var17);
                return b0Var17;
            case 16:
                i0 i0Var17 = (i0) create(b0Var, dVar);
                qy.b0 b0Var18 = qy.b0.f48488a;
                i0Var17.invokeSuspend(b0Var18);
                return b0Var18;
            case 17:
                i0 i0Var18 = (i0) create(b0Var, dVar);
                qy.b0 b0Var19 = qy.b0.f48488a;
                i0Var18.invokeSuspend(b0Var19);
                return b0Var19;
            case 18:
                i0 i0Var19 = (i0) create(b0Var, dVar);
                qy.b0 b0Var20 = qy.b0.f48488a;
                i0Var19.invokeSuspend(b0Var20);
                return b0Var20;
            case 19:
                i0 i0Var20 = (i0) create(b0Var, dVar);
                qy.b0 b0Var21 = qy.b0.f48488a;
                i0Var20.invokeSuspend(b0Var21);
                return b0Var21;
            case 20:
                i0 i0Var21 = (i0) create(b0Var, dVar);
                qy.b0 b0Var22 = qy.b0.f48488a;
                i0Var21.invokeSuspend(b0Var22);
                return b0Var22;
            case 21:
                i0 i0Var22 = (i0) create(b0Var, dVar);
                qy.b0 b0Var23 = qy.b0.f48488a;
                i0Var22.invokeSuspend(b0Var23);
                return b0Var23;
            case 22:
                i0 i0Var23 = (i0) create(b0Var, dVar);
                qy.b0 b0Var24 = qy.b0.f48488a;
                i0Var23.invokeSuspend(b0Var24);
                return b0Var24;
            case 23:
                i0 i0Var24 = (i0) create(b0Var, dVar);
                qy.b0 b0Var25 = qy.b0.f48488a;
                i0Var24.invokeSuspend(b0Var25);
                return b0Var25;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                i0 i0Var25 = (i0) create(b0Var, dVar);
                qy.b0 b0Var26 = qy.b0.f48488a;
                i0Var25.invokeSuspend(b0Var26);
                return b0Var26;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                i0 i0Var26 = (i0) create(b0Var, dVar);
                qy.b0 b0Var27 = qy.b0.f48488a;
                i0Var26.invokeSuspend(b0Var27);
                return b0Var27;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                i0 i0Var27 = (i0) create(b0Var, dVar);
                qy.b0 b0Var28 = qy.b0.f48488a;
                i0Var27.invokeSuspend(b0Var28);
                return b0Var28;
            case 27:
                i0 i0Var28 = (i0) create(b0Var, dVar);
                qy.b0 b0Var29 = qy.b0.f48488a;
                i0Var28.invokeSuspend(b0Var29);
                return b0Var29;
            default:
                i0 i0Var29 = (i0) create(b0Var, dVar);
                qy.b0 b0Var30 = qy.b0.f48488a;
                i0Var29.invokeSuspend(b0Var30);
                return b0Var30;
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0149  */
    /* JADX WARN: Code duplicated, block: B:58:0x0151  */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f27586a;
        qy.b0 b0Var = qy.b0.f48488a;
        String str = this.f27588c;
        o0 o0Var = this.f27587b;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Env env = o0Var.f27733a;
                env.accountType = str;
                env.updateEntry("accountType");
                break;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Env env2 = o0Var.f27733a;
                env2.appVersion = str;
                env2.updateEntry("appVersion");
                break;
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Env env3 = o0Var.f27733a;
                env3.buyCoffee = str;
                env3.updateEntry("buyCoffee");
                break;
            case 3:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Env env4 = o0Var.f27733a;
                env4.checkAnswerPrompt = str;
                env4.updateEntry("checkAnswerPrompt");
                break;
            case 4:
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Env env5 = o0Var.f27733a;
                env5.curClassRank = str;
                env5.updateEntry("curClassRank");
                break;
            case 5:
                wy.a aVar6 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Env env6 = o0Var.f27733a;
                env6.currentEnteredJPSyllableLessonKey = str;
                env6.updateEntry("currentEnteredJPSyllableLessonKey");
                break;
            case 6:
                wy.a aVar7 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Env env7 = o0Var.f27733a;
                env7.currentEnteredKOSyllableLessonKey = str;
                env7.updateEntry("currentEnteredKOSyllableLessonKey");
                break;
            case 7:
                wy.a aVar8 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Env env8 = o0Var.f27733a;
                env8.learnAlarmTime = str;
                env8.updateEntry("learnAlarmTime");
                break;
            case 8:
                wy.a aVar9 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Env env9 = o0Var.f27733a;
                env9.fbDbToken = str;
                env9.updateEntry("fbDbToken");
                break;
            case 9:
                wy.a aVar10 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Env env10 = o0Var.f27733a;
                int i12 = env10.keyLanguage;
                if (i12 == 0) {
                    env10.fluentCNEnterLessonList = str;
                    env10.updateEntry("fluentCNEnterLessonList");
                } else if (i12 == 1) {
                    env10.fluentJPEnterLessonList = str;
                    env10.updateEntry("fluentJPEnterLessonList");
                } else if (i12 == 2) {
                    env10.fluentKREnterLessonList = str;
                    env10.updateEntry("fluentKREnterLessonList");
                } else if (i12 == 4) {
                    env10.fluentESEnterLessonList = str;
                    env10.updateEntry("fluentESEnterLessonList");
                } else if (i12 == 5) {
                    env10.fluentFREnterLessonList = str;
                    env10.updateEntry("fluentFREnterLessonList");
                } else if (i12 == 47) {
                    env10.fluentESEnterLessonList = str;
                    env10.updateEntry("fluentESEnterLessonList");
                } else if (i12 == 53) {
                    env10.fluentFREnterLessonList = str;
                    env10.updateEntry("fluentFREnterLessonList");
                }
                break;
            case 10:
                wy.a aVar11 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Env env11 = o0Var.f27733a;
                env11.hasReadFeedList = str;
                env11.updateEntry("hasReadFeedList");
                break;
            case 11:
                wy.a aVar12 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Env env12 = o0Var.f27733a;
                env12.installReferrer = str;
                env12.updateEntry("installReferrer");
                break;
            case 12:
                wy.a aVar13 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Env env13 = o0Var.f27733a;
                env13.joinedDate = str;
                env13.updateEntry("joinedDate");
                break;
            case 13:
                wy.a aVar14 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Env env14 = o0Var.f27733a;
                env14.jpSyllableWritingFinishedLessons = str;
                env14.updateEntry(ealNNtLp.dhhWFbUTK);
                break;
            case 14:
                wy.a aVar15 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Env env15 = o0Var.f27733a;
                env15.keyLanHistory = str;
                env15.updateEntry("keyLanHistory");
                break;
            case 15:
                wy.a aVar16 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Env env16 = o0Var.f27733a;
                env16.krSyllableWritingFinishedLessons = str;
                env16.updateEntry("krSyllableWritingFinishedLessons");
                break;
            case 16:
                wy.a aVar17 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Env env17 = o0Var.f27733a;
                env17.learningPurpose = str;
                env17.updateEntry("learningPurpose");
                break;
            case 17:
                wy.a aVar18 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Env env18 = o0Var.f27733a;
                env18.loginAccount = str;
                env18.updateEntry("loginAccount");
                break;
            case 18:
                wy.a aVar19 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Env env19 = o0Var.f27733a;
                env19.nickName = str;
                env19.updateEntry("nickName");
                break;
            case 19:
                wy.a aVar20 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Env env20 = o0Var.f27733a;
                env20.notificationWordSent = str;
                env20.updateEntry("notificationWordSent");
                break;
            case 20:
                wy.a aVar21 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Env env21 = o0Var.f27733a;
                env21.ossAccessKeyId = str;
                env21.updateEntry("ossAccessKeyId");
                break;
            case 21:
                wy.a aVar22 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Env env22 = o0Var.f27733a;
                env22.ossAccessKeySecret = str;
                env22.updateEntry("ossAccessKeySecret");
                break;
            case 22:
                wy.a aVar23 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Env env23 = o0Var.f27733a;
                env23.ossToken = str;
                env23.updateEntry("ossToken");
                break;
            case 23:
                wy.a aVar24 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Env env24 = o0Var.f27733a;
                env24.regin = str;
                env24.updateEntry("region");
                break;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                wy.a aVar25 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Env env25 = o0Var.f27733a;
                env25.serviceRegion = str;
                env25.updateEntry("serviceRegion");
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                wy.a aVar26 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Env env26 = o0Var.f27733a;
                env26.smartReviewReminderTime = str;
                env26.updateEntry("smartReviewReminderTime");
                break;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                wy.a aVar27 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Env env27 = o0Var.f27733a;
                env27.speechSubscriptionKey = str;
                env27.updateEntry("speechSubscriptionKey");
                break;
            case 27:
                wy.a aVar28 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Env env28 = o0Var.f27733a;
                env28.thirdPartyEmail = str;
                env28.updateEntry("thirdPartyEmail");
                break;
            default:
                wy.a aVar29 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Env env29 = o0Var.f27733a;
                env29.todayRank = str;
                env29.updateEntry("todayRank");
                break;
        }
        return b0Var;
    }
}
