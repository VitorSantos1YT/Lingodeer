package com.google.firebase.datastorage;

import a0.b2;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import androidx.datastore.core.CorruptionException;
import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import bp.h2;
import bq.u;
import com.google.api.Service;
import com.google.firebase.sessions.FirebaseSessionsComponent;
import com.google.firebase.sessions.SessionData;
import com.google.firebase.sessions.SessionDataSerializer;
import com.lingo.lingoskill.object.ARChar;
import com.lingo.lingoskill.object.KOCharZhuyin;
import com.lingo.lingoskill.ui.base.LoginActivity;
import com.lingo.me.MeAccountSettingsActivity;
import com.lingo.me.MeAchievementAllLanguageActivity;
import com.lingo.me.MeAchievementLanguageDetailActivity;
import com.lingo.me.MeAchievementLeaderBoardDetailActivity;
import com.lingo.me.MeAchievementLevelDetailActivity;
import com.lingo.me.MeAchievementRecordDetailActivity;
import com.lingo.me.MeSettingsActivity;
import com.lingo.me.MeSetupDailyGoalActivity;
import com.lingodeer.course.stroke_order_view_new.old.HwView;
import com.lingodeer.data.model.AchievementLanguage;
import com.lingodeer.data.model.Bookmark;
import com.lingodeer.data.model.BookmarkFolder;
import com.lingodeer.data.model.INTENTS;
import com.lingodeer.data.model.MeUserData;
import com.lingodeer.data.model.UserInfo;
import com.lingodeer.database.ChineseToneDatabase;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import d0.d2;
import d0.n;
import d0.s;
import d0.t;
import d2.e;
import dt.z1;
import e6.l0;
import e6.q0;
import f0.i2;
import f0.o1;
import fr.f4;
import fz.c;
import g00.u1;
import g2.f0;
import g2.h;
import g2.h0;
import g2.i;
import g2.k;
import g2.m0;
import g2.n0;
import g2.p;
import g2.p0;
import g2.t0;
import g2.v;
import g2.x;
import g2.y0;
import gp.w;
import hj.e3;
import i2.g;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.y;
import ks.b;
import l1.h1;
import mz.j;
import ns.o;
import q5.l;
import qy.b0;
import re.q;
import rz.e0;
import v3.f;
import vy.d;
import y2.g2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19621b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f19620a = i11;
        this.f19621b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:139:0x042c  */
    /* JADX WARN: Code duplicated, block: B:149:0x0468  */
    /* JADX WARN: Code duplicated, block: B:92:0x02a7  */
    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11;
        p pVar;
        h0 h0Var;
        h0 h0Var2;
        boolean z11;
        h hVarG;
        g2.c cVarA;
        boolean z12;
        f2.c cVarU0;
        int i12 = 26;
        int i13 = 5;
        int i14 = 3;
        d dVar = null;
        switch (this.f19620a) {
            case 0:
                JavaDataStorage javaDataStorage = (JavaDataStorage) this.f19621b;
                Context it = (Context) obj;
                j[] jVarArr = JavaDataStorage.f19599d;
                m.f(it, "it");
                String sharedPreferencesName = javaDataStorage.f19600a;
                LinkedHashSet keysToMigrate = l.f47470a;
                m.f(sharedPreferencesName, "sharedPreferencesName");
                m.f(keysToMigrate, "keysToMigrate");
                d dVar2 = null;
                return o.K(new p5.c(it, sharedPreferencesName, p5.d.f46309a, new l0(keysToMigrate, dVar2, 1), new f4(i14, 4, dVar2)));
            case 1:
                SessionDataSerializer sessionDataSerializer = (SessionDataSerializer) this.f19621b;
                CorruptionException ex2 = (CorruptionException) obj;
                FirebaseSessionsComponent.MainModule.Companion companion = FirebaseSessionsComponent.MainModule.Companion.f20892a;
                m.f(ex2, "ex");
                return new SessionData(sessionDataSerializer.f20933a.a(null), null, null);
            case 2:
                MeAchievementAllLanguageActivity meAchievementAllLanguageActivity = (MeAchievementAllLanguageActivity) this.f19621b;
                AchievementLanguage it2 = (AchievementLanguage) obj;
                int i15 = MeAchievementAllLanguageActivity.H;
                m.f(it2, "it");
                Intent intent = new Intent(meAchievementAllLanguageActivity, (Class<?>) MeAchievementLanguageDetailActivity.class);
                intent.putExtra(INTENTS.EXTRA_OBJECT, it2);
                meAchievementAllLanguageActivity.startActivity(intent);
                return b0.f48488a;
            case 3:
                MeAchievementLanguageDetailActivity meAchievementLanguageDetailActivity = (MeAchievementLanguageDetailActivity) this.f19621b;
                Uri uri = (Uri) obj;
                int i16 = MeAchievementLanguageDetailActivity.H;
                m.f(uri, "uri");
                b.j(meAchievementLanguageDetailActivity, uri);
                return b0.f48488a;
            case 4:
                MeAchievementLeaderBoardDetailActivity meAchievementLeaderBoardDetailActivity = (MeAchievementLeaderBoardDetailActivity) this.f19621b;
                Uri uri2 = (Uri) obj;
                int i17 = MeAchievementLeaderBoardDetailActivity.H;
                m.f(uri2, "uri");
                b.j(meAchievementLeaderBoardDetailActivity, uri2);
                return b0.f48488a;
            case 5:
                MeAchievementLevelDetailActivity meAchievementLevelDetailActivity = (MeAchievementLevelDetailActivity) this.f19621b;
                Uri uri3 = (Uri) obj;
                int i18 = MeAchievementLevelDetailActivity.H;
                m.f(uri3, "uri");
                b.j(meAchievementLevelDetailActivity, uri3);
                return b0.f48488a;
            case 6:
                MeAchievementRecordDetailActivity meAchievementRecordDetailActivity = (MeAchievementRecordDetailActivity) this.f19621b;
                Uri uri4 = (Uri) obj;
                int i19 = MeAchievementRecordDetailActivity.H;
                m.f(uri4, "uri");
                b.j(meAchievementRecordDetailActivity, uri4);
                return b0.f48488a;
            case 7:
                MeSettingsActivity context = (MeSettingsActivity) this.f19621b;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                int i21 = MeSettingsActivity.f22221t;
                if (zBooleanValue) {
                    m.f(context, "context");
                    Intent intent2 = new Intent(context, (Class<?>) LoginActivity.class);
                    intent2.putExtra(INTENTS.EXTRA_INT, 5);
                    context.startActivity(intent2);
                } else {
                    context.startActivity(new Intent(context, (Class<?>) MeAccountSettingsActivity.class));
                    context.m().c("jxz_enter_profile", new u(29));
                }
                return b0.f48488a;
            case 8:
                MeSetupDailyGoalActivity meSetupDailyGoalActivity = (MeSetupDailyGoalActivity) this.f19621b;
                int iIntValue = ((Integer) obj).intValue();
                int i22 = MeSetupDailyGoalActivity.f22222t;
                e0.B(LifecycleOwnerKt.getLifecycleScope(meSetupDailyGoalActivity), null, null, new h2(meSetupDailyGoalActivity, iIntValue, (d) null, 1), 3);
                meSetupDailyGoalActivity.finish();
                return b0.f48488a;
            case 9:
                t tVar = (t) this.f19621b;
                e eVar = (e) obj;
                if (eVar.getDensity() * tVar.T < CropImageView.DEFAULT_ASPECT_RATIO || f2.e.c(eVar.f23069a.d()) <= CropImageView.DEFAULT_ASPECT_RATIO) {
                    return eVar.b(new com.lingo.lingoskill.object.a(i12));
                }
                float f5 = 2;
                final float fMin = Math.min(f.b(tVar.T, CropImageView.DEFAULT_ASPECT_RATIO) ? 1.0f : (float) Math.ceil(eVar.getDensity() * tVar.T), (float) Math.ceil(f2.e.c(eVar.f23069a.d()) / f5));
                final float f11 = fMin / f5;
                final long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L);
                final long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (eVar.f23069a.d() >> 32)) - fMin)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (eVar.f23069a.d() & 4294967295L)) - fMin)) & 4294967295L);
                float f12 = fMin * f5;
                boolean z13 = f12 > f2.e.c(eVar.f23069a.d());
                f0 f0VarA = tVar.V.a(eVar.f23069a.d(), eVar.f23069a.getLayoutDirection(), eVar);
                if (!(f0VarA instanceof g2.l0)) {
                    if (!(f0VarA instanceof n0)) {
                        boolean z14 = z13;
                        if (!(f0VarA instanceof m0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        final g2.t tVar2 = tVar.U;
                        if (z14) {
                            jFloatToRawIntBits = 0;
                        }
                        final long j11 = jFloatToRawIntBits;
                        if (z14) {
                            jFloatToRawIntBits2 = eVar.f23069a.d();
                        }
                        final long j12 = jFloatToRawIntBits2;
                        final i2.e hVar = z14 ? g.f34126a : new i2.h(fMin, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, null, 30);
                        return eVar.b(new c() { // from class: d0.q
                            @Override // fz.c
                            public final Object invoke(Object obj2) {
                                y2.k0 k0Var = (y2.k0) obj2;
                                k0Var.a();
                                i2.d.p0(k0Var, tVar2, j11, j12, CropImageView.DEFAULT_ASPECT_RATIO, hVar, 104);
                                return qy.b0.f48488a;
                            }
                        });
                    }
                    final g2.t tVar3 = tVar.U;
                    f2.d dVar3 = ((n0) f0VarA).f28587f;
                    if (com.bumptech.glide.f.C(dVar3)) {
                        final long j13 = dVar3.f26580e;
                        final i2.h hVar2 = new i2.h(fMin, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, null, 30);
                        final boolean z15 = z13;
                        return eVar.b(new c() { // from class: d0.r
                            @Override // fz.c
                            public final Object invoke(Object obj2) throws Throwable {
                                xq.c cVar;
                                long j14;
                                y2.k0 k0Var = (y2.k0) obj2;
                                k0Var.a();
                                i2.b bVar = k0Var.f56937a;
                                boolean z16 = z15;
                                g2.t tVar4 = tVar3;
                                long j15 = j13;
                                if (z16) {
                                    i2.d.B0(k0Var, tVar4, 0L, 0L, j15, null, 246);
                                } else {
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j15 >> 32));
                                    float f13 = f11;
                                    if (fIntBitsToFloat < f13) {
                                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (bVar.d() >> 32));
                                        float f14 = fMin;
                                        float f15 = fIntBitsToFloat2 - f14;
                                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (bVar.d() & 4294967295L)) - f14;
                                        xq.c cVar2 = bVar.f34121b;
                                        long jH = cVar2.H();
                                        cVar2.x().e();
                                        try {
                                            ((a0.b2) cVar2.f56174b).e(f14, f14, f15, fIntBitsToFloat3, 0);
                                            j14 = jH;
                                            cVar = cVar2;
                                            try {
                                                i2.d.B0(k0Var, tVar4, 0L, 0L, j15, null, 246);
                                                com.google.android.material.datepicker.d.C(cVar, j14);
                                            } catch (Throwable th2) {
                                                th = th2;
                                                com.google.android.material.datepicker.d.C(cVar, j14);
                                                throw th;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            cVar = cVar2;
                                            j14 = jH;
                                        }
                                    } else {
                                        i2.d.B0(k0Var, tVar4, jFloatToRawIntBits, jFloatToRawIntBits2, n.x(j15, f13), hVar2, 208);
                                    }
                                }
                                return qy.b0.f48488a;
                            }
                        });
                    }
                    boolean z16 = z13;
                    if (tVar.S == null) {
                        tVar.S = new d0.p();
                    }
                    d0.p pVar2 = tVar.S;
                    m.c(pVar2);
                    k kVar = pVar2.f22773d;
                    k kVar2 = kVar;
                    if (kVar == null) {
                        k kVarA = g2.o.a();
                        pVar2.f22773d = kVarA;
                        kVar2 = kVarA;
                    }
                    kVar2.j();
                    p0.c(kVar2, dVar3);
                    if (!z16) {
                        p0 p0VarA = g2.o.a();
                        p0.c(p0VarA, new f2.d(fMin, fMin, dVar3.b() - fMin, dVar3.a() - fMin, n.x(dVar3.f26580e, fMin), n.x(dVar3.f26581f, fMin), n.x(dVar3.f26582g, fMin), n.x(dVar3.f26583h, fMin)));
                        kVar2.h(kVar2, p0VarA, 0);
                    }
                    return eVar.b(new com.google.accompanist.permissions.a(i13, kVar2, tVar3));
                }
                g2.t tVar4 = tVar.U;
                g2.l0 l0Var = (g2.l0) f0VarA;
                p0 p0Var = l0Var.f28581f;
                if (z13) {
                    return eVar.b(new com.google.accompanist.permissions.a(6, l0Var, tVar4));
                }
                if (tVar4 instanceof y0) {
                    i11 = 1;
                    pVar = new p(x.c(((y0) tVar4).f28628a, 1.0f), 5);
                } else {
                    i11 = 0;
                    pVar = null;
                }
                f2.c cVarE = ((k) p0Var).e();
                float f13 = cVarE.f26573b;
                float f14 = cVarE.f26572a;
                if (tVar.S == null) {
                    tVar.S = new d0.p();
                }
                d0.p pVar3 = tVar.S;
                m.c(pVar3);
                k kVar3 = pVar3.f22773d;
                k kVar4 = kVar3;
                if (kVar3 == null) {
                    k kVarA2 = g2.o.a();
                    pVar3.f22773d = kVarA2;
                    kVar4 = kVarA2;
                }
                kVar4.j();
                p0.a(kVar4, cVarE);
                kVar4.h(kVar4, p0Var, 0);
                y yVar = new y();
                k kVar5 = kVar4;
                long jCeil = (((long) ((int) Math.ceil(cVarE.f26574c - f14))) << 32) | (((long) ((int) Math.ceil(cVarE.f26575d - f13))) & 4294967295L);
                d0.p pVar4 = tVar.S;
                m.c(pVar4);
                h hVar3 = pVar4.f22770a;
                g2.c cVar = pVar4.f22771b;
                if (hVar3 != null) {
                    Bitmap.Config config = hVar3.f28568a.getConfig();
                    m.c(config);
                    h0Var = new h0(i.d(config));
                } else {
                    h0Var = null;
                }
                if (h0Var != null && h0Var.f28569a == 0) {
                    z11 = true;
                } else {
                    if (hVar3 != null) {
                        Bitmap.Config config2 = hVar3.f28568a.getConfig();
                        m.c(config2);
                        h0Var2 = new h0(i.d(config2));
                    } else {
                        h0Var2 = null;
                    }
                    if (h0Var2 != null && i11 == h0Var2.f28569a) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
                if (hVar3 == null || cVar == null) {
                    hVarG = f0.g((int) (jCeil >> 32), (int) (jCeil & 4294967295L), i11);
                    pVar4.f22770a = hVarG;
                    cVarA = f0.a(hVarG);
                    pVar4.f22771b = cVarA;
                } else {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (eVar.f23069a.d() >> 32));
                    Bitmap bitmap = hVar3.f28568a;
                    if (fIntBitsToFloat > bitmap.getWidth() || Float.intBitsToFloat((int) (eVar.f23069a.d() & 4294967295L)) > bitmap.getHeight() || !z11) {
                        hVarG = f0.g((int) (jCeil >> 32), (int) (jCeil & 4294967295L), i11);
                        pVar4.f22770a = hVarG;
                        cVarA = f0.a(hVarG);
                        pVar4.f22771b = cVarA;
                    } else {
                        hVarG = hVar3;
                        cVarA = cVar;
                    }
                }
                i2.b bVar = pVar4.f22772c;
                if (bVar == null) {
                    bVar = new i2.b();
                    pVar4.f22772c = bVar;
                }
                xq.c cVar2 = bVar.f34121b;
                i2.a aVar = bVar.f34120a;
                long jP = ff.h.P(jCeil);
                v3.m layoutDirection = eVar.f23069a.getLayoutDirection();
                i2.b bVar2 = bVar;
                v3.c cVar3 = aVar.f34116a;
                v3.m mVar = aVar.f34117b;
                v vVar = aVar.f34118c;
                h hVar4 = hVarG;
                long j14 = aVar.f34119d;
                aVar.f34116a = eVar;
                aVar.f34117b = layoutDirection;
                aVar.f34118c = cVarA;
                aVar.f34119d = jP;
                cVarA.e();
                i2.d.U(bVar2, x.f28615b, 0L, jP, CropImageView.DEFAULT_ASPECT_RATIO, 58);
                float f15 = -f14;
                float f16 = -f13;
                ((b2) cVar2.f56174b).r(f15, f16);
                try {
                    i2.d.g(bVar2, l0Var.f28581f, tVar4, CropImageView.DEFAULT_ASPECT_RATIO, new i2.h(f12, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, null, 30), 52);
                    float f17 = 1;
                    float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (bVar2.d() >> 32)) + f17) / Float.intBitsToFloat((int) (bVar2.d() >> 32));
                    float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (bVar2.d() & 4294967295L)) + f17) / Float.intBitsToFloat((int) (bVar2.d() & 4294967295L));
                    long jR0 = bVar2.r0();
                    g2.c cVar4 = cVarA;
                    long jH = cVar2.H();
                    cVar2.x().e();
                    try {
                        ((b2) cVar2.f56174b).n(jR0, fIntBitsToFloat2, fIntBitsToFloat3);
                        i2.d.g(bVar2, kVar5, tVar4, CropImageView.DEFAULT_ASPECT_RATIO, null, 28);
                        cVar2.x().p();
                        cVar2.T(jH);
                        ((b2) cVar2.f56174b).r(-f15, -f16);
                        cVar4.p();
                        aVar.f34116a = cVar3;
                        aVar.f34117b = mVar;
                        aVar.f34118c = vVar;
                        aVar.f34119d = j14;
                        hVar4.f28568a.prepareToDraw();
                        yVar.f38361a = hVar4;
                        return eVar.b(new s(cVarE, yVar, jCeil, pVar));
                    } catch (Throwable th2) {
                        cVar2.x().p();
                        cVar2.T(jH);
                        throw th2;
                    }
                } catch (Throwable th3) {
                    ((b2) cVar2.f56174b).r(-f15, -f16);
                    throw th3;
                }
            case 10:
                kotlin.jvm.internal.u uVar = (kotlin.jvm.internal.u) this.f19621b;
                g2 g2Var = (g2) obj;
                if (!uVar.f38357a) {
                    m.d(g2Var, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableContainerNode");
                    z12 = ((o1) g2Var).Q;
                }
                uVar.f38357a = z12;
                return Boolean.valueOf(!z12);
            case 11:
                d0.f0 f0Var = (d0.f0) this.f19621b;
                if (f0Var.X) {
                    f0Var.Y.invoke();
                }
                return b0.f48488a;
            case 12:
                d2 d2Var = (d2) this.f19621b;
                float fFloatValue = ((Float) obj).floatValue();
                h1 h1Var = d2Var.f22659a;
                float fL = h1Var.l() + fFloatValue + d2Var.f22663e;
                float fK = hz.b.k(fL, CropImageView.DEFAULT_ASPECT_RATIO, d2Var.f22662d.l());
                z12 = fL == fK;
                float fL2 = fK - h1Var.l();
                int iRound = Math.round(fL2);
                h1Var.m(h1Var.l() + iRound);
                d2Var.f22663e = fL2 - iRound;
                if (!z12) {
                    fFloatValue = fL2;
                }
                return Float.valueOf(fFloatValue);
            case 13:
                ds.g gVar = (ds.g) this.f19621b;
                File dbFile = (File) obj;
                m.f(dbFile, "dbFile");
                q qVar = ChineseToneDatabase.f22333l;
                Context context2 = gVar.f23616a;
                LinkedHashMap linkedHashMap = ChineseToneDatabase.m;
                ChineseToneDatabase chineseToneDatabase = (ChineseToneDatabase) linkedHashMap.get("cn_tone.db");
                if (chineseToneDatabase == null) {
                    synchronized (qVar) {
                        chineseToneDatabase = (ChineseToneDatabase) linkedHashMap.get("cn_tone.db");
                        if (chineseToneDatabase == null) {
                            ChineseToneDatabase chineseToneDatabaseM = q.m(context2, dbFile);
                            linkedHashMap.put("cn_tone.db", chineseToneDatabaseM);
                            chineseToneDatabase = chineseToneDatabaseM;
                        }
                    }
                }
                return chineseToneDatabase;
            case 14:
                ((kotlin.jvm.internal.v) this.f19621b).f38358a = CropImageView.DEFAULT_ASPECT_RATIO;
                return b0.f48488a;
            case 15:
                z1 z1Var = (z1) this.f19621b;
                String note = (String) obj;
                m.f(note, "note");
                z1Var.f24412c.invoke(note);
                return b0.f48488a;
            case 16:
                ht.q qVar2 = (ht.q) this.f19621b;
                t0 graphicsLayer = (t0) obj;
                m.f(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.b((qVar2 == ht.q.CORRECT || qVar2 == ht.q.WRONG) ? 0.0f : 1.0f);
                return b0.f48488a;
            case 17:
                gi.d dVar4 = (gi.d) this.f19621b;
                ARChar item = (ARChar) obj;
                m.f(item, "item");
                dVar4.c(item);
                return b0.f48488a;
            case 18:
                gn.e eVar2 = (gn.e) this.f19621b;
                KOCharZhuyin item2 = (KOCharZhuyin) obj;
                m.f(item2, "item");
                eVar2.c(item2);
                return b0.f48488a;
            case 19:
                s2.t tVar5 = (s2.t) obj;
                ((ch.b0) this.f19621b).invoke(tVar5, Float.valueOf(Float.intBitsToFloat((int) (4294967295L & s2.s.g(tVar5, false)))));
                tVar5.a();
                return b0.f48488a;
            case 20:
                f0.i iVar = ((f0.b2) this.f19621b).f26204i0;
                iVar.V = (w2.x) obj;
                if (iVar.X && (cVarU0 = iVar.U0()) != null && !iVar.V0(cVarU0, iVar.Y)) {
                    iVar.W = true;
                    iVar.W0();
                }
                iVar.X = false;
                return b0.f48488a;
            case 21:
                i2 i2Var = (i2) this.f19621b;
                return new f2.b(i2Var.c(i2Var.f26315k, ((f2.b) obj).f26570a, i2Var.f26314j));
            case 22:
                fi.d dVar5 = (fi.d) this.f19621b;
                m.f((View) obj, "it");
                e3 e3Var = dVar5.M;
                m.c(e3Var);
                ((HwView) e3Var.f32524c).g();
                e3 e3Var2 = dVar5.M;
                m.c(e3Var2);
                ((HwView) e3Var2.f32524c).f();
                dVar5.h();
                return b0.f48488a;
            case 23:
                ((gp.n0) this.f19621b).b(new gp.e0(((Boolean) obj).booleanValue()));
                return b0.f48488a;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                MeUserData meUserData = (MeUserData) this.f19621b;
                UserInfo currentUserInfo = (UserInfo) obj;
                m.f(currentUserInfo, "currentUserInfo");
                return xt.t.f(currentUserInfo, meUserData);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.f19621b;
                Bookmark bookmark = (Bookmark) obj;
                String folderId = bookmark.getFolderId();
                if (folderId == null) {
                    return null;
                }
                Integer numT0 = oz.x.t0(oz.q.c1(folderId));
                if (numT0 == null || numT0.intValue() <= 0) {
                    numT0 = null;
                }
                if (numT0 == null) {
                    return null;
                }
                int iIntValue2 = numT0.intValue();
                if (linkedHashMap2.containsKey(new fr.s(bookmark.getLan(), bookmark.getValue(), iIntValue2))) {
                    return null;
                }
                return new BookmarkFolder(folderId, bookmark.getLan(), bookmark.getValue(), BuildConfig.VERSION_NAME, iIntValue2, false, bookmark.getTime());
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                u1 u1Var = (u1) this.f19621b;
                e00.a buildClassSerialDescriptor = (e00.a) obj;
                m.f(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
                e00.a.a(buildClassSerialDescriptor, "first", u1Var.f28475a.getDescriptor());
                e00.a.a(buildClassSerialDescriptor, "second", u1Var.f28476b.getDescriptor());
                e00.a.a(buildClassSerialDescriptor, "third", u1Var.f28477c.getDescriptor());
                return b0.f48488a;
            case 27:
                return CoroutineLiveDataKt.liveData$default((vy.i) null, 0L, new fr.c((gp.c) this.f19621b, dVar, 10), 3, (Object) null);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return CoroutineLiveDataKt.liveData$default((vy.i) null, 0L, new fr.c((gp.b) this.f19621b, dVar, 11), 3, (Object) null);
            default:
                w wVar = (w) this.f19621b;
                gq.v syncResult = (gq.v) obj;
                m.f(syncResult, "syncResult");
                e0.B(ViewModelKt.getViewModelScope(wVar), null, null, new q0(i12, wVar, syncResult, dVar), 3);
                return b0.f48488a;
        }
    }
}
