package com.google.android.material.search;

import android.view.View;
import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView f15164b;

    public /* synthetic */ c(SearchView searchView, int i11) {
        this.f15163a = i11;
        this.f15164b = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i11 = this.f15163a;
        SearchView searchView = this.f15164b;
        switch (i11) {
            case 0:
                searchView.M.setText(BuildConfig.VERSION_NAME);
                searchView.l();
                break;
            case 1:
                int i12 = SearchView.f15117j0;
                searchView.n();
                break;
            default:
                int i13 = SearchView.f15117j0;
                searchView.i();
                break;
        }
    }
}
