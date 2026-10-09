package android.support.v4.media.session;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.lifecycle.viewmodel.anchor.hIIS.scqhIrGXy;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.b1;
import c7.s;
import cf.x;
import com.adjust.sdk.Constants;
import com.afollestad.materialdialogs.internal.button.DialogActionButton;
import com.afollestad.materialdialogs.internal.button.DialogActionButtonLayout;
import com.afollestad.materialdialogs.internal.list.DialogRecyclerView;
import com.afollestad.materialdialogs.internal.main.DialogLayout;
import com.afollestad.materialdialogs.internal.message.DialogContentLayout;
import com.lingodeer.R;
import com.lingodeer.data.env.Env;
import com.lingodeer.data.model.AchievementRecord;
import com.lingodeer.data.model.AchievementRecordType;
import com.lingodeer.data.model.TestModel;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import defpackage.g;
import f0.h1;
import fa.EQx.nuRcCS;
import fr.j3;
import fr.o0;
import fz.f;
import g2.f0;
import h1.a6;
import h1.k7;
import h1.s1;
import h1.ua;
import h1.v1;
import hh.p0;
import j0.b2;
import j0.e2;
import j0.i;
import j0.t;
import j0.u;
import java.net.URL;
import java.nio.ByteBuffer;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jt.t0;
import k9.p;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import l1.n;
import l1.q1;
import l1.w1;
import l1.x1;
import l3.d;
import lc.h;
import ob.l;
import qy.b0;
import r.x2;
import re.v;
import re.y;
import rt.mc;
import rz.e0;
import t1.e;
import vt.n0;
import w4.c;
import y2.d2;
import y2.i0;
import y2.j;
import y2.k;
import y2.k1;
import y6.c0;
import z1.o;
import z1.q;
import z1.r;
import z2.m2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements d {
    public static final float A(float f5, float f11, float f12) {
        return (f12 * f11) + ((1 - f12) * f5);
    }

    public static final int B(int i11, float f5, int i12) {
        return i11 + ((int) Math.round(((double) (i12 - i11)) * ((double) f5)));
    }

    public static void C(lc.d dVar, List list, int i11, f fVar, int i12) {
        DialogLayout dialogLayout = dVar.f39884t;
        if ((i12 & 8) != 0) {
            i11 = -1;
        }
        if (i11 < -1 && i11 >= list.size()) {
            StringBuilder sbI = c.i(i11, "Initial selection ", " must be between -1 and the size of your items array ");
            sbI.append(list.size());
            throw new IllegalArgumentException(sbI.toString().toString());
        }
        DialogRecyclerView recyclerView = dialogLayout.getContentLayout().getRecyclerView();
        if ((recyclerView != null ? recyclerView.getAdapter() : null) != null) {
            DialogRecyclerView recyclerView2 = dialogLayout.getContentLayout().getRecyclerView();
            b1 adapter = recyclerView2 != null ? recyclerView2.getAdapter() : null;
            if (!(adapter instanceof rc.d)) {
                throw new IllegalStateException("updateListItemsSingleChoice(...) can't be used before you've created a single choice list dialog.");
            }
            rc.d dVar2 = (rc.d) adapter;
            dVar2.f49081d = list;
            dVar2.f49083f = fVar;
            dVar2.notifyDataSetChanged();
            return;
        }
        r(dVar, h.POSITIVE).setEnabled(i11 > -1);
        rc.d dVar3 = new rc.d(dVar, list, i11, fVar);
        DialogContentLayout contentLayout = dialogLayout.getContentLayout();
        if (contentLayout.f7430f == null) {
            DialogRecyclerView dialogRecyclerView = (DialogRecyclerView) LayoutInflater.from(contentLayout.getContext()).inflate(R.layout.md_dialog_stub_recyclerview, (ViewGroup) contentLayout, false);
            dialogRecyclerView.getClass();
            dialogRecyclerView.f7408a = new rc.b(2, 0, null, dVar, null, null);
            dialogRecyclerView.setLayoutManager(new LinearLayoutManager(1));
            contentLayout.f7430f = dialogRecyclerView;
            contentLayout.addView(dialogRecyclerView);
        }
        DialogRecyclerView dialogRecyclerView2 = contentLayout.f7430f;
        if (dialogRecyclerView2 != null) {
            dialogRecyclerView2.setAdapter(dVar3);
        }
    }

    public static final void G(AchievementRecord achievementRecord, String str, ur.a eventTracker) {
        m.f(achievementRecord, "<this>");
        m.f(eventTracker, "eventTracker");
        eventTracker.c("ep_badge_share", new pv.c(9, achievementRecord, str));
    }

    public static final void H(Drawable drawable) {
        if (drawable instanceof AnimationDrawable) {
            AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
            animationDrawable.selectDrawable(0);
            animationDrawable.stop();
        }
    }

    public static void I(Window window, boolean z11) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 35) {
            a5.d.f(window, z11);
        } else {
            if (i11 >= 30) {
                a5.d.e(window, z11);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z11 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static ArrayList J(ByteBuffer byteBuffer) {
        int iRemaining;
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (byteBufferAsReadOnlyBuffer.hasRemaining()) {
            byte b3 = byteBufferAsReadOnlyBuffer.get();
            int i11 = (b3 >> 3) & 15;
            if (((b3 >> 2) & 1) != 0) {
                byteBufferAsReadOnlyBuffer.get();
            }
            if (((b3 >> 1) & 1) != 0) {
                iRemaining = 0;
                for (int i12 = 0; i12 < 8; i12++) {
                    byte b11 = byteBufferAsReadOnlyBuffer.get();
                    iRemaining |= (b11 & 127) << (i12 * 7);
                    if ((b11 & 128) == 0) {
                        break;
                    }
                }
            } else {
                iRemaining = byteBufferAsReadOnlyBuffer.remaining();
            }
            ByteBuffer byteBufferDuplicate = byteBufferAsReadOnlyBuffer.duplicate();
            byteBufferDuplicate.limit(byteBufferAsReadOnlyBuffer.position() + iRemaining);
            arrayList.add(new s(i11, byteBufferDuplicate));
            byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + iRemaining);
        }
        return arrayList;
    }

    public static final void K(Drawable drawable) {
        if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).start();
        }
    }

    public static String L(long j11) {
        int i11 = (int) (j11 >> 32);
        int i12 = (int) (j11 & 4294967295L);
        if (Float.intBitsToFloat(i11) == Float.intBitsToFloat(i12)) {
            return "CornerRadius.circular(" + x.P(Float.intBitsToFloat(i11)) + ')';
        }
        return "CornerRadius.elliptical(" + x.P(Float.intBitsToFloat(i11)) + ", " + x.P(Float.intBitsToFloat(i12)) + ')';
    }

    public static final boolean M(PublicKey publicKey, String data, String signature) {
        m.f(data, "data");
        m.f(signature, "signature");
        try {
            Signature signature2 = Signature.getInstance("SHA256withRSA");
            signature2.initVerify(publicKey);
            byte[] bytes = data.getBytes(oz.a.f46133a);
            m.e(bytes, "this as java.lang.String).getBytes(charset)");
            signature2.update(bytes);
            byte[] bArrDecode = Base64.decode(signature, 8);
            m.e(bArrDecode, "decode(signature, Base64.URL_SAFE)");
            return signature2.verify(bArrDecode);
        } catch (Exception unused) {
            return false;
        }
    }

    public static final void a(g gVar, fz.a aVar, fz.a onDismissRequest, n nVar, int i11) {
        l1.s sVar;
        m.f(onDismissRequest, "onDismissRequest");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(162958633);
        int i12 = i11 | (sVar2.f(gVar) ? 4 : 2) | (sVar2.h(aVar) ? 32 : 16);
        if (sVar2.T(i12 & 1, (i12 & 147) != 146)) {
            sVar2.Y();
            if ((i11 & 1) != 0 && !sVar2.C()) {
                sVar2.W();
            }
            sVar2.q();
            sVar = sVar2;
            a6.a(onDismissRequest, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0L, null, null, null, e.d(-979060884, new defpackage.d(gVar, aVar, onDismissRequest, 0), sVar2), sVar, 6, 384, 4094);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new defpackage.c(gVar, aVar, onDismissRequest, i11, 1);
        }
    }

    public static final void b(final g gVar, fz.a aVar, fz.a aVar2, n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-310582724);
        int i12 = i11 | (sVar.f(gVar) ? 4 : 2) | (sVar.h(aVar) ? 32 : 16) | (sVar.h(aVar2) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            sVar.Y();
            if ((i11 & 1) != 0 && !sVar.C()) {
                sVar.W();
            }
            sVar.q();
            o oVar = o.f58481a;
            float f5 = 16;
            r rVarC = j0.c.C(e2.e(oVar, 1.0f), f5, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            u uVarA = t.a(i.f35305c, z1.c.P, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            r rVarC2 = z1.a.c(sVar, rVarC);
            k.J.getClass();
            y2.i iVar = j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(j.f56917f, uVarA, sVar);
            l1.t.J(j.f56916e, q1VarL, sVar);
            y2.h hVar = j.f56918g;
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(j.f56915d, rVarC2, sVar);
            ua.b(gVar.f28280a, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, j3.A(18), null, n3.s.L, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, sVar, 199728, 0, 130516);
            ua.b(gVar.f28281b, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 6, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), ((s1) sVar.j(v1.f31180a)).f31036s, j3.A(14), null, null, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, sVar, 3120, 0, 130544);
            k7.g(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 26, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar, 6, 6);
            float f11 = 56;
            final int i13 = 0;
            k7.m(aVar, e2.g(e2.e(oVar, 1.0f), f11), false, null, null, null, e.d(1846661615, new f() { // from class: b
                @Override // fz.f
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    switch (i13) {
                        case 0:
                            b2 TextButton = (b2) obj;
                            n nVar2 = (n) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            m.f(TextButton, "$this$TextButton");
                            l1.s sVar2 = (l1.s) nVar2;
                            if (sVar2.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                iu.k.n(gVar.f28282c, null, 0L, 0L, null, 0L, 0L, 0, false, 0, 0, null, sVar2, 0, 0, 131070);
                            } else {
                                sVar2.W();
                            }
                            break;
                        default:
                            b2 TextButton2 = (b2) obj;
                            n nVar3 = (n) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            m.f(TextButton2, "$this$TextButton");
                            l1.s sVar3 = (l1.s) nVar3;
                            if (sVar3.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                iu.k.n(gVar.f28283d, null, 0L, 0L, null, 0L, 0L, 0, false, 0, 0, null, sVar3, 0, 0, 131070);
                            } else {
                                sVar3.W();
                            }
                            break;
                    }
                    return b0.f48488a;
                }
            }, sVar), sVar, ((i12 >> 3) & 14) | 805306416, 508);
            k7.g(null, CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar, 0, 7);
            final int i14 = 1;
            k7.m(aVar2, e2.g(e2.e(oVar, 1.0f), f11), false, null, null, null, e.d(167382502, new f() { // from class: b
                @Override // fz.f
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    switch (i14) {
                        case 0:
                            b2 TextButton = (b2) obj;
                            n nVar2 = (n) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            m.f(TextButton, "$this$TextButton");
                            l1.s sVar2 = (l1.s) nVar2;
                            if (sVar2.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                iu.k.n(gVar.f28282c, null, 0L, 0L, null, 0L, 0L, 0, false, 0, 0, null, sVar2, 0, 0, 131070);
                            } else {
                                sVar2.W();
                            }
                            break;
                        default:
                            b2 TextButton2 = (b2) obj;
                            n nVar3 = (n) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            m.f(TextButton2, "$this$TextButton");
                            l1.s sVar3 = (l1.s) nVar3;
                            if (sVar3.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                iu.k.n(gVar.f28283d, null, 0L, 0L, null, 0L, 0L, 0, false, 0, 0, null, sVar3, 0, 0, 131070);
                            } else {
                                sVar3.W();
                            }
                            break;
                    }
                    return b0.f48488a;
                }
            }, sVar), sVar, ((i12 >> 6) & 14) | 805306416, 508);
            sVar = sVar;
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new defpackage.c(gVar, aVar, aVar2, i11, 0);
        }
    }

    public static final void c(j9.e eVar, w1.b bVar, t1.d dVar, n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(233973821);
        if ((((sVar.h(eVar) ? 4 : 2) | i11 | (sVar.h(bVar) ? 32 : 16)) & 147) == 146 && sVar.F()) {
            sVar.W();
        } else {
            l1.t.b(new w1[]{LocalViewModelStoreOwner.INSTANCE.provides(eVar), LocalLifecycleOwnerKt.getLocalLifecycleOwner().a(eVar), ea.a.f25454a.a(eVar)}, e.d(1808964477, new es.c(3, bVar, dVar), sVar), sVar, 56);
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fp.e(eVar, bVar, dVar, i11, 12);
        }
    }

    public static final void d(w1.b bVar, t1.d dVar, n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(832919318);
        int i12 = (sVar.h(bVar) ? 4 : 2) | i11 | (sVar.h(dVar) ? 32 : 16);
        if ((i12 & 19) == 18 && sVar.F()) {
            sVar.W();
        } else {
            Object objQ = sVar.Q();
            if (objQ == l1.m.f39353a) {
                objQ = new t0(6);
                sVar.o0(objQ);
            }
            fz.c cVar = (fz.c) objQ;
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            kotlin.jvm.internal.e eVarA = z.a(k9.a.class);
            InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
            initializerViewModelFactoryBuilder.addInitializer(z.a(k9.a.class), cVar);
            k9.a aVar = (k9.a) ViewModelKt.viewModel(eVarA, current, (String) null, initializerViewModelFactoryBuilder.build(), current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, sVar, 0, 0);
            aVar.f37975b = new a5.j(bVar);
            bVar.c(aVar.f37974a, dVar, sVar, ((i12 << 6) & 896) | (i12 & 112));
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new p(bVar, i11, 0, dVar);
        }
    }

    public static final Object e(y2.m mVar, fz.a aVar, xy.c cVar) {
        Object obj;
        k1 k1VarW;
        Object objG0;
        mc mcVar;
        q qVar = (q) mVar;
        boolean z11 = qVar.f58482a.P;
        if (z11) {
            if (!z11) {
                v2.a.b("visitAncestors called on an unattached node");
            }
            q qVar2 = qVar.f58482a.f58486e;
            i0 i0VarX = y2.f.x(mVar);
            loop0: while (true) {
                obj = null;
                if (i0VarX == null) {
                    break;
                }
                if ((((q) i0VarX.f56892i0.f50089g).f58485d & 524288) != 0) {
                    while (qVar2 != null) {
                        if ((qVar2.f58484c & 524288) != 0) {
                            q qVarF = qVar2;
                            n1.e eVar = null;
                            while (qVarF != null) {
                                if (qVarF instanceof d3.a) {
                                    obj = qVarF;
                                    break loop0;
                                }
                                if ((qVarF.f58484c & 524288) != 0 && (qVarF instanceof y2.n)) {
                                    int i11 = 0;
                                    for (q qVar3 = ((y2.n) qVarF).R; qVar3 != null; qVar3 = qVar3.f58487f) {
                                        if ((qVar3.f58484c & 524288) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                qVarF = qVar3;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new n1.e(new q[16]);
                                                }
                                                if (qVarF != null) {
                                                    eVar.c(qVarF);
                                                    qVarF = null;
                                                }
                                                eVar.c(qVar3);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                qVarF = y2.f.f(eVar);
                            }
                        }
                        qVar2 = qVar2.f58486e;
                    }
                }
                i0VarX = i0VarX.w();
                qVar2 = (i0VarX == null || (mcVar = i0VarX.f56892i0) == null) ? null : (d2) mcVar.f50088f;
            }
            d3.a aVar2 = (d3.a) obj;
            if (aVar2 != null && (objG0 = aVar2.G0((k1VarW = y2.f.w(mVar)), new d2.c(1, aVar, k1VarW), cVar)) == wy.a.COROUTINE_SUSPENDED) {
                return objG0;
            }
        }
        return b0.f48488a;
    }

    public static y f(String str, re.b bVar, String str2) {
        String str3;
        String str4 = y.f49225j;
        int i11 = 1;
        y yVarC = v.C(bVar, String.format(Locale.US, "%s/app_indexing", Arrays.copyOf(new Object[]{str2}, 1)), null, null);
        Bundle bundle = yVarC.f49231d;
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("tree", str);
        Context contextA = re.s.a();
        try {
            str3 = contextA.getPackageManager().getPackageInfo(contextA.getPackageName(), 0).versionName;
            m.e(str3, "{\n      val packageInfo …ageInfo.versionName\n    }");
        } catch (PackageManager.NameNotFoundException unused) {
            str3 = BuildConfig.VERSION_NAME;
        }
        bundle.putString("app_version", str3);
        bundle.putString("platform", "android");
        bundle.putString("request_type", "app_indexing");
        bundle.putString("device_session_id", ve.d.a());
        yVarC.f49231d = bundle;
        yVarC.j(new ue.e(i11));
        return yVarC;
    }

    public static final void g(View view) {
        m.f(view, "<this>");
        nz.m mVarB = v10.c.B(new d0.h(view, null, 1));
        while (mVarB.hasNext()) {
            ArrayList arrayList = u((View) mVarB.next()).f36060a;
            for (int iA = ns.o.A(arrayList); -1 < iA; iA--) {
                ((m2) arrayList.get(iA)).f58625a.d();
            }
        }
    }

    public static final void h(View view, int i11, int i12) {
        ObjectAnimator.ofArgb(view, "cardBackgroundColor", i11, i12).setDuration(300L).start();
    }

    public static final void m(View view) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", 0.9f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "scaleY", 0.9f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
        animatorSet.setDuration(400L);
        animatorSet.start();
    }

    public static final boolean n(long j11, long j12) {
        return j11 == j12;
    }

    public static final float o(float f5) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f5)) & 8589934591L) / ((long) 3))) + 709952852);
        float f11 = fIntBitsToFloat - ((fIntBitsToFloat - (f5 / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f11 - ((f11 - (f5 / (f11 * f11))) * 0.33333334f);
    }

    public static final DialogActionButton r(lc.d dVar, h hVar) {
        DialogActionButton[] actionButtons;
        DialogActionButton dialogActionButton;
        DialogActionButtonLayout buttonsLayout = dVar.f39884t.getButtonsLayout();
        if (buttonsLayout == null || (actionButtons = buttonsLayout.getActionButtons()) == null || (dialogActionButton = actionButtons[hVar.a()]) == null) {
            throw new IllegalStateException("The dialog does not have an attached buttons layout.");
        }
        return dialogActionButton;
    }

    public static final void s(AchievementRecord achievementRecord) {
        m.f(achievementRecord, "<this>");
        achievementRecord.getId();
        throw new IllegalArgumentException(ep.a.e("wrong achievement type: ", achievementRecord.getId()));
    }

    public static final int t(o0.n nVar) {
        return (int) (nVar.f44404e == h1.Vertical ? nVar.e() & 4294967295L : nVar.e() >> 32);
    }

    public static final j5.a u(View view) {
        j5.a aVar = (j5.a) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (aVar != null) {
            return aVar;
        }
        j5.a aVar2 = new j5.a();
        view.setTag(R.id.pooling_container_listener_holder_tag, aVar2);
        return aVar2;
    }

    public static final PublicKey v(String str) throws InvalidKeySpecException {
        byte[] bArrDecode = Base64.decode(oz.x.q0(oz.x.q0(oz.x.q0(str, "\n", BuildConfig.VERSION_NAME), "-----BEGIN PUBLIC KEY-----", BuildConfig.VERSION_NAME), "-----END PUBLIC KEY-----", BuildConfig.VERSION_NAME), 0);
        m.e(bArrDecode, "decode(pubKeyString, Base64.DEFAULT)");
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArrDecode));
        m.e(publicKeyGeneratePublic, "kf.generatePublic(x509publicKey)");
        return publicKeyGeneratePublic;
    }

    public static final String w(String kid) {
        m.f(kid, "kid");
        URL url = new URL(Constants.SCHEME, "www." + re.s.f49217r, "/.well-known/oauth/openid/keys/");
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition conditionNewCondition = reentrantLock.newCondition();
        kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
        re.s.d().execute(new fb.b0(url, yVar, kid, reentrantLock, conditionNewCondition, 2));
        reentrantLock.lock();
        try {
            conditionNewCondition.await(5000L, TimeUnit.MILLISECONDS);
            return (String) yVar.f38361a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final List x(AchievementRecord achievementRecord) {
        m.f(achievementRecord, "<this>");
        String id2 = achievementRecord.getId();
        int iHashCode = id2.hashCode();
        if (iHashCode != -1706072195) {
            if (iHashCode != -739364438) {
                if (iHashCode == 3832 && id2.equals("xp")) {
                    return ns.o.L(new g2.x(f0.e(4283677439L)), new g2.x(f0.c(6077693)));
                }
            } else if (id2.equals(AchievementRecordType.PERFECT_LESSON)) {
                return ns.o.L(new g2.x(f0.e(4293294616L)), new g2.x(f0.c(12015360)));
            }
        } else if (id2.equals(AchievementRecordType.LEADERBOARD)) {
            return ns.o.L(new g2.x(f0.e(4289360383L)), new g2.x(f0.c(11301631)));
        }
        throw new IllegalArgumentException(ep.a.e("wrong achievement type: ", achievementRecord.getId()));
    }

    public static final void y(BroadcastReceiver broadcastReceiver, vy.i iVar, fz.e eVar) {
        wz.d dVarC = e0.c(ew.a.w(e0.e(), iVar));
        e0.B(dVarC, null, null, new b0.f(eVar, dVarC, broadcastReceiver.goAsync(), (vy.d) null), 3);
    }

    public static final boolean z(lc.d dVar) {
        DialogActionButton[] visibleButtons;
        DialogActionButtonLayout buttonsLayout = dVar.f39884t.getButtonsLayout();
        if (buttonsLayout == null || (visibleButtons = buttonsLayout.getVisibleButtons()) == null) {
            return false;
        }
        return !(visibleButtons.length == 0);
    }

    public abstract int E(int i11);

    public abstract int F(int i11);

    @Override // l3.d
    public int i(int i11) {
        int iE = E(i11);
        if (iE == -1 || E(iE) == -1) {
            return -1;
        }
        return iE;
    }

    public c0 j(g8.a aVar) {
        ByteBuffer byteBuffer = aVar.f25115e;
        byteBuffer.getClass();
        b7.a.d(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return k(aVar, byteBuffer);
    }

    public abstract c0 k(g8.a aVar, ByteBuffer byteBuffer);

    @Override // l3.d
    public int l(int i11) {
        int iF = F(i11);
        if (iF == -1 || F(iF) == -1) {
            return -1;
        }
        return iF;
    }

    @Override // l3.d
    public int p(int i11) {
        return F(i11);
    }

    @Override // l3.d
    public int q(int i11) {
        return E(i11);
    }

    /* JADX WARN: Code duplicated, block: B:178:0x04c8 A[LOOP:16: B:176:0x04c2->B:178:0x04c8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:354:0x09c0  */
    /* JADX WARN: Code duplicated, block: B:360:0x09ce  */
    /* JADX WARN: Code duplicated, block: B:363:0x09d5  */
    /* JADX WARN: Code duplicated, block: B:366:0x09dc  */
    /* JADX WARN: Code duplicated, block: B:368:0x09e0  */
    /* JADX WARN: Code duplicated, block: B:369:0x09e3  */
    public static List D(String repeatRegex, boolean z11, boolean z12, boolean z13, x2 repeatRegexGen, l lastRegexTestGen) {
        String str;
        List listK;
        List listT;
        String str2;
        Integer num;
        String str3;
        String str4;
        int i11;
        String str5;
        List listK2;
        List listT2;
        List listK3;
        List listT3;
        ArrayList arrayList;
        String str6;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        Integer num8;
        Integer num9;
        Integer num10;
        Integer num11;
        String str7;
        String str8;
        String str9;
        Integer num12;
        Integer num13;
        Integer num14;
        ArrayList arrayListC1;
        List list;
        Iterator it;
        List listK4;
        List listK5;
        boolean z14;
        List listT4;
        List listK6;
        List listT5;
        List listK7;
        List listT6;
        List listK8;
        List listT7;
        boolean z15;
        List listK9;
        List listT8;
        Integer num15 = 50;
        Integer num16 = 49;
        Integer num17 = 48;
        Integer num18 = 47;
        Integer num19 = 5;
        Integer num20 = 51;
        Integer num21 = 55;
        Integer num22 = 21;
        Integer num23 = 61;
        Integer num24 = 63;
        Integer num25 = 65;
        m.f(repeatRegex, "repeatRegex");
        m.f(repeatRegexGen, "repeatRegexGen");
        m.f(lastRegexTestGen, "lastRegexTestGen");
        String str10 = "get(...)";
        if (!z11) {
            String str11 = "get(...)";
            int i12 = 1;
            try {
                return lastRegexTestGen.y(repeatRegex, z13);
            } catch (Exception e8) {
                e8.getMessage();
                n0 n0Var = (n0) lastRegexTestGen.f44822b;
                lastRegexTestGen.f44823c = lastRegexTestGen.B(repeatRegex, scqhIrGXy.BZgHicNvhpZTJ, false);
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                List list2 = (List) lastRegexTestGen.f44823c;
                if (list2 == null) {
                    m.n("mTestModels");
                    throw null;
                }
                int size = list2.size();
                int i13 = 0;
                int i14 = 0;
                while (i14 < size) {
                    List list3 = (List) lastRegexTestGen.f44823c;
                    if (list3 == null) {
                        m.n("mTestModels");
                        throw null;
                    }
                    TestModel testModel = (TestModel) list3.get(i14);
                    int i15 = testModel.elemType;
                    if (i15 == i12) {
                        str = str11;
                        if (testModel.modelType == 13) {
                            i13++;
                            arrayList3.add(Long.valueOf(testModel.elemId));
                        } else {
                            i12 = 1;
                        }
                        i14++;
                        str11 = str;
                        i12 = 1;
                    } else {
                        str = str11;
                    }
                    if (i15 == i12 && !arrayList3.contains(Long.valueOf(testModel.elemId))) {
                        arrayList2.add(Integer.valueOf(i14));
                    }
                    i14++;
                    str11 = str;
                    i12 = 1;
                }
                String str12 = str11;
                if (z13 && i13 < 2) {
                    ArrayList arrayList4 = arrayList3;
                    int i16 = i13;
                    if (!ry.l.D(new Integer[]{13, 12, 0, 11, num19, num18, num17, num16, num15, 53, 54, num20, num21, 57, num22, num23, num24, num25, 19, 18, 69}, Integer.valueOf(((o0) n0Var).f27733a.keyLanguage))) {
                        if (arrayList2.size() > 1) {
                            int size2 = arrayList2.size();
                            Random random = new Random();
                            ArrayList arrayList5 = new ArrayList();
                            for (int i17 = 0; i17 < size2; i17++) {
                                arrayList5.add(Integer.valueOf(i17));
                            }
                            int[] iArr = new int[size2];
                            int i18 = 0;
                            while (arrayList5.size() > 0) {
                                int iAbs = Math.abs(random.nextInt()) % arrayList5.size();
                                Object obj = arrayList5.get(iAbs);
                                m.e(obj, str12);
                                iArr[i18] = ((Number) obj).intValue();
                                arrayList5.remove(iAbs);
                                i18++;
                            }
                            int i19 = i16;
                            int i21 = 0;
                            while (i21 < size2) {
                                int i22 = iArr[i21];
                                List list4 = (List) lastRegexTestGen.f44823c;
                                if (list4 == null) {
                                    m.n("mTestModels");
                                    throw null;
                                }
                                Object obj2 = arrayList2.get(i22);
                                m.e(obj2, str12);
                                TestModel testModel2 = (TestModel) list4.get(((Number) obj2).intValue());
                                ArrayList arrayList6 = arrayList4;
                                if (!arrayList6.contains(Long.valueOf(testModel2.elemId))) {
                                    TestModel testModel3 = new TestModel();
                                    testModel3.elemType = testModel2.elemType;
                                    testModel3.elemId = testModel2.elemId;
                                    testModel3.modelType = 13;
                                    List list5 = (List) lastRegexTestGen.f44823c;
                                    if (list5 == null) {
                                        m.n("mTestModels");
                                        throw null;
                                    }
                                    list5.add(testModel3);
                                    List list6 = (List) lastRegexTestGen.f44823c;
                                    if (list6 == null) {
                                        m.n("mTestModels");
                                        throw null;
                                    }
                                    arrayList2.add(Integer.valueOf(list6.size() - 1));
                                    arrayList6.add(Long.valueOf(testModel2.elemId));
                                    i19++;
                                }
                                if (i19 >= 2) {
                                    break;
                                }
                                i21++;
                                arrayList4 = arrayList6;
                            }
                        } else if (arrayList2.size() == 1) {
                            List list7 = (List) lastRegexTestGen.f44823c;
                            if (list7 == null) {
                                m.n("mTestModels");
                                throw null;
                            }
                            Object obj3 = arrayList2.get(0);
                            m.e(obj3, str12);
                            Object obj4 = arrayList2.get(((Number) obj3).intValue());
                            m.e(obj4, str12);
                            TestModel testModel4 = (TestModel) list7.get(((Number) obj4).intValue());
                            TestModel testModel5 = new TestModel();
                            testModel5.elemType = testModel4.elemType;
                            testModel5.elemId = testModel4.elemId;
                            testModel5.modelType = 13;
                            List list8 = (List) lastRegexTestGen.f44823c;
                            if (list8 == null) {
                                m.n("mTestModels");
                                throw null;
                            }
                            list8.add(testModel5);
                        }
                    }
                }
                if (((o0) n0Var).z() && xt.b.f56282d) {
                    List list9 = (List) lastRegexTestGen.f44823c;
                    if (list9 == null) {
                        m.n("mTestModels");
                        throw null;
                    }
                    if (!list9.isEmpty()) {
                        List list10 = (List) lastRegexTestGen.f44823c;
                        if (list10 == null) {
                            m.n("mTestModels");
                            throw null;
                        }
                        lastRegexTestGen.f44823c = list10.subList(0, 1);
                    }
                }
                List list11 = (List) lastRegexTestGen.f44823c;
                if (list11 != null) {
                    return list11;
                }
                m.n("mTestModels");
                throw null;
            }
        }
        n0 n0Var2 = (n0) repeatRegexGen.f48709a;
        ArrayList arrayList7 = (ArrayList) repeatRegexGen.f48711c;
        ArrayList arrayList8 = (ArrayList) repeatRegexGen.f48712d;
        repeatRegexGen.f48710b = new ArrayList();
        String str13 = "compile(...)";
        Matcher matcherW = nv.p.w(0, "#", "compile(...)", repeatRegex);
        if (matcherW.find()) {
            ArrayList arrayList9 = new ArrayList(10);
            int iC = 0;
            while (true) {
                iC = nv.p.c(matcherW, repeatRegex, iC, arrayList9);
                if (!matcherW.find()) {
                    break;
                }
                arrayList8 = arrayList8;
            }
            nv.p.B(iC, repeatRegex, arrayList9);
            listK = arrayList9;
        } else {
            listK = ns.o.K(repeatRegex.toString());
        }
        boolean zIsEmpty = listK.isEmpty();
        ry.r rVar = ry.r.f50854a;
        if (zIsEmpty) {
            listT = rVar;
            break;
        }
        ListIterator listIterator = listK.listIterator(listK.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                listT = rVar;
                break;
            }
            if (((String) listIterator.previous()).length() != 0) {
                listT = b7.e0.t(listIterator, 1, listK);
                break;
            }
        }
        String[] strArr = (String[]) listT.toArray(new String[0]);
        ArrayList arrayList10 = new ArrayList();
        int length = strArr.length;
        int i23 = 0;
        while (true) {
            str2 = "input";
            num = num19;
            str3 = "-";
            str4 = ":";
            if (i23 >= length) {
                break;
            }
            int i24 = i23;
            String strQ0 = strArr[i24];
            int i25 = length;
            Integer num26 = num18;
            if (oz.x.s0(strQ0, "3:", false)) {
                strQ0 = oz.x.q0(oz.x.q0(strQ0, ":-", ":0-"), ":;", ":0;");
            }
            Matcher matcherW2 = nv.p.w(0, ";", "compile(...)", strQ0);
            if (matcherW2.find()) {
                ArrayList arrayList11 = new ArrayList(10);
                int iC2 = 0;
                do {
                    iC2 = nv.p.c(matcherW2, strQ0, iC2, arrayList11);
                } while (matcherW2.find());
                nv.p.B(iC2, strQ0, arrayList11);
                listK7 = arrayList11;
            } else {
                listK7 = ns.o.K(strQ0.toString());
            }
            if (listK7.isEmpty()) {
                listT6 = rVar;
                break;
            }
            ListIterator listIterator2 = listK7.listIterator(listK7.size());
            while (true) {
                if (!listIterator2.hasPrevious()) {
                    listT6 = rVar;
                    break;
                }
                if (((String) listIterator2.previous()).length() != 0) {
                    listT6 = b7.e0.t(listIterator2, 1, listK7);
                    break;
                }
            }
            String[] strArr2 = (String[]) listT6.toArray(new String[0]);
            int i26 = strArr2.length > 2 ? Integer.parseInt(strArr2[2]) : 1;
            String str14 = strArr2[0];
            Matcher matcher = b7.e0.u(0, "-", "compile(...)", str14, "input").matcher(str14);
            if (matcher.find()) {
                ArrayList arrayList12 = new ArrayList(10);
                int iC3 = 0;
                do {
                    iC3 = nv.p.c(matcher, str14, iC3, arrayList12);
                } while (matcher.find());
                nv.p.B(iC3, str14, arrayList12);
                listK8 = arrayList12;
            } else {
                listK8 = ns.o.K(str14.toString());
            }
            if (listK8.isEmpty()) {
                listT7 = rVar;
                break;
            }
            ListIterator listIterator3 = listK8.listIterator(listK8.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    listT7 = rVar;
                    break;
                }
                if (((String) listIterator3.previous()).length() != 0) {
                    listT7 = b7.e0.t(listIterator3, 1, listK8);
                    break;
                }
            }
            String[] strArr3 = (String[]) listT7.toArray(new String[0]);
            if (strArr3.length >= 2) {
                int length2 = strArr3.length;
                int i27 = 0;
                z15 = true;
                while (i27 < length2) {
                    int i28 = length2;
                    String str15 = strArr3[i27];
                    int i29 = i27;
                    Integer num27 = num16;
                    Matcher matcher2 = b7.e0.u(0, ":", "compile(...)", str15, "input").matcher(str15);
                    if (matcher2.find()) {
                        ArrayList arrayList13 = new ArrayList(10);
                        int iC4 = 0;
                        do {
                            iC4 = nv.p.c(matcher2, str15, iC4, arrayList13);
                        } while (matcher2.find());
                        nv.p.B(iC4, str15, arrayList13);
                        listK9 = arrayList13;
                    } else {
                        listK9 = ns.o.K(str15.toString());
                    }
                    if (listK9.isEmpty()) {
                        listT8 = rVar;
                        break;
                    }
                    ListIterator listIterator4 = listK9.listIterator(listK9.size());
                    while (true) {
                        if (!listIterator4.hasPrevious()) {
                            listT8 = rVar;
                            break;
                        }
                        if (((String) listIterator4.previous()).length() != 0) {
                            listT8 = b7.e0.t(listIterator4, 1, listK9);
                            break;
                        }
                    }
                    String[] strArr4 = (String[]) listT8.toArray(new String[0]);
                    String str16 = strArr4[0];
                    String str17 = nuRcCS.FrwEgEEGsA;
                    if ((!m.a(str16, str17) || !m.a(strArr4[2], str17)) && (!m.a(strArr4[0], "3") || !m.a(strArr4[2], str17))) {
                        z15 = false;
                    }
                    i27 = i29 + 1;
                    length2 = i28;
                    num16 = num27;
                    num15 = num15;
                }
            } else {
                z15 = false;
            }
            Integer num28 = num16;
            Integer num29 = num15;
            if (z15) {
                arrayList10.add(str14);
            } else {
                for (int i30 : x.E(strArr3.length, i26)) {
                    arrayList10.add(strArr3[i30]);
                }
            }
            i23 = i24 + 1;
            num19 = num;
            length = i25;
            num18 = num26;
            num17 = num17;
            num16 = num28;
            num15 = num29;
        }
        Integer num30 = num18;
        Integer num31 = num17;
        Integer num32 = num16;
        Integer num33 = num15;
        int size3 = arrayList10.size();
        int i31 = 0;
        while (i31 < size3) {
            Object obj5 = arrayList10.get(i31);
            m.e(obj5, str10);
            String str18 = (String) obj5;
            int i32 = 0;
            if (oz.q.W0(str18, new String[]{str3}, 0, 6).size() >= 2) {
                ArrayList arrayList14 = new ArrayList();
                List listW0 = oz.q.W0(str18, new String[]{str3}, 0, 6);
                Iterator it2 = listW0.iterator();
                int i33 = 6;
                while (it2.hasNext()) {
                    String str19 = (String) it2.next();
                    Iterator it3 = it2;
                    Matcher matcher3 = b7.e0.u(i32, str4, str13, str19, str2).matcher(str19);
                    if (matcher3.find()) {
                        ArrayList arrayList15 = new ArrayList(10);
                        int iC5 = 0;
                        while (true) {
                            iC5 = nv.p.c(matcher3, str19, iC5, arrayList15);
                            if (!matcher3.find()) {
                                break;
                            }
                            matcher3 = matcher3;
                        }
                        nv.p.B(iC5, str19, arrayList15);
                        listK5 = arrayList15;
                    } else {
                        listK5 = ns.o.K(str19.toString());
                    }
                    if (listK5.isEmpty()) {
                        z14 = true;
                        listT4 = rVar;
                        break;
                    }
                    ListIterator listIterator5 = listK5.listIterator(listK5.size());
                    while (true) {
                        if (!listIterator5.hasPrevious()) {
                            z14 = true;
                            listT4 = rVar;
                            break;
                        }
                        if (!(((String) listIterator5.previous()).length() == 0)) {
                            z14 = true;
                            listT4 = b7.e0.t(listIterator5, 1, listK5);
                            break;
                        }
                    }
                    arrayList14.add(Long.valueOf(((String[]) listT4.toArray(new String[0]))[z14 ? 1 : 0]));
                    Pattern patternCompile = Pattern.compile(str4);
                    m.e(patternCompile, str13);
                    oz.q.U0(0);
                    Matcher matcher4 = patternCompile.matcher(str19);
                    if (matcher4.find()) {
                        ArrayList arrayList16 = new ArrayList(10);
                        int iC6 = 0;
                        while (true) {
                            iC6 = nv.p.c(matcher4, str19, iC6, arrayList16);
                            if (!matcher4.find()) {
                                break;
                            }
                            matcher4 = matcher4;
                        }
                        nv.p.B(iC6, str19, arrayList16);
                        listK6 = arrayList16;
                    } else {
                        listK6 = ns.o.K(str19.toString());
                    }
                    if (listK6.isEmpty()) {
                        listT5 = rVar;
                        break;
                    }
                    ListIterator listIterator6 = listK6.listIterator(listK6.size());
                    while (true) {
                        if (!listIterator6.hasPrevious()) {
                            listT5 = rVar;
                            break;
                        }
                        if (!(((String) listIterator6.previous()).length() == 0)) {
                            listT5 = b7.e0.t(listIterator6, 1, listK6);
                            break;
                        }
                    }
                    i33 = Integer.parseInt(((String[]) listT5.toArray(new String[0]))[2]);
                    i32 = 0;
                    it2 = it3;
                    str4 = str4;
                }
                str5 = str4;
                int i34 = i32;
                int i35 = Integer.parseInt((String) oz.q.W0((CharSequence) listW0.get(i34), new String[]{str5}, i34, 6).get(i34));
                if (i35 != 0) {
                    if (i35 == 3) {
                        i33 = 14;
                    }
                } else if (i33 == 0) {
                    i33 = 6;
                }
                if (arrayList14.size() <= 4) {
                    listK4 = ns.o.K(arrayList14);
                } else {
                    arrayListC1 = ry.m.c1(ry.m.g1(arrayList14, 4, 4));
                    if (arrayListC1.size() >= 2 && ((List) ry.m.z0(arrayListC1)).size() == 1) {
                        listK4 = arrayListC1;
                        listK4 = arrayListC1;
                        ArrayList arrayListC2 = ry.m.c1((Collection) p0.f(1, arrayListC1));
                        ArrayList arrayListC3 = ry.m.c1((Collection) p0.f(1, arrayListC1));
                        arrayListC2.add(0, arrayListC3.remove(arrayListC3.size() - 1));
                        arrayListC1.add(arrayListC3);
                        arrayListC1.add(arrayListC2);
                        list = arrayListC1;
                    }
                    for (it = list.iterator(); it.hasNext(); it = it) {
                        List list12 = (List) it.next();
                        TestModel testModel6 = new TestModel();
                        testModel6.elemType = i35;
                        testModel6.elemId = 0L;
                        testModel6.modelType = i33;
                        testModel6.optionIds = new ArrayList(list12);
                        repeatRegexGen.e().add(testModel6);
                        i35 = i35;
                    }
                    arrayList = arrayList8;
                    str6 = str13;
                    num2 = num22;
                    num3 = num20;
                    num4 = num21;
                    num5 = num23;
                    num6 = num24;
                    num7 = num25;
                    num8 = num30;
                    num9 = num31;
                    num10 = num32;
                    num11 = num33;
                    str7 = str2;
                    str8 = str3;
                    str9 = str10;
                }
                listK4 = arrayListC1;
                listK4 = arrayListC1;
                listK4 = arrayListC1;
                list = listK4;
                while (it.hasNext()) {
                    List list13 = (List) it.next();
                    TestModel testModel7 = new TestModel();
                    testModel7.elemType = i35;
                    testModel7.elemId = 0L;
                    testModel7.modelType = i33;
                    testModel7.optionIds = new ArrayList(list13);
                    repeatRegexGen.e().add(testModel7);
                    i35 = i35;
                }
                arrayList = arrayList8;
                str6 = str13;
                num2 = num22;
                num3 = num20;
                num4 = num21;
                num5 = num23;
                num6 = num24;
                num7 = num25;
                num8 = num30;
                num9 = num31;
                num10 = num32;
                num11 = num33;
                str7 = str2;
                str8 = str3;
                str9 = str10;
            } else {
                str5 = str4;
                arrayList10 = arrayList10;
                arrayList7.clear();
                arrayList8.clear();
                arrayList7.add(new ArrayList());
                arrayList7.add(new ArrayList());
                arrayList8.add(new ArrayList());
                arrayList8.add(new ArrayList());
                arrayList8.add(new ArrayList());
                arrayList8.add(new ArrayList());
                Pattern patternCompile2 = Pattern.compile(str5);
                m.e(patternCompile2, str13);
                oz.q.U0(0);
                Matcher matcher5 = patternCompile2.matcher(str18);
                if (matcher5.find()) {
                    ArrayList arrayList17 = new ArrayList(10);
                    int iC7 = 0;
                    while (true) {
                        iC7 = nv.p.c(matcher5, str18, iC7, arrayList17);
                        if (!matcher5.find()) {
                            break;
                        }
                        str3 = str3;
                        arrayList8 = arrayList8;
                        num24 = num24;
                        num20 = num20;
                        num22 = num22;
                    }
                    nv.p.B(iC7, str18, arrayList17);
                    listK2 = arrayList17;
                } else {
                    listK2 = ns.o.K(str18.toString());
                }
                if (listK2.isEmpty()) {
                    listT2 = rVar;
                    break;
                }
                ListIterator listIterator7 = listK2.listIterator(listK2.size());
                while (true) {
                    if (!listIterator7.hasPrevious()) {
                        listT2 = rVar;
                        break;
                    }
                    if (!(((String) listIterator7.previous()).length() == 0)) {
                        listT2 = b7.e0.t(listIterator7, 1, listK2);
                        break;
                    }
                }
                String[] strArr5 = (String[]) listT2.toArray(new String[0]);
                TestModel testModel8 = new TestModel();
                testModel8.elemType = Integer.parseInt(strArr5[0]);
                testModel8.elemId = Integer.parseInt(strArr5[1]);
                String str20 = strArr5[2];
                Matcher matcher6 = b7.e0.u(0, ",", str13, str20, str2).matcher(str20);
                if (matcher6.find()) {
                    ArrayList arrayList18 = new ArrayList(10);
                    int iC8 = 0;
                    while (true) {
                        iC8 = nv.p.c(matcher6, str20, iC8, arrayList18);
                        if (!matcher6.find()) {
                            break;
                        }
                        str3 = str3;
                        arrayList8 = arrayList8;
                        num24 = num24;
                        num20 = num20;
                        num22 = num22;
                    }
                    nv.p.B(iC8, str20, arrayList18);
                    listK3 = arrayList18;
                } else {
                    listK3 = ns.o.K(str20.toString());
                }
                if (listK3.isEmpty()) {
                    listT3 = rVar;
                    break;
                }
                ListIterator listIterator8 = listK3.listIterator(listK3.size());
                while (true) {
                    if (!listIterator8.hasPrevious()) {
                        listT3 = rVar;
                        break;
                    }
                    if (!(((String) listIterator8.previous()).length() == 0)) {
                        listT3 = b7.e0.t(listIterator8, 1, listK3);
                        break;
                    }
                }
                String[] strArr6 = (String[]) listT3.toArray(new String[0]);
                ArrayList arrayList19 = new ArrayList();
                for (String str21 : strArr6) {
                    arrayList19.add(Integer.valueOf(Integer.parseInt(str21)));
                }
                List listE = repeatRegexGen.e();
                int i36 = testModel8.elemType;
                long j11 = testModel8.elemId;
                Iterator it4 = listE.iterator();
                boolean z16 = true;
                while (it4.hasNext()) {
                    it4 = it4;
                    TestModel testModel9 = (TestModel) it4.next();
                    arrayList8 = arrayList8;
                    str13 = str13;
                    if (testModel9.elemType == i36 && testModel9.elemId == j11) {
                        z16 = false;
                    }
                }
                arrayList = arrayList8;
                str6 = str13;
                if (testModel8.elemType == 0) {
                    num2 = num22;
                    Integer[] numArr = {num20, num21, num2, num23, num24, num25, 18, 69};
                    Integer num34 = num20;
                    Integer num35 = num21;
                    Integer num36 = num23;
                    Integer num37 = num24;
                    str7 = str2;
                    str8 = str3;
                    Integer num38 = num25;
                    Env env = ((o0) n0Var2).f27733a;
                    str9 = str10;
                    if (ry.l.D(numArr, Integer.valueOf(env.keyLanguage))) {
                        Integer[] numArr2 = ry.l.D(new Integer[]{num34, num35}, Integer.valueOf(env.keyLanguage)) ? new Integer[]{2, 4, 8} : ry.l.D(new Integer[]{num36, num37, num38}, Integer.valueOf(env.keyLanguage)) ? new Integer[]{2, 3, 4, 8} : new Integer[]{2, 3, num, 8, 10};
                        int size4 = arrayList19.size();
                        int i37 = 0;
                        while (i37 < size4) {
                            Object obj6 = arrayList19.get(i37);
                            i37++;
                            int iIntValue = ((Number) obj6).intValue();
                            if (ry.l.D(numArr2, Integer.valueOf(iIntValue))) {
                                ((List) arrayList7.get(0)).add(Integer.valueOf(iIntValue));
                            }
                        }
                        if (((List) arrayList7.get(0)).size() == 0) {
                            ArrayList arrayListC4 = ry.m.c1(arrayList19);
                            arrayListC4.remove((Object) 1);
                            int size5 = arrayListC4.size();
                            if (size5 <= 0) {
                                throw new RuntimeException();
                            }
                            testModel8.modelType = ((Number) arrayListC4.get(Math.abs(new Random().nextInt()) % size5)).intValue();
                        } else {
                            int iG = x2.g(repeatRegexGen.e(), testModel8.elemType, testModel8.elemId);
                            if (((List) arrayList7.get(0)).size() > 1) {
                                ((List) arrayList7.get(0)).remove(Integer.valueOf(iG));
                            }
                            testModel8.typeList = (List) arrayList7.get(0);
                            List list14 = (List) arrayList7.get(0);
                            int size6 = ((List) arrayList7.get(0)).size();
                            if (size6 <= 0) {
                                throw new RuntimeException();
                            }
                            testModel8.modelType = ((Number) list14.get(Math.abs(new Random().nextInt()) % size6)).intValue();
                        }
                        num5 = num36;
                        num4 = num35;
                        num6 = num37;
                        num7 = num38;
                    } else {
                        Long[] lArr = (Long[]) repeatRegexGen.f48714f;
                        List listAsList = Arrays.asList(Arrays.copyOf(lArr, lArr.length));
                        int size7 = arrayList19.size();
                        num5 = num36;
                        int i38 = 0;
                        while (i38 < size7) {
                            Object obj7 = arrayList19.get(i38);
                            int i39 = i38 + 1;
                            int iIntValue2 = ((Number) obj7).intValue();
                            Integer num39 = num35;
                            if (iIntValue2 == 1) {
                                num13 = num37;
                                if (env.keyLanguage == 1 && listAsList.contains(Long.valueOf(testModel8.elemId))) {
                                    ((List) arrayList7.get(0)).add(3);
                                } else {
                                    ((List) arrayList7.get(0)).add(Integer.valueOf(iIntValue2));
                                }
                            } else {
                                num13 = num37;
                                if (env.isAudioModel) {
                                    if (env.keyLanguage == 1) {
                                        num14 = num38;
                                        if (listAsList.contains(Long.valueOf(testModel8.elemId))) {
                                            if (iIntValue2 == 9 || iIntValue2 == 10) {
                                                ((List) arrayList7.get(1)).add(Integer.valueOf(iIntValue2));
                                            }
                                        }
                                    } else {
                                        num14 = num38;
                                    }
                                    if (iIntValue2 == 2 || iIntValue2 == 3 || iIntValue2 == 5 || iIntValue2 == 8 || iIntValue2 == 10) {
                                        ((List) arrayList7.get(1)).add(Integer.valueOf(iIntValue2));
                                    }
                                } else {
                                    num14 = num38;
                                    if (env.keyLanguage == 1 && listAsList.contains(Long.valueOf(testModel8.elemId))) {
                                        if (iIntValue2 == 9 || iIntValue2 == 10) {
                                            ((List) arrayList7.get(1)).add(Integer.valueOf(iIntValue2));
                                        }
                                    } else if (iIntValue2 == 2 || iIntValue2 == 8 || iIntValue2 == 10) {
                                        ((List) arrayList7.get(1)).add(Integer.valueOf(iIntValue2));
                                    }
                                }
                                num38 = num14;
                            }
                            num35 = num39;
                            i38 = i39;
                            num37 = num13;
                        }
                        num4 = num35;
                        num6 = num37;
                        num7 = num38;
                        if (!z16) {
                            ArrayList arrayListH = x2.h(repeatRegexGen.e(), testModel8.elemType);
                            if (arrayListH.size() > 0 && ((List) arrayList7.get(1)).size() > 1) {
                                ((List) arrayList7.get(1)).remove(Integer.valueOf(((Number) nv.p.f(1, arrayListH)).intValue()));
                            }
                            int iAbs2 = Math.abs(new Random().nextInt()) % 100;
                            num3 = num34;
                            Integer num40 = num30;
                            Integer num41 = num31;
                            Integer num42 = num32;
                            Integer num43 = num33;
                            int i40 = 33;
                            if (ry.l.D(new Integer[]{num40, num41, num42, num43, 53, 54}, Integer.valueOf(env.keyLanguage))) {
                                if (iAbs2 < 33) {
                                    if (env.isAudioModel) {
                                        num12 = 3;
                                    } else {
                                        num12 = 2;
                                    }
                                } else if (iAbs2 < 66) {
                                    if (env.isAudioModel) {
                                        num12 = num;
                                    } else {
                                        num12 = 8;
                                    }
                                } else if (iAbs2 < 100) {
                                    num12 = 10;
                                } else {
                                    num12 = 0;
                                }
                            } else if (iAbs2 < 28) {
                                num12 = 10;
                            } else if (iAbs2 < 46) {
                                num12 = num;
                            } else if (iAbs2 < 64) {
                                num12 = 2;
                            } else if (iAbs2 < 82) {
                                num12 = 3;
                            } else if (iAbs2 < 100) {
                                num12 = 8;
                            } else {
                                num12 = 0;
                            }
                            while (!ry.m.i0((Iterable) arrayList7.get(1), num12)) {
                                int iAbs3 = Math.abs(new Random().nextInt()) % 100;
                                num40 = num40;
                                num41 = num41;
                                num42 = num42;
                                num43 = num43;
                                if (ry.l.D(new Integer[]{num40, num41, num42, num43, 53, 54}, Integer.valueOf(env.keyLanguage))) {
                                    if (iAbs3 < i40) {
                                        num12 = env.isAudioModel ? 3 : 2;
                                    } else if (iAbs3 < 66) {
                                        num12 = env.isAudioModel ? num : 8;
                                    } else if (iAbs3 < 100) {
                                        num12 = 10;
                                    } else {
                                        i40 = 33;
                                    }
                                } else if (iAbs3 < 28) {
                                    num12 = 10;
                                } else if (iAbs3 >= 46) {
                                    if (iAbs3 >= 64) {
                                        if (iAbs3 < 82) {
                                            num12 = 3;
                                        } else if (iAbs3 < 100) {
                                            num12 = 8;
                                        }
                                        i40 = 33;
                                    }
                                }
                            }
                            num8 = num40;
                            num9 = num41;
                            num10 = num42;
                            num11 = num43;
                            testModel8.modelType = num12.intValue();
                            testModel8.typeList = (List) arrayList7.get(1);
                        } else if (env.keyLanguage == 1 && listAsList.contains(Long.valueOf(testModel8.elemId))) {
                            if (env.isAudioModel) {
                                testModel8.modelType = 3;
                            } else {
                                testModel8.modelType = 10;
                            }
                        } else if (z12) {
                            testModel8.modelType = 2;
                        } else {
                            testModel8.modelType = 1;
                        }
                    }
                    num3 = num34;
                    num8 = num30;
                    num9 = num31;
                    num10 = num32;
                    num11 = num33;
                } else {
                    num2 = num22;
                    num3 = num20;
                    num4 = num21;
                    num5 = num23;
                    num6 = num24;
                    num7 = num25;
                    num8 = num30;
                    num9 = num31;
                    num10 = num32;
                    num11 = num33;
                    str7 = str2;
                    str8 = str3;
                    str9 = str10;
                    repeatRegexGen.i(testModel8, arrayList19, z16, i31);
                }
                repeatRegexGen.e().add(testModel8);
            }
            i31++;
            arrayList10 = arrayList10;
            str2 = str7;
            str3 = str8;
            str10 = str9;
            num21 = num4;
            size3 = size3;
            str4 = str5;
            str13 = str6;
            num24 = num6;
            num33 = num11;
            num32 = num10;
            num31 = num9;
            num30 = num8;
            num25 = num7;
            num23 = num5;
            arrayList8 = arrayList;
            num20 = num3;
            num22 = num2;
        }
        Integer num44 = num22;
        Integer num45 = num20;
        Integer num46 = num21;
        Integer num47 = num23;
        Integer num48 = num24;
        Integer num49 = num25;
        Integer num50 = num30;
        Integer num51 = num31;
        Integer num52 = num32;
        Integer num53 = num33;
        String str22 = str10;
        Env env2 = ((o0) n0Var2).f27733a;
        if (env2.keyLanguage == 5) {
            return repeatRegexGen.e();
        }
        ArrayList arrayList20 = new ArrayList();
        ArrayList arrayList21 = new ArrayList();
        int size8 = repeatRegexGen.e().size();
        int i41 = 0;
        for (int i42 = 0; i42 < size8; i42++) {
            TestModel testModel10 = (TestModel) repeatRegexGen.e().get(i42);
            int i43 = testModel10.elemType;
            if (i43 == 1 && testModel10.modelType == 13) {
                i41++;
                arrayList21.add(Long.valueOf(testModel10.elemId));
            } else if (i43 == 1 && !arrayList21.contains(Long.valueOf(testModel10.elemId))) {
                arrayList20.add(Integer.valueOf(i42));
            }
        }
        if (!z13 || i41 >= 2) {
            i11 = 1;
        } else {
            int i44 = i41;
            i11 = 1;
            if (!ry.l.D(new Integer[]{13, 12, 0, 11, num50, num51, num52, num53, 53, 54, num45, num46, 57, num44, num47, num48, num49, 19, 18, 69}, Integer.valueOf(env2.keyLanguage))) {
                if (arrayList20.size() <= 1) {
                    if (arrayList20.size() == 1) {
                        List listE2 = repeatRegexGen.e();
                        Object obj8 = arrayList20.get(0);
                        m.e(obj8, str22);
                        Object obj9 = arrayList20.get(((Number) obj8).intValue());
                        m.e(obj9, str22);
                        TestModel testModel11 = (TestModel) listE2.get(((Number) obj9).intValue());
                        TestModel testModel12 = new TestModel();
                        testModel12.elemType = testModel11.elemType;
                        testModel12.elemId = testModel11.elemId;
                        testModel12.modelType = 13;
                        repeatRegexGen.e().add(testModel12);
                    }
                    return repeatRegexGen.e();
                }
                int size9 = arrayList20.size();
                Random random2 = new Random();
                ArrayList arrayList22 = new ArrayList();
                for (int i45 = 0; i45 < size9; i45++) {
                    arrayList22.add(Integer.valueOf(i45));
                }
                int[] iArr2 = new int[size9];
                int i46 = 0;
                while (arrayList22.size() > 0) {
                    int iAbs4 = Math.abs(random2.nextInt()) % arrayList22.size();
                    Object obj10 = arrayList22.get(iAbs4);
                    m.e(obj10, str22);
                    iArr2[i46] = ((Number) obj10).intValue();
                    arrayList22.remove(iAbs4);
                    i46++;
                }
                int i47 = i44;
                for (int i48 = 0; i48 < size9; i48++) {
                    int i49 = iArr2[i48];
                    List listE3 = repeatRegexGen.e();
                    Object obj11 = arrayList20.get(i49);
                    m.e(obj11, str22);
                    TestModel testModel13 = (TestModel) listE3.get(((Number) obj11).intValue());
                    if (!arrayList21.contains(Long.valueOf(testModel13.elemId))) {
                        TestModel testModel14 = new TestModel();
                        testModel14.elemType = testModel13.elemType;
                        testModel14.elemId = testModel13.elemId;
                        testModel14.modelType = 13;
                        repeatRegexGen.e().add(testModel14);
                        arrayList20.add(Integer.valueOf(repeatRegexGen.e().size() - 1));
                        arrayList21.add(Long.valueOf(testModel13.elemId));
                        i47++;
                    }
                    if (i47 >= 2) {
                        break;
                    }
                }
            }
        }
        if (xt.b.f56282d && !repeatRegexGen.e().isEmpty()) {
            List listSubList = repeatRegexGen.e().subList(0, i11);
            m.f(listSubList, "<set-?>");
            repeatRegexGen.f48710b = listSubList;
        }
        return repeatRegexGen.e();
    }
}
