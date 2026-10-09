package cf;

import aj.uZCn.evRpcb;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import bh.s1;
import com.google.api.Service;
import com.google.protobuf.DescriptorProtos;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.chineseskill.ui.pinyin.PinyinLearnActivity;
import com.lingo.lingoskill.object.Word;
import com.lingodeer.R;
import com.lingodeer.data.env.Env;
import com.lingodeer.data.model.INTENTS;
import com.lingodeer.data.model.SRSStatus;
import com.stkouyu.util.httputil.Consts;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.UCrop;
import com.yalantis.ucrop.view.CropImageView;
import e6.t0;
import e6.z;
import e6.z0;
import fr.p3;
import g3.a0;
import hh.b0;
import hh.p0;
import j9.c0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.Set;
import ko.Zea.ealNNtLp;
import kotlin.jvm.internal.m;
import l1.g1;
import l1.x1;
import qp.o2;
import rt.a1;
import rz.e0;
import y2.i0;
import y2.k1;
import z2.g0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {
    public static Intent A(Context context, xi.c pinyinLesson, int i11) {
        kotlin.jvm.internal.m.f(context, "context");
        kotlin.jvm.internal.m.f(pinyinLesson, "pinyinLesson");
        Intent intent = new Intent(context, (Class<?>) PinyinLearnActivity.class);
        intent.putExtra(INTENTS.EXTRA_OBJECT, pinyinLesson);
        intent.putExtra(INTENTS.EXTRA_INT, i11);
        return intent;
    }

    public static final Object B(w9.s sVar, fz.c cVar, xy.c cVar2) {
        if (sVar.q()) {
            return hz.b.W(sVar, new ca.f(0, cVar, null, sVar), cVar2);
        }
        wz.d dVar = sVar.f54850a;
        if (dVar != null) {
            return e0.M(dVar.f55510a, new b1.c(sVar, cVar, (vy.d) null), cVar2);
        }
        kotlin.jvm.internal.m.n("coroutineScope");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object C(vy.d dVar, w9.s sVar, boolean z11, boolean z12, fz.c cVar) {
        ca.g gVar;
        w9.s sVar2;
        boolean z13;
        boolean z14;
        fz.c cVar2;
        if (dVar instanceof ca.g) {
            gVar = (ca.g) dVar;
            int i11 = gVar.f6781f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.f6781f = i11 - Integer.MIN_VALUE;
            } else {
                gVar = new ca.g(dVar);
            }
        } else {
            gVar = new ca.g(dVar);
        }
        ca.g gVar2 = gVar;
        Object obj = gVar2.f6780e;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = gVar2.f6781f;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            if (sVar.q() && sVar.v() && sVar.r()) {
                ca.b bVar = new ca.b(z12, z11, sVar, null, cVar, 1);
                gVar2.f6781f = 1;
                Object objY = sVar.y(z11, bVar, gVar2);
                if (objY != aVar) {
                    return objY;
                }
            } else {
                gVar2.f6776a = sVar;
                gVar2.f6777b = cVar;
                gVar2.f6778c = z11;
                gVar2.f6779d = z12;
                gVar2.f6781f = 2;
                vy.i iVarJ = j(sVar, z12, gVar2);
                if (iVarJ != aVar) {
                    sVar2 = sVar;
                    z13 = z11;
                    obj = iVarJ;
                    z14 = z12;
                    cVar2 = cVar;
                }
            }
        }
        if (i12 == 1) {
            com.bumptech.glide.e.F(obj);
            return obj;
        }
        if (i12 != 2) {
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
            return obj;
        }
        boolean z15 = gVar2.f6779d;
        boolean z16 = gVar2.f6778c;
        fz.c cVar3 = gVar2.f6777b;
        w9.s sVar3 = gVar2.f6776a;
        com.bumptech.glide.e.F(obj);
        z14 = z15;
        z13 = z16;
        cVar2 = cVar3;
        sVar2 = sVar3;
        ca.c cVar4 = new ca.c((vy.d) null, sVar2, z13, z14, cVar2);
        gVar2.f6776a = null;
        gVar2.f6777b = null;
        gVar2.f6781f = 3;
        Object objM = e0.M((vy.i) obj, cVar4, gVar2);
        return objM == aVar ? aVar : objM;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:175:0x0396  */
    /* JADX WARN: Code duplicated, block: B:180:0x039e  */
    /* JADX WARN: Code duplicated, block: B:184:0x03af  */
    /* JADX WARN: Code duplicated, block: B:187:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:189:0x03be A[LOOP:5: B:188:0x03bc->B:189:0x03be, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:198:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:203:0x040c  */
    /* JADX WARN: Code duplicated, block: B:206:0x01b5 A[EDGE_INSN: B:206:0x01b5->B:72:0x01b5 BREAK  A[LOOP:0: B:9:0x003d->B:70:0x0191], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x018f A[DONT_INVERT, PHI: r6 r20 r21 r22 r23 r24 r25 r26 r27 r28 r29
      0x018f: PHI (r6v12 a2.f) = (r6v11 a2.f), (r6v13 a2.f) binds: [B:10:0x004c, B:68:0x018d] A[DONT_GENERATE, DONT_INLINE]
      0x018f: PHI (r20v6 boolean) = (r20v5 boolean), (r20v7 boolean) binds: [B:10:0x004c, B:68:0x018d] A[DONT_GENERATE, DONT_INLINE]
      0x018f: PHI (r21v5 i3.a) = (r21v4 i3.a), (r21v6 i3.a) binds: [B:10:0x004c, B:68:0x018d] A[DONT_GENERATE, DONT_INLINE]
      0x018f: PHI (r22v5 j3.h) = (r22v4 j3.h), (r22v6 j3.h) binds: [B:10:0x004c, B:68:0x018d] A[DONT_GENERATE, DONT_INLINE]
      0x018f: PHI (r23v13 a2.h) = (r23v12 a2.h), (r23v14 a2.h) binds: [B:10:0x004c, B:68:0x018d] A[DONT_GENERATE, DONT_INLINE]
      0x018f: PHI (r24v6 a2.r) = (r24v5 a2.r), (r24v7 a2.r) binds: [B:10:0x004c, B:68:0x018d] A[DONT_GENERATE, DONT_INLINE]
      0x018f: PHI (r25v6 java.lang.Boolean) = (r25v5 java.lang.Boolean), (r25v7 java.lang.Boolean) binds: [B:10:0x004c, B:68:0x018d] A[DONT_GENERATE, DONT_INLINE]
      0x018f: PHI (r26v13 g3.k) = (r26v12 g3.k), (r26v14 g3.k) binds: [B:10:0x004c, B:68:0x018d] A[DONT_GENERATE, DONT_INLINE]
      0x018f: PHI (r27v6 boolean) = (r27v5 boolean), (r27v7 boolean) binds: [B:10:0x004c, B:68:0x018d] A[DONT_GENERATE, DONT_INLINE]
      0x018f: PHI (r28v7 boolean) = (r28v6 boolean), (r28v8 boolean) binds: [B:10:0x004c, B:68:0x018d] A[DONT_GENERATE, DONT_INLINE]
      0x018f: PHI (r29v6 java.lang.Integer) = (r29v5 java.lang.Integer), (r29v7 java.lang.Integer) binds: [B:10:0x004c, B:68:0x018d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x0191 A[LOOP:0: B:9:0x003d->B:70:0x0191, LOOP_END] */
    public static final void D(ViewStructure viewStructure, i0 i0Var, AutofillId autofillId, String str, h3.b bVar) {
        long j11;
        long j12;
        char c11;
        long j13;
        i3.a aVar;
        j3.h hVar;
        a2.h hVar2;
        g3.k kVar;
        a2.f fVar;
        boolean z11;
        boolean z12;
        a2.r rVar;
        Boolean bool;
        boolean z13;
        Integer num;
        boolean z14;
        List list;
        Integer numValueOf;
        boolean z15;
        boolean z16;
        boolean z17;
        String strE;
        int size;
        String strO;
        int i11;
        String[] strArrM;
        String[] strArrM2;
        y.i0 i0Var2;
        Object[] objArr;
        int i12;
        Object[] objArr2;
        boolean z18;
        y.i0 i0Var3;
        i3.a aVar2;
        j3.h hVar3;
        a2.h hVar4;
        g3.k kVar2;
        boolean zBooleanValue;
        int i13;
        a0 a0Var = g3.x.f28710a;
        a0 a0Var2 = g3.n.f28666a;
        g3.o oVarY = i0Var.y();
        int i14 = 8;
        if (oVarY == null || (i0Var3 = oVarY.f28691a) == null) {
            j11 = 128;
            j12 = 255;
            c11 = 7;
            j13 = -9187201950435737472L;
            aVar = null;
            hVar = null;
            hVar2 = null;
            kVar = null;
            fVar = null;
            z11 = true;
            z12 = false;
            rVar = null;
            bool = null;
            z13 = false;
            num = null;
        } else {
            Object[] objArr3 = i0Var3.f56714b;
            j11 = 128;
            Object[] objArr4 = i0Var3.f56715c;
            long[] jArr = i0Var3.f56713a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i15 = 0;
                fVar = null;
                j12 = 255;
                z12 = false;
                aVar2 = null;
                hVar3 = null;
                hVar4 = null;
                rVar = null;
                bool = null;
                kVar2 = null;
                z13 = false;
                zBooleanValue = true;
                num = null;
                c11 = 7;
                while (true) {
                    long j14 = jArr[i15];
                    j13 = -9187201950435737472L;
                    if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i16 = 8 - ((~(i15 - length)) >>> 31);
                        int i17 = 0;
                        while (i17 < i16) {
                            if ((j14 & 255) < 128) {
                                int i18 = (i15 << 3) + i17;
                                Object obj = objArr3[i18];
                                Object obj2 = objArr4[i18];
                                a0 a0Var3 = (a0) obj;
                                i13 = i14;
                                if (kotlin.jvm.internal.m.a(a0Var3, g3.x.f28726r)) {
                                    kotlin.jvm.internal.m.d(obj2, "null cannot be cast to non-null type androidx.compose.ui.autofill.ContentDataType");
                                    fVar = (a2.f) obj2;
                                } else if (kotlin.jvm.internal.m.a(a0Var3, g3.x.f28710a)) {
                                    kotlin.jvm.internal.m.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                    CharSequence charSequence = (String) ry.m.s0((List) obj2);
                                    if (charSequence != null) {
                                        viewStructure.setContentDescription(charSequence);
                                    }
                                } else if (kotlin.jvm.internal.m.a(a0Var3, g3.x.f28725q)) {
                                    kotlin.jvm.internal.m.d(obj2, "null cannot be cast to non-null type androidx.compose.ui.autofill.ContentType");
                                    rVar = (a2.r) obj2;
                                } else if (kotlin.jvm.internal.m.a(a0Var3, g3.x.f28727s)) {
                                    kotlin.jvm.internal.m.d(obj2, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidFillableData");
                                    hVar4 = (a2.h) obj2;
                                } else if (kotlin.jvm.internal.m.a(a0Var3, g3.x.F)) {
                                    kotlin.jvm.internal.m.d(obj2, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString");
                                    hVar3 = (j3.h) obj2;
                                } else if (kotlin.jvm.internal.m.a(a0Var3, g3.x.f28720k)) {
                                    kotlin.jvm.internal.m.d(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                    viewStructure.setFocused(((Boolean) obj2).booleanValue());
                                } else if (kotlin.jvm.internal.m.a(a0Var3, g3.x.O)) {
                                    kotlin.jvm.internal.m.d(obj2, "null cannot be cast to non-null type kotlin.Int");
                                    num = (Integer) obj2;
                                } else if (kotlin.jvm.internal.m.a(a0Var3, g3.x.K)) {
                                    z13 = true;
                                } else if (kotlin.jvm.internal.m.a(a0Var3, g3.x.f28722n)) {
                                    kotlin.jvm.internal.m.d(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                    zBooleanValue = ((Boolean) obj2).booleanValue();
                                } else if (kotlin.jvm.internal.m.a(a0Var3, g3.x.f28733y)) {
                                    kotlin.jvm.internal.m.d(obj2, "null cannot be cast to non-null type androidx.compose.ui.semantics.Role");
                                    kVar2 = (g3.k) obj2;
                                } else if (kotlin.jvm.internal.m.a(a0Var3, g3.x.I)) {
                                    kotlin.jvm.internal.m.d(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                    bool = (Boolean) obj2;
                                } else if (kotlin.jvm.internal.m.a(a0Var3, g3.x.J)) {
                                    kotlin.jvm.internal.m.d(obj2, "null cannot be cast to non-null type androidx.compose.ui.state.ToggleableState");
                                    aVar2 = (i3.a) obj2;
                                } else if (kotlin.jvm.internal.m.a(a0Var3, g3.n.f28667b)) {
                                    viewStructure.setClickable(true);
                                } else if (kotlin.jvm.internal.m.a(a0Var3, g3.n.f28668c)) {
                                    viewStructure.setLongClickable(true);
                                } else if (kotlin.jvm.internal.m.a(a0Var3, g3.n.f28687w)) {
                                    viewStructure.setFocusable(true);
                                } else if (kotlin.jvm.internal.m.a(a0Var3, g3.n.f28676k)) {
                                    z12 = true;
                                }
                            } else {
                                i13 = i14;
                            }
                            j14 >>= i13;
                            i17++;
                            i14 = i13;
                        }
                        if (i16 != i14) {
                            break;
                        }
                        if (i15 != length) {
                            break;
                        }
                        i15++;
                        i14 = 8;
                    } else if (i15 != length) {
                        break;
                        break;
                    } else {
                        i15++;
                        i14 = 8;
                    }
                }
            } else {
                j12 = 255;
                c11 = 7;
                j13 = -9187201950435737472L;
                fVar = null;
                z12 = false;
                aVar2 = null;
                hVar3 = null;
                hVar4 = null;
                rVar = null;
                bool = null;
                kVar2 = null;
                z13 = false;
                zBooleanValue = true;
                num = null;
            }
            aVar = aVar2;
            hVar = hVar3;
            hVar2 = hVar4;
            kVar = kVar2;
            z11 = zBooleanValue;
        }
        g3.o oVarY2 = i0Var.y();
        if (oVarY2 != null && oVarY2.f28693c && !oVarY2.f28694d) {
            oVarY2 = oVarY2.d();
            y.e0 e0Var = new y.e0(((n1.e) ((n1.b) i0Var.o()).f43104b).f43114c);
            e0Var.b(i0Var.o());
            while (e0Var.i()) {
                i0 i0Var4 = (i0) e0Var.k(e0Var.f56687b - 1);
                g3.o oVarY3 = i0Var4.y();
                if (oVarY3 != null && !oVarY3.f28693c) {
                    oVarY2.f(oVarY3);
                    if (!oVarY3.f28694d) {
                        e0Var.b(i0Var4.o());
                    }
                }
            }
        }
        if (oVarY2 == null || (i0Var2 = oVarY2.f28691a) == null) {
            z14 = z11;
            list = null;
        } else {
            Object[] objArr5 = i0Var2.f56714b;
            Object[] objArr6 = i0Var2.f56715c;
            long[] jArr2 = i0Var2.f56713a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i19 = 0;
                list = null;
                while (true) {
                    long j15 = jArr2[i19];
                    long[] jArr3 = jArr2;
                    Object[] objArr7 = objArr5;
                    if ((((~j15) << c11) & j15 & j13) != j13) {
                        int i21 = 8 - ((~(i19 - length2)) >>> 31);
                        int i22 = 0;
                        while (i22 < i21) {
                            if ((j15 & j12) < j11) {
                                int i23 = (i19 << 3) + i22;
                                Object obj3 = objArr7[i23];
                                i12 = i22;
                                Object obj4 = objArr6[i23];
                                objArr2 = objArr6;
                                a0 a0Var4 = (a0) obj3;
                                z18 = z11;
                                if (kotlin.jvm.internal.m.a(a0Var4, g3.x.f28718i)) {
                                    viewStructure.setEnabled(false);
                                } else if (kotlin.jvm.internal.m.a(a0Var4, g3.x.B)) {
                                    kotlin.jvm.internal.m.d(obj4, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString>");
                                    list = (List) obj4;
                                }
                            } else {
                                i12 = i22;
                                objArr2 = objArr6;
                                z18 = z11;
                            }
                            j15 >>= 8;
                            i22 = i12 + 1;
                            objArr6 = objArr2;
                            z11 = z18;
                        }
                        objArr = objArr6;
                        z14 = z11;
                        if (i21 != 8) {
                            break;
                        }
                    } else {
                        objArr = objArr6;
                        z14 = z11;
                    }
                    if (i19 == length2) {
                        break;
                    }
                    i19++;
                    objArr5 = objArr7;
                    jArr2 = jArr3;
                    objArr6 = objArr;
                    z11 = z14;
                }
            } else {
                z14 = z11;
                list = null;
            }
        }
        Integer numValueOf2 = Integer.valueOf(i0Var.f56880b);
        if (i0Var.w() == null) {
            numValueOf2 = null;
        }
        int iIntValue = numValueOf2 != null ? numValueOf2.intValue() : -1;
        a2.j.d(viewStructure, autofillId, iIntValue);
        viewStructure.setId(iIntValue, str, null, null);
        if (fVar != null) {
            numValueOf = Integer.valueOf(fVar.f308a);
        } else if (z12) {
            numValueOf = 1;
        } else {
            numValueOf = aVar != null ? 2 : null;
        }
        if (numValueOf != null) {
            a2.j.e(viewStructure, numValueOf.intValue());
        }
        if (hVar != null) {
            a2.j.f(viewStructure, a2.j.a(hVar.f35700b));
        }
        if (hVar2 != null) {
            a2.j.f(viewStructure, hVar2.f310a);
        }
        if (rVar != null && (strArrM2 = c.a.m(rVar)) != null) {
            a2.j.c(viewStructure, strArrM2);
        }
        bVar.f31536a.G(i0Var.f56880b, new a2.t(viewStructure));
        if (bool != null) {
            viewStructure.setSelected(bool.booleanValue());
        }
        if (aVar != null) {
            viewStructure.setCheckable(true);
            viewStructure.setChecked(aVar == i3.a.On);
        } else if (bool != null && (kVar == null || kVar.f28656a != 4)) {
            viewStructure.setCheckable(true);
            viewStructure.setChecked(bool.booleanValue());
        }
        a2.r.f317a.getClass();
        String str2 = (String) ry.l.U(c.a.m(a2.q.f316b));
        if (rVar != null && (strArrM = c.a.m(rVar)) != null) {
            z15 = true;
            boolean z19 = ry.l.D(strArrM, str2);
            if (!z13 || z19) {
                z16 = z15;
            } else {
                z16 = false;
            }
            if (!z16 || z14) {
                z17 = z15;
            } else {
                z17 = false;
            }
            a2.j.g(viewStructure, z17);
            viewStructure.setVisibility(((k1) i0Var.f56892i0.f50087e).k1() ? 4 : 0);
            if (list != null) {
                size = list.size();
                strO = BuildConfig.VERSION_NAME;
                for (i11 = 0; i11 < size; i11++) {
                    strO = p0.o(ep.a.n(strO), ((j3.h) list.get(i11)).f35700b, '\n');
                }
                viewStructure.setText(strO);
                viewStructure.setClassName("android.widget.TextView");
            }
            if (((n1.b) i0Var.o()).isEmpty() && kVar != null && (strE = g0.E(kVar.f28656a)) != null) {
                viewStructure.setClassName(strE);
            }
            if (z12) {
                viewStructure.setClassName("android.widget.EditText");
                if (Build.VERSION.SDK_INT >= 28 && num != null) {
                    a2.l.D(viewStructure, num.intValue());
                }
                if (z16) {
                    a2.j.h(viewStructure);
                }
            }
        }
        z15 = true;
        if (z13) {
            z16 = z15;
        } else {
            z16 = z15;
        }
        if (z16) {
            z17 = z15;
        } else {
            z17 = z15;
        }
        a2.j.g(viewStructure, z17);
        viewStructure.setVisibility(((k1) i0Var.f56892i0.f50087e).k1() ? 4 : 0);
        if (list != null) {
            size = list.size();
            strO = BuildConfig.VERSION_NAME;
            while (i11 < size) {
                strO = p0.o(ep.a.n(strO), ((j3.h) list.get(i11)).f35700b, '\n');
            }
            viewStructure.setText(strO);
            viewStructure.setClassName("android.widget.TextView");
        }
        if (((n1.b) i0Var.o()).isEmpty()) {
            viewStructure.setClassName(strE);
        }
        if (z12) {
            viewStructure.setClassName("android.widget.EditText");
            if (Build.VERSION.SDK_INT >= 28) {
                a2.l.D(viewStructure, num.intValue());
            }
            if (z16) {
                a2.j.h(viewStructure);
            }
        }
    }

    public static int[] E(int i11, int i12) {
        Random random = new Random();
        if (i12 > i11) {
            i12 = i11;
        }
        ArrayList arrayList = new ArrayList();
        while (arrayList.size() < i12) {
            int iAbs = Math.abs(random.nextInt()) % i11;
            if (-1 == arrayList.indexOf(Integer.valueOf(iAbs))) {
                arrayList.add(Integer.valueOf(iAbs));
            }
            if (arrayList.size() >= i11) {
                break;
            }
        }
        int[] iArr = new int[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            Object obj = arrayList.get(i13);
            kotlin.jvm.internal.m.e(obj, "get(...)");
            iArr[i13] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static final Cursor F(w9.s db2, ka.f fVar, boolean z11) {
        kotlin.jvm.internal.m.f(db2, "db");
        db2.a();
        db2.b();
        Cursor cursorN0 = db2.l().n0().N0(fVar);
        if (z11 && (cursorN0 instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorN0;
            int count = abstractWindowedCursor.getCount();
            if ((abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) {
                try {
                    MatrixCursor matrixCursor = new MatrixCursor(cursorN0.getColumnNames(), cursorN0.getCount());
                    while (cursorN0.moveToNext()) {
                        Object[] objArr = new Object[cursorN0.getColumnCount()];
                        int columnCount = cursorN0.getColumnCount();
                        for (int i11 = 0; i11 < columnCount; i11++) {
                            int type = cursorN0.getType(i11);
                            if (type == 0) {
                                objArr[i11] = null;
                            } else if (type == 1) {
                                objArr[i11] = Long.valueOf(cursorN0.getLong(i11));
                            } else if (type == 2) {
                                objArr[i11] = Double.valueOf(cursorN0.getDouble(i11));
                            } else if (type == 3) {
                                objArr[i11] = cursorN0.getString(i11);
                            } else {
                                if (type != 4) {
                                    throw new IllegalStateException();
                                }
                                objArr[i11] = cursorN0.getBlob(i11);
                            }
                        }
                        matrixCursor.addRow(objArr);
                    }
                    cursorN0.close();
                    return matrixCursor;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        ns.o.m(cursorN0, th2);
                        throw th3;
                    }
                }
            }
        }
        return cursorN0;
    }

    public static final int G(File file) throws IOException {
        FileChannel channel = new FileInputStream(file).getChannel();
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(byteBufferAllocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            byteBufferAllocate.rewind();
            int i11 = byteBufferAllocate.getInt();
            channel.close();
            return i11;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ns.o.m(channel, th2);
                throw th3;
            }
        }
    }

    public static final j9.v H(c0[] c0VarArr, l1.n nVar) {
        l1.s sVar = (l1.s) nVar;
        Context context = (Context) sVar.j(AndroidCompositionLocals_androidKt.f1200b);
        Object[] objArrCopyOf = Arrays.copyOf(c0VarArr, c0VarArr.length);
        o2 o2Var = new o2(6, new k9.q(0), new fu.h(context, 1));
        boolean zH = sVar.h(context);
        Object objQ = sVar.Q();
        if (zH || objQ == l1.m.f39353a) {
            objQ = new com.google.firebase.sessions.a(context, 4);
            sVar.o0(objQ);
        }
        j9.v vVar = (j9.v) w1.j.e(objArrCopyOf, o2Var, (fz.a) objQ, sVar, 0, 4);
        for (c0 c0Var : c0VarArr) {
            vVar.f36257b.f41087s.a(c0Var);
        }
        return vVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Serializable I(ArrayList arrayList, boolean z11, rs.b bVar, xy.c cVar) {
        a1 a1Var;
        if (cVar instanceof a1) {
            a1Var = (a1) cVar;
            int i11 = a1Var.f49417c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                a1Var.f49417c = i11 - Integer.MIN_VALUE;
            } else {
                a1Var = new a1(cVar);
            }
        } else {
            a1Var = new a1(cVar);
        }
        Object objF = a1Var.f49416b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = a1Var.f49417c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objF);
            rs.a aVarC = rs.c.c(arrayList);
            if (!z11) {
                Set wordIds = aVarC.f49394a;
                Set sentenceIds = aVarC.f49395b;
                kotlin.jvm.internal.m.f(wordIds, "wordIds");
                kotlin.jvm.internal.m.f(sentenceIds, "sentenceIds");
                aVarC = new rs.a(wordIds, sentenceIds, ry.t.f50856a);
            }
            a1Var.f49415a = arrayList;
            a1Var.f49417c = 1;
            objF = ((s1) bVar).f(aVarC, a1Var);
            if (objF == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = a1Var.f49415a;
            com.bumptech.glide.e.F(objF);
        }
        rs.a aVar2 = (rs.a) objF;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            if (rs.c.a(aVar2, (SRSStatus) obj)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static final void L(ImageView imageView, int i11, ColorStateList colorStateList) {
        Drawable drawableNewDrawable;
        kotlin.jvm.internal.m.f(imageView, "imageView");
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        kotlin.jvm.internal.m.c(lingoSkillApplication);
        Drawable drawable = lingoSkillApplication.getDrawable(i11);
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null && (drawableNewDrawable = constantState.newDrawable()) != null) {
                drawable = drawableNewDrawable;
            }
            Drawable drawableMutate = drawable.mutate();
            kotlin.jvm.internal.m.e(drawableMutate, "mutate(...)");
            drawableMutate.setTintList(colorStateList);
            imageView.setImageDrawable(drawableMutate);
        }
    }

    public static final boolean M(c6.g gVar) {
        ArrayList arrayList;
        if (gVar instanceof z) {
            return true;
        }
        if ((gVar instanceof c6.i) && ((arrayList = ((c6.i) gVar).f6630b) == null || !arrayList.isEmpty())) {
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                if (M((c6.g) obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String O(Throwable th2) {
        kotlin.jvm.internal.m.f(th2, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th2.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        kotlin.jvm.internal.m.e(string, "toString(...)");
        return string;
    }

    public static final String P(float f5) {
        if (Float.isNaN(f5)) {
            return "NaN";
        }
        if (Float.isInfinite(f5)) {
            return f5 < CropImageView.DEFAULT_ASPECT_RATIO ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0f, iMax);
        float f11 = f5 * fPow;
        int i11 = (int) f11;
        if (f11 - i11 >= 0.5f) {
            i11++;
        }
        float f12 = i11 / fPow;
        return iMax > 0 ? String.valueOf(f12) : String.valueOf((int) f12);
    }

    public static final void a(l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1257244356);
        if (i11 == 0 && sVar.F()) {
            sVar.W();
        } else {
            int i12 = t0.f25050a;
            sVar.e0(-1115894518);
            sVar.e0(1886828752);
            if (!(sVar.f39434a instanceof c6.b)) {
                l1.t.z();
                throw null;
            }
            sVar.b0();
            int i13 = 1;
            int i14 = 0;
            if (sVar.S) {
                sVar.k(new e6.t(i14, i13));
            } else {
                sVar.r0();
            }
            com.google.android.material.datepicker.d.B(sVar, true, false, false);
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new z0(i11);
        }
    }

    public static void b(Throwable th2, Throwable exception) throws IllegalAccessException, InvocationTargetException {
        kotlin.jvm.internal.m.f(th2, "<this>");
        kotlin.jvm.internal.m.f(exception, "exception");
        if (th2 != exception) {
            Integer num = az.a.f3410a;
            if (num == null || num.intValue() >= 19) {
                th2.addSuppressed(exception);
                return;
            }
            Method method = zy.a.f59642a;
            if (method != null) {
                method.invoke(th2, exception);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:29:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x004f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    public static boolean c(int i11, Rect rect, Rect rect2, Rect rect3) {
        int iW;
        int i12;
        int i13;
        boolean zD = d(i11, rect, rect2);
        if (d(i11, rect, rect3) || !zD) {
            return false;
        }
        if (i11 != 17) {
            if (i11 != 33) {
                if (i11 != 66) {
                    if (i11 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    if (rect.bottom <= rect3.top) {
                        if (i11 != 17 && i11 != 66) {
                            iW = w(i11, rect, rect2);
                            if (i11 != 17) {
                                i12 = rect.left;
                                i13 = rect3.left;
                            } else if (i11 != 33) {
                                i12 = rect.top;
                                i13 = rect3.top;
                            } else if (i11 != 66) {
                                i12 = rect3.right;
                                i13 = rect.right;
                            } else {
                                if (i11 == 130) {
                                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                }
                                i12 = rect3.bottom;
                                i13 = rect.bottom;
                            }
                            if (iW < Math.max(1, i12 - i13)) {
                                return false;
                            }
                        }
                    }
                } else if (rect.right <= rect3.left) {
                    if (i11 != 17) {
                        iW = w(i11, rect, rect2);
                        if (i11 != 17) {
                            i12 = rect.left;
                            i13 = rect3.left;
                        } else if (i11 != 33) {
                            i12 = rect.top;
                            i13 = rect3.top;
                        } else if (i11 != 66) {
                            i12 = rect3.right;
                            i13 = rect.right;
                        } else {
                            if (i11 == 130) {
                                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            }
                            i12 = rect3.bottom;
                            i13 = rect.bottom;
                        }
                        if (iW < Math.max(1, i12 - i13)) {
                            return false;
                        }
                    }
                }
            } else if (rect.top >= rect3.bottom) {
                if (i11 != 17) {
                    iW = w(i11, rect, rect2);
                    if (i11 != 17) {
                        i12 = rect.left;
                        i13 = rect3.left;
                    } else if (i11 != 33) {
                        i12 = rect.top;
                        i13 = rect3.top;
                    } else if (i11 != 66) {
                        i12 = rect3.right;
                        i13 = rect.right;
                    } else {
                        if (i11 == 130) {
                            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        }
                        i12 = rect3.bottom;
                        i13 = rect.bottom;
                    }
                    if (iW < Math.max(1, i12 - i13)) {
                        return false;
                    }
                }
            }
        } else if (rect.left >= rect3.right) {
            if (i11 != 17) {
                iW = w(i11, rect, rect2);
                if (i11 != 17) {
                    i12 = rect.left;
                    i13 = rect3.left;
                } else if (i11 != 33) {
                    i12 = rect.top;
                    i13 = rect3.top;
                } else if (i11 != 66) {
                    i12 = rect3.right;
                    i13 = rect.right;
                } else {
                    if (i11 == 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    i12 = rect3.bottom;
                    i13 = rect.bottom;
                }
                if (iW < Math.max(1, i12 - i13)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean d(int i11, Rect rect, Rect rect2) {
        if (i11 != 17) {
            if (i11 != 33) {
                if (i11 != 66) {
                    if (i11 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static final long e(o0.t tVar) {
        return hz.b.R(((g1) tVar.f44435d.f7511d).l() * tVar.o()) + (((long) tVar.k()) * ((long) tVar.o()));
    }

    public static final long f() {
        return Thread.currentThread().getId();
    }

    public static final void g(ja.a connection) {
        kotlin.jvm.internal.m.f(connection, "connection");
        sy.c cVarO = ns.o.o();
        ja.c cVarB1 = connection.B1("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cVarB1.r1()) {
            try {
                cVarO.add(cVarB1.B0(0));
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    hz.b.h(cVarB1, th2);
                    throw th3;
                }
            }
        }
        hz.b.h(cVarB1, null);
        ListIterator listIterator = ns.o.e(cVarO).listIterator(0);
        while (true) {
            sy.a aVar = (sy.a) listIterator;
            if (!aVar.hasNext()) {
                return;
            }
            String str = (String) aVar.next();
            if (oz.x.s0(str, "room_fts_content_sync_", false)) {
                com.bumptech.glide.f.o(connection, "DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    public static mi.c h() {
        mi.c cVar;
        p3 p3Var = mi.c.K;
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        kotlin.jvm.internal.m.c(lingoSkillApplication);
        mi.c cVar2 = mi.c.L;
        if (cVar2 != null) {
            return cVar2;
        }
        synchronized (p3Var) {
            cVar = mi.c.L;
            if (cVar == null) {
                cVar = new mi.c(lingoSkillApplication);
                mi.c.L = cVar;
            }
        }
        return cVar;
    }

    public static final Class i(String str) {
        if (qf.a.b(x.class)) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Throwable th2) {
            qf.a.a(x.class, th2);
            return null;
        }
    }

    public static final vy.i j(w9.s sVar, boolean z11, xy.c cVar) {
        if (!sVar.q()) {
            wz.d dVar = sVar.f54850a;
            if (dVar != null) {
                return dVar.f55510a;
            }
            kotlin.jvm.internal.m.n("coroutineScope");
            throw null;
        }
        w9.v vVar = (w9.v) cVar.getContext().get(w9.v.f54871c);
        if (vVar != null) {
            vy.f fVar = vVar.f54872a;
            wz.d dVar2 = sVar.f54850a;
            if (dVar2 == null) {
                kotlin.jvm.internal.m.n("coroutineScope");
                throw null;
            }
            vy.i iVarPlus = dVar2.f55510a.plus(fVar);
            if (iVarPlus != null) {
                return iVarPlus;
            }
        }
        if (z11) {
            vy.i iVar = sVar.f54851b;
            if (iVar != null) {
                return iVar;
            }
            kotlin.jvm.internal.m.n("transactionContext");
            throw null;
        }
        wz.d dVar3 = sVar.f54850a;
        if (dVar3 != null) {
            return dVar3.f55510a;
        }
        kotlin.jvm.internal.m.n("coroutineScope");
        throw null;
    }

    public static ij.f k(Context context, int i11) {
        kotlin.jvm.internal.m.f(context, "context");
        int i12 = 1;
        int i13 = 8;
        int i14 = 9;
        int i15 = 5;
        int i16 = 6;
        int i17 = 7;
        int i18 = 4;
        int i19 = 0;
        int i21 = 2;
        int i22 = 3;
        switch (i11) {
            case 0:
            case 11:
            case Consts.SP /* 32 */:
            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
            case 35:
                return new ao.b(context, 3);
            case 1:
            case 12:
            case 30:
            case 33:
            case 37:
                return new ao.b(context, 1);
            case 2:
            case 13:
            case 31:
            case 38:
                return new ao.b(context, 8);
            case 3:
            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                return new ao.b(context, 9);
            case 4:
            case 14:
            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                cl.a aVar = new cl.a(context, i12);
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                aVar.f7181c = n().esDefaultLan;
                aVar.f7182d = 3;
                return aVar;
            case 5:
            case 15:
            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                return new ao.b(context, 4);
            case 6:
            case 16:
            case 43:
                return new ao.b(context, 2);
            case 7:
            case 56:
                cl.a aVar2 = new cl.a(context, i22);
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                aVar2.f7181c = n().vtDefaultLan;
                aVar2.f7182d = 3;
                return aVar2;
            case 8:
            case 17:
            case 46:
                return new ao.b(context, 5);
            case 9:
            case 23:
            case Service.METRICS_FIELD_NUMBER /* 24 */:
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
            case Service.BILLING_FIELD_NUMBER /* 26 */:
            case 27:
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
            case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
            case 58:
            default:
                return null;
            case 10:
            case 22:
            case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                return new ao.b(context, 0);
            case 18:
            case 67:
                cl.a aVar3 = new cl.a(context, i13);
                LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                aVar3.f7181c = n().idnDefaultLan;
                aVar3.f7182d = 3;
                return aVar3;
            case 19:
            case 68:
                cl.a aVar4 = new cl.a(context, i16);
                LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                aVar4.f7181c = n().polDefaultLan;
                aVar4.f7182d = 3;
                return aVar4;
            case 20:
            case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                return new xl.a(context);
            case 21:
            case 60:
                cl.a aVar5 = new cl.a(context, i14);
                LingoSkillApplication lingoSkillApplication5 = LingoSkillApplication.f21665b;
                aVar5.f7181c = n().turDefaultLan;
                aVar5.f7182d = 3;
                return aVar5;
            case 47:
            case 48:
                cl.a aVar6 = new cl.a(context, i15);
                LingoSkillApplication lingoSkillApplication6 = LingoSkillApplication.f21665b;
                aVar6.f7181c = n().esusDefaultLan;
                aVar6.f7182d = 3;
                return aVar6;
            case 49:
            case 50:
                return new ao.b(context, 6);
            case 51:
            case 52:
            case 55:
                return new ao.b(context, 7);
            case 53:
            case 54:
                cl.a aVar7 = new cl.a(context, 11);
                LingoSkillApplication lingoSkillApplication7 = LingoSkillApplication.f21665b;
                aVar7.f7181c = n().frusDefaultLan;
                aVar7.f7182d = 3;
                return aVar7;
            case 57:
            case 59:
                cl.a aVar8 = new cl.a(context, i17);
                LingoSkillApplication lingoSkillApplication8 = LingoSkillApplication.f21665b;
                aVar8.f7181c = n().thaiDefaultLan;
                aVar8.f7182d = 3;
                return aVar8;
            case 61:
            case 62:
                cl.a aVar9 = new cl.a(context, i18);
                LingoSkillApplication lingoSkillApplication9 = LingoSkillApplication.f21665b;
                aVar9.f7181c = n().hiDefaultLan;
                aVar9.f7182d = 3;
                return aVar9;
            case 63:
            case 64:
                cl.a aVar10 = new cl.a(context, 10);
                LingoSkillApplication lingoSkillApplication10 = LingoSkillApplication.f21665b;
                aVar10.f7181c = n().ukrDefaultLan;
                aVar10.f7182d = 3;
                return aVar10;
            case 65:
            case 66:
                cl.a aVar11 = new cl.a(context, i19);
                LingoSkillApplication lingoSkillApplication11 = LingoSkillApplication.f21665b;
                aVar11.f7181c = n().grkDefaultLan;
                aVar11.f7182d = 3;
                return aVar11;
            case UCrop.REQUEST_CROP /* 69 */:
            case 70:
                cl.a aVar12 = new cl.a(context, i21);
                LingoSkillApplication lingoSkillApplication12 = LingoSkillApplication.f21665b;
                aVar12.f7181c = n().malDefaultLan;
                aVar12.f7182d = 3;
                return aVar12;
        }
    }

    public static final Method l(Class cls, String str, Class... args) {
        if (!qf.a.b(x.class)) {
            try {
                kotlin.jvm.internal.m.f(args, "args");
                try {
                    return cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(args, args.length));
                } catch (NoSuchMethodException unused) {
                }
            } catch (Throwable th2) {
                qf.a.a(x.class, th2);
                return null;
            }
        }
        return null;
    }

    public static String m(m9.e context, int i11) {
        kotlin.jvm.internal.m.f(context, "context");
        if (i11 <= 16777215) {
            return String.valueOf(i11);
        }
        try {
            Context context2 = context.f41067a;
            kotlin.jvm.internal.m.c(context2);
            String resourceName = context2.getResources().getResourceName(i11);
            kotlin.jvm.internal.m.c(resourceName);
            return resourceName;
        } catch (Resources.NotFoundException unused) {
            return String.valueOf(i11);
        }
    }

    public static Env n() {
        Object value = LingoSkillApplication.K.getValue();
        kotlin.jvm.internal.m.e(value, "getValue(...)");
        return (Env) value;
    }

    public static nz.l o(j9.q qVar) {
        kotlin.jvm.internal.m.f(qVar, "<this>");
        return nz.n.U(qVar, new j3.i0(28));
    }

    public static final Method p(Class cls, String str, Class... clsArr) {
        if (!qf.a.b(x.class)) {
            try {
                return cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            } catch (NoSuchMethodException unused) {
            } catch (Throwable th2) {
                qf.a.a(x.class, th2);
            }
        }
        return null;
    }

    public static final Object t(Class clazz, Object obj, Method method, Object... args) {
        if (qf.a.b(x.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.m.f(clazz, "clazz");
            kotlin.jvm.internal.m.f(method, "method");
            kotlin.jvm.internal.m.f(args, "args");
            if (obj != null) {
                obj = clazz.cast(obj);
            }
            try {
                return method.invoke(obj, Arrays.copyOf(args, args.length));
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return null;
            }
        } catch (Throwable th2) {
            qf.a.a(x.class, th2);
            return null;
        }
    }

    public static boolean v(int i11, Rect rect, Rect rect2) {
        if (i11 == 17) {
            int i12 = rect.right;
            int i13 = rect2.right;
            return (i12 > i13 || rect.left >= i13) && rect.left > rect2.left;
        }
        if (i11 == 33) {
            int i14 = rect.bottom;
            int i15 = rect2.bottom;
            return (i14 > i15 || rect.top >= i15) && rect.top > rect2.top;
        }
        if (i11 == 66) {
            int i16 = rect.left;
            int i17 = rect2.left;
            return (i16 < i17 || rect.right <= i17) && rect.right < rect2.right;
        }
        if (i11 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i18 = rect.top;
        int i19 = rect2.top;
        return (i18 < i19 || rect.bottom <= i19) && rect.bottom < rect2.bottom;
    }

    public static int w(int i11, Rect rect, Rect rect2) {
        int i12;
        int i13;
        if (i11 == 17) {
            i12 = rect.left;
            i13 = rect2.right;
        } else if (i11 == 33) {
            i12 = rect.top;
            i13 = rect2.bottom;
        } else if (i11 == 66) {
            i12 = rect2.left;
            i13 = rect.right;
        } else {
            if (i11 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i12 = rect2.top;
            i13 = rect.bottom;
        }
        return Math.max(0, i12 - i13);
    }

    public static int x(int i11, Rect rect, Rect rect2) {
        if (i11 != 17) {
            if (i11 != 33) {
                if (i11 != 66) {
                    if (i11 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static final d6.f y(d6.d... dVarArr) {
        ArrayList arrayList = new ArrayList(dVarArr.length);
        if (dVarArr.length <= 0) {
            qy.l[] lVarArr = (qy.l[]) arrayList.toArray(new qy.l[0]);
            return new d6.f(ry.x.a0((qy.l[]) Arrays.copyOf(lVarArr, lVarArr.length)));
        }
        d6.d dVar = dVarArr[0];
        throw null;
    }

    public static gh.c z() {
        if (gh.c.f29196a == null) {
            synchronized (gh.c.class) {
                if (gh.c.f29196a == null) {
                    gh.c.f29196a = new gh.c();
                }
            }
        }
        gh.c cVar = gh.c.f29196a;
        kotlin.jvm.internal.m.c(cVar);
        return cVar;
    }

    public void J(boolean z11) {
    }

    public abstract void K(boolean z11);

    public abstract void N();

    public abstract void s();

    public abstract boolean u();

    public static PopupWindow q(View clickView, Context context, Word word, final String path, final zq.a aVar, boolean z11) {
        View viewInflate;
        PopupWindow popupWindow;
        kotlin.jvm.internal.m.f(clickView, "clickView");
        kotlin.jvm.internal.m.f(context, "context");
        kotlin.jvm.internal.m.f(path, "path");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        String explanation = word.getExplanation();
        final int i11 = 1;
        int iB = w4.c.b(1, explanation, "getExplanation(...)");
        final int i12 = 0;
        int i13 = 0;
        boolean z12 = false;
        while (i13 <= iB) {
            boolean z13 = kotlin.jvm.internal.m.h(explanation.charAt(!z12 ? i13 : iB), 32) <= 0;
            if (z12) {
                if (!z13) {
                    break;
                }
                iB--;
            } else if (z13) {
                i13++;
            } else {
                z12 = true;
            }
        }
        if (TextUtils.isEmpty(explanation.subSequence(i13, iB + 1).toString())) {
            viewInflate = layoutInflaterFrom.inflate(R.layout.pop_detail, (ViewGroup) null, false);
            kotlin.jvm.internal.m.e(viewInflate, "inflate(...)");
            TextView textView = (TextView) viewInflate.findViewById(R.id.tv_trans);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_pos);
            View viewFindViewById = viewInflate.findViewById(R.id.view_line);
            String translations = word.getTranslations();
            kotlin.jvm.internal.m.e(translations, "getTranslations(...)");
            textView.setText(oz.x.q0(translations, ";", "\n"));
            textView2.setVisibility(8);
            viewFindViewById.setVisibility(8);
            popupWindow = new PopupWindow(viewInflate, -2, -2, true);
            viewInflate.getViewTreeObserver().addOnGlobalLayoutListener(new b0(viewInflate, clickView, i11));
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
            popupWindow.setWidth(ff.h.l(150.0f));
            if (z11) {
                popupWindow.setOutsideTouchable(true);
            }
            popupWindow.setFocusable(false);
        } else {
            viewInflate = layoutInflaterFrom.inflate(R.layout.pop_grammar_detail_web_view, (ViewGroup) null, false);
            kotlin.jvm.internal.m.e(viewInflate, "inflate(...)");
            WebView webView = (WebView) viewInflate.findViewById(R.id.web_view);
            ProgressBar progressBar = (ProgressBar) viewInflate.findViewById(R.id.progress_bar);
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_plus);
            ImageView imageView2 = (ImageView) viewInflate.findViewById(R.id.iv_reduse);
            if ((context.getResources().getConfiguration().uiMode & 48) != 16) {
                if (se.k.s("ALGORITHMIC_DARKENING")) {
                    va.a.b(webView.getSettings());
                }
                if (se.k.s("FORCE_DARK")) {
                    va.a.c(webView.getSettings());
                }
            }
            kotlin.jvm.internal.m.c(imageView);
            bq.z.b(imageView, new sp.a(webView, i12));
            kotlin.jvm.internal.m.c(imageView2);
            bq.z.b(imageView2, new sp.a(webView, i11));
            kotlin.jvm.internal.m.c(webView);
            String explanation2 = word.getExplanation();
            kotlin.jvm.internal.m.e(explanation2, "getExplanation(...)");
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            String str = n().themeStyle == 3 ? ealNNtLp.fhhXWEg : "#E1E9F6";
            StringBuilder sb2 = new StringBuilder();
            sb2.append("<html>\n<body bgcolor=\"" + str + "\" style=\"font-size:14px;\">\n");
            sb2.append(explanation2);
            sb2.append("</body>\n</html>");
            webView.setWebViewClient(new sp.c(progressBar, 0));
            String string = sb2.toString();
            kotlin.jvm.internal.m.e(string, "toString(...)");
            webView.loadDataWithBaseURL(null, oz.x.q0(string, "<td>", "<td style=\"font-size:14px;\">"), "text/html", "utf-8", null);
            TextView textView3 = (TextView) viewInflate.findViewById(R.id.tv_trans);
            LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.ll_grammar_detail);
            if (kotlin.jvm.internal.m.a(word.getWord(), word.getZhuyin()) || TextUtils.isEmpty(word.getZhuyin())) {
                int[] iArr = bq.r.f4959a;
                if (bq.m.F()) {
                    textView3.setText(word.getWord() + " : " + word.getTranslations());
                } else {
                    textView3.setText(word.getTranslations());
                }
            } else {
                textView3.setText(w4.c.h(word.getWord(), "/", word.getZhuyin(), " : ", word.getTranslations()));
            }
            popupWindow = new PopupWindow(viewInflate, b7.e0.f(LingoSkillApplication.f21665b).widthPixels - ff.h.l(80.0f), ff.h.l(300.0f), true);
            int i14 = 2;
            viewInflate.getViewTreeObserver().addOnGlobalLayoutListener(new b0(viewInflate, clickView, i14));
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
            View viewFindViewById2 = viewInflate.findViewById(R.id.btn_ok);
            kotlin.jvm.internal.m.e(viewFindViewById2, "findViewById(...)");
            bq.z.b(viewFindViewById2, new qh.j(popupWindow, i14));
            if (z11) {
                popupWindow.setOutsideTouchable(true);
            }
            popupWindow.setFocusable(false);
            kotlin.jvm.internal.m.c(linearLayout);
            bq.z.b(linearLayout, new fz.c() { // from class: sp.b
                @Override // fz.c
                public final Object invoke(Object obj) {
                    View it = (View) obj;
                    switch (i12) {
                        case 0:
                            m.f(it, "it");
                            zq.a aVar2 = aVar;
                            m.c(aVar2);
                            aVar2.x(path);
                            break;
                        default:
                            m.f(it, "it");
                            zq.a aVar3 = aVar;
                            if (aVar3 != null) {
                                aVar3.x(path);
                            }
                            break;
                    }
                    return qy.b0.f48488a;
                }
            });
            linearLayout.setVisibility(0);
        }
        bq.z.b(viewInflate, new fz.c() { // from class: sp.b
            @Override // fz.c
            public final Object invoke(Object obj) {
                View it = (View) obj;
                switch (i11) {
                    case 0:
                        m.f(it, "it");
                        zq.a aVar2 = aVar;
                        m.c(aVar2);
                        aVar2.x(path);
                        break;
                    default:
                        m.f(it, "it");
                        zq.a aVar3 = aVar;
                        if (aVar3 != null) {
                            aVar3.x(path);
                        }
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        popupWindow.setTouchable(true);
        return popupWindow;
    }

    public static ArrayList r(int i11, int i12, int i13, ij.f fVar) {
        ArrayList arrayList = new ArrayList();
        if (fVar.d().length() > 0) {
            arrayList.add(fVar.d());
        }
        if (fVar.e().length() > 0) {
            arrayList.add(fVar.e());
        }
        switch (i11) {
            case 0:
            case 11:
            case Consts.SP /* 32 */:
            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
            case 35:
                arrayList.add("cn_tone.zip");
                arrayList.add("cn_hand_write.zip");
                arrayList.add("cn_char_stroke_v4.zip");
                arrayList.add(i11 == 0 ? "cn_story_lesson.z" : "cnup_story_lesson.z");
                if (i11 == 32 || i12 != -1) {
                    arrayList.add("cn_sc.zip");
                }
                break;
            case 1:
            case 12:
            case 30:
            case 33:
            case 37:
                arrayList.add("jschar.db");
                arrayList.add(i11 == 1 ? "jp_story_lesson.z" : "jpup_story_lesson.z");
                if (i11 == 37 || i12 != -1) {
                    arrayList.add("jp_sc.zip");
                }
                if (i11 == 33 || i13 != -1) {
                    arrayList.add("jp_hand_write.zip");
                }
                break;
            case 2:
            case 13:
            case 31:
            case 38:
                arrayList.add("kochar.db");
                arrayList.add(i11 == 2 ? "ko_story_lesson.z" : "krup_story_lesson.z");
                if (i11 == 38 || i12 != -1) {
                    arrayList.add("kr_sc.zip");
                }
                break;
            case 3:
            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                if (i11 == 44 || i12 != -1) {
                    arrayList.add("en_sc.zip");
                }
                break;
            case 4:
            case 14:
            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                arrayList.add("es_story_lesson.z");
                if (i11 == 39 || i12 != -1) {
                    arrayList.add("es_sc.zip");
                }
                break;
            case 5:
            case 15:
            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                arrayList.add("fr_story_lesson.z");
                if (i11 == 36 || i12 != -1) {
                    arrayList.add("fr_sc.zip");
                }
                break;
            case 6:
            case 16:
            case 43:
                arrayList.add("de_story_lesson.z");
                if (i11 == 43 || i12 != -1) {
                    arrayList.add("de_sc.zip");
                }
                break;
            case 7:
            case 56:
                if (i11 == 56 || i12 != -1) {
                    arrayList.add("vt_sc.zip");
                }
                break;
            case 8:
            case 17:
            case 46:
                arrayList.add("pt_story_lesson.z");
                if (i11 == 46 || i12 != -1) {
                    arrayList.add("pt_sc.zip");
                }
                break;
            case 10:
            case 22:
            case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                arrayList.add(evRpcb.GovSBwWwsKB);
                if (i11 == 41 || i12 != -1) {
                    arrayList.add("ru_sc.zip");
                }
                break;
            case 18:
            case 67:
                if (i11 == 67 || i12 != -1) {
                    arrayList.add("idn_sc.zip");
                }
                break;
            case 19:
            case 68:
                if (i11 == 68 || i12 != -1) {
                    arrayList.add("pol_sc.zip");
                }
                break;
            case 20:
            case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                arrayList.add("it_story_lesson.z");
                if (i11 == 45 || i12 != -1) {
                    arrayList.add("it_sc.zip");
                }
                break;
            case 21:
            case 60:
                if (i11 == 60 || i12 != -1) {
                    arrayList.add("tur_sc.zip");
                }
                break;
            case 51:
            case 52:
            case 55:
                arrayList.add("ar_hand_write.zip");
                if (i11 == 52 || i12 != -1) {
                    arrayList.add("ar_sc.zip");
                }
                break;
            case 57:
            case 59:
                if (i11 == 59 || i12 != -1) {
                    arrayList.add("thai_sc.zip");
                }
                break;
            case 61:
            case 62:
                if (i11 == 62 || i12 != -1) {
                    arrayList.add("hi_sc.zip");
                }
                break;
            case 63:
            case 64:
                if (i11 == 64 || i12 != -1) {
                    arrayList.add("ukr_sc.zip");
                }
                break;
            case 65:
            case 66:
                if (i11 == 66 || i12 != -1) {
                    arrayList.add("grk_sc.zip");
                }
                break;
            case UCrop.REQUEST_CROP /* 69 */:
            case 70:
                if (i11 == 70 || i12 != -1) {
                    arrayList.add("mal_sc.zip");
                }
                break;
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayList.get(i14);
            i14++;
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }
}
