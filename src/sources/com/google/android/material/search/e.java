package com.google.android.material.search;

import android.view.View;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ViewUtils;
import z4.u;
import z4.v1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements ViewUtils.OnApplyWindowInsetsListener, u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f15167a;

    public /* synthetic */ e(SearchView searchView) {
        this.f15167a = searchView;
    }

    @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
    public v1 a(View view, v1 v1Var, ViewUtils.RelativePadding relativePadding) {
        MaterialToolbar materialToolbar = this.f15167a.f15133t;
        boolean zG = ViewUtils.g(materialToolbar);
        int i11 = zG ? relativePadding.f14751c : relativePadding.f14749a;
        int i12 = zG ? relativePadding.f14749a : relativePadding.f14751c;
        r4.d dVarG = v1Var.f58905a.g(647);
        materialToolbar.setPadding(i11 + dVarG.f48793a, relativePadding.f14750b, i12 + dVarG.f48795c, relativePadding.f14752d);
        return v1Var;
    }

    @Override // z4.u
    public v1 e(View view, v1 v1Var) {
        SearchView.g(this.f15167a, v1Var);
        return v1Var;
    }
}
