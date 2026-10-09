package com.lingo.lingoskill.japanskill.ui.syllable;

import android.os.Bundle;
import androidx.viewpager.widget.ViewPager;
import b2.c;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import ff.h;
import hh.o;
import hj.y;
import ji.b;
import km.k;
import lm.a;
import ve.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class JPSyllableIntroIndexActivity extends b {
    public static final /* synthetic */ int P = 0;

    public JPSyllableIntroIndexActivity() {
        super(BuildConfig.VERSION_NAME, k.f38220a);
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
        i.I(R.string.introduction, this);
        ViewPager viewPager = ((y) j()).f33605b;
        viewPager.postDelayed(new c(4, viewPager, new o(this, 22)), 0L);
        ((y) j()).f33605b.setAdapter(new a());
        ((y) j()).f33605b.w(new vm.a(((y) j()).f33605b, h.l(8.0f)));
    }
}
