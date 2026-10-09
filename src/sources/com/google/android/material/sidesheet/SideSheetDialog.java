package com.google.android.material.sidesheet;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import l4.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class SideSheetDialog extends SheetDialog<SideSheetCallback> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.material.sidesheet.SideSheetDialog$1] */
    @Override // com.google.android.material.sidesheet.SheetDialog
    public final void e(Sheet sheet) {
        sheet.b(new SideSheetCallback() { // from class: com.google.android.material.sidesheet.SideSheetDialog.1
            @Override // com.google.android.material.sidesheet.SheetCallback
            public final void a(int i11) {
                if (i11 == 5) {
                    SideSheetDialog.this.cancel();
                }
            }
        });
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public final Sheet g() {
        Sheet sheetG = super.g();
        if (sheetG instanceof SideSheetBehavior) {
            return (SideSheetBehavior) sheetG;
        }
        throw new IllegalStateException("The view is not associated with SideSheetBehavior");
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public final SideSheetBehavior h(FrameLayout frameLayout) {
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (!(layoutParams instanceof e)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        l4.b bVar = ((e) layoutParams).f39716a;
        if (bVar instanceof SideSheetBehavior) {
            return (SideSheetBehavior) bVar;
        }
        throw new IllegalArgumentException("The view is not associated with SideSheetBehavior");
    }
}
