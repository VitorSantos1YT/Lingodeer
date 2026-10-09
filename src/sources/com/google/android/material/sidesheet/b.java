package com.google.android.material.sidesheet;

import a5.s;
import android.view.View;
import b7.k;
import f7.y0;
import y6.h0;
import y6.o0;
import y6.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements s, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15371c;

    public /* synthetic */ b(Object obj, int i11, int i12) {
        this.f15369a = i12;
        this.f15371c = obj;
        this.f15370b = i11;
    }

    @Override // b7.k
    public void invoke(Object obj) {
        switch (this.f15369a) {
            case 1:
                o0 o0Var = ((y0) this.f15371c).f26953a;
                ((h0) obj).q(this.f15370b);
                break;
            default:
                ((h0) obj).p((x) this.f15371c, this.f15370b);
                break;
        }
    }

    @Override // a5.s
    public boolean perform(View view, a5.k kVar) {
        ((SideSheetBehavior) this.f15371c).e(this.f15370b);
        return true;
    }
}
