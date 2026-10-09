package ob;

import a0.b2;
import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaCodec;
import android.os.Handler;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.work.impl.WorkDatabase_Impl;
import cf.x;
import com.google.android.flexbox.FlexboxLayout;
import com.google.api.Service;
import com.google.common.base.Preconditions;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.deskill.ui.learn.DESyllableIntroductionActivity;
import com.lingo.lingoskill.speak.object.PodSentence;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import fr.p3;
import hh.c0;
import hj.h1;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import jp.g1;
import jp.p0;
import lw.q1;
import o20.t0;
import p9.y;
import r.x2;
import rz.o0;
import uz.i1;
import uz.x0;
import vd.b0;
import vt.i0;
import vt.n0;
import wc.f0;
import z4.h0;
import z4.s0;
import z4.w0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class u implements ka.c, td.m, tx.c, g1, p.b, ki.a, o20.h, p9.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f44891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f44892c;

    public /* synthetic */ u(int i11, Object obj, Object obj2) {
        this.f44890a = i11;
        this.f44891b = obj;
        this.f44892c = obj2;
    }

    public void A() {
        ArrayList arrayList;
        int i11;
        ij.d dVar = (ij.d) this.f44892c;
        synchronized (dVar) {
            dVar.f();
            arrayList = new ArrayList();
            i11 = 0;
            for (int i12 = 0; i12 < ((SparseArray) dVar.f34422c).size(); i12++) {
                SparseArray sparseArray = (SparseArray) dVar.f34422c;
                arrayList.add(Integer.valueOf(((xv.f) sparseArray.get(sparseArray.keyAt(i12))).f56597b.f6390a));
            }
        }
        int size = arrayList.size();
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            z(((Integer) obj).intValue());
        }
    }

    public gb.i C(j id2) {
        gb.i iVarK;
        kotlin.jvm.internal.m.f(id2, "id");
        synchronized (this.f44892c) {
            iVarK = ((b2) this.f44891b).k(id2);
        }
        return iVarK;
    }

    public List D(String workSpecId) {
        List listL;
        kotlin.jvm.internal.m.f(workSpecId, "workSpecId");
        synchronized (this.f44892c) {
            listL = ((b2) this.f44891b).l(workSpecId);
        }
        return listL;
    }

    public void E(Object obj) {
        i1 i1Var = (i1) this.f44891b;
        qy.l lVar = new qy.l(Integer.valueOf(((Number) ((qy.l) i1Var.getValue()).f48495a).intValue() + 1), obj);
        i1Var.getClass();
        i1Var.l(null, lVar);
    }

    public void F(com.android.billingclient.api.o oVar) {
        this.f44891b = oVar;
        if (oVar.a() != null) {
            oVar.a().getClass();
            String str = oVar.a().f7542d;
            if (str != null) {
                this.f44892c = str;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005b A[PHI: r2
      0x005b: PHI (r2v3 bw.c) = (r2v2 bw.c), (r2v2 bw.c), (r2v15 bw.c), (r2v15 bw.c) binds: [B:5:0x0026, B:6:0x0028, B:8:0x0041, B:10:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    public synchronized void G(String str, String str2, boolean z11, int i11, int i12, int i13, boolean z12, bw.b bVar, boolean z13) throws Throwable {
        bw.c cVar;
        ArrayList arrayListQ;
        String strC;
        try {
            uv.u.a();
            int i14 = ew.f.f25949a;
            x2 x2Var = xv.c.f56595a;
            x2Var.d().getClass();
            int iP = p3.p(str, str2, z11);
            bw.c cVarR = ((wv.a) this.f44891b).r(iP);
            String strB = null;
            boolean z14 = true;
            if (z11 || cVarR != null) {
                cVar = cVarR;
                arrayListQ = null;
            } else {
                String strD = ew.f.d(str2);
                x2Var.d().getClass();
                int iP2 = p3.p(str, strD, true);
                cVarR = ((wv.a) this.f44891b).r(iP2);
                if (cVarR == null || !str2.equals(cVarR.b())) {
                    cVar = cVarR;
                    arrayListQ = null;
                } else {
                    arrayListQ = ((wv.a) this.f44891b).q(iP2);
                    cVar = cVarR;
                }
            }
            if (ns.o.E(iP, cVar, this, true)) {
                return;
            }
            if (cVar != null) {
                strB = cVar.b();
            } else if (str2 != null && !z11) {
                strB = str2;
            }
            if (ns.o.D(strB, iP, z12, true)) {
                return;
            }
            long j11 = cVar != null ? cVar.f6396t.get() : 0L;
            if (cVar != null) {
                strC = cVar.c();
            } else {
                Locale locale = Locale.ENGLISH;
                strC = strB + ".temp";
            }
            try {
                if (ns.o.C(iP, j11, strC, strB, this)) {
                    if (cVar != null) {
                        ((wv.a) this.f44891b).remove(iP);
                        ((wv.a) this.f44891b).h(iP);
                    }
                    return;
                }
                if (cVar == null || !(cVar.a() == -2 || cVar.a() == -1 || cVar.a() == 1 || cVar.a() == 6 || cVar.a() == 2)) {
                    if (cVar == null) {
                        cVar = new bw.c();
                    }
                    cVar.f6391b = str;
                    cVar.f6392c = str2;
                    cVar.f6393d = z11;
                    cVar.f6390a = iP;
                    cVar.d(0L);
                    cVar.g(0L);
                    cVar.e((byte) 1);
                    cVar.M = 1;
                } else {
                    int i15 = cVar.f6390a;
                    int i16 = 0;
                    if (i15 != iP) {
                        ((wv.a) this.f44891b).remove(i15);
                        ((wv.a) this.f44891b).h(cVar.f6390a);
                        cVar.f6390a = iP;
                        cVar.f6392c = str2;
                        cVar.f6393d = z11;
                        if (arrayListQ != null) {
                            int size = arrayListQ.size();
                            while (i16 < size) {
                                Object obj = arrayListQ.get(i16);
                                i16++;
                                bw.a aVar = (bw.a) obj;
                                aVar.f6384a = iP;
                                ((wv.a) this.f44891b).b(aVar);
                            }
                        }
                    } else if (TextUtils.equals(str, cVar.f6391b)) {
                        z14 = false;
                    } else {
                        cVar.f6391b = str;
                    }
                }
                bw.c cVar2 = cVar;
                if (z14) {
                    ((wv.a) this.f44891b).k(cVar2);
                }
                ((ij.d) this.f44892c).e(new xv.f(cVar2, bVar, this, i12, i11, z12, z13, i13));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public gb.i H(j jVar) {
        gb.i iVarP;
        synchronized (this.f44892c) {
            iVarP = ((b2) this.f44891b).p(jVar);
        }
        return iVarP;
    }

    @Override // p.b
    public boolean a(p.c cVar, Menu menu) {
        return ((p.b) this.f44891b).a(cVar, menu);
    }

    @Override // tx.c
    public void accept(Object obj) {
        switch (this.f44890a) {
            case 8:
                Long it = (Long) obj;
                kotlin.jvm.internal.m.f(it, "it");
                fi.i iVar = (fi.i) this.f44891b;
                gi.h hVar = iVar.f27312e;
                String str = (String) this.f44892c;
                ta.a aVar = iVar.f45600c;
                kotlin.jvm.internal.m.c(aVar);
                hVar.a((ImageView) ((h1) aVar).f32645b.f32408d, str);
                return;
            case 12:
                Long it2 = (Long) obj;
                FlexboxLayout flexboxLayout = (FlexboxLayout) this.f44892c;
                kotlin.jvm.internal.m.f(it2, "it");
                c0 c0Var = (c0) this.f44891b;
                th.e eVar = c0Var.Q;
                th.e eVar2 = c0Var.Q;
                if (eVar.f()) {
                    long jC = eVar2.c();
                    int childCount = flexboxLayout.getChildCount();
                    for (int i11 = 1; i11 < childCount; i11++) {
                        View childAt = flexboxLayout.getChildAt(i11);
                        Object tag = childAt.getTag(R.id.tag_start_pos);
                        kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type kotlin.Float");
                        if (((int) (((Float) tag).floatValue() * eVar2.d())) <= jC) {
                            TextView textView = (TextView) childAt.findViewById(R.id.tv_middle);
                            Context contextRequireContext = c0Var.requireContext();
                            kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                            textView.setTextColor(contextRequireContext.getColor(R.color.color_primary));
                            TextView textView2 = (TextView) childAt.findViewById(R.id.tv_top);
                            Context contextRequireContext2 = c0Var.requireContext();
                            kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                            textView2.setTextColor(contextRequireContext2.getColor(R.color.color_primary));
                            TextView textView3 = (TextView) childAt.findViewById(R.id.tv_bottom);
                            Context contextRequireContext3 = c0Var.requireContext();
                            kotlin.jvm.internal.m.e(contextRequireContext3, "requireContext(...)");
                            textView3.setTextColor(contextRequireContext3.getColor(R.color.color_primary));
                        }
                    }
                    return;
                }
                return;
            case 16:
                Boolean aBoolean = (Boolean) obj;
                ki.a aVar2 = (ki.a) this.f44891b;
                kotlin.jvm.internal.m.f(aBoolean, "aBoolean");
                if (aBoolean.booleanValue()) {
                    aVar2.m();
                    return;
                }
                aVar2.B();
                Context context = (Context) this.f44892c;
                kotlin.jvm.internal.m.d(context, "null cannot be cast to non-null type android.app.Activity");
                ((Activity) context).shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS");
                return;
            case 17:
                Long it3 = (Long) obj;
                PodSentence podSentence = (PodSentence) this.f44892c;
                kotlin.jvm.internal.m.f(it3, "it");
                oo.g gVar = (oo.g) this.f44891b;
                th.e eVar3 = gVar.f45666k;
                Context context2 = gVar.f45656a;
                if (eVar3 == null || !eVar3.f()) {
                    return;
                }
                long jC2 = eVar3 != null ? eVar3.c() : 0L;
                long jD = eVar3 != null ? eVar3.d() : 0L;
                if (gVar.m >= gVar.f45659d.size()) {
                    xx.f fVar = gVar.f45676v;
                    kotlin.jvm.internal.m.c(fVar);
                    ux.b.a(fVar);
                    return;
                }
                int size = podSentence.getWords().size();
                for (int i12 = 0; i12 < size; i12++) {
                    op.b bVar = (op.b) podSentence.getWords().get(i12);
                    if (!TextUtils.isEmpty(bVar.getBegin()) && ((int) (Float.valueOf(bVar.getBegin()).floatValue() * jD)) <= jC2) {
                        FlexboxLayout flexboxLayout2 = gVar.f45665j;
                        kotlin.jvm.internal.m.c(flexboxLayout2);
                        View childAt2 = flexboxLayout2.getChildAt(i12);
                        TextView textView4 = (TextView) childAt2.findViewById(R.id.tv_top);
                        TextView textView5 = (TextView) childAt2.findViewById(R.id.tv_middle);
                        TextView textView6 = (TextView) childAt2.findViewById(R.id.tv_bottom);
                        textView4.setTextColor(context2.getColor(R.color.color_5893DD));
                        textView5.setTextColor(context2.getColor(R.color.color_5893DD));
                        textView6.setTextColor(context2.getColor(R.color.color_5893DD));
                    }
                }
                return;
            default:
                Long it4 = (Long) obj;
                kotlin.jvm.internal.m.f(it4, "it");
                FrameLayout frameLayout = (FrameLayout) this.f44891b;
                frameLayout.setBackgroundResource(0);
                Context context3 = ((om.h) this.f44892c).K;
                if (context3 != null) {
                    frameLayout.setForeground(new ColorDrawable(context3.getColor(R.color.color_ccwhite)));
                    return;
                } else {
                    kotlin.jvm.internal.m.n("mContext");
                    throw null;
                }
        }
    }

    @Override // p.b
    public boolean b(p.c cVar, MenuItem menuItem) {
        return ((p.b) this.f44891b).b(cVar, menuItem);
    }

    @Override // p.b
    public boolean c(p.c cVar, Menu menu) {
        ViewGroup viewGroup = ((androidx.appcompat.app.b) this.f44892c).f803c0;
        WeakHashMap weakHashMap = s0.f58893a;
        h0.c(viewGroup);
        return ((p.b) this.f44891b).c(cVar, menu);
    }

    @Override // td.m
    public td.c d(td.j jVar) {
        return td.c.TRANSFORMED;
    }

    @Override // jp.g1
    public void e() {
        ((p0) this.f44891b).L();
    }

    @Override // jp.g1
    public void f() {
        ((jp.h1) this.f44892c).v();
    }

    @Override // ka.c
    public ka.d g(ka.b bVar) {
        return new ba.b(bVar.f38023a, (File) this.f44891b, bVar.f38025c.f6652b, ((ka.c) this.f44892c).g(bVar));
    }

    @Override // td.d
    public boolean h(Object obj, File file, td.j jVar) {
        return ((ce.b) this.f44892c).h(new ce.c(((BitmapDrawable) ((b0) obj).get()).getBitmap(), (wd.a) this.f44891b), file, jVar);
    }

    @Override // p9.o
    public boolean i(Preference preference) {
        ((PreferenceGroup) this.f44891b).f2357v0 = Integer.MAX_VALUE;
        y yVar = (y) this.f44892c;
        Handler handler = yVar.f46719e;
        aj.i iVar = yVar.f46720f;
        handler.removeCallbacks(iVar);
        handler.post(iVar);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, l.n] */
    @Override // p.b
    public void j(p.c cVar) {
        ((p.b) this.f44891b).j(cVar);
        androidx.appcompat.app.b bVar = (androidx.appcompat.app.b) this.f44892c;
        if (bVar.Y != null) {
            bVar.N.getDecorView().removeCallbacks(bVar.Z);
        }
        if (bVar.X != null) {
            w0 w0Var = bVar.f801a0;
            if (w0Var != null) {
                w0Var.b();
            }
            w0 w0VarB = s0.b(bVar.X);
            w0VarB.a(CropImageView.DEFAULT_ASPECT_RATIO);
            bVar.f801a0 = w0VarB;
            w0VarB.g(new l.t(this, 2));
        }
        bVar.P.onSupportActionModeFinished(bVar.W);
        bVar.W = null;
        ViewGroup viewGroup = bVar.f803c0;
        WeakHashMap weakHashMap = s0.f58893a;
        h0.c(viewGroup);
        bVar.J();
    }

    @Override // o20.h
    public void k(o20.e eVar, t0 t0Var) {
        ((o20.n) this.f44892c).f44536a.execute(new androidx.fragment.app.d(this, (o20.h) this.f44891b, t0Var, 13));
    }

    public boolean l(int i11) {
        wv.a aVar = (wv.a) this.f44891b;
        if (i11 == 0) {
            o00.a.P(this, "The task[%d] id is invalid, can't clear it.", Integer.valueOf(i11));
            return false;
        }
        if (x(aVar.r(i11))) {
            o00.a.P(this, "The task[%d] is downloading, can't clear it.", Integer.valueOf(i11));
            return false;
        }
        aVar.remove(i11);
        aVar.h(i11);
        return true;
    }

    @Override // ki.a
    public void m() {
        int[] iArr = bq.r.f4959a;
        String str = (String) ((kotlin.jvm.internal.y) this.f44891b).f38361a;
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        bq.m.L(str, bq.m.r(x.n().keyLanguage) + ":" + bq.m.r(x.n().locateLanguage) + "-ALPHABET.txt");
        Toast.makeText((DESyllableIntroductionActivity) this.f44892c, R.string.success, 1).show();
    }

    public boolean n(j jVar) {
        boolean zContainsKey;
        synchronized (this.f44892c) {
            zContainsKey = ((LinkedHashMap) ((b2) this.f44891b).f27b).containsKey(jVar);
        }
        return zContainsKey;
    }

    public byte[] o(i8.a aVar) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.f44892c;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f44891b;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(aVar.f34260a);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeBytes(aVar.f34261b);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(aVar.f34262c);
            dataOutputStream.writeLong(aVar.f34263d);
            dataOutputStream.write(aVar.f34264e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e8) {
            throw new RuntimeException(e8);
        }
    }

    public File p() {
        if (((File) this.f44891b) == null) {
            this.f44891b = new File(((Context) this.f44892c).getCacheDir(), "volley");
        }
        return (File) this.f44891b;
    }

    public synchronized Map q() {
        try {
            if (((Map) this.f44892c) == null) {
                this.f44892c = Collections.unmodifiableMap(new HashMap((HashMap) this.f44891b));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (Map) this.f44892c;
    }

    public long r(int i11) {
        wv.a aVar = (wv.a) this.f44891b;
        bw.c cVarR = aVar.r(i11);
        long j11 = 0;
        if (cVarR != null) {
            int i12 = cVarR.M;
            if (i12 <= 1) {
                return cVarR.f6396t.get();
            }
            ArrayList arrayListQ = aVar.q(i11);
            if (arrayListQ.size() == i12) {
                int size = arrayListQ.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayListQ.get(i13);
                    i13++;
                    bw.a aVar2 = (bw.a) obj;
                    j11 += aVar2.f6387d - aVar2.f6386c;
                }
                return j11;
            }
        }
        return 0L;
    }

    public ArrayList s(String str) {
        w9.u uVarB = w9.u.b(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        uVarB.l(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f44891b;
        workDatabase_Impl.b();
        Cursor cursorF = x.F(workDatabase_Impl, uVarB, false);
        try {
            ArrayList arrayList = new ArrayList(cursorF.getCount());
            while (cursorF.moveToNext()) {
                arrayList.add(cursorF.getString(0));
            }
            cursorF.close();
            uVarB.release();
            return arrayList;
        } catch (Throwable th2) {
            cursorF.close();
            uVarB.release();
            throw th2;
        }
    }

    public Object t(ld.b bVar) {
        return (f0) this.f44892c;
    }

    public String toString() {
        switch (this.f44890a) {
            case 14:
                return ((String) this.f44891b) + ", " + ((String) this.f44892c);
            default:
                return super.toString();
        }
    }

    public Object u(float f5, float f11, Object obj, Object obj2, float f12, float f13, float f14) {
        ld.b bVar = (ld.b) this.f44891b;
        bVar.f39903a = f5;
        bVar.f39904b = f11;
        bVar.f39905c = obj;
        bVar.f39906d = obj2;
        bVar.f39907e = f12;
        bVar.f39908f = f13;
        bVar.f39909g = f14;
        return t(bVar);
    }

    public void v(String str, String str2) {
        ArrayList arrayList = ((ed.c) this.f44892c).f25470a;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt <= 31 || cCharAt >= 127) {
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i12), str));
            }
        }
        if (str2 == null) {
            throw new IllegalArgumentException("value == null");
        }
        int length2 = str2.length();
        for (int i13 = 0; i13 < length2; i13++) {
            char cCharAt2 = str2.charAt(i13);
            if (cCharAt2 <= 31 || cCharAt2 >= 127) {
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header value: %s", Integer.valueOf(cCharAt2), Integer.valueOf(i13), str2));
            }
        }
        while (i11 < arrayList.size()) {
            if (str.equalsIgnoreCase((String) arrayList.get(i11))) {
                arrayList.remove(i11);
                arrayList.remove(i11);
                i11 -= 2;
            }
            i11 += 2;
        }
        arrayList.add(str);
        arrayList.add(str2.trim());
    }

    public uz.i w(long j11) {
        bh.t tVar = (bh.t) ((i0) this.f44891b);
        tVar.getClass();
        bh.r rVar = new bh.r(new gp.r(new bh.c(j11, tVar, (vy.d) null, 3)), this, 15);
        yz.f fVar = o0.f50940a;
        return x0.w(rVar, yz.e.f58387a);
    }

    public boolean x(bw.c cVar) {
        boolean z11;
        if (cVar != null) {
            ij.d dVar = (ij.d) this.f44892c;
            int i11 = cVar.f6390a;
            synchronized (dVar) {
                xv.f fVar = (xv.f) ((SparseArray) dVar.f34422c).get(i11);
                z11 = fVar != null && fVar.h();
            }
            if (cVar.a() < 0) {
                if (z11) {
                }
            } else if (!z11) {
                o00.a.B(6, this, null, "%d status is[%s](not finish) & but not in the pool", Integer.valueOf(cVar.f6390a), Byte.valueOf(cVar.a()));
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // o20.h
    public void y(o20.e eVar, Throwable th2) {
        ((o20.n) this.f44892c).f44536a.execute(new androidx.fragment.app.d(this, (o20.h) this.f44891b, th2, 14));
    }

    public boolean z(int i11) {
        bw.c cVarR = ((wv.a) this.f44891b).r(i11);
        int i12 = 0;
        if (cVarR == null) {
            return false;
        }
        cVarR.e((byte) -2);
        ij.d dVar = (ij.d) this.f44892c;
        dVar.f();
        synchronized (dVar) {
            try {
                xv.f fVar = (xv.f) ((SparseArray) dVar.f34422c).get(i11);
                if (fVar != null) {
                    fVar.U = true;
                    xv.g gVar = fVar.O;
                    if (gVar != null) {
                        gVar.f56608f = true;
                        xv.i iVar = gVar.f56607e;
                        if (iVar != null) {
                            iVar.m = true;
                        }
                    }
                    ArrayList arrayList = (ArrayList) fVar.N.clone();
                    int size = arrayList.size();
                    while (i12 < size) {
                        Object obj = arrayList.get(i12);
                        i12++;
                        xv.g gVar2 = (xv.g) obj;
                        if (gVar2 != null) {
                            gVar2.f56608f = true;
                            xv.i iVar2 = gVar2.f56607e;
                            if (iVar2 != null) {
                                iVar2.m = true;
                            }
                        }
                    }
                    ((ThreadPoolExecutor) dVar.f34423d).remove(fVar);
                }
                ((SparseArray) dVar.f34422c).remove(i11);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }

    public /* synthetic */ u(int i11, boolean z11) {
        this.f44890a = i11;
    }

    public /* synthetic */ u(Object obj, Object obj2, boolean z11, int i11) {
        this.f44890a = i11;
        this.f44892c = obj;
        this.f44891b = obj2;
    }

    public u(WorkDatabase_Impl workDatabase_Impl) {
        this.f44890a = 0;
        this.f44891b = workDatabase_Impl;
        this.f44892c = new b(workDatabase_Impl, 6);
        new h(workDatabase_Impl, 20);
    }

    public u(o0.t tVar, at.p pVar, o0.p pVar2) {
        this.f44890a = 9;
        this.f44891b = tVar;
        this.f44892c = pVar;
    }

    public u(f0 f0Var) {
        this.f44890a = 19;
        this.f44891b = new ld.b();
        this.f44892c = f0Var;
    }

    public u(q1 q1Var, Object obj) {
        this.f44890a = 20;
        Preconditions.k(q1Var, "status");
        this.f44891b = q1Var;
        this.f44892c = obj;
    }

    public u(int i11) {
        int i12;
        this.f44890a = i11;
        switch (i11) {
            case 5:
                this.f44891b = new HashMap();
                break;
            case 7:
                this.f44891b = new t2.d();
                this.f44892c = new t2.d();
                break;
            case 13:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f44891b = byteArrayOutputStream;
                this.f44892c = new DataOutputStream(byteArrayOutputStream);
                break;
            case 19:
                this.f44891b = new ld.b();
                this.f44892c = null;
                break;
            case 22:
                i1 i1VarC = x0.c(new qy.l(Integer.MIN_VALUE, null));
                this.f44891b = i1VarC;
                this.f44892c = new gp.r(i1VarC, 4);
                break;
            default:
                x2 x2Var = xv.c.f56595a;
                this.f44891b = x2Var.b();
                if (((b2) x2Var.c().f32184b) == null) {
                    i12 = ew.d.f25940a.f25945e;
                } else {
                    i12 = ew.d.f25940a.f25945e;
                }
                int i13 = i12;
                ij.d dVar = new ij.d(2, false);
                dVar.f34422c = new SparseArray();
                dVar.f34421b = 0;
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i13, i13, 15L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ew.b("Network"));
                threadPoolExecutor.allowCoreThreadTimeOut(true);
                dVar.f34423d = threadPoolExecutor;
                this.f44892c = dVar;
                break;
        }
    }

    @Override // ki.a
    public void B() {
    }

    public u(Context context, int i11) {
        this.f44890a = i11;
        switch (i11) {
            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                this.f44892c = context;
                this.f44891b = null;
                break;
            default:
                this.f44891b = context == null ? null : context.getApplicationContext();
                break;
        }
    }

    public u(b2 b2Var) {
        this.f44890a = 10;
        this.f44891b = b2Var;
        this.f44892c = new Object();
    }

    public u(MediaCodec.CryptoInfo cryptoInfo) {
        this.f44890a = 6;
        this.f44891b = cryptoInfo;
        this.f44892c = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public u(ArrayList arrayList, ArrayList arrayList2) {
        this.f44890a = 28;
        int size = arrayList.size();
        this.f44891b = new int[size];
        this.f44892c = new float[size];
        for (int i11 = 0; i11 < size; i11++) {
            ((int[]) this.f44891b)[i11] = ((Integer) arrayList.get(i11)).intValue();
            ((float[]) this.f44892c)[i11] = ((Float) arrayList2.get(i11)).floatValue();
        }
    }

    public u(int i11, int i12) {
        this.f44890a = 28;
        this.f44891b = new int[]{i11, i12};
        this.f44892c = new float[]{CropImageView.DEFAULT_ASPECT_RATIO, 1.0f};
    }

    public u(int i11, int i12, int i13) {
        this.f44890a = 28;
        this.f44891b = new int[]{i11, i12, i13};
        this.f44892c = new float[]{CropImageView.DEFAULT_ASPECT_RATIO, 0.5f, 1.0f};
    }

    public u(i0 courseRepository, n0 envRepository) {
        this.f44890a = 25;
        kotlin.jvm.internal.m.f(courseRepository, "courseRepository");
        kotlin.jvm.internal.m.f(envRepository, "envRepository");
        this.f44891b = courseRepository;
        this.f44892c = envRepository;
    }
}
