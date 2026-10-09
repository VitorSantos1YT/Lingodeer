package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import com.lingodeer.R;
import l.c0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class BottomSheetDialogFragment extends c0 {
    @Override // l.c0, androidx.fragment.app.y
    public final Dialog r(Bundle bundle) {
        Context context = getContext();
        int i11 = this.f1874f;
        if (i11 == 0) {
            TypedValue typedValue = new TypedValue();
            i11 = context.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : R.style.Theme_Design_Light_BottomSheetDialog;
        }
        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(context, i11);
        bottomSheetDialog.L = true;
        bottomSheetDialog.M = true;
        bottomSheetDialog.R = new BottomSheetBehavior.BottomSheetCallback() { // from class: com.google.android.material.bottomsheet.BottomSheetDialog.5
            public AnonymousClass5() {
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public final void c(View view, int i12) {
                if (i12 == 5) {
                    BottomSheetDialog.this.cancel();
                }
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public final void b(View view) {
            }
        };
        bottomSheetDialog.c().g(1);
        TypedArray typedArrayObtainStyledAttributes = bottomSheetDialog.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge});
        bottomSheetDialog.P = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return bottomSheetDialog;
    }

    public final void v() {
        Dialog dialog = this.N;
        if (dialog instanceof BottomSheetDialog) {
            BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) dialog;
            if (bottomSheetDialog.f14023f == null) {
                bottomSheetDialog.e();
            }
            boolean z11 = bottomSheetDialog.f14023f.f13986k0;
        }
        q(false, false);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class BottomSheetDismissCallback extends BottomSheetBehavior.BottomSheetCallback {
        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public final void c(View view, int i11) {
            if (i11 == 5) {
                throw null;
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public final void b(View view) {
        }
    }
}
