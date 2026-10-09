package com.lingo.lingoskill.ui.learn;

import android.os.Bundle;
import android.widget.EditText;
import bq.z;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fr.o0;
import gr.s;
import hj.n;
import ji.b;
import jp.d1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class DebugTestIndexActivity extends b {
    public static final /* synthetic */ int P = 0;

    public DebugTestIndexActivity() {
        super(BuildConfig.VERSION_NAME, d1.f36463a);
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
        z.b(((n) j()).f32947e, new s(this, 18));
        EditText editText = ((n) j()).f32946d;
        String str = ((o0) l()).f27733a.checkAnswerPrompt;
        if (str == null) {
            str = BuildConfig.VERSION_NAME;
        }
        editText.setText(str);
        ((n) j()).f32944b.setOnClickListener(new aj.b(this, 12));
    }
}
