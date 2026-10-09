package bq;

import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaRecorder;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.facebook.login.widget.LoginButton;
import com.facebook.login.widget.ProfilePictureView;
import com.getkeepsafe.relinker.MissingLibraryException;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.speak.adapter.SpeakTryAdapter;
import com.lingo.lingoskill.speak.object.PodSentence;
import com.lingodeer.R;
import com.lingodeer.data.model.SRSStatus;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import hh.p0;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import lf.v0;
import m00.a0;
import mt.b6;
import mt.k4;
import n9.a2;
import n9.b2;
import n9.z1;
import ot.f2;
import ot.g2;
import ot.h2;
import ot.i2;
import qy.b0;
import re.e0;
import rt.ae;
import rt.ud;
import rt.vd;
import rt.wd;
import rt.xd;
import rt.zd;
import rz.g1;
import uz.i1;
import uz.r0;
import uz.x0;
import wt.c0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements pe.g, uw.k, tx.c, x7.o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f4942e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f4943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f4944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f4945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f4946d;

    public f(int i11, boolean z11) {
        switch (i11) {
            case 7:
                this.f4944b = new Object();
                this.f4946d = new ArrayList();
                this.f4945c = new ArrayList();
                this.f4943a = true;
                break;
            case 16:
                v0.m();
                lf.e eVar = new lf.e(this, 5);
                this.f4944b = eVar;
                x6.b bVarA = x6.b.a(re.s.a());
                kotlin.jvm.internal.m.e(bVarA, "getInstance(FacebookSdk.getApplicationContext())");
                this.f4945c = bVarA;
                if (!this.f4943a) {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
                    bVarA.b(eVar, intentFilter);
                    this.f4943a = true;
                    break;
                }
                break;
            case 18:
                this.f4944b = new float[16];
                this.f4945c = new float[16];
                this.f4946d = new ar.f(1, (byte) 0);
                break;
            case 22:
                e0 e0Var = new e0(17);
                re.v vVar = new re.v(17);
                this.f4944b = new HashSet();
                this.f4945c = e0Var;
                this.f4946d = vVar;
                break;
            default:
                this.f4946d = new ArrayList();
                break;
        }
    }

    public static void e(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f5 = fArr2[10];
        float f11 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f11 * f11) + (f5 * f5));
        float f12 = fArr2[10] / fSqrt;
        fArr[0] = f12;
        float f13 = fArr2[8];
        fArr[2] = f13 / fSqrt;
        fArr[8] = (-f13) / fSqrt;
        fArr[10] = f12;
    }

    public static void j(String str, Object... objArr) {
        String.format(Locale.US, str, objArr);
    }

    public void a() {
        rd.c.a((rd.c) this.f4946d, this, false);
    }

    @Override // tx.c
    public void accept(Object obj) {
        int i11;
        Long it = (Long) obj;
        PodSentence podSentence = (PodSentence) this.f4946d;
        FlexboxLayout flexboxLayout = (FlexboxLayout) this.f4945c;
        kotlin.jvm.internal.m.f(it, "it");
        SpeakTryAdapter speakTryAdapter = (SpeakTryAdapter) this.f4944b;
        th.e eVar = speakTryAdapter.f22014a;
        th.e eVar2 = speakTryAdapter.f22014a;
        if (!eVar.f()) {
            if (!this.f4943a || podSentence == null) {
                speakTryAdapter.f(flexboxLayout);
            } else {
                speakTryAdapter.b(flexboxLayout, podSentence);
            }
            rx.b bVar = speakTryAdapter.f22019f;
            if (bVar != null) {
                bVar.dispose();
            }
            speakTryAdapter.f22019f = null;
            return;
        }
        long jC = eVar2.c();
        long jD = eVar2.d();
        int childCount = flexboxLayout.getChildCount();
        int i12 = 0;
        while (true) {
            i11 = R.id.tv_top;
            if (i12 >= childCount) {
                break;
            }
            View childAt = flexboxLayout.getChildAt(i12);
            TextView textView = (TextView) childAt.findViewById(R.id.tv_top);
            TextView textView2 = (TextView) childAt.findViewById(R.id.tv_middle);
            TextView textView3 = (TextView) childAt.findViewById(R.id.tv_bottom);
            Context context = ((BaseQuickAdapter) speakTryAdapter).mContext;
            kotlin.jvm.internal.m.e(context, "access$getMContext$p$s-1721133466(...)");
            textView.setTextColor(context.getColor(R.color.second_black));
            Context context2 = ((BaseQuickAdapter) speakTryAdapter).mContext;
            kotlin.jvm.internal.m.e(context2, "access$getMContext$p$s-1721133466(...)");
            textView2.setTextColor(context2.getColor(R.color.primary_black));
            Context context3 = ((BaseQuickAdapter) speakTryAdapter).mContext;
            kotlin.jvm.internal.m.e(context3, "access$getMContext$p$s-1721133466(...)");
            textView3.setTextColor(context3.getColor(R.color.second_black));
            i12++;
        }
        kotlin.jvm.internal.m.c(podSentence);
        List words = podSentence.getWords();
        kotlin.jvm.internal.m.c(words);
        int size = words.size();
        int i13 = 0;
        while (i13 < size) {
            op.b bVar2 = (op.b) podSentence.getWords().get(i13);
            if (!TextUtils.isEmpty(bVar2.getBegin()) && ((int) (Float.valueOf(bVar2.getBegin()).floatValue() * jD)) <= jC) {
                View childAt2 = flexboxLayout.getChildAt(i13);
                TextView textView4 = (TextView) childAt2.findViewById(i11);
                TextView textView5 = (TextView) childAt2.findViewById(R.id.tv_middle);
                TextView textView6 = (TextView) childAt2.findViewById(R.id.tv_bottom);
                Context context4 = ((BaseQuickAdapter) speakTryAdapter).mContext;
                kotlin.jvm.internal.m.e(context4, "access$getMContext$p$s-1721133466(...)");
                textView4.setTextColor(context4.getColor(R.color.color_5893DD));
                Context context5 = ((BaseQuickAdapter) speakTryAdapter).mContext;
                kotlin.jvm.internal.m.e(context5, "access$getMContext$p$s-1721133466(...)");
                textView5.setTextColor(context5.getColor(R.color.color_5893DD));
                ep.a.z(((BaseQuickAdapter) speakTryAdapter).mContext, "access$getMContext$p$s-1721133466(...)", R.color.color_5893DD, textView6);
            }
            i13++;
            i11 = R.id.tv_top;
        }
    }

    @Override // uw.k
    public void b(ww.b bVar) {
        zw.c cVar = (zw.c) this.f4946d;
        while (true) {
            ww.b bVar2 = (ww.b) cVar.get();
            if (bVar2 == zw.a.DISPOSED) {
                if (bVar != null) {
                    bVar.dispose();
                    return;
                }
                return;
            } else {
                do {
                    if (cVar.compareAndSet(bVar2, bVar)) {
                        if (bVar2 != null) {
                            bVar2.dispose();
                            return;
                        }
                        return;
                    }
                } while (cVar.get() == bVar2);
            }
        }
    }

    public List c() {
        Object value;
        i1 i1Var = (i1) this.f4945c;
        ae aeVar = (ae) i1Var.getValue();
        zd zdVar = aeVar.f49469d;
        xd xdVar = xd.f50663a;
        boolean zA = kotlin.jvm.internal.m.a(zdVar, xdVar);
        ry.r rVar = ry.r.f50854a;
        if (zA || aeVar.c() == 0) {
            return rVar;
        }
        h2 h2Var = (h2) this.f4944b;
        List listZ = h2Var != null ? nz.n.Z(nz.n.W(nz.n.R(ry.m.g0(h2Var.b()), new b6(28)), new b6(29))) : null;
        if (listZ == null) {
            listZ = rVar;
        }
        do {
            value = i1Var.getValue();
        } while (!i1Var.j(value, ae.a((ae) value, null, null, listZ.isEmpty() ? vd.f50556a : xdVar, 7)));
        return listZ;
    }

    public void d(boolean z11) {
        yb.e eVar = (yb.e) this.f4946d;
        synchronized (eVar) {
            try {
                if (this.f4943a) {
                    throw new IllegalStateException("editor is closed");
                }
                if (kotlin.jvm.internal.m.a(((yb.b) this.f4944b).f57572g, this)) {
                    yb.e.a(eVar, this, z11);
                }
                this.f4943a = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public a0 f(int i11) {
        a0 a0Var;
        yb.e eVar = (yb.e) this.f4946d;
        synchronized (eVar) {
            if (this.f4943a) {
                throw new IllegalStateException("editor is closed");
            }
            ((boolean[]) this.f4945c)[i11] = true;
            Object obj = ((yb.b) this.f4944b).f57569d.get(i11);
            yb.d dVar = eVar.R;
            a0 a0Var2 = (a0) obj;
            if (!dVar.h(a0Var2)) {
                kc.h.a(dVar.x(a0Var2));
            }
            a0Var = (a0) obj;
        }
        return a0Var;
    }

    public File g() {
        File file;
        synchronized (((rd.c) this.f4946d)) {
            try {
                rd.b bVar = (rd.b) this.f4944b;
                if (bVar.f49094f != this) {
                    throw new IllegalStateException();
                }
                if (!bVar.f49093e) {
                    ((boolean[]) this.f4945c)[0] = true;
                }
                file = bVar.f49092d[0];
                ((rd.c) this.f4946d).f49096a.mkdirs();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return file;
    }

    @Override // pe.g
    public Object get() {
        if (this.f4943a) {
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
        Trace.beginSection(v10.c.L("Glide registry"));
        this.f4943a = true;
        try {
            return j3.l((com.bumptech.glide.c) this.f4944b, (List) this.f4945c, (com.bumptech.glide.g) this.f4946d);
        } finally {
            this.f4943a = false;
            Trace.endSection();
        }
    }

    public File h(Context context, String str) {
        ((e0) this.f4945c).getClass();
        return new File(context.getDir("lib", 0), e0.h(str));
    }

    public void i(Context context, String str) throws Throwable {
        ag.c cVar;
        String[] strArrX;
        InputStream inputStream;
        InputStream inputStream2;
        FileOutputStream fileOutputStream;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        j("Beginning load of %s...", str);
        e0 e0Var = (e0) this.f4945c;
        HashSet hashSet = (HashSet) this.f4944b;
        if (hashSet.contains(str)) {
            j("%s already loaded previously!", str);
            return;
        }
        qp.b bVar = null;
        try {
            e0Var.getClass();
            System.loadLibrary(str);
            hashSet.add(str);
            j("%s (%s) was loaded normally!", str, null);
        } catch (UnsatisfiedLinkError e8) {
            j("Loading the library normally failed: %s", Log.getStackTraceString(e8));
            j("%s (%s) was not loaded normally, re-linking...", str, null);
            File fileH = h(context, str);
            if (!fileH.exists()) {
                File dir = context.getDir("lib", 0);
                File fileH2 = h(context, str);
                e0Var.getClass();
                File[] fileArrListFiles = dir.listFiles(new zf.a(e0.h(str)));
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        if (!file.getAbsolutePath().equals(fileH2.getAbsolutePath())) {
                            file.delete();
                        }
                    }
                }
                re.v vVar = (re.v) this.f4946d;
                String[] strArr = Build.SUPPORTED_ABIS;
                if (strArr.length <= 0) {
                    String str2 = Build.CPU_ABI2;
                    strArr = (str2 == null || str2.length() == 0) ? new String[]{Build.CPU_ABI} : new String[]{Build.CPU_ABI, str2};
                }
                String strH = e0.h(str);
                vVar.getClass();
                try {
                    qp.b bVarT = re.v.t(context, strArr, strH);
                    try {
                        if (bVarT == null) {
                            try {
                                strArrX = re.v.x(context, strH);
                            } catch (Exception e10) {
                                strArrX = new String[]{e10.toString()};
                            }
                            StringBuilder sbQ = p0.q("Could not find '", strH, "'. Looked for: ");
                            sbQ.append(Arrays.toString(strArr));
                            sbQ.append(", but only found: ");
                            throw new MissingLibraryException(ep.a.k(sbQ, Arrays.toString(strArrX), "."));
                        }
                        ZipFile zipFile = (ZipFile) bVarT.f47832b;
                        int i11 = 0;
                        while (true) {
                            int i12 = i11 + 1;
                            if (i11 >= 5) {
                                break;
                            }
                            j("Found %s! Extracting...", strH);
                            try {
                                if (fileH.exists() || fileH.createNewFile()) {
                                    try {
                                        inputStream2 = zipFile.getInputStream((ZipEntry) bVarT.f47833c);
                                        try {
                                            fileOutputStream = new FileOutputStream(fileH);
                                            try {
                                                byte[] bArr = new byte[4096];
                                                long j11 = 0;
                                                while (true) {
                                                    int i13 = inputStream2.read(bArr);
                                                    if (i13 == -1) {
                                                        break;
                                                    }
                                                    fileOutputStream.write(bArr, 0, i13);
                                                    j11 += (long) i13;
                                                    inputStream2 = inputStream2;
                                                }
                                                fileOutputStream.flush();
                                                try {
                                                    fileOutputStream.getFD().sync();
                                                    if (j11 == fileH.length()) {
                                                        re.v.n(inputStream2);
                                                        re.v.n(fileOutputStream);
                                                        fileH.setReadable(true, false);
                                                        fileH.setExecutable(true, false);
                                                        fileH.setWritable(true);
                                                        break;
                                                    }
                                                } catch (FileNotFoundException | IOException unused) {
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    inputStream = inputStream2;
                                                    re.v.n(inputStream);
                                                    re.v.n(fileOutputStream);
                                                    throw th;
                                                }
                                            } catch (FileNotFoundException unused2) {
                                                inputStream2 = inputStream2;
                                            } catch (IOException unused3) {
                                                inputStream2 = inputStream2;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                inputStream = inputStream2;
                                            }
                                        } catch (FileNotFoundException unused4) {
                                            fileOutputStream = null;
                                            re.v.n(inputStream2);
                                            re.v.n(fileOutputStream);
                                            i11 = i12;
                                        } catch (IOException unused5) {
                                            fileOutputStream = null;
                                            re.v.n(inputStream2);
                                            re.v.n(fileOutputStream);
                                            i11 = i12;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            inputStream = inputStream2;
                                            fileOutputStream = null;
                                            re.v.n(inputStream);
                                            re.v.n(fileOutputStream);
                                            throw th;
                                        }
                                    } catch (FileNotFoundException unused6) {
                                        inputStream2 = null;
                                    } catch (IOException unused7) {
                                        inputStream2 = null;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        inputStream = null;
                                    }
                                    re.v.n(inputStream2);
                                    re.v.n(fileOutputStream);
                                }
                            } catch (IOException unused8) {
                            }
                            i11 = i12;
                        }
                        try {
                            zipFile.close();
                        } catch (IOException unused9) {
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        bVar = bVarT;
                        if (bVar != null) {
                            try {
                                ((ZipFile) bVar.f47832b).close();
                            } catch (IOException unused10) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th7) {
                    th = th7;
                }
            }
            try {
                if (this.f4943a) {
                    try {
                        cVar = new ag.c(fileH);
                        try {
                            List<String> listB = cVar.b();
                            cVar.close();
                            for (String str3 : listB) {
                                e0Var.getClass();
                                i(context, str3.substring(3, str3.length() - 3));
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            if (cVar != null) {
                                cVar.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        cVar = null;
                    }
                }
            } catch (IOException unused11) {
            }
            String absolutePath = fileH.getAbsolutePath();
            e0Var.getClass();
            System.load(absolutePath);
            hashSet.add(str);
            j("%s (%s) was re-linked!", str, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object k(g1 g1Var, xy.c cVar) {
        a2 a2Var;
        a00.e eVar;
        f fVar;
        if (cVar instanceof a2) {
            a2Var = (a2) cVar;
            int i11 = a2Var.f43494f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                a2Var.f43494f = i11 - Integer.MIN_VALUE;
            } else {
                a2Var = new a2(this, cVar);
            }
        } else {
            a2Var = new a2(this, cVar);
        }
        Object obj = a2Var.f43492d;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = a2Var.f43494f;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            eVar = (a00.e) this.f4945c;
            a2Var.f43489a = this;
            a2Var.f43490b = g1Var;
            a2Var.f43491c = eVar;
            a2Var.f43494f = 1;
            if (eVar.b(a2Var) == aVar) {
                return aVar;
            }
            fVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a00.e eVar2 = a2Var.f43491c;
            g1 g1Var2 = a2Var.f43490b;
            fVar = a2Var.f43489a;
            com.bumptech.glide.e.F(obj);
            eVar = eVar2;
            g1Var = g1Var2;
        }
        try {
            if (g1Var == ((g1) fVar.f4946d)) {
                fVar.f4946d = null;
            }
            return b0.f48488a;
        } finally {
            eVar.a(null);
        }
    }

    public void l(ViewGroup viewGroup) {
        py.a aVar = (py.a) this.f4946d;
        aVar.f47207a = viewGroup.getMeasuredWidth();
        aVar.f47208b = viewGroup.getMeasuredHeight();
        if (this.f4943a) {
            py.c.f47213e.execute(new py.b(new py.c(viewGroup, aVar, new ob.c(this, viewGroup)), 0));
            return;
        }
        Resources resources = ((Context) this.f4945c).getResources();
        viewGroup.setDrawingCacheEnabled(true);
        viewGroup.destroyDrawingCache();
        viewGroup.setDrawingCacheQuality(524288);
        Bitmap drawingCache = viewGroup.getDrawingCache();
        Bitmap bitmapZ = com.bumptech.glide.d.z(viewGroup.getContext(), drawingCache, aVar);
        drawingCache.recycle();
        BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, bitmapZ);
        View view = (View) this.f4944b;
        view.setBackground(bitmapDrawable);
        viewGroup.addView(view);
    }

    public void m(List items) {
        kotlin.jvm.internal.m.f(items, "items");
        i1 i1Var = (i1) this.f4945c;
        if (((ae) i1Var.getValue()).f49466a) {
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = items.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((ud) it.next()).f50502a);
        }
        for (i2 i2Var : u()) {
            h2 h2Var = (h2) this.f4944b;
            if (h2Var != null) {
                String str = i2Var.f45854a;
                h2Var.a(str, linkedHashSet.contains(str));
            }
        }
        ArrayList arrayList = new ArrayList(ry.n.W(items, 10));
        Iterator it2 = items.iterator();
        while (it2.hasNext()) {
            arrayList.add(ud.a((ud) it2.next(), 0L, true, 127));
        }
        ae aeVar = new ae(12, arrayList);
        i1Var.getClass();
        i1Var.l(null, aeVar);
    }

    public SRSStatus n(String id2, c0 rating) {
        kotlin.jvm.internal.m.f(id2, "id");
        kotlin.jvm.internal.m.f(rating, "rating");
        h2 h2Var = (h2) this.f4944b;
        if (h2Var == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = h2Var.f45842e;
        SRSStatus sRSStatus = (SRSStatus) linkedHashMap.get(id2);
        if (sRSStatus == null) {
            return null;
        }
        SRSStatus sRSStatusCopy$default = SRSStatus.copy$default((SRSStatus) h2Var.f45838a.invoke(SRSStatus.copy$default(sRSStatus, null, 0L, 0L, 0, null, null, 0L, null, false, null, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, 0, 0, 0L, false, null, 2097151, null), rating), null, 0L, 0L, 0, null, null, 0L, null, false, null, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, 0, 0, 0L, false, null, 2097151, null);
        linkedHashMap.put(id2, sRSStatusCopy$default);
        h2Var.f45845h.put(id2, rating);
        int i11 = g2.f45827a[rating.ordinal()];
        if (i11 == 1) {
            h2Var.f45843f.add(id2);
        } else if (i11 == 2) {
            h2Var.f45844g.add(id2);
        }
        return SRSStatus.copy$default(sRSStatusCopy$default, null, 0L, 0L, 0, null, null, 0L, null, false, null, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, 0, 0, 0L, false, null, 2097151, null);
    }

    @Override // x7.o
    public void o() {
        SparseArray sparseArray = (SparseArray) this.f4946d;
        ((x7.o) this.f4944b).o();
        if (this.f4943a) {
            for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                ((u8.l) sparseArray.valueAt(i11)).f52851i = true;
            }
        }
    }

    @Override // uw.k
    public void onComplete() {
        if (!this.f4943a) {
            ((uw.k) this.f4944b).onComplete();
        } else {
            this.f4943a = false;
            ((hx.i) this.f4945c).J(this);
        }
    }

    @Override // uw.k
    public void onError(Throwable th2) {
        ((uw.k) this.f4944b).onError(th2);
    }

    @Override // uw.k
    public void onNext(Object obj) {
        if (this.f4943a) {
            this.f4943a = false;
        }
        ((uw.k) this.f4944b).onNext(obj);
    }

    public void p() {
        b7.a0 a0Var = (b7.a0) this.f4946d;
        if (this.f4943a) {
            a0Var.c(new b2.a(this, 12));
            this.f4943a = false;
        }
    }

    @Override // x7.o
    public void q(x7.y yVar) {
        ((x7.o) this.f4944b).q(yVar);
    }

    public void r(String filePath) {
        File parentFile;
        kotlin.jvm.internal.m.f(filePath, "filePath");
        MediaRecorder mediaRecorder = (MediaRecorder) this.f4945c;
        if (mediaRecorder == null) {
            this.f4945c = new MediaRecorder();
        } else {
            mediaRecorder.reset();
        }
        File parentFile2 = new File(filePath).getParentFile();
        if (parentFile2 != null && !parentFile2.exists() && (parentFile = new File(filePath).getParentFile()) != null) {
            parentFile.mkdirs();
        }
        MediaRecorder mediaRecorder2 = (MediaRecorder) this.f4945c;
        if (mediaRecorder2 != null) {
            try {
                mediaRecorder2.setAudioSource(1);
                mediaRecorder2.setOutputFormat(2);
                mediaRecorder2.setOutputFile(filePath);
                mediaRecorder2.setAudioEncoder(3);
                mediaRecorder2.setAudioEncodingBitRate(128000);
                mediaRecorder2.setAudioSamplingRate(44100);
                mediaRecorder2.setMaxDuration(600000);
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            mediaRecorder2.setOnInfoListener(new av.a(this, 1));
            try {
                mediaRecorder2.prepare();
                mediaRecorder2.start();
                this.f4943a = true;
            } catch (Exception e10) {
                e10.printStackTrace();
                t();
            }
        }
    }

    public List s(List currentStatuses) {
        List listZ;
        kotlin.jvm.internal.m.f(currentStatuses, "currentStatuses");
        h2 h2Var = (h2) this.f4944b;
        if (h2Var != null) {
            long jLongValue = ((Number) h2Var.f45839b.invoke()).longValue();
            int iW = ry.x.W(ry.n.W(currentStatuses, 10));
            if (iW < 16) {
                iW = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iW);
            for (Object obj : currentStatuses) {
                linkedHashMap.put(((SRSStatus) obj).getId(), obj);
            }
            listZ = nz.n.Z(nz.n.X(nz.n.R(ry.m.g0(h2Var.b()), new f2(0)), new k4(linkedHashMap, jLongValue, 2)));
        } else {
            listZ = null;
        }
        return listZ == null ? ry.r.f50854a : listZ;
    }

    public void t() {
        ArrayList arrayList = (ArrayList) this.f4946d;
        Iterator it = arrayList.iterator();
        kotlin.jvm.internal.m.e(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            kotlin.jvm.internal.m.e(next, "next(...)");
            MediaRecorder mediaRecorder = (MediaRecorder) next;
            try {
                mediaRecorder.stop();
                mediaRecorder.release();
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
        arrayList.clear();
        MediaRecorder mediaRecorder2 = (MediaRecorder) this.f4945c;
        if (mediaRecorder2 != null) {
            try {
                mediaRecorder2.stop();
                mediaRecorder2.release();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        this.f4945c = null;
        fz.a aVar = (fz.a) this.f4944b;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f4943a = false;
        this.f4944b = null;
    }

    public List u() {
        h2 h2Var = (h2) this.f4944b;
        List listB = h2Var != null ? h2Var.b() : null;
        return listB == null ? ry.r.f50854a : listB;
    }

    @Override // x7.o
    public x7.e0 v(int i11, int i12) {
        SparseArray sparseArray = (SparseArray) this.f4946d;
        x7.o oVar = (x7.o) this.f4944b;
        if (i12 != 3) {
            this.f4943a = true;
            return oVar.v(i11, i12);
        }
        u8.l lVar = (u8.l) sparseArray.get(i11);
        if (lVar != null) {
            return lVar;
        }
        u8.l lVar2 = new u8.l(oVar.v(i11, i12), (u8.i) this.f4945c);
        sparseArray.put(i11, lVar2);
        return lVar2;
    }

    public void w() {
        Object value;
        ae aeVar;
        ArrayList arrayList;
        i1 i1Var = (i1) this.f4945c;
        ae aeVar2 = (ae) i1Var.getValue();
        if (kotlin.jvm.internal.m.a(aeVar2.f49469d, xd.f50663a)) {
            return;
        }
        boolean z11 = !aeVar2.b();
        for (ud udVar : aeVar2.f49467b) {
            h2 h2Var = (h2) this.f4944b;
            if (h2Var != null) {
                h2Var.a(udVar.f50502a, z11);
            }
        }
        do {
            value = i1Var.getValue();
            aeVar = (ae) value;
            List list = aeVar.f49467b;
            arrayList = new ArrayList(ry.n.W(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(ud.a((ud) it.next(), 0L, z11, 127));
            }
        } while (!i1Var.j(value, ae.a(aeVar, arrayList, null, wd.f50596a, 5)));
    }

    public void x(String id2) {
        Object next;
        Object value;
        ae aeVar;
        ArrayList arrayList;
        kotlin.jvm.internal.m.f(id2, "id");
        i1 i1Var = (i1) this.f4945c;
        ae aeVar2 = (ae) i1Var.getValue();
        if (kotlin.jvm.internal.m.a(aeVar2.f49469d, xd.f50663a)) {
            return;
        }
        Iterator it = aeVar2.f49467b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.m.a(((ud) next).f50502a, id2));
        ud udVar = (ud) next;
        if (udVar == null) {
            return;
        }
        h2 h2Var = (h2) this.f4944b;
        if (h2Var != null) {
            h2Var.a(id2, !udVar.f50509h);
        }
        do {
            value = i1Var.getValue();
            aeVar = (ae) value;
            List<ud> list = aeVar.f49467b;
            arrayList = new ArrayList(ry.n.W(list, 10));
            for (ud udVarA : list) {
                if (kotlin.jvm.internal.m.a(udVarA.f50502a, id2)) {
                    udVarA = ud.a(udVarA, 0L, !udVarA.f50509h, 127);
                }
                arrayList.add(udVarA);
            }
        } while (!i1Var.j(value, ae.a(aeVar, arrayList, null, wd.f50596a, 5)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [rz.g1] */
    /* JADX WARN: Type inference failed for: r10v1, types: [a00.a] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v4, types: [a00.a] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [rz.g1] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    public Object y(g1 g1Var, xy.c cVar) {
        b2 b2Var;
        f fVar;
        ?? r9;
        a00.a aVar;
        ?? r11;
        f fVar2;
        if (cVar instanceof b2) {
            b2Var = (b2) cVar;
            int i11 = b2Var.f43504f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                b2Var.f43504f = i11 - Integer.MIN_VALUE;
            } else {
                b2Var = new b2(this, cVar);
            }
        } else {
            b2Var = new b2(this, cVar);
        }
        Object obj = b2Var.f43502d;
        wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
        int i12 = b2Var.f43504f;
        boolean z11 = true;
        try {
            if (i12 == 0) {
                com.bumptech.glide.e.F(obj);
                a00.e eVar = (a00.e) this.f4945c;
                b2Var.f43499a = this;
                b2Var.f43500b = g1Var;
                b2Var.f43501c = eVar;
                b2Var.f43504f = 1;
                if (eVar.b(b2Var) != aVar2) {
                    fVar = this;
                    r9 = g1Var;
                    aVar = eVar;
                }
                return aVar2;
            }
            if (i12 == 1) {
                a00.a aVar3 = b2Var.f43501c;
                g1 g1Var2 = b2Var.f43500b;
                fVar = b2Var.f43499a;
                com.bumptech.glide.e.F(obj);
                r9 = g1Var2;
                aVar = aVar3;
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a00.a aVar4 = b2Var.f43501c;
                g1 g1Var3 = b2Var.f43500b;
                fVar2 = b2Var.f43499a;
                com.bumptech.glide.e.F(obj);
                r11 = g1Var3;
                aVar = aVar4;
            }
            fVar = fVar2;
            r9 = r11;
            fVar.f4946d = r9;
            g1Var = aVar;
            Boolean boolValueOf = Boolean.valueOf(z11);
            g1Var.a(null);
            return boolValueOf;
            g1 g1Var4 = (g1) fVar.f4946d;
            if (g1Var4 == null || !g1Var4.isActive() || fVar.f4943a) {
                if (g1Var4 != null) {
                    g1Var4.cancel(new z1((lp.b) fVar.f4944b));
                }
                if (g1Var4 != null) {
                    b2Var.f43499a = fVar;
                    b2Var.f43500b = r9;
                    b2Var.f43501c = aVar;
                    b2Var.f43504f = 2;
                    if (g1Var4.join(b2Var) != aVar2) {
                        r11 = r9;
                        fVar2 = fVar;
                        aVar = aVar;
                        fVar = fVar2;
                        r9 = r11;
                    }
                    return aVar2;
                }
                fVar.f4946d = r9;
                g1Var = aVar;
            } else {
                z11 = false;
                g1Var = aVar;
            }
            Boolean boolValueOf2 = Boolean.valueOf(z11);
            g1Var.a(null);
            return boolValueOf2;
        } catch (Throwable th2) {
            g1Var.a(null);
            throw th2;
        }
    }

    public void z(long j11, String id2) {
        SRSStatus sRSStatus;
        Object next;
        SRSStatus sRSStatus2;
        Object value;
        ae aeVar;
        ArrayList arrayList;
        kotlin.jvm.internal.m.f(id2, "id");
        h2 h2Var = (h2) this.f4944b;
        if (h2Var == null || (sRSStatus = (SRSStatus) h2Var.f45841d.get(id2)) == null) {
            return;
        }
        List listB = h2Var.b();
        if (listB.isEmpty()) {
            return;
        }
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.m.a(((i2) it.next()).f45854a, id2)) {
                h2Var.f45846i.put(id2, Long.valueOf(Math.min(j11, sRSStatus.getNextReviewTime())));
                Iterator it2 = u().iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!kotlin.jvm.internal.m.a(((i2) next).f45854a, id2));
                i2 i2Var = (i2) next;
                if (i2Var == null || (sRSStatus2 = i2Var.f45856c) == null) {
                    return;
                }
                long nextReviewTime = sRSStatus2.getNextReviewTime();
                i1 i1Var = (i1) this.f4945c;
                do {
                    value = i1Var.getValue();
                    aeVar = (ae) value;
                    List<ud> list = aeVar.f49467b;
                    arrayList = new ArrayList(ry.n.W(list, 10));
                    for (ud udVarA : list) {
                        if (kotlin.jvm.internal.m.a(udVarA.f50502a, id2)) {
                            udVarA = ud.a(udVarA, nextReviewTime, false, 191);
                        }
                        arrayList.add(udVarA);
                    }
                } while (!i1Var.j(value, ae.a(aeVar, arrayList, null, wd.f50596a, 5)));
                return;
            }
        }
    }

    public f(ProfilePictureView profilePictureView) {
        this.f4946d = profilePictureView;
        v0.m();
        lf.e eVar = new lf.e(this, 8);
        this.f4944b = eVar;
        x6.b bVarA = x6.b.a(re.s.a());
        kotlin.jvm.internal.m.e(bVarA, "getInstance(FacebookSdk.getApplicationContext())");
        this.f4945c = bVarA;
        if (this.f4943a) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        bVarA.b(eVar, intentFilter);
        this.f4943a = true;
    }

    public f(x00.i iVar, z00.t tVar, a9.e eVar) {
        this.f4943a = false;
        this.f4944b = iVar;
        this.f4945c = tVar;
        this.f4946d = eVar;
    }

    public f(Context context) {
        this.f4945c = context;
        View view = new View(context);
        this.f4944b = view;
        view.setTag("e");
        py.a aVar = new py.a();
        aVar.f47209c = 25;
        aVar.f47210d = 1;
        this.f4946d = aVar;
    }

    public f(x7.o oVar, u8.i iVar) {
        this.f4944b = oVar;
        this.f4945c = iVar;
        this.f4946d = new SparseArray();
    }

    public f(h2 h2Var) {
        this.f4944b = h2Var;
        i1 i1VarC = x0.c(new ae(15, null));
        this.f4945c = i1VarC;
        this.f4946d = new r0(i1VarC);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(LoginButton loginButton) {
        this(16, false);
        this.f4946d = loginButton;
    }

    public f(yb.e eVar, yb.b bVar) {
        this.f4946d = eVar;
        this.f4944b = bVar;
        this.f4945c = new boolean[2];
    }

    public f(rd.c cVar, rd.b bVar) {
        this.f4946d = cVar;
        this.f4944b = bVar;
        this.f4945c = bVar.f49093e ? null : new boolean[cVar.f49102t];
    }
}
