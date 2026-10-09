package com.lingo.fluent.ui.game;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwnerKt;
import com.lingodeer.R;
import hj.e1;
import java.util.List;
import ji.b;
import ns.o;
import qh.t;
import qh.v;
import rz.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class WordGameIndexActivity extends b {
    public static final /* synthetic */ int Q = 0;
    public final List P;

    public WordGameIndexActivity() {
        super("LanguageGamesIndex", t.f47783a);
        this.P = o.L(Integer.valueOf(R.drawable.bg_game_index_choose), Integer.valueOf(R.drawable.bg_game_index_liisten), Integer.valueOf(R.drawable.bg_game_index_spell));
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
        ((e1) j()).f32510b.setVisibility(4);
        e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new v(this, null, 3), 3);
    }
}
