package aj;

import ad.a0;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.MenuItem;
import android.view.View;
import android.webkit.ValueCallback;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.compose.LifecycleEffectKt;
import androidx.lifecycle.compose.LifecycleResumePauseEffectScope;
import androidx.lifecycle.compose.LifecycleStartStopEffectScope;
import androidx.media3.exoplayer.ExoPlayer;
import at.f;
import av.f0;
import b0.l0;
import bp.b2;
import bp.d1;
import bp.e1;
import bp.g1;
import bp.t3;
import bp.z1;
import bt.g8;
import bt.h8;
import com.google.api.Service;
import com.lingo.course.ui.CourseFlashCardIndexActivity;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.koreanskill.ui.syllable.adapter.SingleVowelAdapter;
import com.lingo.lingoskill.object.LanguageExpandableItem2;
import com.lingo.lingoskill.object.LocateLanguageItem;
import com.lingo.lingoskill.ui.base.NewsFeedWebActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.chinesetone.ChineseToneLesson;
import com.lingodeer.data.model.chinesetone.ChineseToneUnit;
import com.lingodeer.database.model.BookmarkFolderEntity;
import com.lingodeer.database.model.ReviewStatusEntity;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.tbruyelle.rxpermissions3.RxPermissions;
import com.yalantis.ucrop.view.CropImageView;
import d1.z0;
import dt.x4;
import dt.z4;
import e5.m;
import f0.e2;
import f0.g2;
import f0.i2;
import f0.n0;
import f0.p0;
import f0.v2;
import fb.g0;
import gb.r;
import hj.h0;
import ht.j;
import ie.o;
import j3.x0;
import j9.e;
import j9.v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import js.i;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.y;
import l1.a1;
import l1.g;
import l1.j0;
import n9.q;
import ot.t1;
import qy.b0;
import rt.yb;
import ry.l;
import ry.n;
import rz.e0;
import s0.s0;
import s0.y0;
import s2.m0;
import s2.t;
import s2.w;
import w2.x;
import x1.p;
import x1.s;
import ys.d0;
import z2.b1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f733d;

    public /* synthetic */ c(SingleVowelAdapter singleVowelAdapter, String[] strArr, ImageView imageView) {
        this.f730a = 23;
        this.f731b = singleVowelAdapter;
        this.f733d = strArr;
        this.f732c = imageView;
    }

    private final Object a(Object obj) {
        q qVar = (q) this.f731b;
        w wVar = (w) this.f732c;
        n0 n0Var = (n0) this.f733d;
        g0.f(qVar, (t) obj, 0L);
        m0 m0Var = (m0) wVar;
        m0Var.getClass();
        float f5 = y2.f.x(m0Var).f56885d0.f();
        long jB = r.b(f5, f5);
        m mVar = (m) qVar.f43673b;
        mVar.getClass();
        t2.d dVar = (t2.d) mVar.f24862c;
        t2.d dVar2 = (t2.d) mVar.f24861b;
        float fB = v3.q.b(jB);
        float fC = CropImageView.DEFAULT_ASPECT_RATIO;
        if (fB <= CropImageView.DEFAULT_ASPECT_RATIO || v3.q.c(jB) <= CropImageView.DEFAULT_ASPECT_RATIO) {
            v2.a.b("maximumVelocity should be a positive value. You specified=" + ((Object) v3.q.g(jB)));
        }
        long jB2 = r.b(dVar2.b(v3.q.b(jB)), dVar.b(v3.q.c(jB)));
        t2.a[] aVarArr = dVar2.f52016d;
        l.P(0, aVarArr.length, null, aVarArr);
        dVar2.f52017e = 0;
        t2.a[] aVarArr2 = dVar.f52016d;
        l.P(0, aVarArr2.length, null, aVarArr2);
        dVar.f52017e = 0;
        mVar.f24860a = 0L;
        tz.h hVar = n0Var.W;
        if (hVar != null) {
            a0 a0Var = p0.f26394a;
            float fB2 = Float.isNaN(v3.q.b(jB2)) ? 0.0f : v3.q.b(jB2);
            if (!Float.isNaN(v3.q.c(jB2))) {
                fC = v3.q.c(jB2);
            }
            hVar.i(new f0.r(r.b(fB2, fC)));
        }
        return b0.f48488a;
    }

    /* JADX WARN: Code duplicated, block: B:135:0x041f  */
    /* JADX WARN: Code duplicated, block: B:136:0x0426  */
    /* JADX WARN: Code duplicated, block: B:138:0x0445  */
    /* JADX WARN: Code duplicated, block: B:139:0x044c  */
    /* JADX WARN: Code duplicated, block: B:141:0x046b  */
    /* JADX WARN: Code duplicated, block: B:142:0x0472  */
    /* JADX WARN: Code duplicated, block: B:144:0x0491  */
    /* JADX WARN: Code duplicated, block: B:145:0x0498  */
    /* JADX WARN: Code duplicated, block: B:147:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:148:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:150:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:151:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:153:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:154:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:156:0x0514  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, vy.d] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r2v26, types: [x1.p] */
    /* JADX WARN: Type inference failed for: r3v41, types: [l1.b1, l1.b3] */
    /* JADX WARN: Type inference failed for: r4v26, types: [l1.b1] */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v68 */
    @Override // fz.c
    public final Object invoke(Object obj) throws Exception {
        ArrayList arrayList;
        boolean z11;
        s0 s0Var;
        b1 b1Var;
        int i11 = 7;
        int i12 = 4;
        int i13 = 3;
        ?? r11 = 0;
        Object obj2 = null;
        final int i14 = 2;
        boolean z12 = false;
        z12 = false;
        final int i15 = 1;
        switch (this.f730a) {
            case 0:
                f fVar = (f) this.f731b;
                ImageView imageView = (ImageView) this.f732c;
                hd.d dVar = (hd.d) this.f733d;
                View it = (View) obj;
                kotlin.jvm.internal.m.f(it, "it");
                ob.m mVar = new ob.m(fVar, imageView, dVar, i15);
                Context context = fVar.f738a;
                kotlin.jvm.internal.m.d(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                RxPermissions rxPermissions = new RxPermissions((androidx.fragment.app.p0) context);
                kotlin.jvm.internal.m.f(context, "context");
                rxPermissions.setLogging(true);
                if (rxPermissions.isGranted("android.permission.RECORD_AUDIO") && rxPermissions.isGranted("android.permission.RECORD_AUDIO")) {
                    mVar.m();
                } else {
                    rxPermissions.request("android.permission.RECORD_AUDIO").h(new xq.c(mVar, context, rxPermissions, 17), vx.b.f54316e);
                }
                return b0.f48488a;
            case 1:
                return Transformations.switchMap$lambda$3((fz.c) this.f731b, (y) this.f732c, (MediatorLiveData) this.f733d, obj);
            case 2:
                return LifecycleEffectKt.LifecycleEventEffect$lambda$4$lambda$3((LifecycleOwner) this.f731b, (Lifecycle.Event) this.f732c, (l1.b1) this.f733d, (j0) obj);
            case 3:
                return LifecycleEffectKt.LifecycleStartEffectImpl$lambda$19$lambda$18((LifecycleOwner) this.f731b, (LifecycleStartStopEffectScope) this.f732c, (fz.c) this.f733d, (j0) obj);
            case 4:
                return LifecycleEffectKt.LifecycleResumeEffectImpl$lambda$34$lambda$33((LifecycleOwner) this.f731b, (LifecycleResumePauseEffectScope) this.f732c, (fz.c) this.f733d, (j0) obj);
            case 5:
                String str = (String) this.f731b;
                String str2 = (String) this.f732c;
                String str3 = (String) this.f733d;
                ja.a _connection = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection, "_connection");
                ja.c cVarB1 = _connection.B1("\n        SELECT * FROM bookmark_folder\n        WHERE lan = ? AND content_type = ? AND name = ? AND is_deleted = 0\n        LIMIT 1\n        ");
                try {
                    cVarB1.b0(1, str);
                    cVarB1.b0(2, str2);
                    cVarB1.b0(3, str3);
                    return cVarB1.r1() ? new BookmarkFolderEntity(cVarB1.B0(com.bumptech.glide.g.m(cVarB1, "id")), cVarB1.B0(com.bumptech.glide.g.m(cVarB1, "lan")), cVarB1.B0(com.bumptech.glide.g.m(cVarB1, "content_type")), cVarB1.B0(com.bumptech.glide.g.m(cVarB1, "name")), (int) cVarB1.getLong(com.bumptech.glide.g.m(cVarB1, "server_id")), ((int) cVarB1.getLong(com.bumptech.glide.g.m(cVarB1, "is_deleted"))) != 0, cVarB1.getLong(com.bumptech.glide.g.m(cVarB1, "time"))) : 0;
                } finally {
                    cVarB1.close();
                }
            case 6:
                String str4 = (String) this.f731b;
                String str5 = (String) this.f732c;
                List list = (List) this.f733d;
                ja.a _connection2 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection2, "_connection");
                ja.c cVarB2 = _connection2.B1(str4);
                try {
                    cVarB2.b0(1, str5);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        cVarB2.g(i14, ((Number) it2.next()).longValue());
                        i14++;
                    }
                    int iM = com.bumptech.glide.g.m(cVarB2, "id");
                    int iM2 = com.bumptech.glide.g.m(cVarB2, "unit_id");
                    int iM3 = com.bumptech.glide.g.m(cVarB2, "item_id");
                    int iM4 = com.bumptech.glide.g.m(cVarB2, "elem_type");
                    int iM5 = com.bumptech.glide.g.m(cVarB2, "last_study_time");
                    int iM6 = com.bumptech.glide.g.m(cVarB2, "status");
                    ArrayList arrayList2 = new ArrayList();
                    while (cVarB2.r1()) {
                        arrayList2.add(new ReviewStatusEntity(cVarB2.B0(iM), cVarB2.getLong(iM2), cVarB2.getLong(iM3), (int) cVarB2.getLong(iM4), cVarB2.getLong(iM5), cVarB2.B0(iM6)));
                        break;
                    }
                    return arrayList2;
                } finally {
                    cVarB2.close();
                }
            case 7:
                ep.c cVar = (ep.c) this.f731b;
                l1.b1 b1Var2 = (l1.b1) this.f732c;
                ?? r9 = (l1.b1) this.f733d;
                LocateLanguageItem locateLanguage = (LocateLanguageItem) obj;
                kotlin.jvm.internal.m.f(locateLanguage, "locateLanguage");
                if (!kotlin.jvm.internal.m.a(cVar.f25725t, locateLanguage.getLocate())) {
                    b1Var2.setValue(Boolean.TRUE);
                    r9.setValue(locateLanguage);
                }
                return b0.f48488a;
            case 8:
                ArrayList arrayList3 = (ArrayList) this.f731b;
                String str6 = (String) this.f732c;
                fz.c cVar2 = (fz.c) this.f733d;
                l0.h LazyColumn = (l0.h) obj;
                kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                LazyColumn.q(arrayList3.size(), null, new d1(0, arrayList3), new t1.d(new e1(arrayList3, str6, cVar2, arrayList3), true, 2039820996));
                return b0.f48488a;
            case 9:
                ?? r12 = (p) this.f731b;
                String str7 = (String) this.f732c;
                ep.c cVar3 = (ep.c) this.f733d;
                ArrayList arrayList4 = (ArrayList) obj;
                if (arrayList4 != null) {
                    boolean zIsEmpty = r12.isEmpty();
                    r12.clear();
                    ArrayList arrayList5 = new ArrayList();
                    int size = arrayList4.size();
                    int i16 = 0;
                    while (i16 < size) {
                        Object obj3 = arrayList4.get(i16);
                        i16++;
                        if (obj3 instanceof LanguageExpandableItem2) {
                            arrayList5.add(obj3);
                        }
                    }
                    r12.addAll(arrayList5);
                    if (!r12.isEmpty() && zIsEmpty && !str7.equals("Splash")) {
                        cVar3.f25723e.m(0);
                        cVar3.f25722d.m(-1);
                    }
                }
                return b0.f48488a;
            case 10:
                e2.l lVar = (e2.l) this.f731b;
                fz.c cVar4 = (fz.c) this.f732c;
                l1.b1 b1Var3 = (l1.b1) this.f733d;
                s0.p0 KeyboardActions = (s0.p0) obj;
                kotlin.jvm.internal.m.f(KeyboardActions, "$this$KeyboardActions");
                e2.l.a(lVar);
                g1.s((String) b1Var3.getValue(), cVar4);
                return b0.f48488a;
            case 11:
                lc.d dVar2 = (lc.d) this.f731b;
                final NewsFeedWebActivity newsFeedWebActivity = (NewsFeedWebActivity) this.f732c;
                final MenuItem menuItem = (MenuItem) this.f733d;
                lc.d it3 = (lc.d) obj;
                int i17 = NewsFeedWebActivity.Q;
                kotlin.jvm.internal.m.f(it3, "it");
                dVar2.dismiss();
                ((h0) newsFeedWebActivity.j()).f32643d.evaluateJavascript("javascript:allRead()", new ValueCallback() { // from class: bp.y3
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj4) {
                        int i18 = NewsFeedWebActivity.Q;
                        NewsFeedWebActivity newsFeedWebActivity2 = newsFeedWebActivity;
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(newsFeedWebActivity2), null, null, new a0.e0(5, newsFeedWebActivity2, menuItem, (vy.d) null), 3);
                    }
                });
                return b0.f48488a;
            case 12:
                e0.B((rz.b0) this.f731b, null, null, new t3((vt.n0) this.f732c, ((Integer) obj).intValue(), (a1) this.f733d, (vy.d) null, 2), 3);
                return b0.f48488a;
            case 13:
                fz.c cVar5 = (fz.c) this.f731b;
                ?? r13 = (l1.b1) this.f732c;
                CourseWord courseWord = (CourseWord) this.f733d;
                String text = (String) obj;
                kotlin.jvm.internal.m.f(text, "text");
                ArrayList arrayList6 = new ArrayList(n.W((List) r13.getValue(), 10));
                for (Iterator it4 = r0.iterator(); it4.hasNext(); it4 = it4) {
                    CourseWord courseWordCopy$default = (CourseWord) it4.next();
                    if (kotlin.jvm.internal.m.a(courseWordCopy$default, courseWord)) {
                        arrayList = arrayList6;
                        courseWordCopy$default = CourseWord.copy$default(courseWordCopy$default, 0L, text, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -3, 63, null);
                    } else {
                        arrayList = arrayList6;
                    }
                    arrayList.add(courseWordCopy$default);
                    arrayList6 = arrayList;
                }
                r13.setValue(arrayList6);
                cVar5.invoke(ry.m.y0((List) r13.getValue(), BuildConfig.VERSION_NAME, null, null, new br.b(9), 30));
                return b0.f48488a;
            case 14:
                HashMap map = (HashMap) this.f731b;
                CourseWord courseWord2 = (CourseWord) this.f732c;
                s sVar = (s) this.f733d;
                x it5 = (x) obj;
                kotlin.jvm.internal.m.f(it5, "it");
                x xVarH = it5.H();
                int iQ = hz.b.Q(Float.intBitsToFloat((int) ((xVarH != null ? xVarH.f(it5, 0L) : 0L) & 4294967295L)));
                map.put(courseWord2, it5);
                sVar.put(Integer.valueOf(courseWord2.getRandomId()), new h8(iQ, ((int) (it5.m() & 4294967295L)) + iQ));
                return b0.f48488a;
            case 15:
                l1.b1 b1Var4 = (l1.b1) this.f731b;
                fz.a aVar = (fz.a) this.f732c;
                l1.b1 b1Var5 = (l1.b1) this.f733d;
                z4 videoState = (z4) obj;
                kotlin.jvm.internal.m.f(videoState, "videoState");
                if (videoState != z4.Idle) {
                    aVar.invoke();
                    b1Var4.setValue(new j());
                    b1Var5.setValue(Boolean.FALSE);
                } else if (b1Var4.getValue() instanceof j) {
                    b1Var4.setValue(ht.a.f33722e);
                }
                return b0.f48488a;
            case 16:
                t1 t1Var = (t1) this.f731b;
                d0 d0Var = (d0) this.f732c;
                l1.b1 b1Var6 = (l1.b1) this.f733d;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                long wordId = t1Var.f45997a.getWordId();
                CourseWord courseWord3 = t1Var.f45998b;
                b1Var6.setValue((!(wordId == courseWord3.getWordId() && zBooleanValue) && (t1Var.f45997a.getWordId() == courseWord3.getWordId() || zBooleanValue)) ? ht.q.WRONG : ht.q.CORRECT);
                if (d0Var != null) {
                    boolean z13 = ((ht.q) b1Var6.getValue()) == ht.q.CORRECT;
                    d0Var.b(z13, z13);
                }
                return b0.f48488a;
            case 17:
                g8 g8Var = (g8) this.f731b;
                l1.b1 b1Var7 = (l1.b1) this.f732c;
                l1.b1 b1Var8 = (l1.b1) this.f733d;
                ht.l newState = (ht.l) obj;
                kotlin.jvm.internal.m.f(newState, "newState");
                if (newState instanceof ht.a) {
                    if (g8Var == g8.Left) {
                        b1Var7.setValue(-1L);
                    } else {
                        b1Var8.setValue(-1L);
                    }
                }
                return b0.f48488a;
            case 18:
                LifecycleOwner lifecycleOwner = (LifecycleOwner) this.f731b;
                CourseFlashCardIndexActivity courseFlashCardIndexActivity = (CourseFlashCardIndexActivity) this.f732c;
                l1.b1 b1Var9 = (l1.b1) this.f733d;
                j0 DisposableEffect = (j0) obj;
                int i18 = CourseFlashCardIndexActivity.f21612t;
                kotlin.jvm.internal.m.f(DisposableEffect, "$this$DisposableEffect");
                androidx.lifecycle.compose.g gVar = new androidx.lifecycle.compose.g(i15, courseFlashCardIndexActivity, b1Var9);
                lifecycleOwner.getLifecycle().addObserver(gVar);
                b1Var9.setValue(Boolean.valueOf(new n4.t(courseFlashCardIndexActivity).f43230a.areNotificationsEnabled()));
                return new l0(i12, lifecycleOwner, gVar);
            case 19:
                final js.i iVar = (js.i) this.f731b;
                final v vVar = (v) this.f732c;
                fz.a aVar2 = (fz.a) this.f733d;
                j9.t NavHost = (j9.t) obj;
                kotlin.jvm.internal.m.f(NavHost, "$this$NavHost");
                c.a.g(NavHost, "chinese_tone_index", null, null, new t1.d(new b2((Object) iVar, vVar, (Object) aVar2, i15), true, 108215483), 254);
                final int i19 = 0;
                c.a.g(NavHost, "chinese_tone_unit", null, null, new t1.d(new fz.g() { // from class: cs.c
                    @Override // fz.g
                    public final Object f(Object obj4, Object obj5, Object obj6, Object obj7) {
                        int i21 = i19;
                        a0.r composable = (a0.r) obj4;
                        e it6 = (e) obj5;
                        l1.n nVar = (l1.n) obj6;
                        ((Integer) obj7).getClass();
                        kotlin.jvm.internal.m.f(composable, "$this$composable");
                        kotlin.jvm.internal.m.f(it6, "it");
                        switch (i21) {
                            case 0:
                                i iVar2 = iVar;
                                ChineseToneUnit chineseToneUnit = (ChineseToneUnit) l1.t.o(iVar2.f36775f, nVar).getValue();
                                if (chineseToneUnit == null) {
                                    l1.s sVar2 = (l1.s) nVar;
                                    sVar2.d0(-1688413871);
                                    sVar2.p(false);
                                } else {
                                    l1.s sVar3 = (l1.s) nVar;
                                    sVar3.d0(-1688413870);
                                    v vVar2 = vVar;
                                    boolean zH = sVar3.h(vVar2);
                                    Object objQ = sVar3.Q();
                                    g gVar2 = l1.m.f39353a;
                                    if (zH || objQ == gVar2) {
                                        objQ = new z1(vVar2, 6);
                                        sVar3.o0(objQ);
                                    }
                                    fz.a aVar3 = (fz.a) objQ;
                                    boolean zH2 = sVar3.h(chineseToneUnit) | sVar3.h(iVar2) | sVar3.h(vVar2);
                                    Object objQ2 = sVar3.Q();
                                    if (zH2 || objQ2 == gVar2) {
                                        objQ2 = new aj.c(chineseToneUnit, iVar2, vVar2, 20);
                                        sVar3.o0(objQ2);
                                    }
                                    fz.c cVar6 = (fz.c) objQ2;
                                    boolean zH3 = sVar3.h(iVar2) | sVar3.h(vVar2);
                                    Object objQ3 = sVar3.Q();
                                    if (zH3 || objQ3 == gVar2) {
                                        objQ3 = new d(iVar2, vVar2, 0);
                                        sVar3.o0(objQ3);
                                    }
                                    es.j.f(chineseToneUnit, aVar3, cVar6, (fz.c) objQ3, null, sVar3, 0);
                                    sVar3.p(false);
                                }
                                break;
                            case 1:
                                i iVar3 = iVar;
                                l1.b1 b1VarO = l1.t.o(iVar3.f36773d, nVar);
                                ChineseToneLesson chineseToneLesson = (ChineseToneLesson) b1VarO.getValue();
                                l1.s sVar4 = (l1.s) nVar;
                                boolean zF = sVar4.f(b1VarO) | sVar4.h(iVar3);
                                Object objQ4 = sVar4.Q();
                                g gVar3 = l1.m.f39353a;
                                if (zF || objQ4 == gVar3) {
                                    objQ4 = new f0(14, b1VarO, iVar3, null);
                                    sVar4.o0(objQ4);
                                }
                                l1.t.f((fz.e) objQ4, chineseToneLesson, sVar4);
                                if (((ChineseToneLesson) b1VarO.getValue()) != null) {
                                    sVar4.d0(-787157703);
                                    ChineseToneLesson chineseToneLesson2 = (ChineseToneLesson) b1VarO.getValue();
                                    kotlin.jvm.internal.m.c(chineseToneLesson2);
                                    v vVar3 = vVar;
                                    boolean zH4 = sVar4.h(vVar3) | sVar4.h(iVar3);
                                    Object objQ5 = sVar4.Q();
                                    if (zH4 || objQ5 == gVar3) {
                                        objQ5 = new f(22, vVar3, iVar3);
                                        sVar4.o0(objQ5);
                                    }
                                    fz.a aVar4 = (fz.a) objQ5;
                                    Object objQ6 = sVar4.Q();
                                    if (objQ6 == gVar3) {
                                        objQ6 = new br.b(3);
                                        sVar4.o0(objQ6);
                                    }
                                    qx.b.c(chineseToneLesson2, null, null, aVar4, (fz.c) objQ6, sVar4, 24576);
                                } else {
                                    sVar4.d0(-793869265);
                                }
                                sVar4.p(false);
                                break;
                            default:
                                i iVar4 = iVar;
                                l1.b1 b1VarO2 = l1.t.o(iVar4.H, nVar);
                                l1.s sVar5 = (l1.s) nVar;
                                v vVar4 = vVar;
                                boolean zH5 = sVar5.h(vVar4);
                                Object objQ7 = sVar5.Q();
                                g gVar4 = l1.m.f39353a;
                                if (zH5 || objQ7 == gVar4) {
                                    objQ7 = new z1(vVar4, 1);
                                    sVar5.o0(objQ7);
                                }
                                fz.a aVar5 = (fz.a) objQ7;
                                boolean zF2 = sVar5.f(b1VarO2) | sVar5.h(iVar4) | sVar5.h(vVar4);
                                Object objQ8 = sVar5.Q();
                                if (zF2 || objQ8 == gVar4) {
                                    objQ8 = new androidx.lifecycle.compose.a(iVar4, vVar4, b1VarO2, 10);
                                    sVar5.o0(objQ8);
                                }
                                gs.a.v(aVar5, (fz.a) objQ8, null, ((Boolean) b1VarO2.getValue()).booleanValue() ? R.string.chinese_tone_btn_next : R.string.chinese_tone_btn_got_it, sVar5, 0);
                                break;
                        }
                        return b0.f48488a;
                    }
                }, true, -36243342), 254);
                c.a.g(NavHost, "chinese_tone_test", null, null, new t1.d(new fz.g() { // from class: cs.c
                    @Override // fz.g
                    public final Object f(Object obj4, Object obj5, Object obj6, Object obj7) {
                        int i21 = i15;
                        a0.r composable = (a0.r) obj4;
                        e it6 = (e) obj5;
                        l1.n nVar = (l1.n) obj6;
                        ((Integer) obj7).getClass();
                        kotlin.jvm.internal.m.f(composable, "$this$composable");
                        kotlin.jvm.internal.m.f(it6, "it");
                        switch (i21) {
                            case 0:
                                i iVar2 = iVar;
                                ChineseToneUnit chineseToneUnit = (ChineseToneUnit) l1.t.o(iVar2.f36775f, nVar).getValue();
                                if (chineseToneUnit == null) {
                                    l1.s sVar2 = (l1.s) nVar;
                                    sVar2.d0(-1688413871);
                                    sVar2.p(false);
                                } else {
                                    l1.s sVar3 = (l1.s) nVar;
                                    sVar3.d0(-1688413870);
                                    v vVar2 = vVar;
                                    boolean zH = sVar3.h(vVar2);
                                    Object objQ = sVar3.Q();
                                    g gVar2 = l1.m.f39353a;
                                    if (zH || objQ == gVar2) {
                                        objQ = new z1(vVar2, 6);
                                        sVar3.o0(objQ);
                                    }
                                    fz.a aVar3 = (fz.a) objQ;
                                    boolean zH2 = sVar3.h(chineseToneUnit) | sVar3.h(iVar2) | sVar3.h(vVar2);
                                    Object objQ2 = sVar3.Q();
                                    if (zH2 || objQ2 == gVar2) {
                                        objQ2 = new aj.c(chineseToneUnit, iVar2, vVar2, 20);
                                        sVar3.o0(objQ2);
                                    }
                                    fz.c cVar6 = (fz.c) objQ2;
                                    boolean zH3 = sVar3.h(iVar2) | sVar3.h(vVar2);
                                    Object objQ3 = sVar3.Q();
                                    if (zH3 || objQ3 == gVar2) {
                                        objQ3 = new d(iVar2, vVar2, 0);
                                        sVar3.o0(objQ3);
                                    }
                                    es.j.f(chineseToneUnit, aVar3, cVar6, (fz.c) objQ3, null, sVar3, 0);
                                    sVar3.p(false);
                                }
                                break;
                            case 1:
                                i iVar3 = iVar;
                                l1.b1 b1VarO = l1.t.o(iVar3.f36773d, nVar);
                                ChineseToneLesson chineseToneLesson = (ChineseToneLesson) b1VarO.getValue();
                                l1.s sVar4 = (l1.s) nVar;
                                boolean zF = sVar4.f(b1VarO) | sVar4.h(iVar3);
                                Object objQ4 = sVar4.Q();
                                g gVar3 = l1.m.f39353a;
                                if (zF || objQ4 == gVar3) {
                                    objQ4 = new f0(14, b1VarO, iVar3, null);
                                    sVar4.o0(objQ4);
                                }
                                l1.t.f((fz.e) objQ4, chineseToneLesson, sVar4);
                                if (((ChineseToneLesson) b1VarO.getValue()) != null) {
                                    sVar4.d0(-787157703);
                                    ChineseToneLesson chineseToneLesson2 = (ChineseToneLesson) b1VarO.getValue();
                                    kotlin.jvm.internal.m.c(chineseToneLesson2);
                                    v vVar3 = vVar;
                                    boolean zH4 = sVar4.h(vVar3) | sVar4.h(iVar3);
                                    Object objQ5 = sVar4.Q();
                                    if (zH4 || objQ5 == gVar3) {
                                        objQ5 = new f(22, vVar3, iVar3);
                                        sVar4.o0(objQ5);
                                    }
                                    fz.a aVar4 = (fz.a) objQ5;
                                    Object objQ6 = sVar4.Q();
                                    if (objQ6 == gVar3) {
                                        objQ6 = new br.b(3);
                                        sVar4.o0(objQ6);
                                    }
                                    qx.b.c(chineseToneLesson2, null, null, aVar4, (fz.c) objQ6, sVar4, 24576);
                                } else {
                                    sVar4.d0(-793869265);
                                }
                                sVar4.p(false);
                                break;
                            default:
                                i iVar4 = iVar;
                                l1.b1 b1VarO2 = l1.t.o(iVar4.H, nVar);
                                l1.s sVar5 = (l1.s) nVar;
                                v vVar4 = vVar;
                                boolean zH5 = sVar5.h(vVar4);
                                Object objQ7 = sVar5.Q();
                                g gVar4 = l1.m.f39353a;
                                if (zH5 || objQ7 == gVar4) {
                                    objQ7 = new z1(vVar4, 1);
                                    sVar5.o0(objQ7);
                                }
                                fz.a aVar5 = (fz.a) objQ7;
                                boolean zF2 = sVar5.f(b1VarO2) | sVar5.h(iVar4) | sVar5.h(vVar4);
                                Object objQ8 = sVar5.Q();
                                if (zF2 || objQ8 == gVar4) {
                                    objQ8 = new androidx.lifecycle.compose.a(iVar4, vVar4, b1VarO2, 10);
                                    sVar5.o0(objQ8);
                                }
                                gs.a.v(aVar5, (fz.a) objQ8, null, ((Boolean) b1VarO2.getValue()).booleanValue() ? R.string.chinese_tone_btn_next : R.string.chinese_tone_btn_got_it, sVar5, 0);
                                break;
                        }
                        return b0.f48488a;
                    }
                }, true, 890511411), 254);
                c.a.g(NavHost, "chinese_tone_introduction", null, null, new t1.d(new fz.g() { // from class: cs.c
                    @Override // fz.g
                    public final Object f(Object obj4, Object obj5, Object obj6, Object obj7) {
                        int i21 = i14;
                        a0.r composable = (a0.r) obj4;
                        e it6 = (e) obj5;
                        l1.n nVar = (l1.n) obj6;
                        ((Integer) obj7).getClass();
                        kotlin.jvm.internal.m.f(composable, "$this$composable");
                        kotlin.jvm.internal.m.f(it6, "it");
                        switch (i21) {
                            case 0:
                                i iVar2 = iVar;
                                ChineseToneUnit chineseToneUnit = (ChineseToneUnit) l1.t.o(iVar2.f36775f, nVar).getValue();
                                if (chineseToneUnit == null) {
                                    l1.s sVar2 = (l1.s) nVar;
                                    sVar2.d0(-1688413871);
                                    sVar2.p(false);
                                } else {
                                    l1.s sVar3 = (l1.s) nVar;
                                    sVar3.d0(-1688413870);
                                    v vVar2 = vVar;
                                    boolean zH = sVar3.h(vVar2);
                                    Object objQ = sVar3.Q();
                                    g gVar2 = l1.m.f39353a;
                                    if (zH || objQ == gVar2) {
                                        objQ = new z1(vVar2, 6);
                                        sVar3.o0(objQ);
                                    }
                                    fz.a aVar3 = (fz.a) objQ;
                                    boolean zH2 = sVar3.h(chineseToneUnit) | sVar3.h(iVar2) | sVar3.h(vVar2);
                                    Object objQ2 = sVar3.Q();
                                    if (zH2 || objQ2 == gVar2) {
                                        objQ2 = new aj.c(chineseToneUnit, iVar2, vVar2, 20);
                                        sVar3.o0(objQ2);
                                    }
                                    fz.c cVar6 = (fz.c) objQ2;
                                    boolean zH3 = sVar3.h(iVar2) | sVar3.h(vVar2);
                                    Object objQ3 = sVar3.Q();
                                    if (zH3 || objQ3 == gVar2) {
                                        objQ3 = new d(iVar2, vVar2, 0);
                                        sVar3.o0(objQ3);
                                    }
                                    es.j.f(chineseToneUnit, aVar3, cVar6, (fz.c) objQ3, null, sVar3, 0);
                                    sVar3.p(false);
                                }
                                break;
                            case 1:
                                i iVar3 = iVar;
                                l1.b1 b1VarO = l1.t.o(iVar3.f36773d, nVar);
                                ChineseToneLesson chineseToneLesson = (ChineseToneLesson) b1VarO.getValue();
                                l1.s sVar4 = (l1.s) nVar;
                                boolean zF = sVar4.f(b1VarO) | sVar4.h(iVar3);
                                Object objQ4 = sVar4.Q();
                                g gVar3 = l1.m.f39353a;
                                if (zF || objQ4 == gVar3) {
                                    objQ4 = new f0(14, b1VarO, iVar3, null);
                                    sVar4.o0(objQ4);
                                }
                                l1.t.f((fz.e) objQ4, chineseToneLesson, sVar4);
                                if (((ChineseToneLesson) b1VarO.getValue()) != null) {
                                    sVar4.d0(-787157703);
                                    ChineseToneLesson chineseToneLesson2 = (ChineseToneLesson) b1VarO.getValue();
                                    kotlin.jvm.internal.m.c(chineseToneLesson2);
                                    v vVar3 = vVar;
                                    boolean zH4 = sVar4.h(vVar3) | sVar4.h(iVar3);
                                    Object objQ5 = sVar4.Q();
                                    if (zH4 || objQ5 == gVar3) {
                                        objQ5 = new f(22, vVar3, iVar3);
                                        sVar4.o0(objQ5);
                                    }
                                    fz.a aVar4 = (fz.a) objQ5;
                                    Object objQ6 = sVar4.Q();
                                    if (objQ6 == gVar3) {
                                        objQ6 = new br.b(3);
                                        sVar4.o0(objQ6);
                                    }
                                    qx.b.c(chineseToneLesson2, null, null, aVar4, (fz.c) objQ6, sVar4, 24576);
                                } else {
                                    sVar4.d0(-793869265);
                                }
                                sVar4.p(false);
                                break;
                            default:
                                i iVar4 = iVar;
                                l1.b1 b1VarO2 = l1.t.o(iVar4.H, nVar);
                                l1.s sVar5 = (l1.s) nVar;
                                v vVar4 = vVar;
                                boolean zH5 = sVar5.h(vVar4);
                                Object objQ7 = sVar5.Q();
                                g gVar4 = l1.m.f39353a;
                                if (zH5 || objQ7 == gVar4) {
                                    objQ7 = new z1(vVar4, 1);
                                    sVar5.o0(objQ7);
                                }
                                fz.a aVar5 = (fz.a) objQ7;
                                boolean zF2 = sVar5.f(b1VarO2) | sVar5.h(iVar4) | sVar5.h(vVar4);
                                Object objQ8 = sVar5.Q();
                                if (zF2 || objQ8 == gVar4) {
                                    objQ8 = new androidx.lifecycle.compose.a(iVar4, vVar4, b1VarO2, 10);
                                    sVar5.o0(objQ8);
                                }
                                gs.a.v(aVar5, (fz.a) objQ8, null, ((Boolean) b1VarO2.getValue()).booleanValue() ? R.string.chinese_tone_btn_next : R.string.chinese_tone_btn_got_it, sVar5, 0);
                                break;
                        }
                        return b0.f48488a;
                    }
                }, true, 1817266164), 254);
                c.a.g(NavHost, "chinese_first_tone_introduction", null, null, new t1.d(new cs.b(vVar, i14), true, -1550946379), 254);
                c.a.g(NavHost, "chinese_second_tone_introduction", null, null, new t1.d(new cs.b(vVar, i13), true, -624191626), 254);
                c.a.g(NavHost, "chinese_third_tone_introduction", null, null, new t1.d(new cs.b(vVar, i12), true, 302563127), 254);
                c.a.g(NavHost, "chinese_fourth_tone_introduction", null, null, new t1.d(new cs.b(vVar, 5), true, 1229317880), 254);
                c.a.g(NavHost, "chinese_tone_changes_3rd_tone_introduction", null, null, new t1.d(new cs.b(vVar, 6), true, -2138894663), 254);
                c.a.g(NavHost, "chinese_tone_changes_bu_introduction", null, null, new t1.d(new cs.b(vVar, i11), true, -1212139910), 254);
                c.a.g(NavHost, "chinese_tone_changes_yi_introduction", null, null, new t1.d(new cs.b(vVar, 0), true, 1114094438), 254);
                c.a.g(NavHost, "chinese_neutral_tone_introduction", null, null, new t1.d(new cs.b(vVar, i15), true, 2040849191), 254);
                return b0.f48488a;
            case 20:
                ChineseToneUnit chineseToneUnit = (ChineseToneUnit) this.f731b;
                js.i iVar2 = (js.i) this.f732c;
                v vVar2 = (v) this.f733d;
                ChineseToneLesson lesson = (ChineseToneLesson) obj;
                kotlin.jvm.internal.m.f(lesson, "lesson");
                if (lesson.getLessonId() < 0) {
                    for (Object obj4 : chineseToneUnit.getLessons()) {
                        if (((ChineseToneLesson) obj4).getLessonId() == (-lesson.getLessonId())) {
                            obj2 = obj4;
                            kotlin.jvm.internal.m.c(obj2);
                            iVar2.a(lesson);
                            iVar2.b((ChineseToneLesson) obj2);
                            if (l.D(new Long[]{1L, 1019L}, Long.valueOf(-lesson.getLessonId()))) {
                                v.b(vVar2, "chinese_first_tone_introduction");
                            } else if (l.D(new Long[]{2L, 1020L}, Long.valueOf(-lesson.getLessonId()))) {
                                v.b(vVar2, "chinese_second_tone_introduction");
                            } else if (l.D(new Long[]{3L, 1021L}, Long.valueOf(-lesson.getLessonId()))) {
                                v.b(vVar2, "chinese_third_tone_introduction");
                            } else if (l.D(new Long[]{4L, 1022L}, Long.valueOf(-lesson.getLessonId()))) {
                                v.b(vVar2, "chinese_fourth_tone_introduction");
                            } else if (l.D(new Long[]{15L}, Long.valueOf(-lesson.getLessonId()))) {
                                v.b(vVar2, "chinese_tone_changes_3rd_tone_introduction");
                            } else if (l.D(new Long[]{3022L}, Long.valueOf(-lesson.getLessonId()))) {
                                v.b(vVar2, "chinese_tone_changes_bu_introduction");
                            } else if (l.D(new Long[]{3019L}, Long.valueOf(-lesson.getLessonId()))) {
                                v.b(vVar2, "chinese_tone_changes_yi_introduction");
                            } else if (l.D(new Long[]{16L, 17L}, Long.valueOf(-lesson.getLessonId()))) {
                                v.b(vVar2, "chinese_neutral_tone_introduction");
                            }
                        }
                    }
                    kotlin.jvm.internal.m.c(obj2);
                    iVar2.a(lesson);
                    iVar2.b((ChineseToneLesson) obj2);
                    if (l.D(new Long[]{1L, 1019L}, Long.valueOf(-lesson.getLessonId()))) {
                        v.b(vVar2, "chinese_first_tone_introduction");
                    } else if (l.D(new Long[]{2L, 1020L}, Long.valueOf(-lesson.getLessonId()))) {
                        v.b(vVar2, "chinese_second_tone_introduction");
                    } else if (l.D(new Long[]{3L, 1021L}, Long.valueOf(-lesson.getLessonId()))) {
                        v.b(vVar2, "chinese_third_tone_introduction");
                    } else if (l.D(new Long[]{4L, 1022L}, Long.valueOf(-lesson.getLessonId()))) {
                        v.b(vVar2, "chinese_fourth_tone_introduction");
                    } else if (l.D(new Long[]{15L}, Long.valueOf(-lesson.getLessonId()))) {
                        v.b(vVar2, "chinese_tone_changes_3rd_tone_introduction");
                    } else if (l.D(new Long[]{3022L}, Long.valueOf(-lesson.getLessonId()))) {
                        v.b(vVar2, "chinese_tone_changes_bu_introduction");
                    } else if (l.D(new Long[]{3019L}, Long.valueOf(-lesson.getLessonId()))) {
                        v.b(vVar2, "chinese_tone_changes_yi_introduction");
                    } else if (l.D(new Long[]{16L, 17L}, Long.valueOf(-lesson.getLessonId()))) {
                        v.b(vVar2, "chinese_neutral_tone_introduction");
                    }
                } else {
                    iVar2.b(lesson);
                    v.b(vVar2, "chinese_tone_test");
                }
                return b0.f48488a;
            case 21:
                o oVar = (o) this.f731b;
                com.google.firebase.remoteconfig.a aVar3 = (com.google.firebase.remoteconfig.a) this.f732c;
                u uVar = (u) this.f733d;
                t tVar = (t) obj;
                long j11 = tVar.f51345c;
                z0 z0Var = (z0) oVar.f34407d;
                if (!z0Var.j() || z0Var.m().f44704a.f35700b.length() == 0 || (s0Var = z0Var.f23040d) == null || s0Var.d() == null) {
                    z11 = false;
                } else {
                    oVar.k(z0Var.m(), j11, false, aVar3);
                    z11 = true;
                }
                if (z11) {
                    tVar.a();
                    uVar.f38357a = true;
                }
                return b0.f48488a;
            case 22:
                final z0 z0Var2 = (z0) this.f731b;
                rz.b0 b0Var = (rz.b0) this.f732c;
                Context context2 = (Context) this.f733d;
                u0.a aVar4 = (u0.a) obj;
                y.e0 e0Var = aVar4.f52716a;
                y.e0 e0Var2 = aVar4.f52716a;
                v0.f fVar2 = v0.f.f53462b;
                e0Var.a(fVar2);
                y0 y0Var = y0.Cut;
                ?? r14 = (x0.c(z0Var2.m().f44705b) || !((Boolean) z0Var2.m.getValue()).booleanValue() || (z0Var2.f23042f instanceof o3.q)) ? false : true;
                at.f fVar3 = new at.f(b0Var, new d1.s0(z0Var2, r11, i15));
                Resources resources = context2.getResources();
                int i21 = 8;
                com.google.accompanist.permissions.a aVar5 = new com.google.accompanist.permissions.a(i21, fVar3, r11);
                if (r14 != false) {
                    e0Var2.a(new v0.d(y0Var.b(), y0Var.c(resources), y0Var.a(), aVar5));
                }
                y0 y0Var2 = y0.Copy;
                boolean z14 = (x0.c(z0Var2.m().f44705b) || (z0Var2.f23042f instanceof o3.q)) ? false : true;
                at.f fVar4 = new at.f(b0Var, new d1.s0(z0Var2, r11, i14));
                Resources resources2 = context2.getResources();
                com.google.accompanist.permissions.a aVar6 = new com.google.accompanist.permissions.a(i21, fVar4, r11);
                if (z14) {
                    e0Var2.a(new v0.d(y0Var2.b(), y0Var2.c(resources2), y0Var2.a(), aVar6));
                }
                y0 y0Var3 = y0.Paste;
                boolean z15 = ((Boolean) z0Var2.m.getValue()).booleanValue() && (b1Var = (b1) z0Var2.f23059x.getValue()) != null && b1Var.f58509a.getDescription().hasMimeType("text/*");
                at.f fVar5 = new at.f(b0Var, new d1.s0(z0Var2, r11, i13));
                Resources resources3 = context2.getResources();
                com.google.accompanist.permissions.a aVar7 = new com.google.accompanist.permissions.a(i21, fVar5, r11);
                if (z15) {
                    e0Var2.a(new v0.d(y0Var3.b(), y0Var3.c(resources3), y0Var3.a(), aVar7));
                }
                y0 y0Var4 = y0.SelectAll;
                boolean z16 = x0.d(z0Var2.m().f44705b) != z0Var2.m().f44704a.f35700b.length();
                final int i22 = 0;
                fz.a aVar8 = new fz.a() { // from class: d1.c1
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i22) {
                            case 0:
                                return Boolean.valueOf(!z0Var2.B);
                            case 1:
                                z0 z0Var3 = z0Var2;
                                o3.w wVarE = z0.e(z0Var3.m().f44704a, j3.t.b(0, z0Var3.m().f44704a.f35700b.length()));
                                z0Var3.f23039c.invoke(wVarE);
                                long j12 = wVarE.f44705b;
                                z0Var3.f23058w = new j3.x0(j12);
                                z0Var3.f23056u = o3.w.a(z0Var3.f23056u, null, j12, 5);
                                z0Var3.h(true);
                                return qy.b0.f48488a;
                            default:
                                fz.a aVar9 = z0Var2.f23043g;
                                if (aVar9 != null) {
                                    aVar9.invoke();
                                }
                                return qy.b0.f48488a;
                        }
                    }
                };
                fz.a aVar9 = new fz.a() { // from class: d1.c1
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i15) {
                            case 0:
                                return Boolean.valueOf(!z0Var2.B);
                            case 1:
                                z0 z0Var3 = z0Var2;
                                o3.w wVarE = z0.e(z0Var3.m().f44704a, j3.t.b(0, z0Var3.m().f44704a.f35700b.length()));
                                z0Var3.f23039c.invoke(wVarE);
                                long j12 = wVarE.f44705b;
                                z0Var3.f23058w = new j3.x0(j12);
                                z0Var3.f23056u = o3.w.a(z0Var3.f23056u, null, j12, 5);
                                z0Var3.h(true);
                                return qy.b0.f48488a;
                            default:
                                fz.a aVar10 = z0Var2.f23043g;
                                if (aVar10 != null) {
                                    aVar10.invoke();
                                }
                                return qy.b0.f48488a;
                        }
                    }
                };
                Resources resources4 = context2.getResources();
                com.google.accompanist.permissions.a aVar10 = new com.google.accompanist.permissions.a(i21, aVar9, aVar8);
                if (z16) {
                    e0Var2.a(new v0.d(y0Var4.b(), y0Var4.c(resources4), y0Var4.a(), aVar10));
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    y0 y0Var5 = y0.Autofill;
                    i15 = (((Boolean) z0Var2.m.getValue()).booleanValue() && x0.c(z0Var2.m().f44705b)) ? 1 : 0;
                    fz.a aVar11 = new fz.a() { // from class: d1.c1
                        @Override // fz.a
                        public final Object invoke() {
                            switch (i14) {
                                case 0:
                                    return Boolean.valueOf(!z0Var2.B);
                                case 1:
                                    z0 z0Var3 = z0Var2;
                                    o3.w wVarE = z0.e(z0Var3.m().f44704a, j3.t.b(0, z0Var3.m().f44704a.f35700b.length()));
                                    z0Var3.f23039c.invoke(wVarE);
                                    long j12 = wVarE.f44705b;
                                    z0Var3.f23058w = new j3.x0(j12);
                                    z0Var3.f23056u = o3.w.a(z0Var3.f23056u, null, j12, 5);
                                    z0Var3.h(true);
                                    return qy.b0.f48488a;
                                default:
                                    fz.a aVar12 = z0Var2.f23043g;
                                    if (aVar12 != null) {
                                        aVar12.invoke();
                                    }
                                    return qy.b0.f48488a;
                            }
                        }
                    };
                    Resources resources5 = context2.getResources();
                    com.google.accompanist.permissions.a aVar12 = new com.google.accompanist.permissions.a(i21, aVar11, r11);
                    if (i15 != 0) {
                        e0Var2.a(new v0.d(y0Var5.b(), y0Var5.c(resources5), y0Var5.a(), aVar12));
                    }
                }
                e0Var2.a(fVar2);
                return b0.f48488a;
            case 23:
                SingleVowelAdapter singleVowelAdapter = (SingleVowelAdapter) this.f731b;
                String[] strArr = (String[]) this.f733d;
                ImageView imageView2 = (ImageView) this.f732c;
                kotlin.jvm.internal.m.f((View) obj, "<unused var>");
                dn.b bVar = singleVowelAdapter.f21912b;
                if (bVar != null) {
                    bVar.a();
                }
                dn.b bVar2 = new dn.b(imageView2, i15);
                singleVowelAdapter.f21912b = bVar2;
                a9.i iVar3 = singleVowelAdapter.f21911a;
                iVar3.f521e = bVar2;
                qy.q qVar = fv.b.f28186a;
                if (wm.a.f55177e == null) {
                    synchronized (wm.a.class) {
                        if (wm.a.f55177e == null) {
                            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                            kotlin.jvm.internal.m.c(lingoSkillApplication);
                            wm.a.f55177e = new wm.a(lingoSkillApplication);
                        }
                        break;
                    }
                }
                kotlin.jvm.internal.m.c(wm.a.f55177e);
                String strA = wm.a.a(strArr[0]);
                kotlin.jvm.internal.m.c(strA);
                iVar3.v(fv.b.c(strA, null, null));
                android.support.v4.media.session.a.K(imageView2.getBackground());
                return b0.f48488a;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                ExoPlayer exoPlayer = (ExoPlayer) this.f731b;
                fz.c cVar6 = (fz.c) this.f732c;
                fz.a aVar13 = (fz.a) this.f733d;
                j0 DisposableEffect2 = (j0) obj;
                kotlin.jvm.internal.m.f(DisposableEffect2, "$this$DisposableEffect");
                x4 x4Var = new x4(cVar6, aVar13);
                exoPlayer.i(x4Var);
                return new l0(i11, exoPlayer, x4Var);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                rz.b0 b0Var2 = (rz.b0) this.f731b;
                l1.b1 b1Var10 = (l1.b1) this.f732c;
                fz.a aVar14 = (fz.a) this.f733d;
                x coordinates = (x) obj;
                kotlin.jvm.internal.m.f(coordinates, "coordinates");
                int iM7 = (int) (coordinates.m() & 4294967295L);
                if (((Number) b1Var10.getValue()).intValue() > 0 && iM7 > ((Number) b1Var10.getValue()).intValue() * 1.1f) {
                    e0.B(b0Var2, null, null, new et.y(aVar14, r11, false ? 1 : 0), 3);
                }
                b1Var10.setValue(Integer.valueOf(iM7));
                return b0.f48488a;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                f0.i iVar4 = (f0.i) this.f731b;
                rz.g1 g1Var = (rz.g1) this.f732c;
                g2 g2Var = (g2) this.f733d;
                float fFloatValue = ((Float) obj).floatValue();
                float f5 = iVar4.S ? 1.0f : -1.0f;
                i2 i2Var = iVar4.R;
                long jE = i2Var.e(i2Var.h(f5 * fFloatValue));
                i2 i2Var2 = g2Var.f26286a;
                float fG = i2Var.g(i2Var.e(i2Var2.c(i2Var2.f26315k, jE, 1))) * f5;
                if (Math.abs(fG) < Math.abs(fFloatValue)) {
                    g1Var.cancel(e0.a("Scroll animation cancelled because scroll was not consumed (" + fG + " < " + fFloatValue + ')', null));
                }
                return b0.f48488a;
            case 27:
                kotlin.jvm.internal.v vVar3 = (kotlin.jvm.internal.v) this.f731b;
                e2 e2Var = (e2) this.f732c;
                kotlin.jvm.internal.v vVar4 = (kotlin.jvm.internal.v) this.f733d;
                b0.l lVar2 = (b0.l) obj;
                float fFloatValue2 = ((Number) lVar2.f3591e.getValue()).floatValue() - vVar3.f38358a;
                float fA = e2Var.a(fFloatValue2);
                vVar3.f38358a = ((Number) lVar2.f3591e.getValue()).floatValue();
                vVar4.f38358a = ((Number) lVar2.f3587a.f3576b.invoke(lVar2.f3592f)).floatValue();
                if (Math.abs(fFloatValue2 - fA) > 0.5f) {
                    lVar2.a();
                }
                return b0.f48488a;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return a(obj);
            default:
                js.r rVar = (js.r) this.f731b;
                l1.b1 b1Var11 = (l1.b1) this.f732c;
                l1.b1 b1Var12 = (l1.b1) this.f733d;
                ht.o testModel = (ht.o) obj;
                kotlin.jvm.internal.m.f(testModel, "testModel");
                int i23 = testModel.f33753a;
                if (i23 == -1) {
                    rVar.t(yb.f50724a);
                } else {
                    if (i23 == 4 && testModel.f33755c == 2) {
                        z12 = true;
                    }
                    b1Var11.setValue(Boolean.valueOf(z12));
                    b1Var12.setValue(Boolean.TRUE);
                }
                return b0.f48488a;
        }
    }

    public /* synthetic */ c(f0.i iVar, v2 v2Var, rz.g1 g1Var, g2 g2Var) {
        this.f730a = 26;
        this.f731b = iVar;
        this.f732c = g1Var;
        this.f733d = g2Var;
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i11) {
        this.f730a = i11;
        this.f731b = obj;
        this.f732c = obj2;
        this.f733d = obj3;
    }

    public /* synthetic */ c(kotlin.jvm.internal.v vVar, e2 e2Var, kotlin.jvm.internal.v vVar2, f0.l lVar) {
        this.f730a = 27;
        this.f731b = vVar;
        this.f732c = e2Var;
        this.f733d = vVar2;
    }
}
