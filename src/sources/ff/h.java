package ff;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.InputEvent;
import android.widget.TextView;
import android.widget.Toast;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.k0;
import androidx.fragment.app.k1;
import androidx.fragment.app.p0;
import b7.e0;
import b7.f0;
import b7.v;
import b7.w;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.Inflater;
import kd.k;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.TimeoutCancellationException;
import l1.b1;
import l1.t;
import n3.a0;
import n3.s;
import ns.o;
import oz.q;
import oz.x;
import qy.b0;
import rt.ed;
import rt.sb;
import rt.sf;
import ry.l;
import ry.r;
import xq.n;
import y.u;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Toast f27249a;

    public static final void A(p0 p0Var, k0 k0Var) {
        m.f(p0Var, "<this>");
        k0 k0VarD = p0Var.getSupportFragmentManager().D(k0Var.getClass().getSimpleName());
        if (k0VarD == null) {
            k1 supportFragmentManager = p0Var.getSupportFragmentManager();
            m.e(supportFragmentManager, "getSupportFragmentManager(...)");
            k0 k0VarD2 = supportFragmentManager.D(k0Var.getClass().getSimpleName());
            if (k0VarD2 == null || !k0VarD2.isAdded()) {
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                aVar.e(R.id.fl_container, k0Var, k0Var.getClass().getSimpleName());
                aVar.i(true, true);
                return;
            }
            return;
        }
        try {
            k1 supportFragmentManager2 = p0Var.getSupportFragmentManager();
            supportFragmentManager2.getClass();
            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager2);
            aVar2.n(k0VarD);
            aVar2.i(true, true);
        } catch (Exception unused) {
            k1 supportFragmentManager3 = p0Var.getSupportFragmentManager();
            m.e(supportFragmentManager3, "getSupportFragmentManager(...)");
            k0 k0VarD3 = supportFragmentManager3.D(k0Var.getClass().getSimpleName());
            if (k0VarD3 == null || !k0VarD3.isAdded()) {
                androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(supportFragmentManager3);
                aVar3.e(R.id.fl_container, k0Var, k0Var.getClass().getSimpleName());
                aVar3.i(true, true);
            }
        }
    }

    public static final void B(Context context, int i11) {
        m.f(context, "context");
        try {
            if (f27249a == null) {
                f27249a = Build.VERSION.SDK_INT == 25 ? Toast.makeText(context, y(context, i11), 0) : Toast.makeText(context, y(context, i11), 0);
            }
            Toast toast = f27249a;
            if (toast != null) {
                toast.setText(y(context, i11));
            }
            Toast toast2 = f27249a;
            if (toast2 != null) {
                toast2.show();
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public static final void C(String str) {
        Toast toastMakeText;
        try {
            if (f27249a == null) {
                if (Build.VERSION.SDK_INT == 25) {
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    m.c(lingoSkillApplication);
                    toastMakeText = Toast.makeText(lingoSkillApplication, str, 0);
                } else {
                    LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                    m.c(lingoSkillApplication2);
                    toastMakeText = Toast.makeText(lingoSkillApplication2, str, 0);
                }
                f27249a = toastMakeText;
            }
            Toast toast = f27249a;
            if (toast != null) {
                toast.setText(str);
            }
            Toast toast2 = f27249a;
            if (toast2 != null) {
                toast2.show();
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public static final a D(a x11, int i11) {
        a aVar;
        a aVar2 = null;
        if (qf.a.b(h.class)) {
            return null;
        }
        try {
            m.f(x11, "x");
            int[] iArr = x11.f27220a;
            int i12 = 0;
            int i13 = iArr[0];
            int i14 = iArr[1];
            int i15 = iArr[2];
            int i16 = (i14 - i11) + 1;
            a aVar3 = new a(new int[]{i13, i16, i15});
            float[] fArr = x11.f27222c;
            float[] fArr2 = aVar3.f27222c;
            int i17 = 0;
            while (i17 < i13) {
                int i18 = i12;
                while (i18 < i15) {
                    int i19 = i12;
                    while (i19 < i16) {
                        int i21 = i19 * i15;
                        int i22 = (i17 * i16 * i15) + i21 + i18;
                        int i23 = (i17 * i14 * i15) + i21 + i18;
                        fArr2[i22] = Float.MIN_VALUE;
                        int i24 = i12;
                        while (i24 < i11) {
                            aVar = aVar2;
                            try {
                                fArr2[i22] = Math.max(fArr2[i22], fArr[(i24 * i15) + i23]);
                                i24++;
                                aVar2 = aVar;
                            } catch (Throwable th2) {
                                th = th2;
                                qf.a.a(h.class, th);
                                return aVar;
                            }
                        }
                        i19++;
                        i12 = 0;
                    }
                    i18++;
                    i12 = 0;
                }
                i17++;
                i12 = 0;
            }
            return aVar3;
        } catch (Throwable th3) {
            th = th3;
            aVar = aVar2;
        }
    }

    public static final a E(a x11, a w11) {
        if (qf.a.b(h.class)) {
            return null;
        }
        try {
            m.f(x11, "x");
            m.f(w11, "w");
            int i11 = x11.f27220a[0];
            int[] iArr = w11.f27220a;
            int i12 = iArr[0];
            int i13 = iArr[1];
            a aVar = new a(new int[]{i11, i13});
            float[] fArr = x11.f27222c;
            float[] fArr2 = w11.f27222c;
            float[] fArr3 = aVar.f27222c;
            for (int i14 = 0; i14 < i11; i14++) {
                for (int i15 = 0; i15 < i13; i15++) {
                    int i16 = (i14 * i13) + i15;
                    fArr3[i16] = 0.0f;
                    for (int i17 = 0; i17 < i12; i17++) {
                        fArr3[i16] = (fArr[(i14 * i12) + i17] * fArr2[(i17 * i13) + i15]) + fArr3[i16];
                    }
                }
            }
            return aVar;
        } catch (Throwable th2) {
            qf.a.a(h.class, th2);
            return null;
        }
    }

    public static PorterDuff.Mode F(r4.a aVar) {
        if (aVar == null) {
            return null;
        }
        switch (r4.b.f48790a[aVar.ordinal()]) {
            case 1:
                return PorterDuff.Mode.CLEAR;
            case 2:
                return PorterDuff.Mode.SRC;
            case 3:
                return PorterDuff.Mode.DST;
            case 4:
                return PorterDuff.Mode.SRC_OVER;
            case 5:
                return PorterDuff.Mode.DST_OVER;
            case 6:
                return PorterDuff.Mode.SRC_IN;
            case 7:
                return PorterDuff.Mode.DST_IN;
            case 8:
                return PorterDuff.Mode.SRC_OUT;
            case 9:
                return PorterDuff.Mode.DST_OUT;
            case 10:
                return PorterDuff.Mode.SRC_ATOP;
            case 11:
                return PorterDuff.Mode.DST_ATOP;
            case 12:
                return PorterDuff.Mode.XOR;
            case 13:
                return PorterDuff.Mode.ADD;
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.OVERLAY;
            case 17:
                return PorterDuff.Mode.DARKEN;
            case 18:
                return PorterDuff.Mode.LIGHTEN;
            default:
                return null;
        }
    }

    public static lp.b G(String str) {
        List listK;
        List listU0;
        List listK2;
        List listU1;
        lp.b bVar = new lp.b(0);
        bVar.f40184b = new SparseIntArray();
        if (str != null) {
            int length = str.length() - 1;
            int i11 = 0;
            boolean z11 = false;
            while (i11 <= length) {
                boolean z12 = m.h(str.charAt(!z11 ? i11 : length), 32) <= 0;
                if (z11) {
                    if (!z12) {
                        break;
                    }
                    length--;
                } else if (z12) {
                    i11++;
                } else {
                    z11 = true;
                }
            }
            if (!TextUtils.isEmpty(str.subSequence(i11, length + 1).toString())) {
                try {
                    int length2 = str.length() - 1;
                    int i12 = 0;
                    boolean z13 = false;
                    while (i12 <= length2) {
                        boolean z14 = m.h(str.charAt(!z13 ? i12 : length2), 32) <= 0;
                        if (z13) {
                            if (!z14) {
                                break;
                            }
                            length2--;
                        } else if (z14) {
                            i12++;
                        } else {
                            z13 = true;
                        }
                    }
                    String input = str.subSequence(i12, length2 + 1).toString();
                    Pattern patternCompile = Pattern.compile(";");
                    m.e(patternCompile, "compile(...)");
                    m.f(input, "input");
                    q.U0(0);
                    Matcher matcher = patternCompile.matcher(input);
                    if (matcher.find()) {
                        ArrayList arrayList = new ArrayList(10);
                        int iEnd = 0;
                        do {
                            arrayList.add(input.subSequence(iEnd, matcher.start()).toString());
                            iEnd = matcher.end();
                        } while (matcher.find());
                        arrayList.add(input.subSequence(iEnd, input.length()).toString());
                        listK = arrayList;
                    } else {
                        listK = o.K(input.toString());
                    }
                    boolean zIsEmpty = listK.isEmpty();
                    r rVar = r.f50854a;
                    if (zIsEmpty) {
                        listU0 = rVar;
                        break;
                    }
                    ListIterator listIterator = listK.listIterator(listK.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            listU0 = rVar;
                            break;
                        }
                        if (((String) listIterator.previous()).length() != 0) {
                            listU0 = ry.m.U0(listK, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                    for (String input2 : (String[]) listU0.toArray(new String[0])) {
                        Pattern patternCompile2 = Pattern.compile(":");
                        m.e(patternCompile2, "compile(...)");
                        m.f(input2, "input");
                        q.U0(0);
                        Matcher matcher2 = patternCompile2.matcher(input2);
                        if (matcher2.find()) {
                            ArrayList arrayList2 = new ArrayList(10);
                            int iEnd2 = 0;
                            do {
                                arrayList2.add(input2.subSequence(iEnd2, matcher2.start()).toString());
                                iEnd2 = matcher2.end();
                            } while (matcher2.find());
                            arrayList2.add(input2.subSequence(iEnd2, input2.length()).toString());
                            listK2 = arrayList2;
                        } else {
                            listK2 = o.K(input2.toString());
                        }
                        if (listK2.isEmpty()) {
                            listU1 = rVar;
                            break;
                        }
                        ListIterator listIterator2 = listK2.listIterator(listK2.size());
                        while (true) {
                            if (!listIterator2.hasPrevious()) {
                                listU1 = rVar;
                                break;
                            }
                            if (((String) listIterator2.previous()).length() != 0) {
                                listU1 = ry.m.U0(listK2, listIterator2.nextIndex() + 1);
                                break;
                            }
                        }
                        String[] strArr = (String[]) listU1.toArray(new String[0]);
                        ((SparseIntArray) bVar.f40184b).append(Integer.parseInt(strArr[0]), Integer.parseInt(strArr[1]));
                    }
                    return bVar;
                } catch (Exception unused) {
                    ((SparseIntArray) bVar.f40184b).clear();
                    return bVar;
                }
            }
        }
        ((SparseIntArray) bVar.f40184b).clear();
        return bVar;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0065  */
    public static ArrayList H(w wVar) {
        char c11;
        ArrayList arrayList;
        boolean z11;
        int i11;
        Object eVar;
        w wVar2 = wVar;
        ArrayList arrayList2 = null;
        arrayList2 = null;
        arrayList2 = null;
        if (wVar2.w() == 0) {
            char c12 = 7;
            wVar2.J(7);
            int iJ = wVar2.j();
            boolean z12 = true;
            if (iJ == 1684433976) {
                w wVar3 = new w();
                Inflater inflater = new Inflater(true);
                try {
                    if (!f0.F(wVar2, wVar3, inflater)) {
                        inflater.end();
                        return null;
                    }
                    inflater.end();
                    wVar2 = wVar3;
                } catch (Throwable th2) {
                    inflater.end();
                    throw th2;
                }
            } else if (iJ == 1918990112) {
            }
            ArrayList arrayList3 = new ArrayList();
            int i12 = wVar2.f4040b;
            int i13 = wVar2.f4041c;
            while (i12 < i13) {
                int iJ2 = wVar2.j() + i12;
                if (iJ2 > i12 && iJ2 <= i13) {
                    if (wVar2.j() == 1835365224) {
                        int iJ3 = wVar2.j();
                        if (iJ3 > 10000) {
                            c11 = c12;
                            ArrayList arrayList4 = arrayList2;
                            arrayList = arrayList4;
                            z11 = z12;
                            i11 = i13;
                            eVar = arrayList4;
                        } else {
                            float[] fArr = new float[iJ3];
                            for (int i14 = 0; i14 < iJ3; i14++) {
                                fArr[i14] = Float.intBitsToFloat(wVar2.j());
                            }
                            int iJ4 = wVar2.j();
                            if (iJ4 > 32000) {
                                c11 = c12;
                                ArrayList arrayList5 = arrayList2;
                                arrayList = arrayList5;
                                z11 = z12;
                                i11 = i13;
                                eVar = arrayList5;
                            } else {
                                double dLog = Math.log(2.0d);
                                c11 = c12;
                                ArrayList arrayList6 = arrayList2;
                                int iCeil = (int) Math.ceil(Math.log(((double) iJ3) * 2.0d) / dLog);
                                z11 = z12;
                                byte[] bArr = wVar2.f4039a;
                                v vVar = new v(bArr, bArr.length);
                                vVar.q(wVar2.f4040b * 8);
                                float[] fArr2 = new float[iJ4 * 5];
                                int i15 = 5;
                                int[] iArr = new int[5];
                                ArrayList arrayList7 = arrayList6;
                                int i16 = 0;
                                int i17 = 0;
                                while (true) {
                                    if (i16 < iJ4) {
                                        int i18 = 0;
                                        while (true) {
                                            if (i18 < i15) {
                                                int i19 = iArr[i18];
                                                int i21 = vVar.i(iCeil);
                                                int i22 = ((i21 >> 1) ^ (-(i21 & 1))) + i19;
                                                if (i22 < iJ3 && i22 >= 0) {
                                                    fArr2[i17] = fArr[i22];
                                                    iArr[i18] = i22;
                                                    i18++;
                                                    i17++;
                                                    i15 = 5;
                                                }
                                            } else {
                                                i16++;
                                                i15 = 5;
                                            }
                                        }
                                    } else {
                                        vVar.q((vVar.g() + 7) & (-8));
                                        int i23 = 32;
                                        int i24 = vVar.i(32);
                                        ar.f[] fVarArr = new ar.f[i24];
                                        int i25 = 0;
                                        while (true) {
                                            if (i25 < i24) {
                                                int i26 = vVar.i(8);
                                                int i27 = vVar.i(8);
                                                int i28 = vVar.i(i23);
                                                if (i28 <= 128000) {
                                                    int i29 = i24;
                                                    float[] fArr3 = fArr2;
                                                    int iCeil2 = (int) Math.ceil(Math.log(((double) iJ4) * 2.0d) / dLog);
                                                    float[] fArr4 = new float[i28 * 3];
                                                    float[] fArr5 = new float[i28 * 2];
                                                    i11 = i13;
                                                    int i30 = 0;
                                                    int i31 = 0;
                                                    while (true) {
                                                        if (i30 < i28) {
                                                            int i32 = vVar.i(iCeil2);
                                                            v vVar2 = vVar;
                                                            int i33 = ((i32 >> 1) ^ (-(i32 & 1))) + i31;
                                                            if (i33 >= 0 && i33 < iJ4) {
                                                                int i34 = i30 * 3;
                                                                int i35 = i33 * 5;
                                                                fArr4[i34] = fArr3[i35];
                                                                fArr4[i34 + 1] = fArr3[i35 + 1];
                                                                fArr4[i34 + 2] = fArr3[i35 + 2];
                                                                int i36 = i30 * 2;
                                                                fArr5[i36] = fArr3[i35 + 3];
                                                                fArr5[i36 + 1] = fArr3[i35 + 4];
                                                                i30++;
                                                                i31 = i33;
                                                                vVar = vVar2;
                                                            }
                                                        } else {
                                                            fVarArr[i25] = new ar.f(i26, i27, fArr4, fArr5);
                                                            i25++;
                                                            i24 = i29;
                                                            fArr2 = fArr3;
                                                            i13 = i11;
                                                            vVar = vVar;
                                                            i23 = 32;
                                                        }
                                                    }
                                                }
                                                eVar = arrayList7;
                                                arrayList = arrayList7;
                                            } else {
                                                i11 = i13;
                                                eVar = new w7.e(fVarArr);
                                                arrayList = arrayList7;
                                            }
                                        }
                                    }
                                    i11 = i13;
                                    eVar = arrayList7;
                                    arrayList = arrayList7;
                                }
                            }
                        }
                        if (eVar == null) {
                            return arrayList;
                        }
                        arrayList3.add(eVar);
                    } else {
                        c11 = c12;
                        arrayList = arrayList2;
                        z11 = z12;
                        i11 = i13;
                    }
                    wVar2.I(iJ2);
                    i12 = iJ2;
                    c12 = c11;
                    z12 = z11;
                    arrayList2 = arrayList;
                    i13 = i11;
                }
            }
            return arrayList3;
        }
        return arrayList2;
    }

    public static final void K(a x11) {
        if (qf.a.b(h.class)) {
            return;
        }
        try {
            m.f(x11, "x");
            float[] fArr = x11.f27222c;
            int length = fArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                if (fArr[i11] < CropImageView.DEFAULT_ASPECT_RATIO) {
                    fArr[i11] = 0.0f;
                }
            }
        } catch (Throwable th2) {
            qf.a.a(h.class, th2);
        }
    }

    public static void L(Context context, TextView textView, int i11) {
        m.f(context, "context");
        textView.setTextSize(0, x(context, i11));
    }

    public static final void M(a x11) {
        if (qf.a.b(h.class)) {
            return;
        }
        try {
            m.f(x11, "x");
            int[] iArr = x11.f27220a;
            int i11 = iArr[0];
            int i12 = iArr[1];
            float[] fArr = x11.f27222c;
            for (int i13 = 0; i13 < i11; i13++) {
                int i14 = i13 * i12;
                int i15 = i14 + i12;
                float f5 = Float.MIN_VALUE;
                for (int i16 = i14; i16 < i15; i16++) {
                    float f11 = fArr[i16];
                    if (f11 > f5) {
                        f5 = f11;
                    }
                }
                float f12 = CropImageView.DEFAULT_ASPECT_RATIO;
                for (int i17 = i14; i17 < i15; i17++) {
                    float fExp = (float) Math.exp(fArr[i17] - f5);
                    fArr[i17] = fExp;
                    f12 += fExp;
                }
                while (i14 < i15) {
                    fArr[i14] = fArr[i14] / f12;
                    i14++;
                }
            }
        } catch (Throwable th2) {
            qf.a.a(h.class, th2);
        }
    }

    public static final int N(float f5) {
        float dimension;
        String strQ0 = "sp_" + f5;
        if (x.k0(strQ0, ".0", false)) {
            strQ0 = x.q0(strQ0, ".0", BuildConfig.VERSION_NAME);
        }
        int iU = u(strQ0);
        if (iU != 0) {
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            m.c(lingoSkillApplication);
            dimension = lingoSkillApplication.getResources().getDimension(iU);
        } else {
            dimension = (f5 * e0.f(LingoSkillApplication.f21665b).scaledDensity) + 0.5f;
        }
        return (int) dimension;
    }

    public static final Object O(wz.q qVar, boolean z11, wz.q qVar2, fz.e eVar) {
        Object vVar;
        Object objK;
        try {
            if (eVar instanceof xy.a) {
                c0.d(2, eVar);
                vVar = eVar.invoke(qVar2, qVar);
            } else {
                vVar = ue.f.F(eVar, qVar2, qVar);
            }
        } catch (DispatchException e8) {
            Throwable th2 = e8.f38363a;
            qVar.J(new rz.v(th2, false));
            throw th2;
        } catch (Throwable th3) {
            vVar = new rz.v(th3, false);
        }
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        if (vVar == aVar || (objK = qVar.K(vVar)) == rz.e0.f50886e) {
            return aVar;
        }
        qVar.a0();
        if (!(objK instanceof rz.v)) {
            return rz.e0.K(objK);
        }
        if (!z11) {
            Throwable th4 = ((rz.v) objK).f50961a;
            if ((th4 instanceof TimeoutCancellationException) && ((TimeoutCancellationException) th4).f38365a == qVar) {
                if (vVar instanceof rz.v) {
                    throw ((rz.v) vVar).f50961a;
                }
                return vVar;
            }
        }
        throw ((rz.v) objK).f50961a;
    }

    public static final long P(long j11) {
        return (((long) Float.floatToRawIntBits((int) (j11 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j11 >> 32)) << 32);
    }

    public static final a Q(a aVar) {
        if (qf.a.b(h.class)) {
            return null;
        }
        try {
            int[] iArr = aVar.f27220a;
            int i11 = iArr[0];
            int i12 = iArr[1];
            a aVar2 = new a(new int[]{i12, i11});
            float[] fArr = aVar.f27222c;
            float[] fArr2 = aVar2.f27222c;
            for (int i13 = 0; i13 < i11; i13++) {
                for (int i14 = 0; i14 < i12; i14++) {
                    fArr2[(i14 * i11) + i13] = fArr[(i13 * i12) + i14];
                }
            }
            return aVar2;
        } catch (Throwable th2) {
            qf.a.a(h.class, th2);
            return null;
        }
    }

    public static final a R(a aVar) {
        if (qf.a.b(h.class)) {
            return null;
        }
        try {
            int[] iArr = aVar.f27220a;
            int i11 = iArr[0];
            int i12 = iArr[1];
            int i13 = iArr[2];
            a aVar2 = new a(new int[]{i13, i12, i11});
            float[] fArr = aVar.f27222c;
            float[] fArr2 = aVar2.f27222c;
            for (int i14 = 0; i14 < i11; i14++) {
                for (int i15 = 0; i15 < i12; i15++) {
                    for (int i16 = 0; i16 < i13; i16++) {
                        fArr2[(i15 * i11) + (i16 * i11 * i12) + i14] = fArr[(i15 * i13) + (i14 * i12 * i13) + i16];
                    }
                }
            }
            return aVar2;
        } catch (Throwable th2) {
            qf.a.a(h.class, th2);
            return null;
        }
    }

    public static final Object S(Context context, e6.c cVar, nu.b bVar, n nVar) {
        gu.b bVar2 = new gu.b(bVar, null, 9);
        if (!(cVar instanceof e6.c)) {
            throw new IllegalArgumentException("The glance ID is not the one of an App Widget");
        }
        Object objD = n6.f.f43456a.d(context, n6.h.f43459a, vc.a.f(cVar.f24881a), bVar2, nVar);
        return objD == wy.a.COROUTINE_SUSPENDED ? objD : b0.f48488a;
    }

    public static final void T(u p4) {
        int i11;
        m.f(p4, "p");
        Boolean boolValueOf = Boolean.TRUE;
        float[] fArr = p4.f56768a;
        int i12 = p4.f56769b;
        int i13 = 0;
        while (true) {
            boolean z11 = true;
            if (i13 >= i12) {
                break;
            }
            float f5 = fArr[i13];
            if (!boolValueOf.booleanValue() || CropImageView.DEFAULT_ASPECT_RATIO > f5 || f5 > 1.0f) {
                z11 = false;
            }
            boolValueOf = Boolean.valueOf(z11);
            i13++;
        }
        if (!boolValueOf.booleanValue()) {
            throw new IllegalArgumentException("FloatMapping - Progress outside of range: ".concat(u.c(p4, 31)).toString());
        }
        Iterable iterableU = hz.b.U(1, p4.f56769b);
        if ((iterableU instanceof Collection) && ((Collection) iterableU).isEmpty()) {
            i11 = 0;
        } else {
            Iterator it = iterableU.iterator();
            i11 = 0;
            while (((lz.f) it).f40537c) {
                int iNextInt = ((ry.w) it).nextInt();
                if (p4.b(iNextInt) < p4.b(iNextInt - 1) && (i11 = i11 + 1) < 0) {
                    o.U();
                    throw null;
                }
            }
        }
        if (!(i11 <= 1)) {
            throw new IllegalArgumentException("FloatMapping - Progress wraps more than once: ".concat(u.c(p4, 31)).toString());
        }
    }

    public static final boolean U(String errorMessage, fz.a aVar) {
        m.f(errorMessage, "errorMessage");
        try {
            return ((Boolean) aVar.invoke()).booleanValue();
        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
            return false;
        }
    }

    public static a0 a(int i11, s sVar, int i12) {
        if ((i12 & 2) != 0) {
            sVar = s.f43178t;
        }
        return new a0(i11, sVar, (i12 & 4) != 0 ? 0 : 1, new n3.r(new n3.q[0]));
    }

    public static final long b(int i11, int i12) {
        return (((long) i12) & 4294967295L) | (((long) i11) << 32);
    }

    public static final ExecutorService c(boolean z11) {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new fb.d(z11));
        m.e(executorServiceNewFixedThreadPool, "newFixedThreadPool(\n    …)),\n        factory\n    )");
        return executorServiceNewFixedThreadPool;
    }

    public static final void d(a x11, a b3) {
        if (qf.a.b(h.class)) {
            return;
        }
        try {
            m.f(x11, "x");
            m.f(b3, "b");
            int[] iArr = x11.f27220a;
            int i11 = iArr[0];
            int i12 = iArr[1];
            int i13 = iArr[2];
            float[] fArr = x11.f27222c;
            float[] fArr2 = b3.f27222c;
            for (int i14 = 0; i14 < i11; i14++) {
                for (int i15 = 0; i15 < i12; i15++) {
                    for (int i16 = 0; i16 < i13; i16++) {
                        int i17 = (i15 * i13) + (i14 * i12 * i13) + i16;
                        fArr[i17] = fArr[i17] + fArr2[i16];
                    }
                }
            }
        } catch (Throwable th2) {
            qf.a.a(h.class, th2);
        }
    }

    public static final ad.i e(wc.h hVar, boolean z11, float f5, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.e0(683659508);
        boolean z12 = (i11 & 2) != 0 ? true : z11;
        boolean z13 = (i11 & 4) != 0;
        float f11 = (i11 & 32) != 0 ? 1.0f : f5;
        int i12 = (i11 & 64) == 0 ? Integer.MAX_VALUE : 1;
        ad.n nVar2 = ad.n.Immediately;
        if (Float.isInfinite(f11) || Float.isNaN(f11)) {
            throw new IllegalArgumentException(("Speed must be a finite number. It is " + f11 + ".").toString());
        }
        sVar.e0(2024497114);
        sVar.e0(-610207850);
        Object objQ = sVar.Q();
        l1.g gVar = l1.m.f39353a;
        if (objQ == gVar) {
            objQ = new ad.i();
            sVar.o0(objQ);
        }
        ad.i iVar = (ad.i) objQ;
        sVar.p(false);
        sVar.p(false);
        sVar.e0(-180606964);
        Object objQ2 = sVar.Q();
        if (objQ2 == gVar) {
            objQ2 = ep.a.s(z12, sVar);
        }
        b1 b1Var = (b1) objQ2;
        sVar.p(false);
        sVar.e0(-180606834);
        Context context = (Context) sVar.j(AndroidCompositionLocals_androidKt.f1200b);
        Matrix matrix = k.f38124a;
        float f12 = f11 / Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        sVar.p(false);
        t.i(new Object[]{hVar, Boolean.valueOf(z12), null, Float.valueOf(f12), Integer.valueOf(i12)}, new ad.a(z12, z13, iVar, hVar, i12, f12, nVar2, b1Var, null), sVar);
        sVar.p(false);
        return iVar;
    }

    public static long f(boolean z11, int i11, fb.a backoffPolicy, long j11, long j12, int i12, boolean z12, long j13, long j14, long j15, long j16) {
        m.f(backoffPolicy, "backoffPolicy");
        if (j16 != Long.MAX_VALUE && z12) {
            if (i12 != 0) {
                long j17 = j12 + 900000;
                if (j16 < j17) {
                    return j17;
                }
            }
            return j16;
        }
        if (z11) {
            long jScalb = backoffPolicy == fb.a.LINEAR ? j11 * ((long) i11) : (long) Math.scalb(j11, i11 - 1);
            if (jScalb > 18000000) {
                jScalb = 18000000;
            }
            return j12 + jScalb;
        }
        if (z12) {
            long j18 = i12 == 0 ? j12 + j13 : j12 + j15;
            return (j14 == j15 || i12 != 0) ? j18 : (j15 - j14) + j18;
        }
        if (j12 == -1) {
            return Long.MAX_VALUE;
        }
        return j12 + j13;
    }

    public static final a g(a[] aVarArr) {
        if (qf.a.b(h.class)) {
            return null;
        }
        try {
            int i11 = aVarArr[0].f27220a[0];
            int i12 = 0;
            for (a aVar : aVarArr) {
                i12 += aVar.f27220a[1];
            }
            a aVar2 = new a(new int[]{i11, i12});
            float[] fArr = aVar2.f27222c;
            for (int i13 = 0; i13 < i11; i13++) {
                int i14 = i13 * i12;
                for (a aVar3 : aVarArr) {
                    float[] fArr2 = aVar3.f27222c;
                    int i15 = aVar3.f27220a[1];
                    System.arraycopy(fArr2, i13 * i15, fArr, i14, i15);
                    i14 += i15;
                }
            }
            return aVar2;
        } catch (Throwable th2) {
            qf.a.a(h.class, th2);
            return null;
        }
    }

    public static final a h(a x11, a w11) {
        a aVar;
        a aVar2 = null;
        if (qf.a.b(h.class)) {
            return null;
        }
        try {
            m.f(x11, "x");
            m.f(w11, "w");
            int[] iArr = x11.f27220a;
            int i11 = 0;
            int i12 = iArr[0];
            int i13 = iArr[1];
            int i14 = iArr[2];
            int[] iArr2 = w11.f27220a;
            int i15 = iArr2[0];
            int i16 = (i13 - i15) + 1;
            int i17 = iArr2[2];
            a aVar3 = new a(new int[]{i12, i16, i17});
            float[] fArr = x11.f27222c;
            float[] fArr2 = aVar3.f27222c;
            float[] fArr3 = w11.f27222c;
            int i18 = 0;
            while (i18 < i12) {
                int i19 = i11;
                while (i19 < i17) {
                    int i21 = i11;
                    while (i21 < i16) {
                        float f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                        aVar = aVar2;
                        int i22 = i11;
                        while (i22 < i15) {
                            while (i11 < i14) {
                                try {
                                    f5 = (fArr[((i22 + i21) * i14) + (i13 * i14 * i18) + i11] * fArr3[(((i22 * i14) + i11) * i17) + i19]) + f5;
                                    i11++;
                                } catch (Throwable th2) {
                                    th = th2;
                                    qf.a.a(h.class, th);
                                    return aVar;
                                }
                            }
                            i22++;
                            i11 = 0;
                        }
                        fArr2[(i21 * i17) + (i16 * i17 * i18) + i19] = f5;
                        i21++;
                        aVar2 = aVar;
                        i11 = 0;
                    }
                    i19++;
                    i11 = 0;
                }
                i18++;
                i11 = 0;
            }
            return aVar3;
        } catch (Throwable th3) {
            th = th3;
            aVar = null;
        }
    }

    public static final int i(sf sfVar) {
        m.f(sfVar, "<this>");
        int i11 = sb.f50386a[sfVar.f50393d.ordinal()];
        if (i11 == 1) {
            return -3;
        }
        if (i11 == 2) {
            return -4;
        }
        if (i11 == 3) {
            return -5;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean j(String current, String str) {
        m.f(current, "current");
        if (current.equals(str)) {
            return true;
        }
        if (current.length() != 0) {
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (i11 < current.length()) {
                char cCharAt = current.charAt(i11);
                int i14 = i13 + 1;
                if (i13 != 0 || cCharAt == '(') {
                    if (cCharAt == '(') {
                        i12++;
                    } else if (cCharAt == ')' && (i12 = i12 - 1) == 0 && i13 != current.length() - 1) {
                    }
                    i11++;
                    i13 = i14;
                }
            }
            if (i12 == 0) {
                String strSubstring = current.substring(1, current.length() - 1);
                m.e(strSubstring, "substring(...)");
                return m.a(q.i1(strSubstring).toString(), str);
            }
        }
        return false;
    }

    public static final a k(a x11, a w11, a b3) {
        if (qf.a.b(h.class)) {
            return null;
        }
        try {
            m.f(x11, "x");
            m.f(w11, "w");
            m.f(b3, "b");
            int i11 = x11.f27220a[0];
            int i12 = b3.f27220a[0];
            a aVarE = E(x11, w11);
            float[] fArr = b3.f27222c;
            float[] fArr2 = aVarE.f27222c;
            for (int i13 = 0; i13 < i11; i13++) {
                for (int i14 = 0; i14 < i12; i14++) {
                    int i15 = (i13 * i12) + i14;
                    fArr2[i15] = fArr2[i15] + fArr[i14];
                }
            }
            return aVarE;
        } catch (Throwable th2) {
            qf.a.a(h.class, th2);
            return null;
        }
    }

    public static final int l(float f5) {
        float dimension;
        String strQ0 = "dp_" + f5;
        if (x.k0(strQ0, ".0", false)) {
            strQ0 = x.q0(strQ0, ".0", BuildConfig.VERSION_NAME);
        }
        int iU = u(strQ0);
        if (iU != 0) {
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            m.c(lingoSkillApplication);
            dimension = lingoSkillApplication.getResources().getDimension(iU);
        } else {
            dimension = (f5 * e0.f(LingoSkillApplication.f21665b).density) + 0.5f;
        }
        return (int) dimension;
    }

    public static boolean m(Method method, Class clazz) {
        m.f(clazz, "clazz");
        return method.getReturnType().equals(clazz);
    }

    public static final a n(String[] strArr, a w11) {
        if (qf.a.b(h.class)) {
            return null;
        }
        try {
            m.f(w11, "w");
            int length = strArr.length;
            int i11 = w11.f27220a[1];
            a aVar = new a(new int[]{length, 128, i11});
            float[] fArr = aVar.f27222c;
            float[] fArr2 = w11.f27222c;
            for (int i12 = 0; i12 < length; i12++) {
                int[] iArrD = i.f27250a.d(strArr[i12]);
                for (int i13 = 0; i13 < 128; i13++) {
                    System.arraycopy(fArr2, iArrD[i13] * i11, fArr, (i11 * i13) + (i11 * 128 * i12), i11);
                }
            }
            return aVar;
        } catch (Throwable th2) {
            qf.a.a(h.class, th2);
            return null;
        }
    }

    public static final void o(a x11) {
        if (qf.a.b(h.class)) {
            return;
        }
        try {
            m.f(x11, "x");
            int[] iArr = x11.f27220a;
            if (1 >= iArr.length) {
                return;
            }
            int length = iArr.length;
            int i11 = 1;
            for (int i12 = 1; i12 < length; i12++) {
                i11 *= x11.f27220a[i12];
            }
            int[] iArr2 = {x11.f27220a[0], i11};
            x11.f27220a = iArr2;
            int iA = i.a(iArr2);
            float[] fArr = new float[iA];
            System.arraycopy(x11.f27222c, 0, fArr, 0, Math.min(x11.f27221b, iA));
            x11.f27222c = fArr;
            x11.f27221b = iA;
        } catch (Throwable th2) {
            qf.a.a(h.class, th2);
        }
    }

    public static final String p(Collection collection) {
        m.f(collection, "collection");
        if (collection.isEmpty()) {
            return " }";
        }
        return oz.r.e0(ry.m.y0(collection, ",\n", "\n", "\n", null, 56), "    ") + "},";
    }

    public static final long q(long j11) {
        return (((j11 << 32) >> 33) & 4294967295L) | ((j11 >> 33) << 32);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final ed r(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -443563632:
                    if (str.equals("new_learn_banner_bg_1")) {
                        return new ed(g2.f0.e(4294957862L), g2.f0.e(4294958898L), g2.f0.e(4294940416L), g2.f0.e(4294953472L), g2.f0.e(4294959508L), g2.f0.e(4294920508L), g2.f0.e(4294933618L));
                    }
                    break;
                case -443563631:
                    if (str.equals("new_learn_banner_bg_2")) {
                        return new ed(g2.f0.e(4280598777L), g2.f0.e(4280730358L), g2.f0.e(4282422510L), g2.f0.e(4281519087L), g2.f0.e(4281519087L), g2.f0.e(4282422510L), g2.f0.e(4282422510L));
                    }
                    break;
                case -443563630:
                    if (str.equals("new_learn_banner_bg_3")) {
                        return new ed(g2.f0.e(4290599167L), g2.f0.e(4290599167L), g2.f0.e(4289742303L), g2.f0.e(4293684981L), g2.f0.e(4290352895L), g2.f0.e(4289742303L), g2.f0.e(4289742303L));
                    }
                    break;
                case -443563629:
                    if (str.equals("new_learn_banner_bg_4")) {
                        return new ed(g2.f0.e(4294923348L), g2.f0.e(4294923348L), g2.f0.e(4294071399L), g2.f0.e(4294071399L), g2.f0.e(4294935263L), g2.f0.e(4294071399L), g2.f0.e(4294071399L));
                    }
                    break;
                case -443563628:
                    if (str.equals("new_learn_banner_bg_5")) {
                        return new ed(g2.f0.e(4294938418L), g2.f0.e(4294938418L), g2.f0.e(4294938417L), g2.f0.e(4294945617L), g2.f0.e(4294960770L), g2.f0.e(4294938417L), g2.f0.e(4294939959L));
                    }
                    break;
                case -443563627:
                    if (str.equals("new_learn_banner_bg_6")) {
                        return new ed(g2.f0.e(4280731258L), g2.f0.e(4280731258L), g2.f0.e(4282304387L), g2.f0.e(4283883422L), g2.f0.e(4281528205L), g2.f0.e(4282304387L), g2.f0.e(4282304387L));
                    }
                    break;
                case -443563626:
                    if (str.equals("new_learn_banner_bg_7")) {
                        return new ed(g2.f0.e(4293544328L), g2.f0.e(4293544328L), g2.f0.e(4294204051L), g2.f0.e(4294866604L), g2.f0.e(4294953111L), g2.f0.e(4294204051L), g2.f0.e(4294204051L));
                    }
                    break;
            }
        }
        return new ed(g2.f0.e(4294957862L), g2.f0.e(4294958898L), g2.f0.e(4294940416L), g2.f0.e(4294953472L), g2.f0.e(4294959508L), g2.f0.e(4294920508L), g2.f0.e(4294933618L));
    }

    public static final int s(int i11) {
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
        m.c(lingoSkillApplication2);
        return (int) lingoSkillApplication2.getResources().getDimension(i11);
    }

    public static final int u(String iconName) {
        m.f(iconName, "iconName");
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
        m.c(lingoSkillApplication2);
        Resources resources = lingoSkillApplication2.getResources();
        LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
        m.c(lingoSkillApplication3);
        return resources.getIdentifier(iconName, "dimen", lingoSkillApplication3.getPackageName());
    }

    public static final int v(String str) {
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
        m.c(lingoSkillApplication2);
        Resources resources = lingoSkillApplication2.getResources();
        LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
        m.c(lingoSkillApplication3);
        int identifier = resources.getIdentifier(str, "drawable", lingoSkillApplication3.getPackageName());
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static final int w(String str) {
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
        m.c(lingoSkillApplication2);
        Resources resources = lingoSkillApplication2.getResources();
        LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
        m.c(lingoSkillApplication3);
        int identifier = resources.getIdentifier(str, "id", lingoSkillApplication3.getPackageName());
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static float x(Context context, int i11) {
        m.f(context, "context");
        if (i11 == 18) {
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            if (l.D(new Integer[]{51, 55}, Integer.valueOf(cf.x.n().keyLanguage))) {
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                m.c(lingoSkillApplication2);
                return lingoSkillApplication2.getResources().getDimension(R.dimen.sp_26);
            }
            LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
            m.c(lingoSkillApplication3);
            return lingoSkillApplication3.getResources().getDimension(R.dimen.sp_18);
        }
        if (i11 == 20) {
            LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
            if (l.D(new Integer[]{51, 55}, Integer.valueOf(cf.x.n().keyLanguage))) {
                LingoSkillApplication lingoSkillApplication5 = LingoSkillApplication.f21665b;
                m.c(lingoSkillApplication5);
                return lingoSkillApplication5.getResources().getDimension(R.dimen.sp_26);
            }
            LingoSkillApplication lingoSkillApplication6 = LingoSkillApplication.f21665b;
            m.c(lingoSkillApplication6);
            return lingoSkillApplication6.getResources().getDimension(R.dimen.sp_20);
        }
        if (i11 == 22) {
            LingoSkillApplication lingoSkillApplication7 = LingoSkillApplication.f21665b;
            if (l.D(new Integer[]{51, 55}, Integer.valueOf(cf.x.n().keyLanguage))) {
                LingoSkillApplication lingoSkillApplication8 = LingoSkillApplication.f21665b;
                m.c(lingoSkillApplication8);
                return lingoSkillApplication8.getResources().getDimension(R.dimen.sp_26);
            }
            LingoSkillApplication lingoSkillApplication9 = LingoSkillApplication.f21665b;
            m.c(lingoSkillApplication9);
            return lingoSkillApplication9.getResources().getDimension(R.dimen.sp_22);
        }
        if (i11 != 24) {
            int iU = u("sp_" + i11);
            if (iU == 0) {
                return j3.Z(Integer.valueOf(i11), context);
            }
            LingoSkillApplication lingoSkillApplication10 = LingoSkillApplication.f21665b;
            m.c(lingoSkillApplication10);
            return lingoSkillApplication10.getResources().getDimension(iU);
        }
        LingoSkillApplication lingoSkillApplication11 = LingoSkillApplication.f21665b;
        if (l.D(new Integer[]{51, 55}, Integer.valueOf(cf.x.n().keyLanguage))) {
            LingoSkillApplication lingoSkillApplication12 = LingoSkillApplication.f21665b;
            m.c(lingoSkillApplication12);
            return lingoSkillApplication12.getResources().getDimension(R.dimen.sp_30);
        }
        LingoSkillApplication lingoSkillApplication13 = LingoSkillApplication.f21665b;
        m.c(lingoSkillApplication13);
        return lingoSkillApplication13.getResources().getDimension(R.dimen.sp_24);
    }

    public static final String y(Context context, int i11) {
        m.f(context, "context");
        String string = context.getResources().getString(i11);
        m.e(string, "getString(...)");
        return string;
    }

    public static final float z(u xValues, u yValues, float f5) {
        int iNextInt;
        int i11;
        m.f(xValues, "xValues");
        m.f(yValues, "yValues");
        if (CropImageView.DEFAULT_ASPECT_RATIO > f5 || f5 > 1.0f) {
            throw new IllegalArgumentException(("Invalid progress: " + f5).toString());
        }
        Iterator it = hz.b.U(0, xValues.f56769b).iterator();
        while (true) {
            if (!it.hasNext()) {
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            iNextInt = ((ry.w) it).nextInt();
            float fB = xValues.b(iNextInt);
            i11 = iNextInt + 1;
            float fB2 = xValues.b(i11 % xValues.f56769b);
            if (fB2 >= fB) {
                if (fB <= f5 && f5 <= fB2) {
                    break;
                }
            } else if (f5 >= fB || f5 <= fB2) {
                break;
            }
        }
        int i12 = i11 % xValues.f56769b;
        float fD = q6.n.d(xValues.b(i12) - xValues.b(iNextInt), 1.0f);
        return q6.n.d((q6.n.d(yValues.b(i12) - yValues.b(iNextInt), 1.0f) * (fD < 0.001f ? 0.5f : q6.n.d(f5 - xValues.b(iNextInt), 1.0f) / fD)) + yValues.b(iNextInt), 1.0f);
    }

    public abstract Object I(Uri uri, InputEvent inputEvent, vy.d dVar);

    public abstract Object J(Uri uri, vy.d dVar);

    public abstract Object t(vy.d dVar);
}
