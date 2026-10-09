package fb;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.viewmodel.compose.NP.IMCc;
import com.alibaba.sdk.android.oss.common.OSSHeaders;
import com.lingo.lingoskill.billing.Subscription2Activity;
import com.lingo.lingoskill.object.BillingBannerItem;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import com.yalantis.ucrop.view.CropImageView;
import com.youth.banner.Banner;
import com.youth.banner.indicator.CircleIndicator;
import dt.Xk.wuoM;
import hh.p0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import l1.x1;
import r.u2;
import r.w2;
import rz.o0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g0 {
    public static final v3.k A(f2.c cVar) {
        return new v3.k(Math.round(cVar.f26572a), Math.round(cVar.f26573b), Math.round(cVar.f26574c), Math.round(cVar.f26575d));
    }

    public static final void B(View view, da.g gVar) {
        kotlin.jvm.internal.m.f(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, gVar);
    }

    public static void C(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            u2.a(view, charSequence);
            return;
        }
        w2 w2Var = w2.M;
        if (w2Var != null && w2Var.f48697a == view) {
            w2.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new w2(view, charSequence);
            return;
        }
        w2 w2Var2 = w2.N;
        if (w2Var2 != null && w2Var2.f48697a == view) {
            w2Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static void D(Throwable th2) {
        if (th2 instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th2);
        }
        if (th2 instanceof ThreadDeath) {
            throw ((ThreadDeath) th2);
        }
        if (th2 instanceof LinkageError) {
            throw ((LinkageError) th2);
        }
    }

    public static float a(float f5) {
        return f5 <= 0.04045f ? f5 / 12.92f : (float) Math.pow((f5 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static final v3.k b(long j11, long j12) {
        int i11 = (int) (j11 >> 32);
        int i12 = (int) (j11 & 4294967295L);
        return new v3.k(i11, i12, ((int) (j12 >> 32)) + i11, ((int) (j12 & 4294967295L)) + i12);
    }

    public static float c(float f5) {
        return f5 <= 0.0031308f ? f5 * 12.92f : (float) ((Math.pow(f5, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static final void d(String str, c6.l lVar, o6.g gVar, int i11, l1.n nVar, int i12) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-192911377);
        if ((((sVar.f(str) ? 4 : 2) | i12 | 48 | (sVar.f(gVar) ? 256 : 128) | 3072) & 1171) == 1170 && sVar.F()) {
            sVar.W();
        } else {
            sVar.Y();
            if ((i12 & 1) == 0 || sVar.C()) {
                lVar = c6.j.f6631a;
                i11 = Integer.MAX_VALUE;
            } else {
                sVar.W();
            }
            sVar.q();
            o6.d dVar = o6.d.f44718a;
            sVar.e0(-1115894518);
            sVar.e0(1886828752);
            if (!(sVar.f39434a instanceof c6.b)) {
                l1.t.z();
                throw null;
            }
            sVar.b0();
            if (sVar.S) {
                sVar.k(new a0.c0(dVar));
            } else {
                sVar.r0();
            }
            l1.t.J(o6.e.f44719b, str, sVar);
            l1.t.J(o6.e.f44720c, lVar, sVar);
            l1.t.J(o6.e.f44721d, gVar, sVar);
            o6.e eVar = o6.e.f44722e;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(i11))) {
                sVar.o0(Integer.valueOf(i11));
                sVar.b(Integer.valueOf(i11), eVar);
            }
            com.google.android.material.datepicker.d.B(sVar, true, false, false);
        }
        c6.l lVar2 = lVar;
        int i13 = i11;
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new o6.f(str, lVar2, gVar, i13, i12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0049  */
    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
    /* JADX WARN: Code duplicated, block: B:24:0x005d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0034 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003c -> B:18:0x003f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:22:0x0051
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object e(s2.b r8, xy.a r9) {
        /*
            boolean r0 = r9 instanceof w0.a
            if (r0 == 0) goto L13
            r0 = r9
            w0.a r0 = (w0.a) r0
            int r1 = r0.f54367c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f54367c = r1
            goto L18
        L13:
            w0.a r0 = new w0.a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f54366b
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r0.f54367c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            s2.b r8 = r0.f54365a
            com.bumptech.glide.e.F(r9)
            goto L3f
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            com.bumptech.glide.e.F(r9)
        L34:
            r0.f54365a = r8
            r0.f54367c = r3
            java.lang.Object r9 = s2.b.Y(r8, r0)
            if (r9 != r1) goto L3f
            return r1
        L3f:
            s2.l r9 = (s2.l) r9
            int r2 = r9.f51331d
            java.lang.Object r9 = r9.f51328a
            r2 = r2 & 66
            if (r2 == 0) goto L34
            int r2 = r9.size()
            r4 = 0
            r5 = r4
        L4f:
            if (r5 >= r2) goto L68
            java.lang.Object r6 = r9.get(r5)
            s2.t r6 = (s2.t) r6
            boolean r7 = r6.b()
            if (r7 != 0) goto L34
            boolean r7 = r6.f51350h
            if (r7 != 0) goto L34
            boolean r6 = r6.f51346d
            if (r6 == 0) goto L34
            int r5 = r5 + 1
            goto L4f
        L68:
            java.lang.Object r8 = r9.get(r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: fb.g0.e(s2.b, xy.a):java.lang.Object");
    }

    public static final void f(n9.q qVar, s2.t tVar, long j11) {
        e5.m mVar = (e5.m) qVar.f43673b;
        mVar.getClass();
        t2.d dVar = (t2.d) mVar.f24862c;
        t2.d dVar2 = (t2.d) mVar.f24861b;
        boolean zA = s2.s.a(tVar);
        long j12 = tVar.f51344b;
        if (zA) {
            t2.a[] aVarArr = dVar2.f52016d;
            ry.l.P(0, aVarArr.length, null, aVarArr);
            dVar2.f52017e = 0;
            t2.a[] aVarArr2 = dVar.f52016d;
            ry.l.P(0, aVarArr2.length, null, aVarArr2);
            dVar.f52017e = 0;
            mVar.f24860a = 0L;
        }
        if (!s2.s.c(tVar)) {
            List list = tVar.f51353k;
            if (list == null) {
                list = ry.r.f50854a;
            }
            int i11 = 0;
            for (int size = list.size(); i11 < size; size = size) {
                s2.c cVar = (s2.c) list.get(i11);
                long j13 = cVar.f51285a;
                long jH = f2.b.h(cVar.f51287c, j11);
                dVar2.a(j13, Float.intBitsToFloat((int) (jH >> 32)));
                dVar.a(j13, Float.intBitsToFloat((int) (jH & 4294967295L)));
                i11++;
            }
            long jH2 = f2.b.h(tVar.f51354l, j11);
            dVar2.a(j12, Float.intBitsToFloat((int) (jH2 >> 32)));
            dVar.a(j12, Float.intBitsToFloat((int) (jH2 & 4294967295L)));
        }
        if (s2.s.c(tVar) && j12 - mVar.f24860a > 40) {
            t2.a[] aVarArr3 = dVar2.f52016d;
            ry.l.P(0, aVarArr3.length, null, aVarArr3);
            dVar2.f52017e = 0;
            t2.a[] aVarArr4 = dVar.f52016d;
            ry.l.P(0, aVarArr4.length, null, aVarArr4);
            dVar.f52017e = 0;
            mVar.f24860a = 0L;
        }
        mVar.f24860a = j12;
    }

    public static final boolean g(int i11, int i12, boolean z11) {
        if (!z11) {
            if (1 > i12) {
                return false;
            }
            if (i12 > (i11 == 51 ? 3 : 1)) {
                return false;
            }
        }
        return true;
    }

    public static final Object h(xy.i iVar) {
        yz.f fVar = o0.f50940a;
        Object objM = rz.e0.M(yz.e.f58387a, new jh.k(2, null), iVar);
        return objM == wy.a.COROUTINE_SUSPENDED ? objM : qy.b0.f48488a;
    }

    public static final n3.j i(Context context) {
        return new n3.j(new hq.a(context), new n3.a(Build.VERSION.SDK_INT >= 31 ? n3.t.f43180a.a(context) : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ArrayList j(sy.c f1, sy.c f5) {
        kotlin.jvm.internal.m.f(f1, "f1");
        kotlin.jvm.internal.m.f(f5, "f2");
        Iterator it = ns.o.y(f5).iterator();
        lz.f fVar = (lz.f) it;
        if (!fVar.f40537c) {
            throw new NoSuchElementException();
        }
        ry.w wVar = (ry.w) it;
        int iNextInt = wVar.nextInt();
        if (fVar.f40537c) {
            float fO = o(((q6.k) f1.get(0)).f47494b, ((q6.k) f5.get(iNextInt)).f47494b);
            do {
                int iNextInt2 = wVar.nextInt();
                float fO2 = o(((q6.k) f1.get(0)).f47494b, ((q6.k) f5.get(iNextInt2)).f47494b);
                if (Float.compare(fO, fO2) > 0) {
                    iNextInt = iNextInt2;
                    fO = fO2;
                }
            } while (fVar.f40537c);
        }
        int iB = f1.b();
        int iB2 = f5.b();
        ArrayList arrayListM = ns.o.M(f5.get(iNextInt));
        int i11 = iNextInt;
        for (int i12 = 1; i12 < iB; i12++) {
            int i13 = iNextInt - (iB - i12);
            if (i13 <= i11) {
                i13 += iB2;
            }
            Iterator it2 = new lz.g(i11 + 1, i13, 1).iterator();
            lz.f fVar2 = (lz.f) it2;
            if (!fVar2.f40537c) {
                throw new NoSuchElementException();
            }
            ry.w wVar2 = (ry.w) it2;
            int iNextInt3 = wVar2.nextInt();
            if (fVar2.f40537c) {
                float fO3 = o(((q6.k) f1.get(i12)).f47494b, ((q6.k) f5.get(iNextInt3 % iB2)).f47494b);
                do {
                    int iNextInt4 = wVar2.nextInt();
                    float fO4 = o(((q6.k) f1.get(i12)).f47494b, ((q6.k) f5.get(iNextInt4 % iB2)).f47494b);
                    if (Float.compare(fO3, fO4) > 0) {
                        iNextInt3 = iNextInt4;
                        fO3 = fO4;
                    }
                } while (fVar2.f40537c);
            }
            i11 = iNextInt3;
            arrayListM.add(f5.get(i11 % iB2));
        }
        return arrayListM;
    }

    public static final float k(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f5 = CropImageView.DEFAULT_ASPECT_RATIO;
        for (int i11 = 0; i11 < length; i11++) {
            f5 += fArr[i11] * fArr2[i11];
        }
        return f5;
    }

    public static int n(int i11, float f5, int i12) {
        if (i11 == i12 || f5 <= CropImageView.DEFAULT_ASPECT_RATIO) {
            return i11;
        }
        if (f5 >= 1.0f) {
            return i12;
        }
        float f11 = ((i11 >> 24) & 255) / 255.0f;
        float f12 = ((i12 >> 24) & 255) / 255.0f;
        float fA = a(((i11 >> 16) & 255) / 255.0f);
        float fA2 = a(((i11 >> 8) & 255) / 255.0f);
        float fA3 = a((i11 & 255) / 255.0f);
        float fA4 = a(((i12 >> 16) & 255) / 255.0f);
        float fA5 = a(((i12 >> 8) & 255) / 255.0f);
        float fA6 = a((i12 & 255) / 255.0f);
        float fA7 = p0.a(f12, f11, f5, f11);
        float fA8 = p0.a(fA4, fA, f5, fA);
        float fA9 = p0.a(fA5, fA2, f5, fA2);
        float fA10 = p0.a(fA6, fA3, f5, fA3);
        float fC = c(fA8) * 255.0f;
        float fC2 = c(fA9) * 255.0f;
        return Math.round(c(fA10) * 255.0f) | (Math.round(fC) << 16) | (Math.round(fA7 * 255.0f) << 24) | (Math.round(fC2) << 8);
    }

    public static final float o(q6.g f1, q6.g f5) {
        kotlin.jvm.internal.m.f(f1, "f1");
        List list = f1.f47484a;
        kotlin.jvm.internal.m.f(f5, "f2");
        List list2 = f5.f47484a;
        if ((f1 instanceof q6.e) && (f5 instanceof q6.e) && ((q6.e) f1).f47483d != ((q6.e) f5).f47483d) {
            return Float.MAX_VALUE;
        }
        float fA = (((q6.c) ry.m.z0(list)).a() + ((q6.c) ry.m.q0(list)).f47478a[0]) / 2.0f;
        float fB = (((q6.c) ry.m.z0(list)).b() + ((q6.c) ry.m.q0(list)).f47478a[1]) / 2.0f;
        float fA2 = (((q6.c) ry.m.z0(list2)).a() + ((q6.c) ry.m.q0(list2)).f47478a[0]) / 2.0f;
        float f11 = fA - fA2;
        float fB2 = fB - ((((q6.c) ry.m.z0(list2)).b() + ((q6.c) ry.m.q0(list2)).f47478a[1]) / 2.0f);
        return (fB2 * fB2) + (f11 * f11);
    }

    public static final da.g p(View view) {
        kotlin.jvm.internal.m.f(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            da.g gVar = tag instanceof da.g ? (da.g) tag : null;
            if (gVar != null) {
                return gVar;
            }
            Object objX = c.a.x(view);
            view = objX instanceof View ? (View) objX : null;
        }
        return null;
    }

    public static void q() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        stackTraceElement.getFileName();
        stackTraceElement.getLineNumber();
        stackTraceElement.getMethodName();
    }

    public static void r() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        stackTraceElement.getFileName();
        stackTraceElement.getLineNumber();
    }

    public static String s(Context context, int i11) {
        if (i11 == -1) {
            return "UNKNOWN";
        }
        try {
            return context.getResources().getResourceEntryName(i11);
        } catch (Exception unused) {
            return nv.p.j(i11, "?");
        }
    }

    public static String t(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    public static Intent u(Context context, String source) {
        kotlin.jvm.internal.m.f(context, "context");
        kotlin.jvm.internal.m.f(source, "source");
        Intent intent = new Intent(context, (Class<?>) Subscription2Activity.class);
        intent.putExtra(INTENTS.EXTRA_STRING, source);
        return intent;
    }

    public static void w(Context context, LifecycleOwner owner, String source) {
        kotlin.jvm.internal.m.f(context, "context");
        kotlin.jvm.internal.m.f(owner, "owner");
        kotlin.jvm.internal.m.f(source, "source");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.dialog_prompt_billing, (ViewGroup) null);
        lc.d dVar = new lc.d(context);
        dVar.f39884t.setBackgroundColor(context.getColor(R.color.transparent));
        hz.b.t(dVar, null, viewInflate, false, 5);
        xt.b.d().c("jxz_lesson_billing_popup", new ar.a(source, 4));
        dVar.show();
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_close);
        if (textView != null) {
            textView.setOnClickListener(new aj.b(dVar, 3));
        }
        Button button = (Button) viewInflate.findViewById(R.id.btn_ok);
        if (button != null) {
            button.setOnClickListener(new bq.s(context, 0));
        }
        Banner banner = (Banner) viewInflate.findViewById(R.id.view_pager);
        if (banner != null) {
            String string = context.getString(R.string.dialog_purchase_title_1);
            kotlin.jvm.internal.m.e(string, "getString(...)");
            String string2 = context.getString(R.string.dialog_purchase_title_desc_2);
            kotlin.jvm.internal.m.e(string2, "getString(...)");
            BillingBannerItem billingBannerItem = new BillingBannerItem(R.raw.purchase_deer_2, string, string2);
            String string3 = context.getString(R.string.dialog_purchase_title_2);
            kotlin.jvm.internal.m.e(string3, "getString(...)");
            String string4 = context.getString(R.string.dialog_purchase_title_desc_3);
            kotlin.jvm.internal.m.e(string4, "getString(...)");
            BillingBannerItem billingBannerItem2 = new BillingBannerItem(R.raw.purchase_deer_3, string3, string4);
            String string5 = context.getString(R.string.dialog_purchase_title_3);
            kotlin.jvm.internal.m.e(string5, "getString(...)");
            String string6 = context.getString(R.string.dialog_purchase_title_desc_4);
            kotlin.jvm.internal.m.e(string6, "getString(...)");
            BillingBannerItem billingBannerItem3 = new BillingBannerItem(R.raw.purchase_deer_4, string5, string6);
            String string7 = context.getString(R.string.dialog_purchase_title_4);
            kotlin.jvm.internal.m.e(string7, "getString(...)");
            String string8 = context.getString(R.string.dialog_purchase_title_desc_5);
            kotlin.jvm.internal.m.e(string8, "getString(...)");
            BillingBannerItem billingBannerItem4 = new BillingBannerItem(R.raw.purchase_deer_5, string7, string8);
            String string9 = context.getString(R.string.dialog_purchase_title_5);
            kotlin.jvm.internal.m.e(string9, "getString(...)");
            String string10 = context.getString(R.string.dialog_purchase_title_desc_1);
            kotlin.jvm.internal.m.e(string10, "getString(...)");
            banner.setAdapter(new bq.k(ns.o.L(billingBannerItem, billingBannerItem2, billingBannerItem3, billingBannerItem4, new BillingBannerItem(R.raw.purchase_deer_1, string9, string10))));
            banner.setIndicator(new CircleIndicator(context));
            banner.setLoopTime(5000L);
            banner.setIndicatorSelectedColor(context.getColor(R.color.colorAccent));
            banner.setIndicatorNormalColor(context.getColor(R.color.color_D8D8D8));
            banner.addBannerLifecycleObserver(owner);
            dVar.setOnDismissListener(new bq.t(banner, 0));
        }
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.check_today_deal);
        if (textView2 != null) {
            textView2.setOnClickListener(new bq.s(context, 1));
            textView2.getPaint().setFlags(8);
            textView2.getPaint().setAntiAlias(true);
        }
    }

    public static long y(b7.w wVar, int i11, int i12) {
        wVar.I(i11);
        if (wVar.a() < 5) {
            return -9223372036854775807L;
        }
        int iJ = wVar.j();
        if ((8388608 & iJ) != 0 || ((2096896 & iJ) >> 8) != i12 || (iJ & 32) == 0 || wVar.w() < 7 || wVar.a() < 7 || (wVar.w() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        wVar.h(bArr, 0, 6);
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((((long) bArr[4]) & 255) >> 7);
    }

    public static a9.h z(a9.h hVar, String[] strArr, Map map) {
        int i11 = 0;
        if (hVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (a9.h) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                a9.h hVar2 = new a9.h();
                int length = strArr.length;
                while (i11 < length) {
                    hVar2.a((a9.h) map.get(strArr[i11]));
                    i11++;
                }
                return hVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                hVar.a((a9.h) map.get(strArr[0]));
                return hVar;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i11 < length2) {
                    hVar.a((a9.h) map.get(strArr[i11]));
                    i11++;
                }
            }
        }
        return hVar;
    }

    public void l(x xVar) {
        List listK = ns.o.K(xVar);
        gb.p pVar = (gb.p) this;
        if (listK.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        new gb.l(pVar, null, n.KEEP, listK).A();
    }

    public a0 m(String uniqueWorkName, n existingWorkPolicy, x xVar) {
        kotlin.jvm.internal.m.f(uniqueWorkName, "uniqueWorkName");
        kotlin.jvm.internal.m.f(existingWorkPolicy, "existingWorkPolicy");
        return new gb.l((gb.p) this, uniqueWorkName, existingWorkPolicy, ns.o.K(xVar)).A();
    }

    public static final void v(float[] fArr, float[] fArr2, int i11, float[] fArr3) {
        if (i11 == 0) {
            v2.a.a("At least one point must be provided");
        }
        int i12 = 2 >= i11 ? i11 - 1 : 2;
        int i13 = i12 + 1;
        float[][] fArr4 = new float[i13][];
        for (int i14 = 0; i14 < i13; i14++) {
            fArr4[i14] = new float[i11];
        }
        for (int i15 = 0; i15 < i11; i15++) {
            fArr4[0][i15] = 1.0f;
            for (int i16 = 1; i16 < i13; i16++) {
                fArr4[i16][i15] = fArr4[i16 - 1][i15] * fArr[i15];
            }
        }
        float[][] fArr5 = new float[i13][];
        for (int i17 = 0; i17 < i13; i17++) {
            fArr5[i17] = new float[i11];
        }
        float[][] fArr6 = new float[i13][];
        for (int i18 = 0; i18 < i13; i18++) {
            fArr6[i18] = new float[i13];
        }
        int i19 = 0;
        while (i19 < i13) {
            float[] destination = fArr5[i19];
            float[] fArr7 = fArr4[i19];
            kotlin.jvm.internal.m.f(fArr7, IMCc.cnMIBWajLoBicp);
            kotlin.jvm.internal.m.f(destination, "destination");
            System.arraycopy(fArr7, 0, destination, 0, i11);
            for (int i21 = 0; i21 < i19; i21++) {
                float[] fArr8 = fArr5[i21];
                float fK = k(destination, fArr8);
                for (int i22 = 0; i22 < i11; i22++) {
                    destination[i22] = destination[i22] - (fArr8[i22] * fK);
                }
            }
            float fSqrt = (float) Math.sqrt(k(destination, destination));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f5 = 1.0f / fSqrt;
            for (int i23 = 0; i23 < i11; i23++) {
                destination[i23] = destination[i23] * f5;
            }
            float[] fArr9 = fArr6[i19];
            int i24 = 0;
            while (i24 < i13) {
                fArr9[i24] = i24 < i19 ? CropImageView.DEFAULT_ASPECT_RATIO : k(destination, fArr4[i24]);
                i24++;
            }
            i19++;
        }
        for (int i25 = i12; -1 < i25; i25--) {
            float fK2 = k(fArr5[i25], fArr2);
            float[] fArr10 = fArr6[i25];
            int i26 = i25 + 1;
            if (i26 <= i12) {
                int i27 = i12;
                while (true) {
                    fK2 -= fArr10[i27] * fArr3[i27];
                    if (i27 != i26) {
                        i27--;
                    }
                }
            }
            fArr3[i25] = fK2 / fArr10[i25];
        }
    }

    public static ca.l x(ja.a connection, String str) {
        long j11;
        Map mapB;
        sy.k kVar;
        kotlin.jvm.internal.m.f(connection, "connection");
        ja.c cVarB1 = connection.B1("PRAGMA table_info(`" + str + "`)");
        try {
            long j12 = 0;
            if (cVarB1.r1()) {
                int i11 = com.bumptech.glide.g.i(cVarB1, "name");
                int i12 = com.bumptech.glide.g.i(cVarB1, wuoM.CnIsyiSvK);
                int i13 = com.bumptech.glide.g.i(cVarB1, "notnull");
                int i14 = com.bumptech.glide.g.i(cVarB1, "pk");
                int i15 = com.bumptech.glide.g.i(cVarB1, "dflt_value");
                sy.g gVar = new sy.g();
                while (true) {
                    String strB0 = cVarB1.B0(i11);
                    j11 = j12;
                    gVar.put(strB0, new ca.i((int) cVarB1.getLong(i14), 2, strB0, cVarB1.B0(i12), cVarB1.isNull(i15) ? null : cVarB1.B0(i15), cVarB1.getLong(i13) != j12));
                    if (!cVarB1.r1()) {
                        break;
                    }
                    j12 = j11;
                }
                mapB = gVar.b();
                hz.b.h(cVarB1, null);
            } else {
                mapB = ry.s.f50855a;
                hz.b.h(cVarB1, null);
                j11 = 0;
            }
            ja.c cVarB2 = connection.B1("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int i16 = com.bumptech.glide.g.i(cVarB2, "id");
                int i17 = com.bumptech.glide.g.i(cVarB2, "seq");
                int i18 = com.bumptech.glide.g.i(cVarB2, "table");
                int i19 = com.bumptech.glide.g.i(cVarB2, "on_delete");
                int i21 = com.bumptech.glide.g.i(cVarB2, "on_update");
                List listZ = ef.e.z(cVarB2);
                cVarB2.reset();
                sy.k kVar2 = new sy.k();
                while (cVarB2.r1()) {
                    if (cVarB2.getLong(i17) == j11) {
                        int i22 = (int) cVarB2.getLong(i16);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i23 = i16;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : listZ) {
                            int i24 = i17;
                            List list = listZ;
                            if (((ca.h) obj).f6782a == i22) {
                                arrayList3.add(obj);
                            }
                            i17 = i24;
                            listZ = list;
                        }
                        int i25 = i17;
                        List list2 = listZ;
                        int size = arrayList3.size();
                        int i26 = 0;
                        while (i26 < size) {
                            Object obj2 = arrayList3.get(i26);
                            i26++;
                            ca.h hVar = (ca.h) obj2;
                            arrayList.add(hVar.f6784c);
                            arrayList2.add(hVar.f6785d);
                            arrayList3 = arrayList3;
                        }
                        kVar2.add(new ca.j(arrayList, arrayList2, cVarB2.B0(i18), cVarB2.B0(i19), cVarB2.B0(i21)));
                        i16 = i23;
                        i17 = i25;
                        listZ = list2;
                    }
                }
                sy.k kVarF = qx.b.f(kVar2);
                hz.b.h(cVarB2, null);
                ja.c cVarB3 = connection.B1("PRAGMA index_list(`" + str + "`)");
                try {
                    int i27 = com.bumptech.glide.g.i(cVarB3, "name");
                    int i28 = com.bumptech.glide.g.i(cVarB3, OSSHeaders.ORIGIN);
                    int i29 = com.bumptech.glide.g.i(cVarB3, "unique");
                    if (i27 == -1 || i28 == -1 || i29 == -1) {
                        hz.b.h(cVarB3, null);
                        kVar = null;
                    } else {
                        sy.k kVar3 = new sy.k();
                        while (cVarB3.r1()) {
                            if ("c".equals(cVarB3.B0(i28))) {
                                ca.k kVarA = ef.e.A(connection, cVarB3.B0(i27), cVarB3.getLong(i29) == 1);
                                if (kVarA == null) {
                                    hz.b.h(cVarB3, null);
                                    kVar = null;
                                } else {
                                    kVar3.add(kVarA);
                                }
                            }
                        }
                        sy.k kVarF2 = qx.b.f(kVar3);
                        hz.b.h(cVarB3, null);
                        kVar = kVarF2;
                    }
                    return new ca.l(str, mapB, kVarF, kVar);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        hz.b.h(cVarB3, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    hz.b.h(cVarB2, th4);
                    throw th5;
                }
            }
        } catch (Throwable th6) {
            try {
                throw th6;
            } catch (Throwable th7) {
                hz.b.h(cVarB1, th6);
                throw th7;
            }
        }
    }
}
