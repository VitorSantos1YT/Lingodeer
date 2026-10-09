package com.google.android.material.datepicker;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.google.android.material.internal.ViewUtils;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14437b;

    public /* synthetic */ c(Object obj, int i11) {
        this.f14436a = i11;
        this.f14437b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z11) {
        switch (this.f14436a) {
            case 0:
                for (EditText editText : (EditText[]) this.f14437b) {
                    if (editText.hasFocus()) {
                    }
                    break;
                }
                ViewUtils.f(view, false);
                break;
            default:
                ImageView imageView = (ImageView) this.f14437b;
                if (!z11) {
                    imageView.setVisibility(8);
                }
                break;
        }
    }
}
