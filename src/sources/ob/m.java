package ob;

import android.app.Activity;
import android.content.ClipDescription;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.LocationManager;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.p2;
import androidx.work.impl.WorkDatabase_Impl;
import b7.f0;
import bq.z;
import bt.g7;
import bw.ORXQ.ADSb;
import ce.a0;
import ce.y;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.snackbar.Snackbar;
import com.google.api.Service;
import com.google.common.base.Preconditions;
import com.lingo.fluent.ui.base.adapter.PdLearnSpeakAdapter;
import com.lingo.fluent.widget.WaveView;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.Model_Sentence_010;
import com.lingo.lingoskill.object.PdSentence;
import com.lingo.lingoskill.object.Sentence;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.speak.adapter.SpeakTryAdapter;
import com.lingo.lingoskill.ui.learn.adapter.AbsDialogModelAdapter;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.tbruyelle.rxpermissions3.RxPermissions;
import com.yalantis.ucrop.view.CropImageView;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import jp.m0;
import jt.t0;
import kotlin.jvm.internal.c0;
import l.j0;
import lw.k0;
import lw.p0;
import lw.q0;
import mt.l0;
import n9.x;
import qp.z2;
import uz.i1;
import uz.x0;
import y.e0;
import y.i0;
import y.r0;
import y.w;
import y6.d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements ki.a, b5.g, y, u8.d, tx.c, th.c, l1.d, fv.e, y4.c, m0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static m f44824e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f44826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f44827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f44828d;

    public /* synthetic */ m(int i11, boolean z11) {
        this.f44825a = i11;
    }

    public static final n9.e E(m mVar, n9.e eVar, x xVar, x xVar2) {
        n9.v vVar;
        n9.v vVar2;
        n9.v vVar3;
        mVar.getClass();
        n9.v vVar4 = n9.u.f43702c;
        if (eVar == null || (vVar = eVar.f43541a) == null) {
            vVar = vVar4;
        }
        n9.v vVar5 = xVar.f43733a;
        n9.v vVarI = I(vVar, vVar5, vVar5, xVar2 != null ? xVar2.f43733a : null);
        if (eVar == null || (vVar2 = eVar.f43542b) == null) {
            vVar2 = vVar4;
        }
        n9.v vVarI2 = I(vVar2, vVar5, xVar.f43734b, xVar2 != null ? xVar2.f43734b : null);
        if (eVar != null && (vVar3 = eVar.f43543c) != null) {
            vVar4 = vVar3;
        }
        return new n9.e(vVarI, vVarI2, I(vVar4, vVar5, xVar.f43735c, xVar2 != null ? xVar2.f43735c : null), xVar, xVar2);
    }

    public static n9.v I(n9.v vVar, n9.v vVar2, n9.v vVar3, n9.v vVar4) {
        if (vVar4 == null) {
            return vVar3;
        }
        if (vVar instanceof n9.t) {
            return (((vVar2 instanceof n9.u) && (vVar4 instanceof n9.u)) || (vVar4 instanceof n9.s)) ? vVar4 : vVar;
        }
        return vVar4;
    }

    private final void M() {
    }

    private final void S() {
    }

    private final void T() {
    }

    @Override // l1.d
    public void A(Object obj, fz.e eVar) {
        ((w) this.f44826b).a(7);
        e0 e0Var = (e0) this.f44827c;
        e0Var.a(eVar);
        e0Var.a(obj);
    }

    @Override // ki.a
    public void B() {
        switch (this.f44825a) {
            case 1:
                aj.f fVar = (aj.f) this.f44826b;
                lc.d dVar = fVar.m;
                if (dVar != null) {
                    kotlin.jvm.internal.m.c(dVar);
                    if (dVar.isShowing()) {
                        lc.d dVar2 = fVar.m;
                        kotlin.jvm.internal.m.c(dVar2);
                        dVar2.dismiss();
                    }
                }
                break;
        }
    }

    @Override // ce.y
    public ImageHeaderParser$ImageType C() throws Throwable {
        switch (this.f44825a) {
            case 4:
                return gb.r.x((List) this.f44827c, pe.b.c((ByteBuffer) this.f44826b));
            default:
                List list = (List) this.f44827c;
                com.bumptech.glide.load.data.h hVar = (com.bumptech.glide.load.data.h) this.f44828d;
                m0.n nVar = (m0.n) this.f44826b;
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    td.f fVar = (td.f) list.get(i11);
                    a0 a0Var = null;
                    try {
                        a0 a0Var2 = new a0(new FileInputStream(hVar.e().getFileDescriptor()), nVar);
                        try {
                            ImageHeaderParser$ImageType imageHeaderParser$ImageTypeE = fVar.e(a0Var2);
                            a0Var2.release();
                            hVar.e();
                            if (imageHeaderParser$ImageTypeE != ImageHeaderParser$ImageType.UNKNOWN) {
                                return imageHeaderParser$ImageTypeE;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            a0Var = a0Var2;
                            if (a0Var != null) {
                                a0Var.release();
                            }
                            hVar.e();
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    public void F(p0 p0Var) {
        lw.k kVar;
        int length = 0;
        while (true) {
            Object[][] objArr = (Object[][]) this.f44828d;
            int length2 = objArr.length;
            kVar = q0.f40429c;
            if (length >= length2) {
                length = -1;
                break;
            } else if (kVar.equals(objArr[length][0])) {
                break;
            } else {
                length++;
            }
        }
        if (length == -1) {
            Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, ((Object[][]) this.f44828d).length + 1, 2);
            Object[][] objArr3 = (Object[][]) this.f44828d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f44828d = objArr2;
            length = objArr2.length - 1;
        }
        ((Object[][]) this.f44828d)[length] = new Object[]{kVar, p0Var};
    }

    public fb.x G() {
        fb.x xVar = new fb.x((UUID) this.f44826b, (p) this.f44827c, (Set) this.f44828d);
        fb.f fVar = ((p) this.f44827c).f44857j;
        boolean z11 = fVar.b() || fVar.f27069e || fVar.f27067c || fVar.f27068d;
        p pVar = (p) this.f44827c;
        if (pVar.f44863q) {
            if (z11) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            if (pVar.f44854g > 0) {
                throw new IllegalArgumentException("Expedited jobs cannot be delayed");
            }
        }
        if (pVar.f44870x == null) {
            List listW0 = oz.q.W0(pVar.f44850c, new String[]{"."}, 0, 6);
            String strG1 = listW0.size() == 1 ? (String) listW0.get(0) : (String) ry.m.z0(listW0);
            if (strG1.length() > 127) {
                strG1 = oz.q.g1(127, strG1);
            }
            pVar.f44870x = strG1;
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        kotlin.jvm.internal.m.e(uuidRandomUUID, "randomUUID()");
        this.f44826b = uuidRandomUUID;
        String string = uuidRandomUUID.toString();
        kotlin.jvm.internal.m.e(string, "id.toString()");
        p other = (p) this.f44827c;
        kotlin.jvm.internal.m.f(other, "other");
        this.f44827c = new p(string, other.f44849b, other.f44850c, other.f44851d, new fb.j(other.f44852e), new fb.j(other.f44853f), other.f44854g, other.f44855h, other.f44856i, new fb.f(other.f44857j), other.f44858k, other.f44859l, other.m, other.f44860n, other.f44861o, other.f44862p, other.f44863q, other.f44864r, other.f44865s, other.f44867u, other.f44868v, other.f44869w, other.f44870x, 524288);
        return xVar;
    }

    public k0 H() {
        return new k0((List) this.f44826b, (lw.b) this.f44827c, (Object[][]) this.f44828d);
    }

    public void J(x7.o oVar, b10.b bVar) {
        x7.e0[] e0VarArr = (x7.e0[]) this.f44827c;
        for (int i11 = 0; i11 < e0VarArr.length; i11++) {
            bVar.d();
            bVar.j();
            x7.e0 e0VarV = oVar.v(bVar.f3848c, 3);
            y6.p pVar = (y6.p) ((List) this.f44826b).get(i11);
            String str = pVar.f57291n;
            b7.a.c("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            String str2 = pVar.f57279a;
            if (str2 == null) {
                bVar.j();
                str2 = (String) bVar.f3850e;
            }
            y6.o oVar2 = new y6.o();
            oVar2.f57253a = str2;
            oVar2.f57264l = d0.o("video/mp2t");
            oVar2.m = d0.o(str);
            oVar2.f57257e = pVar.f57283e;
            oVar2.f57256d = pVar.f57282d;
            oVar2.J = pVar.K;
            oVar2.f57267p = pVar.f57294q;
            nv.p.D(oVar2, e0VarV);
            e0VarArr[i11] = e0VarV;
        }
    }

    public void K(fz.c cVar) {
        Object value;
        n9.e eVar;
        i1 i1Var = (i1) this.f44827c;
        do {
            value = i1Var.getValue();
            n9.e eVar2 = (n9.e) value;
            eVar = (n9.e) cVar.invoke(eVar2);
            if (kotlin.jvm.internal.m.a(eVar2, eVar)) {
                return;
            }
        } while (!i1Var.j(value, eVar));
        if (eVar != null) {
            Iterator it = ((CopyOnWriteArrayList) this.f44826b).iterator();
            while (it.hasNext()) {
                ((fz.c) it.next()).invoke(eVar);
            }
        }
    }

    public boolean L(int i11, d4.g gVar, j4.f fVar) {
        e4.b bVar = (e4.b) this.f44827c;
        d4.f[] fVarArr = gVar.U;
        int[] iArr = gVar.f23153t;
        bVar.f24778a = fVarArr[0];
        bVar.f24779b = fVarArr[1];
        bVar.f24780c = gVar.r();
        bVar.f24781d = gVar.l();
        bVar.f24786i = false;
        bVar.f24787j = i11;
        d4.f fVar2 = bVar.f24778a;
        d4.f fVar3 = d4.f.MATCH_CONSTRAINT;
        boolean z11 = fVar2 == fVar3;
        boolean z12 = bVar.f24779b == fVar3;
        boolean z13 = z11 && gVar.Y > CropImageView.DEFAULT_ASPECT_RATIO;
        boolean z14 = z12 && gVar.Y > CropImageView.DEFAULT_ASPECT_RATIO;
        if (z13 && iArr[0] == 4) {
            bVar.f24778a = d4.f.FIXED;
        }
        if (z14 && iArr[1] == 4) {
            bVar.f24779b = d4.f.FIXED;
        }
        fVar.b(gVar, bVar);
        gVar.P(bVar.f24782e);
        gVar.M(bVar.f24783f);
        gVar.E = bVar.f24785h;
        gVar.J(bVar.f24784g);
        bVar.f24787j = 0;
        return bVar.f24786i;
    }

    public void N(l1.a aVar, t1.j jVar) {
        Exception exc;
        int i11;
        w wVar = (w) this.f44826b;
        int i12 = wVar.f56783b;
        e0 e0Var = (e0) this.f44827c;
        e0 e0Var2 = new e0();
        int i13 = 0;
        int i14 = 0;
        while (i13 < i12) {
            int i15 = i13 + 1;
            try {
                try {
                    switch (wVar.c(i13)) {
                        case 0:
                            aVar.q();
                            i13 = i15;
                            break;
                        case 1:
                            int i16 = i14 + 1;
                            aVar.d(e0Var.f(i14));
                            i14 = i16;
                            i13 = i15;
                            break;
                        case 2:
                            int i17 = i13 + 2;
                            i13 += 3;
                            aVar.l(wVar.c(i15), wVar.c(i17));
                            break;
                        case 3:
                            int i18 = i13 + 2;
                            try {
                                int i19 = i13 + 3;
                                try {
                                    i13 += 4;
                                    aVar.k(wVar.c(i15), wVar.c(i18), wVar.c(i19));
                                } catch (Exception e8) {
                                    exc = e8;
                                    i13 = i19;
                                    throw new l1.l(e0Var, e0Var2, wVar, i13 - 1, exc);
                                }
                            } catch (Exception e10) {
                                exc = e10;
                                i13 = i18;
                            }
                            break;
                        case 4:
                            aVar.c();
                            i13 = i15;
                            break;
                        case 5:
                            i13 += 2;
                            i11 = i14 + 1;
                            aVar.b(wVar.c(i15), e0Var.f(i14));
                            i14 = i11;
                            break;
                        case 6:
                            i13 += 2;
                            try {
                                i11 = i14 + 1;
                                aVar.v(wVar.c(i15), e0Var.f(i14));
                                i14 = i11;
                            } catch (Exception e11) {
                                exc = e11;
                                throw new l1.l(e0Var, e0Var2, wVar, i13 - 1, exc);
                            }
                            break;
                        case 7:
                            int i21 = i14 + 1;
                            Object objF = e0Var.f(i14);
                            kotlin.jvm.internal.m.d(objF, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
                            c0.d(2, objF);
                            i14 += 2;
                            aVar.A(e0Var.f(i21), (fz.e) objF);
                            i13 = i15;
                            break;
                        case 8:
                            Object obj = aVar.f39228b;
                            if (obj instanceof l1.j) {
                                l1.j jVar2 = (l1.j) obj;
                                if (jVar.f51998f.k(jVar2)) {
                                    jVar2.b();
                                }
                            }
                            e0Var2.a(obj);
                            aVar.h();
                            i13 = i15;
                            break;
                        default:
                            i13 = i15;
                            break;
                    }
                } catch (Exception e12) {
                    exc = e12;
                    i13 = i15;
                }
            } catch (Throwable th2) {
                aVar.w();
                throw th2;
            }
        }
        if (i14 != e0Var.f56687b) {
            l1.u.a("Applier operation size mismatch");
        }
        e0Var.d();
        wVar.f56783b = 0;
        aVar.w();
    }

    public Object O(b20.a aVar, kotlin.jvm.internal.e eVar, b20.a scopeQualifier, oi.c cVar) {
        String value;
        kotlin.jvm.internal.m.f(scopeQualifier, "scopeQualifier");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f20.a.a(eVar));
        sb2.append(':');
        if (aVar == null || (value = aVar.getValue()) == null) {
            value = BuildConfig.VERSION_NAME;
        }
        sb2.append(value);
        sb2.append(':');
        sb2.append(scopeQualifier);
        v10.b bVar = (v10.b) ((ConcurrentHashMap) this.f44827c).get(sb2.toString());
        Object objB = bVar != null ? bVar.b(cVar) : null;
        if (objB == null) {
            return null;
        }
        return objB;
    }

    public void P(x sourceLoadStates, x xVar) {
        kotlin.jvm.internal.m.f(sourceLoadStates, "sourceLoadStates");
        K(new a0.j(this, sourceLoadStates, xVar, 13));
    }

    public void Q(List list) {
        Preconditions.e("addrs is empty", !list.isEmpty());
        this.f44826b = Collections.unmodifiableList(new ArrayList(list));
    }

    public void R(d4.h hVar, int i11, int i12, int i13) {
        hVar.getClass();
        int i14 = hVar.f23123d0;
        int i15 = hVar.f23125e0;
        hVar.f23123d0 = 0;
        hVar.f23125e0 = 0;
        hVar.P(i12);
        hVar.M(i13);
        if (i14 < 0) {
            hVar.f23123d0 = 0;
        } else {
            hVar.f23123d0 = i14;
        }
        if (i15 < 0) {
            hVar.f23125e0 = 0;
        } else {
            hVar.f23125e0 = i15;
        }
        d4.h hVar2 = (d4.h) this.f44828d;
        hVar2.f23164x0 = i11;
        hVar2.V();
    }

    public void U(d4.h hVar) {
        ArrayList arrayList = (ArrayList) this.f44826b;
        arrayList.clear();
        int size = hVar.f23161u0.size();
        for (int i11 = 0; i11 < size; i11++) {
            d4.g gVar = (d4.g) hVar.f23161u0.get(i11);
            d4.f[] fVarArr = gVar.U;
            d4.f fVar = fVarArr[0];
            d4.f fVar2 = d4.f.MATCH_CONSTRAINT;
            if (fVar == fVar2 || fVarArr[1] == fVar2) {
                arrayList.add(gVar);
            }
        }
        hVar.f23163w0.f24791b = true;
    }

    @Override // th.c, th.b
    public void a() {
        ((SpeakTryAdapter) this.f44826b).g((View) this.f44827c, (String) this.f44828d);
    }

    @Override // tx.c
    public void accept(Object obj) {
        int i11 = 4;
        int i12 = 0;
        switch (this.f44825a) {
            case 12:
                Long it = (Long) obj;
                View view = (View) this.f44828d;
                kotlin.jvm.internal.m.f(it, "it");
                hh.c0 c0Var = (hh.c0) this.f44826b;
                th.e eVar = c0Var.Q;
                String strF = xt.b.a().f();
                Long sentenceId = ((PdSentence) this.f44827c).getSentenceId();
                kotlin.jvm.internal.m.e(sentenceId, "getSentenceId(...)");
                long jLongValue = sentenceId.longValue();
                int[] iArr = bq.r.f4959a;
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                StringBuilder sbM = com.google.android.material.datepicker.d.m(jLongValue, "pod-", bq.m.g(cf.x.n().keyLanguage), "-s-");
                sbM.append(".mp3");
                String strM = defpackage.e.m(strF, sbM.toString());
                xx.f fVar = c0Var.W;
                if (fVar != null) {
                    ux.b.a(fVar);
                }
                eVar.h(strM);
                int i13 = 12;
                eVar.f52416c = new l(i13, c0Var, view);
                FlexboxLayout flexboxLayout = (FlexboxLayout) view.findViewById(R.id.flex_sentence);
                rx.b bVar = c0Var.f32213a0;
                if (bVar != null) {
                    bVar.dispose();
                }
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                dy.j jVar = ky.e.f38937b;
                xx.f fVarH = qx.h.d(50L, 50L, timeUnit, jVar).k(jVar).g(px.b.a()).h(new u(i13, c0Var, flexboxLayout), hh.p.f32276d);
                th.j.a(fVarH, c0Var.f36401t);
                c0Var.f32213a0 = fVarH;
                break;
            case 17:
                Boolean aBoolean = (Boolean) obj;
                ki.a aVar = (ki.a) this.f44826b;
                Context context = (Context) this.f44827c;
                kotlin.jvm.internal.m.f(aBoolean, "aBoolean");
                if (aBoolean.booleanValue()) {
                    aVar.m();
                } else {
                    aVar.B();
                    kotlin.jvm.internal.m.d(context, "null cannot be cast to non-null type android.app.Activity");
                    Activity activity = (Activity) context;
                    int i14 = 2;
                    if (activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                        lc.d dVar = new lc.d(context);
                        RxPermissions rxPermissions = (RxPermissions) this.f44828d;
                        lc.d.c(dVar, Integer.valueOf(R.string.to_choose_a_photo_please_allow_lingodeer_to_use_storage), null, 6);
                        lc.d.e(dVar, Integer.valueOf(R.string.retry), null, new ki.b(aVar, rxPermissions, context, i12), 2);
                        lc.d.d(dVar, new t0(11), 2);
                        dVar.show();
                    } else {
                        Snackbar snackbarH = Snackbar.h(activity.findViewById(android.R.id.content), R.string.to_choose_a_photo_please_allow_lingodeer_to_use_storage);
                        snackbarH.i(new bq.s(context, i14));
                        snackbarH.j();
                    }
                }
                break;
            case 18:
                Model_Sentence_010 model_Sentence_010 = (Model_Sentence_010) obj;
                FlexboxLayout flexboxLayout2 = (FlexboxLayout) this.f44828d;
                AbsDialogModelAdapter absDialogModelAdapter = (AbsDialogModelAdapter) this.f44827c;
                FlexboxLayout flexboxLayout3 = (FlexboxLayout) ((View) this.f44826b).findViewById(R.id.flex_sentence);
                int childCount = flexboxLayout3.getChildCount();
                for (int i15 = 1; i15 < childCount; i15++) {
                    View childAt = flexboxLayout3.getChildAt(i15);
                    ((TextView) childAt.findViewById(R.id.tv_middle)).setVisibility(4);
                    childAt.setTag(R.id.tag_is_invisiable, Boolean.TRUE);
                }
                for (Sentence sentence : model_Sentence_010.getOptionList()) {
                    View viewInflate = LayoutInflater.from(((BaseQuickAdapter) absDialogModelAdapter).mContext).inflate(R.layout.include_sentence_option_elem_dialog, (ViewGroup) flexboxLayout2, false);
                    kotlin.jvm.internal.m.d(viewInflate, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
                    CardView cardView = (CardView) viewInflate;
                    View viewFindViewById = cardView.findViewById(R.id.flex_container);
                    kotlin.jvm.internal.m.e(viewFindViewById, "findViewById(...)");
                    List<Word> sentWords = sentence.getSentWords();
                    kotlin.jvm.internal.m.e(sentWords, "getSentWords(...)");
                    AbsDialogModelAdapter.j(absDialogModelAdapter, cardView, sentWords);
                    flexboxLayout2.addView(cardView);
                    z.b(cardView, new g7(sentence, model_Sentence_010, absDialogModelAdapter, cardView, flexboxLayout2, flexboxLayout3, 9));
                    z.b((FlexboxLayout) viewFindViewById, new kp.c(cardView, 0));
                }
                AbsDialogModelAdapter.d(absDialogModelAdapter, flexboxLayout3);
                ef.e.B(flexboxLayout2);
                break;
            default:
                Long it2 = (Long) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                ImageView imageView = (ImageView) this.f44826b;
                imageView.setPivotX(imageView.getWidth() / 2.0f);
                imageView.setPivotY(imageView.getHeight() / 2.0f);
                imageView.postDelayed(new b2.c(i11, imageView, new l0(imageView, (kotlin.jvm.internal.v) this.f44827c, (qh.k0) this.f44828d, 14)), 0L);
                break;
        }
    }

    @Override // y4.c
    public Object acquire() {
        Object objAcquire = ((y4.d) this.f44828d).acquire();
        if (objAcquire == null) {
            objAcquire = ((qe.a) this.f44826b).b();
            if (Log.isLoggable("FactoryPools", 2)) {
                objAcquire.getClass().toString();
            }
        }
        if (objAcquire instanceof qe.b) {
            ((qe.b) objAcquire).a().f47723a = false;
        }
        return objAcquire;
    }

    @Override // l1.d
    public void b(int i11, Object obj) {
        w wVar = (w) this.f44826b;
        wVar.a(5);
        wVar.a(i11);
        ((e0) this.f44827c).a(obj);
    }

    @Override // y4.c
    public boolean c(Object obj) {
        if (obj instanceof qe.b) {
            ((qe.b) obj).a().f47723a = true;
        }
        ((qe.c) this.f44827c).j(obj);
        return ((y4.d) this.f44828d).c(obj);
    }

    @Override // l1.d
    public void d(Object obj) {
        ((w) this.f44826b).a(1);
        ((e0) this.f44827c).a(obj);
    }

    @Override // b5.g
    public Uri e() {
        return (Uri) this.f44826b;
    }

    @Override // u8.d
    public int f(long j11) {
        long[] jArr = (long[]) this.f44828d;
        int iA = f0.a(jArr, j11, false);
        if (iA < jArr.length) {
            return iA;
        }
        return -1;
    }

    @Override // fv.e
    public void g() {
        oo.t tVar = (oo.t) this.f44826b;
        if (tVar.f36398d == null) {
            return;
        }
        new File((String) this.f44827c).delete();
        lc.d dVar = tVar.S;
        if (dVar != null) {
            dVar.dismiss();
        }
        String string = tVar.getString(R.string.upload_success);
        kotlin.jvm.internal.m.e(string, "getString(...)");
        ff.h.C(string);
        no.s sVar = new no.s(tVar.Q);
        String uid = tVar.r().uid;
        kotlin.jvm.internal.m.e(uid, "uid");
        sVar.a(uid, "story/" + ((String) this.f44828d));
        Bundle bundle = tVar.U;
        if (bundle == null) {
            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(tVar), null, null, new ns.j(tVar, null, 6), 3);
        } else {
            tVar.T = bundle.getInt(INTENTS.EXTRA_INT);
            oo.t.x(tVar);
        }
    }

    @Override // b5.g
    public ClipDescription getDescription() {
        return (ClipDescription) this.f44827c;
    }

    @Override // l1.d
    public void h() {
        ((w) this.f44826b).a(8);
    }

    @Override // ce.y
    public int i() throws Throwable {
        switch (this.f44825a) {
            case 4:
                List list = (List) this.f44827c;
                ByteBuffer byteBufferC = pe.b.c((ByteBuffer) this.f44826b);
                m0.n nVar = (m0.n) this.f44828d;
                if (byteBufferC == null) {
                    return -1;
                }
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    try {
                        int iD = ((td.f) list.get(i11)).d(byteBufferC, nVar);
                        if (iD != -1) {
                            return iD;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return -1;
            default:
                List list2 = (List) this.f44827c;
                com.bumptech.glide.load.data.h hVar = (com.bumptech.glide.load.data.h) this.f44828d;
                m0.n nVar2 = (m0.n) this.f44826b;
                int size2 = list2.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    td.f fVar = (td.f) list2.get(i12);
                    a0 a0Var = null;
                    try {
                        a0 a0Var2 = new a0(new FileInputStream(hVar.e().getFileDescriptor()), nVar2);
                        try {
                            int iB = fVar.b(a0Var2, nVar2);
                            a0Var2.release();
                            hVar.e();
                            if (iB != -1) {
                                return iB;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            a0Var = a0Var2;
                            if (a0Var != null) {
                                a0Var.release();
                            }
                            hVar.e();
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                return -1;
        }
    }

    @Override // u8.d
    public long j(int i11) {
        long[] jArr = (long[]) this.f44828d;
        b7.a.d(i11 >= 0);
        b7.a.d(i11 < jArr.length);
        return jArr[i11];
    }

    @Override // l1.d
    public void k(int i11, int i12, int i13) {
        w wVar = (w) this.f44826b;
        wVar.a(3);
        wVar.a(i11);
        wVar.a(i12);
        wVar.a(i13);
    }

    @Override // l1.d
    public void l(int i11, int i12) {
        w wVar = (w) this.f44826b;
        wVar.a(2);
        wVar.a(i11);
        wVar.a(i12);
    }

    @Override // ki.a
    public void m() {
        switch (this.f44825a) {
            case 1:
                b7.c cVar = ((aj.f) this.f44826b).f740c;
                kotlin.jvm.internal.m.c(cVar);
                ImageView imageView = (ImageView) this.f44827c;
                kotlin.jvm.internal.m.c(imageView);
                cVar.f(imageView, (hd.d) this.f44828d);
                imageView.performClick();
                break;
            default:
                PdLearnSpeakAdapter pdLearnSpeakAdapter = (PdLearnSpeakAdapter) this.f44826b;
                pdLearnSpeakAdapter.h();
                WaveView waveView = (WaveView) this.f44827c;
                kotlin.jvm.internal.m.c(waveView);
                PdLearnSpeakAdapter.d(pdLearnSpeakAdapter, waveView);
                th.g gVar = pdLearnSpeakAdapter.f21645g;
                String filePath = (String) this.f44828d;
                gVar.getClass();
                kotlin.jvm.internal.m.f(filePath, "filePath");
                new Thread(new pb.b(10, gVar, filePath)).start();
                pdLearnSpeakAdapter.f21648j = new AtomicBoolean(false);
                break;
        }
    }

    @Override // b5.g
    public void n() {
    }

    @Override // b5.g
    public Uri o() {
        return (Uri) this.f44828d;
    }

    @Override // u8.d
    public List p(long j11) {
        List list = (List) this.f44826b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            long[] jArr = (long[]) this.f44827c;
            int i12 = i11 * 2;
            if (jArr[i12] <= j11 && j11 < jArr[i12 + 1]) {
                d9.c cVar = (d9.c) list.get(i11);
                a7.b bVar = cVar.f23307a;
                if (bVar.f417e == -3.4028235E38f) {
                    arrayList2.add(cVar);
                } else {
                    arrayList.add(bVar);
                }
            }
        }
        Collections.sort(arrayList2, new bq.h(4));
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            a7.a aVarA = ((d9.c) arrayList2.get(i13)).f23307a.a();
            aVarA.f392e = (-1) - i13;
            aVarA.f393f = 1;
            arrayList.add(aVarA.a());
        }
        return arrayList;
    }

    @Override // l1.d
    public void q() {
        ((w) this.f44826b).a(0);
    }

    @Override // fv.e
    public void r() {
        new File((String) this.f44827c).delete();
        oo.t tVar = (oo.t) this.f44826b;
        lc.d dVar = tVar.S;
        if (dVar != null) {
            dVar.dismiss();
        }
        if (tVar.isDetached()) {
            return;
        }
        try {
            String string = tVar.getString(R.string.upload_failed);
            kotlin.jvm.internal.m.e(string, "getString(...)");
            ff.h.C(string);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    @Override // u8.d
    public int s() {
        return ((long[]) this.f44828d).length;
    }

    @Override // ce.y
    public Bitmap t(BitmapFactory.Options options) {
        switch (this.f44825a) {
            case 4:
                return ce.w.b(new pe.a(pe.b.c((ByteBuffer) this.f44826b)), options, this);
            default:
                return ce.w.a(((com.bumptech.glide.load.data.h) this.f44828d).e().getFileDescriptor(), options, this);
        }
    }

    public String toString() {
        switch (this.f44825a) {
            case 16:
                String str = (String) this.f44828d;
                String str2 = (String) this.f44827c;
                StringBuilder sb2 = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.f44826b;
                if (uri != null) {
                    sb2.append(" uri=");
                    sb2.append(String.valueOf(uri));
                }
                if (str2 != null) {
                    sb2.append(" action=");
                    sb2.append(str2);
                }
                if (str != null) {
                    sb2.append(" mimetype=");
                    sb2.append(str);
                }
                sb2.append(" }");
                String string = sb2.toString();
                kotlin.jvm.internal.m.e(string, "toString(...)");
                return string;
            default:
                return super.toString();
        }
    }

    @Override // ce.y
    public boolean u() throws Throwable {
        switch (this.f44825a) {
            case 4:
                List list = (List) this.f44827c;
                ByteBuffer byteBufferC = pe.b.c((ByteBuffer) this.f44826b);
                m0.n nVar = (m0.n) this.f44828d;
                if (byteBufferC == null) {
                    return false;
                }
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    try {
                        boolean zC = ((td.f) list.get(i11)).c(byteBufferC, nVar);
                        if (zC) {
                            return true;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return false;
            default:
                List list2 = (List) this.f44827c;
                com.bumptech.glide.load.data.h hVar = (com.bumptech.glide.load.data.h) this.f44828d;
                m0.n nVar2 = (m0.n) this.f44826b;
                int size2 = list2.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    td.f fVar = (td.f) list2.get(i12);
                    a0 a0Var = null;
                    try {
                        a0 a0Var2 = new a0(new FileInputStream(hVar.e().getFileDescriptor()), nVar2);
                        try {
                            boolean zF = fVar.f(a0Var2, nVar2);
                            a0Var2.release();
                            hVar.e();
                            if (zF) {
                                return true;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            a0Var = a0Var2;
                            if (a0Var != null) {
                                a0Var.release();
                            }
                            hVar.e();
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                return false;
        }
    }

    @Override // l1.d
    public void v(int i11, Object obj) {
        w wVar = (w) this.f44826b;
        wVar.a(6);
        wVar.a(i11);
        ((e0) this.f44827c).a(obj);
    }

    @Override // l1.d
    public Object x() {
        return this.f44828d;
    }

    @Override // b5.g
    public Object y() {
        return null;
    }

    @Override // ce.y
    public void z() {
        int i11 = this.f44825a;
    }

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, int i11) {
        this.f44825a = i11;
        this.f44826b = obj;
        this.f44827c = obj2;
        this.f44828d = obj3;
    }

    @Override // jp.m0
    public void D(ConstraintLayout constraintLayout) {
        int i11;
        int i12;
        z2 z2Var = (z2) this.f44827c;
        View viewFindViewById = constraintLayout.findViewById(R.id.txt_answer_txt_2);
        kotlin.jvm.internal.m.e(viewFindViewById, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((String) this.f44826b);
        int i13 = 0;
        if (spannableStringBuilder.length() > 0) {
            int[] iArr = bq.r.f4959a;
            if (!bq.m.F() && z2Var.A()) {
                String upperCase = String.valueOf(spannableStringBuilder.charAt(0)).toUpperCase(bq.m.p());
                kotlin.jvm.internal.m.e(upperCase, "toUpperCase(...)");
                spannableStringBuilder.replace(0, 1, (CharSequence) upperCase);
            }
        }
        ArrayList arrayList = (ArrayList) this.f44828d;
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayList.get(i14);
            int i15 = i14 + 1;
            kotlin.jvm.internal.m.e(obj, "next(...)");
            int iIntValue = ((Number) obj).intValue();
            try {
                Context context = z2Var.f47883c;
                kotlin.jvm.internal.m.f(context, "context");
                spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getColor(R.color.color_wrong_high_light)), iIntValue, iIntValue + 1, 33);
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            i14 = i15;
        }
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (cf.x.n().keyLanguage == 21) {
            String sentence = z2Var.u().getSentence();
            kotlin.jvm.internal.m.e(sentence, "getSentence(...)");
            int i16 = 0;
            int i17 = 0;
            while (i13 < sentence.length()) {
                char cCharAt = sentence.charAt(i13);
                int i18 = i16 + 1;
                int i19 = i16 + i17;
                String str = sentence;
                if (i19 < spannableStringBuilder.length()) {
                    String strValueOf = String.valueOf(spannableStringBuilder.charAt(i19));
                    int[] iArr2 = bq.r.f4959a;
                    String lowerCase = strValueOf.toLowerCase(bq.m.p());
                    int i21 = i16;
                    String str2 = ADSb.fYcBSPsoBKK;
                    kotlin.jvm.internal.m.e(lowerCase, str2);
                    i11 = i13;
                    Locale localeP = bq.m.p();
                    i12 = i17;
                    String strValueOf2 = String.valueOf(cCharAt);
                    kotlin.jvm.internal.m.d(strValueOf2, "null cannot be cast to non-null type java.lang.String");
                    String lowerCase2 = strValueOf2.toLowerCase(localeP);
                    kotlin.jvm.internal.m.e(lowerCase2, str2);
                    if (!lowerCase.equals(lowerCase2)) {
                        String str3 = String.valueOf(cCharAt);
                        kotlin.jvm.internal.m.f(str3, "str");
                        if (Pattern.matches("\\p{Punct}", str3) || str3.equals("...") || str3.equals(" ") || str3.equals("～")) {
                            spannableStringBuilder.insert(i19, (CharSequence) String.valueOf(cCharAt));
                        } else {
                            if (strValueOf.equals(" ")) {
                                i17 = i12 + 1;
                                int i22 = i21 + i17;
                                if (i22 < spannableStringBuilder.length() && hh.p0.m(String.valueOf(spannableStringBuilder.charAt(i22)), "toUpperCase(...)").equals(String.valueOf(cCharAt))) {
                                    spannableStringBuilder.replace(i22, i22 + 1, (CharSequence) String.valueOf(cCharAt));
                                }
                            }
                            i13 = i11 + 1;
                            sentence = str;
                            i16 = i18;
                        }
                    } else if (hh.p0.m(strValueOf, "toUpperCase(...)").equals(String.valueOf(cCharAt))) {
                        spannableStringBuilder.replace(i19, i19 + 1, (CharSequence) String.valueOf(cCharAt));
                    }
                } else {
                    i11 = i13;
                    i12 = i17;
                    if (i19 == spannableStringBuilder.length()) {
                        String str4 = String.valueOf(cCharAt);
                        kotlin.jvm.internal.m.f(str4, "str");
                        if (Pattern.matches("\\p{Punct}", str4) || str4.equals("...") || str4.equals(" ") || str4.equals("～")) {
                            spannableStringBuilder.append((CharSequence) String.valueOf(cCharAt));
                        }
                    }
                }
                i17 = i12;
                i13 = i11 + 1;
                sentence = str;
                i16 = i18;
            }
        }
        textView.setText(spannableStringBuilder);
    }

    public m(gi.h hVar, String lessonStr) {
        this.f44825a = 10;
        kotlin.jvm.internal.m.f(lessonStr, "lessonStr");
        this.f44826b = hVar;
        this.f44827c = new ArrayList();
        this.f44828d = new ArrayList();
    }

    public m(WorkDatabase_Impl workDatabase_Impl) {
        this.f44825a = 0;
        this.f44826b = workDatabase_Impl;
        new b(workDatabase_Impl, 4);
        this.f44827c = new h(workDatabase_Impl, 2);
        this.f44828d = new h(workDatabase_Impl, 3);
    }

    public m(ArrayList arrayList) {
        this.f44825a = 6;
        this.f44826b = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f44827c = new long[arrayList.size() * 2];
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            d9.c cVar = (d9.c) arrayList.get(i11);
            int i12 = i11 * 2;
            long[] jArr = (long[]) this.f44827c;
            jArr[i12] = cVar.f23308b;
            jArr[i12 + 1] = cVar.f23309c;
        }
        long[] jArr2 = (long[]) this.f44827c;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f44828d = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    public m(a9.i iVar) {
        this.f44825a = 3;
        this.f44826b = iVar;
        this.f44827c = new ConcurrentHashMap();
        this.f44828d = new ConcurrentHashMap();
    }

    public m(List list) {
        this.f44825a = 8;
        this.f44826b = list;
        this.f44827c = new x7.e0[list.size()];
        this.f44828d = new b7.c(new com.google.firebase.database.android.d(this, 10));
    }

    public m(View view) {
        this.f44825a = 25;
        this.f44826b = view;
        this.f44827c = com.bumptech.glide.d.u(qy.j.NONE, new a0.c0(this, 24));
        this.f44828d = new tp.g(view);
    }

    public m(Class cls) {
        this.f44825a = 9;
        UUID uuidRandomUUID = UUID.randomUUID();
        kotlin.jvm.internal.m.e(uuidRandomUUID, "randomUUID()");
        this.f44826b = uuidRandomUUID;
        String string = ((UUID) this.f44826b).toString();
        kotlin.jvm.internal.m.e(string, "id.toString()");
        this.f44827c = new p(string, (fb.e0) null, cls.getName(), (String) null, (fb.j) null, (fb.j) null, 0L, 0L, 0L, (fb.f) null, 0, (fb.a) null, 0L, 0L, 0L, 0L, false, (fb.c0) null, 0, 0L, 0, 0, (String) null, 16777210);
        String[] strArr = {cls.getName()};
        LinkedHashSet linkedHashSet = new LinkedHashSet(ry.x.W(1));
        ry.l.h0(strArr, linkedHashSet);
        this.f44828d = linkedHashSet;
    }

    public m(Context context, LocationManager locationManager) {
        this.f44825a = 19;
        this.f44828d = new j0();
        this.f44826b = context;
        this.f44827c = locationManager;
    }

    public m(d4.h hVar) {
        this.f44825a = 7;
        this.f44826b = new ArrayList();
        this.f44827c = new e4.b();
        this.f44828d = hVar;
    }

    public m(y4.d dVar, qe.a aVar, qe.c cVar) {
        this.f44825a = 27;
        this.f44828d = dVar;
        this.f44826b = aVar;
        this.f44827c = cVar;
    }

    public m(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, m0.n nVar) {
        this.f44825a = 5;
        pe.f.c(nVar, "Argument must not be null");
        this.f44826b = nVar;
        pe.f.c(arrayList, "Argument must not be null");
        this.f44827c = arrayList;
        this.f44828d = new com.bumptech.glide.load.data.h(parcelFileDescriptor);
    }

    public m(Object obj) {
        this.f44825a = 20;
        this.f44826b = new w();
        this.f44827c = new e0();
        this.f44828d = obj;
    }

    public m(int i11) {
        this.f44825a = i11;
        switch (i11) {
            case 23:
                long[] jArr = r0.f56756a;
                this.f44826b = new i0();
                break;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                this.f44826b = new CopyOnWriteArrayList();
                i1 i1VarC = x0.c(null);
                this.f44827c = i1VarC;
                this.f44828d = new uz.r0(i1VarC);
                break;
            default:
                this.f44826b = new p2(8);
                break;
        }
    }

    public m(AudioTrack audioTrack, h7.f fVar) {
        this.f44825a = 11;
        this.f44826b = audioTrack;
        this.f44827c = fVar;
        this.f44828d = new AudioRouting.OnRoutingChangedListener() { // from class: h7.s
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                AudioDeviceInfo routedDevice;
                ob.m mVar = this.f31950a;
                if (((s) mVar.f44828d) == null || (routedDevice = audioRouting.getRoutedDevice()) == null) {
                    return;
                }
                ((f) mVar.f44827c).b(routedDevice);
            }
        };
        audioTrack.addOnRoutingChangedListener((h7.s) this.f44828d, new Handler(Looper.myLooper()));
    }
}
