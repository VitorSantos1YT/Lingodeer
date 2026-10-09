package com.lingo.me;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.e1;
import av.p;
import bq.g;
import ch.z;
import com.google.firebase.remoteconfig.a;
import com.lingo.me.MeAccountSettingsActivity;
import cr.b;
import fz.e;
import i.c;
import java.util.ArrayList;
import l1.m;
import l1.n;
import l1.s;
import l1.t;
import l1.x1;
import qy.b0;
import qy.j;
import qy.q;
import xg.d;
import xu.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class MeAccountSettingsActivity extends d {
    public static final /* synthetic */ int R = 0;
    public lc.d H;
    public final Object K;
    public final Object L;
    public final q M;
    public final q N;
    public final c O;
    public final c P;
    public final c Q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public g f22214t;

    public MeAccountSettingsActivity() {
        j jVar = j.SYNCHRONIZED;
        this.K = com.bumptech.glide.d.u(jVar, new cr.d(this, 0));
        this.L = com.bumptech.glide.d.u(j.NONE, new cr.d(this, 2));
        this.M = com.bumptech.glide.d.v(new b(this, 0));
        this.N = com.bumptech.glide.d.v(new b(this, 3));
        final int i11 = 0;
        this.O = registerForActivityResult(new e1(6), new i.b(this) { // from class: cr.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MeAccountSettingsActivity f22431b;

            {
                this.f22431b = this;
            }

            @Override // i.b
            public final void f(Object obj) {
                int i12 = i11;
                MeAccountSettingsActivity meAccountSettingsActivity = this.f22431b;
                switch (i12) {
                    case 0:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        int i13 = MeAccountSettingsActivity.R;
                        if (zBooleanValue) {
                            Uri uri = (Uri) meAccountSettingsActivity.N.getValue();
                            kotlin.jvm.internal.m.e(uri, "<get-uri>(...)");
                            a.a aVarB = s20.e.b(meAccountSettingsActivity);
                            ((ArrayList) aVarB.f9f).add(new s20.d(aVarB, uri));
                            aVarB.f5b = 0;
                            aVarB.f8e = new a5.j(meAccountSettingsActivity, 8);
                            aVarB.E();
                        }
                        break;
                    default:
                        Uri uri2 = (Uri) obj;
                        int i14 = MeAccountSettingsActivity.R;
                        if (uri2 != null) {
                            a.a aVarB2 = s20.e.b(meAccountSettingsActivity);
                            ((ArrayList) aVarB2.f9f).add(new s20.d(aVarB2, uri2));
                            aVarB2.f5b = 0;
                            aVarB2.f8e = new a5.j(meAccountSettingsActivity, 8);
                            aVarB2.E();
                        }
                        break;
                }
            }
        });
        final int i12 = 1;
        this.P = registerForActivityResult(new e1(1), new i.b(this) { // from class: cr.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MeAccountSettingsActivity f22431b;

            {
                this.f22431b = this;
            }

            @Override // i.b
            public final void f(Object obj) {
                int i13 = i12;
                MeAccountSettingsActivity meAccountSettingsActivity = this.f22431b;
                switch (i13) {
                    case 0:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        int i14 = MeAccountSettingsActivity.R;
                        if (zBooleanValue) {
                            Uri uri = (Uri) meAccountSettingsActivity.N.getValue();
                            kotlin.jvm.internal.m.e(uri, "<get-uri>(...)");
                            a.a aVarB = s20.e.b(meAccountSettingsActivity);
                            ((ArrayList) aVarB.f9f).add(new s20.d(aVarB, uri));
                            aVarB.f5b = 0;
                            aVarB.f8e = new a5.j(meAccountSettingsActivity, 8);
                            aVarB.E();
                        }
                        break;
                    default:
                        Uri uri2 = (Uri) obj;
                        int i15 = MeAccountSettingsActivity.R;
                        if (uri2 != null) {
                            a.a aVarB2 = s20.e.b(meAccountSettingsActivity);
                            ((ArrayList) aVarB2.f9f).add(new s20.d(aVarB2, uri2));
                            aVarB2.f5b = 0;
                            aVarB2.f8e = new a5.j(meAccountSettingsActivity, 8);
                            aVarB2.E();
                        }
                        break;
                }
            }
        });
        this.Q = registerForActivityResult(new e1(4), new a(14));
        com.bumptech.glide.d.u(jVar, new cr.d(this, 1));
    }

    @Override // xg.d
    public final void j(Bundle bundle, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(1188759534);
        int i12 = (sVar.h(this) ? 32 : 16) | i11;
        if (sVar.T(i12 & 1, (i12 & 17) != 16)) {
            boolean zH = sVar.h(this);
            Object objQ = sVar.Q();
            l1.g gVar = m.f39353a;
            if (zH || objQ == gVar) {
                objQ = new p(this, null, 12);
                sVar.o0(objQ);
            }
            t.f((e) objQ, b0.f48488a, sVar);
            boolean zH2 = sVar.h(this);
            Object objQ2 = sVar.Q();
            if (zH2 || objQ2 == gVar) {
                objQ2 = new b(this, 4);
                sVar.o0(objQ2);
            }
            fz.a aVar = (fz.a) objQ2;
            boolean zH3 = sVar.h(this);
            Object objQ3 = sVar.Q();
            if (zH3 || objQ3 == gVar) {
                objQ3 = new b(this, 5);
                sVar.o0(objQ3);
            }
            fz.a aVar2 = (fz.a) objQ3;
            boolean zH4 = sVar.h(this);
            Object objQ4 = sVar.Q();
            if (zH4 || objQ4 == gVar) {
                objQ4 = new b(this, 6);
                sVar.o0(objQ4);
            }
            fz.a aVar3 = (fz.a) objQ4;
            boolean zH5 = sVar.h(this);
            Object objQ5 = sVar.Q();
            if (zH5 || objQ5 == gVar) {
                objQ5 = new b(this, 7);
                sVar.o0(objQ5);
            }
            fz.a aVar4 = (fz.a) objQ5;
            boolean zH6 = sVar.h(this);
            Object objQ6 = sVar.Q();
            if (zH6 || objQ6 == gVar) {
                objQ6 = new b(this, 8);
                sVar.o0(objQ6);
            }
            fz.a aVar5 = (fz.a) objQ6;
            boolean zH7 = sVar.h(this);
            Object objQ7 = sVar.Q();
            if (zH7 || objQ7 == gVar) {
                objQ7 = new b(this, 1);
                sVar.o0(objQ7);
            }
            fz.a aVar6 = (fz.a) objQ7;
            boolean zH8 = sVar.h(this);
            Object objQ8 = sVar.Q();
            if (zH8 || objQ8 == gVar) {
                objQ8 = new b(this, 2);
                sVar.o0(objQ8);
            }
            r.e(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, (fz.a) objQ8, p(), sVar, 16777216);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new z(this, i11, 6, bundle);
        }
    }

    @Override // l.m, androidx.fragment.app.p0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        lc.d dVar = this.H;
        if (dVar != null) {
            dVar.dismiss();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qy.h] */
    public final zu.q p() {
        return (zu.q) this.L.getValue();
    }
}
