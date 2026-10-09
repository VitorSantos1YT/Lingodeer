package b1;

import a0.b2;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.k1;
import androidx.lifecycle.Lifecycle;
import androidx.media3.common.ParserException;
import androidx.recyclerview.widget.n2;
import app.rive.runtime.kotlin.fonts.Fonts;
import ay.k0;
import b7.f0;
import bp.b5;
import bw.ORXQ.ADSb;
import ce.a0;
import com.google.api.Service;
import com.google.common.base.Ascii;
import com.google.common.base.Preconditions;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.esusskill.ui.learn.ESUSSyllableIntroductionActivity;
import com.lingo.lingoskill.object.Lesson;
import com.lingo.lingoskill.object.Model_Sentence_000;
import com.lingo.lingoskill.ui.learn.adapter.AbsDialogModelAdapter;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import g00.p1;
import hh.j0;
import hj.x4;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import km.m1;
import kotlin.jvm.internal.y;
import l1.z0;
import lw.s1;
import n9.e2;
import o20.c1;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import qy.b0;
import rz.o0;
import uz.x0;
import vt.i0;
import vt.n0;
import y.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements tx.c, ce.n, uw.p, u8.k, x7.h, p1, av.l, ki.a, e2, Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f3800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f3801c;

    public /* synthetic */ p(int i11, Object obj, Object obj2) {
        this.f3799a = i11;
        this.f3800b = obj;
        this.f3801c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003a A[Catch: IOException -> 0x006d, TryCatch #0 {IOException -> 0x006d, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:21:0x0042, B:19:0x003a, B:20:0x003d, B:23:0x0047, B:24:0x004a, B:25:0x005b), top: B:30:0x0000 }] */
    public static p E(String... strArr) {
        String str;
        try {
            m00.l[] lVarArr = new m00.l[strArr.length];
            m00.i iVar = new m00.i();
            for (int i11 = 0; i11 < strArr.length; i11++) {
                String str2 = strArr[i11];
                String[] strArr2 = jd.d.f36302e;
                iVar.J(34);
                int length = str2.length();
                int i12 = 0;
                for (int i13 = 0; i13 < length; i13++) {
                    char cCharAt = str2.charAt(i13);
                    if (cCharAt < 128) {
                        str = strArr2[cCharAt];
                        if (str != null) {
                            if (i12 < i13) {
                                iVar.W(i12, i13, str2);
                            }
                            iVar.Y(str);
                            i12 = i13 + 1;
                        }
                    } else {
                        if (cCharAt == 8232) {
                            str = "\\u2028";
                        } else if (cCharAt == 8233) {
                            str = "\\u2029";
                        }
                        if (i12 < i13) {
                            iVar.W(i12, i13, str2);
                        }
                        iVar.Y(str);
                        i12 = i13 + 1;
                    }
                }
                if (i12 < length) {
                    iVar.W(i12, length, str2);
                }
                iVar.J(34);
                iVar.readByte();
                lVarArr[i11] = iVar.z(iVar.f40718b);
            }
            return new p(15, (String[]) strArr.clone(), m00.b.f(lVarArr));
        } catch (IOException e8) {
            throw new AssertionError(e8);
        }
    }

    private final void H() {
    }

    private final void I() {
    }

    public com.bumptech.glide.p A(Context context, com.bumptech.glide.c cVar, Lifecycle lifecycle, k1 k1Var, boolean z11) {
        pe.m.a();
        pe.m.a();
        HashMap map = (HashMap) this.f3800b;
        com.bumptech.glide.p pVar = (com.bumptech.glide.p) map.get(lifecycle);
        if (pVar != null) {
            return pVar;
        }
        ie.h hVar = new ie.h(lifecycle);
        k0 k0Var = (k0) this.f3801c;
        tw.c cVar2 = new tw.c(this, k1Var);
        k0Var.getClass();
        com.bumptech.glide.p pVar2 = new com.bumptech.glide.p(cVar, hVar, cVar2, context);
        map.put(lifecycle, pVar2);
        hVar.j(new ie.j(this, lifecycle));
        if (z11) {
            pVar2.onStart();
        }
        return pVar2;
    }

    @Override // ki.a
    public void B() {
        int i11 = this.f3799a;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0012  */
    public int C(int i11) {
        int i12;
        int[] iArr = (int[]) this.f3800b;
        if (iArr == null || i11 >= iArr.length) {
            return -1;
        }
        if (((ArrayList) this.f3801c) != null) {
            n2 n2VarY = y(i11);
            if (n2VarY != null) {
                ((ArrayList) this.f3801c).remove(n2VarY);
            }
            int size = ((ArrayList) this.f3801c).size();
            int i13 = 0;
            while (true) {
                if (i13 >= size) {
                    i13 = -1;
                    break;
                }
                if (((n2) ((ArrayList) this.f3801c).get(i13)).f2550a >= i11) {
                    break;
                }
                i13++;
            }
            if (i13 != -1) {
                n2 n2Var = (n2) ((ArrayList) this.f3801c).get(i13);
                ((ArrayList) this.f3801c).remove(i13);
                i12 = n2Var.f2550a;
            } else {
                i12 = -1;
            }
        } else {
            i12 = -1;
        }
        if (i12 == -1) {
            int[] iArr2 = (int[]) this.f3800b;
            Arrays.fill(iArr2, i11, iArr2.length, -1);
            return ((int[]) this.f3800b).length;
        }
        int iMin = Math.min(i12 + 1, ((int[]) this.f3800b).length);
        Arrays.fill((int[]) this.f3800b, i11, iMin, -1);
        return iMin;
    }

    public uz.i D(long j11) {
        bh.t tVar = (bh.t) ((i0) this.f3800b);
        tVar.getClass();
        bh.r rVar = new bh.r(new gp.r(new bh.c(j11, tVar, (vy.d) null, 4)), this, 16);
        yz.f fVar = o0.f50940a;
        return x0.w(rVar, yz.e.f58387a);
    }

    public void F(int i11, int i12) {
        int[] iArr = (int[]) this.f3800b;
        if (iArr == null || i11 >= iArr.length) {
            return;
        }
        int i13 = i11 + i12;
        u(i13);
        int[] iArr2 = (int[]) this.f3800b;
        System.arraycopy(iArr2, i11, iArr2, i13, (iArr2.length - i11) - i12);
        Arrays.fill((int[]) this.f3800b, i11, i13, -1);
        ArrayList arrayList = (ArrayList) this.f3801c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            n2 n2Var = (n2) ((ArrayList) this.f3801c).get(size);
            int i14 = n2Var.f2550a;
            if (i14 >= i11) {
                n2Var.f2550a = i14 + i12;
            }
        }
    }

    public void G(int i11, int i12) {
        int[] iArr = (int[]) this.f3800b;
        if (iArr == null || i11 >= iArr.length) {
            return;
        }
        int i13 = i11 + i12;
        u(i13);
        int[] iArr2 = (int[]) this.f3800b;
        System.arraycopy(iArr2, i13, iArr2, i11, (iArr2.length - i11) - i12);
        int[] iArr3 = (int[]) this.f3800b;
        Arrays.fill(iArr3, iArr3.length - i12, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f3801c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            n2 n2Var = (n2) ((ArrayList) this.f3801c).get(size);
            int i14 = n2Var.f2550a;
            if (i14 >= i11) {
                if (i14 < i13) {
                    ((ArrayList) this.f3801c).remove(size);
                } else {
                    n2Var.f2550a = i14 - i12;
                }
            }
        }
    }

    public synchronized f10.j J() {
        f10.j jVar;
        jVar = (f10.j) this.f3800b;
        if (jVar != null) {
            f10.j jVar2 = jVar.f26551c;
            this.f3800b = jVar2;
            if (jVar2 == null) {
                this.f3801c = null;
            }
        }
        return jVar;
    }

    public void K(gb.i workSpecId, int i11) {
        kotlin.jvm.internal.m.f(workSpecId, "workSpecId");
        ((qb.a) this.f3801c).a(new pb.k((gb.d) this.f3800b, workSpecId, false, i11));
    }

    public void L(z0 z0Var) {
        Object objG = ((y.i0) this.f3801c).g(z0Var);
        if (objG != null) {
            if (!(objG instanceof e0)) {
                throw new ClassCastException();
            }
            e0 e0Var = (e0) objG;
            Object[] objArr = e0Var.f56686a;
            if (e0Var.f56687b <= 0) {
                return;
            }
            kotlin.jvm.internal.m.d(objArr[0], "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
            throw new ClassCastException();
        }
    }

    @Override // av.l
    public void a() {
        ((fz.a) this.f3800b).invoke();
        jt.e eVar = (jt.e) this.f3801c;
        eVar.a().setValue(ht.a.f33722e);
        eVar.d().a();
    }

    @Override // tx.c
    public void accept(Object obj) {
        boolean z11;
        switch (this.f3799a) {
            case 2:
                Long it = (Long) obj;
                int[] iArr = (int[]) this.f3801c;
                kotlin.jvm.internal.m.f(it, "it");
                b5 b5Var = (b5) this.f3800b;
                int i11 = b5Var.P;
                ta.a aVar = b5Var.f36400f;
                kotlin.jvm.internal.m.c(aVar);
                if (i11 > ((x4) aVar).f33585d.getChildCount() - 1) {
                    b5Var.P = 0;
                }
                ta.a aVar2 = b5Var.f36400f;
                kotlin.jvm.internal.m.c(aVar2);
                View childAt = ((x4) aVar2).f33585d.getChildAt(b5Var.P);
                if (childAt == null) {
                    return;
                }
                if (childAt.getVisibility() == 0) {
                    b5Var.P++;
                    return;
                }
                int[] iArr2 = new int[2];
                childAt.getLocationOnScreen(iArr2);
                ta.a aVar3 = b5Var.f36400f;
                kotlin.jvm.internal.m.c(aVar3);
                int width = ((x4) aVar3).f33585d.getWidth() / 2;
                ta.a aVar4 = b5Var.f36400f;
                kotlin.jvm.internal.m.c(aVar4);
                double dSqrt = Math.sqrt(((((x4) aVar4).f33585d.getWidth() * width) / 2) / 2);
                int i12 = iArr[0];
                ta.a aVar5 = b5Var.f36400f;
                kotlin.jvm.internal.m.c(aVar5);
                int width2 = (int) (((double) ((((x4) aVar5).f33585d.getWidth() / 2) + i12)) - dSqrt);
                double d5 = iArr[0];
                ta.a aVar6 = b5Var.f36400f;
                kotlin.jvm.internal.m.c(aVar6);
                int iN = th.j.n(width2, (int) (((d5 + ((double) (((x4) aVar6).f33585d.getWidth() / 2))) + dSqrt) - ((double) childAt.getWidth())));
                double d11 = iArr[1];
                ta.a aVar7 = b5Var.f36400f;
                kotlin.jvm.internal.m.c(aVar7);
                int[] iArr3 = {iN, (int) (d11 + ((double) (((x4) aVar7).f33585d.getHeight() / 2)) + dSqrt)};
                childAt.setVisibility(4);
                childAt.setTranslationX(iArr3[0] - iArr2[0]);
                childAt.setTranslationY(iArr3[1] - iArr2[1]);
                childAt.postDelayed(new b2.c(4, childAt, new at.f(7, childAt, b5Var)), 0L);
                b5Var.P++;
                return;
            case 9:
                Long it2 = (Long) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                FrameLayout frameLayout = (FrameLayout) this.f3800b;
                frameLayout.setBackgroundResource(0);
                Context context = ((fi.k) this.f3801c).f27318t;
                if (context != null) {
                    frameLayout.setForeground(new ColorDrawable(context.getColor(R.color.color_ccwhite)));
                    return;
                } else {
                    kotlin.jvm.internal.m.n("mContext");
                    throw null;
                }
            case 13:
                Long it3 = (Long) obj;
                kotlin.jvm.internal.m.f(it3, "it");
                j0 j0Var = (j0) this.f3800b;
                Iterator it4 = j0Var.P.iterator();
                kotlin.jvm.internal.m.e(it4, "iterator(...)");
                while (true) {
                    if (it4.hasNext()) {
                        Object next = it4.next();
                        kotlin.jvm.internal.m.e(next, "next(...)");
                        EditText editText = (EditText) ((View) next).findViewById(R.id.edt_text);
                        if (editText.length() == 0 && !editText.hasFocus()) {
                            editText.requestFocusFromTouch();
                            if (editText.getShowSoftInputOnFocus()) {
                                ve.i.J(editText);
                            }
                            z11 = true;
                        }
                    } else {
                        z11 = false;
                    }
                }
                j0Var.z();
                if (z11 || ((kotlin.jvm.internal.u) this.f3801c).f38357a) {
                    return;
                }
                th.j.a(qx.h.m(700L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new b2(j0Var, 17), vx.b.f54316e), j0Var.f36401t);
                return;
            case 18:
                ((TextView) this.f3800b).setText(((Model_Sentence_000) obj).getExplanation());
                a5.f fVar = ((AbsDialogModelAdapter) this.f3801c).f22060i;
                if (fVar != null) {
                    fVar.q();
                    return;
                }
                return;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                Long it5 = (Long) obj;
                kotlin.jvm.internal.m.f(it5, "it");
                FrameLayout frameLayout2 = (FrameLayout) this.f3800b;
                frameLayout2.setBackgroundResource(0);
                Context context2 = ((om.h) this.f3801c).K;
                if (context2 != null) {
                    frameLayout2.setForeground(new ColorDrawable(context2.getColor(R.color.color_ccwhite)));
                    return;
                } else {
                    kotlin.jvm.internal.m.n("mContext");
                    throw null;
                }
            default:
                List list = (List) obj;
                Lesson lesson = new Lesson();
                lesson.setSortIndex(-2);
                lesson.setLessonId(2001L);
                lesson.setLessonName(ff.h.y((Context) this.f3800b, R.string.introduction));
                lesson.setDescription(BuildConfig.VERSION_NAME);
                lesson.setWordList(BuildConfig.VERSION_NAME);
                list.add(0, lesson);
                ((km.x) this.f3801c).invoke(list);
                return;
        }
    }

    @Override // uw.p
    public void b(ww.b bVar) {
        zw.a.c((ix.c) this.f3800b, bVar);
    }

    @Override // n9.e2
    public void c() {
        ((ob.u) this.f3800b).E(b0.f48488a);
    }

    @Override // okhttp3.Callback
    public void d(Call call, Response response) {
        o20.h hVar = (o20.h) this.f3800b;
        o20.b0 b0Var = (o20.b0) this.f3801c;
        try {
            try {
                hVar.k(b0Var, b0Var.d(response));
            } catch (Throwable th2) {
                c1.q(th2);
                th2.printStackTrace();
            }
        } catch (Throwable th3) {
            c1.q(th3);
            try {
                hVar.y(b0Var, th3);
            } catch (Throwable th4) {
                c1.q(th4);
                th4.printStackTrace();
            }
        }
    }

    @Override // okhttp3.Callback
    public void e(Call call, IOException iOException) {
        try {
            ((o20.h) this.f3800b).y((o20.b0) this.f3801c, iOException);
        } catch (Throwable th2) {
            c1.q(th2);
            th2.printStackTrace();
        }
    }

    @Override // n9.e2
    public void f() {
        ((n9.j0) this.f3801c).f43605c.E(Boolean.TRUE);
    }

    @Override // ce.n
    public void g() {
        a0 a0Var = (a0) this.f3800b;
        synchronized (a0Var) {
            a0Var.f6835c = a0Var.f6833a.length;
        }
    }

    @Override // g00.p1
    public c00.a i(mz.c cVar) {
        Object objPutIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f3801c;
        Class clsP = qx.b.p(cVar);
        Object kVar = concurrentHashMap.get(clsP);
        if (kVar == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsP, (kVar = new g00.k((c00.a) ((fz.c) this.f3800b).invoke(cVar))))) != null) {
            kVar = objPutIfAbsent;
        }
        return ((g00.k) kVar).f28426a;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:39:0x00e7
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // x7.h
    public x7.g k(x7.n r17, long r18) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.p.k(x7.n, long):x7.g");
    }

    @Override // u8.k
    public int l() {
        return 1;
    }

    @Override // ki.a
    public void m() {
        switch (this.f3799a) {
            case 17:
                int[] iArr = bq.r.f4959a;
                String str = (String) ((y) this.f3800b).f38361a;
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                bq.m.L(str, bq.m.r(cf.x.n().keyLanguage) + ":" + bq.m.r(cf.x.n().locateLanguage) + "-ALPHABET-1.txt");
                Toast.makeText(((m1) this.f3801c).requireContext(), R.string.success, 1).show();
                break;
            default:
                int[] iArr2 = bq.r.f4959a;
                String str2 = (String) ((y) this.f3800b).f38361a;
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                bq.m.L(str2, bq.m.r(cf.x.n().keyLanguage) + ":" + bq.m.r(cf.x.n().locateLanguage) + "-ALPHABET.txt");
                Toast.makeText((ESUSSyllableIntroductionActivity) this.f3801c, R.string.success, 1).show();
                break;
        }
    }

    @Override // ce.n
    public void n(Bitmap bitmap, wd.a aVar) throws IOException {
        IOException iOException = ((pe.e) this.f3801c).f46819b;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            aVar.d(bitmap);
            throw iOException;
        }
    }

    @Override // x7.h
    public void o() {
        b7.w wVar = (b7.w) this.f3801c;
        byte[] bArr = f0.f3976b;
        wVar.getClass();
        wVar.G(bArr, bArr.length);
    }

    @Override // uw.p
    public void onError(Throwable th2) {
        ((uw.p) this.f3801c).onError(th2);
    }

    @Override // uw.p
    public void onSuccess(Object obj) {
        ((uw.p) this.f3801c).onSuccess(obj);
    }

    public void p(n2 n2Var) {
        if (((ArrayList) this.f3801c) == null) {
            this.f3801c = new ArrayList();
        }
        int size = ((ArrayList) this.f3801c).size();
        for (int i11 = 0; i11 < size; i11++) {
            n2 n2Var2 = (n2) ((ArrayList) this.f3801c).get(i11);
            if (n2Var2.f2550a == n2Var.f2550a) {
                ((ArrayList) this.f3801c).remove(i11);
            }
            if (n2Var2.f2550a >= n2Var.f2550a) {
                ((ArrayList) this.f3801c).add(i11, n2Var);
                return;
            }
        }
        ((ArrayList) this.f3801c).add(n2Var);
    }

    public com.android.billingclient.api.s q() {
        if ("first_party".equals((String) this.f3801c)) {
            throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
        }
        if (((String) this.f3800b) == null) {
            throw new IllegalArgumentException("Product id must be provided.");
        }
        if (((String) this.f3801c) != null) {
            return new com.android.billingclient.api.s(this);
        }
        throw new IllegalArgumentException("Product type must be provided.");
    }

    public void r() {
        ((s1) this.f3800b).f40466b = true;
        ((ScheduledFuture) this.f3801c).cancel(false);
    }

    public void s() {
        int[] iArr = (int[]) this.f3800b;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f3801c = null;
    }

    public synchronized void t(f10.j jVar) {
        try {
            f10.j jVar2 = (f10.j) this.f3801c;
            if (jVar2 != null) {
                jVar2.f26551c = jVar;
                this.f3801c = jVar;
            } else {
                if (((f10.j) this.f3800b) != null) {
                    throw new IllegalStateException("Head present, but no tail");
                }
                this.f3801c = jVar;
                this.f3800b = jVar;
            }
            notifyAll();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public String toString() {
        switch (this.f3799a) {
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return "Request{url=" + ((pw.a) this.f3800b) + '}';
            default:
                return super.toString();
        }
    }

    public void u(int i11) {
        int[] iArr = (int[]) this.f3800b;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i11, 10) + 1];
            this.f3800b = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i11 >= iArr.length) {
            int length = iArr.length;
            while (length <= i11) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f3800b = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f3800b;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public void v(int i11) {
        ArrayList arrayList = (ArrayList) this.f3801c;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((n2) ((ArrayList) this.f3801c).get(size)).f2550a >= i11) {
                    ((ArrayList) this.f3801c).remove(size);
                }
            }
        }
        C(i11);
    }

    public Activity w() {
        androidx.fragment.app.k0 k0Var = (androidx.fragment.app.k0) this.f3800b;
        if (k0Var != null) {
            if (k0Var != null) {
                return k0Var.getActivity();
            }
            return null;
        }
        Fragment fragment = (Fragment) this.f3801c;
        if (fragment != null) {
            return fragment.getActivity();
        }
        return null;
    }

    public n2 x(int i11, int i12, int i13) {
        ArrayList arrayList = (ArrayList) this.f3801c;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            n2 n2Var = (n2) ((ArrayList) this.f3801c).get(i14);
            int i15 = n2Var.f2550a;
            if (i15 >= i12) {
                return null;
            }
            if (i15 >= i11 && (i13 == 0 || n2Var.f2551b == i13 || n2Var.f2553d)) {
                return n2Var;
            }
        }
        return null;
    }

    public n2 y(int i11) {
        ArrayList arrayList = (ArrayList) this.f3801c;
        if (arrayList == null) {
            return null;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            n2 n2Var = (n2) ((ArrayList) this.f3801c).get(size);
            if (n2Var.f2550a == i11) {
                return n2Var;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qy.h] */
    public InputMethodManager z() {
        return (InputMethodManager) this.f3801c.getValue();
    }

    public /* synthetic */ p(int i11, boolean z11) {
        this.f3799a = i11;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x022d  */
    /* JADX WARN: Code duplicated, block: B:130:0x024e  */
    /* JADX WARN: Code duplicated, block: B:131:0x0259  */
    /* JADX WARN: Code duplicated, block: B:133:0x0262  */
    /* JADX WARN: Code duplicated, block: B:134:0x026c  */
    /* JADX WARN: Code duplicated, block: B:136:0x0274  */
    /* JADX WARN: Code duplicated, block: B:138:0x027c  */
    /* JADX WARN: Code duplicated, block: B:139:0x0280  */
    /* JADX WARN: Code duplicated, block: B:141:0x0288  */
    /* JADX WARN: Code duplicated, block: B:142:0x028f  */
    /* JADX WARN: Code duplicated, block: B:144:0x0297  */
    /* JADX WARN: Code duplicated, block: B:150:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:152:0x02af  */
    /* JADX WARN: Code duplicated, block: B:154:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:156:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:157:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:159:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:160:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:162:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:164:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:165:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:167:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:169:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:171:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:173:0x0306  */
    /* JADX WARN: Code duplicated, block: B:175:0x0316  */
    /* JADX WARN: Code duplicated, block: B:176:0x032e  */
    /* JADX WARN: Code duplicated, block: B:179:0x033f  */
    /* JADX WARN: Code duplicated, block: B:182:0x0348  */
    /* JADX WARN: Code duplicated, block: B:183:0x034a  */
    /* JADX WARN: Code duplicated, block: B:186:0x0353  */
    /* JADX WARN: Code duplicated, block: B:187:0x0355  */
    /* JADX WARN: Code duplicated, block: B:190:0x035e  */
    /* JADX WARN: Code duplicated, block: B:194:0x0368  */
    /* JADX WARN: Code duplicated, block: B:195:0x036d  */
    /* JADX WARN: Code duplicated, block: B:196:0x0372  */
    /* JADX WARN: Code duplicated, block: B:198:0x0385  */
    /* JADX WARN: Code duplicated, block: B:239:0x0362 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ae  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:175:0x0316, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v25 */
    @Override // u8.k
    public void j(byte[] bArr, int i11, int i12, u8.j jVar, b7.g gVar) {
        d9.c cVarD;
        String strTrim;
        int i13;
        String string;
        int i14;
        Matcher matcher;
        String strGroup;
        byte b3;
        boolean z11;
        p pVar = this;
        b7.w wVar = (b7.w) pVar.f3800b;
        wVar.G(bArr, i11 + i12);
        wVar.I(i11);
        ArrayList arrayList = new ArrayList();
        try {
            d9.i.c(wVar);
            while (!TextUtils.isEmpty(wVar.k(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                boolean z12 = false;
                int i15 = -1;
                int i16 = 0;
                byte b11 = -1;
                while (true) {
                    int i17 = 1;
                    if (b11 == -1) {
                        i16 = wVar.f4040b;
                        String strK = wVar.k(StandardCharsets.UTF_8);
                        if (strK == null) {
                            b11 = 0;
                        } else if ("STYLE".equals(strK)) {
                            b11 = 2;
                        } else {
                            b11 = strK.startsWith("NOTE") ? (byte) 1 : (byte) 3;
                        }
                    } else {
                        wVar.I(i16);
                        if (b11 == 0) {
                            vc.a.B(new ob.m(arrayList2), jVar, gVar);
                            return;
                        }
                        if (b11 == 1) {
                            while (!TextUtils.isEmpty(wVar.k(StandardCharsets.UTF_8))) {
                            }
                        } else {
                            String str = null;
                            if (b11 == 2) {
                                if (!arrayList2.isEmpty()) {
                                    throw new IllegalArgumentException("A style block was found after the first cue.");
                                }
                                wVar.k(StandardCharsets.UTF_8);
                                d9.a aVar = (d9.a) pVar.f3801c;
                                b7.w wVar2 = aVar.f23289a;
                                StringBuilder sb2 = aVar.f23290b;
                                sb2.setLength(0);
                                int i18 = wVar.f4040b;
                                while (!TextUtils.isEmpty(wVar.k(StandardCharsets.UTF_8))) {
                                }
                                wVar2.G(wVar.f4039a, wVar.f4040b);
                                wVar2.I(i18);
                                ArrayList arrayList3 = new ArrayList();
                                while (true) {
                                    d9.a.c(wVar2);
                                    if (wVar2.a() >= 5 && "::cue".equals(wVar2.u(5, StandardCharsets.UTF_8))) {
                                        int i19 = wVar2.f4040b;
                                        String strB = d9.a.b(wVar2, sb2);
                                        if (strB == null) {
                                            strTrim = str;
                                        } else if ("{".equals(strB)) {
                                            wVar2.I(i19);
                                            strTrim = BuildConfig.VERSION_NAME;
                                        } else {
                                            if ("(".equals(strB)) {
                                                int i21 = wVar2.f4040b;
                                                int i22 = wVar2.f4041c;
                                                int i23 = z12 ? 1 : 0;
                                                while (i21 < i22 && i23 == 0) {
                                                    int i24 = i21 + 1;
                                                    i23 = ((char) wVar2.f4039a[i21]) == ')' ? i17 : z12 ? 1 : 0;
                                                    i21 = i24;
                                                }
                                                strTrim = wVar2.u((i21 - 1) - wVar2.f4040b, StandardCharsets.UTF_8).trim();
                                            } else {
                                                strTrim = str;
                                            }
                                            if (!")".equals(d9.a.b(wVar2, sb2))) {
                                                strTrim = str;
                                            }
                                        }
                                    } else {
                                        strTrim = str;
                                    }
                                    if (strTrim != null && "{".equals(d9.a.b(wVar2, sb2))) {
                                        d9.b bVar = new d9.b();
                                        bVar.f23291a = BuildConfig.VERSION_NAME;
                                        bVar.f23292b = BuildConfig.VERSION_NAME;
                                        bVar.f23293c = Collections.EMPTY_SET;
                                        bVar.f23294d = BuildConfig.VERSION_NAME;
                                        bVar.f23295e = str;
                                        bVar.f23297g = z12;
                                        bVar.f23299i = z12;
                                        bVar.f23300j = i15;
                                        bVar.f23301k = i15;
                                        bVar.f23302l = i15;
                                        bVar.m = i15;
                                        bVar.f23303n = i15;
                                        bVar.f23305p = i15;
                                        bVar.f23306q = z12;
                                        if (!strTrim.isEmpty()) {
                                            int iIndexOf = strTrim.indexOf(91);
                                            if (iIndexOf != i15) {
                                                Matcher matcher2 = d9.a.f23287c.matcher(strTrim.substring(iIndexOf));
                                                if (matcher2.matches()) {
                                                    String strGroup2 = matcher2.group(i17);
                                                    strGroup2.getClass();
                                                    bVar.f23294d = strGroup2;
                                                }
                                                strTrim = strTrim.substring(z12 ? 1 : 0, iIndexOf);
                                            }
                                            String str2 = f0.f3975a;
                                            String[] strArrSplit = strTrim.split("\\.", i15);
                                            String str3 = strArrSplit[z12 ? 1 : 0];
                                            int iIndexOf2 = str3.indexOf(35);
                                            if (iIndexOf2 != i15) {
                                                bVar.f23292b = str3.substring(z12 ? 1 : 0, iIndexOf2);
                                                bVar.f23291a = str3.substring(iIndexOf2 + 1);
                                            } else {
                                                bVar.f23292b = str3;
                                            }
                                            if (strArrSplit.length > i17) {
                                                int length = strArrSplit.length;
                                                b7.a.d(length <= strArrSplit.length ? i17 : z12 ? 1 : 0);
                                                bVar.f23293c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(strArrSplit, i17, length)));
                                            }
                                        }
                                        ?? r9 = z12 ? 1 : 0;
                                        String strB2 = str;
                                        while (r9 == 0) {
                                            int i25 = wVar2.f4040b;
                                            strB2 = d9.a.b(wVar2, sb2);
                                            ?? r15 = (strB2 == null || "}".equals(strB2)) ? i17 : z12;
                                            if (r15 == 0) {
                                                wVar2.I(i25);
                                                d9.a.c(wVar2);
                                                String strA = d9.a.a(wVar2, sb2);
                                                if (!strA.isEmpty() && ":".equals(d9.a.b(wVar2, sb2))) {
                                                    d9.a.c(wVar2);
                                                    StringBuilder sb3 = new StringBuilder();
                                                    boolean z13 = false;
                                                    while (true) {
                                                        if (z13) {
                                                            string = sb3.toString();
                                                        } else {
                                                            int i26 = wVar2.f4040b;
                                                            String strB3 = d9.a.b(wVar2, sb2);
                                                            if (strB3 == null) {
                                                                string = null;
                                                            } else if ("}".equals(strB3) || ";".equals(strB3)) {
                                                                wVar2.I(i26);
                                                                z13 = true;
                                                            } else {
                                                                sb3.append(strB3);
                                                            }
                                                        }
                                                    }
                                                    if (string == null || string.isEmpty()) {
                                                        i13 = 1;
                                                    } else {
                                                        int i27 = wVar2.f4040b;
                                                        String strB4 = d9.a.b(wVar2, sb2);
                                                        if (";".equals(strB4)) {
                                                            if ("color".equals(strA)) {
                                                                i14 = 1;
                                                                bVar.f23296f = b7.e.a(string, true);
                                                                bVar.f23297g = true;
                                                            } else {
                                                                i14 = 1;
                                                                if ("background-color".equals(strA)) {
                                                                    bVar.f23298h = b7.e.a(string, true);
                                                                    bVar.f23299i = true;
                                                                } else if ("ruby-position".equals(strA)) {
                                                                    if ("text-combine-upright".equals(strA)) {
                                                                        if ("all".equals(string)) {
                                                                            z11 = true;
                                                                        } else {
                                                                            z11 = true;
                                                                        }
                                                                        bVar.f23306q = z11;
                                                                    } else if ("text-decoration".equals(strA)) {
                                                                        if ("underline".equals(string)) {
                                                                            i14 = 1;
                                                                            bVar.f23301k = 1;
                                                                        }
                                                                    } else if (ADSb.VMpKzNsjRze.equals(strA)) {
                                                                        bVar.f23295e = Ascii.c(string);
                                                                    } else if ("font-weight".equals(strA)) {
                                                                        i14 = 1;
                                                                        if ("font-style".equals(strA)) {
                                                                            if (Fonts.Font.STYLE_ITALIC.equals(string)) {
                                                                                bVar.m = 1;
                                                                            }
                                                                        } else if ("font-size".equals(strA)) {
                                                                            matcher = d9.a.f23288d.matcher(Ascii.c(string));
                                                                            if (matcher.matches()) {
                                                                                strGroup = matcher.group(2);
                                                                                strGroup.getClass();
                                                                                switch (strGroup.hashCode()) {
                                                                                    case 37:
                                                                                        if (!strGroup.equals("%")) {
                                                                                            b3 = 0;
                                                                                        }
                                                                                        switch (b3) {
                                                                                            case 0:
                                                                                                i13 = 1;
                                                                                                bVar.f23303n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i13 = 1;
                                                                                                bVar.f23303n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i13 = 1;
                                                                                                bVar.f23303n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                throw new IllegalStateException();
                                                                                        }
                                                                                        String strGroup3 = matcher.group(i13);
                                                                                        strGroup3.getClass();
                                                                                        bVar.f23304o = Float.parseFloat(strGroup3);
                                                                                        break;
                                                                                    case 3240:
                                                                                        if (!strGroup.equals("em")) {
                                                                                            b3 = 1;
                                                                                        }
                                                                                        switch (b3) {
                                                                                            case 0:
                                                                                                i13 = 1;
                                                                                                bVar.f23303n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i13 = 1;
                                                                                                bVar.f23303n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i13 = 1;
                                                                                                bVar.f23303n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                throw new IllegalStateException();
                                                                                        }
                                                                                        String strGroup4 = matcher.group(i13);
                                                                                        strGroup4.getClass();
                                                                                        bVar.f23304o = Float.parseFloat(strGroup4);
                                                                                        break;
                                                                                    case 3592:
                                                                                        if (!strGroup.equals("px")) {
                                                                                            b3 = 2;
                                                                                        }
                                                                                        switch (b3) {
                                                                                            case 0:
                                                                                                i13 = 1;
                                                                                                bVar.f23303n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i13 = 1;
                                                                                                bVar.f23303n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i13 = 1;
                                                                                                bVar.f23303n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                throw new IllegalStateException();
                                                                                        }
                                                                                        String strGroup5 = matcher.group(i13);
                                                                                        strGroup5.getClass();
                                                                                        bVar.f23304o = Float.parseFloat(strGroup5);
                                                                                        break;
                                                                                }
                                                                                b3 = -1;
                                                                                switch (b3) {
                                                                                    case 0:
                                                                                        i13 = 1;
                                                                                        bVar.f23303n = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i13 = 1;
                                                                                        bVar.f23303n = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i13 = 1;
                                                                                        bVar.f23303n = 1;
                                                                                        break;
                                                                                    default:
                                                                                        throw new IllegalStateException();
                                                                                }
                                                                                String strGroup6 = matcher.group(i13);
                                                                                strGroup6.getClass();
                                                                                bVar.f23304o = Float.parseFloat(strGroup6);
                                                                            } else {
                                                                                b7.a.B("Invalid font-size: '" + string + "'.");
                                                                            }
                                                                        }
                                                                    } else if ("bold".equals(string)) {
                                                                        i14 = 1;
                                                                        bVar.f23302l = 1;
                                                                    }
                                                                    i13 = 1;
                                                                } else if ("over".equals(string)) {
                                                                    bVar.f23305p = 1;
                                                                } else if ("under".equals(string)) {
                                                                    bVar.f23305p = 2;
                                                                    i13 = 1;
                                                                } else {
                                                                    i13 = 1;
                                                                }
                                                            }
                                                            i13 = i14;
                                                        } else if ("}".equals(strB4)) {
                                                            wVar2.I(i27);
                                                            if ("color".equals(strA)) {
                                                                i14 = 1;
                                                                bVar.f23296f = b7.e.a(string, true);
                                                                bVar.f23297g = true;
                                                            } else {
                                                                i14 = 1;
                                                                if ("background-color".equals(strA)) {
                                                                    bVar.f23298h = b7.e.a(string, true);
                                                                    bVar.f23299i = true;
                                                                } else if ("ruby-position".equals(strA)) {
                                                                    if ("text-combine-upright".equals(strA)) {
                                                                        if ("all".equals(string) || string.startsWith("digits")) {
                                                                            z11 = true;
                                                                        } else {
                                                                            z11 = false;
                                                                        }
                                                                        bVar.f23306q = z11;
                                                                    } else if ("text-decoration".equals(strA)) {
                                                                        if ("underline".equals(string)) {
                                                                            i14 = 1;
                                                                            bVar.f23301k = 1;
                                                                        }
                                                                    } else if (ADSb.VMpKzNsjRze.equals(strA)) {
                                                                        bVar.f23295e = Ascii.c(string);
                                                                    } else if ("font-weight".equals(strA)) {
                                                                        i14 = 1;
                                                                        if ("font-style".equals(strA)) {
                                                                            if (Fonts.Font.STYLE_ITALIC.equals(string)) {
                                                                                bVar.m = 1;
                                                                            }
                                                                        } else if ("font-size".equals(strA)) {
                                                                            matcher = d9.a.f23288d.matcher(Ascii.c(string));
                                                                            if (matcher.matches()) {
                                                                                b7.a.B("Invalid font-size: '" + string + "'.");
                                                                            } else {
                                                                                strGroup = matcher.group(2);
                                                                                strGroup.getClass();
                                                                                switch (strGroup.hashCode()) {
                                                                                    case 37:
                                                                                        if (!strGroup.equals("%")) {
                                                                                            b3 = 0;
                                                                                        }
                                                                                        switch (b3) {
                                                                                            case 0:
                                                                                                i13 = 1;
                                                                                                bVar.f23303n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i13 = 1;
                                                                                                bVar.f23303n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i13 = 1;
                                                                                                bVar.f23303n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                throw new IllegalStateException();
                                                                                        }
                                                                                        String strGroup7 = matcher.group(i13);
                                                                                        strGroup7.getClass();
                                                                                        bVar.f23304o = Float.parseFloat(strGroup7);
                                                                                        break;
                                                                                    case 3240:
                                                                                        if (!strGroup.equals("em")) {
                                                                                            b3 = 1;
                                                                                        }
                                                                                        switch (b3) {
                                                                                            case 0:
                                                                                                i13 = 1;
                                                                                                bVar.f23303n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i13 = 1;
                                                                                                bVar.f23303n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i13 = 1;
                                                                                                bVar.f23303n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                throw new IllegalStateException();
                                                                                        }
                                                                                        String strGroup8 = matcher.group(i13);
                                                                                        strGroup8.getClass();
                                                                                        bVar.f23304o = Float.parseFloat(strGroup8);
                                                                                        break;
                                                                                    case 3592:
                                                                                        if (!strGroup.equals("px")) {
                                                                                            b3 = 2;
                                                                                        }
                                                                                        switch (b3) {
                                                                                            case 0:
                                                                                                i13 = 1;
                                                                                                bVar.f23303n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i13 = 1;
                                                                                                bVar.f23303n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i13 = 1;
                                                                                                bVar.f23303n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                throw new IllegalStateException();
                                                                                        }
                                                                                        String strGroup9 = matcher.group(i13);
                                                                                        strGroup9.getClass();
                                                                                        bVar.f23304o = Float.parseFloat(strGroup9);
                                                                                        break;
                                                                                }
                                                                                b3 = -1;
                                                                                switch (b3) {
                                                                                    case 0:
                                                                                        i13 = 1;
                                                                                        bVar.f23303n = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i13 = 1;
                                                                                        bVar.f23303n = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i13 = 1;
                                                                                        bVar.f23303n = 1;
                                                                                        break;
                                                                                    default:
                                                                                        throw new IllegalStateException();
                                                                                }
                                                                                String strGroup10 = matcher.group(i13);
                                                                                strGroup10.getClass();
                                                                                bVar.f23304o = Float.parseFloat(strGroup10);
                                                                            }
                                                                        }
                                                                    } else if ("bold".equals(string)) {
                                                                        i14 = 1;
                                                                        bVar.f23302l = 1;
                                                                    }
                                                                    i13 = 1;
                                                                } else if ("over".equals(string)) {
                                                                    bVar.f23305p = 1;
                                                                } else if ("under".equals(string)) {
                                                                    bVar.f23305p = 2;
                                                                    i13 = 1;
                                                                } else {
                                                                    i13 = 1;
                                                                }
                                                            }
                                                            i13 = i14;
                                                        } else {
                                                            i13 = 1;
                                                        }
                                                    }
                                                } else {
                                                    i13 = i17;
                                                }
                                            } else {
                                                i13 = i17;
                                            }
                                            i17 = i13;
                                            r9 = r15;
                                            z12 = false;
                                        }
                                        int i28 = i17;
                                        if ("}".equals(strB2)) {
                                            arrayList3.add(bVar);
                                        }
                                        i17 = i28;
                                        z12 = false;
                                        i15 = -1;
                                        str = null;
                                    }
                                }
                                arrayList.addAll(arrayList3);
                            } else if (b11 == 3) {
                                Pattern pattern = d9.h.f23330a;
                                Charset charset = StandardCharsets.UTF_8;
                                String strK2 = wVar.k(charset);
                                if (strK2 == null) {
                                    cVarD = null;
                                } else {
                                    Pattern pattern2 = d9.h.f23330a;
                                    Matcher matcher3 = pattern2.matcher(strK2);
                                    if (matcher3.matches()) {
                                        cVarD = d9.h.d(null, matcher3, wVar, arrayList);
                                    } else {
                                        cVarD = null;
                                        String strK3 = wVar.k(charset);
                                        if (strK3 != null) {
                                            Matcher matcher4 = pattern2.matcher(strK3);
                                            if (matcher4.matches()) {
                                                cVarD = d9.h.d(strK2.trim(), matcher4, wVar, arrayList);
                                            }
                                        }
                                    }
                                }
                                if (cVarD != null) {
                                    arrayList2.add(cVarD);
                                }
                            }
                            pVar = this;
                        }
                    }
                }
            }
        } catch (ParserException e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    public p(k0 k0Var) {
        this.f3799a = 14;
        this.f3800b = new HashMap();
        this.f3801c = k0Var;
    }

    public p(ob.u uVar) {
        this.f3799a = 28;
        this.f3800b = (pw.a) uVar.f44891b;
        ed.c cVar = (ed.c) uVar.f44892c;
        cVar.getClass();
        this.f3801c = new a5.j(cVar);
    }

    public p(androidx.fragment.app.k0 fragment) {
        this.f3799a = 20;
        kotlin.jvm.internal.m.f(fragment, "fragment");
        this.f3800b = fragment;
    }

    public p(Fragment fragment) {
        this.f3799a = 20;
        kotlin.jvm.internal.m.f(fragment, "fragment");
        this.f3801c = fragment;
    }

    public p(gb.d processor, qb.a workTaskExecutor) {
        this.f3799a = 11;
        kotlin.jvm.internal.m.f(processor, "processor");
        kotlin.jvm.internal.m.f(workTaskExecutor, "workTaskExecutor");
        this.f3800b = processor;
        this.f3801c = workTaskExecutor;
    }

    public p(View view) {
        this.f3799a = 0;
        this.f3800b = view;
        this.f3801c = com.bumptech.glide.d.u(qy.j.NONE, new av.d(this, 4));
    }

    public p(int i11) {
        this.f3799a = i11;
        switch (i11) {
            case 19:
                this.f3800b = new y.i0();
                this.f3801c = new y.i0();
                break;
            default:
                this.f3800b = new b7.w();
                this.f3801c = new d9.a();
                break;
        }
    }

    public p(b7.b0 b0Var) {
        this.f3799a = 7;
        this.f3800b = b0Var;
        this.f3801c = new b7.w();
    }

    public p(fz.c cVar) {
        this.f3799a = 10;
        this.f3800b = cVar;
        this.f3801c = new ConcurrentHashMap();
    }

    public p(o20.b0 b0Var, o20.h hVar) {
        this.f3799a = 24;
        this.f3801c = b0Var;
        this.f3800b = hVar;
    }

    public p(s1 s1Var, ScheduledFuture scheduledFuture) {
        this.f3799a = 21;
        this.f3800b = s1Var;
        Preconditions.k(scheduledFuture, "future");
        this.f3801c = scheduledFuture;
    }

    public p(n9.j0 j0Var, ob.u retryEventBus) {
        this.f3799a = 23;
        kotlin.jvm.internal.m.f(retryEventBus, "retryEventBus");
        this.f3801c = j0Var;
        this.f3800b = retryEventBus;
    }

    public p(i0 courseRepository, n0 envRepository) {
        this.f3799a = 26;
        kotlin.jvm.internal.m.f(courseRepository, "courseRepository");
        kotlin.jvm.internal.m.f(envRepository, "envRepository");
        this.f3800b = courseRepository;
        this.f3801c = envRepository;
    }
}
