package a0;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import bp.i4;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader$EndOfFileException;
import com.chad.library.adapter.base.BaseViewHolder;
import com.google.android.gms.internal.play_billing.zzbt;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.api.Service;
import com.lingo.fluent.ui.base.PdGrammarActivity;
import com.lingo.lingoskill.japanskill.ui.syllable.SyllableIntroductionActivity;
import com.lingo.lingoskill.object.ARChar;
import com.lingo.lingoskill.object.ReviewNew;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import hj.j4;
import hj.r3;
import hj.x3;
import io.reactivex.exceptions.CompositeException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class b2 implements yw.c, tx.c, ce.j, th.c, i.b, uw.c, uw.p, th.b, q.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f27b;

    public /* synthetic */ b2(int i11) {
        this.f26a = i11;
    }

    @Override // th.c, th.b
    public void a() {
        switch (this.f26a) {
            case 5:
                android.support.v4.media.session.a.H(((ImageView) this.f27b).getBackground());
                break;
            default:
                ta.a aVar = ((jp.p0) this.f27b).f36400f;
                kotlin.jvm.internal.m.c(aVar);
                android.support.v4.media.session.a.H(((x3) aVar).f33576i.f32664c.getBackground());
                break;
        }
    }

    @Override // tx.c
    public void accept(Object obj) {
        switch (this.f26a) {
            case 2:
                i4 i4Var = (i4) this.f27b;
                String string = i4Var.getString(R.string.success);
                kotlin.jvm.internal.m.e(string, "getString(...)");
                ff.h.C(string);
                ep.f fVar = (ep.f) i4Var.N;
                if (fVar != null) {
                    fVar.a(true);
                    return;
                }
                return;
            case 11:
                Long it = (Long) obj;
                kotlin.jvm.internal.m.f(it, "it");
                qy.q qVar = fv.b.f28186a;
                fi.i iVar = (fi.i) this.f27b;
                ARChar aRChar = iVar.M;
                if (aRChar == null) {
                    kotlin.jvm.internal.m.n("curChar");
                    throw null;
                }
                String strD = fv.b.d(aRChar.getAudioName() + ".mp3");
                gi.h hVar = iVar.f27312e;
                ta.a aVar = iVar.f45600c;
                kotlin.jvm.internal.m.c(aVar);
                hVar.a((ImageView) ((hj.h1) aVar).f32645b.f32408d, strD);
                ta.a aVar2 = iVar.f45600c;
                kotlin.jvm.internal.m.c(aVar2);
                z4.w0 w0VarB = z4.s0.b(((hj.h1) aVar2).f32648e);
                ta.a aVar3 = iVar.f45600c;
                kotlin.jvm.internal.m.c(aVar3);
                w0VarB.l(-((hj.h1) aVar3).f32648e.getHeight());
                w0VarB.e(300L);
                w0VarB.i();
                ta.a aVar4 = iVar.f45600c;
                kotlin.jvm.internal.m.c(aVar4);
                z4.w0 w0VarB2 = z4.s0.b(((hj.h1) aVar4).f32649f);
                ta.a aVar5 = iVar.f45600c;
                kotlin.jvm.internal.m.c(aVar5);
                w0VarB2.l(-((hj.h1) aVar5).f32648e.getHeight());
                w0VarB2.e(300L);
                w0VarB2.i();
                bq.z.b(iVar.d(), new fi.e(iVar, 3));
                return;
            case 14:
                Throwable it2 = (Throwable) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                uz.i1 i1Var = ((gp.l1) this.f27b).Z;
                i1Var.getClass();
                i1Var.l(null, BuildConfig.VERSION_NAME);
                return;
            case 16:
                List it3 = (List) obj;
                kotlin.jvm.internal.m.f(it3, "it");
                PdGrammarActivity pdGrammarActivity = (PdGrammarActivity) this.f27b;
                pdGrammarActivity.T.clear();
                ArrayList arrayList = pdGrammarActivity.T;
                arrayList.addAll(it3);
                ih.b bVar = pdGrammarActivity.R;
                if (bVar == null) {
                    kotlin.jvm.internal.m.n("favAdapter");
                    throw null;
                }
                bVar.notifyDataSetChanged();
                if (arrayList.isEmpty()) {
                    ((ConstraintLayout) ((hj.j0) pdGrammarActivity.j()).f32740d.f32524c).setVisibility(0);
                    ((TextView) ((hj.j0) pdGrammarActivity.j()).f32740d.f32525d).setVisibility(4);
                    ((hj.j0) pdGrammarActivity.j()).f32743g.setText("0/0");
                    return;
                }
                ((ConstraintLayout) ((hj.j0) pdGrammarActivity.j()).f32740d.f32524c).setVisibility(8);
                ((hj.j0) pdGrammarActivity.j()).f32743g.setText((((hj.j0) pdGrammarActivity.j()).f32746j.getCurrentItem() + 1) + "/" + arrayList.size());
                return;
            case 17:
                Long it4 = (Long) obj;
                kotlin.jvm.internal.m.f(it4, "it");
                ta.a aVar6 = ((hh.j0) this.f27b).f36400f;
                kotlin.jvm.internal.m.c(aVar6);
                ((j4) aVar6).f32776n.performClick();
                return;
            case 18:
                Long it5 = (Long) obj;
                kotlin.jvm.internal.m.f(it5, "it");
                View view = (View) this.f27b;
                view.setVisibility(4);
                view.setTranslationX(CropImageView.DEFAULT_ASPECT_RATIO);
                view.setTranslationY(CropImageView.DEFAULT_ASPECT_RATIO);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                return;
            case 20:
                ((ReviewNew) this.f27b).getCwsId();
                return;
            case 22:
                Long it6 = (Long) obj;
                kotlin.jvm.internal.m.f(it6, "it");
                ta.a aVar7 = ((jp.i) this.f27b).f47886f;
                kotlin.jvm.internal.m.c(aVar7);
                ((hj.a) aVar7).f32322e.performClick();
                return;
            case 23:
                Long it7 = (Long) obj;
                kotlin.jvm.internal.m.f(it7, "it");
                jp.z zVar = (jp.z) this.f27b;
                th.e eVar = zVar.O;
                if (eVar == null) {
                    kotlin.jvm.internal.m.n("exoAudioPlayer");
                    throw null;
                }
                if (eVar.d() <= 0 || zVar.R) {
                    return;
                }
                ta.a aVar8 = zVar.f36400f;
                kotlin.jvm.internal.m.c(aVar8);
                AppCompatSeekBar appCompatSeekBar = ((r3) aVar8).f33217f;
                th.e eVar2 = zVar.O;
                if (eVar2 == null) {
                    kotlin.jvm.internal.m.n("exoAudioPlayer");
                    throw null;
                }
                appCompatSeekBar.setMax((int) eVar2.d());
                ta.a aVar9 = zVar.f36400f;
                kotlin.jvm.internal.m.c(aVar9);
                AppCompatSeekBar appCompatSeekBar2 = ((r3) aVar9).f33217f;
                th.e eVar3 = zVar.O;
                if (eVar3 == null) {
                    kotlin.jvm.internal.m.n("exoAudioPlayer");
                    throw null;
                }
                appCompatSeekBar2.setProgress((int) eVar3.c());
                ta.a aVar10 = zVar.f36400f;
                kotlin.jvm.internal.m.c(aVar10);
                TextView textView = ((r3) aVar10).f33221j;
                Context contextRequireContext = zVar.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                ta.a aVar11 = zVar.f36400f;
                kotlin.jvm.internal.m.c(aVar11);
                textView.setText(jp.z.y(contextRequireContext, ((r3) aVar11).f33217f.getMax()));
                ta.a aVar12 = zVar.f36400f;
                kotlin.jvm.internal.m.c(aVar12);
                TextView textView2 = ((r3) aVar12).f33219h;
                Context contextRequireContext2 = zVar.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                ta.a aVar13 = zVar.f36400f;
                kotlin.jvm.internal.m.c(aVar13);
                textView2.setText(jp.z.y(contextRequireContext2, ((r3) aVar13).f33217f.getProgress()));
                return;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                SyllableIntroductionActivity.u((SyllableIntroductionActivity) this.f27b);
                return;
            default:
                ((BaseViewHolder) this.f27b).setText(R.id.tv_lesson_duration, (String) obj);
                return;
        }
    }

    @Override // yw.c
    public Object apply(Object obj) {
        switch (this.f26a) {
            case 1:
                List list = (List) obj;
                Collections.sort(list, (com.google.firebase.inappmessaging.internal.o) this.f27b);
                return list;
            default:
                return ((tw.c) ((fx.h) this.f27b).f28244c).apply(new Object[]{obj});
        }
    }

    @Override // uw.c, uw.p
    public void b(ww.b bVar) {
        switch (this.f26a) {
            case 9:
                ((uw.c) this.f27b).b(bVar);
                break;
            default:
                ((uw.p) this.f27b).b(bVar);
                break;
        }
    }

    public void c(g2.p0 p0Var) {
        ((xq.c) this.f27b).x().q(p0Var);
    }

    @Override // q.u
    public void d(q.l lVar, boolean z11) {
        l.z zVar;
        androidx.appcompat.app.b bVar = (androidx.appcompat.app.b) this.f27b;
        q.l lVarK = lVar.k();
        int i11 = 0;
        boolean z12 = lVarK != lVar;
        if (z12) {
            lVar = lVarK;
        }
        l.z[] zVarArr = bVar.f814n0;
        int length = zVarArr != null ? zVarArr.length : 0;
        while (true) {
            if (i11 < length) {
                zVar = zVarArr[i11];
                if (zVar != null && zVar.f39081h == lVar) {
                    break;
                } else {
                    i11++;
                }
            } else {
                zVar = null;
                break;
            }
        }
        if (zVar != null) {
            if (!z12) {
                bVar.t(zVar, z11);
            } else {
                bVar.r(zVar.f39074a, zVar, lVarK);
                bVar.t(zVar, true);
            }
        }
    }

    public void e(float f5, float f11, float f12, float f13, int i11) {
        ((xq.c) this.f27b).x().m(f5, f11, f12, f13, i11);
    }

    @Override // i.b
    public void f(Object obj) {
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f27b;
        i.a aVar = (i.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.f33865b;
        int i11 = aVar.f33864a;
        Bundle extras = intent == null ? null : intent.getExtras();
        if (i11 != -1) {
            if (extras == null) {
                extras = new Bundle();
            }
            int i12 = zzc.f12272a;
            extras.putInt("INTERNAL_LOG_ERROR_REASON", zzie.ERROR_IN_ACTIVITY_RESULT.zza());
            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i11);
        }
        int i13 = zzc.e(intent, "ProxyBillingActivityV2").f7519a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.f7453f;
        if (resultReceiver != null) {
            resultReceiver.send(i13, extras);
        }
        proxyBillingActivityV2.finish();
    }

    public void g() {
        ((l1.w) this.f27b).getClass();
    }

    @Override // ce.j
    public int getUInt16() {
        return (getUInt8() << 8) | getUInt8();
    }

    @Override // ce.j
    public short getUInt8() throws IOException {
        int i11 = ((InputStream) this.f27b).read();
        if (i11 != -1) {
            return (short) i11;
        }
        throw new DefaultImageHeaderParser$Reader$EndOfFileException();
    }

    public List h(ij.d dVar) {
        String str;
        int i11;
        List listSingletonList;
        List list = (List) this.f27b;
        b7.w wVar = new b7.w((byte[]) dVar.f34423d);
        while (wVar.a() > 0) {
            int iW = wVar.w();
            int iW2 = wVar.f4040b + wVar.w();
            if (iW == 134) {
                ArrayList arrayList = new ArrayList();
                int iW3 = wVar.w() & 31;
                for (int i12 = 0; i12 < iW3; i12++) {
                    String strU = wVar.u(3, StandardCharsets.UTF_8);
                    int iW4 = wVar.w();
                    boolean z11 = (iW4 & 128) != 0;
                    if (z11) {
                        i11 = iW4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i11 = 1;
                    }
                    byte bW = (byte) wVar.w();
                    wVar.J(1);
                    if (z11) {
                        boolean z12 = (bW & 64) != 0;
                        byte[] bArr = b7.d.f3966a;
                        listSingletonList = Collections.singletonList(z12 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    y6.o oVar = new y6.o();
                    oVar.m = y6.d0.o(str);
                    oVar.f57256d = strU;
                    oVar.J = i11;
                    oVar.f57267p = listSingletonList;
                    arrayList.add(new y6.p(oVar));
                }
                list = arrayList;
            }
            wVar.I(iW2);
        }
        return list;
    }

    public void i(float f5, float f11, float f12, float f13) {
        xq.c cVar = (xq.c) this.f27b;
        g2.v vVarX = cVar.x();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (cVar.H() >> 32)) - (f12 + f5);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (cVar.H() & 4294967295L)) - (f13 + f11))) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32);
        if (!(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) >= CropImageView.DEFAULT_ASPECT_RATIO && Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) >= CropImageView.DEFAULT_ASPECT_RATIO)) {
            g2.i0.a("Width and height must be greater than or equal to zero");
        }
        cVar.T(jFloatToRawIntBits);
        vVarX.n(f5, f11);
    }

    public void j(Exception exc) {
        b7.a.p("Audio sink error", exc);
        ob.l lVar = ((h7.a0) this.f27b).f31806h1;
        Handler handler = (Handler) lVar.f44822b;
        if (handler != null) {
            handler.post(new h7.i(lVar, exc, 8));
        }
    }

    public gb.i k(ob.j id2) {
        kotlin.jvm.internal.m.f(id2, "id");
        return (gb.i) ((LinkedHashMap) this.f27b).remove(id2);
    }

    public List l(String workSpecId) {
        kotlin.jvm.internal.m.f(workSpecId, "workSpecId");
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f27b;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (kotlin.jvm.internal.m.a(((ob.j) entry.getKey()).f44817a, workSpecId)) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap2.keySet().iterator();
        while (it.hasNext()) {
            linkedHashMap.remove((ob.j) it.next());
        }
        return ry.m.a1(linkedHashMap2.values());
    }

    public void m(long j11, float f5) {
        g2.v vVarX = ((xq.c) this.f27b).x();
        int i11 = (int) (j11 >> 32);
        int i12 = (int) (j11 & 4294967295L);
        vVarX.n(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12));
        vVarX.b(f5);
        vVarX.n(-Float.intBitsToFloat(i11), -Float.intBitsToFloat(i12));
    }

    public void n(long j11, float f5, float f11) {
        g2.v vVarX = ((xq.c) this.f27b).x();
        int i11 = (int) (j11 >> 32);
        int i12 = (int) (j11 & 4294967295L);
        vVarX.n(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12));
        vVarX.a(f5, f11);
        vVarX.n(-Float.intBitsToFloat(i11), -Float.intBitsToFloat(i12));
    }

    public void o(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Product list cannot be empty.");
        }
        HashSet hashSet = new HashSet();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            com.android.billingclient.api.s sVar = (com.android.billingclient.api.s) obj;
            if (!"play_pass_subs".equals(sVar.f7574b)) {
                hashSet.add(sVar.f7574b);
            }
        }
        if (hashSet.size() > 1) {
            throw new IllegalArgumentException("All products should be of the same product type.");
        }
        this.f27b = zzbt.m(arrayList);
    }

    @Override // uw.c
    public void onComplete() {
        ((uw.c) this.f27b).onComplete();
    }

    @Override // uw.c, uw.p
    public void onError(Throwable th2) {
        switch (this.f26a) {
            case 9:
                ((uw.c) this.f27b).onComplete();
                break;
            default:
                try {
                    th2.getMessage();
                } catch (Throwable th3) {
                    fb.g0.D(th3);
                    th2 = new CompositeException(th2, th3);
                }
                ((uw.p) this.f27b).onError(th2);
                break;
        }
    }

    @Override // uw.p
    public void onSuccess(Object obj) {
        ((uw.p) this.f27b).onSuccess(obj);
    }

    public gb.i p(ob.j jVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f27b;
        Object iVar = linkedHashMap.get(jVar);
        if (iVar == null) {
            iVar = new gb.i(jVar);
            linkedHashMap.put(jVar, iVar);
        }
        return (gb.i) iVar;
    }

    @Override // q.u
    public boolean q(q.l lVar) {
        Window.Callback callback;
        androidx.appcompat.app.b bVar = (androidx.appcompat.app.b) this.f27b;
        if (lVar != lVar.k() || !bVar.f808h0 || (callback = bVar.N.getCallback()) == null || bVar.f819s0) {
            return true;
        }
        callback.onMenuOpened(108, lVar);
        return true;
    }

    public void r(float f5, float f11) {
        ((xq.c) this.f27b).x().n(f5, f11);
    }

    @Override // ce.j
    public int read(byte[] bArr, int i11) throws DefaultImageHeaderParser$Reader$EndOfFileException {
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11 && (i13 = ((InputStream) this.f27b).read(bArr, i12, i11 - i12)) != -1) {
            i12 += i13;
        }
        if (i12 == 0 && i13 == -1) {
            throw new DefaultImageHeaderParser$Reader$EndOfFileException();
        }
        return i12;
    }

    @Override // ce.j
    public long skip(long j11) throws IOException {
        InputStream inputStream = (InputStream) this.f27b;
        if (j11 < 0) {
            return 0L;
        }
        long j12 = j11;
        while (j12 > 0) {
            long jSkip = inputStream.skip(j12);
            if (jSkip <= 0) {
                if (inputStream.read() == -1) {
                    break;
                }
                jSkip = 1;
            }
            j12 -= jSkip;
        }
        return j11 - j12;
    }

    public String toString() {
        switch (this.f26a) {
            case 8:
                ql.a aVar = (ql.a) this.f27b;
                int i11 = ew.f.f25949a;
                Locale locale = Locale.ENGLISH;
                return "component: database[null], maxNetworkCount[null], outputStream[null], connection[" + aVar + "], connectionCountAdapter[null]";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ b2(int i11, Object obj, Object obj2) {
        this.f26a = i11;
        this.f27b = obj2;
    }

    public /* synthetic */ b2(Object obj, int i11) {
        this.f26a = i11;
        this.f27b = obj;
    }

    public b2(String str, Bundle bundle) {
        Uri uriA;
        this.f26a = 29;
        bundle = bundle == null ? new Bundle() : bundle;
        lf.p0[] p0VarArrValues = lf.p0.values();
        ArrayList arrayList = new ArrayList(p0VarArrValues.length);
        for (lf.p0 p0Var : p0VarArrValues) {
            arrayList.add(p0Var.a());
        }
        if (arrayList.contains(str)) {
            re.s sVar = re.s.f49201a;
            uriA = lf.j1.a(String.format("%s", Arrays.copyOf(new Object[]{"fb.gg"}, 1)), "/dialog/".concat(str), bundle);
        } else {
            uriA = lf.j1.a(lf.k.d(), re.s.e() + "/dialog/" + str, bundle);
        }
        this.f27b = uriA;
    }

    public b2(v3.c cVar) {
        this.f26a = 0;
        float f5 = c2.f38a;
        p1 p1Var = new p1();
        p1Var.f166a = f5;
        float density = cVar.getDensity();
        float f11 = q1.f176a;
        p1Var.f167b = density * 386.0878f * 160.0f * 0.84f;
        this.f27b = p1Var;
    }

    public b2() {
        this.f26a = 13;
        this.f27b = new LinkedHashMap();
    }
}
