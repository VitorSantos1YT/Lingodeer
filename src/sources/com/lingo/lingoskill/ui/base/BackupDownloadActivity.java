package com.lingo.lingoskill.ui.base;

import a00.c;
import a9.i;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwnerKt;
import at.h;
import com.lingo.lingoskill.ui.base.BackupDownloadActivity;
import com.lingo.lingoskill.ui.base.LoginActivity;
import com.lingo.lingoskill.ui.base.OfflineIndexActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import l1.g;
import l1.m;
import l1.n;
import l1.s;
import l1.x1;
import qy.j;
import s10.a;
import se.k;
import xg.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class BackupDownloadActivity extends d implements a {
    public static final /* synthetic */ int K = 0;
    public final Object H = com.bumptech.glide.d.u(j.SYNCHRONIZED, new bp.d());

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public lc.d f22039t;

    @Override // s10.a
    public final i e() {
        return k.o();
    }

    @Override // xg.d
    public final void j(Bundle bundle, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(-1449550393);
        int i12 = (sVar.h(this) ? 32 : 16) | i11;
        if (sVar.T(i12 & 1, (i12 & 17) != 16)) {
            boolean zH = sVar.h(this);
            Object objQ = sVar.Q();
            g gVar = m.f39353a;
            if (zH || objQ == gVar) {
                final int i13 = 0;
                objQ = new fz.a(this) { // from class: bp.c

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ BackupDownloadActivity f4508b;

                    {
                        this.f4508b = this;
                    }

                    @Override // fz.a
                    public final Object invoke() {
                        int i14 = i13;
                        qy.b0 b0Var = qy.b0.f48488a;
                        BackupDownloadActivity backupDownloadActivity = this.f4508b;
                        switch (i14) {
                            case 0:
                                int i15 = BackupDownloadActivity.K;
                                backupDownloadActivity.finish();
                                break;
                            case 1:
                                int i16 = BackupDownloadActivity.K;
                                if (!((fr.o0) backupDownloadActivity.l()).f27733a.isUnloginUser()) {
                                    lc.d dVar = backupDownloadActivity.f22039t;
                                    if (dVar == null || !dVar.isShowing()) {
                                        lc.d dVar2 = backupDownloadActivity.f22039t;
                                        if (dVar2 == null) {
                                            lc.d dVar3 = new lc.d(backupDownloadActivity);
                                            lc.d.g(dVar3, Integer.valueOf(R.string.progress_sync), null, 2);
                                            hz.b.t(dVar3, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                                            dVar3.a();
                                            dVar3.show();
                                            backupDownloadActivity.f22039t = dVar3;
                                        } else {
                                            dVar2.show();
                                        }
                                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(backupDownloadActivity), null, null, new b0.a1(backupDownloadActivity, null, 1), 3);
                                    }
                                } else {
                                    Intent intent = new Intent(backupDownloadActivity, (Class<?>) LoginActivity.class);
                                    intent.putExtra(INTENTS.EXTRA_INT, 9);
                                    backupDownloadActivity.startActivity(intent);
                                }
                                break;
                            default:
                                int i17 = BackupDownloadActivity.K;
                                backupDownloadActivity.startActivity(new Intent(backupDownloadActivity, (Class<?>) OfflineIndexActivity.class));
                                b7.e0.A(backupDownloadActivity.m(), "jxz_me_click_offline_learning");
                                break;
                        }
                        return b0Var;
                    }
                };
                sVar.o0(objQ);
            }
            fz.a aVar = (fz.a) objQ;
            boolean zH2 = sVar.h(this);
            Object objQ2 = sVar.Q();
            if (zH2 || objQ2 == gVar) {
                final int i14 = 1;
                objQ2 = new fz.a(this) { // from class: bp.c

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ BackupDownloadActivity f4508b;

                    {
                        this.f4508b = this;
                    }

                    @Override // fz.a
                    public final Object invoke() {
                        int i15 = i14;
                        qy.b0 b0Var = qy.b0.f48488a;
                        BackupDownloadActivity backupDownloadActivity = this.f4508b;
                        switch (i15) {
                            case 0:
                                int i16 = BackupDownloadActivity.K;
                                backupDownloadActivity.finish();
                                break;
                            case 1:
                                int i17 = BackupDownloadActivity.K;
                                if (!((fr.o0) backupDownloadActivity.l()).f27733a.isUnloginUser()) {
                                    lc.d dVar = backupDownloadActivity.f22039t;
                                    if (dVar == null || !dVar.isShowing()) {
                                        lc.d dVar2 = backupDownloadActivity.f22039t;
                                        if (dVar2 == null) {
                                            lc.d dVar3 = new lc.d(backupDownloadActivity);
                                            lc.d.g(dVar3, Integer.valueOf(R.string.progress_sync), null, 2);
                                            hz.b.t(dVar3, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                                            dVar3.a();
                                            dVar3.show();
                                            backupDownloadActivity.f22039t = dVar3;
                                        } else {
                                            dVar2.show();
                                        }
                                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(backupDownloadActivity), null, null, new b0.a1(backupDownloadActivity, null, 1), 3);
                                    }
                                } else {
                                    Intent intent = new Intent(backupDownloadActivity, (Class<?>) LoginActivity.class);
                                    intent.putExtra(INTENTS.EXTRA_INT, 9);
                                    backupDownloadActivity.startActivity(intent);
                                }
                                break;
                            default:
                                int i18 = BackupDownloadActivity.K;
                                backupDownloadActivity.startActivity(new Intent(backupDownloadActivity, (Class<?>) OfflineIndexActivity.class));
                                b7.e0.A(backupDownloadActivity.m(), "jxz_me_click_offline_learning");
                                break;
                        }
                        return b0Var;
                    }
                };
                sVar.o0(objQ2);
            }
            fz.a aVar2 = (fz.a) objQ2;
            boolean zH3 = sVar.h(this);
            Object objQ3 = sVar.Q();
            if (zH3 || objQ3 == gVar) {
                final int i15 = 2;
                objQ3 = new fz.a(this) { // from class: bp.c

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ BackupDownloadActivity f4508b;

                    {
                        this.f4508b = this;
                    }

                    @Override // fz.a
                    public final Object invoke() {
                        int i16 = i15;
                        qy.b0 b0Var = qy.b0.f48488a;
                        BackupDownloadActivity backupDownloadActivity = this.f4508b;
                        switch (i16) {
                            case 0:
                                int i17 = BackupDownloadActivity.K;
                                backupDownloadActivity.finish();
                                break;
                            case 1:
                                int i18 = BackupDownloadActivity.K;
                                if (!((fr.o0) backupDownloadActivity.l()).f27733a.isUnloginUser()) {
                                    lc.d dVar = backupDownloadActivity.f22039t;
                                    if (dVar == null || !dVar.isShowing()) {
                                        lc.d dVar2 = backupDownloadActivity.f22039t;
                                        if (dVar2 == null) {
                                            lc.d dVar3 = new lc.d(backupDownloadActivity);
                                            lc.d.g(dVar3, Integer.valueOf(R.string.progress_sync), null, 2);
                                            hz.b.t(dVar3, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                                            dVar3.a();
                                            dVar3.show();
                                            backupDownloadActivity.f22039t = dVar3;
                                        } else {
                                            dVar2.show();
                                        }
                                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(backupDownloadActivity), null, null, new b0.a1(backupDownloadActivity, null, 1), 3);
                                    }
                                } else {
                                    Intent intent = new Intent(backupDownloadActivity, (Class<?>) LoginActivity.class);
                                    intent.putExtra(INTENTS.EXTRA_INT, 9);
                                    backupDownloadActivity.startActivity(intent);
                                }
                                break;
                            default:
                                int i19 = BackupDownloadActivity.K;
                                backupDownloadActivity.startActivity(new Intent(backupDownloadActivity, (Class<?>) OfflineIndexActivity.class));
                                b7.e0.A(backupDownloadActivity.m(), "jxz_me_click_offline_learning");
                                break;
                        }
                        return b0Var;
                    }
                };
                sVar.o0(objQ3);
            }
            fz.a aVar3 = (fz.a) objQ3;
            boolean zH4 = sVar.h(this);
            Object objQ4 = sVar.Q();
            if (zH4 || objQ4 == gVar) {
                objQ4 = new c(this, 5);
                sVar.o0(objQ4);
            }
            xu.s.a(aVar, aVar2, aVar3, (fz.c) objQ4, null, sVar, 0);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new h(this, i11, 3, bundle);
        }
    }

    @Override // l.m, androidx.fragment.app.p0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        lc.d dVar = this.f22039t;
        if (dVar != null) {
            dVar.dismiss();
        }
    }
}
