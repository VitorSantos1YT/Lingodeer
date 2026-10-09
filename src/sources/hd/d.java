package hd;

import android.app.Notification;
import android.content.ClipDescription;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.util.Base64;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelKt;
import av.k;
import av.l;
import b0.e0;
import b0.i1;
import b0.t;
import bc.i;
import bq.w;
import com.android.billingclient.api.c0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.api.Service;
import com.lingo.fluent.ui.base.adapter.PdLearnSpeakAdapter;
import com.lingo.lingoskill.object.Lesson;
import com.lingo.lingoskill.speak.ui.SpeakTestFinishActivity;
import com.lingo.lingoskill.ui.base.PicTestIndexActivity;
import com.lingo.lingoskill.ui.base.adapter.PicTestIndexAdapter;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import f0.n1;
import fr.j3;
import g2.x;
import gc.o;
import hj.b4;
import hj.j6;
import hj.r3;
import hj.x3;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import jp.p0;
import jp.z;
import kotlin.jvm.internal.m;
import kr.f0;
import kr.g0;
import l.h0;
import l1.b1;
import oo.d0;
import oo.g;
import q.j;
import r.x2;
import ry.s;
import rz.z1;
import td.h;
import v3.p;
import wc.a0;
import xb.e;
import xx.f;
import z4.s0;
import z4.w0;
import zx.u;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements w, t, tx.c, h, th.c, g0.b, i7.h, th.b, k, j, l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f32187b;

    public /* synthetic */ d(int i11, Object obj, Object obj2) {
        this.f32186a = i11;
        this.f32187b = obj;
    }

    public static o u(i iVar, gc.i iVar2, ec.a aVar, ec.b bVar) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(iVar2.f29018a.getResources(), bVar.f25457a);
        e eVar = e.MEMORY_CACHE;
        Map map = bVar.f25458b;
        Object obj = map.get("coil#disk_cache_key");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("coil#is_sampled");
        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        boolean z11 = false;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Bitmap.Config[] configArr = kc.h.f38057a;
        if (iVar != null && iVar.f4122b) {
            z11 = true;
        }
        return new o(bitmapDrawable, iVar2, eVar, aVar, str, zBooleanValue, z11);
    }

    public static d v(int i11, int i12, int i13, boolean z11) {
        return new d(AccessibilityNodeInfo.CollectionInfo.obtain(i11, i12, z11, i13), 1);
    }

    @Override // th.c, th.b
    public void a() {
        switch (this.f32186a) {
            case 8:
                android.support.v4.media.session.a.H(((ImageView) this.f32187b).getBackground());
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                g gVar = (g) this.f32187b;
                j6 j6Var = gVar.f45663h;
                int i11 = gVar.m + 1;
                gVar.m = i11;
                if (!gVar.f45667l) {
                    if (i11 >= gVar.f45659d.size()) {
                        gVar.f45667l = true;
                        j6Var.f32794c.setImageResource(R.drawable.ic_video_play);
                        ((FrameLayout) j6Var.f32797f).setVisibility(0);
                        ((FrameLayout) j6Var.f32800i).setVisibility(0);
                        ProgressBar progressBar = (ProgressBar) j6Var.f32795d;
                        progressBar.setProgress(progressBar.getMax());
                    } else {
                        ey.a aVar = gVar.f45669o;
                        if (aVar != null) {
                            fy.c.a(aVar);
                        }
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        dy.j jVar = ky.e.f38937b;
                        int i12 = qx.d.f48466a;
                        Objects.requireNonNull(timeUnit, "unit is null");
                        Objects.requireNonNull(jVar, "scheduler is null");
                        gVar.f45669o = (ey.a) new u(Math.max(0L, 500L), jVar).b(px.b.a()).c(new b(gVar, 26), ko.c.f38337b);
                    }
                    break;
                }
                break;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                ((g0) this.f32187b).c();
                break;
            default:
                ((b1) this.f32187b).setValue(Boolean.FALSE);
                break;
        }
    }

    @Override // tx.c
    public void accept(Object obj) {
        int i11 = 0;
        switch (this.f32186a) {
            case 5:
                ArrayList it = (ArrayList) obj;
                m.f(it, "it");
                PicTestIndexActivity picTestIndexActivity = (PicTestIndexActivity) this.f32187b;
                picTestIndexActivity.Q.clear();
                ArrayList arrayList = picTestIndexActivity.Q;
                ArrayList arrayList2 = new ArrayList();
                int size = it.size();
                while (i11 < size) {
                    Object obj2 = it.get(i11);
                    i11++;
                    String wordList = ((Lesson) obj2).getWordList();
                    m.e(wordList, "getWordList(...)");
                    if (wordList.length() > 0) {
                        arrayList2.add(obj2);
                    }
                }
                arrayList.addAll(arrayList2);
                PicTestIndexAdapter picTestIndexAdapter = picTestIndexActivity.P;
                if (picTestIndexAdapter != null) {
                    picTestIndexAdapter.notifyDataSetChanged();
                    return;
                } else {
                    m.n("adapter");
                    throw null;
                }
            case 12:
                ArrayList arrayList3 = (ArrayList) obj;
                fj.c cVar = (fj.c) this.f32187b;
                if (arrayList3.size() > 0) {
                    cVar.f27327b.c(arrayList3, new fj.a(i11, cVar, arrayList3), false);
                    return;
                } else {
                    cVar.H.postValue(100);
                    return;
                }
            case 18:
                m.f((Long) obj, "it");
                PdLearnSpeakAdapter pdLearnSpeakAdapter = (PdLearnSpeakAdapter) this.f32187b;
                if (pdLearnSpeakAdapter.f21647i.get()) {
                    int i12 = pdLearnSpeakAdapter.f21646h + 1;
                    pdLearnSpeakAdapter.f21646h = i12;
                    if (i12 >= ((BaseQuickAdapter) pdLearnSpeakAdapter).mData.size()) {
                        pdLearnSpeakAdapter.j(false);
                        return;
                    }
                    View childAt = pdLearnSpeakAdapter.f21641c.getChildAt(pdLearnSpeakAdapter.f21646h);
                    if (childAt != null) {
                        childAt.performClick();
                        return;
                    }
                    return;
                }
                return;
            case 19:
                m.f((Long) obj, "it");
                ((FrameLayout) this.f32187b).performClick();
                return;
            case 21:
                m.f((Long) obj, "it");
                ta.a aVar = ((jp.i) this.f32187b).f47886f;
                m.c(aVar);
                ((hj.a) aVar).f32322e.performClick();
                return;
            case 22:
                m.f((Long) obj, "it");
                z zVar = (z) this.f32187b;
                th.e eVar = zVar.O;
                if (eVar == null) {
                    m.n("exoAudioPlayer");
                    throw null;
                }
                if (eVar.d() <= 0 || zVar.R) {
                    return;
                }
                ta.a aVar2 = zVar.f36400f;
                m.c(aVar2);
                AppCompatSeekBar appCompatSeekBar = ((r3) aVar2).f33217f;
                th.e eVar2 = zVar.O;
                if (eVar2 == null) {
                    m.n("exoAudioPlayer");
                    throw null;
                }
                appCompatSeekBar.setMax((int) eVar2.d());
                ta.a aVar3 = zVar.f36400f;
                m.c(aVar3);
                AppCompatSeekBar appCompatSeekBar2 = ((r3) aVar3).f33217f;
                th.e eVar3 = zVar.O;
                if (eVar3 == null) {
                    m.n("exoAudioPlayer");
                    throw null;
                }
                appCompatSeekBar2.setProgress((int) eVar3.c());
                ta.a aVar4 = zVar.f36400f;
                m.c(aVar4);
                TextView textView = ((r3) aVar4).f33221j;
                Context contextRequireContext = zVar.requireContext();
                m.e(contextRequireContext, "requireContext(...)");
                ta.a aVar5 = zVar.f36400f;
                m.c(aVar5);
                textView.setText(z.y(contextRequireContext, ((r3) aVar5).f33217f.getMax()));
                ta.a aVar6 = zVar.f36400f;
                m.c(aVar6);
                TextView textView2 = ((r3) aVar6).f33219h;
                Context contextRequireContext2 = zVar.requireContext();
                m.e(contextRequireContext2, "requireContext(...)");
                ta.a aVar7 = zVar.f36400f;
                m.c(aVar7);
                textView2.setText(z.y(contextRequireContext2, ((r3) aVar7).f33217f.getProgress()));
                return;
            case 23:
                m.f((Long) obj, "it");
                p0 p0Var = (p0) this.f32187b;
                ta.a aVar8 = p0Var.f36400f;
                m.c(aVar8);
                ((x3) aVar8).f33580n.setVisibility(4);
                ta.a aVar9 = p0Var.f36400f;
                m.c(aVar9);
                ConstraintLayout constraintLayout = ((x3) aVar9).f33576i.f32667f;
                ta.a aVar10 = p0Var.f36400f;
                m.c(aVar10);
                constraintLayout.setTranslationY(((x3) aVar10).f33576i.f32668g.getHeight());
                ta.a aVar11 = p0Var.f36400f;
                m.c(aVar11);
                ((x3) aVar11).f33576i.f32667f.setVisibility(0);
                p0Var.T();
                w0 w0Var = p0Var.f36532h0;
                if (w0Var != null) {
                    w0Var.b();
                    p0Var.f36532h0 = null;
                }
                ta.a aVar12 = p0Var.f36400f;
                m.c(aVar12);
                w0 w0VarB = s0.b(((x3) aVar12).f33576i.f32667f);
                w0VarB.l(CropImageView.DEFAULT_ASPECT_RATIO);
                w0VarB.e(400L);
                p0Var.f36532h0 = w0VarB;
                w0VarB.i();
                int[] iArr = new int[2];
                ta.a aVar13 = p0Var.f36400f;
                m.c(aVar13);
                ((x3) aVar13).f33569b.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                ta.a aVar14 = p0Var.f36400f;
                m.c(aVar14);
                ((x3) aVar14).f33576i.f32663b.getLocationOnScreen(iArr2);
                w0 w0Var2 = p0Var.f36533i0;
                if (w0Var2 != null) {
                    w0Var2.b();
                    p0Var.f36533i0 = null;
                }
                ta.a aVar15 = p0Var.f36400f;
                m.c(aVar15);
                w0 w0VarB2 = s0.b(((x3) aVar15).f33569b);
                int i13 = iArr2[0];
                ta.a aVar16 = p0Var.f36400f;
                m.c(aVar16);
                int width = (((x3) aVar16).f33576i.f32663b.getWidth() / 2) + i13;
                int i14 = iArr[0];
                ta.a aVar17 = p0Var.f36400f;
                m.c(aVar17);
                w0VarB2.j(width - ((((x3) aVar17).f33569b.getWidth() / 2) + i14));
                int i15 = iArr2[1];
                ta.a aVar18 = p0Var.f36400f;
                m.c(aVar18);
                int height = (((x3) aVar18).f33576i.f32663b.getHeight() / 2) + i15;
                int i16 = iArr[1];
                ta.a aVar19 = p0Var.f36400f;
                m.c(aVar19);
                w0VarB2.l(height - ((((x3) aVar19).f33569b.getHeight() / 2) + i16));
                w0VarB2.c(0.5f);
                w0VarB2.d(0.5f);
                w0VarB2.e(400L);
                p0Var.f36533i0 = w0VarB2;
                w0VarB2.i();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                dy.j jVar = ky.e.f38937b;
                f fVarH = qx.h.m(400L, timeUnit, jVar).k(jVar).g(px.b.a()).h(new b(p0Var, 24), jp.h.H);
                th.j.a(fVarH, p0Var.f36401t);
                p0Var.f36527c0 = fVarH;
                return;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                m.f((Long) obj, "it");
                km.f fVar = (km.f) this.f32187b;
                int i17 = fVar.N;
                while (i11 < i17) {
                    ta.a aVar20 = fVar.f36400f;
                    m.c(aVar20);
                    View childAt2 = ((b4) aVar20).f32392j.getChildAt(i11);
                    m.d(childAt2, "null cannot be cast to non-null type android.widget.FrameLayout");
                    View childAt3 = ((FrameLayout) childAt2).getChildAt(1);
                    m.d(childAt3, "null cannot be cast to non-null type android.widget.ImageView");
                    ImageView imageView = (ImageView) childAt3;
                    imageView.setScaleX(3.0f);
                    imageView.setScaleY(3.0f);
                    th.j.a(qx.h.m((i11 * 400) + 400, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new ij.d(imageView, i11, 11, fVar), km.d.f38167d), fVar.f36401t);
                    i11++;
                }
                return;
            default:
                m.f((Long) obj, "it");
                d0 d0Var = (d0) ((x2) this.f32187b).f48712d;
                if (d0Var.R <= d0Var.Q.size() - 1) {
                    d0Var.B();
                    return;
                }
                int i18 = d0Var.T;
                List list = d0Var.X;
                m.c(list);
                if (i18 != list.size()) {
                    d0Var.z();
                    return;
                }
                l.m mVar = d0Var.f36398d;
                m.c(mVar);
                mVar.finish();
                int i19 = SpeakTestFinishActivity.Q;
                l.m mVar2 = d0Var.f36398d;
                m.c(mVar2);
                int i21 = d0Var.Y;
                long j11 = d0Var.Z;
                Intent intent = new Intent(mVar2, (Class<?>) SpeakTestFinishActivity.class);
                intent.putExtra(INTENTS.EXTRA_INT, i21);
                intent.putExtra(INTENTS.EXTRA_LONG, j11);
                d0Var.startActivity(intent);
                return;
        }
    }

    @Override // i7.h
    public long b(long j11) {
        return 0L;
    }

    @Override // q.j
    public boolean c(q.l lVar, MenuItem menuItem) {
        return false;
    }

    @Override // g0.b
    public Object d(n1 n1Var, Float f5, Float f11, fz.c cVar, g0.f fVar) {
        float fFloatValue = f5.floatValue();
        float fFloatValue2 = f11.floatValue();
        Object objB = g0.k.b(n1Var, Math.signum(fFloatValue2) * Math.abs(fFloatValue), fFloatValue, b0.e.b(CropImageView.DEFAULT_ASPECT_RATIO, fFloatValue2, 28), (i1) this.f32187b, cVar, fVar);
        return objB == wy.a.COROUTINE_SUSPENDED ? objB : (g0.a) objB;
    }

    @Override // td.h
    public void f(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Integer num = (Integer) obj;
        if (num == null) {
            return;
        }
        messageDigest.update(bArr);
        synchronized (((ByteBuffer) this.f32187b)) {
            ((ByteBuffer) this.f32187b).position(0);
            messageDigest.update(((ByteBuffer) this.f32187b).putInt(num.intValue()).array());
        }
    }

    @Override // i7.h
    public long g(long j11, long j12) {
        return 0L;
    }

    @Override // b0.t
    public b0.d0 get(int i11) {
        return ((e0[]) this.f32187b)[i11];
    }

    @Override // i7.h
    public long h(long j11, long j12) {
        return -9223372036854775807L;
    }

    @Override // q.j
    public void i(q.l lVar) {
        h0 h0Var = (h0) this.f32187b;
        Window.Callback callback = h0Var.f38984b;
        if (h0Var.f38983a.f48654a.p()) {
            callback.onPanelClosed(108, lVar);
        } else if (callback.onPreparePanel(0, null, lVar)) {
            callback.onMenuOpened(108, lVar);
        }
    }

    @Override // i7.h
    public j7.j j(long j11) {
        return (j7.j) this.f32187b;
    }

    @Override // bq.w
    public void k(View view, boolean z11) {
        if (z11) {
            return;
        }
        i iVar = ((aj.f) this.f32187b).f739b;
        m.c(iVar);
        iVar.g();
    }

    @Override // i7.h
    public long l(long j11, long j12) {
        return 0L;
    }

    @Override // bq.w
    public void m(View view, boolean z11) {
        aj.f fVar = (aj.f) this.f32187b;
        i iVar = fVar.f739b;
        if (z11) {
            m.c(iVar);
            iVar.c();
            iVar.f4122b = true;
            b7.c cVar = fVar.f740c;
            m.c(cVar);
            iVar.a((String) cVar.f3961d);
            iVar.a(fVar.f745h);
            iVar.d();
        }
    }

    public void n(char c11) {
        if (c11 > 127) {
            throw new IllegalArgumentException("Can only match ASCII characters");
        }
        ((BitSet) this.f32187b).set(c11);
    }

    public long o() {
        int i11 = x.f28623j;
        long j11 = ((Parcel) this.f32187b).readLong();
        long j12 = 63 & j11;
        return j12 < 16 ? j11 : (j11 & (-64)) | (j12 + 1);
    }

    public long p() {
        long j11;
        Parcel parcel = (Parcel) this.f32187b;
        byte b3 = parcel.readByte();
        if (b3 == 1) {
            j11 = 4294967296L;
        } else {
            j11 = b3 == 2 ? 8589934592L : 0L;
        }
        return p.a(j11, 0L) ? v3.o.f53501c : j3.L(j11, parcel.readFloat());
    }

    public a0 q(Context context, String str, InputStream inputStream, String str2, String str3) {
        a0 a0VarH;
        a aVar;
        b bVar = (b) this.f32187b;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            kd.d.a();
            a aVar2 = a.ZIP;
            a0VarH = str3 != null ? wc.l.h(context, new ZipInputStream(new FileInputStream(bVar.z(str, inputStream, aVar2))), str) : wc.l.h(context, new ZipInputStream(inputStream), null);
            aVar = aVar2;
        } else if (str2.contains("application/gzip") || str2.contains("application/x-gzip") || str.split("\\?")[0].endsWith(".tgs")) {
            kd.d.a();
            aVar = a.GZIP;
            if (str3 != null) {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(new FileInputStream(bVar.z(str, inputStream, aVar)));
                HashMap map = wc.l.f54983a;
                a0VarH = wc.l.e(m00.b.i(gZIPInputStream), str);
            } else {
                GZIPInputStream gZIPInputStream2 = new GZIPInputStream(inputStream);
                HashMap map2 = wc.l.f54983a;
                a0VarH = wc.l.e(m00.b.i(gZIPInputStream2), null);
            }
        } else {
            kd.d.a();
            aVar = a.JSON;
            if (str3 != null) {
                FileInputStream fileInputStream = new FileInputStream(bVar.z(str, inputStream, aVar).getAbsolutePath());
                HashMap map3 = wc.l.f54983a;
                a0VarH = wc.l.e(m00.b.i(fileInputStream), str);
            } else {
                HashMap map4 = wc.l.f54983a;
                a0VarH = wc.l.e(m00.b.i(inputStream), null);
            }
        }
        if (str3 != null && a0VarH.f54933a != null) {
            File file = new File(bVar.w(), b.l(str, aVar, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", BuildConfig.VERSION_NAME));
            boolean zRenameTo = file.renameTo(file2);
            file2.toString();
            kd.d.a();
            if (!zRenameTo) {
                kd.d.b("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
            }
        }
        return a0VarH;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    public ec.b r(gc.i iVar, ec.a aVar, hc.g gVar, hc.f fVar) {
        ec.b bVarH;
        int i11;
        boolean zEquals;
        ?? r9;
        ec.b bVar;
        if (iVar.f29030n.a()) {
            ec.c cVar = (ec.c) ((vb.i) this.f32187b).f53830c.getValue();
            if (cVar != null) {
                bVarH = cVar.f25459a.h(aVar);
                if (bVarH == null) {
                    c0 c0Var = cVar.f25460b;
                    synchronized (c0Var) {
                        try {
                            ArrayList arrayList = (ArrayList) ((LinkedHashMap) c0Var.f7471c).get(aVar);
                            bVar = null;
                            if (arrayList != null) {
                                int size = arrayList.size();
                                for (int i12 = 0; i12 < size; i12++) {
                                    ec.f fVar2 = (ec.f) arrayList.get(i12);
                                    Bitmap bitmap = (Bitmap) fVar2.f25466b.get();
                                    ec.b bVar2 = bitmap != null ? new ec.b(bitmap, fVar2.f25467c) : null;
                                    if (bVar2 != null) {
                                        bVar = bVar2;
                                        break;
                                    }
                                }
                                int i13 = c0Var.f7470b;
                                c0Var.f7470b = i13 + 1;
                                if (i13 >= 10) {
                                    c0Var.b();
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    bVarH = bVar;
                }
            } else {
                bVarH = null;
            }
            if (bVarH != null) {
                Bitmap bitmap2 = bVarH.f25457a;
                Bitmap.Config config = bitmap2.getConfig();
                if (config == null) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (z6.c.k(config) && !iVar.f29028k) {
                    r9 = 0;
                } else {
                    Object obj = bVarH.f25458b.get("coil#is_sampled");
                    Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                    boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                    if (!m.a(gVar, hc.g.f32180c)) {
                        String str = (String) aVar.f25456b.get("coil#transformation_size");
                        if (str != null) {
                            zEquals = str.equals(gVar.toString());
                        } else {
                            int width = bitmap2.getWidth();
                            int height = bitmap2.getHeight();
                            jh.h hVar = gVar.f32181a;
                            int i14 = hVar instanceof hc.a ? ((hc.a) hVar).f32177a : Integer.MAX_VALUE;
                            jh.h hVar2 = gVar.f32182b;
                            int i15 = hVar2 instanceof hc.a ? ((hc.a) hVar2).f32177a : Integer.MAX_VALUE;
                            double dJ = com.bumptech.glide.d.j(width, height, i14, i15, fVar);
                            boolean zA = kc.f.a(iVar);
                            if (zA) {
                                double d5 = dJ > 1.0d ? 1.0d : dJ;
                                if (Math.abs(((double) i14) - (d5 * ((double) width))) <= 1.0d || Math.abs(((double) i15) - (d5 * ((double) height))) <= 1.0d) {
                                    i11 = 1;
                                } else {
                                    i11 = 1;
                                }
                                r9 = i11;
                            } else {
                                if (i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE) {
                                    i11 = 1;
                                } else {
                                    int iAbs = Math.abs(i14 - width);
                                    i11 = 1;
                                    if (iAbs <= 1) {
                                    }
                                }
                                if (i15 != Integer.MIN_VALUE && i15 != Integer.MAX_VALUE && Math.abs(i15 - height) > i11) {
                                }
                                r9 = i11;
                            }
                            if (!(dJ == 1.0d || zA) || (dJ > 1.0d && zBooleanValue)) {
                                r9 = 0;
                            } else {
                                r9 = i11;
                            }
                        }
                    } else if (zBooleanValue) {
                        r9 = 0;
                    } else {
                        i11 = 1;
                        r9 = i11;
                    }
                }
                if (r9 != 0) {
                    r9 = zEquals;
                    return bVarH;
                }
            }
        }
        r9 = zEquals;
        return null;
    }

    public ec.a s(gc.i iVar, Object obj, gc.l lVar, vb.c cVar) {
        String strA;
        Map linkedHashMap;
        iVar.getClass();
        List list = iVar.f29023f;
        List list2 = ((vb.i) this.f32187b).f53833f.f53811c;
        int size = list2.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                strA = null;
                break;
            }
            qy.l lVar2 = (qy.l) list2.get(i11);
            cc.b bVar = (cc.b) lVar2.f48495a;
            if (((Class) lVar2.f48496b).isAssignableFrom(obj.getClass())) {
                m.d(bVar, "null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>");
                strA = bVar.a(obj, lVar);
                if (strA != null) {
                    break;
                }
            }
            i11++;
        }
        if (strA == null) {
            return null;
        }
        Map map = iVar.f29040x.f29060a;
        boolean zIsEmpty = map.isEmpty();
        s sVar = s.f50855a;
        if (zIsEmpty) {
            linkedHashMap = sVar;
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = map.entrySet().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getValue().getClass();
                throw new ClassCastException();
            }
        }
        if (list.isEmpty() && linkedHashMap.isEmpty()) {
            return new ec.a(strA, sVar);
        }
        LinkedHashMap linkedHashMapK0 = ry.x.k0(linkedHashMap);
        if (!list.isEmpty()) {
            if (list.size() > 0) {
                list.get(0).getClass();
                throw new ClassCastException();
            }
            linkedHashMapK0.put("coil#transformation_size", lVar.f29047d.toString());
        }
        return new ec.a(strA, linkedHashMapK0);
    }

    @Override // av.k
    public void start() {
        g0 g0Var = (g0) this.f32187b;
        z1 z1Var = g0Var.f38469t;
        vy.d dVar = null;
        if (z1Var != null) {
            z1Var.cancel(null);
        }
        g0Var.f38469t = rz.e0.B(ViewModelKt.getViewModelScope(g0Var), null, null, new f0(g0Var, dVar, 2), 3);
    }

    @Override // i7.h
    public boolean t() {
        return true;
    }

    public String toString() {
        switch (this.f32186a) {
            case 9:
                return "ForegroundServiceConfig{notificationId=17301506, notificationChannelId='filedownloader_channel', notificationChannelName='Filedownloader', notification=" + ((Notification) this.f32187b) + ", needRecreateChannelId=true}";
            default:
                return super.toString();
        }
    }

    @Override // i7.h
    public long w() {
        return 0L;
    }

    public void x(char c11, char c12) {
        while (c11 <= c12) {
            n(c11);
            c11 = (char) (c11 + 1);
        }
    }

    @Override // i7.h
    public long y(long j11) {
        return 1L;
    }

    @Override // i7.h
    public long z(long j11, long j12) {
        return 1L;
    }

    public /* synthetic */ d(Object obj, int i11) {
        this.f32186a = i11;
        this.f32187b = obj;
    }

    public d(int i11) {
        this.f32186a = i11;
        switch (i11) {
            case 9:
                break;
            default:
                this.f32187b = ByteBuffer.allocate(4);
                break;
        }
    }

    public d(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f32186a = 4;
        if (Build.VERSION.SDK_INT >= 25) {
            this.f32187b = new b5.f(uri, clipDescription, uri2);
        } else {
            this.f32187b = new ob.m(uri, clipDescription, uri2, 2);
        }
    }

    public d(String str) {
        this.f32186a = 16;
        Parcel parcelObtain = Parcel.obtain();
        this.f32187b = parcelObtain;
        byte[] bArrDecode = Base64.decode(str, 0);
        parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
        parcelObtain.setDataPosition(0);
    }

    public d(float f5, float f11, b0.s sVar) {
        this.f32186a = 3;
        int iB = sVar.b();
        e0[] e0VarArr = new e0[iB];
        for (int i11 = 0; i11 < iB; i11++) {
            e0VarArr[i11] = new e0(f5, f11, sVar.a(i11));
        }
        this.f32187b = e0VarArr;
    }

    @Override // i7.h
    public long e(long j11, long j12) {
        return j12;
    }
}
