package com.lingo.lingoskill.ui.base;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.Toast;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LifecycleOwnerKt;
import at.h;
import av.p;
import b0.a1;
import bj.a;
import bp.d2;
import bp.d5;
import bp.e5;
import bp.x1;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fz.c;
import fz.e;
import kotlin.NoWhenBranchMatchedException;
import l1.b1;
import l1.g;
import l1.k1;
import l1.m;
import l1.n;
import l1.s;
import l1.t;
import qy.b0;
import qy.j;
import qy.q;
import rz.e0;
import uz.i1;
import wu.g0;
import wu.k0;
import wu.m0;
import xg.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class SignUpActivity extends d {
    public static final /* synthetic */ int L = 0;
    public final Object K;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final k1 f22046t = t.B(Boolean.FALSE);
    public final q H = com.bumptech.glide.d.v(new d5(this, 0));

    public SignUpActivity() {
        com.bumptech.glide.d.v(new d5(this, 1));
        this.K = com.bumptech.glide.d.u(j.NONE, new a(this, 4));
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, qy.h] */
    @Override // xg.d
    public final void j(Bundle bundle, n nVar, int i11) {
        s sVar;
        b1 b1Var;
        s sVar2 = (s) nVar;
        sVar2.f0(-718265593);
        int i12 = (sVar2.h(this) ? 32 : 16) | i11;
        if (sVar2.T(i12 & 1, (i12 & 17) != 16)) {
            boolean zH = sVar2.h(this);
            Object objQ = sVar2.Q();
            g gVar = m.f39353a;
            vy.d dVar = null;
            if (zH || objQ == gVar) {
                objQ = new p(this, dVar, 8);
                sVar2.o0(objQ);
            }
            t.f((e) objQ, b0.f48488a, sVar2);
            ?? r9 = this.K;
            b1 b1VarO = t.o(((k0) r9.getValue()).f55415e, sVar2);
            Object value = b1VarO.getValue();
            boolean z11 = value instanceof g0;
            k1 k1Var = this.f22046t;
            if (z11) {
                e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new a1(this, dVar, 9), 3);
            } else if (value instanceof wu.e0) {
                k1Var.setValue(Boolean.FALSE);
                i1 i1Var = ((k0) r9.getValue()).f55414d;
                i1Var.getClass();
                i1Var.l(null, m0.f55422a);
                Object value2 = b1VarO.getValue();
                kotlin.jvm.internal.m.d(value2, "null cannot be cast to non-null type com.lingodeer.login.viewmodels.SignupResultUiState.Failed");
                int i13 = e5.f4557a[((wu.e0) value2).f55386a.ordinal()];
                if (i13 == 1) {
                    Toast.makeText(this, getString(R.string.login_status_email_already_used_title), 0).show();
                } else {
                    if (i13 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Toast.makeText(this, getString(R.string.error), 0).show();
                }
            }
            Object objQ2 = sVar2.Q();
            if (objQ2 == gVar) {
                objQ2 = t.B(BuildConfig.VERSION_NAME);
                sVar2.o0(objQ2);
            }
            b1 b1Var2 = (b1) objQ2;
            Object objQ3 = sVar2.Q();
            if (objQ3 == gVar) {
                objQ3 = t.B(BuildConfig.VERSION_NAME);
                sVar2.o0(objQ3);
            }
            b1 b1Var3 = (b1) objQ3;
            Object objQ4 = sVar2.Q();
            if (objQ4 == gVar) {
                objQ4 = t.B(Boolean.FALSE);
                sVar2.o0(objQ4);
            }
            b1 b1Var4 = (b1) objQ4;
            Object objQ5 = sVar2.Q();
            if (objQ5 == gVar) {
                objQ5 = t.B(Boolean.FALSE);
                sVar2.o0(objQ5);
            }
            b1 b1Var5 = (b1) objQ5;
            Object objQ6 = sVar2.Q();
            if (objQ6 == gVar) {
                objQ6 = t.B(Boolean.FALSE);
                sVar2.o0(objQ6);
            }
            b1 b1Var6 = (b1) objQ6;
            Resources resources = ((Context) sVar2.j(AndroidCompositionLocals_androidKt.f1200b)).getResources();
            if (((Boolean) k1Var.getValue()).booleanValue()) {
                sVar2.d0(-321239580);
                kotlin.jvm.internal.m.c(resources);
                uu.a.d(resources, sVar2, 0);
            } else {
                sVar2.d0(-324884901);
            }
            sVar2.p(false);
            String str = (String) b1Var2.getValue();
            boolean zBooleanValue = ((Boolean) b1Var4.getValue()).booleanValue();
            String str2 = (String) b1Var3.getValue();
            boolean zBooleanValue2 = ((Boolean) b1Var5.getValue()).booleanValue();
            boolean zBooleanValue3 = ((Boolean) b1Var6.getValue()).booleanValue();
            kotlin.jvm.internal.m.c(resources);
            Object objQ7 = sVar2.Q();
            if (objQ7 == gVar) {
                d2 d2Var = new d2(2, b1Var2, b1Var4, b1Var3, b1Var6);
                sVar2.o0(d2Var);
                objQ7 = d2Var;
            }
            c cVar = (c) objQ7;
            Object objQ8 = sVar2.Q();
            if (objQ8 == gVar) {
                b1Var = b1Var5;
                d2 d2Var2 = new d2(3, b1Var3, b1Var, b1Var2, b1Var6);
                b1Var3 = b1Var3;
                b1Var2 = b1Var2;
                sVar2.o0(d2Var2);
                objQ8 = d2Var2;
            } else {
                b1Var = b1Var5;
            }
            c cVar2 = (c) objQ8;
            boolean zH2 = sVar2.h(this);
            Object objQ9 = sVar2.Q();
            if (zH2 || objQ9 == gVar) {
                x1 x1Var = new x1(this, b1Var2, b1Var3, b1Var4, b1Var, 1);
                sVar2.o0(x1Var);
                objQ9 = x1Var;
            }
            fz.a aVar = (fz.a) objQ9;
            boolean zH3 = sVar2.h(this);
            Object objQ10 = sVar2.Q();
            if (zH3 || objQ10 == gVar) {
                objQ10 = new d5(this, 2);
                sVar2.o0(objQ10);
            }
            fz.a aVar2 = (fz.a) objQ10;
            boolean zH4 = sVar2.h(this);
            Object objQ11 = sVar2.Q();
            if (zH4 || objQ11 == gVar) {
                objQ11 = new d5(this, 3);
                sVar2.o0(objQ11);
            }
            fz.a aVar3 = (fz.a) objQ11;
            boolean zH5 = sVar2.h(this);
            Object objQ12 = sVar2.Q();
            if (zH5 || objQ12 == gVar) {
                objQ12 = new d5(this, 4);
                sVar2.o0(objQ12);
            }
            sVar = sVar2;
            uu.a.c(str, str2, zBooleanValue, zBooleanValue2, zBooleanValue3, resources, cVar, cVar2, aVar, aVar2, aVar3, (fz.a) objQ12, sVar, 14155776);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new h(this, i11, 11, bundle);
        }
    }
}
