package z2;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.inputmethodservice.InputMethodService;
import android.os.Binder;
import android.os.Build;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidViewsHandler;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import com.yalantis.ucrop.view.CropImageView;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class[] f58539a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final boolean A(float f5, float f11, float f12, float f13, long j11) {
        float f14 = f5 - f12;
        float f15 = f11 - f13;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L));
        return ((f15 * f15) / (fIntBitsToFloat2 * fIntBitsToFloat2)) + ((f14 * f14) / (fIntBitsToFloat * fIntBitsToFloat)) <= 1.0f;
    }

    public static final void B(float[] fArr, float[] fArr2) {
        float fR = r(0, 0, fArr2, fArr);
        float fR2 = r(0, 1, fArr2, fArr);
        float fR3 = r(0, 2, fArr2, fArr);
        float fR4 = r(0, 3, fArr2, fArr);
        float fR5 = r(1, 0, fArr2, fArr);
        float fR6 = r(1, 1, fArr2, fArr);
        float fR7 = r(1, 2, fArr2, fArr);
        float fR8 = r(1, 3, fArr2, fArr);
        float fR9 = r(2, 0, fArr2, fArr);
        float fR10 = r(2, 1, fArr2, fArr);
        float fR11 = r(2, 2, fArr2, fArr);
        float fR12 = r(2, 3, fArr2, fArr);
        float fR13 = r(3, 0, fArr2, fArr);
        float fR14 = r(3, 1, fArr2, fArr);
        float fR15 = r(3, 2, fArr2, fArr);
        float fR16 = r(3, 3, fArr2, fArr);
        fArr[0] = fR;
        fArr[1] = fR2;
        fArr[2] = fR3;
        fArr[3] = fR4;
        fArr[4] = fR5;
        fArr[5] = fR6;
        fArr[6] = fR7;
        fArr[7] = fR8;
        fArr[8] = fR9;
        fArr[9] = fR10;
        fArr[10] = fR11;
        fArr[11] = fR12;
        fArr[12] = fR13;
        fArr[13] = fR14;
        fArr[14] = fR15;
        fArr[15] = fR16;
    }

    public static final AndroidViewHolder C(AndroidViewsHandler androidViewsHandler, int i11) {
        Object next;
        Iterator<T> it = androidViewsHandler.getLayoutNodeToHolder().entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((y2.i0) ((Map.Entry) next).getKey()).f56880b != i11);
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (AndroidViewHolder) entry.getValue();
        }
        return null;
    }

    public static final String D(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    public static final String E(int i11) {
        if (i11 == 0) {
            return "android.widget.Button";
        }
        if (i11 == 1) {
            return "android.widget.CheckBox";
        }
        if (i11 == 3) {
            return "android.widget.RadioButton";
        }
        if (i11 == 5) {
            return "android.widget.ImageView";
        }
        if (i11 == 6) {
            return "android.widget.Spinner";
        }
        if (i11 == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }

    public static final boolean f(View view, View view2) {
        if (view2.equals(view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    public static final boolean j(g3.t tVar) {
        return !tVar.k().f28691a.c(g3.x.f28718i);
    }

    public static final int k(long j11) {
        int i11 = Math.abs(Float.intBitsToFloat((int) (j11 >> 32))) >= 0.5f ? 1 : 0;
        return Math.abs(Float.intBitsToFloat((int) (j11 & 4294967295L))) >= 0.5f ? i11 | 2 : i11;
    }

    public static final boolean l(g3.t tVar, Resources resources) {
        Object objG = tVar.f28699d.f28691a.g(g3.x.f28710a);
        if (objG == null) {
            objG = null;
        }
        List list = (List) objG;
        return !g3.w.e(tVar) && (tVar.f28699d.f28693c || (tVar.o() && ((list != null ? (String) ry.m.s0(list) : null) != null || u(tVar) != null || t(tVar, resources) != null || s(tVar))));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004c A[PHI: r11
      0x004c: PHI (r11v11 float) = (r11v4 float), (r11v12 float) binds: [B:16:0x0059, B:13:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0073 A[PHI: r11
      0x0073: PHI (r11v9 float) = (r11v6 float), (r11v10 float) binds: [B:24:0x0080, B:21:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    public static final long m(int i11, int i12, int[] iArr, long j11) {
        float f5;
        float fIntBitsToFloat;
        float f11;
        float fIntBitsToFloat2;
        float fIntBitsToFloat3 = Math.abs(iArr[0]) == 0 ? 0.0f : Float.intBitsToFloat((int) (j11 >> 32)) - (i11 * (-1.0f));
        float fIntBitsToFloat4 = Math.abs(iArr[1]) == 0 ? 0.0f : Float.intBitsToFloat((int) (j11 & 4294967295L)) - (i12 * (-1.0f));
        int i13 = (int) (j11 >> 32);
        if (Float.intBitsToFloat(i13) >= CropImageView.DEFAULT_ASPECT_RATIO) {
            f5 = (iArr[0] * (-1.0f)) + fIntBitsToFloat3;
            fIntBitsToFloat = Float.intBitsToFloat(i13);
            if (f5 > fIntBitsToFloat) {
                f5 = fIntBitsToFloat;
            }
        } else {
            f5 = (iArr[0] * (-1.0f)) + fIntBitsToFloat3;
            fIntBitsToFloat = Float.intBitsToFloat(i13);
            if (f5 < fIntBitsToFloat) {
                f5 = fIntBitsToFloat;
            }
        }
        int i14 = (int) (j11 & 4294967295L);
        if (Float.intBitsToFloat(i14) >= CropImageView.DEFAULT_ASPECT_RATIO) {
            f11 = (iArr[1] * (-1.0f)) + fIntBitsToFloat4;
            fIntBitsToFloat2 = Float.intBitsToFloat(i14);
            if (f11 > fIntBitsToFloat2) {
                f11 = fIntBitsToFloat2;
            }
        } else {
            f11 = (iArr[1] * (-1.0f)) + fIntBitsToFloat4;
            fIntBitsToFloat2 = Float.intBitsToFloat(i14);
            if (f11 < fIntBitsToFloat2) {
                f11 = fIntBitsToFloat2;
            }
        }
        return (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L);
    }

    public static final void n(a5.g gVar, g3.t tVar) {
        g3.o oVar = tVar.f28699d;
        y.i0 i0Var = oVar.f28691a;
        Object objG = oVar.f28691a.g(g3.x.f28733y);
        if (objG == null) {
            objG = null;
        }
        g3.k kVar = (g3.k) objG;
        if (j(tVar)) {
            if (kVar != null && kVar.f28656a == 8) {
                return;
            }
            Object objG2 = i0Var.g(g3.n.f28689y);
            if (objG2 == null) {
                objG2 = null;
            }
            g3.a aVar = (g3.a) objG2;
            if (aVar != null) {
                gVar.b(new a5.c(R.id.accessibilityActionPageUp, aVar.f28634a));
            }
            Object objG3 = i0Var.g(g3.n.A);
            if (objG3 == null) {
                objG3 = null;
            }
            g3.a aVar2 = (g3.a) objG3;
            if (aVar2 != null) {
                gVar.b(new a5.c(R.id.accessibilityActionPageDown, aVar2.f28634a));
            }
            Object objG4 = i0Var.g(g3.n.f28690z);
            if (objG4 == null) {
                objG4 = null;
            }
            g3.a aVar3 = (g3.a) objG4;
            if (aVar3 != null) {
                gVar.b(new a5.c(R.id.accessibilityActionPageLeft, aVar3.f28634a));
            }
            Object objG5 = i0Var.g(g3.n.B);
            g3.a aVar4 = (g3.a) (objG5 != null ? objG5 : null);
            if (aVar4 != null) {
                gVar.b(new a5.c(R.id.accessibilityActionPageRight, aVar4.f28634a));
            }
        }
    }

    public static final i1 o(View view) {
        db.f fVar;
        Context context = view.getContext();
        Context baseContext = context;
        while (true) {
            if (baseContext instanceof ContextWrapper) {
                if ((baseContext instanceof Activity) || (baseContext instanceof InputMethodService) || (baseContext instanceof Application)) {
                    break;
                }
                ContextWrapper contextWrapper = (ContextWrapper) baseContext;
                if (contextWrapper.getBaseContext() != null) {
                    baseContext = contextWrapper.getBaseContext();
                }
            }
            baseContext = null;
            break;
        }
        if (baseContext == null) {
            Configuration configuration = context.getResources().getConfiguration();
            v3.e eVarA = com.bumptech.glide.e.a(context);
            long jA = ef.e.a(configuration.screenWidthDp, configuration.screenHeightDp);
            long jV0 = eVarA.v0(jA);
            return new i1((((long) ((int) Float.intBitsToFloat((int) (jV0 & 4294967295L)))) & 4294967295L) | (((long) ((int) Float.intBitsToFloat((int) (jV0 >> 32)))) << 32), jA);
        }
        za.m.f59080a.getClass();
        za.n it = za.l.f59079b;
        kotlin.jvm.internal.m.f(it, "it");
        ContextWrapper contextWrapper2 = (ContextWrapper) baseContext;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            fVar = db.e.f23352c;
        } else {
            fVar = i11 >= 30 ? db.c.f23350c : db.a.f23346h;
        }
        ya.b bVar = fVar.a(contextWrapper2, it.f59081b).f59076a;
        long jHeight = (4294967295L & ((long) bVar.c().height())) | (((long) bVar.c().width()) << 32);
        return new i1(jHeight, com.bumptech.glide.e.a(baseContext).o(ff.h.P(jHeight)));
    }

    public static final boolean p(Object obj) {
        if (obj instanceof x1.n) {
            x1.n nVar = (x1.n) obj;
            if (nVar.e() == l1.g.f39300d || nVar.e() == l1.g.f39303t || nVar.e() == l1.g.f39301e) {
                Object value = nVar.getValue();
                if (value == null) {
                    return true;
                }
                return p(value);
            }
        } else {
            if ((obj instanceof qy.e) && (obj instanceof Serializable)) {
                return false;
            }
            for (int i11 = 0; i11 < 7; i11++) {
                if (f58539a[i11].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final int q(float f5) {
        return hz.b.Q(f5) * (-1);
    }

    public static final float r(int i11, int i12, float[] fArr, float[] fArr2) {
        int i13 = i11 * 4;
        return (fArr[i13 + 3] * fArr2[12 + i12]) + (fArr[i13 + 2] * fArr2[8 + i12]) + (fArr[i13 + 1] * fArr2[4 + i12]) + (fArr[i13] * fArr2[i12]);
    }

    public static final boolean s(g3.t tVar) {
        Object objG = tVar.f28699d.f28691a.g(g3.x.J);
        if (objG == null) {
            objG = null;
        }
        i3.a aVar = (i3.a) objG;
        y.i0 i0Var = tVar.f28699d.f28691a;
        Object objG2 = i0Var.g(g3.x.f28733y);
        if (objG2 == null) {
            objG2 = null;
        }
        g3.k kVar = (g3.k) objG2;
        boolean z11 = aVar != null;
        Object objG3 = i0Var.g(g3.x.I);
        if (((Boolean) (objG3 != null ? objG3 : null)) == null || (kVar != null && kVar.f28656a == 4)) {
            return z11;
        }
        return true;
    }

    public static final String t(g3.t tVar, Resources resources) {
        int iL;
        g3.o oVar = tVar.f28699d;
        g3.o oVar2 = tVar.f28699d;
        Object objG = oVar.f28691a.g(g3.x.f28711b);
        String string = null;
        if (objG == null) {
            objG = null;
        }
        y.i0 i0Var = oVar2.f28691a;
        Object objG2 = i0Var.g(g3.x.J);
        if (objG2 == null) {
            objG2 = null;
        }
        i3.a aVar = (i3.a) objG2;
        Object objG3 = i0Var.g(g3.x.f28733y);
        if (objG3 == null) {
            objG3 = null;
        }
        g3.k kVar = (g3.k) objG3;
        if (aVar != null) {
            int i11 = y.f58727a[aVar.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (objG == null) {
                        objG = resources.getString(com.lingodeer.R.string.indeterminate);
                    }
                } else if (kVar != null && kVar.f28656a == 2 && objG == null) {
                    objG = resources.getString(com.lingodeer.R.string.state_off);
                }
            } else if (kVar != null && kVar.f28656a == 2 && objG == null) {
                objG = resources.getString(com.lingodeer.R.string.state_on);
            }
        }
        Object objG4 = i0Var.g(g3.x.I);
        if (objG4 == null) {
            objG4 = null;
        }
        Boolean bool = (Boolean) objG4;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if ((kVar == null || kVar.f28656a != 4) && objG == null) {
                objG = zBooleanValue ? resources.getString(com.lingodeer.R.string.selected) : resources.getString(com.lingodeer.R.string.not_selected);
            }
        }
        Object objG5 = i0Var.g(g3.x.f28712c);
        if (objG5 == null) {
            objG5 = null;
        }
        g3.j jVar = (g3.j) objG5;
        if (jVar != null) {
            if (jVar != g3.j.f28652d) {
                if (objG == null) {
                    lz.d dVar = jVar.f28654b;
                    float f5 = dVar.f40531b;
                    float f11 = dVar.f40530a;
                    float f12 = f5 - f11 == CropImageView.DEFAULT_ASPECT_RATIO ? 0.0f : (jVar.f28653a - f11) / (dVar.f40531b - f11);
                    if (f12 < CropImageView.DEFAULT_ASPECT_RATIO) {
                        f12 = 0.0f;
                    }
                    if (f12 > 1.0f) {
                        f12 = 1.0f;
                    }
                    if (f12 == CropImageView.DEFAULT_ASPECT_RATIO) {
                        iL = 0;
                    } else {
                        iL = f12 == 1.0f ? 100 : hz.b.l(Math.round(f12 * 100), 1, 99);
                    }
                    objG = resources.getString(com.lingodeer.R.string.template_percent, Integer.valueOf(iL));
                }
            } else if (objG == null) {
                objG = resources.getString(com.lingodeer.R.string.in_progress);
            }
        }
        g3.a0 a0Var = g3.x.F;
        if (i0Var.c(a0Var)) {
            y.i0 i0Var2 = new g3.t(tVar.f28696a, true, tVar.f28698c, oVar2).k().f28691a;
            Object objG6 = i0Var2.g(g3.x.f28710a);
            if (objG6 == null) {
                objG6 = null;
            }
            Collection collection = (Collection) objG6;
            if (collection == null || collection.isEmpty()) {
                Object objG7 = i0Var2.g(g3.x.B);
                if (objG7 == null) {
                    objG7 = null;
                }
                Collection collection2 = (Collection) objG7;
                if (collection2 == null || collection2.isEmpty()) {
                    Object objG8 = i0Var2.g(a0Var);
                    if (objG8 == null) {
                        objG8 = null;
                    }
                    CharSequence charSequence = (CharSequence) objG8;
                    if (charSequence == null || charSequence.length() == 0) {
                        string = resources.getString(com.lingodeer.R.string.state_empty);
                    }
                }
            }
            objG = string;
        }
        return (String) objG;
    }

    public static final j3.h u(g3.t tVar) {
        g3.o oVar = tVar.f28699d;
        g3.a0 a0Var = g3.x.f28710a;
        j3.h hVar = (j3.h) g3.w.d(oVar, g3.x.F);
        List list = (List) g3.w.d(tVar.f28699d, g3.x.B);
        return hVar == null ? list != null ? (j3.h) ry.m.s0(list) : null : hVar;
    }

    public static boolean v() {
        try {
            if (AndroidComposeView.f1151l1 == null) {
                AndroidComposeView.f1151l1 = Class.forName("android.os.SystemProperties");
            }
            if (AndroidComposeView.f1152m1 == null) {
                Class cls = AndroidComposeView.f1151l1;
                AndroidComposeView.f1152m1 = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
            }
            Method method = AndroidComposeView.f1152m1;
            Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            return kotlin.jvm.internal.m.a(objInvoke instanceof Boolean ? (Boolean) objInvoke : null, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    public static final j3.u0 w(g3.o oVar) {
        fz.c cVar;
        ArrayList arrayList = new ArrayList();
        Object objG = oVar.f28691a.g(g3.n.f28666a);
        if (objG == null) {
            objG = null;
        }
        g3.a aVar = (g3.a) objG;
        if (aVar == null || (cVar = (fz.c) aVar.f28635b) == null || !((Boolean) cVar.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (j3.u0) arrayList.get(0);
    }

    public static final z1.r x(z1.r rVar, z1.r rVar2) {
        s1 s1Var = new s1();
        return rVar.i(s1Var).i(rVar2).i(s1Var.f58665b);
    }

    public static final boolean y(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f5 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        float f18 = fArr[8];
        float f19 = fArr[9];
        float f21 = fArr[10];
        float f22 = fArr[11];
        float f23 = fArr[12];
        float f24 = fArr[13];
        float f25 = fArr[14];
        float f26 = fArr[15];
        float f27 = (f5 * f15) - (f11 * f14);
        float f28 = (f5 * f16) - (f12 * f14);
        float f29 = (f5 * f17) - (f13 * f14);
        float f30 = (f11 * f16) - (f12 * f15);
        float f31 = (f11 * f17) - (f13 * f15);
        float f32 = (f12 * f17) - (f13 * f16);
        float f33 = (f18 * f24) - (f19 * f23);
        float f34 = (f18 * f25) - (f21 * f23);
        float f35 = (f18 * f26) - (f22 * f23);
        float f36 = (f19 * f25) - (f21 * f24);
        float f37 = (f19 * f26) - (f22 * f24);
        float f38 = (f21 * f26) - (f22 * f25);
        float f39 = (f32 * f33) + (((f30 * f35) + ((f29 * f36) + ((f27 * f38) - (f28 * f37)))) - (f31 * f34));
        if (f39 != CropImageView.DEFAULT_ASPECT_RATIO) {
            float f40 = 1.0f / f39;
            fArr2[0] = ((f17 * f36) + ((f15 * f38) - (f16 * f37))) * f40;
            fArr2[1] = (((f12 * f37) + ((-f11) * f38)) - (f13 * f36)) * f40;
            fArr2[2] = ((f26 * f30) + ((f24 * f32) - (f25 * f31))) * f40;
            fArr2[3] = (((f21 * f31) + ((-f19) * f32)) - (f22 * f30)) * f40;
            float f41 = -f14;
            fArr2[4] = (((f16 * f35) + (f41 * f38)) - (f17 * f34)) * f40;
            fArr2[5] = ((f13 * f34) + ((f38 * f5) - (f12 * f35))) * f40;
            float f42 = -f23;
            fArr2[6] = (((f25 * f29) + (f42 * f32)) - (f26 * f28)) * f40;
            fArr2[7] = ((f22 * f28) + ((f32 * f18) - (f21 * f29))) * f40;
            fArr2[8] = ((f17 * f33) + ((f14 * f37) - (f15 * f35))) * f40;
            fArr2[9] = (((f35 * f11) + ((-f5) * f37)) - (f13 * f33)) * f40;
            fArr2[10] = ((f26 * f27) + ((f23 * f31) - (f24 * f29))) * f40;
            fArr2[11] = (((f29 * f19) + ((-f18) * f31)) - (f22 * f27)) * f40;
            fArr2[12] = (((f15 * f34) + (f41 * f36)) - (f16 * f33)) * f40;
            fArr2[13] = ((f12 * f33) + ((f5 * f36) - (f11 * f34))) * f40;
            fArr2[14] = (((f24 * f28) + (f42 * f30)) - (f25 * f27)) * f40;
            fArr2[15] = ((f21 * f27) + ((f18 * f30) - (f19 * f28))) * f40;
        }
        return !(f39 == CropImageView.DEFAULT_ASPECT_RATIO);
    }

    public static final boolean z(float f5, float f11, g2.p0 p0Var) {
        f2.c cVar = new f2.c(f5 - 0.005f, f11 - 0.005f, f5 + 0.005f, f11 + 0.005f);
        g2.k kVarA = g2.o.a();
        g2.p0.a(kVarA, cVar);
        g2.k kVarA2 = g2.o.a();
        kVarA2.h(p0Var, kVarA, 1);
        boolean zIsEmpty = kVarA2.f28575a.isEmpty();
        kVarA2.j();
        kVarA.j();
        return !zIsEmpty;
    }
}
