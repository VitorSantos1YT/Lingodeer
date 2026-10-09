package com.lingo.lingoskill.ui.learn;

import android.os.Bundle;
import ch.b0;
import com.yalantis.ucrop.view.CropImageView;
import h1.i9;
import jp.b1;
import l1.n;
import l1.s;
import l1.x1;
import qy.q;
import t1.e;
import xg.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class DebugTestActivity extends d {
    public static final /* synthetic */ int H = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final q f22051t = com.bumptech.glide.d.v(new b1(this, 0));

    @Override // xg.d
    public final void j(Bundle bundle, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(1872198670);
        int i12 = (sVar.h(this) ? 32 : 16) | i11;
        if (sVar.T(i12 & 1, (i12 & 17) != 16)) {
            i9.a(null, null, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, e.d(-214146007, new b0(this, 19), sVar), sVar, 12582912, 127);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fu.n(this, i11, 21, bundle);
        }
    }
}
